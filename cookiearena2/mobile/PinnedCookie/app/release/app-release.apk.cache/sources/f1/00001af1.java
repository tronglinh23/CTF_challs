package u;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f16892a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f16893b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f16894c = 2;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: d  reason: collision with root package name */
        public double f16895d;

        /* renamed from: e  reason: collision with root package name */
        public double[] f16896e;

        public a(double d7, double[] dArr) {
            this.f16895d = d7;
            this.f16896e = dArr;
        }

        @Override // u.b
        public double c(double d7, int i7) {
            return this.f16896e[i7];
        }

        @Override // u.b
        public void d(double d7, double[] dArr) {
            double[] dArr2 = this.f16896e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // u.b
        public void e(double d7, float[] fArr) {
            int i7 = 0;
            while (true) {
                double[] dArr = this.f16896e;
                if (i7 >= dArr.length) {
                    return;
                }
                fArr[i7] = (float) dArr[i7];
                i7++;
            }
        }

        @Override // u.b
        public double f(double d7, int i7) {
            return androidx.cardview.widget.g.f1896q;
        }

        @Override // u.b
        public void g(double d7, double[] dArr) {
            for (int i7 = 0; i7 < this.f16896e.length; i7++) {
                dArr[i7] = 0.0d;
            }
        }

        @Override // u.b
        public double[] h() {
            return new double[]{this.f16895d};
        }
    }

    public static b a(int i7, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i7 = 2;
        }
        return i7 != 0 ? i7 != 2 ? new j(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new k(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new u.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d7, int i7);

    public abstract void d(double d7, double[] dArr);

    public abstract void e(double d7, float[] fArr);

    public abstract double f(double d7, int i7);

    public abstract void g(double d7, double[] dArr);

    public abstract double[] h();
}