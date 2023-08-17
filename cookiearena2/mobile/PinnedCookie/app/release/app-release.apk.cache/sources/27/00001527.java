package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b0<E> {

    /* renamed from: h  reason: collision with root package name */
    public static final int f12765h = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final int f12766i = 30;

    /* renamed from: j  reason: collision with root package name */
    public static final int f12767j = 1073741823;

    /* renamed from: k  reason: collision with root package name */
    public static final int f12768k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final long f12769l = 1073741823;

    /* renamed from: m  reason: collision with root package name */
    public static final int f12770m = 30;

    /* renamed from: n  reason: collision with root package name */
    public static final long f12771n = 1152921503533105152L;

    /* renamed from: o  reason: collision with root package name */
    public static final int f12772o = 60;

    /* renamed from: p  reason: collision with root package name */
    public static final long f12773p = 1152921504606846976L;

    /* renamed from: q  reason: collision with root package name */
    public static final int f12774q = 61;

    /* renamed from: r  reason: collision with root package name */
    public static final long f12775r = 2305843009213693952L;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12776s = 1024;

    /* renamed from: u  reason: collision with root package name */
    public static final int f12778u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f12779v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12780w = 2;
    @n6.d
    private volatile /* synthetic */ Object _next = null;
    @n6.d
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f12781a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12782b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12783c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f12784d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final a f12762e = new a(null);
    @n6.d
    @s4.e

    /* renamed from: t  reason: collision with root package name */
    public static final r0 f12777t = new r0("REMOVE_FROZEN");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12763f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f12764g = AtomicLongFieldUpdater.newUpdater(b0.class, "_state");

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public final int a(long j7) {
            return (j7 & b0.f12775r) != 0 ? 2 : 1;
        }

        public final long b(long j7, int i7) {
            return e(j7, b0.f12769l) | (i7 << 0);
        }

        public final long c(long j7, int i7) {
            return e(j7, b0.f12771n) | (i7 << 30);
        }

        public final <T> T d(long j7, @n6.d t4.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.J(Integer.valueOf((int) ((b0.f12769l & j7) >> 0)), Integer.valueOf((int) ((j7 & b0.f12771n) >> 30)));
        }

        public final long e(long j7, long j8) {
            return j7 & (~j8);
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @s4.e

        /* renamed from: a  reason: collision with root package name */
        public final int f12785a;

        public b(int i7) {
            this.f12785a = i7;
        }
    }

    public b0(int i7, boolean z6) {
        this.f12781a = i7;
        this.f12782b = z6;
        int i8 = i7 - 1;
        this.f12783c = i8;
        this.f12784d = new AtomicReferenceArray(i7);
        if (!(i8 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i7 & i8) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(@n6.d E r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.b0$a r13 = kotlinx.coroutines.internal.b0.f12762e
            int r13 = r13.a(r2)
            return r13
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f12783c
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L2e
            return r5
        L2e:
            boolean r1 = r12.f12782b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f12784d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L4d
            int r1 = r12.f12781a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L4c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L0
        L4c:
            return r5
        L4d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.b0.f12764g
            kotlinx.coroutines.internal.b0$a r4 = kotlinx.coroutines.internal.b0.f12762e
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f12784d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L68:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L7b
            kotlinx.coroutines.internal.b0 r0 = r0.k()
            kotlinx.coroutines.internal.b0 r0 = r0.e(r9, r13)
            if (r0 != 0) goto L68
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.b0.a(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0<E> b(long j7) {
        b0<E> b0Var = new b0<>(this.f12781a * 2, this.f12782b);
        int i7 = (int) ((f12769l & j7) >> 0);
        int i8 = (int) ((f12771n & j7) >> 30);
        while (true) {
            int i9 = this.f12783c;
            if ((i7 & i9) == (i8 & i9)) {
                b0Var._state = f12762e.e(j7, f12773p);
                return b0Var;
            }
            Object obj = this.f12784d.get(i9 & i7);
            if (obj == null) {
                obj = new b(i7);
            }
            b0Var.f12784d.set(b0Var.f12783c & i7, obj);
            i7++;
        }
    }

    public final b0<E> c(long j7) {
        while (true) {
            b0<E> b0Var = (b0) this._next;
            if (b0Var != null) {
                return b0Var;
            }
            p.b.a(f12763f, this, null, b(j7));
        }
    }

    public final boolean d() {
        long j7;
        do {
            j7 = this._state;
            if ((j7 & f12775r) != 0) {
                return true;
            }
            if ((f12773p & j7) != 0) {
                return false;
            }
        } while (!f12764g.compareAndSet(this, j7, j7 | f12775r));
        return true;
    }

    public final b0<E> e(int i7, E e7) {
        Object obj = this.f12784d.get(this.f12783c & i7);
        if ((obj instanceof b) && ((b) obj).f12785a == i7) {
            this.f12784d.set(i7 & this.f12783c, e7);
            return this;
        }
        return null;
    }

    public final int f() {
        long j7 = this._state;
        return (((int) ((j7 & f12771n) >> 30)) - ((int) ((f12769l & j7) >> 0))) & f12767j;
    }

    public final boolean g() {
        return (this._state & f12775r) != 0;
    }

    public final boolean h() {
        long j7 = this._state;
        return ((int) ((f12769l & j7) >> 0)) == ((int) ((j7 & f12771n) >> 30));
    }

    @n6.d
    public final <R> List<R> i(@n6.d t4.l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f12781a);
        long j7 = this._state;
        int i7 = (int) ((f12769l & j7) >> 0);
        int i8 = (int) ((j7 & f12771n) >> 30);
        while (true) {
            int i9 = this.f12783c;
            if ((i7 & i9) == (i8 & i9)) {
                return arrayList;
            }
            Object obj = (Object) this.f12784d.get(i9 & i7);
            if (obj != 0 && !(obj instanceof b)) {
                arrayList.add(lVar.O(obj));
            }
            i7++;
        }
    }

    public final long j() {
        long j7;
        long j8;
        do {
            j7 = this._state;
            if ((j7 & f12773p) != 0) {
                return j7;
            }
            j8 = j7 | f12773p;
        } while (!f12764g.compareAndSet(this, j7, j8));
        return j8;
    }

    @n6.d
    public final b0<E> k() {
        return c(j());
    }

    @n6.e
    public final Object l() {
        while (true) {
            long j7 = this._state;
            if ((f12773p & j7) != 0) {
                return f12777t;
            }
            int i7 = (int) ((f12769l & j7) >> 0);
            int i8 = (int) ((f12771n & j7) >> 30);
            int i9 = this.f12783c;
            if ((i8 & i9) == (i7 & i9)) {
                return null;
            }
            Object obj = this.f12784d.get(i9 & i7);
            if (obj == null) {
                if (this.f12782b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i10 = (i7 + 1) & f12767j;
                if (f12764g.compareAndSet(this, j7, f12762e.b(j7, i10))) {
                    this.f12784d.set(this.f12783c & i7, null);
                    return obj;
                } else if (this.f12782b) {
                    b0<E> b0Var = this;
                    do {
                        b0Var = b0Var.m(i7, i10);
                    } while (b0Var != null);
                    return obj;
                }
            }
        }
    }

    public final b0<E> m(int i7, int i8) {
        long j7;
        int i9;
        do {
            j7 = this._state;
            i9 = (int) ((f12769l & j7) >> 0);
            if ((f12773p & j7) != 0) {
                return k();
            }
        } while (!f12764g.compareAndSet(this, j7, f12762e.b(j7, i8)));
        this.f12784d.set(i9 & this.f12783c, null);
        return null;
    }
}