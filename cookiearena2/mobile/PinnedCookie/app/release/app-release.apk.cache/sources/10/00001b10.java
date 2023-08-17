package u;

/* loaded from: classes.dex */
public class p implements r {

    /* renamed from: l  reason: collision with root package name */
    public static final double f17032l = Double.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public double f17035c;

    /* renamed from: d  reason: collision with root package name */
    public double f17036d;

    /* renamed from: e  reason: collision with root package name */
    public double f17037e;

    /* renamed from: f  reason: collision with root package name */
    public float f17038f;

    /* renamed from: g  reason: collision with root package name */
    public float f17039g;

    /* renamed from: h  reason: collision with root package name */
    public float f17040h;

    /* renamed from: i  reason: collision with root package name */
    public float f17041i;

    /* renamed from: j  reason: collision with root package name */
    public float f17042j;

    /* renamed from: a  reason: collision with root package name */
    public double f17033a = 0.5d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17034b = false;

    /* renamed from: k  reason: collision with root package name */
    public int f17043k = 0;

    @Override // u.r
    public float a() {
        return 0.0f;
    }

    @Override // u.r
    public String b(String str, float f7) {
        return null;
    }

    @Override // u.r
    public boolean c() {
        double d7 = this.f17039g - this.f17036d;
        double d8 = this.f17035c;
        double d9 = this.f17040h;
        return Math.sqrt((((d9 * d9) * ((double) this.f17041i)) + ((d8 * d7) * d7)) / d8) <= ((double) this.f17042j);
    }

    @Override // u.r
    public float d(float f7) {
        return this.f17040h;
    }

    public final void e(double d7) {
        double d8 = this.f17035c;
        double d9 = this.f17033a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d8 / this.f17041i) * d7) * 4.0d)) + 1.0d);
        double d10 = d7 / sqrt;
        int i7 = 0;
        while (i7 < sqrt) {
            float f7 = this.f17039g;
            double d11 = this.f17036d;
            float f8 = this.f17040h;
            double d12 = d8;
            double d13 = ((-d8) * (f7 - d11)) - (f8 * d9);
            float f9 = this.f17041i;
            double d14 = d9;
            double d15 = f8 + (((d13 / f9) * d10) / 2.0d);
            double d16 = ((((-((f7 + ((d10 * d15) / 2.0d)) - d11)) * d12) - (d15 * d14)) / f9) * d10;
            float f10 = (float) (f8 + d16);
            this.f17040h = f10;
            float f11 = (float) (f7 + ((f8 + (d16 / 2.0d)) * d10));
            this.f17039g = f11;
            int i8 = this.f17043k;
            if (i8 > 0) {
                if (f11 < 0.0f && (i8 & 1) == 1) {
                    this.f17039g = -f11;
                    this.f17040h = -f10;
                }
                float f12 = this.f17039g;
                if (f12 > 1.0f && (i8 & 2) == 2) {
                    this.f17039g = 2.0f - f12;
                    this.f17040h = -this.f17040h;
                }
            }
            i7++;
            d8 = d12;
            d9 = d14;
        }
    }

    public float f() {
        return ((float) (((-this.f17035c) * (this.f17039g - this.f17036d)) - (this.f17033a * this.f17040h))) / this.f17041i;
    }

    public void g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    @Override // u.r
    public float getInterpolation(float f7) {
        e(f7 - this.f17038f);
        this.f17038f = f7;
        return this.f17039g;
    }

    public void h(float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i7) {
        this.f17036d = f8;
        this.f17033a = f12;
        this.f17034b = false;
        this.f17039g = f7;
        this.f17037e = f9;
        this.f17035c = f11;
        this.f17041i = f10;
        this.f17042j = f13;
        this.f17043k = i7;
        this.f17038f = 0.0f;
    }
}