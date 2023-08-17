package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v3.m2;
/* loaded from: classes.dex */
public final class e<T> extends p5.e<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12217p = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed");
    @n6.d
    private volatile /* synthetic */ int consumed;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final n5.i0<T> f12218n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f12219o;

    public /* synthetic */ e(n5.i0 i0Var, boolean z6, e4.g gVar, int i7, n5.m mVar, int i8, u4.w wVar) {
        this(i0Var, z6, (i8 & 4) != 0 ? e4.i.f8770k : gVar, (i8 & 8) != 0 ? -3 : i7, (i8 & 16) != 0 ? n5.m.SUSPEND : mVar);
    }

    @Override // p5.e, kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
        if (this.f14844l != -3) {
            Object a7 = super.a(jVar, dVar);
            return a7 == g4.d.h() ? a7 : m2.f17815a;
        }
        p();
        Object e7 = m.e(jVar, this.f12218n, this.f12219o, dVar);
        return e7 == g4.d.h() ? e7 : m2.f17815a;
    }

    @Override // p5.e
    @n6.d
    public String d() {
        return "channel=" + this.f12218n;
    }

    @Override // p5.e
    @n6.e
    public Object g(@n6.d n5.g0<? super T> g0Var, @n6.d e4.d<? super m2> dVar) {
        Object e7 = m.e(new p5.y(g0Var), this.f12218n, this.f12219o, dVar);
        return e7 == g4.d.h() ? e7 : m2.f17815a;
    }

    @Override // p5.e
    @n6.d
    public p5.e<T> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return new e(this.f12218n, this.f12219o, gVar, i7, mVar);
    }

    @Override // p5.e
    @n6.d
    public i<T> l() {
        return new e(this.f12218n, this.f12219o, null, 0, null, 28, null);
    }

    @Override // p5.e
    @n6.d
    public n5.i0<T> o(@n6.d kotlinx.coroutines.u0 u0Var) {
        p();
        return this.f14844l == -3 ? this.f12218n : super.o(u0Var);
    }

    public final void p() {
        if (this.f12219o) {
            if (!(f12217p.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@n6.d n5.i0<? extends T> i0Var, boolean z6, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        super(gVar, i7, mVar);
        this.f12218n = i0Var;
        this.f12219o = z6;
        this.consumed = 0;
    }
}
