package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import java.util.ArrayList;
@Deprecated
/* loaded from: classes.dex */
public abstract class r0 extends p3.a {

    /* renamed from: l  reason: collision with root package name */
    public static final String f4482l = "FragmentStatePagerAdapt";

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f4483m = false;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    public static final int f4484n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f4485o = 1;

    /* renamed from: e  reason: collision with root package name */
    public final FragmentManager f4486e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4487f;

    /* renamed from: g  reason: collision with root package name */
    public u0 f4488g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<Fragment.n> f4489h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<Fragment> f4490i;

    /* renamed from: j  reason: collision with root package name */
    public Fragment f4491j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4492k;

    @Deprecated
    public r0(@d.o0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // p3.a
    public void b(@d.o0 ViewGroup viewGroup, int i7, @d.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f4488g == null) {
            this.f4488g = this.f4486e.u();
        }
        while (this.f4489h.size() <= i7) {
            this.f4489h.add(null);
        }
        this.f4489h.set(i7, fragment.isAdded() ? this.f4486e.U1(fragment) : null);
        this.f4490i.set(i7, null);
        this.f4488g.B(fragment);
        if (fragment.equals(this.f4491j)) {
            this.f4491j = null;
        }
    }

    @Override // p3.a
    public void d(@d.o0 ViewGroup viewGroup) {
        u0 u0Var = this.f4488g;
        if (u0Var != null) {
            if (!this.f4492k) {
                try {
                    this.f4492k = true;
                    u0Var.t();
                } finally {
                    this.f4492k = false;
                }
            }
            this.f4488g = null;
        }
    }

    @Override // p3.a
    @d.o0
    public Object j(@d.o0 ViewGroup viewGroup, int i7) {
        Fragment.n nVar;
        Fragment fragment;
        if (this.f4490i.size() <= i7 || (fragment = this.f4490i.get(i7)) == null) {
            if (this.f4488g == null) {
                this.f4488g = this.f4486e.u();
            }
            Fragment v6 = v(i7);
            if (this.f4489h.size() > i7 && (nVar = this.f4489h.get(i7)) != null) {
                v6.setInitialSavedState(nVar);
            }
            while (this.f4490i.size() <= i7) {
                this.f4490i.add(null);
            }
            v6.setMenuVisibility(false);
            if (this.f4487f == 0) {
                v6.setUserVisibleHint(false);
            }
            this.f4490i.set(i7, v6);
            this.f4488g.f(viewGroup.getId(), v6);
            if (this.f4487f == 1) {
                this.f4488g.O(v6, p.b.STARTED);
            }
            return v6;
        }
        return fragment;
    }

    @Override // p3.a
    public boolean k(@d.o0 View view, @d.o0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p3.a
    public void n(@d.q0 Parcelable parcelable, @d.q0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f4489h.clear();
            this.f4490i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f4489h.add((Fragment.n) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment F0 = this.f4486e.F0(bundle, str);
                    if (F0 != null) {
                        while (this.f4490i.size() <= parseInt) {
                            this.f4490i.add(null);
                        }
                        F0.setMenuVisibility(false);
                        this.f4490i.set(parseInt, F0);
                    } else {
                        Log.w(f4482l, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // p3.a
    @d.q0
    public Parcelable o() {
        Bundle bundle;
        if (this.f4489h.size() > 0) {
            bundle = new Bundle();
            Fragment.n[] nVarArr = new Fragment.n[this.f4489h.size()];
            this.f4489h.toArray(nVarArr);
            bundle.putParcelableArray("states", nVarArr);
        } else {
            bundle = null;
        }
        for (int i7 = 0; i7 < this.f4490i.size(); i7++) {
            Fragment fragment = this.f4490i.get(i7);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f4486e.B1(bundle, "f" + i7, fragment);
            }
        }
        return bundle;
    }

    @Override // p3.a
    public void q(@d.o0 ViewGroup viewGroup, int i7, @d.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4491j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f4487f == 1) {
                    if (this.f4488g == null) {
                        this.f4488g = this.f4486e.u();
                    }
                    this.f4488g.O(this.f4491j, p.b.STARTED);
                } else {
                    this.f4491j.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f4487f == 1) {
                if (this.f4488g == null) {
                    this.f4488g = this.f4486e.u();
                }
                this.f4488g.O(fragment, p.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f4491j = fragment;
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

    public r0(@d.o0 FragmentManager fragmentManager, int i7) {
        this.f4488g = null;
        this.f4489h = new ArrayList<>();
        this.f4490i = new ArrayList<>();
        this.f4491j = null;
        this.f4486e = fragmentManager;
        this.f4487f = i7;
    }
}
