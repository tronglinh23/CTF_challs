package u;

import java.util.Arrays;
/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: g  reason: collision with root package name */
    public static final int f16861g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f16862h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f16863i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f16864j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f16865k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f16866l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f16867m = 3;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f16868d;

    /* renamed from: e  reason: collision with root package name */
    public C0248a[] f16869e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16870f = true;

    /* renamed from: u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0248a {

        /* renamed from: s  reason: collision with root package name */
        public static final String f16871s = "Arc";

        /* renamed from: t  reason: collision with root package name */
        public static double[] f16872t = new double[91];

        /* renamed from: u  reason: collision with root package name */
        public static final double f16873u = 0.001d;

        /* renamed from: a  reason: collision with root package name */
        public double[] f16874a;

        /* renamed from: b  reason: collision with root package name */
        public double f16875b;

        /* renamed from: c  reason: collision with root package name */
        public double f16876c;

        /* renamed from: d  reason: collision with root package name */
        public double f16877d;

        /* renamed from: e  reason: collision with root package name */
        public double f16878e;

        /* renamed from: f  reason: collision with root package name */
        public double f16879f;

        /* renamed from: g  reason: collision with root package name */
        public double f16880g;

        /* renamed from: h  reason: collision with root package name */
        public double f16881h;

        /* renamed from: i  reason: collision with root package name */
        public double f16882i;

        /* renamed from: j  reason: collision with root package name */
        public double f16883j;

        /* renamed from: k  reason: collision with root package name */
        public double f16884k;

        /* renamed from: l  reason: collision with root package name */
        public double f16885l;

        /* renamed from: m  reason: collision with root package name */
        public double f16886m;

        /* renamed from: n  reason: collision with root package name */
        public double f16887n;

        /* renamed from: o  reason: collision with root package name */
        public double f16888o;

        /* renamed from: p  reason: collision with root package name */
        public double f16889p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f16890q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f16891r;

        public C0248a(int i7, double d7, double d8, double d9, double d10, double d11, double d12) {
            this.f16891r = false;
            this.f16890q = i7 == 1;
            this.f16876c = d7;
            this.f16877d = d8;
            this.f16882i = 1.0d / (d8 - d7);
            if (3 == i7) {
                this.f16891r = true;
            }
            double d13 = d11 - d9;
            double d14 = d12 - d10;
            if (!this.f16891r && Math.abs(d13) >= 0.001d && Math.abs(d14) >= 0.001d) {
                this.f16874a = new double[v.f17109g];
                boolean z6 = this.f16890q;
                this.f16883j = d13 * (z6 ? -1 : 1);
                this.f16884k = d14 * (z6 ? 1 : -1);
                this.f16885l = z6 ? d11 : d9;
                this.f16886m = z6 ? d10 : d12;
                a(d9, d10, d11, d12);
                this.f16887n = this.f16875b * this.f16882i;
                return;
            }
            this.f16891r = true;
            this.f16878e = d9;
            this.f16879f = d11;
            this.f16880g = d10;
            this.f16881h = d12;
            double hypot = Math.hypot(d14, d13);
            this.f16875b = hypot;
            this.f16887n = hypot * this.f16882i;
            double d15 = this.f16877d;
            double d16 = this.f16876c;
            this.f16885l = d13 / (d15 - d16);
            this.f16886m = d14 / (d15 - d16);
        }

        public final void a(double d7, double d8, double d9, double d10) {
            double d11;
            double d12 = d9 - d7;
            double d13 = d8 - d10;
            int i7 = 0;
            double d14 = androidx.cardview.widget.g.f1896q;
            double d15 = androidx.cardview.widget.g.f1896q;
            double d16 = androidx.cardview.widget.g.f1896q;
            while (true) {
                if (i7 >= f16872t.length) {
                    break;
                }
                double d17 = d14;
                double radians = Math.toRadians((i7 * 90.0d) / ((double) (r15.length - 1)));
                double sin = Math.sin(radians) * d12;
                double cos = Math.cos(radians) * d13;
                if (i7 > 0) {
                    d11 = Math.hypot(sin - d15, cos - d16) + d17;
                    f16872t[i7] = d11;
                } else {
                    d11 = d17;
                }
                i7++;
                d16 = cos;
                d14 = d11;
                d15 = sin;
            }
            double d18 = d14;
            this.f16875b = d18;
            int i8 = 0;
            while (true) {
                double[] dArr = f16872t;
                if (i8 >= dArr.length) {
                    break;
                }
                dArr[i8] = dArr[i8] / d18;
                i8++;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= this.f16874a.length) {
                    return;
                }
                double length = i9 / ((double) (r1.length - 1));
                int binarySearch = Arrays.binarySearch(f16872t, length);
                if (binarySearch >= 0) {
                    this.f16874a[i9] = binarySearch / ((double) (f16872t.length - 1));
                } else if (binarySearch == -1) {
                    this.f16874a[i9] = 0.0d;
                } else {
                    int i10 = -binarySearch;
                    int i11 = i10 - 2;
                    double[] dArr2 = f16872t;
                    double d19 = dArr2[i11];
                    this.f16874a[i9] = (i11 + ((length - d19) / (dArr2[i10 - 1] - d19))) / ((double) (dArr2.length - 1));
                }
                i9++;
            }
        }

        public double b() {
            double d7 = this.f16883j * this.f16889p;
            double hypot = this.f16887n / Math.hypot(d7, (-this.f16884k) * this.f16888o);
            if (this.f16890q) {
                d7 = -d7;
            }
            return d7 * hypot;
        }

        public double c() {
            double d7 = this.f16883j * this.f16889p;
            double d8 = (-this.f16884k) * this.f16888o;
            double hypot = this.f16887n / Math.hypot(d7, d8);
            return this.f16890q ? (-d8) * hypot : d8 * hypot;
        }

        public double d(double d7) {
            return this.f16885l;
        }

        public double e(double d7) {
            return this.f16886m;
        }

        public double f(double d7) {
            double d8 = (d7 - this.f16876c) * this.f16882i;
            double d9 = this.f16878e;
            return d9 + (d8 * (this.f16879f - d9));
        }

        public double g(double d7) {
            double d8 = (d7 - this.f16876c) * this.f16882i;
            double d9 = this.f16880g;
            return d9 + (d8 * (this.f16881h - d9));
        }

        public double h() {
            return this.f16885l + (this.f16883j * this.f16888o);
        }

        public double i() {
            return this.f16886m + (this.f16884k * this.f16889p);
        }

        public double j(double d7) {
            if (d7 <= androidx.cardview.widget.g.f1896q) {
                return androidx.cardview.widget.g.f1896q;
            }
            if (d7 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f16874a;
            double length = d7 * ((double) (dArr.length - 1));
            int i7 = (int) length;
            double d8 = length - i7;
            double d9 = dArr[i7];
            return d9 + (d8 * (dArr[i7 + 1] - d9));
        }

        public void k(double d7) {
            double j7 = j((this.f16890q ? this.f16877d - d7 : d7 - this.f16876c) * this.f16882i) * 1.5707963267948966d;
            this.f16888o = Math.sin(j7);
            this.f16889p = Math.cos(j7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f16870f = r2
            r0.f16868d = r1
            int r3 = r1.length
            int r3 = r3 - r2
            u.a$a[] r3 = new u.a.C0248a[r3]
            r0.f16869e = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            u.a$a[] r7 = r0.f16869e
            int r8 = r7.length
            if (r4 >= r8) goto L4f
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2f
            if (r8 == r2) goto L2c
            r10 = 2
            if (r8 == r10) goto L2a
            if (r8 == r9) goto L28
            goto L30
        L28:
            if (r5 != r2) goto L2c
        L2a:
            r5 = r10
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = r5
            goto L30
        L2f:
            r6 = r9
        L30:
            u.a$a r22 = new u.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a.<init>(int[], double[], double[][]):void");
    }

    @Override // u.b
    public double c(double d7, int i7) {
        double g7;
        double e7;
        double i8;
        double c7;
        double g8;
        double e8;
        int i9 = 0;
        if (this.f16870f) {
            C0248a[] c0248aArr = this.f16869e;
            C0248a c0248a = c0248aArr[0];
            double d8 = c0248a.f16876c;
            if (d7 < d8) {
                double d9 = d7 - d8;
                if (c0248a.f16891r) {
                    if (i7 == 0) {
                        g8 = c0248a.f(d8);
                        e8 = this.f16869e[0].d(d8);
                    } else {
                        g8 = c0248a.g(d8);
                        e8 = this.f16869e[0].e(d8);
                    }
                    return g8 + (d9 * e8);
                }
                c0248a.k(d8);
                if (i7 == 0) {
                    i8 = this.f16869e[0].h();
                    c7 = this.f16869e[0].b();
                } else {
                    i8 = this.f16869e[0].i();
                    c7 = this.f16869e[0].c();
                }
                return i8 + (d9 * c7);
            } else if (d7 > c0248aArr[c0248aArr.length - 1].f16877d) {
                double d10 = c0248aArr[c0248aArr.length - 1].f16877d;
                double d11 = d7 - d10;
                int length = c0248aArr.length - 1;
                if (i7 == 0) {
                    g7 = c0248aArr[length].f(d10);
                    e7 = this.f16869e[length].d(d10);
                } else {
                    g7 = c0248aArr[length].g(d10);
                    e7 = this.f16869e[length].e(d10);
                }
                return g7 + (d11 * e7);
            }
        } else {
            C0248a[] c0248aArr2 = this.f16869e;
            double d12 = c0248aArr2[0].f16876c;
            if (d7 < d12) {
                d7 = d12;
            } else if (d7 > c0248aArr2[c0248aArr2.length - 1].f16877d) {
                d7 = c0248aArr2[c0248aArr2.length - 1].f16877d;
            }
        }
        while (true) {
            C0248a[] c0248aArr3 = this.f16869e;
            if (i9 >= c0248aArr3.length) {
                return Double.NaN;
            }
            C0248a c0248a2 = c0248aArr3[i9];
            if (d7 <= c0248a2.f16877d) {
                if (c0248a2.f16891r) {
                    return i7 == 0 ? c0248a2.f(d7) : c0248a2.g(d7);
                }
                c0248a2.k(d7);
                return i7 == 0 ? this.f16869e[i9].h() : this.f16869e[i9].i();
            }
            i9++;
        }
    }

    @Override // u.b
    public void d(double d7, double[] dArr) {
        if (this.f16870f) {
            C0248a[] c0248aArr = this.f16869e;
            C0248a c0248a = c0248aArr[0];
            double d8 = c0248a.f16876c;
            if (d7 < d8) {
                double d9 = d7 - d8;
                if (c0248a.f16891r) {
                    dArr[0] = c0248a.f(d8) + (this.f16869e[0].d(d8) * d9);
                    dArr[1] = this.f16869e[0].g(d8) + (d9 * this.f16869e[0].e(d8));
                    return;
                }
                c0248a.k(d8);
                dArr[0] = this.f16869e[0].h() + (this.f16869e[0].b() * d9);
                dArr[1] = this.f16869e[0].i() + (d9 * this.f16869e[0].c());
                return;
            } else if (d7 > c0248aArr[c0248aArr.length - 1].f16877d) {
                double d10 = c0248aArr[c0248aArr.length - 1].f16877d;
                double d11 = d7 - d10;
                int length = c0248aArr.length - 1;
                C0248a c0248a2 = c0248aArr[length];
                if (c0248a2.f16891r) {
                    dArr[0] = c0248a2.f(d10) + (this.f16869e[length].d(d10) * d11);
                    dArr[1] = this.f16869e[length].g(d10) + (d11 * this.f16869e[length].e(d10));
                    return;
                }
                c0248a2.k(d7);
                dArr[0] = this.f16869e[length].h() + (this.f16869e[length].b() * d11);
                dArr[1] = this.f16869e[length].i() + (d11 * this.f16869e[length].c());
                return;
            }
        } else {
            C0248a[] c0248aArr2 = this.f16869e;
            double d12 = c0248aArr2[0].f16876c;
            if (d7 < d12) {
                d7 = d12;
            }
            if (d7 > c0248aArr2[c0248aArr2.length - 1].f16877d) {
                d7 = c0248aArr2[c0248aArr2.length - 1].f16877d;
            }
        }
        int i7 = 0;
        while (true) {
            C0248a[] c0248aArr3 = this.f16869e;
            if (i7 >= c0248aArr3.length) {
                return;
            }
            C0248a c0248a3 = c0248aArr3[i7];
            if (d7 <= c0248a3.f16877d) {
                if (c0248a3.f16891r) {
                    dArr[0] = c0248a3.f(d7);
                    dArr[1] = this.f16869e[i7].g(d7);
                    return;
                }
                c0248a3.k(d7);
                dArr[0] = this.f16869e[i7].h();
                dArr[1] = this.f16869e[i7].i();
                return;
            }
            i7++;
        }
    }

    @Override // u.b
    public void e(double d7, float[] fArr) {
        if (this.f16870f) {
            C0248a[] c0248aArr = this.f16869e;
            C0248a c0248a = c0248aArr[0];
            double d8 = c0248a.f16876c;
            if (d7 < d8) {
                double d9 = d7 - d8;
                if (c0248a.f16891r) {
                    fArr[0] = (float) (c0248a.f(d8) + (this.f16869e[0].d(d8) * d9));
                    fArr[1] = (float) (this.f16869e[0].g(d8) + (d9 * this.f16869e[0].e(d8)));
                    return;
                }
                c0248a.k(d8);
                fArr[0] = (float) (this.f16869e[0].h() + (this.f16869e[0].b() * d9));
                fArr[1] = (float) (this.f16869e[0].i() + (d9 * this.f16869e[0].c()));
                return;
            } else if (d7 > c0248aArr[c0248aArr.length - 1].f16877d) {
                double d10 = c0248aArr[c0248aArr.length - 1].f16877d;
                double d11 = d7 - d10;
                int length = c0248aArr.length - 1;
                C0248a c0248a2 = c0248aArr[length];
                if (c0248a2.f16891r) {
                    fArr[0] = (float) (c0248a2.f(d10) + (this.f16869e[length].d(d10) * d11));
                    fArr[1] = (float) (this.f16869e[length].g(d10) + (d11 * this.f16869e[length].e(d10)));
                    return;
                }
                c0248a2.k(d7);
                fArr[0] = (float) this.f16869e[length].h();
                fArr[1] = (float) this.f16869e[length].i();
                return;
            }
        } else {
            C0248a[] c0248aArr2 = this.f16869e;
            double d12 = c0248aArr2[0].f16876c;
            if (d7 < d12) {
                d7 = d12;
            } else if (d7 > c0248aArr2[c0248aArr2.length - 1].f16877d) {
                d7 = c0248aArr2[c0248aArr2.length - 1].f16877d;
            }
        }
        int i7 = 0;
        while (true) {
            C0248a[] c0248aArr3 = this.f16869e;
            if (i7 >= c0248aArr3.length) {
                return;
            }
            C0248a c0248a3 = c0248aArr3[i7];
            if (d7 <= c0248a3.f16877d) {
                if (c0248a3.f16891r) {
                    fArr[0] = (float) c0248a3.f(d7);
                    fArr[1] = (float) this.f16869e[i7].g(d7);
                    return;
                }
                c0248a3.k(d7);
                fArr[0] = (float) this.f16869e[i7].h();
                fArr[1] = (float) this.f16869e[i7].i();
                return;
            }
            i7++;
        }
    }

    @Override // u.b
    public double f(double d7, int i7) {
        C0248a[] c0248aArr = this.f16869e;
        int i8 = 0;
        double d8 = c0248aArr[0].f16876c;
        if (d7 < d8) {
            d7 = d8;
        }
        if (d7 > c0248aArr[c0248aArr.length - 1].f16877d) {
            d7 = c0248aArr[c0248aArr.length - 1].f16877d;
        }
        while (true) {
            C0248a[] c0248aArr2 = this.f16869e;
            if (i8 >= c0248aArr2.length) {
                return Double.NaN;
            }
            C0248a c0248a = c0248aArr2[i8];
            if (d7 <= c0248a.f16877d) {
                if (c0248a.f16891r) {
                    return i7 == 0 ? c0248a.d(d7) : c0248a.e(d7);
                }
                c0248a.k(d7);
                return i7 == 0 ? this.f16869e[i8].b() : this.f16869e[i8].c();
            }
            i8++;
        }
    }

    @Override // u.b
    public void g(double d7, double[] dArr) {
        C0248a[] c0248aArr = this.f16869e;
        double d8 = c0248aArr[0].f16876c;
        if (d7 < d8) {
            d7 = d8;
        } else if (d7 > c0248aArr[c0248aArr.length - 1].f16877d) {
            d7 = c0248aArr[c0248aArr.length - 1].f16877d;
        }
        int i7 = 0;
        while (true) {
            C0248a[] c0248aArr2 = this.f16869e;
            if (i7 >= c0248aArr2.length) {
                return;
            }
            C0248a c0248a = c0248aArr2[i7];
            if (d7 <= c0248a.f16877d) {
                if (c0248a.f16891r) {
                    dArr[0] = c0248a.d(d7);
                    dArr[1] = this.f16869e[i7].e(d7);
                    return;
                }
                c0248a.k(d7);
                dArr[0] = this.f16869e[i7].b();
                dArr[1] = this.f16869e[i7].c();
                return;
            }
            i7++;
        }
    }

    @Override // u.b
    public double[] h() {
        return this.f16868d;
    }
}
