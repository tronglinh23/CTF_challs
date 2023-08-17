package q;

import java.util.Arrays;
import java.util.Comparator;
import q.b;

/* loaded from: classes.dex */
public class h extends q.b {

    /* renamed from: o  reason: collision with root package name */
    public static final float f15066o = 1.0E-4f;

    /* renamed from: p  reason: collision with root package name */
    public static final boolean f15067p = false;

    /* renamed from: q  reason: collision with root package name */
    public static final int f15068q = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f15069i;

    /* renamed from: j  reason: collision with root package name */
    public i[] f15070j;

    /* renamed from: k  reason: collision with root package name */
    public i[] f15071k;

    /* renamed from: l  reason: collision with root package name */
    public int f15072l;

    /* renamed from: m  reason: collision with root package name */
    public b f15073m;

    /* renamed from: n  reason: collision with root package name */
    public c f15074n;

    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f15081m - iVar2.f15081m;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public i f15076a;

        /* renamed from: b  reason: collision with root package name */
        public h f15077b;

        public b(h hVar) {
            this.f15077b = hVar;
        }

        public void a(i iVar) {
            for (int i7 = 0; i7 < 9; i7++) {
                float[] fArr = this.f15076a.f15087s;
                float f7 = fArr[i7] + iVar.f15087s[i7];
                fArr[i7] = f7;
                if (Math.abs(f7) < 1.0E-4f) {
                    this.f15076a.f15087s[i7] = 0.0f;
                }
            }
        }

        public boolean b(i iVar, float f7) {
            boolean z6 = true;
            if (!this.f15076a.f15079k) {
                for (int i7 = 0; i7 < 9; i7++) {
                    float f8 = iVar.f15087s[i7];
                    if (f8 != 0.0f) {
                        float f9 = f8 * f7;
                        if (Math.abs(f9) < 1.0E-4f) {
                            f9 = 0.0f;
                        }
                        this.f15076a.f15087s[i7] = f9;
                    } else {
                        this.f15076a.f15087s[i7] = 0.0f;
                    }
                }
                return true;
            }
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.f15076a.f15087s;
                float f10 = fArr[i8] + (iVar.f15087s[i8] * f7);
                fArr[i8] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.f15076a.f15087s[i8] = 0.0f;
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                h.this.J(this.f15076a);
            }
            return false;
        }

        public void c(i iVar) {
            this.f15076a = iVar;
        }

        public final boolean d() {
            for (int i7 = 8; i7 >= 0; i7--) {
                float f7 = this.f15076a.f15087s[i7];
                if (f7 > 0.0f) {
                    return false;
                }
                if (f7 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i7 = 0; i7 < 9; i7++) {
                if (this.f15076a.f15087s[i7] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(i iVar) {
            int i7 = 8;
            while (true) {
                if (i7 < 0) {
                    break;
                }
                float f7 = iVar.f15087s[i7];
                float f8 = this.f15076a.f15087s[i7];
                if (f8 == f7) {
                    i7--;
                } else if (f8 < f7) {
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f15076a.f15087s, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f15076a != null) {
                for (int i7 = 0; i7 < 9; i7++) {
                    str = str + this.f15076a.f15087s[i7] + " ";
                }
            }
            return str + "] " + this.f15076a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f15069i = 128;
        this.f15070j = new i[128];
        this.f15071k = new i[128];
        this.f15072l = 0;
        this.f15073m = new b(this);
        this.f15074n = cVar;
    }

    public final void I(i iVar) {
        int i7;
        int i8 = this.f15072l + 1;
        i[] iVarArr = this.f15070j;
        if (i8 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f15070j = iVarArr2;
            this.f15071k = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f15070j;
        int i9 = this.f15072l;
        iVarArr3[i9] = iVar;
        int i10 = i9 + 1;
        this.f15072l = i10;
        if (i10 > 1 && iVarArr3[i10 - 1].f15081m > iVar.f15081m) {
            int i11 = 0;
            while (true) {
                i7 = this.f15072l;
                if (i11 >= i7) {
                    break;
                }
                this.f15071k[i11] = this.f15070j[i11];
                i11++;
            }
            Arrays.sort(this.f15071k, 0, i7, new a());
            for (int i12 = 0; i12 < this.f15072l; i12++) {
                this.f15070j[i12] = this.f15071k[i12];
            }
        }
        iVar.f15079k = true;
        iVar.c(this);
    }

    public final void J(i iVar) {
        int i7 = 0;
        while (i7 < this.f15072l) {
            if (this.f15070j[i7] == iVar) {
                while (true) {
                    int i8 = this.f15072l;
                    if (i7 >= i8 - 1) {
                        this.f15072l = i8 - 1;
                        iVar.f15079k = false;
                        return;
                    }
                    i[] iVarArr = this.f15070j;
                    int i9 = i7 + 1;
                    iVarArr[i7] = iVarArr[i9];
                    i7 = i9;
                }
            } else {
                i7++;
            }
        }
    }

    @Override // q.b, q.e.a
    public i b(e eVar, boolean[] zArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < this.f15072l; i8++) {
            i iVar = this.f15070j[i8];
            if (!zArr[iVar.f15081m]) {
                this.f15073m.c(iVar);
                if (i7 == -1) {
                    if (!this.f15073m.d()) {
                    }
                    i7 = i8;
                } else {
                    if (!this.f15073m.f(this.f15070j[i7])) {
                    }
                    i7 = i8;
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f15070j[i7];
    }

    @Override // q.b, q.e.a
    public void clear() {
        this.f15072l = 0;
        this.f15001b = 0.0f;
    }

    @Override // q.b, q.e.a
    public void e(e eVar, q.b bVar, boolean z6) {
        i iVar = bVar.f15000a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f15004e;
        int f7 = aVar.f();
        for (int i7 = 0; i7 < f7; i7++) {
            i j7 = aVar.j(i7);
            float a7 = aVar.a(i7);
            this.f15073m.c(j7);
            if (this.f15073m.b(iVar, a7)) {
                I(j7);
            }
            this.f15001b += bVar.f15001b * a7;
        }
        J(iVar);
    }

    @Override // q.b, q.e.a
    public void f(i iVar) {
        this.f15073m.c(iVar);
        this.f15073m.g();
        iVar.f15087s[iVar.f15083o] = 1.0f;
        I(iVar);
    }

    @Override // q.b, q.e.a
    public boolean isEmpty() {
        return this.f15072l == 0;
    }

    @Override // q.b
    public String toString() {
        String str = " goal -> (" + this.f15001b + ") : ";
        for (int i7 = 0; i7 < this.f15072l; i7++) {
            this.f15073m.c(this.f15070j[i7]);
            str = str + this.f15073m + " ";
        }
        return str;
    }
}