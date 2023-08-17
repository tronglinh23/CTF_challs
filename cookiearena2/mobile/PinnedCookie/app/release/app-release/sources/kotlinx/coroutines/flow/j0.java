package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.p1;
import v3.d1;
import v3.m2;
/* loaded from: classes.dex */
public class j0<T> extends p5.b<l0> implements d0<T>, kotlinx.coroutines.flow.c<T>, p5.r<T> {

    /* renamed from: o  reason: collision with root package name */
    public final int f12236o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12237p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final n5.m f12238q;
    @n6.e

    /* renamed from: r  reason: collision with root package name */
    public Object[] f12239r;

    /* renamed from: s  reason: collision with root package name */
    public long f12240s;

    /* renamed from: t  reason: collision with root package name */
    public long f12241t;

    /* renamed from: u  reason: collision with root package name */
    public int f12242u;

    /* renamed from: v  reason: collision with root package name */
    public int f12243v;

    /* loaded from: classes.dex */
    public static final class a implements p1 {
        @n6.d
        @s4.e

        /* renamed from: k  reason: collision with root package name */
        public final j0<?> f12244k;
        @s4.e

        /* renamed from: l  reason: collision with root package name */
        public long f12245l;
        @s4.e
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public final Object f12246m;
        @n6.d
        @s4.e

        /* renamed from: n  reason: collision with root package name */
        public final e4.d<m2> f12247n;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@n6.d j0<?> j0Var, long j7, @n6.e Object obj, @n6.d e4.d<? super m2> dVar) {
            this.f12244k = j0Var;
            this.f12245l = j7;
            this.f12246m = obj;
            this.f12247n = dVar;
        }

        @Override // kotlinx.coroutines.p1
        public void j() {
            this.f12244k.F(this);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12248a;

        static {
            int[] iArr = new int[n5.m.values().length];
            iArr[n5.m.SUSPEND.ordinal()] = 1;
            iArr[n5.m.DROP_LATEST.ordinal()] = 2;
            iArr[n5.m.DROP_OLDEST.ordinal()] = 3;
            f12248a = iArr;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes.dex */
    public static final class c extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12249n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12250o;

        /* renamed from: p  reason: collision with root package name */
        public Object f12251p;

        /* renamed from: q  reason: collision with root package name */
        public Object f12252q;

        /* renamed from: r  reason: collision with root package name */
        public /* synthetic */ Object f12253r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ j0<T> f12254s;

        /* renamed from: t  reason: collision with root package name */
        public int f12255t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j0<T> j0Var, e4.d<? super c> dVar) {
            super(dVar);
            this.f12254s = j0Var;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12253r = obj;
            this.f12255t |= Integer.MIN_VALUE;
            return j0.H(this.f12254s, null, this);
        }
    }

