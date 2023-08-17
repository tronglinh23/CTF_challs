package i6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class t extends q0 {
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public q0 f11282f;

    public t(@n6.d q0 q0Var) {
        u4.l0.p(q0Var, "delegate");
        this.f11282f = q0Var;
    }

    @Override // i6.q0
    @n6.d
    public q0 a() {
        return this.f11282f.a();
    }

    @Override // i6.q0
    @n6.d
    public q0 b() {
        return this.f11282f.b();
    }

    @Override // i6.q0
    public long d() {
        return this.f11282f.d();
    }

    @Override // i6.q0
    @n6.d
    public q0 e(long j7) {
        return this.f11282f.e(j7);
    }

    @Override // i6.q0
    public boolean f() {
        return this.f11282f.f();
    }

    @Override // i6.q0
    public void h() throws IOException {
        this.f11282f.h();
    }

    @Override // i6.q0
    @n6.d
    public q0 i(long j7, @n6.d TimeUnit timeUnit) {
        u4.l0.p(timeUnit, "unit");
        return this.f11282f.i(j7, timeUnit);
    }

    @Override // i6.q0
    public long j() {
        return this.f11282f.j();
    }

    @s4.h(name = "delegate")
    @n6.d
    public final q0 l() {
        return this.f11282f;
    }

    @n6.d
    public final t m(@n6.d q0 q0Var) {
        u4.l0.p(q0Var, "delegate");
        this.f11282f = q0Var;
        return this;
    }

    public final /* synthetic */ void n(@n6.d q0 q0Var) {
        u4.l0.p(q0Var, "<set-?>");
        this.f11282f = q0Var;
    }
}