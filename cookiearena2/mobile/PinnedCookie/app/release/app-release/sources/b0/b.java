package b0;

import c0.r;
import u.p;
import u.s;
/* loaded from: classes.dex */
public class b extends r {

    /* renamed from: a  reason: collision with root package name */
    public s f7138a;

    /* renamed from: b  reason: collision with root package name */
    public p f7139b;

    /* renamed from: c  reason: collision with root package name */
    public u.r f7140c;

    public b() {
        s sVar = new s();
        this.f7138a = sVar;
        this.f7140c = sVar;
    }

    @Override // c0.r
    public float a() {
        return this.f7140c.a();
    }

    public void b(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        s sVar = this.f7138a;
        this.f7140c = sVar;
        sVar.f(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public String c(String desc, float time) {
        return this.f7140c.b(desc, time);
    }

    public float d(float x6) {
        return this.f7140c.d(x6);
    }

    public boolean e() {
        return this.f7140c.c();
    }

    public void f(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.f7139b == null) {
            this.f7139b = new p();
        }
        p pVar = this.f7139b;
        this.f7140c = pVar;
        pVar.h(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    @Override // c0.r, android.animation.TimeInterpolator
    public float getInterpolation(float v6) {
        return this.f7140c.getInterpolation(v6);
    }
}
