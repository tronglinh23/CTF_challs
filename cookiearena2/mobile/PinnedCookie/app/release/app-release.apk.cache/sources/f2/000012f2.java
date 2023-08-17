package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p0 {
    @d.q0
    public static String a(@d.q0 String str, @d.o0 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(split, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @d.q0
    public static String b(@d.q0 String[] strArr, @d.o0 String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), split)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@d.q0 String str, @d.o0 String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split("/"), str2.split("/"));
    }

    @d.o0
    public static String[] d(@d.q0 String[] strArr, @d.o0 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean e(@d.o0 String[] strArr, @d.o0 String[] strArr2) {
        if (strArr2.length == 2) {
            if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
                throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
            }
            if (strArr.length != 2) {
                return false;
            }
            if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
                return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
            }
            return false;
        }
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }
}