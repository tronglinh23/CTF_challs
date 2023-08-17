package v;

/* loaded from: classes.dex */
public class j extends c {

    /* renamed from: r  reason: collision with root package name */
    public int f17621r;

    /* renamed from: s  reason: collision with root package name */
    public b f17622s;

    /* renamed from: t  reason: collision with root package name */
    public char[] f17623t;

    /* renamed from: u  reason: collision with root package name */
    public char[] f17624u;

    /* renamed from: v  reason: collision with root package name */
    public char[] f17625v;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17626a;

        static {
            int[] iArr = new int[b.values().length];
            f17626a = iArr;
            try {
                iArr[b.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17626a[b.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17626a[b.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17626a[b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public j(char[] cArr) {
        super(cArr);
        this.f17621r = 0;
        this.f17622s = b.UNKNOWN;
        this.f17623t = "true".toCharArray();
        this.f17624u = "false".toCharArray();
        this.f17625v = "null".toCharArray();
    }

    public static c u(char[] cArr) {
        return new j(cArr);
    }

    @Override // v.c
    public String s(int i7, int i8) {
        StringBuilder sb = new StringBuilder();
        a(sb, i7);
        sb.append(b());
        return sb.toString();
    }

    @Override // v.c
    public String t() {
        if (g.f17605d) {
            return "<" + b() + ">";
        }
        return b();
    }

    public boolean v() throws h {
        b bVar = this.f17622s;
        if (bVar == b.TRUE) {
            return true;
        }
        if (bVar == b.FALSE) {
            return false;
        }
        throw new h("this token is not a boolean: <" + b() + ">", this);
    }

    public b w() {
        return this.f17622s;
    }

    public boolean x() throws h {
        if (this.f17622s == b.NULL) {
            return true;
        }
        throw new h("this token is not a null: <" + b() + ">", this);
    }

    public boolean y(char c7, long j7) {
        int i7 = a.f17626a[this.f17622s.ordinal()];
        if (i7 == 1) {
            char[] cArr = this.f17623t;
            int i8 = this.f17621r;
            r2 = cArr[i8] == c7;
            if (r2 && i8 + 1 == cArr.length) {
                p(j7);
            }
        } else if (i7 == 2) {
            char[] cArr2 = this.f17624u;
            int i9 = this.f17621r;
            r2 = cArr2[i9] == c7;
            if (r2 && i9 + 1 == cArr2.length) {
                p(j7);
            }
        } else if (i7 == 3) {
            char[] cArr3 = this.f17625v;
            int i10 = this.f17621r;
            r2 = cArr3[i10] == c7;
            if (r2 && i10 + 1 == cArr3.length) {
                p(j7);
            }
        } else if (i7 == 4) {
            char[] cArr4 = this.f17623t;
            int i11 = this.f17621r;
            if (cArr4[i11] == c7) {
                this.f17622s = b.TRUE;
            } else if (this.f17624u[i11] == c7) {
                this.f17622s = b.FALSE;
            } else if (this.f17625v[i11] == c7) {
                this.f17622s = b.NULL;
            }
            r2 = true;
        }
        this.f17621r++;
        return r2;
    }
}