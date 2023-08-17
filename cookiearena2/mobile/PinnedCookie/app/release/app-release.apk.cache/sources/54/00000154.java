package androidx.appcompat.app;

/* loaded from: classes.dex */
public class z {

    /* renamed from: d  reason: collision with root package name */
    public static z f932d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final int f933e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f934f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final float f935g = 0.017453292f;

    /* renamed from: h  reason: collision with root package name */
    public static final float f936h = 9.0E-4f;

    /* renamed from: i  reason: collision with root package name */
    public static final float f937i = -0.10471976f;

    /* renamed from: j  reason: collision with root package name */
    public static final float f938j = 0.0334196f;

    /* renamed from: k  reason: collision with root package name */
    public static final float f939k = 3.49066E-4f;

    /* renamed from: l  reason: collision with root package name */
    public static final float f940l = 5.236E-6f;

    /* renamed from: m  reason: collision with root package name */
    public static final float f941m = 0.4092797f;

    /* renamed from: n  reason: collision with root package name */
    public static final long f942n = 946728000000L;

    /* renamed from: a  reason: collision with root package name */
    public long f943a;

    /* renamed from: b  reason: collision with root package name */
    public long f944b;

    /* renamed from: c  reason: collision with root package name */
    public int f945c;

    public static z b() {
        if (f932d == null) {
            f932d = new z();
        }
        return f932d;
    }

    public void a(long j7, double d7, double d8) {
        double d9 = (0.01720197f * (((float) (j7 - f942n)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d9) * 0.03341960161924362d) + d9 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d8) / 360.0d) + (Math.sin(d9) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d10 = 0.01745329238474369d * d7;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d10) * Math.sin(asin))) / (Math.cos(d10) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f945c = 1;
            this.f943a = -1L;
            this.f944b = -1L;
        } else if (sin2 <= -1.0d) {
            this.f945c = 0;
            this.f943a = -1L;
            this.f944b = -1L;
        } else {
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f943a = Math.round((round + acos) * 8.64E7d) + f942n;
            long round2 = Math.round((round - acos) * 8.64E7d) + f942n;
            this.f944b = round2;
            if (round2 >= j7 || this.f943a <= j7) {
                this.f945c = 1;
            } else {
                this.f945c = 0;
            }
        }
    }
}