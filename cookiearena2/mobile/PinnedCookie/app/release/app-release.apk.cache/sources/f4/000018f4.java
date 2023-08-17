package q;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable<i> {
    public static final boolean B = false;
    public static final boolean C = false;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = 7;
    public static final int L = 8;
    public static int M = 1;
    public static int N = 1;
    public static int O = 1;
    public static int P = 1;
    public static int Q = 1;
    public static final int R = 9;
    public HashSet<q.b> A;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15079k;

    /* renamed from: l  reason: collision with root package name */
    public String f15080l;

    /* renamed from: m  reason: collision with root package name */
    public int f15081m;

    /* renamed from: n  reason: collision with root package name */
    public int f15082n;

    /* renamed from: o  reason: collision with root package name */
    public int f15083o;

    /* renamed from: p  reason: collision with root package name */
    public float f15084p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15085q;

    /* renamed from: r  reason: collision with root package name */
    public float[] f15086r;

    /* renamed from: s  reason: collision with root package name */
    public float[] f15087s;

    /* renamed from: t  reason: collision with root package name */
    public b f15088t;

    /* renamed from: u  reason: collision with root package name */
    public q.b[] f15089u;

    /* renamed from: v  reason: collision with root package name */
    public int f15090v;

    /* renamed from: w  reason: collision with root package name */
    public int f15091w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15092x;

    /* renamed from: y  reason: collision with root package name */
    public int f15093y;

    /* renamed from: z  reason: collision with root package name */
    public float f15094z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15095a;

        static {
            int[] iArr = new int[b.values().length];
            f15095a = iArr;
            try {
                iArr[b.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15095a[b.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15095a[b.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15095a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15095a[b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(String str, b bVar) {
        this.f15081m = -1;
        this.f15082n = -1;
        this.f15083o = 0;
        this.f15085q = false;
        this.f15086r = new float[9];
        this.f15087s = new float[9];
        this.f15089u = new q.b[16];
        this.f15090v = 0;
        this.f15091w = 0;
        this.f15092x = false;
        this.f15093y = -1;
        this.f15094z = 0.0f;
        this.A = null;
        this.f15080l = str;
        this.f15088t = bVar;
    }

    public static String i(b bVar, String str) {
        if (str != null) {
            return str + N;
        }
        int i7 = a.f15095a[bVar.ordinal()];
        if (i7 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("U");
            int i8 = O + 1;
            O = i8;
            sb.append(i8);
            return sb.toString();
        } else if (i7 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("C");
            int i9 = P + 1;
            P = i9;
            sb2.append(i9);
            return sb2.toString();
        } else if (i7 == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("S");
            int i10 = M + 1;
            M = i10;
            sb3.append(i10);
            return sb3.toString();
        } else if (i7 == 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("e");
            int i11 = N + 1;
            N = i11;
            sb4.append(i11);
            return sb4.toString();
        } else if (i7 == 5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("V");
            int i12 = Q + 1;
            Q = i12;
            sb5.append(i12);
            return sb5.toString();
        } else {
            throw new AssertionError(bVar.name());
        }
    }

    public static void j() {
        N++;
    }

    public final void c(q.b bVar) {
        int i7 = 0;
        while (true) {
            int i8 = this.f15090v;
            if (i7 >= i8) {
                q.b[] bVarArr = this.f15089u;
                if (i8 >= bVarArr.length) {
                    this.f15089u = (q.b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                q.b[] bVarArr2 = this.f15089u;
                int i9 = this.f15090v;
                bVarArr2[i9] = bVar;
                this.f15090v = i9 + 1;
                return;
            } else if (this.f15089u[i7] == bVar) {
                return;
            } else {
                i7++;
            }
        }
    }

    public void d() {
        for (int i7 = 0; i7 < 9; i7++) {
            this.f15086r[i7] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f15081m - iVar.f15081m;
    }

    public String h() {
        return this.f15080l;
    }

    public final void k(q.b bVar) {
        int i7 = this.f15090v;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f15089u[i8] == bVar) {
                while (i8 < i7 - 1) {
                    q.b[] bVarArr = this.f15089u;
                    int i9 = i8 + 1;
                    bVarArr[i8] = bVarArr[i9];
                    i8 = i9;
                }
                this.f15090v--;
                return;
            }
            i8++;
        }
    }

    public void l() {
        this.f15080l = null;
        this.f15088t = b.UNKNOWN;
        this.f15083o = 0;
        this.f15081m = -1;
        this.f15082n = -1;
        this.f15084p = 0.0f;
        this.f15085q = false;
        this.f15092x = false;
        this.f15093y = -1;
        this.f15094z = 0.0f;
        int i7 = this.f15090v;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f15089u[i8] = null;
        }
        this.f15090v = 0;
        this.f15091w = 0;
        this.f15079k = false;
        Arrays.fill(this.f15087s, 0.0f);
    }

    public void m(e eVar, float f7) {
        this.f15084p = f7;
        this.f15085q = true;
        this.f15092x = false;
        this.f15093y = -1;
        this.f15094z = 0.0f;
        int i7 = this.f15090v;
        this.f15082n = -1;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f15089u[i8].c(eVar, this, false);
        }
        this.f15090v = 0;
    }

    public void n(String str) {
        this.f15080l = str;
    }

    public void o(e eVar, i iVar, float f7) {
        this.f15092x = true;
        this.f15093y = iVar.f15081m;
        this.f15094z = f7;
        int i7 = this.f15090v;
        this.f15082n = -1;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f15089u[i8].G(eVar, this, false);
        }
        this.f15090v = 0;
        eVar.z();
    }

    public void p(b bVar, String str) {
        this.f15088t = bVar;
    }

    public String q() {
        String str = this + "[";
        boolean z6 = false;
        boolean z7 = true;
        for (int i7 = 0; i7 < this.f15086r.length; i7++) {
            String str2 = str + this.f15086r[i7];
            float[] fArr = this.f15086r;
            float f7 = fArr[i7];
            if (f7 > 0.0f) {
                z6 = false;
            } else if (f7 < 0.0f) {
                z6 = true;
            }
            if (f7 != 0.0f) {
                z7 = false;
            }
            str = i7 < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z6) {
            str = str + " (-)";
        }
        if (z7) {
            return str + " (*)";
        }
        return str;
    }

    public final void r(e eVar, q.b bVar) {
        int i7 = this.f15090v;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f15089u[i8].e(eVar, bVar, false);
        }
        this.f15090v = 0;
    }

    public String toString() {
        if (this.f15080l != null) {
            return "" + this.f15080l;
        }
        return "" + this.f15081m;
    }

    public i(b bVar, String str) {
        this.f15081m = -1;
        this.f15082n = -1;
        this.f15083o = 0;
        this.f15085q = false;
        this.f15086r = new float[9];
        this.f15087s = new float[9];
        this.f15089u = new q.b[16];
        this.f15090v = 0;
        this.f15091w = 0;
        this.f15092x = false;
        this.f15093y = -1;
        this.f15094z = 0.0f;
        this.A = null;
        this.f15088t = bVar;
    }
}