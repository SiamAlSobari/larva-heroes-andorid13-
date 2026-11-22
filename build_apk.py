import os
import shutil
import subprocess

REPO_ROOT = os.path.dirname(os.path.abspath(__file__))
DECOMPILED_DIR = os.path.join(REPO_ROOT, "larva-heroes-decompiled")
TOOLS_DIR = os.path.join(REPO_ROOT, "tools")
APKTOOL_JAR = os.path.join(TOOLS_DIR, "apktool.jar")
FALLBACK_APKTOOL_JAR = r"C:\Koding\rea\pocket\tools\apktool.jar"

JAVA_EXE = r"C:\Program Files\Android\Android Studio\jbr\bin\java.exe"
KEYTOOL_EXE = r"C:\Program Files\Android\Android Studio\jbr\bin\keytool.exe"
SDK_BUILD_TOOLS = r"C:\Users\Colorful\AppData\Local\Android\Sdk\build-tools\36.1.0"
ZIPALIGN_EXE = os.path.join(SDK_BUILD_TOOLS, "zipalign.exe")
APKSIGNER_BAT = os.path.join(SDK_BUILD_TOOLS, "apksigner.bat")

UNSIGNED_APK = os.path.join(TOOLS_DIR, "unsigned.apk")
ALIGNED_APK = os.path.join(TOOLS_DIR, "aligned.apk")
KEYSTORE_PATH = os.path.join(TOOLS_DIR, "release.keystore")
OUTPUT_APK = os.path.join(REPO_ROOT, "larva-heroes-lavengers-android13.apk")


def ensure_tools():
    os.makedirs(TOOLS_DIR, exist_ok=True)
    if not os.path.exists(APKTOOL_JAR):
        if os.path.exists(FALLBACK_APKTOOL_JAR):
            shutil.copy2(FALLBACK_APKTOOL_JAR, APKTOOL_JAR)
        else:
            raise FileNotFoundError(f"apktool.jar not found at {APKTOOL_JAR}")

    if not os.path.exists(KEYSTORE_PATH):
        print("Generating signing keystore...")
        subprocess.run(
            [
                KEYTOOL_EXE,
                "-genkeypair",
                "-v",
                "-keystore",
                KEYSTORE_PATH,
                "-alias",
                "larvaheroes",
                "-keyalg",
                "RSA",
                "-keysize",
                "2048",
                "-validity",
                "10000",
                "-storepass",
                "android123",
                "-keypass",
                "android123",
                "-dname",
                "CN=LarvaHeroesPort, OU=Android13Compat, O=Community, L=ID, S=ID, C=ID",
            ],
            check=True,
        )


def build_apk():
    ensure_tools()
    for p in (UNSIGNED_APK, ALIGNED_APK, OUTPUT_APK):
        if os.path.exists(p):
            os.remove(p)

    print("1/4 Building unsigned APK with apktool...")
    subprocess.run(
        [JAVA_EXE, "-jar", APKTOOL_JAR, "b", DECOMPILED_DIR, "-o", UNSIGNED_APK],
        check=True,
    )

    print("2/4 Aligning APK with zipalign...")
    subprocess.run(
        [ZIPALIGN_EXE, "-p", "-f", "4", UNSIGNED_APK, ALIGNED_APK],
        check=True,
    )

    print("3/4 Signing APK with apksigner (v1+v2+v3)...")
    subprocess.run(
        [
            APKSIGNER_BAT,
            "sign",
            "--ks",
            KEYSTORE_PATH,
            "--ks-pass",
            "pass:android123",
            "--key-pass",
            "pass:android123",
            "--ks-key-alias",
            "larvaheroes",
            "--v1-signing-enabled",
            "true",
            "--v2-signing-enabled",
            "true",
            "--v3-signing-enabled",
            "true",
            "--out",
            OUTPUT_APK,
            ALIGNED_APK,
        ],
        check=True,
    )

    print("4/4 Verifying APK signature...")
    subprocess.run([APKSIGNER_BAT, "verify", "--verbose", OUTPUT_APK], check=True)
    print(f"Done! Signed APK: {OUTPUT_APK}")


if __name__ == "__main__":
    build_apk()
