package u;

/* loaded from: classes.dex */
public class j extends b {

    /* renamed from: i  reason: collision with root package name */
    public static final String f16981i = "LinearCurveFit";

    /* renamed from: d  reason: collision with root package name */
    public double[] f16982d;

    /* renamed from: e  reason: collision with root package name */
    public double[][] f16983e;

    /* renamed from: f  reason: collision with root package name */
    public double f16984f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16985g = true;

    /* renamed from: h  reason: collision with root package name */
    public double[] f16986h;

    public j(double[] dArr, double[][] dArr2) {
        this.f16984f = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f16986h = new double[length2];
        this.f16982d = dArr;
        this.f16983e = dArr2;
        if (length2 <= 2) {
            return;
        }
        int i7 = 0;
        double d7 = 0.0d;
        while (true) {
            double d8 = d7;
            if (i7 >= dArr.length) {
                this.f16984f = androidx.cardview.widget.g.f1896q;
                return;
            }
            double d9 = dArr2[i7][0];
            if (i7 > 0) {
                Math.hypot(d9 - d7, d9 - d8);
            }
            i7++;
            d7 = d9;
        }
    }

    @Override // u.b
    public double c(double d7, int i7) {
        double d8;
        double d9;
        double f7;
        double[] dArr = this.f16982d;
        int length = dArr.length;
        int i8 = 0;
        if (this.f16985g) {
            double d10 = dArr[0];
            if (d7 <= d10) {
                d8 = this.f16983e[0][i7];
                d9 = d7 - d10;
                f7 = f(d10, i7);
            } else {
                int i9 = length - 1;
                double d11 = dArr[i9];
                if (d7 >= d11) {
                    d8 = this.f16983e[i9][i7];
                    d9 = d7 - d11;
                    f7 = f(d11, i7);
                }
            }
            return d8 + (d9 * f7);
        } else if (d7 <= dArr[0]) {
            return this.f16983e[0][i7];
        } else {
            int i10 = length - 1;
            if (d7 >= dArr[i10]) {
                return this.f16983e[i10][i7];
            }
        }
        while (i8 < length - 1) {
            double[] dArr2 = this.f16982d;
            double d12 = dArr2[i8];
            if (d7 == d12) {
                return this.f16983e[i8][i7];
            }
            int i11 = i8 + 1;
            double d13 = dArr2[i11];
            if (d7 < d13) {
                double d14 = (d7 - d12) / (d13 - d12);
                double[][] dArr3 = this.f16983e;
                return (dArr3[i8][i7] * (1.0d - d14)) + (dArr3[i11][i7] * d14);
            }
            i8 = i11;
        }
        return androidx.cardview.widget.g.f1896q;
    }

