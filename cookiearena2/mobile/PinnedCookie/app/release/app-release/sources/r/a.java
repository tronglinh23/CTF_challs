package r;

import androidx.core.view.u1;
/* loaded from: classes.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final String f15312i = "TransitionLayout";

    /* renamed from: a  reason: collision with root package name */
    public boolean f15313a;

    /* renamed from: b  reason: collision with root package name */
    public String f15314b;

    /* renamed from: c  reason: collision with root package name */
    public b f15315c;

    /* renamed from: d  reason: collision with root package name */
    public int f15316d;

    /* renamed from: e  reason: collision with root package name */
    public float f15317e;

    /* renamed from: f  reason: collision with root package name */
    public String f15318f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15319g;

    /* renamed from: h  reason: collision with root package name */
    public int f15320h;

    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0222a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15321a;

        static {
            int[] iArr = new int[b.values().length];
            f15321a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15321a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15321a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15321a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15321a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15321a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15321a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15321a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, b bVar) {
        this.f15313a = false;
        this.f15314b = str;
        this.f15315c = bVar;
    }

    public static int a(int i7) {
        int i8 = (i7 & (~(i7 >> 31))) - 255;
        return (i8 & (i8 >> 31)) + 255;
    }

    public static int f(float f7, float f8, float f9) {
        float f10 = f7 * 6.0f;
        int i7 = (int) f10;
        float f11 = f10 - i7;
        float f12 = f9 * 255.0f;
        int i8 = (int) (((1.0f - f8) * f12) + 0.5f);
        int i9 = (int) (((1.0f - (f11 * f8)) * f12) + 0.5f);
        int i10 = (int) (((1.0f - ((1.0f - f11) * f8)) * f12) + 0.5f);
        int i11 = (int) (f12 + 0.5f);
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                return 0;
                            }
                            return ((i11 << 16) + (i8 << 8) + i9) | u1.f3816t;
                        }
                        return ((i10 << 16) + (i8 << 8) + i11) | u1.f3816t;
                    }
                    return ((i8 << 16) + (i9 << 8) + i11) | u1.f3816t;
                }
                return ((i8 << 16) + (i11 << 8) + i10) | u1.f3816t;
            }
            return ((i9 << 16) + (i11 << 8) + i8) | u1.f3816t;
        }
        return ((i11 << 16) + (i10 << 8) + i8) | u1.f3816t;
    }

    public boolean b(a aVar) {
        b bVar;
        if (aVar == null || (bVar = this.f15315c) != aVar.f15315c) {
            return false;
        }
        switch (C0222a.f15321a[bVar.ordinal()]) {
            case 1:
            case 6:
                return this.f15316d == aVar.f15316d;
            case 2:
                return this.f15319g == aVar.f15319g;
            case 3:
                return this.f15316d == aVar.f15316d;
            case 4:
            case 5:
                return this.f15320h == aVar.f15320h;
            case 7:
                return this.f15317e == aVar.f15317e;
            case 8:
                return this.f15317e == aVar.f15317e;
            default:
                return false;
        }
    }

    public b c() {
        return this.f15315c;
    }

    public float d() {
        switch (C0222a.f15321a[this.f15315c.ordinal()]) {
            case 2:
                return this.f15319g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f15316d;
            case 7:
                return this.f15317e;
            case 8:
                return this.f15317e;
            default:
                return Float.NaN;
        }
    }

    public void e(float[] fArr) {
        switch (C0222a.f15321a[this.f15315c.ordinal()]) {
            case 2:
                fArr[0] = this.f15319g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i7 = (this.f15320h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i7 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f15316d;
                return;
            case 7:
                fArr[0] = this.f15317e;
                return;
            case 8:
                fArr[0] = this.f15317e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int i7 = C0222a.f15321a[this.f15315c.ordinal()];
        return (i7 == 1 || i7 == 2 || i7 == 3) ? false : true;
    }

    public int h() {
        int i7 = C0222a.f15321a[this.f15315c.ordinal()];
        return (i7 == 4 || i7 == 5) ? 4 : 1;
    }

    public void i(int i7) {
        this.f15320h = i7;
    }

    public void j(float f7) {
        this.f15317e = f7;
    }

    public void k(int i7) {
        this.f15316d = i7;
    }

    public void l(String str) {
        this.f15318f = str;
    }

    public void m(Object obj) {
        switch (C0222a.f15321a[this.f15315c.ordinal()]) {
            case 1:
            case 6:
                this.f15316d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f15319g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f15318f = (String) obj;
                return;
            case 4:
            case 5:
                this.f15320h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f15317e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f15317e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void n(float[] fArr) {
        switch (C0222a.f15321a[this.f15315c.ordinal()]) {
            case 1:
            case 6:
                this.f15316d = (int) fArr[0];
                return;
            case 2:
                this.f15319g = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int f7 = f(fArr[0], fArr[1], fArr[2]);
                this.f15320h = f7;
                this.f15320h = (a((int) (fArr[3] * 255.0f)) << 24) | (f7 & u1.f3815s);
                return;
            case 7:
                this.f15317e = fArr[0];
                return;
            case 8:
                this.f15317e = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, b bVar, Object obj, boolean z6) {
        this.f15314b = str;
        this.f15315c = bVar;
        this.f15313a = z6;
        m(obj);
    }

    public a(a aVar, Object obj) {
        this.f15313a = false;
        this.f15314b = aVar.f15314b;
        this.f15315c = aVar.f15315c;
        m(obj);
    }
}
