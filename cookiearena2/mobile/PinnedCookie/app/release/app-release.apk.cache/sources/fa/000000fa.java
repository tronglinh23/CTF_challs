package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.u0;
import d.b1;
import d.f1;
import d.o0;
import d.q0;
import f.a;
import j.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class a {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f707a = 0;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f708b = 1;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f709c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f710d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f711e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f712f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f713g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final int f714h = 16;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0018a {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z6);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i7, long j7);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int f716a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract f h(@f1 int i7);

        public abstract f i(CharSequence charSequence);

        public abstract f j(int i7);

        public abstract f k(View view);

        public abstract f l(@d.v int i7);

        public abstract f m(Drawable drawable);

        public abstract f n(g gVar);

        public abstract f o(Object obj);

        public abstract f p(int i7);

        public abstract f q(CharSequence charSequence);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface g {
        void a(f fVar, u0 u0Var);

        void b(f fVar, u0 u0Var);

        void c(f fVar, u0 u0Var);
    }

    public Context A() {
        return null;
    }

    public abstract void A0(CharSequence charSequence);

    @q0
    public abstract CharSequence B();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void B0(CharSequence charSequence) {
    }

    public abstract void C();

    public abstract void C0();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean D() {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public j.b D0(b.a aVar) {
        return null;
    }

    public boolean E() {
        return false;
    }

    public abstract boolean F();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean G() {
        return false;
    }

    @Deprecated
    public abstract f H();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void I(Configuration configuration) {
    }

    public void J() {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean K(int i7, KeyEvent keyEvent) {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean L(KeyEvent keyEvent) {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean M() {
        return false;
    }

    @Deprecated
    public abstract void N();

    public abstract void O(d dVar);

    @Deprecated
    public abstract void P(f fVar);

    @Deprecated
    public abstract void Q(int i7);

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean R() {
        return false;
    }

    @Deprecated
    public abstract void S(f fVar);

    public abstract void T(@q0 Drawable drawable);

    public abstract void U(int i7);

    public abstract void V(View view);

    public abstract void W(View view, b bVar);

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void X(boolean z6) {
    }

    public abstract void Y(boolean z6);

    public abstract void Z(int i7);

    public abstract void a0(int i7, int i8);

    public abstract void b0(boolean z6);

    public abstract void c0(boolean z6);

    public abstract void d0(boolean z6);

    public abstract void e0(boolean z6);

    public void f0(float f7) {
        if (f7 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void g(d dVar);

    public void g0(int i7) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(f fVar);

    public void h0(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void i(f fVar, int i7);

    public void i0(@f1 int i7) {
    }

    @Deprecated
    public abstract void j(f fVar, int i7, boolean z6);

    public void j0(@q0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void k(f fVar, boolean z6);

    public void k0(@d.v int i7) {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(@q0 Drawable drawable) {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return false;
    }

    public void m0(boolean z6) {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void n(boolean z6) {
    }

    public abstract void n0(@d.v int i7);

    public abstract View o();

    public abstract void o0(Drawable drawable);

    public abstract int p();

    @Deprecated
    public abstract void p0(SpinnerAdapter spinnerAdapter, e eVar);

    public float q() {
        return 0.0f;
    }

    public abstract void q0(@d.v int i7);

    public abstract int r();

    public abstract void r0(Drawable drawable);

    public int s() {
        return 0;
    }

    @Deprecated
    public abstract void s0(int i7);

    @Deprecated
    public abstract int t();

    @Deprecated
    public abstract void t0(int i7);

    @Deprecated
    public abstract int u();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void u0(boolean z6) {
    }

    @Deprecated
    public abstract int v();

    public void v0(Drawable drawable) {
    }

    @q0
    @Deprecated
    public abstract f w();

    public void w0(Drawable drawable) {
    }

    @q0
    public abstract CharSequence x();

    public abstract void x0(int i7);

    @Deprecated
    public abstract f y(int i7);

    public abstract void y0(CharSequence charSequence);

    @Deprecated
    public abstract int z();

    public abstract void z0(@f1 int i7);

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f715a;

        public b(@o0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f715a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.E);
            this.f715a = obtainStyledAttributes.getInt(a.m.F, 0);
            obtainStyledAttributes.recycle();
        }

        public b(int i7, int i8) {
            super(i7, i8);
            this.f715a = 8388627;
        }

        public b(int i7, int i8, int i9) {
            super(i7, i8);
            this.f715a = i9;
        }

        public b(int i7) {
            this(-2, -1, i7);
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f715a = 0;
            this.f715a = bVar.f715a;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f715a = 0;
        }
    }
}