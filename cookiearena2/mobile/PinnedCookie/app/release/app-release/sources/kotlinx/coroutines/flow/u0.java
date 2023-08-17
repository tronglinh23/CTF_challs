package kotlinx.coroutines.flow;

import java.util.List;
import u.v;
import v3.m2;
/* loaded from: classes.dex */
public final class u0<T> extends p5.b<w0> implements e0<T>, c<T>, p5.r<T> {
    @n6.d
    private volatile /* synthetic */ Object _state;

    /* renamed from: o  reason: collision with root package name */
    public int f12526o;

    @h4.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, v.c.f17155d}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12527n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12528o;

        /* renamed from: p  reason: collision with root package name */
        public Object f12529p;

        /* renamed from: q  reason: collision with root package name */
        public Object f12530q;

        /* renamed from: r  reason: collision with root package name */
        public Object f12531r;

        /* renamed from: s  reason: collision with root package name */
        public /* synthetic */ Object f12532s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ u0<T> f12533t;

        /* renamed from: u  reason: collision with root package name */
        public int f12534u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0<T> u0Var, e4.d<? super a> dVar) {
            super(dVar);
            this.f12533t = u0Var;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12532s = obj;
            this.f12534u |= Integer.MIN_VALUE;
            return this.f12533t.a(null, this);
        }
    }

    public u0(@n6.d Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void t() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (u4.l0.g(r11, r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [p5.d] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d4 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e6 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r11, @n6.d e4.d<?> r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u0.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.i0
    @n6.d
    public List<T> b() {
        return x3.v.k(getValue());
    }

    @Override // p5.r
    @n6.d
    public i<T> c(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return v0.d(this, gVar, i7, mVar);
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @n6.e
    public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
        setValue(t6);
        return m2.f17815a;
    }

    @Override // kotlinx.coroutines.flow.e0, kotlinx.coroutines.flow.t0
    public T getValue() {
        kotlinx.coroutines.internal.r0 r0Var = p5.u.f14964a;
        T t6 = (T) this._state;
        if (t6 == r0Var) {
            return null;
        }
        return t6;
    }

    @Override // kotlinx.coroutines.flow.e0
    public boolean h(T t6, T t7) {
        if (t6 == null) {
            t6 = (T) p5.u.f14964a;
        }
        if (t7 == null) {
            t7 = (T) p5.u.f14964a;
        }
        return u(t6, t7);
    }

    @Override // kotlinx.coroutines.flow.d0
    public void j() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean k(T t6) {
        setValue(t6);
        return true;
    }

    @Override // p5.b
    @n6.d
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public w0 i() {
        return new w0();
    }

    @Override // p5.b
    @n6.d
    /* renamed from: s  reason: merged with bridge method [inline-methods] */
    public w0[] l(int i7) {
        return new w0[i7];
    }

    @Override // kotlinx.coroutines.flow.e0
    public void setValue(T t6) {
        if (t6 == null) {
            t6 = (T) p5.u.f14964a;
        }
        u(null, t6);
    }

    public final boolean u(Object obj, Object obj2) {
        int i7;
        w0[] p6;
        p();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !u4.l0.g(obj3, obj)) {
                return false;
            }
            if (u4.l0.g(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i8 = this.f12526o;
            if ((i8 & 1) != 0) {
                this.f12526o = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f12526o = i9;
            w0[] p7 = p();
            m2 m2Var = m2.f17815a;
            while (true) {
                w0[] w0VarArr = p7;
                if (w0VarArr != null) {
                    for (w0 w0Var : w0VarArr) {
                        if (w0Var != null) {
                            w0Var.f();
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f12526o;
                    if (i7 == i9) {
                        this.f12526o = i9 + 1;
                        return true;
                    }
                    p6 = p();
                    m2 m2Var2 = m2.f17815a;
                }
                p7 = p6;
                i9 = i7;
            }
        }
    }
}
