package p0;

import android.annotation.SuppressLint;
import android.graphics.Path;
import java.util.Collection;
@u4.r1({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,85:1\n44#1,3:86\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n63#1:86,3\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class z0 {
    @n6.d
    @d.w0(19)
    public static final Path a(@n6.d Path path, @n6.d Path path2) {
        u4.l0.p(path, "<this>");
        u4.l0.p(path2, "p");
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @n6.d
    @d.w0(26)
    public static final Iterable<b1> b(@n6.d Path path, float f7) {
        u4.l0.p(path, "<this>");
        Collection<b1> b7 = c1.b(path, f7);
        u4.l0.o(b7, "flatten(this, error)");
        return b7;
    }

    public static /* synthetic */ Iterable c(Path path, float f7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = 0.5f;
        }
        return b(path, f7);
    }

    @n6.d
    @d.w0(19)
    public static final Path d(@n6.d Path path, @n6.d Path path2) {
        u4.l0.p(path, "<this>");
        u4.l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @n6.d
    @d.w0(19)
    public static final Path e(@n6.d Path path, @n6.d Path path2) {
        u4.l0.p(path, "<this>");
        u4.l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @n6.d
    @d.w0(19)
    public static final Path f(@n6.d Path path, @n6.d Path path2) {
        u4.l0.p(path, "<this>");
        u4.l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @n6.d
    @d.w0(19)
    public static final Path g(@n6.d Path path, @n6.d Path path2) {
        u4.l0.p(path, "<this>");
        u4.l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
