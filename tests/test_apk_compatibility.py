import os
import subprocess
import unittest
import xml.etree.ElementTree as ET

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
DECOMPILED_DIR = os.path.join(REPO_ROOT, "larva-heroes-decompiled")
MANIFEST_PATH = os.path.join(DECOMPILED_DIR, "AndroidManifest.xml")
RENDERER_SMALI = os.path.join(
    DECOMPILED_DIR, "smali_classes2", "com", "mrgames", "larvaheroesfree", "gptouchplus", "GpTouchRenderer.smali"
)
NATIVES_SMALI = os.path.join(
    DECOMPILED_DIR, "smali_classes2", "com", "mrgames", "larvaheroesfree", "Natives.smali"
)
FCM_SMALI = os.path.join(
    DECOMPILED_DIR, "smali_classes2", "com", "mrgames", "larvaheroesfree", "cloudMessage", "MyFirebaseMessagingService.smali"
)
OUTPUT_APK = os.path.join(REPO_ROOT, "larva-heroes-lavengers-android13.apk")
APKSIGNER_BAT = r"C:\Users\Colorful\AppData\Local\Android\Sdk\build-tools\36.1.0\apksigner.bat"

ANDROID_NS = "{http://schemas.android.com/apk/res/android}"


class TestApkCompatibility(unittest.TestCase):
    def test_manifest_main_activity_exported_and_cleartext(self):
        tree = ET.parse(MANIFEST_PATH)
        root = tree.getroot()
        app = root.find("application")
        self.assertIsNotNone(app)
        self.assertEqual(app.get(f"{ANDROID_NS}usesCleartextTraffic"), "true")

        main_activity = None
        for act in app.findall("activity"):
            if act.get(f"{ANDROID_NS}name") == "com.mrgames.larvaheroesfree.Natives":
                main_activity = act
                break
        self.assertIsNotNone(main_activity)
        self.assertEqual(main_activity.get(f"{ANDROID_NS}exported"), "true")

    def test_pending_intent_immutable_in_fcm(self):
        with open(FCM_SMALI, "r", encoding="utf-8") as f:
            content = f.read()
        self.assertIn("0x44000000", content)
        self.assertNotIn("0x40000000", content)

    def test_renderer_lifecycle_guard(self):
        with open(RENDERER_SMALI, "r", encoding="utf-8") as f:
            content = f.read()
        self.assertIn(".field public static sNativeInitDone:Z", content)
        self.assertGreaterEqual(content.count("sNativeInitDone:Z"), 7)

    def test_natives_scoped_storage_and_permissions(self):
        with open(NATIVES_SMALI, "r", encoding="utf-8") as f:
            content = f.read()
        self.assertNotIn("getExternalStorageDirectory", content)
        self.assertIn("getExternalFilesDir", content)
        self.assertNotIn("requestPermissions", content)
        self.assertGreaterEqual(content.count("sNativeInitDone:Z"), 3)

    def test_signed_apk_exists_and_verifies(self):
        self.assertTrue(os.path.exists(OUTPUT_APK), f"Missing {OUTPUT_APK}")
        res = subprocess.run([APKSIGNER_BAT, "verify", OUTPUT_APK], capture_output=True, text=True)
        self.assertEqual(res.returncode, 0, res.stderr + res.stdout)


if __name__ == "__main__":
    unittest.main()