    @Override // u.b
    public void d(double d7, double[] dArr) {
        double[] dArr2 = this.f16982d;
        int length = dArr2.length;
        int i7 = 0;
        int length2 = this.f16983e[0].length;
        if (this.f16985g) {
            double d8 = dArr2[0];
            if (d7 <= d8) {
                g(d8, this.f16986h);
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f16983e[0][i8] + ((d7 - this.f16982d[0]) * this.f16986h[i8]);
                }
                return;
            }
            int i9 = length - 1;
            double d9 = dArr2[i9];
            if (d7 >= d9) {
                g(d9, this.f16986h);
                while (i7 < length2) {
                    dArr[i7] = this.f16983e[i9][i7] + ((d7 - this.f16982d[i9]) * this.f16986h[i7]);
                    i7++;
                }
                return;
            }
        } else if (d7 <= dArr2[0]) {
            for (int i10 = 0; i10 < length2; i10++) {
                dArr[i10] = this.f16983e[0][i10];
            }
            return;
        } else {
            int i11 = length - 1;
            if (d7 >= dArr2[i11]) {
                while (i7 < length2) {
                    dArr[i7] = this.f16983e[i11][i7];
                    i7++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d7 == this.f16982d[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = this.f16983e[i12][i13];
                }
            }
            double[] dArr3 = this.f16982d;
            int i14 = i12 + 1;
            double d10 = dArr3[i14];
            if (d7 < d10) {
                double d11 = dArr3[i12];
                double d12 = (d7 - d11) / (d10 - d11);
                while (i7 < length2) {
                    double[][] dArr4 = this.f16983e;
                    dArr[i7] = (dArr4[i12][i7] * (1.0d - d12)) + (dArr4[i14][i7] * d12);
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // u.b
    public void e(double d7, float[] fArr) {
        double[] dArr = this.f16982d;
        int length = dArr.length;
        int i7 = 0;
        int length2 = this.f16983e[0].length;
        if (this.f16985g) {
            double d8 = dArr[0];
            if (d7 <= d8) {
                g(d8, this.f16986h);
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) (this.f16983e[0][i8] + ((d7 - this.f16982d[0]) * this.f16986h[i8]));
                }
                return;
            }
            int i9 = length - 1;
            double d9 = dArr[i9];
            if (d7 >= d9) {
                g(d9, this.f16986h);
                while (i7 < length2) {
                    fArr[i7] = (float) (this.f16983e[i9][i7] + ((d7 - this.f16982d[i9]) * this.f16986h[i7]));
                    i7++;
                }
                return;
            }
        } else if (d7 <= dArr[0]) {
            for (int i10 = 0; i10 < length2; i10++) {
                fArr[i10] = (float) this.f16983e[0][i10];
            }
            return;
        } else {
            int i11 = length - 1;
            if (d7 >= dArr[i11]) {
                while (i7 < length2) {
                    fArr[i7] = (float) this.f16983e[i11][i7];
                    i7++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d7 == this.f16982d[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) this.f16983e[i12][i13];
                }
            }
            double[] dArr2 = this.f16982d;
            int i14 = i12 + 1;
            double d10 = dArr2[i14];
            if (d7 < d10) {
                double d11 = dArr2[i12];
                double d12 = (d7 - d11) / (d10 - d11);
                while (i7 < length2) {
                    double[][] dArr3 = this.f16983e;
                    fArr[i7] = (float) ((dArr3[i12][i7] * (1.0d - d12)) + (dArr3[i14][i7] * d12));
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r8 >= r3) goto L4;
     */
    @Override // u.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double f(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f16982d
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f16982d
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f16983e
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j.f(double, int):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r13 >= r4) goto L4;
     */
    @Override // u.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f16982d
            int r1 = r0.length
            double[][] r2 = r12.f16983e
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f16982d
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f16983e
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j.g(double, double[]):void");
    }

    @Override // u.b
    public double[] h() {
        return this.f16982d;
    }

    public final double i(double d7) {
        if (Double.isNaN(this.f16984f)) {
            return androidx.cardview.widget.g.f1896q;
        }
        double[] dArr = this.f16982d;
        int length = dArr.length;
        if (d7 <= dArr[0]) {
            return androidx.cardview.widget.g.f1896q;
        }
        int i7 = length - 1;
        if (d7 >= dArr[i7]) {
            return this.f16984f;
        }
        double d8 = 0.0d;
        double d9 = 0.0d;
        double d10 = 0.0d;
        int i8 = 0;
        while (i8 < i7) {
            double[] dArr2 = this.f16983e[i8];
            double d11 = dArr2[0];
            double d12 = dArr2[1];
            if (i8 > 0) {
                d8 += Math.hypot(d11 - d9, d12 - d10);
            }
            double[] dArr3 = this.f16982d;
            double d13 = dArr3[i8];
            if (d7 == d13) {
                return d8;
            }
            int i9 = i8 + 1;
            double d14 = dArr3[i9];
            if (d7 < d14) {
                double d15 = (d7 - d13) / (d14 - d13);
                double[][] dArr4 = this.f16983e;
                double[] dArr5 = dArr4[i8];
                double d16 = dArr5[0];
                double[] dArr6 = dArr4[i9];
                double d17 = 1.0d - d15;
                return d8 + Math.hypot(d12 - ((dArr5[1] * d17) + (dArr6[1] * d15)), d11 - ((d16 * d17) + (dArr6[0] * d15)));
            }
            i8 = i9;
            d9 = d11;
            d10 = d12;
        }
        return androidx.cardview.widget.g.f1896q;
    }
}