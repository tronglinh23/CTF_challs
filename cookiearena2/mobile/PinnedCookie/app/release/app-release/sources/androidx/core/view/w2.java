package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import u.v;
@u4.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,432:1\n40#1:433\n56#1:434\n329#1,4:438\n43#2,3:435\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n71#1:433\n71#1:434\n315#1:438,4\n238#1:435,3\n*E\n"})
/* loaded from: classes.dex */
public final class w2 {

    @h4.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {414, v.c.f17168q}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a extends h4.k implements t4.p<f5.o<? super View>, e4.d<? super v3.m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f3852m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f3853n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ View f3854o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f3854o = view;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<v3.m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f3854o, dVar);
            aVar.f3853n = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            f5.o oVar;
            Object h7 = g4.d.h();
            int i7 = this.f3852m;
            if (i7 == 0) {
                v3.e1.n(obj);
                oVar = (f5.o) this.f3853n;
                View view = this.f3854o;
                this.f3853n = oVar;
                this.f3852m = 1;
                if (oVar.a(view, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    v3.e1.n(obj);
                    return v3.m2.f17815a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oVar = (f5.o) this.f3853n;
                v3.e1.n(obj);
            }
            View view2 = this.f3854o;
            if (view2 instanceof ViewGroup) {
                f5.m<View> f7 = u2.f((ViewGroup) view2);
                this.f3853n = null;
                this.f3852m = 2;
                if (oVar.f(f7, this) == h7) {
                    return h7;
                }
            }
            return v3.m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super View> oVar, @n6.e e4.d<? super v3.m2> dVar) {
            return ((a) H(oVar, dVar)).Q(v3.m2.f17815a);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b extends u4.h0 implements t4.l<ViewParent, ViewParent> {

        /* renamed from: t  reason: collision with root package name */
        public static final b f3855t = new b();

        public b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // t4.l
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final ViewParent O(@n6.d ViewParent viewParent) {
            u4.l0.p(viewParent, "p0");
            return viewParent.getParent();
        }
    }

    @u4.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n*L\n1#1,432:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3856b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t4.l<View, v3.m2> f3857c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, t4.l<? super View, v3.m2> lVar) {
            this.f3856b = view;
            this.f3857c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@n6.d View view) {
            u4.l0.p(view, "view");
            this.f3856b.removeOnAttachStateChangeListener(this);
            this.f3857c.O(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@n6.d View view) {
            u4.l0.p(view, "view");
        }
    }

    @u4.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnDetach$1\n*L\n1#1,432:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3858b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t4.l<View, v3.m2> f3859c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(View view, t4.l<? super View, v3.m2> lVar) {
            this.f3858b = view;
            this.f3859c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@n6.d View view) {
            u4.l0.p(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@n6.d View view) {
            u4.l0.p(view, "view");
            this.f3858b.removeOnAttachStateChangeListener(this);
            this.f3859c.O(view);
        }
    }

    @u4.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,432:1\n72#2,2:433\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l f3860a;

        public e(t4.l lVar) {
            this.f3860a = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@n6.d View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            u4.l0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f3860a.O(view);
        }
    }

    @u4.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n*L\n1#1,432:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l<View, v3.m2> f3861a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(t4.l<? super View, v3.m2> lVar) {
            this.f3861a = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@n6.d View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            u4.l0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f3861a.O(view);
        }
    }

    @u4.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n*L\n1#1,432:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.l<View, v3.m2> f3862k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ View f3863l;

        /* JADX WARN: Multi-variable type inference failed */
        public g(t4.l<? super View, v3.m2> lVar, View view) {
            this.f3862k = lVar;
            this.f3863l = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3862k.O(this.f3863l);
        }
    }

    @u4.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n*L\n1#1,432:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class h implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.a<v3.m2> f3864k;

        public h(t4.a<v3.m2> aVar) {
            this.f3864k = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3864k.n();
        }
    }

    public static final void A(@n6.d View view, @n6.d t4.l<? super ViewGroup.LayoutParams, v3.m2> lVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        lVar.O(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @s4.h(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void B(View view, t4.l<? super T, v3.m2> lVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        u4.l0.y(1, "T");
        lVar.O(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void C(@n6.d View view, @d.u0 int i7, @d.u0 int i8, @d.u0 int i9, @d.u0 int i10) {
        u4.l0.p(view, "<this>");
        view.setPadding(i7, i8, i9, i10);
    }

    public static /* synthetic */ void D(View view, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = view.getPaddingLeft();
        }
        if ((i11 & 2) != 0) {
            i8 = view.getPaddingTop();
        }
        if ((i11 & 4) != 0) {
            i9 = view.getPaddingRight();
        }
        if ((i11 & 8) != 0) {
            i10 = view.getPaddingBottom();
        }
        u4.l0.p(view, "<this>");
        view.setPadding(i7, i8, i9, i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(17)
    public static final void E(@n6.d View view, @d.u0 int i7, @d.u0 int i8, @d.u0 int i9, @d.u0 int i10) {
        u4.l0.p(view, "<this>");
        view.setPaddingRelative(i7, i8, i9, i10);
    }

    public static /* synthetic */ void F(View view, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = view.getPaddingStart();
        }
        if ((i11 & 2) != 0) {
            i8 = view.getPaddingTop();
        }
        if ((i11 & 4) != 0) {
            i9 = view.getPaddingEnd();
        }
        if ((i11 & 8) != 0) {
            i10 = view.getPaddingBottom();
        }
        u4.l0.p(view, "<this>");
        view.setPaddingRelative(i7, i8, i9, i10);
    }

    public static final void b(@n6.d View view, @n6.d t4.l<? super View, v3.m2> lVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        if (u1.O0(view)) {
            lVar.O(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, lVar));
        }
    }

    public static final void c(@n6.d View view, @n6.d t4.l<? super View, v3.m2> lVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        if (u1.O0(view)) {
            view.addOnAttachStateChangeListener(new d(view, lVar));
        } else {
            lVar.O(view);
        }
    }

    public static final void d(@n6.d View view, @n6.d t4.l<? super View, v3.m2> lVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        if (!u1.U0(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new e(lVar));
        } else {
            lVar.O(view);
        }
    }

    public static final void e(@n6.d View view, @n6.d t4.l<? super View, v3.m2> lVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        view.addOnLayoutChangeListener(new f(lVar));
    }

    @n6.d
    public static final n1 f(@n6.d View view, @n6.d t4.l<? super View, v3.m2> lVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        n1 a7 = n1.a(view, new g(lVar, view));
        u4.l0.o(a7, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return a7;
    }

    @n6.d
    public static final Bitmap g(@n6.d View view, @n6.d Bitmap.Config config) {
        u4.l0.p(view, "<this>");
        u4.l0.p(config, "config");
        if (u1.U0(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            u4.l0.o(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap h(View view, Bitmap.Config config, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return g(view, config);
    }

    @n6.d
    public static final f5.m<View> i(@n6.d View view) {
        u4.l0.p(view, "<this>");
        return f5.q.b(new a(view, null));
    }

    @n6.d
    public static final f5.m<ViewParent> j(@n6.d View view) {
        u4.l0.p(view, "<this>");
        return f5.s.l(view.getParent(), b.f3855t);
    }

    public static final int k(@n6.d View view) {
        u4.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int l(@n6.d View view) {
        u4.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return r0.b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int m(@n6.d View view) {
        u4.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int n(@n6.d View view) {
        u4.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o(@n6.d View view) {
        u4.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return r0.c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int p(@n6.d View view) {
        u4.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean q(@n6.d View view) {
        u4.l0.p(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean r(@n6.d View view) {
        u4.l0.p(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean s(@n6.d View view) {
        u4.l0.p(view, "<this>");
        return view.getVisibility() == 0;
    }

    @n6.d
    public static final Runnable t(@n6.d View view, long j7, @n6.d t4.a<v3.m2> aVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(aVar, s2.t0.f16450f);
        h hVar = new h(aVar);
        view.postDelayed(hVar, j7);
        return hVar;
    }

    @n6.d
    @d.w0(16)
    public static final Runnable u(@n6.d View view, long j7, @n6.d final t4.a<v3.m2> aVar) {
        u4.l0.p(view, "<this>");
        u4.l0.p(aVar, s2.t0.f16450f);
        Runnable runnable = new Runnable() { // from class: androidx.core.view.v2
            @Override // java.lang.Runnable
            public final void run() {
                w2.v(t4.a.this);
            }
        };
        androidx.core.view.c.a(view, runnable, j7);
        return runnable;
    }

    public static final void v(t4.a aVar) {
        u4.l0.p(aVar, "$action");
        aVar.n();
    }

    public static final void w(@n6.d View view, boolean z6) {
        u4.l0.p(view, "<this>");
        view.setVisibility(z6 ? 8 : 0);
    }

    public static final void x(@n6.d View view, boolean z6) {
        u4.l0.p(view, "<this>");
        view.setVisibility(z6 ? 4 : 0);
    }

    public static final void y(@n6.d View view, @d.u0 int i7) {
        u4.l0.p(view, "<this>");
        view.setPadding(i7, i7, i7, i7);
    }

    public static final void z(@n6.d View view, boolean z6) {
        u4.l0.p(view, "<this>");
        view.setVisibility(z6 ? 0 : 8);
    }
}
