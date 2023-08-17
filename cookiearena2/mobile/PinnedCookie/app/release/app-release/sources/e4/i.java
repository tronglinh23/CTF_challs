package e4;

import e4.g;
import i0.x2;
import java.io.Serializable;
import t4.p;
import u4.l0;
import v3.g1;
@g1(version = "1.3")
/* loaded from: classes.dex */
public final class i implements g, Serializable {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final i f8770k = new i();

    /* renamed from: l  reason: collision with root package name */
    public static final long f8771l = 0;

    @Override // e4.g
    @n6.d
    public g a(@n6.d g.c<?> cVar) {
        l0.p(cVar, x2.f10960j);
        return this;
    }

    public final Object c() {
        return f8770k;
    }

    @Override // e4.g
    @n6.e
    public <E extends g.b> E e(@n6.d g.c<E> cVar) {
        l0.p(cVar, x2.f10960j);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // e4.g
    public <R> R k(R r6, @n6.d p<? super R, ? super g.b, ? extends R> pVar) {
        l0.p(pVar, "operation");
        return r6;
    }

    @Override // e4.g
    @n6.d
    public g t(@n6.d g gVar) {
        l0.p(gVar, "context");
        return gVar;
    }

    @n6.d
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
