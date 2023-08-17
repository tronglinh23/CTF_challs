package q;

import java.util.Arrays;
import q.b;
/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f15102n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f15103o = true;

    /* renamed from: p  reason: collision with root package name */
    public static float f15104p = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    public final int f15105a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f15106b = 16;

    /* renamed from: c  reason: collision with root package name */
    public int f15107c = 16;

    /* renamed from: d  reason: collision with root package name */
    public int[] f15108d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public int[] f15109e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f15110f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public float[] f15111g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public int[] f15112h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    public int[] f15113i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    public int f15114j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f15115k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final b f15116l;

    /* renamed from: m  reason: collision with root package name */
    public final c f15117m;

    public j(b bVar, c cVar) {
        this.f15116l = bVar;
        this.f15117m = cVar;
        clear();
    }

    @Override // q.b.a
    public float a(int i7) {
        int i8 = this.f15114j;
        int i9 = this.f15115k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7) {
                return this.f15111g[i9];
            }
            i9 = this.f15113i[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // q.b.a
    public void b(i iVar, float f7, boolean z6) {
        float f8 = f15104p;
        if (f7 <= (-f8) || f7 >= f8) {
            int g7 = g(iVar);
            if (g7 == -1) {
                e(iVar, f7);
                return;
            }
            float[] fArr = this.f15111g;
            float f9 = fArr[g7] + f7;
            fArr[g7] = f9;
            float f10 = f15104p;
            if (f9 <= (-f10) || f9 >= f10) {
                return;
            }
            fArr[g7] = 0.0f;
            k(iVar, z6);
        }
    }

    @Override // q.b.a
    public float c(i iVar) {
        int g7 = g(iVar);
        if (g7 != -1) {
            return this.f15111g[g7];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public void clear() {
        int i7 = this.f15114j;
        for (int i8 = 0; i8 < i7; i8++) {
            i j7 = j(i8);
            if (j7 != null) {
                j7.k(this.f15116l);
            }
        }
        for (int i9 = 0; i9 < this.f15106b; i9++) {
            this.f15110f[i9] = -1;
            this.f15109e[i9] = -1;
        }
        for (int i10 = 0; i10 < this.f15107c; i10++) {
            this.f15108d[i10] = -1;
        }
        this.f15114j = 0;
        this.f15115k = -1;
    }

    @Override // q.b.a
    public void d() {
        int i7 = this.f15114j;
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
    public void e(i iVar, float f7) {
        float f8 = f15104p;
        if (f7 > (-f8) && f7 < f8) {
            k(iVar, true);
            return;
        }
        if (this.f15114j == 0) {
            p(0, iVar, f7);
            o(iVar, 0);
            this.f15115k = 0;
            return;
        }
        int g7 = g(iVar);
        if (g7 != -1) {
            this.f15111g[g7] = f7;
            return;
        }
        if (this.f15114j + 1 >= this.f15106b) {
            s();
        }
        int i7 = this.f15114j;
        int i8 = this.f15115k;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f15110f[i8];
            int i12 = iVar.f15081m;
            if (i11 == i12) {
                this.f15111g[i8] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f15113i[i8];
            if (i8 == -1) {
                break;
            }
        }
        t(i9, iVar, f7);
    }

    @Override // q.b.a
    public int f() {
        return this.f15114j;
    }

    @Override // q.b.a
    public int g(i iVar) {
        if (this.f15114j != 0 && iVar != null) {
            int i7 = iVar.f15081m;
            int i8 = this.f15108d[i7 % this.f15107c];
            if (i8 == -1) {
                return -1;
            }
            if (this.f15110f[i8] == i7) {
                return i8;
            }
            do {
                i8 = this.f15109e[i8];
                if (i8 == -1) {
                    break;
                }
            } while (this.f15110f[i8] != i7);
            if (i8 != -1 && this.f15110f[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // q.b.a
    public float h(b bVar, boolean z6) {
        float c7 = c(bVar.f15000a);
        k(bVar.f15000a, z6);
        j jVar = (j) bVar.f15004e;
        int f7 = jVar.f();
        int i7 = 0;
        int i8 = 0;
        while (i7 < f7) {
            int i9 = jVar.f15110f[i8];
            if (i9 != -1) {
                b(this.f15117m.f15009d[i9], jVar.f15111g[i8] * c7, z6);
                i7++;
            }
            i8++;
        }
        return c7;
    }

    @Override // q.b.a
    public int i() {
        return 0;
    }

    @Override // q.b.a
    public i j(int i7) {
        int i8 = this.f15114j;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f15115k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7 && i9 != -1) {
                return this.f15117m.f15009d[this.f15110f[i9]];
            }
            i9 = this.f15113i[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // q.b.a
    public float k(i iVar, boolean z6) {
        int g7 = g(iVar);
        if (g7 == -1) {
            return 0.0f;
        }
        u(iVar);
        float f7 = this.f15111g[g7];
        if (this.f15115k == g7) {
            this.f15115k = this.f15113i[g7];
        }
        this.f15110f[g7] = -1;
        int[] iArr = this.f15112h;
        int i7 = iArr[g7];
        if (i7 != -1) {
            int[] iArr2 = this.f15113i;
            iArr2[i7] = iArr2[g7];
        }
        int i8 = this.f15113i[g7];
        if (i8 != -1) {
            iArr[i8] = iArr[g7];
        }
        this.f15114j--;
        iVar.f15091w--;
        if (z6) {
            iVar.k(this.f15116l);
        }
        return f7;
    }

    @Override // q.b.a
    public boolean l(i iVar) {
        return g(iVar) != -1;
    }

    @Override // q.b.a
    public void m(float f7) {
        int i7 = this.f15114j;
        int i8 = this.f15115k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f15111g;
            fArr[i8] = fArr[i8] / f7;
            i8 = this.f15113i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // q.b.a
    public void n() {
        int i7 = this.f15114j;
        int i8 = this.f15115k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f15111g;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f15113i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    public final void o(i iVar, int i7) {
        int[] iArr;
        int i8 = iVar.f15081m % this.f15107c;
        int[] iArr2 = this.f15108d;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i7;
        } else {
            while (true) {
                iArr = this.f15109e;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                }
                i9 = i10;
            }
            iArr[i9] = i7;
        }
        this.f15109e[i7] = -1;
    }

    public final void p(int i7, i iVar, float f7) {
        this.f15110f[i7] = iVar.f15081m;
        this.f15111g[i7] = f7;
        this.f15112h[i7] = -1;
        this.f15113i[i7] = -1;
        iVar.c(this.f15116l);
        iVar.f15091w++;
        this.f15114j++;
    }

    public final void q() {
        for (int i7 = 0; i7 < this.f15107c; i7++) {
            if (this.f15108d[i7] != -1) {
                String str = hashCode() + " hash [" + i7 + "] => ";
                int i8 = this.f15108d[i7];
                boolean z6 = false;
                while (!z6) {
                    str = str + " " + this.f15110f[i8];
                    int i9 = this.f15109e[i8];
                    if (i9 != -1) {
                        i8 = i9;
                    } else {
                        z6 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    public final int r() {
        for (int i7 = 0; i7 < this.f15106b; i7++) {
            if (this.f15110f[i7] == -1) {
                return i7;
            }
        }
        return -1;
    }

    public final void s() {
        int i7 = this.f15106b * 2;
        this.f15110f = Arrays.copyOf(this.f15110f, i7);
        this.f15111g = Arrays.copyOf(this.f15111g, i7);
        this.f15112h = Arrays.copyOf(this.f15112h, i7);
        this.f15113i = Arrays.copyOf(this.f15113i, i7);
        this.f15109e = Arrays.copyOf(this.f15109e, i7);
        for (int i8 = this.f15106b; i8 < i7; i8++) {
            this.f15110f[i8] = -1;
            this.f15109e[i8] = -1;
        }
        this.f15106b = i7;
    }

    public final void t(int i7, i iVar, float f7) {
        int r6 = r();
        p(r6, iVar, f7);
        if (i7 != -1) {
            this.f15112h[r6] = i7;
            int[] iArr = this.f15113i;
            iArr[r6] = iArr[i7];
            iArr[i7] = r6;
        } else {
            this.f15112h[r6] = -1;
            if (this.f15114j > 0) {
                this.f15113i[r6] = this.f15115k;
                this.f15115k = r6;
            } else {
                this.f15113i[r6] = -1;
            }
        }
        int i8 = this.f15113i[r6];
        if (i8 != -1) {
            this.f15112h[i8] = r6;
        }
        o(iVar, r6);
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i7 = this.f15114j;
        for (int i8 = 0; i8 < i7; i8++) {
            i j7 = j(i8);
            if (j7 != null) {
                String str2 = str + j7 + " = " + a(i8) + " ";
                int g7 = g(j7);
                String str3 = str2 + "[p: ";
                String str4 = (this.f15112h[g7] != -1 ? str3 + this.f15117m.f15009d[this.f15110f[this.f15112h[g7]]] : str3 + "none") + ", n: ";
                str = (this.f15113i[g7] != -1 ? str4 + this.f15117m.f15009d[this.f15110f[this.f15113i[g7]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    public final void u(i iVar) {
        int[] iArr;
        int i7;
        int i8 = iVar.f15081m;
        int i9 = i8 % this.f15107c;
        int[] iArr2 = this.f15108d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            return;
        }
        if (this.f15110f[i10] == i8) {
            int[] iArr3 = this.f15109e;
            iArr2[i9] = iArr3[i10];
            iArr3[i10] = -1;
            return;
        }
        while (true) {
            iArr = this.f15109e;
            i7 = iArr[i10];
            if (i7 == -1 || this.f15110f[i7] == i8) {
                break;
            }
            i10 = i7;
        }
        if (i7 == -1 || this.f15110f[i7] != i8) {
            return;
        }
        iArr[i10] = iArr[i7];
        iArr[i7] = -1;
    }
}
