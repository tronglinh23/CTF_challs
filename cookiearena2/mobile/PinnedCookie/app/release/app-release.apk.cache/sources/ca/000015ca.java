package kotlinx.coroutines.selects;

import kotlinx.coroutines.c2;
import t4.l;
import t4.p;

/* loaded from: classes.dex */
public interface a<R> {

    /* renamed from: kotlinx.coroutines.selects.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0173a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@n6.d a<? super R> aVar, @n6.d e<? super P, ? extends Q> eVar, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
            aVar.G(eVar, null, pVar);
        }
    }

    <P, Q> void G(@n6.d e<? super P, ? extends Q> eVar, P p6, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar);

    @c2
    void f(long j7, @n6.d l<? super e4.d<? super R>, ? extends Object> lVar);

    <Q> void h0(@n6.d d<? extends Q> dVar, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar);

    void k(@n6.d c cVar, @n6.d l<? super e4.d<? super R>, ? extends Object> lVar);

    <P, Q> void q0(@n6.d e<? super P, ? extends Q> eVar, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar);
}