package n4;

import i5.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u4.l0;
import u4.r1;
@r1({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
/* loaded from: classes.dex */
public class n {
    @n6.d
    public static final File a(@n6.d File file) {
        l0.p(file, "<this>");
        return new File(c(file));
    }

    public static final int b(String str) {
        int r32;
        int r33 = c0.r3(str, File.separatorChar, 0, false, 4, null);
        if (r33 != 0) {
            if (r33 <= 0 || str.charAt(r33 - 1) != ':') {
                if (r33 == -1 && c0.b3(str, ':', false, 2, null)) {
                    return str.length();
                }
                return 0;
            }
            return r33 + 1;
        }
        if (str.length() > 1) {
            char charAt = str.charAt(1);
            char c7 = File.separatorChar;
            if (charAt == c7 && (r32 = c0.r3(str, c7, 2, false, 4, null)) >= 0) {
                int r34 = c0.r3(str, File.separatorChar, r32 + 1, false, 4, null);
                return r34 >= 0 ? r34 + 1 : str.length();
            }
        }
        return 1;
    }

    @n6.d
    public static final String c(@n6.d File file) {
        l0.p(file, "<this>");
        String path = file.getPath();
        l0.o(path, "path");
        String path2 = file.getPath();
        l0.o(path2, "path");
        String substring = path.substring(0, b(path2));
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean d(@n6.d File file) {
        l0.p(file, "<this>");
        String path = file.getPath();
        l0.o(path, "path");
        return b(path) > 0;
    }

    @n6.d
    public static final File e(@n6.d File file, int i7, int i8) {
        l0.p(file, "<this>");
        return f(file).j(i7, i8);
    }

    @n6.d
    public static final i f(@n6.d File file) {
        List list;
        l0.p(file, "<this>");
        String path = file.getPath();
        l0.o(path, "path");
        int b7 = b(path);
        String substring = path.substring(0, b7);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(b7);
        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = x3.w.E();
        } else {
            List T4 = c0.T4(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(x3.x.Y(T4, 10));
            Iterator it = T4.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new i(new File(substring), list);
    }
}
