package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class f0<T> extends h0<T> {

    /* renamed from: m  reason: collision with root package name */
    public m.b<LiveData<?>, a<?>> f4739m;

    /* loaded from: classes.dex */
    public static class a<V> implements i0<V> {

        /* renamed from: a  reason: collision with root package name */
        public final LiveData<V> f4740a;

        /* renamed from: b  reason: collision with root package name */
        public final i0<? super V> f4741b;

        /* renamed from: c  reason: collision with root package name */
        public int f4742c = -1;

        public a(LiveData<V> liveData, i0<? super V> i0Var) {
            this.f4740a = liveData;
            this.f4741b = i0Var;
        }

        public void a() {
            this.f4740a.l(this);
        }

        @Override // androidx.lifecycle.i0
        public void b(@d.q0 V v6) {
            if (this.f4742c != this.f4740a.g()) {
                this.f4742c = this.f4740a.g();
                this.f4741b.b(v6);
            }
        }

        public void c() {
            this.f4740a.p(this);
        }
    }

    public f0() {
        this.f4739m = new m.b<>();
    }

    @Override // androidx.lifecycle.LiveData
    @d.i
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4739m.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @d.i
    public void n() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4739m.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    @d.l0
    public <S> void s(@d.o0 LiveData<S> liveData, @d.o0 i0<? super S> i0Var) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, i0Var);
        a<?> h7 = this.f4739m.h(liveData, aVar);
        if (h7 != null && h7.f4741b != i0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (h7 == null && h()) {
            aVar.a();
        }
    }

    @d.l0
    public <S> void t(@d.o0 LiveData<S> liveData) {
        a<?> i7 = this.f4739m.i(liveData);
        if (i7 != null) {
            i7.c();
        }
    }

    public f0(T t6) {
        super(t6);
        this.f4739m = new m.b<>();
    }
}
