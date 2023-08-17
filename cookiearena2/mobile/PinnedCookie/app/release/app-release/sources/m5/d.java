package m5;

import android.os.Handler;
import android.os.Looper;
import d5.u;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.r2;
import t4.l;
import u4.l0;
import u4.n0;
import u4.w;
import v3.m2;
/* loaded from: classes.dex */
public final class d extends e implements e1 {
    @n6.e
    private volatile d _immediate;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final Handler f13548m;
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public final String f13549n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f13550o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final d f13551p;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ q f13552k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ d f13553l;

        public a(q qVar, d dVar) {
            this.f13552k = qVar;
            this.f13553l = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13552k.r(this.f13553l, m2.f17815a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements l<Throwable, m2> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Runnable f13555m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.f13555m = runnable;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.e Throwable th) {
            d.this.f13548m.removeCallbacks(this.f13555m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u4.w] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public d(Handler handler, String str, boolean z6) {
        super(0);
        this.f13548m = handler;
        this.f13549n = str;
        this.f13550o = z6;
        this._immediate = z6 ? this : 0;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f13551p = dVar;
    }

    public static final void h1(d dVar, Runnable runnable) {
        dVar.f13548m.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        if (this.f13548m.post(runnable)) {
            return;
        }
        f1(gVar, runnable);
    }

    @Override // kotlinx.coroutines.o0
    public boolean X0(@n6.d e4.g gVar) {
        return (this.f13550o && l0.g(Looper.myLooper(), this.f13548m.getLooper())) ? false : true;
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof d) && ((d) obj).f13548m == this.f13548m;
    }

    public final void f1(e4.g gVar, Runnable runnable) {
        r2.f(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m1.c().V0(gVar, runnable);
    }

    @Override // m5.e
    @n6.d
    /* renamed from: g1  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d c1() {
        return this.f13551p;
    }

    public int hashCode() {
        return System.identityHashCode(this.f13548m);
    }

    @Override // kotlinx.coroutines.e1
    public void m(long j7, @n6.d q<? super m2> qVar) {
        a aVar = new a(qVar, this);
        if (this.f13548m.postDelayed(aVar, u.C(j7, 4611686018427387903L))) {
            qVar.N(new b(aVar));
        } else {
            f1(qVar.g(), aVar);
        }
    }

    @Override // kotlinx.coroutines.z2, kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        String b12 = b1();
        if (b12 == null) {
            String str = this.f13549n;
            if (str == null) {
                str = this.f13548m.toString();
            }
            if (this.f13550o) {
                return str + ".immediate";
            }
            return str;
        }
        return b12;
    }

    @Override // m5.e, kotlinx.coroutines.e1
    @n6.d
    public p1 z0(long j7, @n6.d final Runnable runnable, @n6.d e4.g gVar) {
        if (this.f13548m.postDelayed(runnable, u.C(j7, 4611686018427387903L))) {
            return new p1() { // from class: m5.c
                @Override // kotlinx.coroutines.p1
                public final void j() {
                    d.h1(d.this, runnable);
                }
            };
        }
        f1(gVar, runnable);
        return c3.f11860k;
    }

    public /* synthetic */ d(Handler handler, String str, int i7, w wVar) {
        this(handler, (i7 & 2) != 0 ? null : str);
    }

    public d(@n6.d Handler handler, @n6.e String str) {
        this(handler, str, false);
    }
}
