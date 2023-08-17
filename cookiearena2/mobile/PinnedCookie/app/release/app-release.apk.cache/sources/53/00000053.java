package a6;

import i6.p;
import u4.l0;
import u4.w;

/* loaded from: classes.dex */
public final class c {
    @n6.d
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public static final p f238d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final String f239e = ":status";
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final String f240f = ":method";
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final String f241g = ":path";
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final String f242h = ":scheme";
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final String f243i = ":authority";
    @n6.d
    @s4.e

    /* renamed from: j  reason: collision with root package name */
    public static final p f244j;
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public static final p f245k;
    @n6.d
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public static final p f246l;
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public static final p f247m;
    @n6.d
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public static final p f248n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f249o = new a(null);
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public final int f250a;
    @n6.d
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public final p f251b;
    @n6.d
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public final p f252c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    static {
        p.a aVar = p.f11252p;
        f238d = aVar.l(":");
        f244j = aVar.l(f239e);
        f245k = aVar.l(f240f);
        f246l = aVar.l(f241g);
        f247m = aVar.l(f242h);
        f248n = aVar.l(f243i);
    }

    public c(@n6.d p pVar, @n6.d p pVar2) {
        l0.p(pVar, "name");
        l0.p(pVar2, "value");
        this.f251b = pVar;
        this.f252c = pVar2;
        this.f250a = pVar.c0() + 32 + pVar2.c0();
    }

    public static /* synthetic */ c d(c cVar, p pVar, p pVar2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pVar = cVar.f251b;
        }
        if ((i7 & 2) != 0) {
            pVar2 = cVar.f252c;
        }
        return cVar.c(pVar, pVar2);
    }

    @n6.d
    public final p a() {
        return this.f251b;
    }

    @n6.d
    public final p b() {
        return this.f252c;
    }

    @n6.d
    public final c c(@n6.d p pVar, @n6.d p pVar2) {
        l0.p(pVar, "name");
        l0.p(pVar2, "value");
        return new c(pVar, pVar2);
    }

    public boolean equals(@n6.e Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return l0.g(this.f251b, cVar.f251b) && l0.g(this.f252c, cVar.f252c);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        p pVar = this.f251b;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.f252c;
        return hashCode + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    @n6.d
    public String toString() {
        return this.f251b.n0() + ": " + this.f252c.n0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(@n6.d java.lang.String r2, @n6.d java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            u4.l0.p(r2, r0)
            java.lang.String r0 = "value"
            u4.l0.p(r3, r0)
            i6.p$a r0 = i6.p.f11252p
            i6.p r2 = r0.l(r2)
            i6.p r3 = r0.l(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@n6.d p pVar, @n6.d String str) {
        this(pVar, p.f11252p.l(str));
        l0.p(pVar, "name");
        l0.p(str, "value");
    }
}