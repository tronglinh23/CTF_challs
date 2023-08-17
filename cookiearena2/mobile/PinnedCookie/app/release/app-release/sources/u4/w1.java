package u4;

import java.lang.annotation.Annotation;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
@v3.g1(version = "1.4")
/* loaded from: classes.dex */
public final class w1 implements e5.s {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final a f17503o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f17504p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f17505q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f17506r = 4;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e5.g f17507k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final List<e5.u> f17508l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public final e5.s f17509m;

    /* renamed from: n  reason: collision with root package name */
    public final int f17510n;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17511a;

        static {
            int[] iArr = new int[e5.v.values().length];
            try {
                iArr[e5.v.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e5.v.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e5.v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17511a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.l<e5.u, CharSequence> {
        public c() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final CharSequence O(@n6.d e5.u uVar) {
            l0.p(uVar, "it");
            return w1.this.m(uVar);
        }
    }

    @v3.g1(version = "1.6")
    public w1(@n6.d e5.g gVar, @n6.d List<e5.u> list, @n6.e e5.s sVar, int i7) {
        l0.p(gVar, "classifier");
        l0.p(list, androidx.fragment.app.q0.f4472m);
        this.f17507k = gVar;
        this.f17508l = list;
        this.f17509m = sVar;
        this.f17510n = i7;
    }

    @v3.g1(version = "1.6")
    public static /* synthetic */ void B() {
    }

    @v3.g1(version = "1.6")
    public static /* synthetic */ void w() {
    }

    @Override // e5.s
    public boolean L() {
        return (this.f17510n & 1) != 0;
    }

    @Override // e5.s
    @n6.d
    public e5.g N() {
        return this.f17507k;
    }

    @Override // e5.b
    @n6.d
    public List<Annotation> R() {
        return x3.w.E();
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            if (l0.g(N(), w1Var.N()) && l0.g(f(), w1Var.f()) && l0.g(this.f17509m, w1Var.f17509m) && this.f17510n == w1Var.f17510n) {
                return true;
            }
        }
        return false;
    }

    @Override // e5.s
    @n6.d
    public List<e5.u> f() {
        return this.f17508l;
    }

    public int hashCode() {
        return (((N().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(this.f17510n);
    }

    public final String m(e5.u uVar) {
        String valueOf;
        if (uVar.h() == null) {
            return "*";
        }
        e5.s g7 = uVar.g();
        w1 w1Var = g7 instanceof w1 ? (w1) g7 : null;
        if (w1Var == null || (valueOf = w1Var.n(true)) == null) {
            valueOf = String.valueOf(uVar.g());
        }
        int i7 = b.f17511a[uVar.h().ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                return "in " + valueOf;
            } else if (i7 == 3) {
                return "out " + valueOf;
            } else {
                throw new v3.j0();
            }
        }
        return valueOf;
    }

    public final String n(boolean z6) {
        String name;
        e5.g N = N();
        e5.d dVar = N instanceof e5.d ? (e5.d) N : null;
        Class<?> d7 = dVar != null ? s4.a.d(dVar) : null;
        if (d7 == null) {
            name = N().toString();
        } else if ((this.f17510n & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (d7.isArray()) {
            name = p(d7);
        } else if (z6 && d7.isPrimitive()) {
            e5.g N2 = N();
            l0.n(N2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = s4.a.g((e5.d) N2).getName();
        } else {
            name = d7.getName();
        }
        String str = name + (f().isEmpty() ? "" : x3.e0.h3(f(), ", ", "<", ">", 0, null, new c(), 24, null)) + (L() ? "?" : "");
        e5.s sVar = this.f17509m;
        if (sVar instanceof w1) {
            String n7 = ((w1) sVar).n(true);
            if (l0.g(n7, str)) {
                return str;
            }
            if (l0.g(n7, str + '?')) {
                return str + PublicSuffixDatabase.f14435h;
            }
            return '(' + str + ".." + n7 + ')';
        }
        return str;
    }

    public final String p(Class<?> cls) {
        return l0.g(cls, boolean[].class) ? "kotlin.BooleanArray" : l0.g(cls, char[].class) ? "kotlin.CharArray" : l0.g(cls, byte[].class) ? "kotlin.ByteArray" : l0.g(cls, short[].class) ? "kotlin.ShortArray" : l0.g(cls, int[].class) ? "kotlin.IntArray" : l0.g(cls, float[].class) ? "kotlin.FloatArray" : l0.g(cls, long[].class) ? "kotlin.LongArray" : l0.g(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @n6.d
    public String toString() {
        return n(false) + l1.f17441b;
    }

    public final int u() {
        return this.f17510n;
    }

    @n6.e
    public final e5.s y() {
        return this.f17509m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w1(@n6.d e5.g gVar, @n6.d List<e5.u> list, boolean z6) {
        this(gVar, list, null, z6 ? 1 : 0);
        l0.p(gVar, "classifier");
        l0.p(list, androidx.fragment.app.q0.f4472m);
    }
}
