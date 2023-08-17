package androidx.window.layout;

import android.app.Activity;
import d.b1;
import u4.h0;
import u4.l0;
import u4.n0;
/* loaded from: classes.dex */
public interface y {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final a f7131a = a.f7132a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f7132a = new a();
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static t4.l<? super y, ? extends y> f7133b = C0074a.f7134l;

        /* renamed from: androidx.window.layout.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0074a extends n0 implements t4.l<y, y> {

            /* renamed from: l  reason: collision with root package name */
            public static final C0074a f7134l = new C0074a();

            public C0074a() {
                super(1);
            }

            @Override // t4.l
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final y O(@n6.d y yVar) {
                l0.p(yVar, "it");
                return yVar;
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b extends h0 implements t4.l<y, y> {
            public b(Object obj) {
                super(1, obj, c0.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
            }

            @Override // t4.l
            @n6.d
            /* renamed from: C0  reason: merged with bridge method [inline-methods] */
            public final y O(@n6.d y yVar) {
                l0.p(yVar, "p0");
                return ((c0) this.f17460l).a(yVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends n0 implements t4.l<y, y> {

            /* renamed from: l  reason: collision with root package name */
            public static final c f7135l = new c();

            public c() {
                super(1);
            }

            @Override // t4.l
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final y O(@n6.d y yVar) {
                l0.p(yVar, "it");
                return yVar;
            }
        }

        @n6.d
        @s4.m
        public final y a() {
            return f7133b.O(b0.f7050b);
        }

        @b1({b1.a.TESTS})
        @s4.m
        @t3.d
        public final void b(@n6.d c0 c0Var) {
            l0.p(c0Var, "overridingDecorator");
            f7133b = new b(c0Var);
        }

        @b1({b1.a.TESTS})
        @s4.m
        @t3.d
        public final void c() {
            f7133b = c.f7135l;
        }
    }

    @b1({b1.a.TESTS})
    @s4.m
    @t3.d
    static void a() {
        f7131a.c();
    }

    @b1({b1.a.TESTS})
    @s4.m
    @t3.d
    static void b(@n6.d c0 c0Var) {
        f7131a.b(c0Var);
    }

    @n6.d
    @s4.m
    static y d() {
        return f7131a.a();
    }

    @n6.d
    x c(@n6.d Activity activity);

    @n6.d
    x e(@n6.d Activity activity);
}
