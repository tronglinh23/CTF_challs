package n5;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.y1;
import kotlinx.coroutines.z0;
/* loaded from: classes.dex */
public class d<E> extends o<E> implements f<E> {
    public d(@n6.d e4.g gVar, @n6.d n<E> nVar, boolean z6) {
        super(gVar, nVar, false, z6);
        Y0((n2) gVar.e(n2.f12920c));
    }

    @Override // kotlinx.coroutines.v2
    public boolean W0(@n6.d Throwable th) {
        r0.b(g(), th);
        return true;
    }

    @Override // kotlinx.coroutines.v2
    public void o1(@n6.e Throwable th) {
        n<E> M1 = M1();
        if (th != null) {
            r1 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r1 == null) {
                r1 = y1.a(z0.a(this) + " was cancelled", th);
            }
        }
        M1.f(r1);
    }
}
