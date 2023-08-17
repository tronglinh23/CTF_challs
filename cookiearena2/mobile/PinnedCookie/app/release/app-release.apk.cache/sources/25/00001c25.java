package v3;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f1<T> implements d0<T>, Serializable {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final a f17782n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<f1<?>, Object> f17783o = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "l");
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public volatile t4.a<? extends T> f17784k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public volatile Object f17785l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final Object f17786m;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
        }
    }

    public f1(@n6.d t4.a<? extends T> aVar) {
        u4.l0.p(aVar, "initializer");
        this.f17784k = aVar;
        f2 f2Var = f2.f17787a;
        this.f17785l = f2Var;
        this.f17786m = f2Var;
    }

    @Override // v3.d0
    public boolean a() {
        return this.f17785l != f2.f17787a;
    }

    public final Object b() {
        return new x(getValue());
    }

    @Override // v3.d0
    public T getValue() {
        T t6 = (T) this.f17785l;
        f2 f2Var = f2.f17787a;
        if (t6 != f2Var) {
            return t6;
        }
        t4.a<? extends T> aVar = this.f17784k;
        if (aVar != null) {
            T n7 = aVar.n();
            if (p.b.a(f17783o, this, f2Var, n7)) {
                this.f17784k = null;
                return n7;
            }
        }
        return (T) this.f17785l;
    }

    @n6.d
    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}