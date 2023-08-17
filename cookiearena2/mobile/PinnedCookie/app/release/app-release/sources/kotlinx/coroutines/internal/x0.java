package kotlinx.coroutines.internal;

import e4.g;
import kotlinx.coroutines.s3;
/* loaded from: classes.dex */
public final class x0<T> implements s3<T> {

    /* renamed from: k  reason: collision with root package name */
    public final T f12862k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final ThreadLocal<T> f12863l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final g.c<?> f12864m;

    public x0(T t6, @n6.d ThreadLocal<T> threadLocal) {
        this.f12862k = t6;
        this.f12863l = threadLocal;
        this.f12864m = new y0(threadLocal);
    }

    @Override // kotlinx.coroutines.s3
    public T C(@n6.d e4.g gVar) {
        T t6 = this.f12863l.get();
        this.f12863l.set(this.f12862k);
        return t6;
    }

    @Override // kotlinx.coroutines.s3
    public void E(@n6.d e4.g gVar, T t6) {
        this.f12863l.set(t6);
    }

    @Override // e4.g.b, e4.g
    @n6.d
    public e4.g a(@n6.d g.c<?> cVar) {
        return u4.l0.g(getKey(), cVar) ? e4.i.f8770k : this;
    }

    @Override // e4.g.b, e4.g
    @n6.e
    public <E extends g.b> E e(@n6.d g.c<E> cVar) {
        if (u4.l0.g(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    @Override // e4.g.b
    @n6.d
    public g.c<?> getKey() {
        return this.f12864m;
    }

    @Override // e4.g.b, e4.g
    public <R> R k(R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) s3.a.a(this, r6, pVar);
    }

    @Override // e4.g
    @n6.d
    public e4.g t(@n6.d e4.g gVar) {
        return s3.a.d(this, gVar);
    }

    @n6.d
    public String toString() {
        return "ThreadLocal(value=" + this.f12862k + ", threadLocal = " + this.f12863l + ')';
    }
}