    public j0(int i7, int i8, @n6.d n5.m mVar) {
        this.f12236o = i7;
        this.f12237p = i8;
        this.f12238q = mVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object H(kotlinx.coroutines.flow.j0 r8, kotlinx.coroutines.flow.j r9, e4.d r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.H(kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
    }

    public static /* synthetic */ Object M(j0 j0Var, Object obj, e4.d dVar) {
        Object N;
        return (!j0Var.k(obj) && (N = j0Var.N(obj, dVar)) == g4.d.h()) ? N : m2.f17815a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long R() {
        return Math.min(this.f12241t, this.f12240s);
    }

    public static /* synthetic */ void T() {
    }

    public final Object E(l0 l0Var, e4.d<? super m2> dVar) {
        m2 m2Var;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(g4.c.d(dVar), 1);
        rVar.x();
        synchronized (this) {
            if (b0(l0Var) < 0) {
                l0Var.f12328b = rVar;
            } else {
                d1.a aVar = d1.f17778l;
                rVar.D(d1.b(m2.f17815a));
            }
            m2Var = m2.f17815a;
        }
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A == g4.d.h() ? A : m2Var;
    }

    public final void F(a aVar) {
        synchronized (this) {
            if (aVar.f12245l < R()) {
                return;
            }
            Object[] objArr = this.f12239r;
            u4.l0.m(objArr);
            if (k0.c(objArr, aVar.f12245l) != aVar) {
                return;
            }
            k0.d(objArr, aVar.f12245l, k0.f12257a);
            G();
            m2 m2Var = m2.f17815a;
        }
    }

    public final void G() {
        if (this.f12237p != 0 || this.f12243v > 1) {
            Object[] objArr = this.f12239r;
            u4.l0.m(objArr);
            while (this.f12243v > 0 && k0.c(objArr, (R() + X()) - 1) == k0.f12257a) {
                this.f12243v--;
                k0.d(objArr, R() + X(), null);
            }
        }
    }

    public final void I(long j7) {
        p5.d[] e7;
        if (p5.b.d(this) != 0 && (e7 = p5.b.e(this)) != null) {
            for (p5.d dVar : e7) {
                if (dVar != null) {
                    l0 l0Var = (l0) dVar;
                    long j8 = l0Var.f12327a;
                    if (j8 >= 0 && j8 < j7) {
                        l0Var.f12327a = j7;
                    }
                }
            }
        }
        this.f12241t = j7;
    }

    @Override // p5.b
    @n6.d
    /* renamed from: J  reason: merged with bridge method [inline-methods] */
    public l0 i() {
        return new l0();
    }

    @Override // p5.b
    @n6.d
    /* renamed from: K  reason: merged with bridge method [inline-methods] */
    public l0[] l(int i7) {
        return new l0[i7];
    }

    public final void L() {
        Object[] objArr = this.f12239r;
        u4.l0.m(objArr);
        k0.d(objArr, R(), null);
        this.f12242u--;
        long R = R() + 1;
        if (this.f12240s < R) {
            this.f12240s = R;
        }
        if (this.f12241t < R) {
            I(R);
        }
    }

    public final Object N(T t6, e4.d<? super m2> dVar) {
        e4.d<m2>[] dVarArr;
        a aVar;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(g4.c.d(dVar), 1);
        rVar.x();
        e4.d<m2>[] dVarArr2 = p5.c.f14842a;
        synchronized (this) {
            if (Z(t6)) {
                d1.a aVar2 = d1.f17778l;
                rVar.D(d1.b(m2.f17815a));
                dVarArr = P(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, X() + R(), t6, rVar);
                O(aVar3);
                this.f12243v++;
                if (this.f12237p == 0) {
                    dVarArr2 = P(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.t.a(rVar, aVar);
        }
        for (e4.d<m2> dVar2 : dVarArr) {
            if (dVar2 != null) {
                d1.a aVar4 = d1.f17778l;
                dVar2.D(d1.b(m2.f17815a));
            }
        }
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A == g4.d.h() ? A : m2.f17815a;
    }

    public final void O(Object obj) {
        int X = X();
        Object[] objArr = this.f12239r;
        if (objArr == null) {
            objArr = Y(null, 0, 2);
        } else if (X >= objArr.length) {
            objArr = Y(objArr, X, objArr.length * 2);
        }
        k0.d(objArr, R() + X, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final e4.d<m2>[] P(e4.d<m2>[] dVarArr) {
        p5.d[] e7;
        l0 l0Var;
        e4.d<? super m2> dVar;
        int length = dVarArr.length;
        if (p5.b.d(this) != 0 && (e7 = p5.b.e(this)) != null) {
            int length2 = e7.length;
            int i7 = 0;
            dVarArr = dVarArr;
            while (i7 < length2) {
                p5.d dVar2 = e7[i7];
                if (dVar2 != null && (dVar = (l0Var = (l0) dVar2).f12328b) != null && b0(l0Var) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        u4.l0.o(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    l0Var.f12328b = null;
                    length++;
                }
                i7++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long Q() {
        return R() + this.f12242u;
    }

    public final T S() {
        Object[] objArr = this.f12239r;
        u4.l0.m(objArr);
        return (T) k0.c(objArr, (this.f12240s + W()) - 1);
    }

    public final Object U(long j7) {
        Object[] objArr = this.f12239r;
        u4.l0.m(objArr);
        Object c7 = k0.c(objArr, j7);
        return c7 instanceof a ? ((a) c7).f12246m : c7;
    }

    public final long V() {
        return R() + this.f12242u + this.f12243v;
    }

    public final int W() {
        return (int) ((R() + this.f12242u) - this.f12240s);
    }

    public final int X() {
        return this.f12242u + this.f12243v;
    }

    public final Object[] Y(Object[] objArr, int i7, int i8) {
        if (i8 > 0) {
            Object[] objArr2 = new Object[i8];
            this.f12239r = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long R = R();
            for (int i9 = 0; i9 < i7; i9++) {
                long j7 = i9 + R;
                k0.d(objArr2, j7, k0.c(objArr, j7));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean Z(T t6) {
        if (o() == 0) {
            return a0(t6);
        }
        if (this.f12242u >= this.f12237p && this.f12241t <= this.f12240s) {
            int i7 = b.f12248a[this.f12238q.ordinal()];
            if (i7 == 1) {
                return false;
            }
            if (i7 == 2) {
                return true;
            }
        }
        O(t6);
        int i8 = this.f12242u + 1;
        this.f12242u = i8;
        if (i8 > this.f12237p) {
            L();
        }
        if (W() > this.f12236o) {
            d0(this.f12240s + 1, this.f12241t, Q(), V());
        }
        return true;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<?> dVar) {
        return H(this, jVar, dVar);
    }

    public final boolean a0(T t6) {
        if (this.f12236o == 0) {
            return true;
        }
        O(t6);
        int i7 = this.f12242u + 1;
        this.f12242u = i7;
        if (i7 > this.f12236o) {
            L();
        }
        this.f12241t = R() + this.f12242u;
        return true;
    }

    @Override // kotlinx.coroutines.flow.i0
    @n6.d
    public List<T> b() {
        synchronized (this) {
            int W = W();
            if (W == 0) {
                return x3.w.E();
            }
            ArrayList arrayList = new ArrayList(W);
            Object[] objArr = this.f12239r;
            u4.l0.m(objArr);
            for (int i7 = 0; i7 < W; i7++) {
                arrayList.add(k0.c(objArr, this.f12240s + i7));
            }
            return arrayList;
        }
    }

    public final long b0(l0 l0Var) {
        long j7 = l0Var.f12327a;
        if (j7 < Q()) {
            return j7;
        }
        if (this.f12237p <= 0 && j7 <= R() && this.f12243v != 0) {
            return j7;
        }
        return -1L;
    }

    @Override // p5.r
    @n6.d
    public i<T> c(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return k0.e(this, gVar, i7, mVar);
    }

    public final Object c0(l0 l0Var) {
        Object obj;
        e4.d<m2>[] dVarArr = p5.c.f14842a;
        synchronized (this) {
            long b02 = b0(l0Var);
            if (b02 < 0) {
                obj = k0.f12257a;
            } else {
                long j7 = l0Var.f12327a;
                Object U = U(b02);
                l0Var.f12327a = b02 + 1;
                dVarArr = e0(j7);
                obj = U;
            }
        }
        for (e4.d<m2> dVar : dVarArr) {
            if (dVar != null) {
                d1.a aVar = d1.f17778l;
                dVar.D(d1.b(m2.f17815a));
            }
        }
        return obj;
    }

    public final void d0(long j7, long j8, long j9, long j10) {
        long min = Math.min(j8, j7);
        for (long R = R(); R < min; R++) {
            Object[] objArr = this.f12239r;
            u4.l0.m(objArr);
            k0.d(objArr, R, null);
        }
        this.f12240s = j7;
        this.f12241t = j8;
        this.f12242u = (int) (j9 - min);
        this.f12243v = (int) (j10 - j9);
    }

    @n6.d
    public final e4.d<m2>[] e0(long j7) {
        long j8;
        long j9;
        long j10;
        p5.d[] e7;
        if (j7 > this.f12241t) {
            return p5.c.f14842a;
        }
        long R = R();
        long j11 = this.f12242u + R;
        if (this.f12237p == 0 && this.f12243v > 0) {
            j11++;
        }
        if (p5.b.d(this) != 0 && (e7 = p5.b.e(this)) != null) {
            for (p5.d dVar : e7) {
                if (dVar != null) {
                    long j12 = ((l0) dVar).f12327a;
                    if (j12 >= 0 && j12 < j11) {
                        j11 = j12;
                    }
                }
            }
        }
        if (j11 <= this.f12241t) {
            return p5.c.f14842a;
        }
        long Q = Q();
        int min = o() > 0 ? Math.min(this.f12243v, this.f12237p - ((int) (Q - j11))) : this.f12243v;
        e4.d<m2>[] dVarArr = p5.c.f14842a;
        long j13 = this.f12243v + Q;
        if (min > 0) {
            dVarArr = new e4.d[min];
            Object[] objArr = this.f12239r;
            u4.l0.m(objArr);
            long j14 = Q;
            int i7 = 0;
            while (true) {
                if (Q >= j13) {
                    j8 = j11;
                    j9 = j13;
                    break;
                }
                Object c7 = k0.c(objArr, Q);
                j8 = j11;
                kotlinx.coroutines.internal.r0 r0Var = k0.f12257a;
                if (c7 == r0Var) {
                    j9 = j13;
                    j10 = 1;
                } else if (c7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                } else {
                    a aVar = (a) c7;
                    int i8 = i7 + 1;
                    j9 = j13;
                    dVarArr[i7] = aVar.f12247n;
                    k0.d(objArr, Q, r0Var);
                    k0.d(objArr, j14, aVar.f12246m);
                    j10 = 1;
                    j14++;
                    if (i8 >= min) {
                        break;
                    }
                    i7 = i8;
                }
                Q += j10;
                j11 = j8;
                j13 = j9;
            }
            Q = j14;
        } else {
            j8 = j11;
            j9 = j13;
        }
        int i9 = (int) (Q - R);
        long j15 = o() == 0 ? Q : j8;
        long max = Math.max(this.f12240s, Q - Math.min(this.f12236o, i9));
        if (this.f12237p == 0 && max < j9) {
            Object[] objArr2 = this.f12239r;
            u4.l0.m(objArr2);
            if (u4.l0.g(k0.c(objArr2, max), k0.f12257a)) {
                Q++;
                max++;
            }
        }
        d0(max, j15, Q, j9);
        G();
        return (dVarArr.length == 0) ^ true ? P(dVarArr) : dVarArr;
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @n6.e
    public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
        return M(this, t6, dVar);
    }

    public final long f0() {
        long j7 = this.f12240s;
        if (j7 < this.f12241t) {
            this.f12241t = j7;
        }
        return j7;
    }

    @Override // kotlinx.coroutines.flow.d0
    public void j() {
        synchronized (this) {
            d0(Q(), this.f12241t, Q(), V());
            m2 m2Var = m2.f17815a;
        }
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean k(T t6) {
        int i7;
        boolean z6;
        e4.d<m2>[] dVarArr = p5.c.f14842a;
        synchronized (this) {
            if (Z(t6)) {
                dVarArr = P(dVarArr);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (e4.d<m2> dVar : dVarArr) {
            if (dVar != null) {
                d1.a aVar = d1.f17778l;
                dVar.D(d1.b(m2.f17815a));
            }
        }
        return z6;
    }
}
