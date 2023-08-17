package t3;

import i5.b0;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s4.m;
import u4.l0;
import u4.n0;
import u4.w;
import v3.d0;
import v3.f0;

/* loaded from: classes.dex */
public final class i implements Comparable<i> {
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final a f16847p = new a(null);
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public static final i f16848q = new i(0, 0, 0, "");
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public static final i f16849r = new i(0, 1, 0, "");
    @n6.d

    /* renamed from: s  reason: collision with root package name */
    public static final i f16850s;
    @n6.d

    /* renamed from: t  reason: collision with root package name */
    public static final i f16851t;
    @n6.d

    /* renamed from: u  reason: collision with root package name */
    public static final String f16852u = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* renamed from: k  reason: collision with root package name */
    public final int f16853k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16854l;

    /* renamed from: m  reason: collision with root package name */
    public final int f16855m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final String f16856n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final d0 f16857o;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        @n6.d
        public final i a() {
            return i.f16851t;
        }

        @n6.d
        public final i b() {
            return i.f16848q;
        }

        @n6.d
        public final i c() {
            return i.f16849r;
        }

        @n6.d
        public final i d() {
            return i.f16850s;
        }

        @m
        @n6.e
        public final i e(@n6.e String str) {
            if (str == null || b0.V1(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(i.f16852u).matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
                if (valueOf == null) {
                    return null;
                }
                int intValue = valueOf.intValue();
                String group2 = matcher.group(2);
                Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
                if (valueOf2 == null) {
                    return null;
                }
                int intValue2 = valueOf2.intValue();
                String group3 = matcher.group(3);
                Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
                if (valueOf3 == null) {
                    return null;
                }
                int intValue3 = valueOf3.intValue();
                String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                l0.o(group4, "description");
                return new i(intValue, intValue2, intValue3, group4, null);
            }
            return null;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<BigInteger> {
        public b() {
            super(0);
        }

        @Override // t4.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final BigInteger n() {
            return BigInteger.valueOf(i.this.l()).shiftLeft(32).or(BigInteger.valueOf(i.this.m())).shiftLeft(32).or(BigInteger.valueOf(i.this.n()));
        }
    }

    static {
        i iVar = new i(1, 0, 0, "");
        f16850s = iVar;
        f16851t = iVar;
    }

    public /* synthetic */ i(int i7, int i8, int i9, String str, w wVar) {
        this(i7, i8, i9, str);
    }

    @m
    @n6.e
    public static final i o(@n6.e String str) {
        return f16847p.e(str);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f16853k == iVar.f16853k && this.f16854l == iVar.f16854l && this.f16855m == iVar.f16855m;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f16853k) * 31) + this.f16854l) * 31) + this.f16855m;
    }

    @Override // java.lang.Comparable
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int compareTo(@n6.d i iVar) {
        l0.p(iVar, "other");
        return j().compareTo(iVar.j());
    }

    public final BigInteger j() {
        Object value = this.f16857o.getValue();
        l0.o(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @n6.d
    public final String k() {
        return this.f16856n;
    }

    public final int l() {
        return this.f16853k;
    }

    public final int m() {
        return this.f16854l;
    }

    public final int n() {
        return this.f16855m;
    }

    @n6.d
    public String toString() {
        return this.f16853k + '.' + this.f16854l + '.' + this.f16855m + (b0.V1(this.f16856n) ^ true ? l0.C("-", this.f16856n) : "");
    }

    public i(int i7, int i8, int i9, String str) {
        this.f16853k = i7;
        this.f16854l = i8;
        this.f16855m = i9;
        this.f16856n = str;
        this.f16857o = f0.b(new b());
    }
}