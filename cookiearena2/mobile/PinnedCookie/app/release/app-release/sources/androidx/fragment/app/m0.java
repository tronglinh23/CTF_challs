package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
@Deprecated
/* loaded from: classes.dex */
public abstract class m0 extends p3.a {

    /* renamed from: j  reason: collision with root package name */
    public static final String f4438j = "FragmentPagerAdapter";

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f4439k = false;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final int f4440l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f4441m = 1;

    /* renamed from: e  reason: collision with root package name */
    public final FragmentManager f4442e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4443f;

    /* renamed from: g  reason: collision with root package name */
    public u0 f4444g;

    /* renamed from: h  reason: collision with root package name */
    public Fragment f4445h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4446i;

    @Deprecated
    public m0(@d.o0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public static String x(int i7, long j7) {
        return "android:switcher:" + i7 + ":" + j7;
    }

    @Override // p3.a
    public void b(@d.o0 ViewGroup viewGroup, int i7, @d.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f4444g == null) {
            this.f4444g = this.f4442e.u();
        }
        this.f4444g.v(fragment);
        if (fragment.equals(this.f4445h)) {
            this.f4445h = null;
        }
    }

    @Override // p3.a
    public void d(@d.o0 ViewGroup viewGroup) {
        u0 u0Var = this.f4444g;
        if (u0Var != null) {
            if (!this.f4446i) {
                try {
                    this.f4446i = true;
                    u0Var.t();
                } finally {
                    this.f4446i = false;
                }
            }
            this.f4444g = null;
        }
    }

    @Override // p3.a
    @d.o0
    public Object j(@d.o0 ViewGroup viewGroup, int i7) {
        if (this.f4444g == null) {
            this.f4444g = this.f4442e.u();
        }
        long w6 = w(i7);
        Fragment s02 = this.f4442e.s0(x(viewGroup.getId(), w6));
        if (s02 != null) {
            this.f4444g.p(s02);
        } else {
            s02 = v(i7);
            this.f4444g.g(viewGroup.getId(), s02, x(viewGroup.getId(), w6));
        }
        if (s02 != this.f4445h) {
            s02.setMenuVisibility(false);
            if (this.f4443f == 1) {
                this.f4444g.O(s02, p.b.STARTED);
            } else {
                s02.setUserVisibleHint(false);
            }
        }
        return s02;
    }

    @Override // p3.a
    public boolean k(@d.o0 View view, @d.o0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p3.a
    public void n(@d.q0 Parcelable parcelable, @d.q0 ClassLoader classLoader) {
    }

    @Override // p3.a
    @d.q0
    public Parcelable o() {
        return null;
    }

    @Override // p3.a
    public void q(@d.o0 ViewGroup viewGroup, int i7, @d.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4445h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f4443f == 1) {
                    if (this.f4444g == null) {
                        this.f4444g = this.f4442e.u();
                    }
                    this.f4444g.O(this.f4445h, p.b.STARTED);
                } else {
                    this.f4445h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f4443f == 1) {
                if (this.f4444g == null) {
                    this.f4444g = this.f4442e.u();
                }
                this.f4444g.O(fragment, p.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f4445h = fragment;
        }
    }

    @Override // p3.a
    public void t(@d.o0 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @d.o0
    public abstract Fragment v(int i7);

    public long w(int i7) {
        return i7;
    }

    public m0(@d.o0 FragmentManager fragmentManager, int i7) {
        this.f4444g = null;
        this.f4445h = null;
        this.f4442e = fragmentManager;
        this.f4443f = i7;
    }
}
