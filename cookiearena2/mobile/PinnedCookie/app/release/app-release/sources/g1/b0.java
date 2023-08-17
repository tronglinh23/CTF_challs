package g1;

import android.util.SizeF;
import d.o0;
import d.w0;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f9981a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9982b;

    @w0(21)
    /* loaded from: classes.dex */
    public static final class a {
        @d.u
        @o0
        public static SizeF a(@o0 b0 b0Var) {
            s.l(b0Var);
            return new SizeF(b0Var.b(), b0Var.a());
        }

        @d.u
        @o0
        public static b0 b(@o0 SizeF sizeF) {
            s.l(sizeF);
            return new b0(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public b0(float f7, float f8) {
        this.f9981a = s.d(f7, "width");
        this.f9982b = s.d(f8, "height");
    }

    @o0
    @w0(21)
    public static b0 d(@o0 SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.f9982b;
    }

    public float b() {
        return this.f9981a;
    }

    @o0
    @w0(21)
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return b0Var.f9981a == this.f9981a && b0Var.f9982b == this.f9982b;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f9981a) ^ Float.floatToIntBits(this.f9982b);
    }

    @o0
    public String toString() {
        return this.f9981a + "x" + this.f9982b;
    }
}
