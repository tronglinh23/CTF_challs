package kotlinx.coroutines;
@i2
/* loaded from: classes.dex */
public abstract class a<T> extends v2 implements n2, e4.d<T>, u0 {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final e4.g f11838l;

    public a(@n6.d e4.g gVar, boolean z6, boolean z7) {
        super(z7);
        if (z6) {
            Y0((n2) gVar.e(n2.f12920c));
        }
        this.f11838l = gVar.t(this);
    }

    public static /* synthetic */ void I1() {
    }

    @Override // e4.d
    public final void D(@n6.d Object obj) {
        Object h12 = h1(k0.d(obj, null, 1, null));
        if (h12 == w2.f13153b) {
            return;
        }
        H1(h12);
    }

    public void H1(@n6.e Object obj) {
        j0(obj);
    }

    @Override // kotlinx.coroutines.u0
    @n6.d
    public e4.g I() {
        return this.f11838l;
    }

    public void J1(@n6.d Throwable th, boolean z6) {
    }

    public void K1(T t6) {
    }

    public final <R> void L1(@n6.d w0 w0Var, R r6, @n6.d t4.p<? super R, ? super e4.d<? super T>, ? extends Object> pVar) {
        w0Var.e(pVar, r6, this);
    }

    @Override // kotlinx.coroutines.v2
    public final void X0(@n6.d Throwable th) {
        r0.b(this.f11838l, th);
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.n2
    public boolean d() {
        return super.d();
    }

    @Override // e4.d
    @n6.d
    public final e4.g g() {
        return this.f11838l;
    }

    @Override // kotlinx.coroutines.v2
    @n6.d
    public String j1() {
        String b7 = n0.b(this.f11838l);
        if (b7 == null) {
            return super.j1();
        }
        return i5.h0.f11093b + b7 + "\":" + super.j1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.v2
    public final void p1(@n6.e Object obj) {
        if (!(obj instanceof e0)) {
            K1(obj);
            return;
        }
        e0 e0Var = (e0) obj;
        J1(e0Var.f11961a, e0Var.a());
    }

    @Override // kotlinx.coroutines.v2
    @n6.d
    public String y0() {
        return z0.a(this) + " was cancelled";
    }
}
