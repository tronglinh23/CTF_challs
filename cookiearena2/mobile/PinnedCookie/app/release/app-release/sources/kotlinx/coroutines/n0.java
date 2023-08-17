package kotlinx.coroutines;

import e4.g;
import u4.k1;
/* loaded from: classes.dex */
public final class n0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f12914a = " @";

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.p<e4.g, g.b, e4.g> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f12915l = new a();

        public a() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final e4.g J(@n6.d e4.g gVar, @n6.d g.b bVar) {
            return bVar instanceof l0 ? gVar.t(((l0) bVar).L()) : gVar.t(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.p<e4.g, g.b, e4.g> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.h<e4.g> f12916l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ boolean f12917m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k1.h<e4.g> hVar, boolean z6) {
            super(2);
            this.f12916l = hVar;
            this.f12917m = z6;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, e4.g] */
        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final e4.g J(@n6.d e4.g gVar, @n6.d g.b bVar) {
            if (bVar instanceof l0) {
                g.b e7 = this.f12916l.f17436k.e(bVar.getKey());
                if (e7 != null) {
                    k1.h<e4.g> hVar = this.f12916l;
                    hVar.f17436k = hVar.f17436k.a(bVar.getKey());
                    return gVar.t(((l0) bVar).p(e7));
                }
                l0 l0Var = (l0) bVar;
                if (this.f12917m) {
                    l0Var = l0Var.L();
                }
                return gVar.t(l0Var);
            }
            return gVar.t(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.p<Boolean, g.b, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f12918l = new c();

        public c() {
            super(2);
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ Boolean J(Boolean bool, g.b bVar) {
            return b(bool.booleanValue(), bVar);
        }

        @n6.d
        public final Boolean b(boolean z6, @n6.d g.b bVar) {
            return Boolean.valueOf(z6 || (bVar instanceof l0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final e4.g a(e4.g gVar, e4.g gVar2, boolean z6) {
        boolean c7 = c(gVar);
        boolean c8 = c(gVar2);
        if (c7 || c8) {
            k1.h hVar = new k1.h();
            hVar.f17436k = gVar2;
            e4.i iVar = e4.i.f8770k;
            e4.g gVar3 = (e4.g) gVar.k(iVar, new b(hVar, z6));
            if (c8) {
                hVar.f17436k = ((e4.g) hVar.f17436k).k(iVar, a.f12915l);
            }
            return gVar3.t((e4.g) hVar.f17436k);
        }
        return gVar.t(gVar2);
    }

    @n6.e
    public static final String b(@n6.d e4.g gVar) {
        return null;
    }

    public static final boolean c(e4.g gVar) {
        return ((Boolean) gVar.k(Boolean.FALSE, c.f12918l)).booleanValue();
    }

    @n6.d
    @i2
    public static final e4.g d(@n6.d e4.g gVar, @n6.d e4.g gVar2) {
        return !c(gVar2) ? gVar.t(gVar2) : a(gVar, gVar2, false);
    }

    @c2
    @n6.d
    public static final e4.g e(@n6.d u0 u0Var, @n6.d e4.g gVar) {
        e4.g a7 = a(u0Var.getCoroutineContext(), gVar, true);
        return (a7 == m1.a() || a7.e(e4.e.f8765a) != null) ? a7 : a7.t(m1.a());
    }

    @n6.e
    public static final c4<?> f(@n6.d h4.e eVar) {
        while (!(eVar instanceof i1) && (eVar = eVar.v()) != null) {
            if (eVar instanceof c4) {
                return (c4) eVar;
            }
        }
        return null;
    }

    @n6.e
    public static final c4<?> g(@n6.d e4.d<?> dVar, @n6.d e4.g gVar, @n6.e Object obj) {
        if (dVar instanceof h4.e) {
            if (gVar.e(d4.f11868k) != null) {
                c4<?> f7 = f((h4.e) dVar);
                if (f7 != null) {
                    f7.O1(gVar, obj);
                }
                return f7;
            }
            return null;
        }
        return null;
    }

    public static final <T> T h(@n6.d e4.d<?> dVar, @n6.e Object obj, @n6.d t4.a<? extends T> aVar) {
        e4.g g7 = dVar.g();
        Object c7 = kotlinx.coroutines.internal.w0.c(g7, obj);
        c4<?> g8 = c7 != kotlinx.coroutines.internal.w0.f12850a ? g(dVar, g7, c7) : null;
        try {
            return aVar.n();
        } finally {
            u4.i0.d(1);
            if (g8 == null || g8.N1()) {
                kotlinx.coroutines.internal.w0.a(g7, c7);
            }
            u4.i0.c(1);
        }
    }

    public static final <T> T i(@n6.d e4.g gVar, @n6.e Object obj, @n6.d t4.a<? extends T> aVar) {
        Object c7 = kotlinx.coroutines.internal.w0.c(gVar, obj);
        try {
            return aVar.n();
        } finally {
            u4.i0.d(1);
            kotlinx.coroutines.internal.w0.a(gVar, c7);
            u4.i0.c(1);
        }
    }
}
