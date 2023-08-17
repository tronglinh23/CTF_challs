package x3;

import java.util.Iterator;
import v3.m2;

/* loaded from: classes.dex */
public class z extends y {
    public static final <T> void d0(@n6.d Iterator<? extends T> it, @n6.d t4.l<? super T, m2> lVar) {
        u4.l0.p(it, "<this>");
        u4.l0.p(lVar, "operation");
        while (it.hasNext()) {
            lVar.O((T) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> Iterator<T> e0(Iterator<? extends T> it) {
        u4.l0.p(it, "<this>");
        return it;
    }

    @n6.d
    public static final <T> Iterator<p0<T>> f0(@n6.d Iterator<? extends T> it) {
        u4.l0.p(it, "<this>");
        return new r0(it);
    }
}