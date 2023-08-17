package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;
import d.b1;
import d.k1;
import i0.w3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.z, androidx.lifecycle.f1, androidx.lifecycle.o, e3.d, androidx.activity.result.c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    @d.o0
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    @d.j0
    private int mContentLayoutId;
    c1.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    w<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.b0 mLifecycleRegistry;
    p.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    @d.b1({b1.a.LIBRARY})
    @d.q0
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    e3.c mSavedStateRegistryController;
    @d.q0
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    @d.q0
    z0 mViewLifecycleOwner;
    androidx.lifecycle.h0<androidx.lifecycle.z> mViewLifecycleOwnerLiveData;
    @d.o0
    String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends androidx.activity.result.i<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f4167a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f4168b;

        public a(AtomicReference atomicReference, c.a aVar) {
            this.f4167a = atomicReference;
            this.f4168b = aVar;
        }

        @Override // androidx.activity.result.i
        @d.o0
        public c.a<I, ?> a() {
            return this.f4168b;
        }

        @Override // androidx.activity.result.i
        public void c(I i7, @d.q0 i0.i iVar) {
            androidx.activity.result.i iVar2 = (androidx.activity.result.i) this.f4167a.get();
            if (iVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            iVar2.c(i7, iVar);
        }

        @Override // androidx.activity.result.i
        public void d() {
            androidx.activity.result.i iVar = (androidx.activity.result.i) this.f4167a.getAndSet(null);
            if (iVar != null) {
                iVar.d();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class c extends m {
        public c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.m
        public void a() {
            Fragment.this.mSavedStateRegistryController.c();
            androidx.lifecycle.s0.c(Fragment.this);
            Bundle bundle = Fragment.this.mSavedFragmentState;
            Fragment.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle(q0.f4468i) : null);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ f1 f4173k;

        public e(f1 f1Var) {
            this.f4173k = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4173k.k();
        }
    }

    /* loaded from: classes.dex */
    public class f extends t {
        public f() {
        }

        @Override // androidx.fragment.app.t
        @d.q0
        public View e(int i7) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.t
        public boolean g() {
            return Fragment.this.mView != null;
        }
    }

    /* loaded from: classes.dex */
    public class g implements n.a<Void, ActivityResultRegistry> {
        public g() {
        }

        @Override // n.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            w<?> wVar = fragment.mHost;
            return wVar instanceof androidx.activity.result.k ? ((androidx.activity.result.k) wVar).o() : fragment.requireActivity().o();
        }
    }

    /* loaded from: classes.dex */
    public class h implements n.a<Void, ActivityResultRegistry> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f4177a;

        public h(ActivityResultRegistry activityResultRegistry) {
            this.f4177a = activityResultRegistry;
        }

        @Override // n.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r12) {
            return this.f4177a;
        }
    }

    /* loaded from: classes.dex */
    public class i extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n.a f4179a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f4180b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.a f4181c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.b f4182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(n.a aVar, AtomicReference atomicReference, c.a aVar2, androidx.activity.result.b bVar) {
            super(null);
            this.f4179a = aVar;
            this.f4180b = atomicReference;
            this.f4181c = aVar2;
            this.f4182d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.m
        public void a() {
            String generateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f4180b.set(((ActivityResultRegistry) this.f4179a.apply(null)).i(generateActivityResultKey, Fragment.this, this.f4181c, this.f4182d));
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public View f4184a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4185b;
        @d.a

        /* renamed from: c  reason: collision with root package name */
        public int f4186c;
        @d.a

        /* renamed from: d  reason: collision with root package name */
        public int f4187d;
        @d.a

        /* renamed from: e  reason: collision with root package name */
        public int f4188e;
        @d.a

        /* renamed from: f  reason: collision with root package name */
        public int f4189f;

        /* renamed from: g  reason: collision with root package name */
        public int f4190g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f4191h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f4192i;

        /* renamed from: j  reason: collision with root package name */
        public Object f4193j = null;

        /* renamed from: k  reason: collision with root package name */
        public Object f4194k;

        /* renamed from: l  reason: collision with root package name */
        public Object f4195l;

        /* renamed from: m  reason: collision with root package name */
        public Object f4196m;

        /* renamed from: n  reason: collision with root package name */
        public Object f4197n;

        /* renamed from: o  reason: collision with root package name */
        public Object f4198o;

        /* renamed from: p  reason: collision with root package name */
        public Boolean f4199p;

        /* renamed from: q  reason: collision with root package name */
        public Boolean f4200q;

        /* renamed from: r  reason: collision with root package name */
        public w3 f4201r;

        /* renamed from: s  reason: collision with root package name */
        public w3 f4202s;

        /* renamed from: t  reason: collision with root package name */
        public float f4203t;

        /* renamed from: u  reason: collision with root package name */
        public View f4204u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f4205v;

        public j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f4194k = obj;
            this.f4195l = null;
            this.f4196m = obj;
            this.f4197n = null;
            this.f4198o = obj;
            this.f4201r = null;
            this.f4202s = null;
            this.f4203t = 1.0f;
            this.f4204u = null;
        }
    }

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class k {
        public static void a(@d.o0 View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static class l extends RuntimeException {
        public l(@d.o0 String str, @d.q0 Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public m() {
        }

        public abstract void a();

        public /* synthetic */ m(b bVar) {
            this();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new g0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = p.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.h0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @d.o0
    @Deprecated
    public static Fragment instantiate(@d.o0 Context context, @d.o0 String str) {
        return instantiate(context, str, null);
    }

    public final j c() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    public void callStartTransitionListener(boolean z6) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f4205v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        f1 r6 = f1.r(viewGroup, fragmentManager);
        r6.t();
        if (z6) {
            this.mHost.l().post(new e(r6));
        } else {
            r6.k();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @d.o0
    public t createFragmentContainer() {
        return new f();
    }

    public final int d() {
        p.b bVar = this.mMaxState;
        return (bVar == p.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.d());
    }

    public void dump(@d.o0 String str, @d.q0 FileDescriptor fileDescriptor, @d.o0 PrintWriter printWriter, @d.q0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment e7 = e(false);
        if (e7 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(e7);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            o2.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.e0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @d.q0
    public final Fragment e(boolean z6) {
        String str;
        if (z6) {
            y1.d.m(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.o0(str);
    }

    public final boolean equals(@d.q0 Object obj) {
        return super.equals(obj);
    }

    public final void f() {
        this.mLifecycleRegistry = new androidx.lifecycle.b0(this);
        this.mSavedStateRegistryController = e3.c.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        i(this.mSavedStateAttachListener);
    }

    @d.q0
    public Fragment findFragmentByWho(@d.o0 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.t0(str);
    }

    @d.o0
    public String generateActivityResultKey() {
        return FragmentManager.V + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @d.q0
    public final FragmentActivity getActivity() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return (FragmentActivity) wVar.j();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f4200q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f4199p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4184a;
    }

    @d.q0
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @d.o0
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @d.q0
    public Context getContext() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return wVar.k();
    }

    @Override // androidx.lifecycle.o
    @d.i
    @d.o0
    public k2.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find Application instance from Context ");
            sb.append(requireContext().getApplicationContext());
            sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        k2.e eVar = new k2.e();
        if (application != null) {
            eVar.c(c1.a.f4720i, application);
        }
        eVar.c(androidx.lifecycle.s0.f4832c, this);
        eVar.c(androidx.lifecycle.s0.f4833d, this);
        if (getArguments() != null) {
            eVar.c(androidx.lifecycle.s0.f4834e, getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.o
    @d.o0
    public c1.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.X0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find Application instance from Context ");
                    sb.append(requireContext().getApplicationContext());
                    sb.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new androidx.lifecycle.v0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @d.a
    public int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4186c;
    }

    @d.q0
    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4193j;
    }

    public w3 getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4201r;
    }

    @d.a
    public int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4187d;
    }

    @d.q0
    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4195l;
    }

    public w3 getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4202s;
    }

    public View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4204u;
    }

    @d.q0
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @d.q0
    public final Object getHost() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return wVar.q();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @d.o0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.z
    @d.o0
    public androidx.lifecycle.p getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @d.o0
    @Deprecated
    public o2.a getLoaderManager() {
        return o2.a.d(this);
    }

    public int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4190g;
    }

    @d.q0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @d.o0
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f4185b;
    }

    @d.a
    public int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4188e;
    }

    @d.a
    public int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4189f;
    }

    public float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f4203t;
    }

    @d.q0
    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f4196m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @d.o0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        y1.d.k(this);
        return this.mRetainInstance;
    }

    @d.q0
    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f4194k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // e3.d
    @d.o0
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @d.q0
    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4197n;
    }

    @d.q0
    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f4198o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @d.o0
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f4191h) == null) ? new ArrayList<>() : arrayList;
    }

    @d.o0
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f4192i) == null) ? new ArrayList<>() : arrayList;
    }

    @d.o0
    public final String getString(@d.f1 int i7) {
        return getResources().getString(i7);
    }

    @d.q0
    public final String getTag() {
        return this.mTag;
    }

    @d.q0
    @Deprecated
    public final Fragment getTargetFragment() {
        return e(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        y1.d.l(this);
        return this.mTargetRequestCode;
    }

    @d.o0
    public final CharSequence getText(@d.f1 int i7) {
        return getResources().getText(i7);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @d.q0
    public View getView() {
        return this.mView;
    }

    @d.l0
    @d.o0
    public androidx.lifecycle.z getViewLifecycleOwner() {
        z0 z0Var = this.mViewLifecycleOwner;
        if (z0Var != null) {
            return z0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @d.o0
    public LiveData<androidx.lifecycle.z> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.f1
    @d.o0
    public androidx.lifecycle.e1 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (d() != p.b.INITIALIZED.ordinal()) {
                return this.mFragmentManager.S0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @d.o0
    public final <I, O> androidx.activity.result.i<I> h(@d.o0 c.a<I, O> aVar, @d.o0 n.a<Void, ActivityResultRegistry> aVar2, @d.o0 androidx.activity.result.b<O> bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            i(new i(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void i(@d.o0 m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    public void initState() {
        f();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new g0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.a1(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.b1(this.mParentFragment));
    }

    public boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f4205v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.e1();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final void j() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle(q0.f4467h) : null);
        }
        this.mSavedFragmentState = null;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.o1();
    }

    @d.i
    @d.l0
    @Deprecated
    public void onActivityCreated(@d.q0 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i7, int i8, @d.q0 Intent intent) {
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i7);
            sb.append(" resultCode: ");
            sb.append(i8);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    @d.i
    @d.l0
    public void onAttach(@d.o0 Context context) {
        this.mCalled = true;
        w<?> wVar = this.mHost;
        Activity j7 = wVar == null ? null : wVar.j();
        if (j7 != null) {
            this.mCalled = false;
            onAttach(j7);
        }
    }

    @d.l0
    @Deprecated
    public void onAttachFragment(@d.o0 Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @d.i
    public void onConfigurationChanged(@d.o0 Configuration configuration) {
        this.mCalled = true;
    }

    @d.l0
    public boolean onContextItemSelected(@d.o0 MenuItem menuItem) {
        return false;
    }

    @d.i
    @d.l0
    public void onCreate(@d.q0 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.d1(1)) {
            return;
        }
        this.mChildFragmentManager.J();
    }

    @d.l0
    @d.q0
    public Animation onCreateAnimation(int i7, boolean z6, int i8) {
        return null;
    }

    @d.l0
    @d.q0
    public Animator onCreateAnimator(int i7, boolean z6, int i8) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @d.l0
    public void onCreateContextMenu(@d.o0 ContextMenu contextMenu, @d.o0 View view, @d.q0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @d.l0
    @Deprecated
    public void onCreateOptionsMenu(@d.o0 Menu menu, @d.o0 MenuInflater menuInflater) {
    }

    @d.l0
    @d.q0
    public View onCreateView(@d.o0 LayoutInflater layoutInflater, @d.q0 ViewGroup viewGroup, @d.q0 Bundle bundle) {
        int i7 = this.mContentLayoutId;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    @d.i
    @d.l0
    public void onDestroy() {
        this.mCalled = true;
    }

    @d.l0
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @d.i
    @d.l0
    public void onDestroyView() {
        this.mCalled = true;
    }

    @d.i
    @d.l0
    public void onDetach() {
        this.mCalled = true;
    }

    @d.o0
    public LayoutInflater onGetLayoutInflater(@d.q0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @d.l0
    public void onHiddenChanged(boolean z6) {
    }

    @d.i
    @k1
    public void onInflate(@d.o0 Context context, @d.o0 AttributeSet attributeSet, @d.q0 Bundle bundle) {
        this.mCalled = true;
        w<?> wVar = this.mHost;
        Activity j7 = wVar == null ? null : wVar.j();
        if (j7 != null) {
            this.mCalled = false;
            onInflate(j7, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @d.i
    @d.l0
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z6) {
    }

    @d.l0
    @Deprecated
    public boolean onOptionsItemSelected(@d.o0 MenuItem menuItem) {
        return false;
    }

    @d.l0
    @Deprecated
    public void onOptionsMenuClosed(@d.o0 Menu menu) {
    }

    @d.i
    @d.l0
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z6) {
    }

    @d.l0
    @Deprecated
    public void onPrepareOptionsMenu(@d.o0 Menu menu) {
    }

    @d.l0
    public void onPrimaryNavigationFragmentChanged(boolean z6) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i7, @d.o0 String[] strArr, @d.o0 int[] iArr) {
    }

    @d.i
    @d.l0
    public void onResume() {
        this.mCalled = true;
    }

    @d.l0
    public void onSaveInstanceState(@d.o0 Bundle bundle) {
    }

    @d.i
    @d.l0
    public void onStart() {
        this.mCalled = true;
    }

    @d.i
    @d.l0
    public void onStop() {
        this.mCalled = true;
    }

    @d.l0
    public void onViewCreated(@d.o0 View view, @d.q0 Bundle bundle) {
    }

    @d.i
    @d.l0
    public void onViewStateRestored(@d.q0 Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.o1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            j();
            this.mChildFragmentManager.F();
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.s(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.k());
        if (this.mCalled) {
            this.mFragmentManager.P(this);
            this.mChildFragmentManager.G();
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(@d.o0 Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@d.o0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.I(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.o1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.v() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.v
            public void d(@d.o0 androidx.lifecycle.z zVar, @d.o0 p.a aVar) {
                View view;
                if (aVar != p.a.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                k.a(view);
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.l(p.a.ON_CREATE);
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(@d.o0 Menu menu, @d.o0 MenuInflater menuInflater) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z6 = true;
        }
        return z6 | this.mChildFragmentManager.K(menu, menuInflater);
    }

    public void performCreateView(@d.o0 LayoutInflater layoutInflater, @d.q0 ViewGroup viewGroup, @d.q0 Bundle bundle) {
        this.mChildFragmentManager.o1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new z0(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.n
            @Override // java.lang.Runnable
            public final void run() {
                Fragment.this.g();
            }
        });
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting ViewLifecycleOwner on View ");
            sb.append(this.mView);
            sb.append(" for Fragment ");
            sb.append(this);
        }
        androidx.lifecycle.g1.b(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.i1.b(this.mView, this.mViewLifecycleOwner);
        e3.f.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.r(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.L();
        this.mLifecycleRegistry.l(p.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.M();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().d(p.b.CREATED)) {
            this.mViewLifecycleOwner.a(p.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            o2.a.d(this).h();
            this.mPerformedCreateView = false;
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.W0()) {
                return;
            }
            this.mChildFragmentManager.L();
            this.mChildFragmentManager = new g0();
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onDetach()");
    }

    @d.o0
    public LayoutInflater performGetLayoutInflater(@d.q0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z6) {
        onMultiWindowModeChanged(z6);
    }

    public boolean performOptionsItemSelected(@d.o0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.R(menuItem);
    }

    public void performOptionsMenuClosed(@d.o0 Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.S(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(p.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.l(p.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z6) {
        onPictureInPictureModeChanged(z6);
    }

    public boolean performPrepareOptionsMenu(@d.o0 Menu menu) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z6 = true;
        }
        return z6 | this.mChildFragmentManager.W(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean c12 = this.mFragmentManager.c1(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != c12) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(c12);
            onPrimaryNavigationFragmentChanged(c12);
            this.mChildFragmentManager.X();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.o1();
        this.mChildFragmentManager.j0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new i1("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.b0 b0Var = this.mLifecycleRegistry;
        p.a aVar = p.a.ON_RESUME;
        b0Var.l(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Y();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.o1();
        this.mChildFragmentManager.j0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new i1("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.b0 b0Var = this.mLifecycleRegistry;
        p.a aVar = p.a.ON_START;
        b0Var.l(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Z();
    }

    public void performStop() {
        this.mChildFragmentManager.b0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(p.a.ON_STOP);
        }
        this.mLifecycleRegistry.l(p.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle(q0.f4467h) : null);
        this.mChildFragmentManager.c0();
    }

    public void postponeEnterTransition() {
        c().f4205v = true;
    }

    @Override // androidx.activity.result.c
    @d.l0
    @d.o0
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@d.o0 c.a<I, O> aVar, @d.o0 androidx.activity.result.b<O> bVar) {
        return h(aVar, new g(), bVar);
    }

    public void registerForContextMenu(@d.o0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@d.o0 String[] strArr, int i7) {
        if (this.mHost != null) {
            getParentFragmentManager().k1(this, strArr, i7);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @d.o0
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @d.o0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @d.o0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @d.o0
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @d.o0
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @d.o0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    @d.o0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle(q0.f4469j)) == null) {
            return;
        }
        this.mChildFragmentManager.N1(bundle);
        this.mChildFragmentManager.J();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(p.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new i1("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void setAllowEnterTransitionOverlap(boolean z6) {
        c().f4200q = Boolean.valueOf(z6);
    }

    public void setAllowReturnTransitionOverlap(boolean z6) {
        c().f4199p = Boolean.valueOf(z6);
    }

    public void setAnimations(@d.a int i7, @d.a int i8, @d.a int i9, @d.a int i10) {
        if (this.mAnimationInfo == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        c().f4186c = i7;
        c().f4187d = i8;
        c().f4188e = i9;
        c().f4189f = i10;
    }

    public void setArguments(@d.q0 Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@d.q0 w3 w3Var) {
        c().f4201r = w3Var;
    }

    public void setEnterTransition(@d.q0 Object obj) {
        c().f4193j = obj;
    }

    public void setExitSharedElementCallback(@d.q0 w3 w3Var) {
        c().f4202s = w3Var;
    }

    public void setExitTransition(@d.q0 Object obj) {
        c().f4195l = obj;
    }

    public void setFocusedView(View view) {
        c().f4204u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z6) {
        if (this.mHasMenu != z6) {
            this.mHasMenu = z6;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.B();
        }
    }

    public void setInitialSavedState(@d.q0 n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f4206k) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z6) {
        if (this.mMenuVisible != z6) {
            this.mMenuVisible = z6;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.B();
            }
        }
    }

    public void setNextTransition(int i7) {
        if (this.mAnimationInfo == null && i7 == 0) {
            return;
        }
        c();
        this.mAnimationInfo.f4190g = i7;
    }

    public void setPopDirection(boolean z6) {
        if (this.mAnimationInfo == null) {
            return;
        }
        c().f4185b = z6;
    }

    public void setPostOnViewCreatedAlpha(float f7) {
        c().f4203t = f7;
    }

    public void setReenterTransition(@d.q0 Object obj) {
        c().f4196m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z6) {
        y1.d.o(this);
        this.mRetainInstance = z6;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z6) {
            fragmentManager.q(this);
        } else {
            fragmentManager.H1(this);
        }
    }

    public void setReturnTransition(@d.q0 Object obj) {
        c().f4194k = obj;
    }

    public void setSharedElementEnterTransition(@d.q0 Object obj) {
        c().f4197n = obj;
    }

    public void setSharedElementNames(@d.q0 ArrayList<String> arrayList, @d.q0 ArrayList<String> arrayList2) {
        c();
        j jVar = this.mAnimationInfo;
        jVar.f4191h = arrayList;
        jVar.f4192i = arrayList2;
    }

    public void setSharedElementReturnTransition(@d.q0 Object obj) {
        c().f4198o = obj;
    }

    @Deprecated
    public void setTargetFragment(@d.q0 Fragment fragment, int i7) {
        if (fragment != null) {
            y1.d.p(this, fragment, i7);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.e(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i7;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z6) {
        y1.d.q(this, z6);
        if (!this.mUserVisibleHint && z6 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.r1(fragmentManager.D(this));
        }
        this.mUserVisibleHint = z6;
        this.mDeferStart = this.mState < 5 && !z6;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z6);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@d.o0 String str) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            return wVar.x(str);
        }
        return false;
    }

    public void startActivity(@d.o0 Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@d.o0 Intent intent, int i7) {
        startActivityForResult(intent, i7, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@d.o0 IntentSender intentSender, int i7, @d.q0 Intent intent, int i8, int i9, int i10, @d.q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i7);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            sb.append(bundle);
        }
        getParentFragmentManager().m1(this, intentSender, i7, intent, i8, i9, i10, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !c().f4205v) {
            return;
        }
        if (this.mHost == null) {
            c().f4205v = false;
        } else if (Looper.myLooper() != this.mHost.l().getLooper()) {
            this.mHost.l().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@d.o0 View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class n implements Parcelable {
        @d.o0
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public final Bundle f4206k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i7) {
                return new n[i7];
            }
        }

        public n(Bundle bundle) {
            this.f4206k = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@d.o0 Parcel parcel, int i7) {
            parcel.writeBundle(this.f4206k);
        }

        public n(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f4206k = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @d.o0
    @Deprecated
    public static Fragment instantiate(@d.o0 Context context, @d.o0 String str, @d.q0 Bundle bundle) {
        try {
            Fragment newInstance = v.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e7) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }

    @d.o0
    public final String getString(@d.f1 int i7, @d.q0 Object... objArr) {
        return getResources().getString(i7, objArr);
    }

    public final void postponeEnterTransition(long j7, @d.o0 TimeUnit timeUnit) {
        c().f4205v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.K0().l();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j7));
    }

    @Override // androidx.activity.result.c
    @d.l0
    @d.o0
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@d.o0 c.a<I, O> aVar, @d.o0 ActivityResultRegistry activityResultRegistry, @d.o0 androidx.activity.result.b<O> bVar) {
        return h(aVar, new h(activityResultRegistry), bVar);
    }

    public void startActivity(@d.o0 Intent intent, @d.q0 Bundle bundle) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            wVar.z(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@d.o0 Intent intent, int i7, @d.q0 Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().l1(this, intent, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    @Deprecated
    public LayoutInflater getLayoutInflater(@d.q0 Bundle bundle) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            LayoutInflater s6 = wVar.s();
            androidx.core.view.p0.d(s6, this.mChildFragmentManager.L0());
            return s6;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @d.i
    @d.l0
    @Deprecated
    public void onAttach(@d.o0 Activity activity) {
        this.mCalled = true;
    }

    @d.i
    @k1
    @Deprecated
    public void onInflate(@d.o0 Activity activity, @d.o0 AttributeSet attributeSet, @d.q0 Bundle bundle) {
        this.mCalled = true;
    }

    @d.o
    public Fragment(@d.j0 int i7) {
        this();
        this.mContentLayoutId = i7;
    }
}
