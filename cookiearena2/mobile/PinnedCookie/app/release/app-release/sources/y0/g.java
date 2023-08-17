package y0;

import android.net.Uri;
import java.io.File;
import u4.l0;
import u4.r1;
@r1({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    @n6.d
    public static final File a(@n6.d Uri uri) {
        l0.p(uri, "<this>");
        if (!l0.g(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @n6.d
    public static final Uri b(@n6.d File file) {
        l0.p(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        l0.o(fromFile, "fromFile(this)");
        return fromFile;
    }

    @n6.d
    public static final Uri c(@n6.d String str) {
        l0.p(str, "<this>");
        Uri parse = Uri.parse(str);
        l0.o(parse, "parse(this)");
        return parse;
    }
}
