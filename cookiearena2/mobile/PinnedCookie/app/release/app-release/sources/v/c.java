package v;
/* loaded from: classes.dex */
public class c {

    /* renamed from: p  reason: collision with root package name */
    public static int f17593p = 80;

    /* renamed from: q  reason: collision with root package name */
    public static int f17594q = 2;

    /* renamed from: k  reason: collision with root package name */
    public final char[] f17595k;

    /* renamed from: l  reason: collision with root package name */
    public long f17596l = -1;

    /* renamed from: m  reason: collision with root package name */
    public long f17597m = Long.MAX_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public b f17598n;

    /* renamed from: o  reason: collision with root package name */
    public int f17599o;

    public c(char[] cArr) {
        this.f17595k = cArr;
    }

    public void a(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append(' ');
        }
    }

    public String b() {
        String str = new String(this.f17595k);
        long j7 = this.f17597m;
        if (j7 != Long.MAX_VALUE) {
            long j8 = this.f17596l;
            if (j7 >= j8) {
                return str.substring((int) j8, ((int) j7) + 1);
            }
        }
        long j9 = this.f17596l;
        return str.substring((int) j9, ((int) j9) + 1);
    }

    public c d() {
        return this.f17598n;
    }

    public String e() {
        if (g.f17605d) {
            return k() + " -> ";
        }
        return "";
    }

    public long f() {
        return this.f17597m;
    }

    public float g() {
        if (this instanceof e) {
            return ((e) this).g();
        }
        return Float.NaN;
    }

    public int h() {
        if (this instanceof e) {
            return ((e) this).h();
        }
        return 0;
    }

    public int i() {
        return this.f17599o;
    }

    public long j() {
        return this.f17596l;
    }

    public String k() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean l() {
        return this.f17597m != Long.MAX_VALUE;
    }

    public boolean m() {
        return this.f17596l > -1;
    }

    public boolean n() {
        return this.f17596l == -1;
    }

    public void o(b bVar) {
        this.f17598n = bVar;
    }

    public void p(long j7) {
        if (this.f17597m != Long.MAX_VALUE) {
            return;
        }
        this.f17597m = j7;
        if (g.f17605d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        b bVar = this.f17598n;
        if (bVar != null) {
            bVar.u(this);
        }
    }

    public void q(int i7) {
        this.f17599o = i7;
    }

    public void r(long j7) {
        this.f17596l = j7;
    }

    public String s(int i7, int i8) {
        return "";
    }

    public String t() {
        return "";
    }

    public String toString() {
        long j7 = this.f17596l;
        long j8 = this.f17597m;
        if (j7 > j8 || j8 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f17596l + "-" + this.f17597m + ")";
        }
        return k() + " (" + this.f17596l + " : " + this.f17597m + ") <<" + new String(this.f17595k).substring((int) this.f17596l, ((int) this.f17597m) + 1) + ">>";
    }
}
