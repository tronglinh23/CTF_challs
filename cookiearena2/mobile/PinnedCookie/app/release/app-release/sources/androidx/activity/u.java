package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.u;
import d.w0;
import kotlinx.coroutines.c2;
import n5.e0;
import n5.g0;
import u4.l0;
import u4.n0;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Activity f606k;

        public a(Activity activity) {
            this.f606k = activity;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object f(@n6.d Rect rect, @n6.d e4.d<? super m2> dVar) {
            c.f545a.a(this.f606k, rect);
            return m2.f17815a;
        }
    }

    @h4.f(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<g0<? super Rect>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f607o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f608p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ View f609q;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements t4.a<m2> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ View f610l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f611m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ View.OnLayoutChangeListener f612n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ ViewOnAttachStateChangeListenerC0017b f613o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0017b viewOnAttachStateChangeListenerC0017b) {
                super(0);
                this.f610l = view;
                this.f611m = onScrollChangedListener;
                this.f612n = onLayoutChangeListener;
                this.f613o = viewOnAttachStateChangeListenerC0017b;
            }

            public final void b() {
                this.f610l.getViewTreeObserver().removeOnScrollChangedListener(this.f611m);
                this.f610l.removeOnLayoutChangeListener(this.f612n);
                this.f610l.removeOnAttachStateChangeListener(this.f613o);
            }

            @Override // t4.a
            public /* bridge */ /* synthetic */ m2 n() {
                b();
                return m2.f17815a;
            }
        }

        /* renamed from: androidx.activity.u$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewOnAttachStateChangeListenerC0017b implements View.OnAttachStateChangeListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g0<Rect> f614b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ View f615c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f616d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ View.OnLayoutChangeListener f617e;

            /* JADX WARN: Multi-variable type inference failed */
            public ViewOnAttachStateChangeListenerC0017b(g0<? super Rect> g0Var, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
                this.f614b = g0Var;
                this.f615c = view;
                this.f616d = onScrollChangedListener;
                this.f617e = onLayoutChangeListener;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@n6.d View view) {
                l0.p(view, "v");
                this.f614b.V(u.c(this.f615c));
                this.f615c.getViewTreeObserver().addOnScrollChangedListener(this.f616d);
                this.f615c.addOnLayoutChangeListener(this.f617e);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@n6.d View view) {
                l0.p(view, "v");
                view.getViewTreeObserver().removeOnScrollChangedListener(this.f616d);
                view.removeOnLayoutChangeListener(this.f617e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f609q = view;
        }

        public static final void i0(g0 g0Var, View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            if (i7 == i11 && i9 == i13 && i8 == i12 && i10 == i14) {
                return;
            }
            l0.o(view, "v");
            g0Var.V(u.c(view));
        }

        public static final void j0(g0 g0Var, View view) {
            g0Var.V(u.c(view));
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(this.f609q, dVar);
            bVar.f608p = obj;
            return bVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f607o;
            if (i7 == 0) {
                e1.n(obj);
                final g0 g0Var = (g0) this.f608p;
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.v
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                        u.b.i0(g0.this, view, i8, i9, i10, i11, i12, i13, i14, i15);
                    }
                };
                final View view = this.f609q;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.w
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        u.b.j0(g0.this, view);
                    }
                };
                ViewOnAttachStateChangeListenerC0017b viewOnAttachStateChangeListenerC0017b = new ViewOnAttachStateChangeListenerC0017b(g0Var, this.f609q, onScrollChangedListener, onLayoutChangeListener);
                if (androidx.activity.b.f544a.a(this.f609q)) {
                    g0Var.V(u.c(this.f609q));
                    this.f609q.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    this.f609q.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.f609q.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0017b);
                a aVar = new a(this.f609q, onScrollChangedListener, onLayoutChangeListener, viewOnAttachStateChangeListenerC0017b);
                this.f607o = 1;
                if (e0.a(g0Var, aVar, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: h0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d g0<? super Rect> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((b) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @c2
    @n6.e
    @w0(26)
    public static final Object b(@n6.d Activity activity, @n6.d View view, @n6.d e4.d<? super m2> dVar) {
        Object a7 = kotlinx.coroutines.flow.k.s(new b(view, null)).a(new a(activity), dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    public static final Rect c(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
