package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalr {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzalp zzalpVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzalpVar, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzamq.zza(new zzajc(((String) obj).getBytes(zzakq.zzb))));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzajf) {
            sb.append(": \"");
            sb.append(zzamq.zza((zzajf) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzakk) {
            sb.append(" {");
            zzd((zzakk) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0203  */
    private static void zzd(zzalp zzalpVar, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzalpVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzakk.zzD(method2, zzalpVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzakk.zzD(method, zzalpVar, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(strSubstring))) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(String.valueOf(strSubstring)));
                if (method4 != null) {
                    Object objZzD = zzakk.zzD(method4, zzalpVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzD instanceof Boolean) {
                            if (((Boolean) objZzD).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzD);
                            }
                        } else if (objZzD instanceof Integer) {
                            if (((Integer) objZzD).intValue() != 0) {
                                zzb(sb, i, strSubstring, objZzD);
                            }
                        } else if (objZzD instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzD).floatValue()) != 0) {
                                zzb(sb, i, strSubstring, objZzD);
                            }
                        } else if (!(objZzD instanceof Double)) {
                            if (objZzD instanceof String) {
                                zEquals = objZzD.equals("");
                            } else if (objZzD instanceof zzajf) {
                                zEquals = objZzD.equals(zzajf.zzb);
                            } else if (objZzD instanceof zzalp) {
                                if (objZzD != ((zzalp) objZzD).zzM()) {
                                    zzb(sb, i, strSubstring, objZzD);
                                }
                            } else if (!(objZzD instanceof Enum) || ((Enum) objZzD).ordinal() != 0) {
                                zzb(sb, i, strSubstring, objZzD);
                            }
                            if (!zEquals) {
                                zzb(sb, i, strSubstring, objZzD);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzD).doubleValue()) != 0) {
                            zzb(sb, i, strSubstring, objZzD);
                        }
                    } else if (((Boolean) zzakk.zzD(method5, zzalpVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, strSubstring, objZzD);
                    }
                }
            }
            i2 = 3;
        }
        if (zzalpVar instanceof zzakh) {
            zzakc zzakcVar = ((zzakh) zzalpVar).zzb;
            throw null;
        }
        zzamw zzamwVar = ((zzakk) zzalpVar).zzc;
        if (zzamwVar != null) {
            zzamwVar.zzi(sb, i);
        }
    }
}
