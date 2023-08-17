package n5;

import androidx.lifecycle.r0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.m1;
import u.v;
import v3.a1;
import v3.e1;
import v3.m2;
import v3.q1;
import v3.u0;
/* loaded from: classes.dex */
public final /* synthetic */ class v {

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<E> extends h4.d {

        /* renamed from: n */
        public Object f14022n;

        /* renamed from: o */
        public /* synthetic */ Object f14023o;

        /* renamed from: p */
        public int f14024p;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object a7;
            this.f14023o = obj;
            this.f14024p |= Integer.MIN_VALUE;
            a7 = v.a(null, this);
            return a7;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes.dex */
    public static final class a0<E> extends h4.d {

        /* renamed from: n */
        public Object f14025n;

        /* renamed from: o */
        public Object f14026o;

        /* renamed from: p */
        public Object f14027p;

        /* renamed from: q */
        public Object f14028q;

        /* renamed from: r */
        public /* synthetic */ Object f14029r;

        /* renamed from: s */
        public int f14030s;

        public a0(e4.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object N;
            this.f14029r = obj;
            this.f14030s |= Integer.MIN_VALUE;
            N = v.N(null, null, this);
            return N;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<Throwable, m2> {

        /* renamed from: l */
        public final /* synthetic */ n5.i0<?> f14031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n5.i0<?> i0Var) {
            super(1);
            this.f14031l = i0Var;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.e Throwable th) {
            n5.s.b(this.f14031l, th);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class b0<E> extends h4.d {

        /* renamed from: n */
        public Object f14032n;

        /* renamed from: o */
        public /* synthetic */ Object f14033o;

        /* renamed from: p */
        public int f14034p;

        public b0(e4.d<? super b0> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object O;
            this.f14033o = obj;
            this.f14034p |= Integer.MIN_VALUE;
            O = v.O(null, this);
            return O;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.l<Throwable, m2> {

        /* renamed from: l */
        public final /* synthetic */ n5.i0<?>[] f14035l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n5.i0<?>[] i0VarArr) {
            super(1);
            this.f14035l = i0VarArr;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.e Throwable th) {
            Throwable th2 = null;
            for (n5.i0<?> i0Var : this.f14035l) {
                try {
                    n5.s.b(i0Var, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        v3.p.a(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class c0 extends h4.o implements t4.p<Object, e4.d<Object>, Object> {

        /* renamed from: o */
        public int f14036o;

        /* renamed from: p */
        public /* synthetic */ Object f14037p;

        /* renamed from: q */
        public final /* synthetic */ n5.i0<Object> f14038q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(n5.i0<Object> i0Var, e4.d<? super c0> dVar) {
            super(2, dVar);
            this.f14038q = i0Var;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            c0 c0Var = new c0(this.f14038q, dVar);
            c0Var.f14037p = obj;
            return c0Var;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f14036o == 0) {
                e1.n(obj);
                Object obj2 = this.f14037p;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalArgumentException("null element found in " + this.f14038q + '.');
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.e Object obj, @n6.e e4.d<Object> dVar) {
            return ((c0) H(obj, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class d<E> extends h4.d {

        /* renamed from: n */
        public Object f14039n;

        /* renamed from: o */
        public Object f14040o;

        /* renamed from: p */
        public Object f14041p;

        /* renamed from: q */
        public /* synthetic */ Object f14042q;

        /* renamed from: r */
        public int f14043r;

        public d(e4.d<? super d> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object d7;
            this.f14042q = obj;
            this.f14043r |= Integer.MIN_VALUE;
            d7 = v.d(null, this);
            return d7;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class d0<E> extends h4.d {

        /* renamed from: n */
        public Object f14044n;

        /* renamed from: o */
        public Object f14045o;

        /* renamed from: p */
        public /* synthetic */ Object f14046p;

        /* renamed from: q */
        public int f14047q;

        public d0(e4.d<? super d0> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object Q;
            this.f14046p = obj;
            this.f14047q |= Integer.MIN_VALUE;
            Q = v.Q(null, this);
            return Q;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class e extends h4.o implements t4.p<Object, e4.d<Object>, Object> {

        /* renamed from: o */
        public int f14048o;

        /* renamed from: p */
        public /* synthetic */ Object f14049p;

        public e(e4.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f14049p = obj;
            return eVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f14048o == 0) {
                e1.n(obj);
                return this.f14049p;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(Object obj, @n6.e e4.d<Object> dVar) {
            return ((e) H(obj, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, 152}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class e0<E> extends h4.d {

        /* renamed from: n */
        public Object f14050n;

        /* renamed from: o */
        public Object f14051o;

        /* renamed from: p */
        public /* synthetic */ Object f14052p;

        /* renamed from: q */
        public int f14053q;

        public e0(e4.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object R;
            this.f14052p = obj;
            this.f14053q |= Integer.MIN_VALUE;
            R = v.R(null, this);
            return R;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", r0.f4812h, "$this$produce", r0.f4812h, "e", "$this$produce", r0.f4812h, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* loaded from: classes.dex */
    public static final class f<E> extends h4.o implements t4.p<n5.g0<? super E>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14054o;

        /* renamed from: p */
        public Object f14055p;

        /* renamed from: q */
        public Object f14056q;

        /* renamed from: r */
        public int f14057r;

        /* renamed from: s */
        public /* synthetic */ Object f14058s;

        /* renamed from: t */
        public final /* synthetic */ n5.i0<E> f14059t;

        /* renamed from: u */
        public final /* synthetic */ t4.p<E, e4.d<? super K>, Object> f14060u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(n5.i0<? extends E> i0Var, t4.p<? super E, ? super e4.d<? super K>, ? extends Object> pVar, e4.d<? super f> dVar) {
            super(2, dVar);
            this.f14059t = i0Var;
            this.f14060u = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            f fVar = new f(this.f14059t, this.f14060u, dVar);
            fVar.f14058s = obj;
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00c5 -> B:62:0x00cb). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00d2 -> B:46:0x0071). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.f.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<? super E> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((f) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes.dex */
    public static final class f0 extends h4.o implements t4.p<n5.g0<Object>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14061o;

        /* renamed from: p */
        public int f14062p;

        /* renamed from: q */
        public int f14063q;

        /* renamed from: r */
        public /* synthetic */ Object f14064r;

        /* renamed from: s */
        public final /* synthetic */ int f14065s;

        /* renamed from: t */
        public final /* synthetic */ n5.i0<Object> f14066t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(int i7, n5.i0<Object> i0Var, e4.d<? super f0> dVar) {
            super(2, dVar);
            this.f14065s = i7;
            this.f14066t = i0Var;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            f0 f0Var = new f0(this.f14065s, this.f14066t, dVar);
            f0Var.f14064r = obj;
            return f0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0080 -> B:66:0x0082). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r8.f14063q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                int r1 = r8.f14062p
                java.lang.Object r4 = r8.f14061o
                n5.p r4 = (n5.p) r4
                java.lang.Object r5 = r8.f14064r
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r9)
                r9 = r5
                r5 = r8
                goto L82
            L1f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L27:
                int r1 = r8.f14062p
                java.lang.Object r4 = r8.f14061o
                n5.p r4 = (n5.p) r4
                java.lang.Object r5 = r8.f14064r
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r9)
                r6 = r8
                goto L65
            L36:
                v3.e1.n(r9)
                java.lang.Object r9 = r8.f14064r
                n5.g0 r9 = (n5.g0) r9
                int r1 = r8.f14065s
                if (r1 != 0) goto L44
                v3.m2 r9 = v3.m2.f17815a
                return r9
            L44:
                if (r1 < 0) goto L48
                r4 = r3
                goto L49
            L48:
                r4 = 0
            L49:
                if (r4 == 0) goto L8c
                n5.i0<java.lang.Object> r4 = r8.f14066t
                n5.p r4 = r4.iterator()
                r5 = r8
            L52:
                r5.f14064r = r9
                r5.f14061o = r4
                r5.f14062p = r1
                r5.f14063q = r3
                java.lang.Object r6 = r4.b(r5)
                if (r6 != r0) goto L61
                return r0
            L61:
                r7 = r5
                r5 = r9
                r9 = r6
                r6 = r7
            L65:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L89
                java.lang.Object r9 = r4.next()
                r6.f14064r = r5
                r6.f14061o = r4
                r6.f14062p = r1
                r6.f14063q = r2
                java.lang.Object r9 = r5.z(r9, r6)
                if (r9 != r0) goto L80
                return r0
            L80:
                r9 = r5
                r5 = r6
            L82:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L52
                v3.m2 r9 = v3.m2.f17815a
                return r9
            L89:
                v3.m2 r9 = v3.m2.f17815a
                return r9
            L8c:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Requested element count "
                r9.append(r0)
                r9.append(r1)
                java.lang.String r0 = " is less than zero."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.f0.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((f0) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    /* loaded from: classes.dex */
    public static final class g extends h4.o implements t4.p<n5.g0<Object>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14067o;

        /* renamed from: p */
        public int f14068p;

        /* renamed from: q */
        public int f14069q;

        /* renamed from: r */
        public /* synthetic */ Object f14070r;

        /* renamed from: s */
        public final /* synthetic */ int f14071s;

        /* renamed from: t */
        public final /* synthetic */ n5.i0<Object> f14072t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i7, n5.i0<Object> i0Var, e4.d<? super g> dVar) {
            super(2, dVar);
            this.f14071s = i7;
            this.f14072t = i0Var;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            g gVar = new g(this.f14071s, this.f14072t, dVar);
            gVar.f14070r = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00ca  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0077 -> B:69:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x00c8 -> B:78:0x009f). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.g.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((g) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* loaded from: classes.dex */
    public static final class g0 extends h4.o implements t4.p<n5.g0<Object>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14073o;

        /* renamed from: p */
        public Object f14074p;

        /* renamed from: q */
        public int f14075q;

        /* renamed from: r */
        public /* synthetic */ Object f14076r;

        /* renamed from: s */
        public final /* synthetic */ n5.i0<Object> f14077s;

        /* renamed from: t */
        public final /* synthetic */ t4.p<Object, e4.d<? super Boolean>, Object> f14078t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g0(n5.i0<Object> i0Var, t4.p<Object, ? super e4.d<? super Boolean>, ? extends Object> pVar, e4.d<? super g0> dVar) {
            super(2, dVar);
            this.f14077s = i0Var;
            this.f14078t = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            g0 g0Var = new g0(this.f14077s, this.f14078t, dVar);
            g0Var.f14076r = obj;
            return g0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0063 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x00a7 -> B:48:0x0057). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r9.f14075q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L38
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r9.f14073o
                n5.p r1 = (n5.p) r1
                java.lang.Object r5 = r9.f14076r
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r10)
                goto L56
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                java.lang.Object r1 = r9.f14074p
                java.lang.Object r5 = r9.f14073o
                n5.p r5 = (n5.p) r5
                java.lang.Object r6 = r9.f14076r
                n5.g0 r6 = (n5.g0) r6
                v3.e1.n(r10)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L8c
            L38:
                java.lang.Object r1 = r9.f14073o
                n5.p r1 = (n5.p) r1
                java.lang.Object r5 = r9.f14076r
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L6a
            L48:
                v3.e1.n(r10)
                java.lang.Object r10 = r9.f14076r
                n5.g0 r10 = (n5.g0) r10
                n5.i0<java.lang.Object> r1 = r9.f14077s
                n5.p r1 = r1.iterator()
                r5 = r10
            L56:
                r10 = r9
            L57:
                r10.f14076r = r5
                r10.f14073o = r1
                r10.f14075q = r4
                java.lang.Object r6 = r1.b(r10)
                if (r6 != r0) goto L64
                return r0
            L64:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L6a:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lac
                java.lang.Object r10 = r5.next()
                t4.p<java.lang.Object, e4.d<? super java.lang.Boolean>, java.lang.Object> r7 = r0.f14078t
                r0.f14076r = r6
                r0.f14073o = r5
                r0.f14074p = r10
                r0.f14075q = r3
                java.lang.Object r7 = r7.J(r10, r0)
                if (r7 != r1) goto L87
                return r1
            L87:
                r8 = r5
                r5 = r10
                r10 = r7
                r7 = r6
                r6 = r8
            L8c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L97
                v3.m2 r10 = v3.m2.f17815a
                return r10
            L97:
                r0.f14076r = r7
                r0.f14073o = r6
                r10 = 0
                r0.f14074p = r10
                r0.f14075q = r2
                java.lang.Object r10 = r7.z(r5, r0)
                if (r10 != r1) goto La7
                return r1
            La7:
                r10 = r0
                r0 = r1
                r1 = r6
                r5 = r7
                goto L57
            Lac:
                v3.m2 r10 = v3.m2.f17815a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.g0.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((g0) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    /* loaded from: classes.dex */
    public static final class h extends h4.o implements t4.p<n5.g0<Object>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14079o;

        /* renamed from: p */
        public Object f14080p;

        /* renamed from: q */
        public int f14081q;

        /* renamed from: r */
        public /* synthetic */ Object f14082r;

        /* renamed from: s */
        public final /* synthetic */ n5.i0<Object> f14083s;

        /* renamed from: t */
        public final /* synthetic */ t4.p<Object, e4.d<? super Boolean>, Object> f14084t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(n5.i0<Object> i0Var, t4.p<Object, ? super e4.d<? super Boolean>, ? extends Object> pVar, e4.d<? super h> dVar) {
            super(2, dVar);
            this.f14083s = i0Var;
            this.f14084t = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            h hVar = new h(this.f14083s, this.f14084t, dVar);
            hVar.f14082r = obj;
            return hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00b1 -> B:74:0x00b5). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0102 -> B:82:0x00d9). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.h.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((h) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class h0<E, C extends n5.m0<? super E>> extends h4.d {

        /* renamed from: n */
        public Object f14085n;

        /* renamed from: o */
        public Object f14086o;

        /* renamed from: p */
        public Object f14087p;

        /* renamed from: q */
        public /* synthetic */ Object f14088q;

        /* renamed from: r */
        public int f14089r;

        public h0(e4.d<? super h0> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f14088q = obj;
            this.f14089r |= Integer.MIN_VALUE;
            return n5.s.e0(null, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    /* loaded from: classes.dex */
    public static final class i<E> extends h4.d {

        /* renamed from: n */
        public int f14090n;

        /* renamed from: o */
        public int f14091o;

        /* renamed from: p */
        public Object f14092p;

        /* renamed from: q */
        public Object f14093q;

        /* renamed from: r */
        public /* synthetic */ Object f14094r;

        /* renamed from: s */
        public int f14095s;

        public i(e4.d<? super i> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object l7;
            this.f14094r = obj;
            this.f14095s |= Integer.MIN_VALUE;
            l7 = v.l(null, 0, this);
            return l7;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class i0<E, C extends Collection<? super E>> extends h4.d {

        /* renamed from: n */
        public Object f14096n;

        /* renamed from: o */
        public Object f14097o;

        /* renamed from: p */
        public Object f14098p;

        /* renamed from: q */
        public /* synthetic */ Object f14099q;

        /* renamed from: r */
        public int f14100r;

        public i0(e4.d<? super i0> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f14099q = obj;
            this.f14100r |= Integer.MIN_VALUE;
            return n5.s.f0(null, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    /* loaded from: classes.dex */
    public static final class j<E> extends h4.d {

        /* renamed from: n */
        public int f14101n;

        /* renamed from: o */
        public int f14102o;

        /* renamed from: p */
        public Object f14103p;

        /* renamed from: q */
        public Object f14104q;

        /* renamed from: r */
        public /* synthetic */ Object f14105r;

        /* renamed from: s */
        public int f14106s;

        public j(e4.d<? super j> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object m7;
            this.f14105r = obj;
            this.f14106s |= Integer.MIN_VALUE;
            m7 = v.m(null, 0, this);
            return m7;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class j0<K, V, M extends Map<? super K, ? super V>> extends h4.d {

        /* renamed from: n */
        public Object f14107n;

        /* renamed from: o */
        public Object f14108o;

        /* renamed from: p */
        public Object f14109p;

        /* renamed from: q */
        public /* synthetic */ Object f14110q;

        /* renamed from: r */
        public int f14111r;

        public j0(e4.d<? super j0> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f14110q = obj;
            this.f14111r |= Integer.MIN_VALUE;
            return n5.s.i0(null, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* loaded from: classes.dex */
    public static final class k<E> extends h4.o implements t4.p<n5.g0<? super E>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14112o;

        /* renamed from: p */
        public Object f14113p;

        /* renamed from: q */
        public int f14114q;

        /* renamed from: r */
        public /* synthetic */ Object f14115r;

        /* renamed from: s */
        public final /* synthetic */ n5.i0<E> f14116s;

        /* renamed from: t */
        public final /* synthetic */ t4.p<E, e4.d<? super Boolean>, Object> f14117t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(n5.i0<? extends E> i0Var, t4.p<? super E, ? super e4.d<? super Boolean>, ? extends Object> pVar, e4.d<? super k> dVar) {
            super(2, dVar);
            this.f14116s = i0Var;
            this.f14117t = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            k kVar = new k(this.f14116s, this.f14117t, dVar);
            kVar.f14115r = obj;
            return kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00a4 -> B:46:0x0057). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r10.f14114q
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L48
                if (r1 == r5) goto L38
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r10.f14112o
                n5.p r1 = (n5.p) r1
                java.lang.Object r6 = r10.f14115r
                n5.g0 r6 = (n5.g0) r6
                v3.e1.n(r11)
                goto L56
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                java.lang.Object r1 = r10.f14113p
                java.lang.Object r6 = r10.f14112o
                n5.p r6 = (n5.p) r6
                java.lang.Object r7 = r10.f14115r
                n5.g0 r7 = (n5.g0) r7
                v3.e1.n(r11)
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r10
                goto L8d
            L38:
                java.lang.Object r1 = r10.f14112o
                n5.p r1 = (n5.p) r1
                java.lang.Object r6 = r10.f14115r
                n5.g0 r6 = (n5.g0) r6
                v3.e1.n(r11)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r10
                goto L6c
            L48:
                v3.e1.n(r11)
                java.lang.Object r11 = r10.f14115r
                n5.g0 r11 = (n5.g0) r11
                n5.i0<E> r1 = r10.f14116s
                n5.p r1 = r1.iterator()
                r6 = r11
            L56:
                r11 = r10
            L57:
                r11.f14115r = r6
                r11.f14112o = r1
                r11.f14113p = r2
                r11.f14114q = r5
                java.lang.Object r7 = r1.b(r11)
                if (r7 != r0) goto L66
                return r0
            L66:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L6c:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La9
                java.lang.Object r11 = r6.next()
                t4.p<E, e4.d<? super java.lang.Boolean>, java.lang.Object> r8 = r0.f14117t
                r0.f14115r = r7
                r0.f14112o = r6
                r0.f14113p = r11
                r0.f14114q = r4
                java.lang.Object r8 = r8.J(r11, r0)
                if (r8 != r1) goto L89
                return r1
            L89:
                r9 = r7
                r7 = r11
                r11 = r8
                r8 = r9
            L8d:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La4
                r0.f14115r = r8
                r0.f14112o = r6
                r0.f14113p = r2
                r0.f14114q = r3
                java.lang.Object r11 = r8.z(r7, r0)
                if (r11 != r1) goto La4
                return r1
            La4:
                r11 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                goto L57
            La9:
                v3.m2 r11 = v3.m2.f17815a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.k.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<? super E> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((k) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes.dex */
    public static final class k0 extends h4.o implements t4.p<n5.g0<? super x3.p0<Object>>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14118o;

        /* renamed from: p */
        public int f14119p;

        /* renamed from: q */
        public int f14120q;

        /* renamed from: r */
        public /* synthetic */ Object f14121r;

        /* renamed from: s */
        public final /* synthetic */ n5.i0<Object> f14122s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(n5.i0<Object> i0Var, e4.d<? super k0> dVar) {
            super(2, dVar);
            this.f14122s = i0Var;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            k0 k0Var = new k0(this.f14122s, dVar);
            k0Var.f14121r = obj;
            return k0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x007f -> B:34:0x0047). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r11.f14120q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r1 = r11.f14119p
                java.lang.Object r4 = r11.f14118o
                n5.p r4 = (n5.p) r4
                java.lang.Object r5 = r11.f14121r
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r12)
                r12 = r5
                r5 = r11
                r9 = r4
                r4 = r1
                r1 = r9
                goto L47
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                int r1 = r11.f14119p
                java.lang.Object r4 = r11.f14118o
                n5.p r4 = (n5.p) r4
                java.lang.Object r5 = r11.f14121r
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r12)
                r6 = r11
                goto L5d
            L38:
                v3.e1.n(r12)
                java.lang.Object r12 = r11.f14121r
                n5.g0 r12 = (n5.g0) r12
                n5.i0<java.lang.Object> r1 = r11.f14122s
                n5.p r1 = r1.iterator()
                r4 = 0
                r5 = r11
            L47:
                r5.f14121r = r12
                r5.f14118o = r1
                r5.f14119p = r4
                r5.f14120q = r3
                java.lang.Object r6 = r1.b(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r9 = r5
                r5 = r12
                r12 = r6
                r6 = r9
                r10 = r4
                r4 = r1
                r1 = r10
            L5d:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L84
                java.lang.Object r12 = r4.next()
                x3.p0 r7 = new x3.p0
                int r8 = r1 + 1
                r7.<init>(r1, r12)
                r6.f14121r = r5
                r6.f14118o = r4
                r6.f14119p = r8
                r6.f14120q = r2
                java.lang.Object r12 = r5.z(r7, r6)
                if (r12 != r0) goto L7f
                return r0
            L7f:
                r1 = r4
                r12 = r5
                r5 = r6
                r4 = r8
                goto L47
            L84:
                v3.m2 r12 = v3.m2.f17815a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.k0.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<? super x3.p0<Object>> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((k0) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    /* loaded from: classes.dex */
    public static final class l extends h4.o implements t4.p<n5.g0<Object>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14123o;

        /* renamed from: p */
        public Object f14124p;

        /* renamed from: q */
        public int f14125q;

        /* renamed from: r */
        public int f14126r;

        /* renamed from: s */
        public /* synthetic */ Object f14127s;

        /* renamed from: t */
        public final /* synthetic */ n5.i0<Object> f14128t;

        /* renamed from: u */
        public final /* synthetic */ t4.q<Integer, Object, e4.d<? super Boolean>, Object> f14129u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(n5.i0<Object> i0Var, t4.q<? super Integer, Object, ? super e4.d<? super Boolean>, ? extends Object> qVar, e4.d<? super l> dVar) {
            super(2, dVar);
            this.f14128t = i0Var;
            this.f14129u = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            l lVar = new l(this.f14128t, this.f14129u, dVar);
            lVar.f14127s = obj;
            return lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00c0 -> B:46:0x0066). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 200
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.l.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((l) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    /* loaded from: classes.dex */
    public static final class l0 extends u4.n0 implements t4.p<Object, Object, u0<Object, Object>> {

        /* renamed from: l */
        public static final l0 f14130l = new l0();

        public l0() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b */
        public final u0<Object, Object> J(Object obj, Object obj2) {
            return q1.a(obj, obj2);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class m extends h4.o implements t4.p<Object, e4.d<? super Boolean>, Object> {

        /* renamed from: o */
        public int f14131o;

        /* renamed from: p */
        public /* synthetic */ Object f14132p;

        /* renamed from: q */
        public final /* synthetic */ t4.p<Object, e4.d<? super Boolean>, Object> f14133q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(t4.p<Object, ? super e4.d<? super Boolean>, ? extends Object> pVar, e4.d<? super m> dVar) {
            super(2, dVar);
            this.f14133q = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            m mVar = new m(this.f14133q, dVar);
            mVar.f14132p = obj;
            return mVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14131o;
            if (i7 == 0) {
                e1.n(obj);
                Object obj2 = this.f14132p;
                t4.p<Object, e4.d<? super Boolean>, Object> pVar = this.f14133q;
                this.f14131o = 1;
                obj = pVar.J(obj2, this);
                if (obj == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return h4.b.a(!((Boolean) obj).booleanValue());
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(Object obj, @n6.e e4.d<? super Boolean> dVar) {
            return ((m) H(obj, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    /* loaded from: classes.dex */
    public static final class m0<V> extends h4.o implements t4.p<n5.g0<? super V>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14134o;

        /* renamed from: p */
        public Object f14135p;

        /* renamed from: q */
        public Object f14136q;

        /* renamed from: r */
        public Object f14137r;

        /* renamed from: s */
        public Object f14138s;

        /* renamed from: t */
        public int f14139t;

        /* renamed from: u */
        public /* synthetic */ Object f14140u;

        /* renamed from: v */
        public final /* synthetic */ n5.i0<R> f14141v;

        /* renamed from: w */
        public final /* synthetic */ n5.i0<E> f14142w;

        /* renamed from: x */
        public final /* synthetic */ t4.p<E, R, V> f14143x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m0(n5.i0<? extends R> i0Var, n5.i0<? extends E> i0Var2, t4.p<? super E, ? super R, ? extends V> pVar, e4.d<? super m0> dVar) {
            super(2, dVar);
            this.f14141v = i0Var;
            this.f14142w = i0Var2;
            this.f14143x = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            m0 m0Var = new m0(this.f14141v, this.f14142w, this.f14143x, dVar);
            m0Var.f14140u = obj;
            return m0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:84:0x00b9 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:82:0x00b1, B:84:0x00b9, B:96:0x0109, B:69:0x004a), top: B:108:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00e1 A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #1 {all -> 0x0106, blocks: (B:88:0x00d9, B:90:0x00e1), top: B:106:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0109 A[Catch: all -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:82:0x00b1, B:84:0x00b9, B:96:0x0109, B:69:0x004a), top: B:108:0x004a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00fe -> B:78:0x0093). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.m0.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<? super V> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((m0) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class n<E> extends h4.o implements t4.p<E, e4.d<? super Boolean>, Object> {

        /* renamed from: o */
        public int f14144o;

        /* renamed from: p */
        public /* synthetic */ Object f14145p;

        public n(e4.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.f14145p = obj;
            return nVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f14144o == 0) {
                e1.n(obj);
                return h4.b.a(this.f14145p != null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.e E e7, @n6.e e4.d<? super Boolean> dVar) {
            return ((n) H(e7, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class o<E, C extends Collection<? super E>> extends h4.d {

        /* renamed from: n */
        public Object f14146n;

        /* renamed from: o */
        public Object f14147o;

        /* renamed from: p */
        public Object f14148p;

        /* renamed from: q */
        public /* synthetic */ Object f14149q;

        /* renamed from: r */
        public int f14150r;

        public o(e4.d<? super o> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object u6;
            this.f14149q = obj;
            this.f14150r |= Integer.MIN_VALUE;
            u6 = v.u(null, null, this);
            return u6;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class p<E, C extends n5.m0<? super E>> extends h4.d {

        /* renamed from: n */
        public Object f14151n;

        /* renamed from: o */
        public Object f14152o;

        /* renamed from: p */
        public Object f14153p;

        /* renamed from: q */
        public /* synthetic */ Object f14154q;

        /* renamed from: r */
        public int f14155r;

        public p(e4.d<? super p> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object v6;
            this.f14154q = obj;
            this.f14155r |= Integer.MIN_VALUE;
            v6 = v.v(null, null, this);
            return v6;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class q<E> extends h4.d {

        /* renamed from: n */
        public Object f14156n;

        /* renamed from: o */
        public Object f14157o;

        /* renamed from: p */
        public /* synthetic */ Object f14158p;

        /* renamed from: q */
        public int f14159q;

        public q(e4.d<? super q> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object w6;
            this.f14158p = obj;
            this.f14159q |= Integer.MIN_VALUE;
            w6 = v.w(null, this);
            return w6;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class r<E> extends h4.d {

        /* renamed from: n */
        public Object f14160n;

        /* renamed from: o */
        public Object f14161o;

        /* renamed from: p */
        public /* synthetic */ Object f14162p;

        /* renamed from: q */
        public int f14163q;

        public r(e4.d<? super r> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object x6;
            this.f14162p = obj;
            this.f14163q |= Integer.MIN_VALUE;
            x6 = v.x(null, this);
            return x6;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes.dex */
    public static final class s extends h4.o implements t4.p<n5.g0<Object>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14164o;

        /* renamed from: p */
        public int f14165p;

        /* renamed from: q */
        public /* synthetic */ Object f14166q;

        /* renamed from: r */
        public final /* synthetic */ n5.i0<Object> f14167r;

        /* renamed from: s */
        public final /* synthetic */ t4.p<Object, e4.d<? super n5.i0<Object>>, Object> f14168s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(n5.i0<Object> i0Var, t4.p<Object, ? super e4.d<? super n5.i0<Object>>, ? extends Object> pVar, e4.d<? super s> dVar) {
            super(2, dVar);
            this.f14167r = i0Var;
            this.f14168s = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            s sVar = new s(this.f14167r, this.f14168s, dVar);
            sVar.f14166q = obj;
            return sVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0091 -> B:43:0x0054). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r9.f14165p
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L35
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r9.f14164o
                n5.p r1 = (n5.p) r1
                java.lang.Object r5 = r9.f14166q
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r10)
                goto L53
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                java.lang.Object r1 = r9.f14164o
                n5.p r1 = (n5.p) r1
                java.lang.Object r5 = r9.f14166q
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L82
            L35:
                java.lang.Object r1 = r9.f14164o
                n5.p r1 = (n5.p) r1
                java.lang.Object r5 = r9.f14166q
                n5.g0 r5 = (n5.g0) r5
                v3.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L67
            L45:
                v3.e1.n(r10)
                java.lang.Object r10 = r9.f14166q
                n5.g0 r10 = (n5.g0) r10
                n5.i0<java.lang.Object> r1 = r9.f14167r
                n5.p r1 = r1.iterator()
                r5 = r10
            L53:
                r10 = r9
            L54:
                r10.f14166q = r5
                r10.f14164o = r1
                r10.f14165p = r4
                java.lang.Object r6 = r1.b(r10)
                if (r6 != r0) goto L61
                return r0
            L61:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L67:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L96
                java.lang.Object r10 = r5.next()
                t4.p<java.lang.Object, e4.d<? super n5.i0<java.lang.Object>>, java.lang.Object> r7 = r0.f14168s
                r0.f14166q = r6
                r0.f14164o = r5
                r0.f14165p = r3
                java.lang.Object r10 = r7.J(r10, r0)
                if (r10 != r1) goto L82
                return r1
            L82:
                n5.i0 r10 = (n5.i0) r10
                r0.f14166q = r6
                r0.f14164o = r5
                r0.f14165p = r2
                java.lang.Object r10 = n5.s.e0(r10, r6, r0)
                if (r10 != r1) goto L91
                return r1
            L91:
                r10 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L54
            L96:
                v3.m2 r10 = v3.m2.f17815a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.s.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<Object> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((s) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class t<E> extends h4.d {

        /* renamed from: n */
        public Object f14169n;

        /* renamed from: o */
        public Object f14170o;

        /* renamed from: p */
        public Object f14171p;

        /* renamed from: q */
        public Object f14172q;

        /* renamed from: r */
        public /* synthetic */ Object f14173r;

        /* renamed from: s */
        public int f14174s;

        public t(e4.d<? super t> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object A;
            this.f14173r = obj;
            this.f14174s |= Integer.MIN_VALUE;
            A = v.A(null, null, this);
            return A;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {androidx.constraintlayout.widget.e.Q1, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class u<E> extends h4.d {

        /* renamed from: n */
        public Object f14175n;

        /* renamed from: o */
        public Object f14176o;

        /* renamed from: p */
        public Object f14177p;

        /* renamed from: q */
        public /* synthetic */ Object f14178q;

        /* renamed from: r */
        public int f14179r;

        public u(e4.d<? super u> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object B;
            this.f14178q = obj;
            this.f14179r |= Integer.MIN_VALUE;
            B = v.B(null, this);
            return B;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: n5.v$v */
    /* loaded from: classes.dex */
    public static final class C0194v<E> extends h4.d {

        /* renamed from: n */
        public Object f14180n;

        /* renamed from: o */
        public Object f14181o;

        /* renamed from: p */
        public Object f14182p;

        /* renamed from: q */
        public Object f14183q;

        /* renamed from: r */
        public Object f14184r;

        /* renamed from: s */
        public /* synthetic */ Object f14185s;

        /* renamed from: t */
        public int f14186t;

        public C0194v(e4.d<? super C0194v> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object C;
            this.f14185s = obj;
            this.f14186t |= Integer.MIN_VALUE;
            C = v.C(null, null, this);
            return C;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, h6.g.f10413r}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class w<E> extends h4.d {

        /* renamed from: n */
        public Object f14187n;

        /* renamed from: o */
        public Object f14188o;

        /* renamed from: p */
        public Object f14189p;

        /* renamed from: q */
        public /* synthetic */ Object f14190q;

        /* renamed from: r */
        public int f14191r;

        public w(e4.d<? super w> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object D;
            this.f14190q = obj;
            this.f14191r |= Integer.MIN_VALUE;
            D = v.D(null, this);
            return D;
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    /* loaded from: classes.dex */
    public static final class x<R> extends h4.o implements t4.p<n5.g0<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14192o;

        /* renamed from: p */
        public Object f14193p;

        /* renamed from: q */
        public Object f14194q;

        /* renamed from: r */
        public Object f14195r;

        /* renamed from: s */
        public int f14196s;

        /* renamed from: t */
        public /* synthetic */ Object f14197t;

        /* renamed from: u */
        public final /* synthetic */ n5.i0<E> f14198u;

        /* renamed from: v */
        public final /* synthetic */ t4.p<E, e4.d<? super R>, Object> f14199v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(n5.i0<? extends E> i0Var, t4.p<? super E, ? super e4.d<? super R>, ? extends Object> pVar, e4.d<? super x> dVar) {
            super(2, dVar);
            this.f14198u = i0Var;
            this.f14199v = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            x xVar = new x(this.f14198u, this.f14199v, dVar);
            xVar.f14197t = obj;
            return xVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x0093 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #2 {all -> 0x00cf, blocks: (B:58:0x0022, B:72:0x0076, B:76:0x008b, B:78:0x0093, B:86:0x00c9, B:68:0x005e, B:71:0x006e), top: B:98:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00c9 A[Catch: all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00cf, blocks: (B:58:0x0022, B:72:0x0076, B:76:0x008b, B:78:0x0093, B:86:0x00c9, B:68:0x005e, B:71:0x006e), top: B:98:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x00c3 -> B:72:0x0076). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.x.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<? super R> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((x) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes.dex */
    public static final class y<R> extends h4.o implements t4.p<n5.g0<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: o */
        public Object f14200o;

        /* renamed from: p */
        public Object f14201p;

        /* renamed from: q */
        public int f14202q;

        /* renamed from: r */
        public int f14203r;

        /* renamed from: s */
        public /* synthetic */ Object f14204s;

        /* renamed from: t */
        public final /* synthetic */ n5.i0<E> f14205t;

        /* renamed from: u */
        public final /* synthetic */ t4.q<Integer, E, e4.d<? super R>, Object> f14206u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(n5.i0<? extends E> i0Var, t4.q<? super Integer, ? super E, ? super e4.d<? super R>, ? extends Object> qVar, e4.d<? super y> dVar) {
            super(2, dVar);
            this.f14205t = i0Var;
            this.f14206u = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            y yVar = new y(this.f14205t, this.f14206u, dVar);
            yVar.f14204s = obj;
            return yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ad -> B:42:0x005e). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r11.f14203r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L4c
                if (r1 == r4) goto L3d
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r1 = r11.f14202q
                java.lang.Object r5 = r11.f14200o
                n5.p r5 = (n5.p) r5
                java.lang.Object r6 = r11.f14204s
                n5.g0 r6 = (n5.g0) r6
                v3.e1.n(r12)
                r12 = r6
                r6 = r11
                goto L5e
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                int r1 = r11.f14202q
                java.lang.Object r5 = r11.f14201p
                n5.g0 r5 = (n5.g0) r5
                java.lang.Object r6 = r11.f14200o
                n5.p r6 = (n5.p) r6
                java.lang.Object r7 = r11.f14204s
                n5.g0 r7 = (n5.g0) r7
                v3.e1.n(r12)
                r8 = r11
                goto L9b
            L3d:
                int r1 = r11.f14202q
                java.lang.Object r5 = r11.f14200o
                n5.p r5 = (n5.p) r5
                java.lang.Object r6 = r11.f14204s
                n5.g0 r6 = (n5.g0) r6
                v3.e1.n(r12)
                r7 = r11
                goto L71
            L4c:
                v3.e1.n(r12)
                java.lang.Object r12 = r11.f14204s
                n5.g0 r12 = (n5.g0) r12
                n5.i0<E> r1 = r11.f14205t
                n5.p r1 = r1.iterator()
                r5 = 0
                r6 = r11
                r10 = r5
                r5 = r1
                r1 = r10
            L5e:
                r6.f14204s = r12
                r6.f14200o = r5
                r6.f14202q = r1
                r6.f14203r = r4
                java.lang.Object r7 = r5.b(r6)
                if (r7 != r0) goto L6d
                return r0
            L6d:
                r10 = r6
                r6 = r12
                r12 = r7
                r7 = r10
            L71:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb1
                java.lang.Object r12 = r5.next()
                t4.q<java.lang.Integer, E, e4.d<? super R>, java.lang.Object> r8 = r7.f14206u
                int r9 = r1 + 1
                java.lang.Integer r1 = h4.b.f(r1)
                r7.f14204s = r6
                r7.f14200o = r5
                r7.f14201p = r6
                r7.f14202q = r9
                r7.f14203r = r3
                java.lang.Object r12 = r8.I(r1, r12, r7)
                if (r12 != r0) goto L96
                return r0
            L96:
                r8 = r7
                r1 = r9
                r7 = r6
                r6 = r5
                r5 = r7
            L9b:
                r8.f14204s = r7
                r8.f14200o = r6
                r9 = 0
                r8.f14201p = r9
                r8.f14202q = r1
                r8.f14203r = r2
                java.lang.Object r12 = r5.z(r12, r8)
                if (r12 != r0) goto Lad
                return r0
            Lad:
                r5 = r6
                r12 = r7
                r6 = r8
                goto L5e
            Lb1:
                v3.m2 r12 = v3.m2.f17815a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.v.y.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0 */
        public final Object J(@n6.d n5.g0<? super R> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((y) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {v.c.f17169r, v.c.f17171t}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes.dex */
    public static final class z<E> extends h4.d {

        /* renamed from: n */
        public Object f14207n;

        /* renamed from: o */
        public Object f14208o;

        /* renamed from: p */
        public Object f14209p;

        /* renamed from: q */
        public Object f14210q;

        /* renamed from: r */
        public /* synthetic */ Object f14211r;

        /* renamed from: s */
        public int f14212s;

        public z(e4.d<? super z> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object M;
            this.f14211r = obj;
            this.f14212s |= Integer.MIN_VALUE;
            M = v.M(null, null, this);
            return M;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0064 -> B:72:0x0067). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object A(n5.i0 r7, java.lang.Object r8, e4.d r9) {
        /*
            boolean r0 = r9 instanceof n5.v.t
            if (r0 == 0) goto L13
            r0 = r9
            n5.v$t r0 = (n5.v.t) r0
            int r1 = r0.f14174s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14174s = r1
            goto L18
        L13:
            n5.v$t r0 = new n5.v$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14173r
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14174s
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f14172q
            n5.p r7 = (n5.p) r7
            java.lang.Object r8 = r0.f14171p
            n5.i0 r8 = (n5.i0) r8
            java.lang.Object r2 = r0.f14170o
            u4.k1$f r2 = (u4.k1.f) r2
            java.lang.Object r4 = r0.f14169n
            v3.e1.n(r9)     // Catch: java.lang.Throwable -> L37
            goto L67
        L37:
            r7 = move-exception
            goto L9a
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            v3.e1.n(r9)
            u4.k1$f r9 = new u4.k1$f
            r9.<init>()
            n5.p r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L53:
            r0.f14169n = r9     // Catch: java.lang.Throwable -> L37
            r0.f14170o = r2     // Catch: java.lang.Throwable -> L37
            r0.f14171p = r8     // Catch: java.lang.Throwable -> L37
            r0.f14172q = r7     // Catch: java.lang.Throwable -> L37
            r0.f14174s = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.b(r0)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r4
            r4 = r9
            r9 = r6
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = u4.l0.g(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L84
            int r7 = r2.f17434k     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r7 = h4.b.f(r7)     // Catch: java.lang.Throwable -> L37
            n5.s.b(r8, r5)
            return r7
        L84:
            int r9 = r2.f17434k     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r3
            r2.f17434k = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L53
        L8b:
            v3.m2 r7 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L37
            n5.s.b(r8, r5)
            r7 = -1
            java.lang.Integer r7 = h4.b.f(r7)
            return r7
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            n5.s.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.A(n5.i0, java.lang.Object, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009d A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #3 {all -> 0x004e, blocks: (B:78:0x004a, B:87:0x0068, B:89:0x0070, B:101:0x009d, B:102:0x00a4), top: B:115:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0070 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:78:0x004a, B:87:0x0068, B:89:0x0070, B:101:0x009d, B:102:0x00a4), top: B:115:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0092 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:71:0x0032, B:95:0x008a, B:97:0x0092), top: B:111:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0086 -> B:95:0x008a). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object B(n5.i0 r6, e4.d r7) {
        /*
            boolean r0 = r7 instanceof n5.v.u
            if (r0 == 0) goto L13
            r0 = r7
            n5.v$u r0 = (n5.v.u) r0
            int r1 = r0.f14179r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14179r = r1
            goto L18
        L13:
            n5.v$u r0 = new n5.v$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14178q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14179r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.f14177p
            java.lang.Object r2 = r0.f14176o
            n5.p r2 = (n5.p) r2
            java.lang.Object r4 = r0.f14175n
            n5.i0 r4 = (n5.i0) r4
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L36
            goto L8a
        L36:
            r6 = move-exception
            r2 = r4
            goto La8
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r6 = r0.f14176o
            n5.p r6 = (n5.p) r6
            java.lang.Object r2 = r0.f14175n
            n5.i0 r2 = (n5.i0) r2
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L4e
            goto L68
        L4e:
            r6 = move-exception
            goto La8
        L50:
            v3.e1.n(r7)
            n5.p r7 = r6.iterator()     // Catch: java.lang.Throwable -> La5
            r0.f14175n = r6     // Catch: java.lang.Throwable -> La5
            r0.f14176o = r7     // Catch: java.lang.Throwable -> La5
            r0.f14179r = r4     // Catch: java.lang.Throwable -> La5
            java.lang.Object r2 = r7.b(r0)     // Catch: java.lang.Throwable -> La5
            if (r2 != r1) goto L64
            return r1
        L64:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L68:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L9d
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4e
            r5 = r2
            r2 = r6
            r6 = r5
        L77:
            r0.f14175n = r6     // Catch: java.lang.Throwable -> La5
            r0.f14176o = r2     // Catch: java.lang.Throwable -> La5
            r0.f14177p = r7     // Catch: java.lang.Throwable -> La5
            r0.f14179r = r3     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r2.b(r0)     // Catch: java.lang.Throwable -> La5
            if (r4 != r1) goto L86
            return r1
        L86:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L98
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L36
            r6 = r4
            goto L77
        L98:
            r7 = 0
            n5.s.b(r4, r7)
            return r6
        L9d:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            throw r6     // Catch: java.lang.Throwable -> L4e
        La5:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La8:
            throw r6     // Catch: java.lang.Throwable -> La9
        La9:
            r7 = move-exception
            n5.s.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.B(n5.i0, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0072 -> B:71:0x0075). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object C(n5.i0 r7, java.lang.Object r8, e4.d r9) {
        /*
            boolean r0 = r9 instanceof n5.v.C0194v
            if (r0 == 0) goto L13
            r0 = r9
            n5.v$v r0 = (n5.v.C0194v) r0
            int r1 = r0.f14186t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14186t = r1
            goto L18
        L13:
            n5.v$v r0 = new n5.v$v
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14185s
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14186t
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r7 = r0.f14184r
            n5.p r7 = (n5.p) r7
            java.lang.Object r8 = r0.f14183q
            n5.i0 r8 = (n5.i0) r8
            java.lang.Object r2 = r0.f14182p
            u4.k1$f r2 = (u4.k1.f) r2
            java.lang.Object r4 = r0.f14181o
            u4.k1$f r4 = (u4.k1.f) r4
            java.lang.Object r5 = r0.f14180n
            v3.e1.n(r9)     // Catch: java.lang.Throwable -> L3b
            goto L75
        L3b:
            r7 = move-exception
            goto La3
        L3e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L46:
            v3.e1.n(r9)
            u4.k1$f r9 = new u4.k1$f
            r9.<init>()
            r2 = -1
            r9.f17434k = r2
            u4.k1$f r2 = new u4.k1$f
            r2.<init>()
            n5.p r4 = r7.iterator()     // Catch: java.lang.Throwable -> L9f
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L5f:
            r0.f14180n = r9     // Catch: java.lang.Throwable -> L3b
            r0.f14181o = r4     // Catch: java.lang.Throwable -> L3b
            r0.f14182p = r2     // Catch: java.lang.Throwable -> L3b
            r0.f14183q = r8     // Catch: java.lang.Throwable -> L3b
            r0.f14184r = r7     // Catch: java.lang.Throwable -> L3b
            r0.f14186t = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r7.b(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 != r1) goto L72
            return r1
        L72:
            r6 = r5
            r5 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3b
            boolean r9 = u4.l0.g(r5, r9)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L8b
            int r9 = r2.f17434k     // Catch: java.lang.Throwable -> L3b
            r4.f17434k = r9     // Catch: java.lang.Throwable -> L3b
        L8b:
            int r9 = r2.f17434k     // Catch: java.lang.Throwable -> L3b
            int r9 = r9 + r3
            r2.f17434k = r9     // Catch: java.lang.Throwable -> L3b
            r9 = r5
            goto L5f
        L92:
            v3.m2 r7 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L3b
            r7 = 0
            n5.s.b(r8, r7)
            int r7 = r4.f17434k
            java.lang.Integer r7 = h4.b.f(r7)
            return r7
        L9f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La3:
            throw r7     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            n5.s.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.C(n5.i0, java.lang.Object, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:72:0x0033, B:98:0x008f, B:100:0x0097), top: B:114:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0075 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:79:0x004b, B:88:0x0069, B:92:0x0075), top: B:116:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x008b -> B:98:0x008f). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object D(n5.i0 r7, e4.d r8) {
        /*
            boolean r0 = r8 instanceof n5.v.w
            if (r0 == 0) goto L13
            r0 = r8
            n5.v$w r0 = (n5.v.w) r0
            int r1 = r0.f14191r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14191r = r1
            goto L18
        L13:
            n5.v$w r0 = new n5.v$w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14190q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14191r
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f14189p
            java.lang.Object r2 = r0.f14188o
            n5.p r2 = (n5.p) r2
            java.lang.Object r4 = r0.f14187n
            n5.i0 r4 = (n5.i0) r4
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            r2 = r4
            goto La4
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f14188o
            n5.p r7 = (n5.p) r7
            java.lang.Object r2 = r0.f14187n
            n5.i0 r2 = (n5.i0) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r7 = move-exception
            goto La4
        L51:
            v3.e1.n(r8)
            n5.p r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.f14187n = r7     // Catch: java.lang.Throwable -> La1
            r0.f14188o = r8     // Catch: java.lang.Throwable -> La1
            r0.f14191r = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L75
            n5.s.b(r2, r5)
            return r5
        L75:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4f
            r6 = r2
            r2 = r7
            r7 = r6
        L7c:
            r0.f14187n = r7     // Catch: java.lang.Throwable -> La1
            r0.f14188o = r2     // Catch: java.lang.Throwable -> La1
            r0.f14189p = r8     // Catch: java.lang.Throwable -> La1
            r0.f14191r = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r2.b(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 != r1) goto L8b
            return r1
        L8b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L37
            r7 = r4
            goto L7c
        L9d:
            n5.s.b(r4, r5)
            return r7
        La1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            n5.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.D(n5.i0, e4.d):java.lang.Object");
    }

    @n6.d
    @a1
    public static final <E, R> n5.i0<R> E(@n6.d n5.i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super e4.d<? super R>, ? extends Object> pVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new x(i0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 F(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        return n5.s.J(i0Var, gVar, pVar);
    }

    @n6.d
    @a1
    public static final <E, R> n5.i0<R> G(@n6.d n5.i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.q<? super Integer, ? super E, ? super e4.d<? super R>, ? extends Object> qVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new y(i0Var, qVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 H(n5.i0 i0Var, e4.g gVar, t4.q qVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        return n5.s.L(i0Var, gVar, qVar);
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 I(n5.i0 i0Var, e4.g gVar, t4.q qVar) {
        return n5.s.y(n5.s.L(i0Var, gVar, qVar));
    }

    public static /* synthetic */ n5.i0 J(n5.i0 i0Var, e4.g gVar, t4.q qVar, int i7, Object obj) {
        n5.i0 I;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        I = I(i0Var, gVar, qVar);
        return I;
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 K(n5.i0 i0Var, e4.g gVar, t4.p pVar) {
        return n5.s.y(n5.s.J(i0Var, gVar, pVar));
    }

    public static /* synthetic */ n5.i0 L(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        n5.i0 K;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        K = K(i0Var, gVar, pVar);
        return K;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:103:0x00a4, B:105:0x00ac, B:99:0x008f, B:89:0x0063), top: B:124:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:84:0x0059, B:93:0x007b, B:97:0x0087), top: B:122:0x0059 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00a0 -> B:78:0x003d). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object M(n5.i0 r8, java.util.Comparator r9, e4.d r10) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.M(n5.i0, java.util.Comparator, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:103:0x00a4, B:105:0x00ac, B:99:0x008f, B:89:0x0063), top: B:124:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:84:0x0059, B:93:0x007b, B:97:0x0087), top: B:122:0x0059 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00a0 -> B:78:0x003d). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object N(n5.i0 r8, java.util.Comparator r9, e4.d r10) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.N(n5.i0, java.util.Comparator, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0050  */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object O(n5.i0 r4, e4.d r5) {
        /*
            boolean r0 = r5 instanceof n5.v.b0
            if (r0 == 0) goto L13
            r0 = r5
            n5.v$b0 r0 = (n5.v.b0) r0
            int r1 = r0.f14034p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14034p = r1
            goto L18
        L13:
            n5.v$b0 r0 = new n5.v$b0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14033o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14034p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f14032n
            n5.i0 r4 = (n5.i0) r4
            v3.e1.n(r5)     // Catch: java.lang.Throwable -> L5a
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
            n5.p r5 = r4.iterator()     // Catch: java.lang.Throwable -> L5a
            r0.f14032n = r4     // Catch: java.lang.Throwable -> L5a
            r0.f14034p = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Throwable -> L5a
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L5a
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L50
            goto L51
        L50:
            r3 = 0
        L51:
            java.lang.Boolean r5 = h4.b.a(r3)     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            n5.s.b(r4, r0)
            return r5
        L5a:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            n5.s.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.O(n5.i0, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:69:0x002e, B:91:0x0081, B:95:0x008e, B:96:0x0095), top: B:107:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object Q(n5.i0 r6, e4.d r7) {
        /*
            boolean r0 = r7 instanceof n5.v.d0
            if (r0 == 0) goto L13
            r0 = r7
            n5.v$d0 r0 = (n5.v.d0) r0
            int r1 = r0.f14047q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14047q = r1
            goto L18
        L13:
            n5.v$d0 r0 = new n5.v$d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14046p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14047q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f14045o
            java.lang.Object r0 = r0.f14044n
            n5.i0 r0 = (n5.i0) r0
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r6 = move-exception
            r2 = r0
            goto La1
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f14045o
            n5.p r6 = (n5.p) r6
            java.lang.Object r2 = r0.f14044n
            n5.i0 r2 = (n5.i0) r2
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r6 = move-exception
            goto La1
        L4c:
            v3.e1.n(r7)
            n5.p r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.f14044n = r6     // Catch: java.lang.Throwable -> L9e
            r0.f14045o = r7     // Catch: java.lang.Throwable -> L9e
            r0.f14047q = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.b(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L96
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4a
            r0.f14044n = r2     // Catch: java.lang.Throwable -> L4a
            r0.f14045o = r7     // Catch: java.lang.Throwable -> L4a
            r0.f14047q = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r6.b(r0)     // Catch: java.lang.Throwable -> L4a
            if (r6 != r1) goto L7d
            return r1
        L7d:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L32
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L8e
            r7 = 0
            n5.s.b(r0, r7)
            return r6
        L8e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L96:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            throw r6     // Catch: java.lang.Throwable -> L4a
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r7 = move-exception
            n5.s.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.Q(n5.i0, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0071 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:77:0x0047, B:86:0x0065, B:90:0x0071), top: B:112:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0092  */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object R(n5.i0 r7, e4.d r8) {
        /*
            boolean r0 = r8 instanceof n5.v.e0
            if (r0 == 0) goto L13
            r0 = r8
            n5.v$e0 r0 = (n5.v.e0) r0
            int r1 = r0.f14053q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14053q = r1
            goto L18
        L13:
            n5.v$e0 r0 = new n5.v$e0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14052p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14053q
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f14051o
            java.lang.Object r0 = r0.f14050n
            n5.i0 r0 = (n5.i0) r0
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L33
            goto L86
        L33:
            r7 = move-exception
            r2 = r0
            goto L99
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.f14051o
            n5.p r7 = (n5.p) r7
            java.lang.Object r2 = r0.f14050n
            n5.i0 r2 = (n5.i0) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7 = move-exception
            goto L99
        L4d:
            v3.e1.n(r8)
            n5.p r8 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r0.f14050n = r7     // Catch: java.lang.Throwable -> L96
            r0.f14051o = r8     // Catch: java.lang.Throwable -> L96
            r0.f14053q = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L61
            return r1
        L61:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L71
            n5.s.b(r2, r5)
            return r5
        L71:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r0.f14050n = r2     // Catch: java.lang.Throwable -> L4b
            r0.f14051o = r8     // Catch: java.lang.Throwable -> L4b
            r0.f14053q = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L82
            return r1
        L82:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L92
            n5.s.b(r0, r5)
            return r5
        L92:
            n5.s.b(r0, r5)
            return r7
        L96:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            n5.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.R(n5.i0, e4.d):java.lang.Object");
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 S(n5.i0 i0Var, int i7, e4.g gVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new f0(i7, i0Var, null), 6, null);
    }

    public static /* synthetic */ n5.i0 T(n5.i0 i0Var, int i7, e4.g gVar, int i8, Object obj) {
        n5.i0 S;
        if ((i8 & 2) != 0) {
            gVar = m1.g();
        }
        S = S(i0Var, i7, gVar);
        return S;
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 U(n5.i0 i0Var, e4.g gVar, t4.p pVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new g0(i0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 V(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        n5.i0 U;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        U = U(i0Var, gVar, pVar);
        return U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:66:0x004f), top: B:92:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008b A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:66:0x004f), top: B:92:0x0022 }] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14, types: [n5.i0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [n5.i0] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5, types: [n5.i0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0088 -> B:62:0x0037). Please submit an issue!!! */
    @n6.e
    @v3.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends n5.m0<? super E>> java.lang.Object W(@n6.d n5.i0<? extends E> r6, @n6.d C r7, @n6.d e4.d<? super C> r8) {
        /*
            boolean r0 = r8 instanceof n5.v.h0
            if (r0 == 0) goto L13
            r0 = r8
            n5.v$h0 r0 = (n5.v.h0) r0
            int r1 = r0.f14089r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14089r = r1
            goto L18
        L13:
            n5.v$h0 r0 = new n5.v$h0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14088q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14089r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.f14087p
            n5.p r6 = (n5.p) r6
            java.lang.Object r7 = r0.f14086o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r2 = r0.f14085n
            n5.m0 r2 = (n5.m0) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L53
        L37:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5c
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.f14087p
            n5.p r6 = (n5.p) r6
            java.lang.Object r7 = r0.f14086o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r2 = r0.f14085n
            n5.m0 r2 = (n5.m0) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L53
            goto L70
        L53:
            r6 = move-exception
            goto L96
        L55:
            v3.e1.n(r8)
            n5.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L92
        L5c:
            r0.f14085n = r7     // Catch: java.lang.Throwable -> L92
            r0.f14086o = r6     // Catch: java.lang.Throwable -> L92
            r0.f14087p = r8     // Catch: java.lang.Throwable -> L92
            r0.f14089r = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L53
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L53
            r0.f14085n = r2     // Catch: java.lang.Throwable -> L53
            r0.f14086o = r7     // Catch: java.lang.Throwable -> L53
            r0.f14087p = r6     // Catch: java.lang.Throwable -> L53
            r0.f14089r = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r8 = r2.z(r8, r0)     // Catch: java.lang.Throwable -> L53
            if (r8 != r1) goto L37
            return r1
        L8b:
            v3.m2 r6 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L53
            r6 = 0
            n5.s.b(r7, r6)
            return r2
        L92:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r8 = move-exception
            n5.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.W(n5.i0, n5.m0, e4.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please submit an issue!!! */
    @n6.e
    @v3.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object X(@n6.d n5.i0<? extends E> r5, @n6.d C r6, @n6.d e4.d<? super C> r7) {
        /*
            boolean r0 = r7 instanceof n5.v.i0
            if (r0 == 0) goto L13
            r0 = r7
            n5.v$i0 r0 = (n5.v.i0) r0
            int r1 = r0.f14100r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14100r = r1
            goto L18
        L13:
            n5.v$i0 r0 = new n5.v$i0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14099q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14100r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f14098p
            n5.p r5 = (n5.p) r5
            java.lang.Object r6 = r0.f14097o
            n5.i0 r6 = (n5.i0) r6
            java.lang.Object r2 = r0.f14096n
            java.util.Collection r2 = (java.util.Collection) r2
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L78
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            v3.e1.n(r7)
            n5.p r7 = r5.iterator()     // Catch: java.lang.Throwable -> L74
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f14096n = r7     // Catch: java.lang.Throwable -> L35
            r0.f14097o = r6     // Catch: java.lang.Throwable -> L35
            r0.f14098p = r5     // Catch: java.lang.Throwable -> L35
            r0.f14100r = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            v3.m2 r5 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            n5.s.b(r6, r5)
            return r2
        L74:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L78:
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            n5.s.b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.X(n5.i0, java.util.Collection, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please submit an issue!!! */
    @n6.e
    @v3.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object Z(@n6.d n5.i0<? extends v3.u0<? extends K, ? extends V>> r6, @n6.d M r7, @n6.d e4.d<? super M> r8) {
        /*
            boolean r0 = r8 instanceof n5.v.j0
            if (r0 == 0) goto L13
            r0 = r8
            n5.v$j0 r0 = (n5.v.j0) r0
            int r1 = r0.f14111r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14111r = r1
            goto L18
        L13:
            n5.v$j0 r0 = new n5.v$j0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14110q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14111r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f14109p
            n5.p r6 = (n5.p) r6
            java.lang.Object r7 = r0.f14108o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r2 = r0.f14107n
            java.util.Map r2 = (java.util.Map) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            v3.e1.n(r8)
            n5.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7e
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f14107n = r8     // Catch: java.lang.Throwable -> L35
            r0.f14108o = r7     // Catch: java.lang.Throwable -> L35
            r0.f14109p = r6     // Catch: java.lang.Throwable -> L35
            r0.f14111r = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            v3.u0 r8 = (v3.u0) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r8.e()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.f()     // Catch: java.lang.Throwable -> L35
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L77:
            v3.m2 r6 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            n5.s.b(r7, r6)
            return r2
        L7e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L82:
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r8 = move-exception
            n5.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.Z(n5.i0, java.util.Map, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0035  */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(n5.i0 r4, e4.d r5) {
        /*
            boolean r0 = r5 instanceof n5.v.a
            if (r0 == 0) goto L13
            r0 = r5
            n5.v$a r0 = (n5.v.a) r0
            int r1 = r0.f14024p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14024p = r1
            goto L18
        L13:
            n5.v$a r0 = new n5.v$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14023o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14024p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f14022n
            n5.i0 r4 = (n5.i0) r4
            v3.e1.n(r5)     // Catch: java.lang.Throwable -> L4c
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
            n5.p r5 = r4.iterator()     // Catch: java.lang.Throwable -> L4c
            r0.f14022n = r4     // Catch: java.lang.Throwable -> L4c
            r0.f14024p = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Throwable -> L4c
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = 0
            n5.s.b(r4, r0)
            return r5
        L4c:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            n5.s.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.a(n5.i0, e4.d):java.lang.Object");
    }

    @n6.d
    @a1
    public static final t4.l<Throwable, m2> b(@n6.d n5.i0<?> i0Var) {
        return new b(i0Var);
    }

    @n6.e
    @a1
    public static final <E> Object b0(@n6.d n5.i0<? extends E> i0Var, @n6.d e4.d<? super Set<E>> dVar) {
        return n5.s.f0(i0Var, new LinkedHashSet(), dVar);
    }

    @n6.d
    @a1
    public static final t4.l<Throwable, m2> c(@n6.d n5.i0<?>... i0VarArr) {
        return new c(i0VarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x005d -> B:72:0x0060). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(n5.i0 r6, e4.d r7) {
        /*
            boolean r0 = r7 instanceof n5.v.d
            if (r0 == 0) goto L13
            r0 = r7
            n5.v$d r0 = (n5.v.d) r0
            int r1 = r0.f14043r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14043r = r1
            goto L18
        L13:
            n5.v$d r0 = new n5.v$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14042q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14043r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f14041p
            n5.p r6 = (n5.p) r6
            java.lang.Object r2 = r0.f14040o
            n5.i0 r2 = (n5.i0) r2
            java.lang.Object r4 = r0.f14039n
            u4.k1$f r4 = (u4.k1.f) r4
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L85
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            v3.e1.n(r7)
            u4.k1$f r7 = new u4.k1$f
            r7.<init>()
            n5.p r2 = r6.iterator()     // Catch: java.lang.Throwable -> L82
            r4 = r7
            r7 = r6
            r6 = r2
        L4e:
            r0.f14039n = r4     // Catch: java.lang.Throwable -> L7f
            r0.f14040o = r7     // Catch: java.lang.Throwable -> L7f
            r0.f14041p = r6     // Catch: java.lang.Throwable -> L7f
            r0.f14043r = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r5 = r2
            r2 = r7
            r7 = r5
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L72
            r6.next()     // Catch: java.lang.Throwable -> L35
            int r7 = r4.f17434k     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r3
            r4.f17434k = r7     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4e
        L72:
            v3.m2 r6 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            n5.s.b(r2, r6)
            int r6 = r4.f17434k
            java.lang.Integer r6 = h4.b.f(r6)
            return r6
        L7f:
            r6 = move-exception
            r2 = r7
            goto L85
        L82:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L85:
            throw r6     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            n5.s.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.d(n5.i0, e4.d):java.lang.Object");
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 d0(n5.i0 i0Var, e4.g gVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new k0(i0Var, null), 6, null);
    }

    public static /* synthetic */ n5.i0 e0(n5.i0 i0Var, e4.g gVar, int i7, Object obj) {
        n5.i0 d02;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        d02 = d0(i0Var, gVar);
        return d02;
    }

    @n6.d
    @a1
    public static final <E, K> n5.i0<E> f(@n6.d n5.i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super e4.d<? super K>, ? extends Object> pVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new f(i0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 g(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        return n5.s.k(i0Var, gVar, pVar);
    }

    @n6.d
    @a1
    public static final <E, R, V> n5.i0<V> g0(@n6.d n5.i0<? extends E> i0Var, @n6.d n5.i0<? extends R> i0Var2, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super R, ? extends V> pVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.h(i0Var, i0Var2), new m0(i0Var2, i0Var, pVar, null), 6, null);
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 h(n5.i0 i0Var, int i7, e4.g gVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new g(i7, i0Var, null), 6, null);
    }

    public static /* synthetic */ n5.i0 h0(n5.i0 i0Var, n5.i0 i0Var2, e4.g gVar, t4.p pVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            gVar = m1.g();
        }
        return n5.s.q0(i0Var, i0Var2, gVar, pVar);
    }

    public static /* synthetic */ n5.i0 i(n5.i0 i0Var, int i7, e4.g gVar, int i8, Object obj) {
        n5.i0 h7;
        if ((i8 & 2) != 0) {
            gVar = m1.g();
        }
        h7 = h(i0Var, i7, gVar);
        return h7;
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 j(n5.i0 i0Var, e4.g gVar, t4.p pVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new h(i0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 k(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        n5.i0 j7;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        j7 = j(i0Var, gVar, pVar);
        return j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x005f -> B:73:0x0064). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object l(n5.i0 r9, int r10, e4.d r11) {
        /*
            boolean r0 = r11 instanceof n5.v.i
            if (r0 == 0) goto L13
            r0 = r11
            n5.v$i r0 = (n5.v.i) r0
            int r1 = r0.f14095s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14095s = r1
            goto L18
        L13:
            n5.v$i r0 = new n5.v$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f14094r
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14095s
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 != r5) goto L3c
            int r9 = r0.f14091o
            int r10 = r0.f14090n
            java.lang.Object r2 = r0.f14093q
            n5.p r2 = (n5.p) r2
            java.lang.Object r6 = r0.f14092p
            n5.i0 r6 = (n5.i0) r6
            v3.e1.n(r11)     // Catch: java.lang.Throwable -> L39
            goto L64
        L39:
            r9 = move-exception
            goto Lb1
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            v3.e1.n(r11)
            if (r10 < 0) goto L99
            n5.p r11 = r9.iterator()     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L4e:
            r0.f14092p = r9     // Catch: java.lang.Throwable -> L95
            r0.f14093q = r11     // Catch: java.lang.Throwable -> L95
            r0.f14090n = r10     // Catch: java.lang.Throwable -> L95
            r0.f14091o = r2     // Catch: java.lang.Throwable -> L95
            r0.f14095s = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r11.b(r0)     // Catch: java.lang.Throwable -> L95
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L39
            int r7 = r9 + 1
            if (r10 != r9) goto L79
            r9 = 0
            n5.s.b(r6, r9)
            return r11
        L79:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4e
        L7d:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r11.<init>()     // Catch: java.lang.Throwable -> L39
            r11.append(r4)     // Catch: java.lang.Throwable -> L39
            r11.append(r10)     // Catch: java.lang.Throwable -> L39
            r11.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        L95:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lb1
        L99:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            r0.append(r4)     // Catch: java.lang.Throwable -> L95
            r0.append(r10)     // Catch: java.lang.Throwable -> L95
            r0.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L95
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L95
            throw r11     // Catch: java.lang.Throwable -> L95
        Lb1:
            throw r9     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            n5.s.b(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.l(n5.i0, int, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0072 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:76:0x006a, B:78:0x0072, B:72:0x0054, B:71:0x004f), top: B:92:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0065 -> B:76:0x006a). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object m(n5.i0 r8, int r9, e4.d r10) {
        /*
            boolean r0 = r10 instanceof n5.v.j
            if (r0 == 0) goto L13
            r0 = r10
            n5.v$j r0 = (n5.v.j) r0
            int r1 = r0.f14106s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14106s = r1
            goto L18
        L13:
            n5.v$j r0 = new n5.v$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14105r
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14106s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            int r8 = r0.f14102o
            int r9 = r0.f14101n
            java.lang.Object r2 = r0.f14104q
            n5.p r2 = (n5.p) r2
            java.lang.Object r5 = r0.f14103p
            n5.i0 r5 = (n5.i0) r5
            v3.e1.n(r10)     // Catch: java.lang.Throwable -> L3c
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r1
            r1 = r0
            r0 = r7
            goto L6a
        L3c:
            r8 = move-exception
            goto L8a
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            v3.e1.n(r10)
            if (r9 >= 0) goto L4f
            n5.s.b(r8, r4)
            return r4
        L4f:
            n5.p r10 = r8.iterator()     // Catch: java.lang.Throwable -> L87
            r2 = 0
        L54:
            r0.f14103p = r8     // Catch: java.lang.Throwable -> L87
            r0.f14104q = r10     // Catch: java.lang.Throwable -> L87
            r0.f14101n = r9     // Catch: java.lang.Throwable -> L87
            r0.f14102o = r2     // Catch: java.lang.Throwable -> L87
            r0.f14106s = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r5 = r10.b(r0)     // Catch: java.lang.Throwable -> L87
            if (r5 != r1) goto L65
            return r1
        L65:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r1
            r1 = r7
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L87
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r10 == 0) goto L83
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L87
            int r6 = r2 + 1
            if (r9 != r2) goto L7e
            n5.s.b(r8, r4)
            return r10
        L7e:
            r10 = r0
            r0 = r1
            r1 = r5
            r2 = r6
            goto L54
        L83:
            n5.s.b(r8, r4)
            return r4
        L87:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9 = move-exception
            n5.s.b(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.m(n5.i0, int, e4.d):java.lang.Object");
    }

    @n6.d
    @a1
    public static final <E> n5.i0<E> n(@n6.d n5.i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new k(i0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 o(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        return n5.s.s(i0Var, gVar, pVar);
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 p(n5.i0 i0Var, e4.g gVar, t4.q qVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new l(i0Var, qVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 q(n5.i0 i0Var, e4.g gVar, t4.q qVar, int i7, Object obj) {
        n5.i0 p6;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        p6 = p(i0Var, gVar, qVar);
        return p6;
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 r(n5.i0 i0Var, e4.g gVar, t4.p pVar) {
        return n5.s.s(i0Var, gVar, new m(pVar, null));
    }

    public static /* synthetic */ n5.i0 s(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        n5.i0 r6;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        r6 = r(i0Var, gVar, pVar);
        return r6;
    }

    @n6.d
    @a1
    public static final <E> n5.i0<E> t(@n6.d n5.i0<? extends E> i0Var) {
        n5.i0<E> o6;
        o6 = o(i0Var, null, new n(null), 1, null);
        return o6;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0059 -> B:71:0x005c). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object u(n5.i0 r5, java.util.Collection r6, e4.d r7) {
        /*
            boolean r0 = r7 instanceof n5.v.o
            if (r0 == 0) goto L13
            r0 = r7
            n5.v$o r0 = (n5.v.o) r0
            int r1 = r0.f14150r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14150r = r1
            goto L18
        L13:
            n5.v$o r0 = new n5.v$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14149q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14150r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f14148p
            n5.p r5 = (n5.p) r5
            java.lang.Object r6 = r0.f14147o
            n5.i0 r6 = (n5.i0) r6
            java.lang.Object r2 = r0.f14146n
            java.util.Collection r2 = (java.util.Collection) r2
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            v3.e1.n(r7)
            n5.p r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f14146n = r7     // Catch: java.lang.Throwable -> L35
            r0.f14147o = r6     // Catch: java.lang.Throwable -> L35
            r0.f14148p = r5     // Catch: java.lang.Throwable -> L35
            r0.f14150r = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
        L6d:
            r7 = r2
            goto L4a
        L6f:
            v3.m2 r5 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            n5.s.b(r6, r5)
            return r2
        L76:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            n5.s.b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.u(n5.i0, java.util.Collection, e4.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007d A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:76:0x0062, B:80:0x0075, B:82:0x007d, B:84:0x0083, B:88:0x0096, B:75:0x005e), top: B:100:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0096 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #2 {all -> 0x009d, blocks: (B:76:0x0062, B:80:0x0075, B:82:0x007d, B:84:0x0083, B:88:0x0096, B:75:0x005e), top: B:100:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [n5.m0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8, types: [n5.i0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0092 -> B:76:0x0062). Please submit an issue!!! */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object v(n5.i0 r6, n5.m0 r7, e4.d r8) {
        /*
            boolean r0 = r8 instanceof n5.v.p
            if (r0 == 0) goto L13
            r0 = r8
            n5.v$p r0 = (n5.v.p) r0
            int r1 = r0.f14155r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14155r = r1
            goto L18
        L13:
            n5.v$p r0 = new n5.v$p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14154q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14155r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.f14153p
            n5.p r6 = (n5.p) r6
            java.lang.Object r7 = r0.f14152o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r2 = r0.f14151n
            n5.m0 r2 = (n5.m0) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L59
            r8 = r6
            r6 = r7
            r7 = r2
            goto L62
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.f14153p
            n5.p r6 = (n5.p) r6
            java.lang.Object r7 = r0.f14152o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r2 = r0.f14151n
            n5.m0 r2 = (n5.m0) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L59
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r2
        L56:
            r2 = r1
            r1 = r5
            goto L75
        L59:
            r6 = move-exception
            goto La1
        L5b:
            v3.e1.n(r8)
            n5.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L9d
        L62:
            r0.f14151n = r7     // Catch: java.lang.Throwable -> L9d
            r0.f14152o = r6     // Catch: java.lang.Throwable -> L9d
            r0.f14153p = r8     // Catch: java.lang.Throwable -> L9d
            r0.f14155r = r4     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> L9d
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L56
        L75:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L9d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L96
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L92
            r1.f14151n = r7     // Catch: java.lang.Throwable -> L9d
            r1.f14152o = r6     // Catch: java.lang.Throwable -> L9d
            r1.f14153p = r0     // Catch: java.lang.Throwable -> L9d
            r1.f14155r = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r8 = r7.z(r8, r1)     // Catch: java.lang.Throwable -> L9d
            if (r8 != r2) goto L92
            return r2
        L92:
            r8 = r0
            r0 = r1
            r1 = r2
            goto L62
        L96:
            v3.m2 r8 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L9d
            r8 = 0
            n5.s.b(r6, r8)
            return r7
        L9d:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r8 = move-exception
            n5.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.v(n5.i0, n5.m0, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object w(n5.i0 r5, e4.d r6) {
        /*
            boolean r0 = r6 instanceof n5.v.q
            if (r0 == 0) goto L13
            r0 = r6
            n5.v$q r0 = (n5.v.q) r0
            int r1 = r0.f14159q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14159q = r1
            goto L18
        L13:
            n5.v$q r0 = new n5.v$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14158p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14159q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f14157o
            n5.p r5 = (n5.p) r5
            java.lang.Object r0 = r0.f14156n
            n5.i0 r0 = (n5.i0) r0
            v3.e1.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            v3.e1.n(r6)
            n5.p r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6c
            r0.f14156n = r5     // Catch: java.lang.Throwable -> L6c
            r0.f14157o = r6     // Catch: java.lang.Throwable -> L6c
            r0.f14159q = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r6.b(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L64
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            r6 = 0
            n5.s.b(r0, r6)
            return r5
        L64:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L31
        L6c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L70
        L70:
            r6 = move-exception
            n5.s.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.w(n5.i0, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:55:0x002d, B:66:0x0053, B:71:0x0060), top: B:80:0x002d }] */
    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object x(n5.i0 r5, e4.d r6) {
        /*
            boolean r0 = r6 instanceof n5.v.r
            if (r0 == 0) goto L13
            r0 = r6
            n5.v$r r0 = (n5.v.r) r0
            int r1 = r0.f14163q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14163q = r1
            goto L18
        L13:
            n5.v$r r0 = new n5.v$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14162p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14163q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f14161o
            n5.p r5 = (n5.p) r5
            java.lang.Object r0 = r0.f14160n
            n5.i0 r0 = (n5.i0) r0
            v3.e1.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            v3.e1.n(r6)
            n5.p r6 = r5.iterator()     // Catch: java.lang.Throwable -> L68
            r0.f14160n = r5     // Catch: java.lang.Throwable -> L68
            r0.f14161o = r6     // Catch: java.lang.Throwable -> L68
            r0.f14163q = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r6.b(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r6 != 0) goto L60
            n5.s.b(r0, r1)
            return r1
        L60:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            n5.s.b(r0, r1)
            return r5
        L68:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6b:
            throw r5     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            n5.s.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.x(n5.i0, e4.d):java.lang.Object");
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n5.i0 y(n5.i0 i0Var, e4.g gVar, t4.p pVar) {
        return n5.e0.f(e2.f11962k, gVar, 0, null, n5.s.g(i0Var), new s(i0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ n5.i0 z(n5.i0 i0Var, e4.g gVar, t4.p pVar, int i7, Object obj) {
        n5.i0 y6;
        if ((i7 & 1) != 0) {
            gVar = m1.g();
        }
        y6 = y(i0Var, gVar, pVar);
        return y6;
    }
}
