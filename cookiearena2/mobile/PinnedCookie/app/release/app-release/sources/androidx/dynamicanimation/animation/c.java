package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.b;
import d.x;
/* loaded from: classes.dex */
public final class c extends b<c> {
    public final a G;

    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: d  reason: collision with root package name */
        public static final float f3999d = -4.2f;

        /* renamed from: e  reason: collision with root package name */
        public static final float f4000e = 62.5f;

        /* renamed from: b  reason: collision with root package name */
        public float f4002b;

        /* renamed from: a  reason: collision with root package name */
        public float f4001a = -4.2f;

        /* renamed from: c  reason: collision with root package name */
        public final b.p f4003c = new b.p();

        @Override // androidx.dynamicanimation.animation.f
        public boolean a(float f7, float f8) {
            return Math.abs(f8) < this.f4002b;
        }

        @Override // androidx.dynamicanimation.animation.f
        public float b(float f7, float f8) {
            return f8 * this.f4001a;
        }

        public float c() {
            return this.f4001a / (-4.2f);
        }

        public void d(float f7) {
            this.f4001a = f7 * (-4.2f);
        }

        public void e(float f7) {
            this.f4002b = f7 * 62.5f;
        }

        public b.p f(float f7, float f8, long j7) {
            float f9 = (float) j7;
            this.f4003c.f3998b = (float) (f8 * Math.exp((f9 / 1000.0f) * this.f4001a));
            b.p pVar = this.f4003c;
            float f10 = this.f4001a;
            pVar.f3997a = (float) ((f7 - (f8 / f10)) + ((f8 / f10) * Math.exp((f10 * f9) / 1000.0f)));
            b.p pVar2 = this.f4003c;
            if (a(pVar2.f3997a, pVar2.f3998b)) {
                this.f4003c.f3998b = 0.0f;
            }
            return this.f4003c;
        }
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c A(@x(from = 0.0d, fromInclusive = false) float f7) {
        if (f7 > 0.0f) {
            this.G.d(f7);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // androidx.dynamicanimation.animation.b
    /* renamed from: B  reason: merged with bridge method [inline-methods] */
    public c p(float f7) {
        super.p(f7);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* renamed from: C  reason: merged with bridge method [inline-methods] */
    public c q(float f7) {
        super.q(f7);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* renamed from: D  reason: merged with bridge method [inline-methods] */
    public c u(float f7) {
        super.u(f7);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public float f(float f7, float f8) {
        return this.G.b(f7, f8);
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean j(float f7, float f8) {
        return f7 >= this.f3989g || f7 <= this.f3990h || this.G.a(f7, f8);
    }

    @Override // androidx.dynamicanimation.animation.b
    public void v(float f7) {
        this.G.e(f7);
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean y(long j7) {
        b.p f7 = this.G.f(this.f3984b, this.f3983a, j7);
        float f8 = f7.f3997a;
        this.f3984b = f8;
        float f9 = f7.f3998b;
        this.f3983a = f9;
        float f10 = this.f3990h;
        if (f8 < f10) {
            this.f3984b = f10;
            return true;
        }
        float f11 = this.f3989g;
        if (f8 <= f11) {
            return j(f8, f9);
        }
        this.f3984b = f11;
        return true;
    }

    public float z() {
        return this.G.c();
    }

    public <K> c(K k7, d<K> dVar) {
        super(k7, dVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }
}
