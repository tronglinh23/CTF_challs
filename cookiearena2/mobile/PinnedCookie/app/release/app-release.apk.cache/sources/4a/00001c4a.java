package v3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class n1<T> implements d0<T>, Serializable {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public t4.a<? extends T> f17816k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public volatile Object f17817l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final Object f17818m;

    public n1(@n6.d t4.a<? extends T> aVar, @n6.e Object obj) {
        u4.l0.p(aVar, "initializer");
        this.f17816k = aVar;
        this.f17817l = f2.f17787a;
        this.f17818m = obj == null ? this : obj;
    }

    @Override // v3.d0
    public boolean a() {
        return this.f17817l != f2.f17787a;
    }

    public final Object b() {
        return new x(getValue());
    }

    @Override // v3.d0
    public T getValue() {
        T t6;
        T t7 = (T) this.f17817l;
        f2 f2Var = f2.f17787a;
        if (t7 != f2Var) {
            return t7;
        }
        synchronized (this.f17818m) {
            t6 = (T) this.f17817l;
            if (t6 == f2Var) {
                t4.a<? extends T> aVar = this.f17816k;
                u4.l0.m(aVar);
                t6 = aVar.n();
                this.f17817l = t6;
                this.f17816k = null;
            }
        }
        return t6;
    }

    @n6.d
    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ n1(t4.a aVar, Object obj, int i7, u4.w wVar) {
        this(aVar, (i7 & 2) != 0 ? null : obj);
    }
}