package com.unity3d.services.core.log;

/* JADX INFO: compiled from: DeviceLogEntry.java */
/* JADX INFO: loaded from: classes2.dex */
class b {
    private c a;
    private String b;
    private StackTraceElement c;

    public b(c cVar, String str, StackTraceElement stackTraceElement) {
        this.a = cVar;
        this.b = str;
        this.c = stackTraceElement;
    }

    public c a() {
        return this.a;
    }

    public String b() {
        String className;
        String methodName;
        int lineNumber;
        String str = this.b;
        StackTraceElement stackTraceElement = this.c;
        if (stackTraceElement != null) {
            className = stackTraceElement.getClassName();
            methodName = this.c.getMethodName();
            lineNumber = this.c.getLineNumber();
        } else {
            className = "UnknownClass";
            methodName = "unknownMethod";
            lineNumber = -1;
        }
        if (str != null && !str.isEmpty()) {
            str = " :: " + str;
        }
        if (str == null) {
            str = "";
        }
        return className + "." + methodName + "()" + (" (line:" + lineNumber + ")") + str;
    }
}
