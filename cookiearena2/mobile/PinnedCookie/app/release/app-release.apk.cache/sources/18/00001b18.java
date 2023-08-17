package u;

import java.util.Arrays;

/* loaded from: classes.dex */
public class u {

    /* renamed from: m  reason: collision with root package name */
    public static final int f17087m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f17088n = 10;

    /* renamed from: o  reason: collision with root package name */
    public static final int f17089o = 10;

    /* renamed from: p  reason: collision with root package name */
    public static final int f17090p = 5;

    /* renamed from: a  reason: collision with root package name */
    public int[] f17091a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    public int[] f17092b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public int f17093c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int[] f17094d = new int[10];

    /* renamed from: e  reason: collision with root package name */
    public float[] f17095e = new float[10];

    /* renamed from: f  reason: collision with root package name */
    public int f17096f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int[] f17097g = new int[5];

    /* renamed from: h  reason: collision with root package name */
    public String[] f17098h = new String[5];

    /* renamed from: i  reason: collision with root package name */
    public int f17099i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int[] f17100j = new int[4];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f17101k = new boolean[4];

    /* renamed from: l  reason: collision with root package name */
    public int f17102l = 0;

    public void a(int i7, float f7) {
        int i8 = this.f17096f;
        int[] iArr = this.f17094d;
        if (i8 >= iArr.length) {
            this.f17094d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f17095e;
            this.f17095e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f17094d;
        int i9 = this.f17096f;
        iArr2[i9] = i7;
        float[] fArr2 = this.f17095e;
        this.f17096f = i9 + 1;
        fArr2[i9] = f7;
    }

    public void b(int i7, int i8) {
        int i9 = this.f17093c;
        int[] iArr = this.f17091a;
        if (i9 >= iArr.length) {
            this.f17091a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f17092b;
            this.f17092b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f17091a;
        int i10 = this.f17093c;
        iArr3[i10] = i7;
        int[] iArr4 = this.f17092b;
        this.f17093c = i10 + 1;
        iArr4[i10] = i8;
    }

    public void c(int i7, String str) {
        int i8 = this.f17099i;
        int[] iArr = this.f17097g;
        if (i8 >= iArr.length) {
            this.f17097g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f17098h;
            this.f17098h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f17097g;
        int i9 = this.f17099i;
        iArr2[i9] = i7;
        String[] strArr2 = this.f17098h;
        this.f17099i = i9 + 1;
        strArr2[i9] = str;
    }

    public void d(int i7, boolean z6) {
        int i8 = this.f17102l;
        int[] iArr = this.f17100j;
        if (i8 >= iArr.length) {
            this.f17100j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f17101k;
            this.f17101k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f17100j;
        int i9 = this.f17102l;
        iArr2[i9] = i7;
        boolean[] zArr2 = this.f17101k;
        this.f17102l = i9 + 1;
        zArr2[i9] = z6;
    }

    public void e(int i7, String str) {
        if (str != null) {
            c(i7, str);
        }
    }

    public void f(u uVar) {
        for (int i7 = 0; i7 < this.f17093c; i7++) {
            uVar.b(this.f17091a[i7], this.f17092b[i7]);
        }
        for (int i8 = 0; i8 < this.f17096f; i8++) {
            uVar.a(this.f17094d[i8], this.f17095e[i8]);
        }
        for (int i9 = 0; i9 < this.f17099i; i9++) {
            uVar.c(this.f17097g[i9], this.f17098h[i9]);
        }
        for (int i10 = 0; i10 < this.f17102l; i10++) {
            uVar.d(this.f17100j[i10], this.f17101k[i10]);
        }
    }

    public void g(v vVar) {
        for (int i7 = 0; i7 < this.f17093c; i7++) {
            vVar.b(this.f17091a[i7], this.f17092b[i7]);
        }
        for (int i8 = 0; i8 < this.f17096f; i8++) {
            vVar.c(this.f17094d[i8], this.f17095e[i8]);
        }
        for (int i9 = 0; i9 < this.f17099i; i9++) {
            vVar.d(this.f17097g[i9], this.f17098h[i9]);
        }
        for (int i10 = 0; i10 < this.f17102l; i10++) {
            vVar.e(this.f17100j[i10], this.f17101k[i10]);
        }
    }

    public void h() {
        this.f17102l = 0;
        this.f17099i = 0;
        this.f17096f = 0;
        this.f17093c = 0;
    }

    public int i(int i7) {
        for (int i8 = 0; i8 < this.f17093c; i8++) {
            if (this.f17091a[i8] == i7) {
                return this.f17092b[i8];
            }
        }
        return -1;
    }
}