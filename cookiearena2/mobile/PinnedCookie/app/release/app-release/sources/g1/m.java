package g1;

import android.util.LruCache;
import i0.x2;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.m2;
/* loaded from: classes.dex */
public final class m {

    @r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$1\n*L\n1#1,54:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.p<Object, Object, Integer> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f10017l = new a();

        public a() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Integer J(@n6.d Object obj, @n6.d Object obj2) {
            l0.p(obj, "<anonymous parameter 0>");
            l0.p(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    @r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$2\n*L\n1#1,54:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.l<Object, Object> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f10018l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        public final Object O(@n6.d Object obj) {
            l0.p(obj, "it");
            return null;
        }
    }

    @r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$3\n*L\n1#1,54:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.r<Boolean, Object, Object, Object, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f10019l = new c();

        public c() {
            super(4);
        }

        public final void b(boolean z6, @n6.d Object obj, @n6.d Object obj2, @n6.e Object obj3) {
            l0.p(obj, "<anonymous parameter 1>");
            l0.p(obj2, "<anonymous parameter 2>");
        }

        @Override // t4.r
        public /* bridge */ /* synthetic */ m2 l0(Boolean bool, Object obj, Object obj2, Object obj3) {
            b(bool.booleanValue(), obj, obj2, obj3);
            return m2.f17815a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    @r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d<K, V> extends LruCache<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.p<K, V, Integer> f10020a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<K, V> f10021b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t4.r<Boolean, K, V, V, m2> f10022c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i7, t4.p<? super K, ? super V, Integer> pVar, t4.l<? super K, ? extends V> lVar, t4.r<? super Boolean, ? super K, ? super V, ? super V, m2> rVar) {
            super(i7);
            this.f10020a = pVar;
            this.f10021b = lVar;
            this.f10022c = rVar;
        }

        @Override // android.util.LruCache
        @n6.e
        public V create(@n6.d K k7) {
            l0.p(k7, x2.f10960j);
            return this.f10021b.O(k7);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z6, @n6.d K k7, @n6.d V v6, @n6.e V v7) {
            l0.p(k7, x2.f10960j);
            l0.p(v6, "oldValue");
            this.f10022c.l0(Boolean.valueOf(z6), k7, v6, v7);
        }

        @Override // android.util.LruCache
        public int sizeOf(@n6.d K k7, @n6.d V v6) {
            l0.p(k7, x2.f10960j);
            l0.p(v6, "value");
            return this.f10020a.J(k7, v6).intValue();
        }
    }

    @n6.d
    public static final <K, V> LruCache<K, V> a(int i7, @n6.d t4.p<? super K, ? super V, Integer> pVar, @n6.d t4.l<? super K, ? extends V> lVar, @n6.d t4.r<? super Boolean, ? super K, ? super V, ? super V, m2> rVar) {
        l0.p(pVar, "sizeOf");
        l0.p(lVar, "create");
        l0.p(rVar, "onEntryRemoved");
        return new d(i7, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache b(int i7, t4.p pVar, t4.l lVar, t4.r rVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            pVar = a.f10017l;
        }
        if ((i8 & 4) != 0) {
            lVar = b.f10018l;
        }
        if ((i8 & 8) != 0) {
            rVar = c.f10019l;
        }
        l0.p(pVar, "sizeOf");
        l0.p(lVar, "create");
        l0.p(rVar, "onEntryRemoved");
        return new d(i7, pVar, lVar, rVar);
    }
}
