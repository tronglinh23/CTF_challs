package q;

import java.util.Arrays;
import q.b;
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f14983l = false;

    /* renamed from: m  reason: collision with root package name */
    public static final int f14984m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f14985n = false;

    /* renamed from: o  reason: collision with root package name */
    public static float f14986o = 0.001f;

    /* renamed from: b  reason: collision with root package name */
    public final b f14988b;

    /* renamed from: c  reason: collision with root package name */
    public final c f14989c;

    /* renamed from: a  reason: collision with root package name */
    public int f14987a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f14990d = 8;

    /* renamed from: e  reason: collision with root package name */
    public i f14991e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f14992f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f14993g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    public float[] f14994h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    public int f14995i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f14996j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14997k = false;

    public a(b bVar, c cVar) {
        this.f14988b = bVar;
        this.f14989c = cVar;
    }

    @Override // q.b.a
    public float a(int i7) {
        int i8 = this.f14995i;
        for (int i9 = 0; i8 != -1 && i9 < this.f14987a; i9++) {
            if (i9 == i7) {
                return this.f14994h[i8];
            }
            i8 = this.f14993g[i8];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public void b(i iVar, float f7, boolean z6) {
        float f8 = f14986o;
        if (f7 <= (-f8) || f7 >= f8) {
            int i7 = this.f14995i;
            if (i7 == -1) {
                this.f14995i = 0;
                this.f14994h[0] = f7;
                this.f14992f[0] = iVar.f15081m;
                this.f14993g[0] = -1;
                iVar.f15091w++;
                iVar.c(this.f14988b);
                this.f14987a++;
                if (this.f14997k) {
                    return;
                }
                int i8 = this.f14996j + 1;
                this.f14996j = i8;
                int[] iArr = this.f14992f;
                if (i8 >= iArr.length) {
                    this.f14997k = true;
                    this.f14996j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f14987a; i10++) {
                int i11 = this.f14992f[i7];
                int i12 = iVar.f15081m;
                if (i11 == i12) {
                    float[] fArr = this.f14994h;
                    float f9 = fArr[i7] + f7;
                    float f10 = f14986o;
                    if (f9 > (-f10) && f9 < f10) {
                        f9 = 0.0f;
                    }
                    fArr[i7] = f9;
                    if (f9 == 0.0f) {
                        if (i7 == this.f14995i) {
                            this.f14995i = this.f14993g[i7];
                        } else {
                            int[] iArr2 = this.f14993g;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z6) {
                            iVar.k(this.f14988b);
                        }
                        if (this.f14997k) {
                            this.f14996j = i7;
                        }
                        iVar.f15091w--;
                        this.f14987a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f14993g[i7];
            }
            int i13 = this.f14996j;
            int i14 = i13 + 1;
            if (this.f14997k) {
                int[] iArr3 = this.f14992f;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f14992f;
            if (i13 >= iArr4.length && this.f14987a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f14992f;
                    if (i15 >= iArr5.length) {
                        break;
                    } else if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            int[] iArr6 = this.f14992f;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f14990d * 2;
                this.f14990d = i16;
                this.f14997k = false;
                this.f14996j = i13 - 1;
                this.f14994h = Arrays.copyOf(this.f14994h, i16);
                this.f14992f = Arrays.copyOf(this.f14992f, this.f14990d);
                this.f14993g = Arrays.copyOf(this.f14993g, this.f14990d);
            }
            this.f14992f[i13] = iVar.f15081m;
            this.f14994h[i13] = f7;
            if (i9 != -1) {
                int[] iArr7 = this.f14993g;
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                this.f14993g[i13] = this.f14995i;
                this.f14995i = i13;
            }
            iVar.f15091w++;
            iVar.c(this.f14988b);
            this.f14987a++;
            if (!this.f14997k) {
                this.f14996j++;
            }
            int i17 = this.f14996j;
            int[] iArr8 = this.f14992f;
            if (i17 >= iArr8.length) {
                this.f14997k = true;
                this.f14996j = iArr8.length - 1;
            }
        }
    }

    @Override // q.b.a
    public final float c(i iVar) {
        int i7 = this.f14995i;
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            if (this.f14992f[i7] == iVar.f15081m) {
                return this.f14994h[i7];
            }
            i7 = this.f14993g[i7];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public final void clear() {
        int i7 = this.f14995i;
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            i iVar = this.f14989c.f15009d[this.f14992f[i7]];
            if (iVar != null) {
                iVar.k(this.f14988b);
            }
            i7 = this.f14993g[i7];
        }
        this.f14995i = -1;
        this.f14996j = -1;
        this.f14997k = false;
        this.f14987a = 0;
    }

    @Override // q.b.a
    public void d() {
        int i7 = this.f14987a;
        System.out.print("{ ");
        for (int i8 = 0; i8 < i7; i8++) {
            i j7 = j(i8);
            if (j7 != null) {
                System.out.print(j7 + " = " + a(i8) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // q.b.a
    public final void e(i iVar, float f7) {
        if (f7 == 0.0f) {
            k(iVar, true);
            return;
        }
        int i7 = this.f14995i;
        if (i7 == -1) {
            this.f14995i = 0;
            this.f14994h[0] = f7;
            this.f14992f[0] = iVar.f15081m;
            this.f14993g[0] = -1;
            iVar.f15091w++;
            iVar.c(this.f14988b);
            this.f14987a++;
            if (this.f14997k) {
                return;
            }
            int i8 = this.f14996j + 1;
            this.f14996j = i8;
            int[] iArr = this.f14992f;
            if (i8 >= iArr.length) {
                this.f14997k = true;
                this.f14996j = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f14987a; i10++) {
            int i11 = this.f14992f[i7];
            int i12 = iVar.f15081m;
            if (i11 == i12) {
                this.f14994h[i7] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f14993g[i7];
        }
        int i13 = this.f14996j;
        int i14 = i13 + 1;
        if (this.f14997k) {
            int[] iArr2 = this.f14992f;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f14992f;
        if (i13 >= iArr3.length && this.f14987a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f14992f;
                if (i15 >= iArr4.length) {
                    break;
                } else if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                } else {
                    i15++;
                }
            }
        }
        int[] iArr5 = this.f14992f;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f14990d * 2;
            this.f14990d = i16;
            this.f14997k = false;
            this.f14996j = i13 - 1;
            this.f14994h = Arrays.copyOf(this.f14994h, i16);
            this.f14992f = Arrays.copyOf(this.f14992f, this.f14990d);
            this.f14993g = Arrays.copyOf(this.f14993g, this.f14990d);
        }
        this.f14992f[i13] = iVar.f15081m;
        this.f14994h[i13] = f7;
        if (i9 != -1) {
            int[] iArr6 = this.f14993g;
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            this.f14993g[i13] = this.f14995i;
            this.f14995i = i13;
        }
        iVar.f15091w++;
        iVar.c(this.f14988b);
        int i17 = this.f14987a + 1;
        this.f14987a = i17;
        if (!this.f14997k) {
            this.f14996j++;
        }
        int[] iArr7 = this.f14992f;
        if (i17 >= iArr7.length) {
            this.f14997k = true;
        }
        if (this.f14996j >= iArr7.length) {
            this.f14997k = true;
            this.f14996j = iArr7.length - 1;
        }
    }

    @Override // q.b.a
    public int f() {
        return this.f14987a;
    }

    @Override // q.b.a
    public int g(i iVar) {
        int i7 = this.f14995i;
        if (i7 == -1) {
            return -1;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            if (this.f14992f[i7] == iVar.f15081m) {
                return i7;
            }
            i7 = this.f14993g[i7];
        }
        return -1;
    }

    @Override // q.b.a
    public float h(b bVar, boolean z6) {
        float c7 = c(bVar.f15000a);
        k(bVar.f15000a, z6);
        b.a aVar = bVar.f15004e;
        int f7 = aVar.f();
        for (int i7 = 0; i7 < f7; i7++) {
            i j7 = aVar.j(i7);
            b(j7, aVar.c(j7) * c7, z6);
        }
        return c7;
    }

    @Override // q.b.a
    public int i() {
        return (this.f14992f.length * 4 * 3) + 0 + 36;
    }

    @Override // q.b.a
    public i j(int i7) {
        int i8 = this.f14995i;
        for (int i9 = 0; i8 != -1 && i9 < this.f14987a; i9++) {
            if (i9 == i7) {
                return this.f14989c.f15009d[this.f14992f[i8]];
            }
            i8 = this.f14993g[i8];
        }
        return null;
    }

    @Override // q.b.a
    public final float k(i iVar, boolean z6) {
        if (this.f14991e == iVar) {
            this.f14991e = null;
        }
        int i7 = this.f14995i;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f14987a) {
            if (this.f14992f[i7] == iVar.f15081m) {
                if (i7 == this.f14995i) {
                    this.f14995i = this.f14993g[i7];
                } else {
                    int[] iArr = this.f14993g;
                    iArr[i9] = iArr[i7];
                }
                if (z6) {
                    iVar.k(this.f14988b);
                }
                iVar.f15091w--;
                this.f14987a--;
                this.f14992f[i7] = -1;
                if (this.f14997k) {
                    this.f14996j = i7;
                }
                return this.f14994h[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f14993g[i7];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public boolean l(i iVar) {
        int i7 = this.f14995i;
        if (i7 == -1) {
            return false;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            if (this.f14992f[i7] == iVar.f15081m) {
                return true;
            }
            i7 = this.f14993g[i7];
        }
        return false;
    }

    @Override // q.b.a
    public void m(float f7) {
        int i7 = this.f14995i;
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            float[] fArr = this.f14994h;
            fArr[i7] = fArr[i7] / f7;
            i7 = this.f14993g[i7];
        }
    }

    @Override // q.b.a
    public void n() {
        int i7 = this.f14995i;
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            float[] fArr = this.f14994h;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f14993g[i7];
        }
    }

    public int o() {
        return this.f14995i;
    }

    public final int p(int i7) {
        return this.f14992f[i7];
    }

    public final int q(int i7) {
        return this.f14993g[i7];
    }

    public i r() {
        i iVar = this.f14991e;
        if (iVar == null) {
            int i7 = this.f14995i;
            i iVar2 = null;
            for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
                if (this.f14994h[i7] < 0.0f) {
                    i iVar3 = this.f14989c.f15009d[this.f14992f[i7]];
                    if (iVar2 == null || iVar2.f15083o < iVar3.f15083o) {
                        iVar2 = iVar3;
                    }
                }
                i7 = this.f14993g[i7];
            }
            return iVar2;
        }
        return iVar;
    }

    public final float s(int i7) {
        return this.f14994h[i7];
    }

    public boolean t() {
        int i7 = this.f14995i;
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            if (this.f14994h[i7] > 0.0f) {
                return true;
            }
            i7 = this.f14993g[i7];
        }
        return false;
    }

    public String toString() {
        int i7 = this.f14995i;
        String str = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f14987a; i8++) {
            str = ((str + " -> ") + this.f14994h[i7] + " : ") + this.f14989c.f15009d[this.f14992f[i7]];
            i7 = this.f14993g[i7];
        }
        return str;
    }
}
