package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.b;

/* loaded from: classes.dex */
public final class g extends b<g> {
    public static final float J = Float.MAX_VALUE;
    public h G;
    public float H;
    public boolean I;

    public g(e eVar) {
        super(eVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    public boolean A() {
        return this.G.f4017b > androidx.cardview.widget.g.f1896q;
    }

    public h B() {
        return this.G;
    }

    public final void C() {
        h hVar = this.G;
        if (hVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d7 = hVar.d();
        if (d7 > this.f3989g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d7 < this.f3990h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public g D(h hVar) {
        this.G = hVar;
        return this;
    }

    public void E() {
        if (!A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f3988f) {
            this.I = true;
        }
    }

    @Override // androidx.dynamicanimation.animation.b
    public float f(float f7, float f8) {
        return this.G.b(f7, f8);
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean j(float f7, float f8) {
        return this.G.a(f7, f8);
    }

    @Override // androidx.dynamicanimation.animation.b
    public void v(float f7) {
    }

    @Override // androidx.dynamicanimation.animation.b
    public void w() {
        C();
        this.G.j(i());
        super.w();
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean y(long j7) {
        if (this.I) {
            float f7 = this.H;
            if (f7 != Float.MAX_VALUE) {
                this.G.h(f7);
                this.H = Float.MAX_VALUE;
            }
            this.f3984b = this.G.d();
            this.f3983a = 0.0f;
            this.I = false;
            return true;
        }
        if (this.H != Float.MAX_VALUE) {
            this.G.d();
            long j8 = j7 / 2;
            b.p k7 = this.G.k(this.f3984b, this.f3983a, j8);
            this.G.h(this.H);
            this.H = Float.MAX_VALUE;
            b.p k8 = this.G.k(k7.f3997a, k7.f3998b, j8);
            this.f3984b = k8.f3997a;
            this.f3983a = k8.f3998b;
        } else {
            b.p k9 = this.G.k(this.f3984b, this.f3983a, j7);
            this.f3984b = k9.f3997a;
            this.f3983a = k9.f3998b;
        }
        float max = Math.max(this.f3984b, this.f3990h);
        this.f3984b = max;
        float min = Math.min(max, this.f3989g);
        this.f3984b = min;
        if (j(min, this.f3983a)) {
            this.f3984b = this.G.d();
            this.f3983a = 0.0f;
            return true;
        }
        return false;
    }

    public void z(float f7) {
        if (k()) {
            this.H = f7;
            return;
        }
        if (this.G == null) {
            this.G = new h(f7);
        }
        this.G.h(f7);
        w();
    }

    public <K> g(K k7, d<K> dVar) {
        super(k7, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    public <K> g(K k7, d<K> dVar, float f7) {
        super(k7, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
        this.G = new h(f7);
    }
}