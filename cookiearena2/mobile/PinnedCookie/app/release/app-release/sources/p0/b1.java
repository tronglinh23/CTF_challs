package p0;

import android.graphics.PointF;
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f14485a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14486b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f14487c;

    /* renamed from: d  reason: collision with root package name */
    public final float f14488d;

    public b1(@d.o0 PointF pointF, float f7, @d.o0 PointF pointF2, float f8) {
        this.f14485a = (PointF) g1.s.m(pointF, "start == null");
        this.f14486b = f7;
        this.f14487c = (PointF) g1.s.m(pointF2, "end == null");
        this.f14488d = f8;
    }

    @d.o0
    public PointF a() {
        return this.f14487c;
    }

    public float b() {
        return this.f14488d;
    }

    @d.o0
    public PointF c() {
        return this.f14485a;
    }

    public float d() {
        return this.f14486b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return Float.compare(this.f14486b, b1Var.f14486b) == 0 && Float.compare(this.f14488d, b1Var.f14488d) == 0 && this.f14485a.equals(b1Var.f14485a) && this.f14487c.equals(b1Var.f14487c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f14485a.hashCode() * 31;
        float f7 = this.f14486b;
        int floatToIntBits = (((hashCode + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31) + this.f14487c.hashCode()) * 31;
        float f8 = this.f14488d;
        return floatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f14485a + ", startFraction=" + this.f14486b + ", end=" + this.f14487c + ", endFraction=" + this.f14488d + '}';
    }
}
