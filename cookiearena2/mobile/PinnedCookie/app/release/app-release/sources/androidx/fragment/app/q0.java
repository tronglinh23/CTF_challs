package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f1;
import androidx.lifecycle.p;
import x1.a;
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: f  reason: collision with root package name */
    public static final String f4465f = "FragmentManager";

    /* renamed from: g  reason: collision with root package name */
    public static final String f4466g = "state";

    /* renamed from: h  reason: collision with root package name */
    public static final String f4467h = "savedInstanceState";

    /* renamed from: i  reason: collision with root package name */
    public static final String f4468i = "registryState";

    /* renamed from: j  reason: collision with root package name */
    public static final String f4469j = "childFragmentManager";

    /* renamed from: k  reason: collision with root package name */
    public static final String f4470k = "viewState";

    /* renamed from: l  reason: collision with root package name */
    public static final String f4471l = "viewRegistryState";

    /* renamed from: m  reason: collision with root package name */
    public static final String f4472m = "arguments";

    /* renamed from: a  reason: collision with root package name */
    public final a0 f4473a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f4474b;
    @d.o0

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f4475c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4476d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f4477e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f4478b;

        public a(View view) {
            this.f4478b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4478b.removeOnAttachStateChangeListener(this);
            u1.v1(this.f4478b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4480a;

        static {
            int[] iArr = new int[p.b.values().length];
            f4480a = iArr;
            try {
                iArr[p.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4480a[p.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4480a[p.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4480a[p.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public q0(@d.o0 a0 a0Var, @d.o0 s0 s0Var, @d.o0 Fragment fragment) {
        this.f4473a = a0Var;
        this.f4474b = s0Var;
        this.f4475c = fragment;
    }

    public void a() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f4475c);
        }
        Bundle bundle = this.f4475c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f4467h) : null;
        this.f4475c.performActivityCreated(bundle2);
        this.f4473a.a(this.f4475c, bundle2, false);
    }

    public void b() {
        Fragment v02 = FragmentManager.v0(this.f4475c.mContainer);
        Fragment parentFragment = this.f4475c.getParentFragment();
        if (v02 != null && !v02.equals(parentFragment)) {
            Fragment fragment = this.f4475c;
            y1.d.s(fragment, v02, fragment.mContainerId);
        }
        int j7 = this.f4474b.j(this.f4475c);
        Fragment fragment2 = this.f4475c;
        fragment2.mContainer.addView(fragment2.mView, j7);
    }

    public void c() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f4475c);
        }
        Fragment fragment = this.f4475c;
        Fragment fragment2 = fragment.mTarget;
        q0 q0Var = null;
        if (fragment2 != null) {
            q0 o6 = this.f4474b.o(fragment2.mWho);
            if (o6 == null) {
                throw new IllegalStateException("Fragment " + this.f4475c + " declared target fragment " + this.f4475c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f4475c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            q0Var = o6;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (q0Var = this.f4474b.o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4475c + " declared target fragment " + this.f4475c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (q0Var != null) {
            q0Var.m();
        }
        Fragment fragment4 = this.f4475c;
        fragment4.mHost = fragment4.mFragmentManager.K0();
        Fragment fragment5 = this.f4475c;
        fragment5.mParentFragment = fragment5.mFragmentManager.N0();
        this.f4473a.g(this.f4475c, false);
        this.f4475c.performAttach();
        this.f4473a.b(this.f4475c, false);
    }

    public int d() {
        Fragment fragment = this.f4475c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i7 = this.f4477e;
        int i8 = b.f4480a[fragment.mMaxState.ordinal()];
        if (i8 != 1) {
            i7 = i8 != 2 ? i8 != 3 ? i8 != 4 ? Math.min(i7, -1) : Math.min(i7, 0) : Math.min(i7, 1) : Math.min(i7, 5);
        }
        Fragment fragment2 = this.f4475c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i7 = Math.max(this.f4477e, 2);
                View view = this.f4475c.mView;
                if (view != null && view.getParent() == null) {
                    i7 = Math.min(i7, 2);
                }
            } else {
                i7 = this.f4477e < 4 ? Math.min(i7, fragment2.mState) : Math.min(i7, 1);
            }
        }
        if (!this.f4475c.mAdded) {
            i7 = Math.min(i7, 1);
        }
        Fragment fragment3 = this.f4475c;
        ViewGroup viewGroup = fragment3.mContainer;
        f1.c.a p6 = viewGroup != null ? f1.r(viewGroup, fragment3.getParentFragmentManager()).p(this) : null;
        if (p6 == f1.c.a.ADDING) {
            i7 = Math.min(i7, 6);
        } else if (p6 == f1.c.a.REMOVING) {
            i7 = Math.max(i7, 3);
        } else {
            Fragment fragment4 = this.f4475c;
            if (fragment4.mRemoving) {
                i7 = fragment4.isInBackStack() ? Math.min(i7, 1) : Math.min(i7, -1);
            }
        }
        Fragment fragment5 = this.f4475c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i7 = Math.min(i7, 4);
        }
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i7);
            sb.append(" for ");
            sb.append(this.f4475c);
        }
        return i7;
    }

    public void e() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f4475c);
        }
        Bundle bundle = this.f4475c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f4467h) : null;
        Fragment fragment = this.f4475c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
            return;
        }
        this.f4473a.h(fragment, bundle2, false);
        this.f4475c.performCreate(bundle2);
        this.f4473a.c(this.f4475c, bundle2, false);
    }

    public void f() {
        String str;
        if (this.f4475c.mFromLayout) {
            return;
        }
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.f4475c);
        }
        Bundle bundle = this.f4475c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f4467h) : null;
        LayoutInflater performGetLayoutInflater = this.f4475c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f4475c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i7 = fragment.mContainerId;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4475c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.E0().e(this.f4475c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f4475c;
                    if (!fragment2.mRestored) {
                        try {
                            str = fragment2.getResources().getResourceName(this.f4475c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = z0.m.f19022b;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4475c.mContainerId) + " (" + str + ") for fragment " + this.f4475c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    y1.d.r(this.f4475c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f4475c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (this.f4475c.mView != null) {
            if (FragmentManager.X0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveto VIEW_CREATED: ");
                sb2.append(this.f4475c);
            }
            this.f4475c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f4475c;
            fragment4.mView.setTag(a.c.f18264a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f4475c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (u1.O0(this.f4475c.mView)) {
                u1.v1(this.f4475c.mView);
            } else {
                View view = this.f4475c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f4475c.performViewCreated();
            a0 a0Var = this.f4473a;
            Fragment fragment6 = this.f4475c;
            a0Var.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f4475c.mView.getVisibility();
            this.f4475c.setPostOnViewCreatedAlpha(this.f4475c.mView.getAlpha());
            Fragment fragment7 = this.f4475c;
            if (fragment7.mContainer != null && visibility == 0) {
                View findFocus = fragment7.mView.findFocus();
                if (findFocus != null) {
                    this.f4475c.setFocusedView(findFocus);
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("requestFocus: Saved focused view ");
                        sb3.append(findFocus);
                        sb3.append(" for Fragment ");
                        sb3.append(this.f4475c);
                    }
                }
                this.f4475c.mView.setAlpha(0.0f);
            }
        }
        this.f4475c.mState = 2;
    }

    public void g() {
        Fragment f7;
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f4475c);
        }
        Fragment fragment = this.f4475c;
        boolean z6 = true;
        boolean z7 = fragment.mRemoving && !fragment.isInBackStack();
        if (z7) {
            Fragment fragment2 = this.f4475c;
            if (!fragment2.mBeingSaved) {
                this.f4474b.C(fragment2.mWho, null);
            }
        }
        if (!(z7 || this.f4474b.q().v(this.f4475c))) {
            String str = this.f4475c.mTargetWho;
            if (str != null && (f7 = this.f4474b.f(str)) != null && f7.mRetainInstance) {
                this.f4475c.mTarget = f7;
            }
            this.f4475c.mState = 0;
            return;
        }
        w<?> wVar = this.f4475c.mHost;
        if (wVar instanceof androidx.lifecycle.f1) {
            z6 = this.f4474b.q().r();
        } else if (wVar.k() instanceof Activity) {
            z6 = true ^ ((Activity) wVar.k()).isChangingConfigurations();
        }
        if ((z7 && !this.f4475c.mBeingSaved) || z6) {
            this.f4474b.q().i(this.f4475c);
        }
        this.f4475c.performDestroy();
        this.f4473a.d(this.f4475c, false);
        for (q0 q0Var : this.f4474b.l()) {
            if (q0Var != null) {
                Fragment k7 = q0Var.k();
                if (this.f4475c.mWho.equals(k7.mTargetWho)) {
                    k7.mTarget = this.f4475c;
                    k7.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f4475c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f4474b.f(str2);
        }
        this.f4474b.t(this);
    }

    public void h() {
        View view;
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f4475c);
        }
        Fragment fragment = this.f4475c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4475c.performDestroyView();
        this.f4473a.n(this.f4475c, false);
        Fragment fragment2 = this.f4475c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.r(null);
        this.f4475c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f4475c);
        }
        this.f4475c.performDetach();
        boolean z6 = false;
        this.f4473a.e(this.f4475c, false);
        Fragment fragment = this.f4475c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z6 = true;
        }
        if (z6 || this.f4474b.q().v(this.f4475c)) {
            if (FragmentManager.X0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f4475c);
            }
            this.f4475c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.f4475c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.X0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f4475c);
            }
            Bundle bundle = this.f4475c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle(f4467h) : null;
            Fragment fragment2 = this.f4475c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f4475c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4475c;
                fragment3.mView.setTag(a.c.f18264a, fragment3);
                Fragment fragment4 = this.f4475c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4475c.performViewCreated();
                a0 a0Var = this.f4473a;
                Fragment fragment5 = this.f4475c;
                a0Var.m(fragment5, fragment5.mView, bundle2, false);
                this.f4475c.mState = 2;
            }
        }
    }

    @d.o0
    public Fragment k() {
        return this.f4475c;
    }

    public final boolean l(@d.o0 View view) {
        if (view == this.f4475c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4475c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4476d) {
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(k());
                return;
            }
            return;
        }
        try {
            this.f4476d = true;
            boolean z6 = false;
            while (true) {
                int d7 = d();
                Fragment fragment = this.f4475c;
                int i7 = fragment.mState;
                if (d7 == i7) {
                    if (!z6 && i7 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f4475c.mBeingSaved) {
                        if (FragmentManager.X0(3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cleaning up state of never attached fragment: ");
                            sb2.append(this.f4475c);
                        }
                        this.f4474b.q().i(this.f4475c);
                        this.f4474b.t(this);
                        if (FragmentManager.X0(3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("initState called for fragment: ");
                            sb3.append(this.f4475c);
                        }
                        this.f4475c.initState();
                    }
                    Fragment fragment2 = this.f4475c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            f1 r6 = f1.r(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f4475c.mHidden) {
                                r6.g(this);
                            } else {
                                r6.i(this);
                            }
                        }
                        Fragment fragment3 = this.f4475c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.V0(fragment3);
                        }
                        Fragment fragment4 = this.f4475c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f4475c.mChildFragmentManager.Q();
                    }
                    return;
                }
                if (d7 > i7) {
                    switch (i7 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                f1.r(viewGroup3, fragment.getParentFragmentManager()).f(f1.c.b.e(this.f4475c.mView.getVisibility()), this);
                            }
                            this.f4475c.mState = 4;
                            continue;
                        case 5:
                            u();
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i7 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            if (fragment.mBeingSaved && this.f4474b.r(fragment.mWho) == null) {
                                this.f4474b.C(this.f4475c.mWho, r());
                            }
                            g();
                            continue;
                        case 1:
                            h();
                            this.f4475c.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (FragmentManager.X0(3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("movefrom ACTIVITY_CREATED: ");
                                sb4.append(this.f4475c);
                            }
                            Fragment fragment5 = this.f4475c;
                            if (fragment5.mBeingSaved) {
                                this.f4474b.C(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f4475c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                f1.r(viewGroup2, fragment6.getParentFragmentManager()).h(this);
                            }
                            this.f4475c.mState = 3;
                            continue;
                        case 4:
                            v();
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
                z6 = true;
            }
        } finally {
            this.f4476d = false;
        }
    }

    public void n() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f4475c);
        }
        this.f4475c.performPause();
        this.f4473a.f(this.f4475c, false);
    }

    public void o(@d.o0 ClassLoader classLoader) {
        Bundle bundle = this.f4475c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f4475c.mSavedFragmentState.getBundle(f4467h) == null) {
            this.f4475c.mSavedFragmentState.putBundle(f4467h, new Bundle());
        }
        Fragment fragment = this.f4475c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f4470k);
        Fragment fragment2 = this.f4475c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f4471l);
        p0 p0Var = (p0) this.f4475c.mSavedFragmentState.getParcelable("state");
        if (p0Var != null) {
            Fragment fragment3 = this.f4475c;
            fragment3.mTargetWho = p0Var.f4461v;
            fragment3.mTargetRequestCode = p0Var.f4462w;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.f4475c.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = p0Var.f4463x;
            }
        }
        Fragment fragment4 = this.f4475c;
        if (fragment4.mUserVisibleHint) {
            return;
        }
        fragment4.mDeferStart = true;
    }

    public void p() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f4475c);
        }
        View focusedView = this.f4475c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.X0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f4475c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4475c.mView.findFocus());
            }
        }
        this.f4475c.setFocusedView(null);
        this.f4475c.performResume();
        this.f4473a.i(this.f4475c, false);
        Fragment fragment = this.f4475c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @d.q0
    public Fragment.n q() {
        if (this.f4475c.mState > -1) {
            return new Fragment.n(r());
        }
        return null;
    }

    @d.o0
    public Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f4475c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new p0(this.f4475c));
        if (this.f4475c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f4475c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle(f4467h, bundle3);
            }
            this.f4473a.j(this.f4475c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f4475c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(f4468i, bundle4);
            }
            Bundle f12 = this.f4475c.mChildFragmentManager.f1();
            if (!f12.isEmpty()) {
                bundle2.putBundle(f4469j, f12);
            }
            if (this.f4475c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f4475c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray(f4470k, sparseArray);
            }
            Bundle bundle5 = this.f4475c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle(f4471l, bundle5);
            }
        }
        Bundle bundle6 = this.f4475c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle(f4472m, bundle6);
        }
        return bundle2;
    }

    public void s() {
        if (this.f4475c.mView == null) {
            return;
        }
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append(this.f4475c);
            sb.append(" with view ");
            sb.append(this.f4475c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4475c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4475c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4475c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4475c.mSavedViewRegistryState = bundle;
    }

    public void t(int i7) {
        this.f4477e = i7;
    }

    public void u() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f4475c);
        }
        this.f4475c.performStart();
        this.f4473a.k(this.f4475c, false);
    }

    public void v() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f4475c);
        }
        this.f4475c.performStop();
        this.f4473a.l(this.f4475c, false);
    }

    public q0(@d.o0 a0 a0Var, @d.o0 s0 s0Var, @d.o0 ClassLoader classLoader, @d.o0 v vVar, @d.o0 Bundle bundle) {
        this.f4473a = a0Var;
        this.f4474b = s0Var;
        Fragment a7 = ((p0) bundle.getParcelable("state")).a(vVar, classLoader);
        this.f4475c = a7;
        a7.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle(f4472m);
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a7.setArguments(bundle2);
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a7);
        }
    }

    public q0(@d.o0 a0 a0Var, @d.o0 s0 s0Var, @d.o0 Fragment fragment, @d.o0 Bundle bundle) {
        this.f4473a = a0Var;
        this.f4474b = s0Var;
        this.f4475c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle(f4472m);
    }
}
