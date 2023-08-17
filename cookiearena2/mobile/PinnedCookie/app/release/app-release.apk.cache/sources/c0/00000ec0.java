package d5;

import v3.g1;
import v3.q2;
import v3.x1;

@g1(version = "1.5")
@q2(markerClass = {v3.t.class})
/* loaded from: classes.dex */
public final class x extends v implements g<x1>, r<x1> {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final a f8522o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final x f8523p;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final x a() {
            return x.f8523p;
        }

        public a() {
        }
    }

    static {
        u4.w wVar = null;
        f8522o = new a(wVar);
        f8523p = new x(-1, 0, wVar);
    }

    public /* synthetic */ x(int i7, int i8, u4.w wVar) {
        this(i7, i8);
    }

    @g1(version = "1.7")
    @v3.r
    @v3.k(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void o() {
    }

    @Override // d5.g, d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return m(((x1) comparable).l0());
    }

    @Override // d5.g, d5.r
    public /* bridge */ /* synthetic */ Comparable b() {
        return x1.d(q());
    }

    @Override // d5.r
    public /* bridge */ /* synthetic */ x1 d() {
        return x1.d(n());
    }

    @Override // d5.v
    public boolean equals(@n6.e Object obj) {
        if (obj instanceof x) {
            if (!isEmpty() || !((x) obj).isEmpty()) {
                x xVar = (x) obj;
                if (i() != xVar.i() || j() != xVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.g
    public /* bridge */ /* synthetic */ x1 g() {
        return x1.d(p());
    }

    @Override // d5.v
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (i() * 31) + j();
    }

    @Override // d5.v, d5.g, d5.r
    public boolean isEmpty() {
        return Integer.compareUnsigned(i(), j()) > 0;
    }

    public boolean m(int i7) {
        return Integer.compareUnsigned(i(), i7) <= 0 && Integer.compareUnsigned(i7, j()) <= 0;
    }

    public int n() {
        if (j() != -1) {
            return x1.l(j() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public int p() {
        return j();
    }

    public int q() {
        return i();
    }

    @Override // d5.v
    @n6.d
    public String toString() {
        return ((Object) x1.g0(i())) + ".." + ((Object) x1.g0(j()));
    }

    public x(int i7, int i8) {
        super(i7, i8, 1, null);
    }
}