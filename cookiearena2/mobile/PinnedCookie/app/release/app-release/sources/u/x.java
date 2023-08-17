package u;
/* loaded from: classes.dex */
public class x {

    /* renamed from: g  reason: collision with root package name */
    public static String f17297g = "VelocityMatrix";

    /* renamed from: a  reason: collision with root package name */
    public float f17298a;

    /* renamed from: b  reason: collision with root package name */
    public float f17299b;

    /* renamed from: c  reason: collision with root package name */
    public float f17300c;

    /* renamed from: d  reason: collision with root package name */
    public float f17301d;

    /* renamed from: e  reason: collision with root package name */
    public float f17302e;

    /* renamed from: f  reason: collision with root package name */
    public float f17303f;

    public void a(float f7, float f8, int i7, int i8, float[] fArr) {
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = (f8 - 0.5f) * 2.0f;
        float f12 = f9 + this.f17300c;
        float f13 = f10 + this.f17301d;
        float f14 = f12 + (this.f17298a * (f7 - 0.5f) * 2.0f);
        float f15 = f13 + (this.f17299b * f11);
        float radians = (float) Math.toRadians(this.f17303f);
        float radians2 = (float) Math.toRadians(this.f17302e);
        double d7 = radians;
        double d8 = i8 * f11;
        float sin = f14 + (((float) ((((-i7) * r7) * Math.sin(d7)) - (Math.cos(d7) * d8))) * radians2);
        float cos = f15 + (radians2 * ((float) (((i7 * r7) * Math.cos(d7)) - (d8 * Math.sin(d7)))));
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public void b() {
        this.f17302e = 0.0f;
        this.f17301d = 0.0f;
        this.f17300c = 0.0f;
        this.f17299b = 0.0f;
        this.f17298a = 0.0f;
    }

    public void c(h hVar, float f7) {
        if (hVar != null) {
            this.f17302e = hVar.c(f7);
        }
    }

    public void d(o oVar, float f7) {
        if (oVar != null) {
            this.f17302e = oVar.c(f7);
            this.f17303f = oVar.a(f7);
        }
    }

    public void e(h hVar, h hVar2, float f7) {
        if (hVar != null) {
            this.f17298a = hVar.c(f7);
        }
        if (hVar2 != null) {
            this.f17299b = hVar2.c(f7);
        }
    }

    public void f(o oVar, o oVar2, float f7) {
        if (oVar != null) {
            this.f17298a = oVar.c(f7);
        }
        if (oVar2 != null) {
            this.f17299b = oVar2.c(f7);
        }
    }

    public void g(h hVar, h hVar2, float f7) {
        if (hVar != null) {
            this.f17300c = hVar.c(f7);
        }
        if (hVar2 != null) {
            this.f17301d = hVar2.c(f7);
        }
    }

    public void h(o oVar, o oVar2, float f7) {
        if (oVar != null) {
            this.f17300c = oVar.c(f7);
        }
        if (oVar2 != null) {
            this.f17301d = oVar2.c(f7);
        }
    }
}
