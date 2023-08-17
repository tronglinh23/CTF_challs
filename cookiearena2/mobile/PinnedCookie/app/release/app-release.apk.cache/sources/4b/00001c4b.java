package v3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class n2<T> implements d0<T>, Serializable {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public t4.a<? extends T> f17819k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public Object f17820l;

    public n2(@n6.d t4.a<? extends T> aVar) {
        u4.l0.p(aVar, "initializer");
        this.f17819k = aVar;
        this.f17820l = f2.f17787a;
    }

    @Override // v3.d0
    public boolean a() {
        return this.f17820l != f2.f17787a;
    }

    public final Object b() {
        return new x(getValue());
    }

    @Override // v3.d0
    public T getValue() {
        if (this.f17820l == f2.f17787a) {
            t4.a<? extends T> aVar = this.f17819k;
            u4.l0.m(aVar);
            this.f17820l = aVar.n();
            this.f17819k = null;
        }
        return (T) this.f17820l;
    }

    @n6.d
    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}