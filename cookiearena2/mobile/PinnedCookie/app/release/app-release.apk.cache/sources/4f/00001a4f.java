package s2;

import s2.u0;
import u4.r1;
import v3.m2;

@r1({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
@x0
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f16483b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16484c;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public String f16486e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16487f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16488g;
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final u0.a f16482a = new u0.a();
    @d.d0

    /* renamed from: d  reason: collision with root package name */
    public int f16485d = -1;

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.l<i1, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f16489l = new a();

        public a() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(i1 i1Var) {
            b(i1Var);
            return m2.f17815a;
        }

        public final void b(@n6.d i1 i1Var) {
            u4.l0.p(i1Var, "$this$null");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<i1, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f16490l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(i1 i1Var) {
            b(i1Var);
            return m2.f17815a;
        }

        public final void b(@n6.d i1 i1Var) {
            u4.l0.p(i1Var, "$this$null");
        }
    }

    @v3.k(message = "Use the popUpToId property.")
    public static /* synthetic */ void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(v0 v0Var, int i7, t4.l lVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = a.f16489l;
        }
        v0Var.i(i7, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(v0 v0Var, String str, t4.l lVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            lVar = b.f16490l;
        }
        v0Var.j(str, lVar);
    }

    public final void a(@n6.d t4.l<? super h, m2> lVar) {
        u4.l0.p(lVar, "animBuilder");
        h hVar = new h();
        lVar.O(hVar);
        this.f16482a.b(hVar.a()).c(hVar.b()).e(hVar.c()).f(hVar.d());
    }

    @n6.d
    public final u0 b() {
        u0.a aVar = this.f16482a;
        aVar.d(this.f16483b);
        aVar.m(this.f16484c);
        String str = this.f16486e;
        if (str != null) {
            aVar.j(str, this.f16487f, this.f16488g);
        } else {
            aVar.h(this.f16485d, this.f16487f, this.f16488g);
        }
        return aVar.a();
    }

    public final boolean c() {
        return this.f16483b;
    }

    public final int d() {
        return this.f16485d;
    }

    public final int f() {
        return this.f16485d;
    }

    @n6.e
    public final String g() {
        return this.f16486e;
    }

    public final boolean h() {
        return this.f16484c;
    }

    public final void i(@d.d0 int i7, @n6.d t4.l<? super i1, m2> lVar) {
        u4.l0.p(lVar, "popUpToBuilder");
        o(i7);
        p(null);
        i1 i1Var = new i1();
        lVar.O(i1Var);
        this.f16487f = i1Var.a();
        this.f16488g = i1Var.b();
    }

    public final void j(@n6.d String str, @n6.d t4.l<? super i1, m2> lVar) {
        u4.l0.p(str, "route");
        u4.l0.p(lVar, "popUpToBuilder");
        p(str);
        o(-1);
        i1 i1Var = new i1();
        lVar.O(i1Var);
        this.f16487f = i1Var.a();
        this.f16488g = i1Var.b();
    }

    public final void m(boolean z6) {
        this.f16483b = z6;
    }

    @v3.k(message = "Use the popUpTo function and passing in the id.")
    public final void n(int i7) {
        k(this, i7, null, 2, null);
    }

    public final void o(int i7) {
        this.f16485d = i7;
        this.f16487f = false;
    }

    public final void p(String str) {
        if (str != null) {
            if ((!i5.b0.V1(str)) != true) {
                throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
            }
            this.f16486e = str;
            this.f16487f = false;
        }
    }

    public final void q(boolean z6) {
        this.f16484c = z6;
    }
}