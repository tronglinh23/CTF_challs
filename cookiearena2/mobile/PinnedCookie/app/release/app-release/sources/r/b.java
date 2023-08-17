package r;

import androidx.core.view.u1;
import u.v;
/* loaded from: classes.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    public static final String f15331g = "TransitionLayout";

    /* renamed from: a  reason: collision with root package name */
    public String f15332a;

    /* renamed from: b  reason: collision with root package name */
    public int f15333b;

    /* renamed from: c  reason: collision with root package name */
    public int f15334c;

    /* renamed from: d  reason: collision with root package name */
    public float f15335d;

    /* renamed from: e  reason: collision with root package name */
    public String f15336e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15337f;

    public b(b bVar) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15335d = Float.NaN;
        this.f15336e = null;
        this.f15332a = bVar.f15332a;
        this.f15333b = bVar.f15333b;
        this.f15334c = bVar.f15334c;
        this.f15335d = bVar.f15335d;
        this.f15336e = bVar.f15336e;
        this.f15337f = bVar.f15337f;
    }

    public static int b(int i7) {
        int i8 = (i7 & (~(i7 >> 31))) - 255;
        return (i8 & (i8 >> 31)) + 255;
    }

    public static String c(int i7) {
        return "#" + ("00000000" + Integer.toHexString(i7)).substring(r2.length() - 8);
    }

    public static int p(float f7, float f8, float f9) {
        float f10 = f7 * 6.0f;
        int i7 = (int) f10;
        float f11 = f10 - i7;
        float f12 = f9 * 255.0f;
        int i8 = (int) (((1.0f - f8) * f12) + 0.5f);
        int i9 = (int) (((1.0f - (f11 * f8)) * f12) + 0.5f);
        int i10 = (int) (((1.0f - ((1.0f - f11) * f8)) * f12) + 0.5f);
        int i11 = (int) (f12 + 0.5f);
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                return 0;
                            }
                            return ((i11 << 16) + (i8 << 8) + i9) | u1.f3816t;
                        }
                        return ((i10 << 16) + (i8 << 8) + i11) | u1.f3816t;
                    }
                    return ((i8 << 16) + (i9 << 8) + i11) | u1.f3816t;
                }
                return ((i8 << 16) + (i11 << 8) + i10) | u1.f3816t;
            }
            return ((i9 << 16) + (i11 << 8) + i8) | u1.f3816t;
        }
        return ((i11 << 16) + (i10 << 8) + i8) | u1.f3816t;
    }

    public static int s(float f7, float f8, float f9, float f10) {
        int b7 = b((int) (f7 * 255.0f));
        int b8 = b((int) (f8 * 255.0f));
        return (b7 << 16) | (b((int) (f10 * 255.0f)) << 24) | (b8 << 8) | b((int) (f9 * 255.0f));
    }

    public void a(f fVar) {
        int i7 = this.f15333b;
        switch (i7) {
            case v.b.f17145j /* 900 */:
            case v.b.f17147l /* 902 */:
            case v.b.f17151p /* 906 */:
                fVar.J(this.f15332a, i7, this.f15334c);
                return;
            case v.b.f17146k /* 901 */:
            case v.b.f17150o /* 905 */:
                fVar.I(this.f15332a, i7, this.f15335d);
                return;
            case v.b.f17148m /* 903 */:
                fVar.K(this.f15332a, i7, this.f15336e);
                return;
            case v.b.f17149n /* 904 */:
                fVar.L(this.f15332a, i7, this.f15337f);
                return;
            default:
                return;
        }
    }

    public b d() {
        return new b(this);
    }

    public boolean e(b bVar) {
        int i7;
        if (bVar == null || (i7 = this.f15333b) != bVar.f15333b) {
            return false;
        }
        switch (i7) {
            case v.b.f17145j /* 900 */:
            case v.b.f17151p /* 906 */:
                return this.f15334c == bVar.f15334c;
            case v.b.f17146k /* 901 */:
                return this.f15335d == bVar.f15335d;
            case v.b.f17147l /* 902 */:
                return this.f15334c == bVar.f15334c;
            case v.b.f17148m /* 903 */:
                return this.f15334c == bVar.f15334c;
            case v.b.f17149n /* 904 */:
                return this.f15337f == bVar.f15337f;
            case v.b.f17150o /* 905 */:
                return this.f15335d == bVar.f15335d;
            default:
                return false;
        }
    }

    public boolean f() {
        return this.f15337f;
    }

    public int g() {
        return this.f15334c;
    }

    public float h() {
        return this.f15335d;
    }

    public int i() {
        return this.f15334c;
    }

    public int j(float[] fArr) {
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.f15332a;
    }

    public String l() {
        return this.f15336e;
    }

    public int m() {
        return this.f15333b;
    }

    public float n() {
        switch (this.f15333b) {
            case v.b.f17145j /* 900 */:
                return this.f15334c;
            case v.b.f17146k /* 901 */:
                return this.f15335d;
            case v.b.f17147l /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case v.b.f17148m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f17149n /* 904 */:
                return this.f15337f ? 1.0f : 0.0f;
            case v.b.f17150o /* 905 */:
                return this.f15335d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        switch (this.f15333b) {
            case v.b.f17145j /* 900 */:
                fArr[0] = this.f15334c;
                return;
            case v.b.f17146k /* 901 */:
                fArr[0] = this.f15335d;
                return;
            case v.b.f17147l /* 902 */:
                int i7 = (this.f15334c >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i7 / 255.0f;
                return;
            case v.b.f17148m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f17149n /* 904 */:
                fArr[0] = this.f15337f ? 1.0f : 0.0f;
                return;
            case v.b.f17150o /* 905 */:
                fArr[0] = this.f15335d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i7 = this.f15333b;
        return (i7 == 903 || i7 == 904 || i7 == 906) ? false : true;
    }

    public int r() {
        return this.f15333b != 902 ? 1 : 4;
    }

    public void t(boolean z6) {
        this.f15337f = z6;
    }

    public String toString() {
        String str = this.f15332a + ':';
        switch (this.f15333b) {
            case v.b.f17145j /* 900 */:
                return str + this.f15334c;
            case v.b.f17146k /* 901 */:
                return str + this.f15335d;
            case v.b.f17147l /* 902 */:
                return str + c(this.f15334c);
            case v.b.f17148m /* 903 */:
                return str + this.f15336e;
            case v.b.f17149n /* 904 */:
                return str + Boolean.valueOf(this.f15337f);
            case v.b.f17150o /* 905 */:
                return str + this.f15335d;
            default:
                return str + "????";
        }
    }

    public void u(float f7) {
        this.f15335d = f7;
    }

    public void v(int i7) {
        this.f15334c = i7;
    }

    public void w(f fVar, float[] fArr) {
        int i7 = this.f15333b;
        switch (i7) {
            case v.b.f17145j /* 900 */:
                fVar.J(this.f15332a, i7, (int) fArr[0]);
                return;
            case v.b.f17146k /* 901 */:
            case v.b.f17150o /* 905 */:
                fVar.I(this.f15332a, i7, fArr[0]);
                return;
            case v.b.f17147l /* 902 */:
                fVar.J(this.f15332a, this.f15333b, (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case v.b.f17148m /* 903 */:
            case v.b.f17151p /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f15332a);
            case v.b.f17149n /* 904 */:
                fVar.L(this.f15332a, i7, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f15336e = str;
    }

    public void y(Object obj) {
        switch (this.f15333b) {
            case v.b.f17145j /* 900 */:
            case v.b.f17151p /* 906 */:
                this.f15334c = ((Integer) obj).intValue();
                return;
            case v.b.f17146k /* 901 */:
                this.f15335d = ((Float) obj).floatValue();
                return;
            case v.b.f17147l /* 902 */:
                this.f15334c = ((Integer) obj).intValue();
                return;
            case v.b.f17148m /* 903 */:
                this.f15336e = (String) obj;
                return;
            case v.b.f17149n /* 904 */:
                this.f15337f = ((Boolean) obj).booleanValue();
                return;
            case v.b.f17150o /* 905 */:
                this.f15335d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void z(float[] fArr) {
        switch (this.f15333b) {
            case v.b.f17145j /* 900 */:
            case v.b.f17151p /* 906 */:
                this.f15334c = (int) fArr[0];
                return;
            case v.b.f17146k /* 901 */:
            case v.b.f17150o /* 905 */:
                this.f15335d = fArr[0];
                return;
            case v.b.f17147l /* 902 */:
                this.f15334c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case v.b.f17148m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case v.b.f17149n /* 904 */:
                this.f15337f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public b(String str, int i7, String str2) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15335d = Float.NaN;
        this.f15332a = str;
        this.f15333b = i7;
        this.f15336e = str2;
    }

    public b(String str, int i7, int i8) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15335d = Float.NaN;
        this.f15336e = null;
        this.f15332a = str;
        this.f15333b = i7;
        if (i7 == 901) {
            this.f15335d = i8;
        } else {
            this.f15334c = i8;
        }
    }

    public b(String str, int i7, float f7) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15336e = null;
        this.f15332a = str;
        this.f15333b = i7;
        this.f15335d = f7;
    }

    public b(String str, int i7, boolean z6) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15335d = Float.NaN;
        this.f15336e = null;
        this.f15332a = str;
        this.f15333b = i7;
        this.f15337f = z6;
    }

    public b(String str, int i7) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15335d = Float.NaN;
        this.f15336e = null;
        this.f15332a = str;
        this.f15333b = i7;
    }

    public b(String str, int i7, Object obj) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15335d = Float.NaN;
        this.f15336e = null;
        this.f15332a = str;
        this.f15333b = i7;
        y(obj);
    }

    public b(b bVar, Object obj) {
        this.f15334c = Integer.MIN_VALUE;
        this.f15335d = Float.NaN;
        this.f15336e = null;
        this.f15332a = bVar.f15332a;
        this.f15333b = bVar.f15333b;
        y(obj);
    }
}
