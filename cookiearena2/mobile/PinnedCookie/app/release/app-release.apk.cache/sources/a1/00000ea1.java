package d5;

import u4.l0;
import v3.g1;

/* loaded from: classes.dex */
public final class c extends d5.a implements g<Character>, r<Character> {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final a f8480o = new a(null);
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final c f8481p = new c(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final c a() {
            return c.f8481p;
        }

        public a() {
        }
    }

    public c(char c7, char c8) {
        super(c7, c8, 1);
    }

    @g1(version = "1.7")
    @v3.r
    @v3.k(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void p() {
    }

    @Override // d5.g, d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return n(((Character) comparable).charValue());
    }

    @Override // d5.a
    public boolean equals(@n6.e Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (i() != cVar.i() || j() != cVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (i() * 31) + j();
    }

    @Override // d5.a, d5.g, d5.r
    public boolean isEmpty() {
        return l0.t(i(), j()) > 0;
    }

    public boolean n(char c7) {
        return l0.t(i(), c7) <= 0 && l0.t(c7, j()) <= 0;
    }

    @Override // d5.r
    @n6.d
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Character d() {
        if (j() != 65535) {
            return Character.valueOf((char) (j() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // d5.g
    @n6.d
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public Character g() {
        return Character.valueOf(j());
    }

    @Override // d5.g, d5.r
    @n6.d
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public Character b() {
        return Character.valueOf(i());
    }

    @Override // d5.a
    @n6.d
    public String toString() {
        return i() + ".." + j();
    }
}