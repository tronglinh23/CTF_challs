package n4;

import java.io.File;
import u4.l0;

/* loaded from: classes.dex */
public class p extends o {
    @n6.d
    public static final k J(@n6.d File file, @n6.d l lVar) {
        l0.p(file, "<this>");
        l0.p(lVar, "direction");
        return new k(file, lVar);
    }

    public static /* synthetic */ k K(File file, l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            lVar = l.TOP_DOWN;
        }
        return J(file, lVar);
    }

    @n6.d
    public static final k L(@n6.d File file) {
        l0.p(file, "<this>");
        return J(file, l.BOTTOM_UP);
    }

    @n6.d
    public static final k M(@n6.d File file) {
        l0.p(file, "<this>");
        return J(file, l.TOP_DOWN);
    }
}