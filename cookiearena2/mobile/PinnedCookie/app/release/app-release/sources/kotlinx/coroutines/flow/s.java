package kotlinx.coroutines.flow;

import u4.u1;
/* loaded from: classes.dex */
public final /* synthetic */ class s {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final t4.l<Object, Object> f12432a = b.f12435l;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final t4.p<Object, Object, Boolean> f12433b = a.f12434l;

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.p<Object, Object, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f12434l = new a();

        public a() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean J(@n6.e Object obj, @n6.e Object obj2) {
            return Boolean.valueOf(u4.l0.g(obj, obj2));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<Object, Object> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f12435l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        public final Object O(@n6.e Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> i<T> a(@n6.d i<? extends T> iVar) {
        return iVar instanceof t0 ? iVar : d(iVar, f12432a, f12433b);
    }

    @n6.d
    public static final <T> i<T> b(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super T, Boolean> pVar) {
        return d(iVar, f12432a, (t4.p) u1.q(pVar, 2));
    }

    @n6.d
    public static final <T, K> i<T> c(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, ? extends K> lVar) {
        return d(iVar, lVar, f12433b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> i<T> d(i<? extends T> iVar, t4.l<? super T, ? extends Object> lVar, t4.p<Object, Object, Boolean> pVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f12224l == lVar && gVar.f12225m == pVar) {
                return iVar;
            }
        }
        return new g(iVar, lVar, pVar);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }
}
