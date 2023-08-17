package kotlinx.coroutines.flow;

import u4.k1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class r0 implements o0 {

    @h4.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<j<? super m0>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12424o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12425p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ t0<Integer> f12426q;

        /* renamed from: kotlinx.coroutines.flow.r0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0161a<T> implements j {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ k1.a f12427k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ j<m0> f12428l;

            @h4.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.r0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0162a extends h4.d {

                /* renamed from: n  reason: collision with root package name */
                public /* synthetic */ Object f12429n;

                /* renamed from: o  reason: collision with root package name */
                public final /* synthetic */ C0161a<T> f12430o;

                /* renamed from: p  reason: collision with root package name */
                public int f12431p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0162a(C0161a<? super T> c0161a, e4.d<? super C0162a> dVar) {
                    super(dVar);
                    this.f12430o = c0161a;
                }

                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    this.f12429n = obj;
                    this.f12431p |= Integer.MIN_VALUE;
                    return this.f12430o.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0161a(k1.a aVar, j<? super m0> jVar) {
                this.f12427k = aVar;
                this.f12428l = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, @n6.d e4.d<? super v3.m2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.r0.a.C0161a.C0162a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.r0$a$a$a r0 = (kotlinx.coroutines.flow.r0.a.C0161a.C0162a) r0
                    int r1 = r0.f12431p
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12431p = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.r0$a$a$a r0 = new kotlinx.coroutines.flow.r0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f12429n
                    java.lang.Object r1 = g4.d.h()
                    int r2 = r0.f12431p
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    v3.e1.n(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    v3.e1.n(r6)
                    if (r5 <= 0) goto L4e
                    u4.k1$a r5 = r4.f12427k
                    boolean r6 = r5.f17429k
                    if (r6 != 0) goto L4e
                    r5.f17429k = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.m0> r5 = r4.f12428l
                    kotlinx.coroutines.flow.m0 r6 = kotlinx.coroutines.flow.m0.START
                    r0.f12431p = r3
                    java.lang.Object r5 = r5.f(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    v3.m2 r5 = v3.m2.f17815a
                    return r5
                L4e:
                    v3.m2 r5 = v3.m2.f17815a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r0.a.C0161a.a(int, e4.d):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object f(Object obj, e4.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0<Integer> t0Var, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f12426q = t0Var;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f12426q, dVar);
            aVar.f12425p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12424o;
            if (i7 == 0) {
                e1.n(obj);
                j jVar = (j) this.f12425p;
                k1.a aVar = new k1.a();
                t0<Integer> t0Var = this.f12426q;
                C0161a c0161a = new C0161a(aVar, jVar);
                this.f12424o = 1;
                if (t0Var.a(c0161a, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            throw new v3.y();
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d j<? super m0> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    @Override // kotlinx.coroutines.flow.o0
    @n6.d
    public i<m0> a(@n6.d t0<Integer> t0Var) {
        return k.I0(new a(t0Var, null));
    }

    @n6.d
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
