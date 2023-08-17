package z5;

import i6.o;
import n6.d;
import r5.u;
import u4.l0;
import u4.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f19063c = 262144;

    /* renamed from: d  reason: collision with root package name */
    public static final C0270a f19064d = new C0270a(null);

    /* renamed from: a  reason: collision with root package name */
    public long f19065a;
    @d

    /* renamed from: b  reason: collision with root package name */
    public final o f19066b;

    /* renamed from: z5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0270a {
        public C0270a() {
        }

        public /* synthetic */ C0270a(w wVar) {
            this();
        }
    }

    public a(@d o oVar) {
        l0.p(oVar, "source");
        this.f19066b = oVar;
        this.f19065a = 262144;
    }

    @d
    public final o a() {
        return this.f19066b;
    }

    @d
    public final u b() {
        u.a aVar = new u.a();
        while (true) {
            String c7 = c();
            if (c7.length() == 0) {
                return aVar.i();
            }
            aVar.f(c7);
        }
    }

    @d
    public final String c() {
        String y02 = this.f19066b.y0(this.f19065a);
        this.f19065a -= y02.length();
        return y02;
    }
}