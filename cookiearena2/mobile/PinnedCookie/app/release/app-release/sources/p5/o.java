package p5;

import kotlinx.coroutines.internal.n0;
/* loaded from: classes.dex */
public final class o<T> extends n0<T> {
    public o(@n6.d e4.g gVar, @n6.d e4.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @Override // kotlinx.coroutines.v2
    public boolean z0(@n6.d Throwable th) {
        if (th instanceof l) {
            return true;
        }
        return s0(th);
    }
}
