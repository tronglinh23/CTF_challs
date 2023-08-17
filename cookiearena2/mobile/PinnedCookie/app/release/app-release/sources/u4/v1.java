package u4;

import java.util.List;
@r1({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
@v3.g1(version = "1.4")
/* loaded from: classes.dex */
public final class v1 implements e5.t {
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final a f17496p = new a(null);
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final Object f17497k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final String f17498l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final e5.v f17499m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f17500n;
    @n6.e

    /* renamed from: o  reason: collision with root package name */
    public volatile List<? extends e5.s> f17501o;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: u4.v1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0249a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17502a;

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
                f17502a = iArr;
            }
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @n6.d
        public final String a(@n6.d e5.t tVar) {
            l0.p(tVar, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i7 = C0249a.f17502a[tVar.m().ordinal()];
            if (i7 == 2) {
                sb.append("in ");
            } else if (i7 == 3) {
                sb.append("out ");
            }
            sb.append(tVar.getName());
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        public a() {
        }
    }

    public v1(@n6.e Object obj, @n6.d String str, @n6.d e5.v vVar, boolean z6) {
        l0.p(str, "name");
        l0.p(vVar, "variance");
        this.f17497k = obj;
        this.f17498l = str;
        this.f17499m = vVar;
        this.f17500n = z6;
    }

    public static /* synthetic */ void a() {
    }

    public final void c(@n6.d List<? extends e5.s> list) {
        l0.p(list, "upperBounds");
        if (this.f17501o == null) {
            this.f17501o = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    @Override // e5.t
    public boolean e() {
        return this.f17500n;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (l0.g(this.f17497k, v1Var.f17497k) && l0.g(getName(), v1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // e5.t
    @n6.d
    public String getName() {
        return this.f17498l;
    }

    @Override // e5.t
    @n6.d
    public List<e5.s> getUpperBounds() {
        List list = this.f17501o;
        if (list == null) {
            List<e5.s> k7 = x3.v.k(l1.o(Object.class));
            this.f17501o = k7;
            return k7;
        }
        return list;
    }

    public int hashCode() {
        Object obj = this.f17497k;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // e5.t
    @n6.d
    public e5.v m() {
        return this.f17499m;
    }

    @n6.d
    public String toString() {
        return f17496p.a(this);
    }
}
