package kotlinx.coroutines.internal;

import e4.g;
import kotlinx.coroutines.s3;

/* loaded from: classes.dex */
public final class w0 {
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f12850a = new r0("NO_THREAD_ELEMENTS");
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final t4.p<Object, g.b, Object> f12851b = a.f12854l;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final t4.p<s3<?>, g.b, s3<?>> f12852c = b.f12855l;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final t4.p<c1, g.b, c1> f12853d = c.f12856l;

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.p<Object, g.b, Object> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f12854l = new a();

        public a() {
            super(2);
        }

        @Override // t4.p
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.e Object obj, @n6.d g.b bVar) {
            if (bVar instanceof s3) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.p<s3<?>, g.b, s3<?>> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f12855l = new b();

        public b() {
            super(2);
        }

        @Override // t4.p
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final s3<?> J(@n6.e s3<?> s3Var, @n6.d g.b bVar) {
            if (s3Var != null) {
                return s3Var;
            }
            if (bVar instanceof s3) {
                return (s3) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.p<c1, g.b, c1> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f12856l = new c();

        public c() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1 J(@n6.d c1 c1Var, @n6.d g.b bVar) {
            if (bVar instanceof s3) {
                s3<?> s3Var = (s3) bVar;
                c1Var.a(s3Var, s3Var.C(c1Var.f12788a));
            }
            return c1Var;
        }
    }

    public static final void a(@n6.d e4.g gVar, @n6.e Object obj) {
        if (obj == f12850a) {
            return;
        }
        if (obj instanceof c1) {
            ((c1) obj).b(gVar);
            return;
        }
        Object k7 = gVar.k(null, f12852c);
        if (k7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((s3) k7).E(gVar, obj);
    }

    @n6.d
    public static final Object b(@n6.d e4.g gVar) {
        Object k7 = gVar.k(0, f12851b);
        u4.l0.m(k7);
        return k7;
    }

    @n6.e
    public static final Object c(@n6.d e4.g gVar, @n6.e Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f12850a : obj instanceof Integer ? gVar.k(new c1(gVar, ((Number) obj).intValue()), f12853d) : ((s3) obj).C(gVar);
    }
}