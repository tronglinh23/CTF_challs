package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.m0;
import d.f1;
import d.o0;
import d.q0;
import d.w0;
import s1.a;
/* loaded from: classes.dex */
public class b implements a.e {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0019b f726a;

    /* renamed from: b  reason: collision with root package name */
    public final s1.a f727b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.graphics.drawable.d f728c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f729d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f730e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f731f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f732g;

    /* renamed from: h  reason: collision with root package name */
    public final int f733h;

    /* renamed from: i  reason: collision with root package name */
    public final int f734i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f735j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f736k;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f731f) {
                bVar.v();
                return;
            }
            View.OnClickListener onClickListener = bVar.f735j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0019b {
        void a(Drawable drawable, @f1 int i7);

        boolean b();

        Drawable c();

        void d(@f1 int i7);

        Context e();
    }

    /* loaded from: classes.dex */
    public interface c {
        @q0
        InterfaceC0019b g();
    }

    /* loaded from: classes.dex */
    public static class d implements InterfaceC0019b {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f738a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f739b;

        @w0(18)
        /* loaded from: classes.dex */
        public static class a {
            @d.u
            public static void a(ActionBar actionBar, int i7) {
                actionBar.setHomeActionContentDescription(i7);
            }

            @d.u
            public static void b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public d(Activity activity) {
            this.f738a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public void a(Drawable drawable, int i7) {
            ActionBar actionBar = this.f738a.getActionBar();
            if (actionBar != null) {
                a.b(actionBar, drawable);
                a.a(actionBar, i7);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public boolean b() {
            ActionBar actionBar = this.f738a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public Drawable c() {
            TypedArray obtainStyledAttributes = e().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public void d(int i7) {
            ActionBar actionBar = this.f738a.getActionBar();
            if (actionBar != null) {
                a.a(actionBar, i7);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public Context e() {
            ActionBar actionBar = this.f738a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f738a;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements InterfaceC0019b {

        /* renamed from: a  reason: collision with root package name */
        public final Toolbar f740a;

        /* renamed from: b  reason: collision with root package name */
        public final Drawable f741b;

        /* renamed from: c  reason: collision with root package name */
        public final CharSequence f742c;

        public e(Toolbar toolbar) {
            this.f740a = toolbar;
            this.f741b = toolbar.getNavigationIcon();
            this.f742c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public void a(Drawable drawable, @f1 int i7) {
            this.f740a.setNavigationIcon(drawable);
            d(i7);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public boolean b() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public Drawable c() {
            return this.f741b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public void d(@f1 int i7) {
            if (i7 == 0) {
                this.f740a.setNavigationContentDescription(this.f742c);
            } else {
                this.f740a.setNavigationContentDescription(i7);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0019b
        public Context e() {
            return this.f740a.getContext();
        }
    }

    public b(Activity activity, s1.a aVar, @f1 int i7, @f1 int i8) {
        this(activity, null, aVar, null, i7, i8);
    }

    @Override // s1.a.e
    public void a(int i7) {
    }

    @Override // s1.a.e
    public void b(View view, float f7) {
        if (this.f729d) {
            s(Math.min(1.0f, Math.max(0.0f, f7)));
        } else {
            s(0.0f);
        }
    }

    @Override // s1.a.e
    public void c(View view) {
        s(1.0f);
        if (this.f731f) {
            l(this.f734i);
        }
    }

    @Override // s1.a.e
    public void d(View view) {
        s(0.0f);
        if (this.f731f) {
            l(this.f733h);
        }
    }

    @o0
    public androidx.appcompat.graphics.drawable.d e() {
        return this.f728c;
    }

    public Drawable f() {
        return this.f726a.c();
    }

    public View.OnClickListener g() {
        return this.f735j;
    }

    public boolean h() {
        return this.f731f;
    }

    public boolean i() {
        return this.f729d;
    }

    public void j(Configuration configuration) {
        if (!this.f732g) {
            this.f730e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f731f) {
            v();
            return true;
        }
        return false;
    }

    public void l(int i7) {
        this.f726a.d(i7);
    }

    public void m(Drawable drawable, int i7) {
        if (!this.f736k && !this.f726a.b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f736k = true;
        }
        this.f726a.a(drawable, i7);
    }

    public void n(@o0 androidx.appcompat.graphics.drawable.d dVar) {
        this.f728c = dVar;
        u();
    }

    public void o(boolean z6) {
        if (z6 != this.f731f) {
            if (z6) {
                m(this.f728c, this.f727b.C(m0.f3714b) ? this.f734i : this.f733h);
            } else {
                m(this.f730e, 0);
            }
            this.f731f = z6;
        }
    }

    public void p(boolean z6) {
        this.f729d = z6;
        if (z6) {
            return;
        }
        s(0.0f);
    }

    public void q(int i7) {
        r(i7 != 0 ? this.f727b.getResources().getDrawable(i7) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f730e = f();
            this.f732g = false;
        } else {
            this.f730e = drawable;
            this.f732g = true;
        }
        if (this.f731f) {
            return;
        }
        m(this.f730e, 0);
    }

    public final void s(float f7) {
        if (f7 == 1.0f) {
            this.f728c.t(true);
        } else if (f7 == 0.0f) {
            this.f728c.t(false);
        }
        this.f728c.setProgress(f7);
    }

    public void t(View.OnClickListener onClickListener) {
        this.f735j = onClickListener;
    }

    public void u() {
        if (this.f727b.C(m0.f3714b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f731f) {
            m(this.f728c, this.f727b.C(m0.f3714b) ? this.f734i : this.f733h);
        }
    }

    public void v() {
        int q6 = this.f727b.q(m0.f3714b);
        if (this.f727b.F(m0.f3714b) && q6 != 2) {
            this.f727b.d(m0.f3714b);
        } else if (q6 != 1) {
            this.f727b.K(m0.f3714b);
        }
    }

    public b(Activity activity, s1.a aVar, Toolbar toolbar, @f1 int i7, @f1 int i8) {
        this(activity, toolbar, aVar, null, i7, i8);
    }

    public b(Activity activity, Toolbar toolbar, s1.a aVar, androidx.appcompat.graphics.drawable.d dVar, @f1 int i7, @f1 int i8) {
        this.f729d = true;
        this.f731f = true;
        this.f736k = false;
        if (toolbar != null) {
            this.f726a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f726a = ((c) activity).g();
        } else {
            this.f726a = new d(activity);
        }
        this.f727b = aVar;
        this.f733h = i7;
        this.f734i = i8;
        if (dVar == null) {
            this.f728c = new androidx.appcompat.graphics.drawable.d(this.f726a.e());
        } else {
            this.f728c = dVar;
        }
        this.f730e = f();
    }
}
