package kotlinx.coroutines;

import e4.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.n2;
import u4.k1;
@v3.k(level = v3.m.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes.dex */
public class v2 implements n2, y, f3, kotlinx.coroutines.selects.c {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13129k = AtomicReferenceFieldUpdater.newUpdater(v2.class, Object.class, "_state");
    @n6.d
    private volatile /* synthetic */ Object _parentHandle;
    @n6.d
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes.dex */
    public static final class a<T> extends r<T> {
        @n6.d

        /* renamed from: s  reason: collision with root package name */
        public final v2 f13130s;

        public a(@n6.d e4.d<? super T> dVar, @n6.d v2 v2Var) {
            super(dVar, 1);
            this.f13130s = v2Var;
        }

        @Override // kotlinx.coroutines.r
        @n6.d
        public String I() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.r
        @n6.d
        public Throwable z(@n6.d n2 n2Var) {
            Throwable e7;
            Object V0 = this.f13130s.V0();
            return (!(V0 instanceof c) || (e7 = ((c) V0).e()) == null) ? V0 instanceof e0 ? ((e0) V0).f11961a : n2Var.w0() : e7;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u2 {
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public final v2 f13131o;
        @n6.d

        /* renamed from: p  reason: collision with root package name */
        public final c f13132p;
        @n6.d

        /* renamed from: q  reason: collision with root package name */
        public final x f13133q;
        @n6.e

        /* renamed from: r  reason: collision with root package name */
        public final Object f13134r;

        public b(@n6.d v2 v2Var, @n6.d c cVar, @n6.d x xVar, @n6.e Object obj) {
            this.f13131o = v2Var;
            this.f13132p = cVar;
            this.f13133q = xVar;
            this.f13134r = obj;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
            X0(th);
            return v3.m2.f17815a;
        }

        @Override // kotlinx.coroutines.g0
        public void X0(@n6.e Throwable th) {
            this.f13131o.B0(this.f13132p, this.f13133q, this.f13134r);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g2 {
        @n6.d
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @n6.d
        private volatile /* synthetic */ int _isCompleting;
        @n6.d
        private volatile /* synthetic */ Object _rootCause;
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final a3 f13135k;

        public c(@n6.d a3 a3Var, boolean z6, @n6.e Throwable th) {
            this.f13135k = a3Var;
            this._isCompleting = z6 ? 1 : 0;
            this._rootCause = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@n6.d Throwable th) {
            Throwable e7 = e();
            if (e7 == null) {
                l(th);
            } else if (th == e7) {
            } else {
                Object c7 = c();
                if (c7 == null) {
                    k(th);
                } else if (c7 instanceof Throwable) {
                    if (th == c7) {
                        return;
                    }
                    ArrayList<Throwable> b7 = b();
                    b7.add(c7);
                    b7.add(th);
                    k(b7);
                } else if (c7 instanceof ArrayList) {
                    ((ArrayList) c7).add(th);
                } else {
                    throw new IllegalStateException(("State is " + c7).toString());
                }
            }
        }

        public final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        public final Object c() {
            return this._exceptionsHolder;
        }

        @Override // kotlinx.coroutines.g2
        public boolean d() {
            return e() == null;
        }

        @n6.e
        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            kotlinx.coroutines.internal.r0 r0Var;
            Object c7 = c();
            r0Var = w2.f13159h;
            return c7 == r0Var;
        }

        @n6.d
        public final List<Throwable> i(@n6.e Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.r0 r0Var;
            Object c7 = c();
            if (c7 == null) {
                arrayList = b();
            } else if (c7 instanceof Throwable) {
                ArrayList<Throwable> b7 = b();
                b7.add(c7);
                arrayList = b7;
            } else if (!(c7 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + c7).toString());
            } else {
                arrayList = (ArrayList) c7;
            }
            Throwable e7 = e();
            if (e7 != null) {
                arrayList.add(0, e7);
            }
            if (th != null && !u4.l0.g(th, e7)) {
                arrayList.add(th);
            }
            r0Var = w2.f13159h;
            k(r0Var);
            return arrayList;
        }

        public final void j(boolean z6) {
            this._isCompleting = z6 ? 1 : 0;
        }

        @Override // kotlinx.coroutines.g2
        @n6.d
        public a3 j0() {
            return this.f13135k;
        }

        public final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void l(@n6.e Throwable th) {
            this._rootCause = th;
        }

        @n6.d
        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + c() + ", list=" + j0() + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v2 f13136d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f13137e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.y yVar, v2 v2Var, Object obj) {
            super(yVar);
            this.f13136d = v2Var;
            this.f13137e = obj;
        }

        @Override // kotlinx.coroutines.internal.d
        @n6.e
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public Object i(@n6.d kotlinx.coroutines.internal.y yVar) {
            if (this.f13136d.V0() == this.f13137e) {
                return null;
            }
            return kotlinx.coroutines.internal.x.a();
        }
    }

    @h4.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class e extends h4.k implements t4.p<f5.o<? super n2>, e4.d<? super v3.m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f13138m;

        /* renamed from: n  reason: collision with root package name */
        public Object f13139n;

        /* renamed from: o  reason: collision with root package name */
        public int f13140o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f13141p;

        public e(e4.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<v3.m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f13141p = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r7.f13140o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f13139n
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
                java.lang.Object r3 = r7.f13138m
                kotlinx.coroutines.internal.w r3 = (kotlinx.coroutines.internal.w) r3
                java.lang.Object r4 = r7.f13141p
                f5.o r4 = (f5.o) r4
                v3.e1.n(r8)
                r8 = r7
                goto L7e
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                v3.e1.n(r8)
                goto L83
            L2b:
                v3.e1.n(r8)
                java.lang.Object r8 = r7.f13141p
                f5.o r8 = (f5.o) r8
                kotlinx.coroutines.v2 r1 = kotlinx.coroutines.v2.this
                java.lang.Object r1 = r1.V0()
                boolean r4 = r1 instanceof kotlinx.coroutines.x
                if (r4 == 0) goto L49
                kotlinx.coroutines.x r1 = (kotlinx.coroutines.x) r1
                kotlinx.coroutines.y r1 = r1.f13162o
                r7.f13140o = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L83
                return r0
            L49:
                boolean r3 = r1 instanceof kotlinx.coroutines.g2
                if (r3 == 0) goto L83
                kotlinx.coroutines.g2 r1 = (kotlinx.coroutines.g2) r1
                kotlinx.coroutines.a3 r1 = r1.j0()
                if (r1 == 0) goto L83
                java.lang.Object r3 = r1.I0()
                kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L60:
                boolean r5 = u4.l0.g(r1, r3)
                if (r5 != 0) goto L83
                boolean r5 = r1 instanceof kotlinx.coroutines.x
                if (r5 == 0) goto L7e
                r5 = r1
                kotlinx.coroutines.x r5 = (kotlinx.coroutines.x) r5
                kotlinx.coroutines.y r5 = r5.f13162o
                r8.f13141p = r4
                r8.f13138m = r3
                r8.f13139n = r1
                r8.f13140o = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L7e
                return r0
            L7e:
                kotlinx.coroutines.internal.y r1 = r1.J0()
                goto L60
            L83:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.v2.e.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super n2> oVar, @n6.e e4.d<? super v3.m2> dVar) {
            return ((e) H(oVar, dVar)).Q(v3.m2.f17815a);
        }
    }

    public v2(boolean z6) {
        this._state = z6 ? w2.f13161j : w2.f13160i;
        this._parentHandle = null;
    }

    public static /* synthetic */ CancellationException A1(v2 v2Var, Throwable th, String str, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            return v2Var.z1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public static /* synthetic */ o2 G0(v2 v2Var, String str, Throwable th, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            if ((i7 & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = v2Var.y0();
            }
            return new o2(str, th, v2Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    private final /* synthetic */ <T extends u2> void n1(a3 a3Var, Throwable th) {
        h0 h0Var = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) a3Var.I0(); !u4.l0.g(yVar, a3Var); yVar = yVar.J0()) {
            u4.l0.y(3, "T");
            if (yVar instanceof kotlinx.coroutines.internal.y) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.X0(th);
                } catch (Throwable th2) {
                    if (h0Var != null) {
                        v3.p.a(h0Var, th2);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th2);
                        v3.m2 m2Var = v3.m2.f17815a;
                    }
                }
            }
        }
        if (h0Var != null) {
            X0(h0Var);
        }
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public n2 A(@n6.d n2 n2Var) {
        return n2.a.i(this, n2Var);
    }

    public final void A0(g2 g2Var, Object obj) {
        w S0 = S0();
        if (S0 != null) {
            S0.j();
            w1(c3.f11860k);
        }
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        Throwable th = e0Var != null ? e0Var.f11961a : null;
        if (!(g2Var instanceof u2)) {
            a3 j02 = g2Var.j0();
            if (j02 != null) {
                m1(j02, th);
                return;
            }
            return;
        }
        try {
            ((u2) g2Var).X0(th);
        } catch (Throwable th2) {
            X0(new h0("Exception in completion handler " + g2Var + " for " + this, th2));
        }
    }

    public final void B0(c cVar, x xVar, Object obj) {
        x k12 = k1(xVar);
        if (k12 == null || !G1(cVar, k12, obj)) {
            j0(H0(cVar, obj));
        }
    }

    @n6.d
    @i2
    public final String B1() {
        return j1() + '{' + y1(V0()) + '}';
    }

    @Override // kotlinx.coroutines.y
    public final void C0(@n6.d f3 f3Var) {
        s0(f3Var);
    }

    public final boolean C1(g2 g2Var, Object obj) {
        if (p.b.a(f13129k, this, g2Var, w2.g(obj))) {
            o1(null);
            p1(obj);
            A0(g2Var, obj);
            return true;
        }
        return false;
    }

    public final Throwable D0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new o2(y0(), null, this) : th;
        } else if (obj != null) {
            return ((f3) obj).q0();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    public final boolean D1(g2 g2Var, Throwable th) {
        a3 R0 = R0(g2Var);
        if (R0 == null) {
            return false;
        }
        if (p.b.a(f13129k, this, g2Var, new c(R0, false, th))) {
            l1(R0, th);
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.n2
    @n6.e
    public final Object E0(@n6.d e4.d<? super v3.m2> dVar) {
        if (c1()) {
            Object d12 = d1(dVar);
            return d12 == g4.d.h() ? d12 : v3.m2.f17815a;
        }
        r2.z(dVar.g());
        return v3.m2.f17815a;
    }

    public final Object E1(Object obj, Object obj2) {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        if (!(obj instanceof g2)) {
            r0Var2 = w2.f13152a;
            return r0Var2;
        } else if ((!(obj instanceof s1) && !(obj instanceof u2)) || (obj instanceof x) || (obj2 instanceof e0)) {
            return F1((g2) obj, obj2);
        } else {
            if (C1((g2) obj, obj2)) {
                return obj2;
            }
            r0Var = w2.f13154c;
            return r0Var;
        }
    }

    @n6.d
    public final o2 F0(@n6.e String str, @n6.e Throwable th) {
        if (str == null) {
            str = y0();
        }
        return new o2(str, th, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object F1(g2 g2Var, Object obj) {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        a3 R0 = R0(g2Var);
        if (R0 == null) {
            r0Var3 = w2.f13154c;
            return r0Var3;
        }
        c cVar = g2Var instanceof c ? (c) g2Var : null;
        if (cVar == null) {
            cVar = new c(R0, false, null);
        }
        k1.h hVar = new k1.h();
        synchronized (cVar) {
            if (cVar.g()) {
                r0Var2 = w2.f13152a;
                return r0Var2;
            }
            cVar.j(true);
            if (cVar != g2Var && !p.b.a(f13129k, this, g2Var, cVar)) {
                r0Var = w2.f13154c;
                return r0Var;
            }
            boolean f7 = cVar.f();
            e0 e0Var = obj instanceof e0 ? (e0) obj : null;
            if (e0Var != null) {
                cVar.a(e0Var.f11961a);
            }
            ?? e7 = Boolean.valueOf(f7 ? false : true).booleanValue() ? cVar.e() : 0;
            hVar.f17436k = e7;
            v3.m2 m2Var = v3.m2.f17815a;
            if (e7 != 0) {
                l1(R0, e7);
            }
            x J0 = J0(g2Var);
            return (J0 == null || !G1(cVar, J0, obj)) ? H0(cVar, obj) : w2.f13153b;
        }
    }

    public final boolean G1(c cVar, x xVar, Object obj) {
        while (n2.a.f(xVar.f13162o, false, false, new b(this, cVar, xVar, obj), 1, null) == c3.f11860k) {
            xVar = k1(xVar);
            if (xVar == null) {
                return false;
            }
        }
        return true;
    }

    public final Object H0(c cVar, Object obj) {
        boolean f7;
        Throwable O0;
        u4.w wVar = null;
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        Throwable th = e0Var != null ? e0Var.f11961a : null;
        synchronized (cVar) {
            f7 = cVar.f();
            List<Throwable> i7 = cVar.i(th);
            O0 = O0(cVar, i7);
            if (O0 != null) {
                i0(O0, i7);
            }
        }
        if (O0 != null && O0 != th) {
            obj = new e0(O0, r3, 2, wVar);
        }
        if (O0 != null) {
            if (x0(O0) || W0(O0)) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((e0) obj).b();
            }
        }
        if (!f7) {
            o1(O0);
        }
        p1(obj);
        p.b.a(f13129k, this, cVar, w2.g(obj));
        A0(cVar, obj);
        return obj;
    }

    public final x J0(g2 g2Var) {
        x xVar = g2Var instanceof x ? (x) g2Var : null;
        if (xVar == null) {
            a3 j02 = g2Var.j0();
            if (j02 != null) {
                return k1(j02);
            }
            return null;
        }
        return xVar;
    }

    @n6.e
    public final Object K0() {
        Object V0 = V0();
        if ((!(V0 instanceof g2)) == true) {
            if (V0 instanceof e0) {
                throw ((e0) V0).f11961a;
            }
            return w2.o(V0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @n6.e
    public final Throwable L0() {
        Object V0 = V0();
        if (V0 instanceof c) {
            Throwable e7 = ((c) V0).e();
            if (e7 != null) {
                return e7;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(V0 instanceof g2)) {
            if (V0 instanceof e0) {
                return ((e0) V0).f11961a;
            }
            return null;
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final boolean M0() {
        Object V0 = V0();
        return (V0 instanceof e0) && ((e0) V0).a();
    }

    public final Throwable N0(Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            return e0Var.f11961a;
        }
        return null;
    }

    public final Throwable O0(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new o2(y0(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((!(((Throwable) obj) instanceof CancellationException)) != false) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof y3) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof y3)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // kotlinx.coroutines.selects.c
    public final <R> void P(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.l<? super e4.d<? super R>, ? extends Object> lVar) {
        Object V0;
        do {
            V0 = V0();
            if (fVar.p0()) {
                return;
            }
            if (!(V0 instanceof g2)) {
                if (fVar.S()) {
                    q5.b.c(lVar, fVar.h());
                    return;
                }
                return;
            }
        } while (x1(V0) != 0);
        fVar.i0(X(new n3(fVar, lVar)));
    }

    public boolean P0() {
        return true;
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public final f5.m<n2> Q() {
        return f5.q.b(new e(null));
    }

    public boolean Q0() {
        return false;
    }

    @n6.e
    public final Throwable R() {
        Object V0 = V0();
        if ((!(V0 instanceof g2)) == true) {
            return N0(V0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final a3 R0(g2 g2Var) {
        a3 j02 = g2Var.j0();
        if (j02 == null) {
            if (g2Var instanceof s1) {
                return new a3();
            }
            if (g2Var instanceof u2) {
                s1((u2) g2Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + g2Var).toString());
        }
        return j02;
    }

    @n6.e
    public final w S0() {
        return (w) this._parentHandle;
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public final w T0(@n6.d y yVar) {
        return (w) n2.a.f(this, true, false, new x(yVar), 2, null);
    }

    @n6.e
    public final Object V0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.j0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.j0) obj).c(this);
        }
    }

    public boolean W0(@n6.d Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public final p1 X(@n6.d t4.l<? super Throwable, v3.m2> lVar) {
        return p0(false, true, lVar);
    }

    public void X0(@n6.d Throwable th) {
        throw th;
    }

    public final void Y0(@n6.e n2 n2Var) {
        if (n2Var == null) {
            w1(c3.f11860k);
            return;
        }
        n2Var.start();
        w T0 = n2Var.T0(this);
        w1(T0);
        if (l()) {
            T0.j();
            w1(c3.f11860k);
        }
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public final kotlinx.coroutines.selects.c Z() {
        return this;
    }

    public final boolean Z0(g2 g2Var) {
        return (g2Var instanceof c) && ((c) g2Var).f();
    }

    @Override // e4.g.b, e4.g
    @n6.d
    public e4.g a(@n6.d g.c<?> cVar) {
        return n2.a.g(this, cVar);
    }

    public final boolean a1() {
        return V0() instanceof e0;
    }

    @Override // kotlinx.coroutines.n2
    @v3.k(level = v3.m.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean b(Throwable th) {
        Throwable o2Var;
        if (th == null || (o2Var = A1(this, th, null, 1, null)) == null) {
            o2Var = new o2(y0(), null, this);
        }
        u0(o2Var);
        return true;
    }

    public boolean b1() {
        return false;
    }

    public final boolean c1() {
        Object V0;
        do {
            V0 = V0();
            if (!(V0 instanceof g2)) {
                return false;
            }
        } while (x1(V0) < 0);
        return true;
    }

    @Override // kotlinx.coroutines.n2
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        n2.a.a(this);
    }

    @Override // kotlinx.coroutines.n2
    public boolean d() {
        Object V0 = V0();
        return (V0 instanceof g2) && ((g2) V0).d();
    }

    public final Object d1(e4.d<? super v3.m2> dVar) {
        r rVar = new r(g4.c.d(dVar), 1);
        rVar.x();
        t.a(rVar, X(new i3(rVar)));
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A == g4.d.h() ? A : v3.m2.f17815a;
    }

    @Override // e4.g.b, e4.g
    @n6.e
    public <E extends g.b> E e(@n6.d g.c<E> cVar) {
        return (E) n2.a.e(this, cVar);
    }

    public final Void e1(t4.l<Object, v3.m2> lVar) {
        while (true) {
            lVar.O(V0());
        }
    }

    @Override // kotlinx.coroutines.n2
    public void f(@n6.e CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o2(y0(), null, this);
        }
        u0(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u4.w] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.v2] */
    public final Object f1(Object obj) {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        kotlinx.coroutines.internal.r0 r0Var4;
        kotlinx.coroutines.internal.r0 r0Var5;
        kotlinx.coroutines.internal.r0 r0Var6;
        Throwable th = null;
        while (true) {
            Object V0 = V0();
            if (V0 instanceof c) {
                synchronized (V0) {
                    if (((c) V0).h()) {
                        r0Var2 = w2.f13155d;
                        return r0Var2;
                    }
                    boolean f7 = ((c) V0).f();
                    if (obj != null || !f7) {
                        if (th == null) {
                            th = D0(obj);
                        }
                        ((c) V0).a(th);
                    }
                    r0 = f7 ^ true ? ((c) V0).e() : 0;
                    if (r0 != 0) {
                        l1(((c) V0).j0(), r0);
                    }
                    r0Var = w2.f13152a;
                    return r0Var;
                }
            } else if (!(V0 instanceof g2)) {
                r0Var3 = w2.f13155d;
                return r0Var3;
            } else {
                if (th == null) {
                    th = D0(obj);
                }
                g2 g2Var = (g2) V0;
                if (!g2Var.d()) {
                    Object E1 = E1(V0, new e0(th, false, 2, r0));
                    r0Var5 = w2.f13152a;
                    if (E1 == r0Var5) {
                        throw new IllegalStateException(("Cannot happen in " + V0).toString());
                    }
                    r0Var6 = w2.f13154c;
                    if (E1 != r0Var6) {
                        return E1;
                    }
                } else if (D1(g2Var, th)) {
                    r0Var4 = w2.f13152a;
                    return r0Var4;
                }
            }
        }
    }

    public final boolean g1(@n6.e Object obj) {
        Object E1;
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        do {
            E1 = E1(V0(), obj);
            r0Var = w2.f13152a;
            if (E1 == r0Var) {
                return false;
            }
            if (E1 == w2.f13153b) {
                return true;
            }
            r0Var2 = w2.f13154c;
        } while (E1 == r0Var2);
        j0(E1);
        return true;
    }

    @Override // e4.g.b
    @n6.d
    public final g.c<?> getKey() {
        return n2.f12920c;
    }

    public final boolean h0(Object obj, a3 a3Var, u2 u2Var) {
        int V0;
        d dVar = new d(u2Var, this, obj);
        do {
            V0 = a3Var.K0().V0(u2Var, a3Var, dVar);
            if (V0 == 1) {
                return true;
            }
        } while (V0 != 2);
        return false;
    }

    @n6.e
    public final Object h1(@n6.e Object obj) {
        Object E1;
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        do {
            E1 = E1(V0(), obj);
            r0Var = w2.f13152a;
            if (E1 == r0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, N0(obj));
            }
            r0Var2 = w2.f13154c;
        } while (E1 == r0Var2);
        return E1;
    }

    public final void i0(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                v3.p.a(th, th2);
            }
        }
    }

    public final u2 i1(t4.l<? super Throwable, v3.m2> lVar, boolean z6) {
        u2 u2Var;
        if (z6) {
            u2Var = lVar instanceof p2 ? (p2) lVar : null;
            if (u2Var == null) {
                u2Var = new l2(lVar);
            }
        } else {
            u2Var = lVar instanceof u2 ? (u2) lVar : null;
            if (u2Var == null) {
                u2Var = new m2(lVar);
            }
        }
        u2Var.Z0(this);
        return u2Var;
    }

    @Override // kotlinx.coroutines.n2
    public final boolean isCancelled() {
        Object V0 = V0();
        return (V0 instanceof e0) || ((V0 instanceof c) && ((c) V0).f());
    }

    public void j0(@n6.e Object obj) {
    }

    @n6.d
    public String j1() {
        return z0.a(this);
    }

    @Override // e4.g.b, e4.g
    public <R> R k(R r6, @n6.d t4.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) n2.a.d(this, r6, pVar);
    }

    public final x k1(kotlinx.coroutines.internal.y yVar) {
        while (yVar.N0()) {
            yVar = yVar.K0();
        }
        while (true) {
            yVar = yVar.J0();
            if (!yVar.N0()) {
                if (yVar instanceof x) {
                    return (x) yVar;
                }
                if (yVar instanceof a3) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.n2
    public final boolean l() {
        return !(V0() instanceof g2);
    }

    @n6.e
    public final Object l0(@n6.d e4.d<Object> dVar) {
        Object V0;
        do {
            V0 = V0();
            if (!(V0 instanceof g2)) {
                if (V0 instanceof e0) {
                    throw ((e0) V0).f11961a;
                }
                return w2.o(V0);
            }
        } while (x1(V0) < 0);
        return n0(dVar);
    }

    public final void l1(a3 a3Var, Throwable th) {
        o1(th);
        h0 h0Var = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) a3Var.I0(); !u4.l0.g(yVar, a3Var); yVar = yVar.J0()) {
            if (yVar instanceof p2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.X0(th);
                } catch (Throwable th2) {
                    if (h0Var != null) {
                        v3.p.a(h0Var, th2);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th2);
                        v3.m2 m2Var = v3.m2.f17815a;
                    }
                }
            }
        }
        if (h0Var != null) {
            X0(h0Var);
        }
        x0(th);
    }

    public final void m1(a3 a3Var, Throwable th) {
        h0 h0Var = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) a3Var.I0(); !u4.l0.g(yVar, a3Var); yVar = yVar.J0()) {
            if (yVar instanceof u2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.X0(th);
                } catch (Throwable th2) {
                    if (h0Var != null) {
                        v3.p.a(h0Var, th2);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th2);
                        v3.m2 m2Var = v3.m2.f17815a;
                    }
                }
            }
        }
        if (h0Var != null) {
            X0(h0Var);
        }
    }

    public final Object n0(e4.d<Object> dVar) {
        a aVar = new a(g4.c.d(dVar), this);
        aVar.x();
        t.a(aVar, X(new h3(aVar)));
        Object A = aVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A;
    }

    public final boolean o0(@n6.e Throwable th) {
        return s0(th);
    }

    public void o1(@n6.e Throwable th) {
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public final p1 p0(boolean z6, boolean z7, @n6.d t4.l<? super Throwable, v3.m2> lVar) {
        u2 i12 = i1(lVar, z6);
        while (true) {
            Object V0 = V0();
            if (V0 instanceof s1) {
                s1 s1Var = (s1) V0;
                if (!s1Var.d()) {
                    r1(s1Var);
                } else if (p.b.a(f13129k, this, V0, i12)) {
                    return i12;
                }
            } else {
                if (!(V0 instanceof g2)) {
                    if (z7) {
                        e0 e0Var = V0 instanceof e0 ? (e0) V0 : null;
                        lVar.O(e0Var != null ? e0Var.f11961a : null);
                    }
                    return c3.f11860k;
                }
                a3 j02 = ((g2) V0).j0();
                if (j02 != null) {
                    p1 p1Var = c3.f11860k;
                    if (z6 && (V0 instanceof c)) {
                        synchronized (V0) {
                            r3 = ((c) V0).e();
                            if (r3 == null || ((lVar instanceof x) && !((c) V0).g())) {
                                if (h0(V0, j02, i12)) {
                                    if (r3 == null) {
                                        return i12;
                                    }
                                    p1Var = i12;
                                }
                            }
                            v3.m2 m2Var = v3.m2.f17815a;
                        }
                    }
                    if (r3 != null) {
                        if (z7) {
                            lVar.O(r3);
                        }
                        return p1Var;
                    } else if (h0(V0, j02, i12)) {
                        return i12;
                    }
                } else if (V0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                } else {
                    s1((u2) V0);
                }
            }
        }
    }

    public void p1(@n6.e Object obj) {
    }

    @Override // kotlinx.coroutines.f3
    @n6.d
    public CancellationException q0() {
        Throwable th;
        Object V0 = V0();
        if (V0 instanceof c) {
            th = ((c) V0).e();
        } else if (V0 instanceof e0) {
            th = ((e0) V0).f11961a;
        } else if (V0 instanceof g2) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + V0).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            return new o2("Parent job is " + y1(V0), th, this);
        }
        return cancellationException;
    }

    public void q1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.f2] */
    public final void r1(s1 s1Var) {
        a3 a3Var = new a3();
        if (!s1Var.d()) {
            a3Var = new f2(a3Var);
        }
        p.b.a(f13129k, this, s1Var, a3Var);
    }

    public final boolean s0(@n6.e Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        obj2 = w2.f13152a;
        if (Q0() && (obj2 = v0(obj)) == w2.f13153b) {
            return true;
        }
        r0Var = w2.f13152a;
        if (obj2 == r0Var) {
            obj2 = f1(obj);
        }
        r0Var2 = w2.f13152a;
        if (obj2 == r0Var2 || obj2 == w2.f13153b) {
            return true;
        }
        r0Var3 = w2.f13155d;
        if (obj2 == r0Var3) {
            return false;
        }
        j0(obj2);
        return true;
    }

    public final void s1(u2 u2Var) {
        u2Var.C0(new a3());
        p.b.a(f13129k, this, u2Var, u2Var.J0());
    }

    @Override // kotlinx.coroutines.n2
    public final boolean start() {
        int x12;
        do {
            x12 = x1(V0());
            if (x12 == 0) {
                return false;
            }
        } while (x12 != 1);
        return true;
    }

    @Override // e4.g
    @n6.d
    public e4.g t(@n6.d e4.g gVar) {
        return n2.a.h(this, gVar);
    }

    public final <T, R> void t1(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        Object V0;
        do {
            V0 = V0();
            if (fVar.p0()) {
                return;
            }
            if (!(V0 instanceof g2)) {
                if (fVar.S()) {
                    if (V0 instanceof e0) {
                        fVar.H(((e0) V0).f11961a);
                        return;
                    } else {
                        q5.b.d(pVar, w2.o(V0), fVar.h());
                        return;
                    }
                }
                return;
            }
        } while (x1(V0) != 0);
        fVar.i0(X(new m3(fVar, pVar)));
    }

    @n6.d
    public String toString() {
        return B1() + '@' + z0.b(this);
    }

    public void u0(@n6.d Throwable th) {
        s0(th);
    }

    public final void u1(@n6.d u2 u2Var) {
        Object V0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s1 s1Var;
        do {
            V0 = V0();
            if (!(V0 instanceof u2)) {
                if (!(V0 instanceof g2) || ((g2) V0).j0() == null) {
                    return;
                }
                u2Var.Q0();
                return;
            } else if (V0 != u2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f13129k;
                s1Var = w2.f13161j;
            }
        } while (!p.b.a(atomicReferenceFieldUpdater, this, V0, s1Var));
    }

    public final Object v0(Object obj) {
        kotlinx.coroutines.internal.r0 r0Var;
        Object E1;
        kotlinx.coroutines.internal.r0 r0Var2;
        do {
            Object V0 = V0();
            if (!(V0 instanceof g2) || ((V0 instanceof c) && ((c) V0).g())) {
                r0Var = w2.f13152a;
                return r0Var;
            }
            E1 = E1(V0, new e0(D0(obj), false, 2, null));
            r0Var2 = w2.f13154c;
        } while (E1 == r0Var2);
        return E1;
    }

    public final <T, R> void v1(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        Object V0 = V0();
        if (V0 instanceof e0) {
            fVar.H(((e0) V0).f11961a);
        } else {
            q5.a.f(pVar, w2.o(V0), fVar.h(), null, 4, null);
        }
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public final CancellationException w0() {
        Object V0 = V0();
        if (!(V0 instanceof c)) {
            if (V0 instanceof g2) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            } else if (V0 instanceof e0) {
                return A1(this, ((e0) V0).f11961a, null, 1, null);
            } else {
                return new o2(z0.a(this) + " has completed normally", null, this);
            }
        }
        Throwable e7 = ((c) V0).e();
        if (e7 != null) {
            CancellationException z12 = z1(e7, z0.a(this) + " is cancelling");
            if (z12 != null) {
                return z12;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final void w1(@n6.e w wVar) {
        this._parentHandle = wVar;
    }

    public final boolean x0(Throwable th) {
        if (b1()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        w S0 = S0();
        return (S0 == null || S0 == c3.f11860k) ? z6 : S0.a0(th) || z6;
    }

    public final int x1(Object obj) {
        s1 s1Var;
        if (!(obj instanceof s1)) {
            if (obj instanceof f2) {
                if (p.b.a(f13129k, this, obj, ((f2) obj).j0())) {
                    q1();
                    return 1;
                }
                return -1;
            }
            return 0;
        } else if (((s1) obj).d()) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13129k;
            s1Var = w2.f13161j;
            if (p.b.a(atomicReferenceFieldUpdater, this, obj, s1Var)) {
                q1();
                return 1;
            }
            return -1;
        }
    }

    @n6.d
    public String y0() {
        return "Job was cancelled";
    }

    public final String y1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof g2 ? ((g2) obj).d() ? "Active" : "New" : obj instanceof e0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public boolean z0(@n6.d Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s0(th) && P0();
    }

    @n6.d
    public final CancellationException z1(@n6.d Throwable th, @n6.e String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = y0();
            }
            cancellationException = new o2(str, th, this);
        }
        return cancellationException;
    }
}
