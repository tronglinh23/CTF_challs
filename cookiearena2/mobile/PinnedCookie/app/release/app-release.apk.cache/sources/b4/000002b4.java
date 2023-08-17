package androidx.collection;

import i0.x2;
import t4.p;
import t4.r;
import u4.l0;
import u4.n0;
import v3.m2;

/* loaded from: classes.dex */
public final class k {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements p<Object, Object, Integer> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f1960l = new a();

        public a() {
            super(2);
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ Integer J(Object obj, Object obj2) {
            return Integer.valueOf(b(obj, obj2));
        }

        public final int b(@n6.d Object obj, @n6.d Object obj2) {
            l0.q(obj, "<anonymous parameter 0>");
            l0.q(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.l<Object, Object> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f1961l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        public final Object O(@n6.d Object obj) {
            l0.q(obj, "it");
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements r<Boolean, Object, Object, Object, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f1962l = new c();

        public c() {
            super(4);
        }

        public final void b(boolean z6, @n6.d Object obj, @n6.d Object obj2, @n6.e Object obj3) {
            l0.q(obj, "<anonymous parameter 1>");
            l0.q(obj2, "<anonymous parameter 2>");
        }

        @Override // t4.r
        public /* bridge */ /* synthetic */ m2 l0(Boolean bool, Object obj, Object obj2, Object obj3) {
            b(bool.booleanValue(), obj, obj2, obj3);
            return m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* loaded from: classes.dex */
    public static final class d<K, V> extends j<K, V> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ p f1963i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ t4.l f1964j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ r f1965k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f1966l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p pVar, t4.l lVar, r rVar, int i7, int i8) {
            super(i8);
            this.f1963i = pVar;
            this.f1964j = lVar;
            this.f1965k = rVar;
            this.f1966l = i7;
        }

        @Override // androidx.collection.j
        @n6.e
        public V a(@n6.d K k7) {
            l0.q(k7, x2.f10960j);
            return (V) this.f1964j.O(k7);
        }

        @Override // androidx.collection.j
        public void c(boolean z6, @n6.d K k7, @n6.d V v6, @n6.e V v7) {
            l0.q(k7, x2.f10960j);
            l0.q(v6, "oldValue");
            this.f1965k.l0(Boolean.valueOf(z6), k7, v6, v7);
        }

        @Override // androidx.collection.j
        public int p(@n6.d K k7, @n6.d V v6) {
            l0.q(k7, x2.f10960j);
            l0.q(v6, "value");
            return ((Number) this.f1963i.J(k7, v6)).intValue();
        }
    }

    @n6.d
    public static final <K, V> j<K, V> a(int i7, @n6.d p<? super K, ? super V, Integer> pVar, @n6.d t4.l<? super K, ? extends V> lVar, @n6.d r<? super Boolean, ? super K, ? super V, ? super V, m2> rVar) {
        l0.q(pVar, "sizeOf");
        l0.q(lVar, "create");
        l0.q(rVar, "onEntryRemoved");
        return new d(pVar, lVar, rVar, i7, i7);
    }

    @n6.d
    public static /* synthetic */ j b(int i7, p pVar, t4.l lVar, r rVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            pVar = a.f1960l;
        }
        p pVar2 = pVar;
        if ((i8 & 4) != 0) {
            lVar = b.f1961l;
        }
        t4.l lVar2 = lVar;
        if ((i8 & 8) != 0) {
            rVar = c.f1962l;
        }
        r rVar2 = rVar;
        l0.q(pVar2, "sizeOf");
        l0.q(lVar2, "create");
        l0.q(rVar2, "onEntryRemoved");
        return new d(pVar2, lVar2, rVar2, i7, i7);
    }
}