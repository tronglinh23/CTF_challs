package kotlinx.coroutines;

import e4.g;
/* loaded from: classes.dex */
public final class t0 extends e4.a {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f13111m = new a(null);
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final String f13112l;

    /* loaded from: classes.dex */
    public static final class a implements g.c<t0> {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
        }
    }

    public t0(@n6.d String str) {
        super(f13111m);
        this.f13112l = str;
    }

    public static /* synthetic */ t0 X0(t0 t0Var, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = t0Var.f13112l;
        }
        return t0Var.W0(str);
    }

    @n6.d
    public final String V0() {
        return this.f13112l;
    }

    @n6.d
    public final t0 W0(@n6.d String str) {
        return new t0(str);
    }

    @n6.d
    public final String Y0() {
        return this.f13112l;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && u4.l0.g(this.f13112l, ((t0) obj).f13112l);
    }

    public int hashCode() {
        return this.f13112l.hashCode();
    }

    @n6.d
    public String toString() {
        return "CoroutineName(" + this.f13112l + ')';
    }
}
