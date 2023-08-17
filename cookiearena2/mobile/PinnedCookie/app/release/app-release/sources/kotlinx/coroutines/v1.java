package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.u1;
/* loaded from: classes.dex */
public abstract class v1 extends t1 {
    @n6.d
    public abstract Thread o1();

    public void p1(long j7, @n6.d u1.c cVar) {
        a1.f11839r.y1(j7, cVar);
    }

    public final void q1() {
        v3.m2 m2Var;
        Thread o12 = o1();
        if (Thread.currentThread() != o12) {
            b b7 = c.b();
            if (b7 != null) {
                b7.g(o12);
                m2Var = v3.m2.f17815a;
            } else {
                m2Var = null;
            }
            if (m2Var == null) {
                LockSupport.unpark(o12);
            }
        }
    }
}
