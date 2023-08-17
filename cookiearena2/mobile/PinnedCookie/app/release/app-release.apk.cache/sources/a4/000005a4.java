package androidx.lifecycle;

import u4.r1;
import v3.m2;

/* loaded from: classes.dex */
public final class e0 {

    @r1({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,55:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, m2> f4736a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.l<? super T, m2> lVar) {
            this.f4736a = lVar;
        }

        @Override // androidx.lifecycle.i0
        public final void b(T t6) {
            this.f4736a.O(t6);
        }
    }

    @d.l0
    @n6.d
    @v3.k(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    public static final <T> i0<T> a(@n6.d LiveData<T> liveData, @n6.d z zVar, @n6.d t4.l<? super T, m2> lVar) {
        u4.l0.p(liveData, "<this>");
        u4.l0.p(zVar, "owner");
        u4.l0.p(lVar, "onChanged");
        a aVar = new a(lVar);
        liveData.k(zVar, aVar);
        return aVar;
    }
}