package e5;

import u4.l0;
import v3.a1;
import v3.g1;
import v3.j0;
@g1(version = "1.1")
/* loaded from: classes.dex */
public final class u {
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final a f8787c = new a(null);
    @n6.d
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public static final u f8788d = new u(null, null);
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final v f8789a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final s f8790b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @a1
        public static /* synthetic */ void d() {
        }

        @n6.d
        @s4.m
        public final u a(@n6.d s sVar) {
            l0.p(sVar, "type");
            return new u(v.IN, sVar);
        }

        @n6.d
        @s4.m
        public final u b(@n6.d s sVar) {
            l0.p(sVar, "type");
            return new u(v.OUT, sVar);
        }

        @n6.d
        public final u c() {
            return u.f8788d;
        }

        @n6.d
        @s4.m
        public final u e(@n6.d s sVar) {
            l0.p(sVar, "type");
            return new u(v.INVARIANT, sVar);
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8791a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8791a = iArr;
        }
    }

    public u(@n6.e v vVar, @n6.e s sVar) {
        String str;
        this.f8789a = vVar;
        this.f8790b = sVar;
        if ((vVar == null) == (sVar == null)) {
            return;
        }
        if (vVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + vVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @n6.d
    @s4.m
    public static final u c(@n6.d s sVar) {
        return f8787c.a(sVar);
    }

    public static /* synthetic */ u e(u uVar, v vVar, s sVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            vVar = uVar.f8789a;
        }
        if ((i7 & 2) != 0) {
            sVar = uVar.f8790b;
        }
        return uVar.d(vVar, sVar);
    }

    @n6.d
    @s4.m
    public static final u f(@n6.d s sVar) {
        return f8787c.b(sVar);
    }

    @n6.d
    @s4.m
    public static final u i(@n6.d s sVar) {
        return f8787c.e(sVar);
    }

    @n6.e
    public final v a() {
        return this.f8789a;
    }

    @n6.e
    public final s b() {
        return this.f8790b;
    }

    @n6.d
    public final u d(@n6.e v vVar, @n6.e s sVar) {
        return new u(vVar, sVar);
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f8789a == uVar.f8789a && l0.g(this.f8790b, uVar.f8790b);
        }
        return false;
    }

    @n6.e
    public final s g() {
        return this.f8790b;
    }

    @n6.e
    public final v h() {
        return this.f8789a;
    }

    public int hashCode() {
        v vVar = this.f8789a;
        int hashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        s sVar = this.f8790b;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    @n6.d
    public String toString() {
        v vVar = this.f8789a;
        int i7 = vVar == null ? -1 : b.f8791a[vVar.ordinal()];
        if (i7 != -1) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return "in " + this.f8790b;
                } else if (i7 == 3) {
                    return "out " + this.f8790b;
                } else {
                    throw new j0();
                }
            }
            return String.valueOf(this.f8790b);
        }
        return "*";
    }
}
