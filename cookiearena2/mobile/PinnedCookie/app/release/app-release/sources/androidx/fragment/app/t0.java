package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
@Deprecated
/* loaded from: classes.dex */
public class t0 extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f4505b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f4506c;

    /* renamed from: d  reason: collision with root package name */
    public Context f4507d;

    /* renamed from: e  reason: collision with root package name */
    public FragmentManager f4508e;

    /* renamed from: f  reason: collision with root package name */
    public int f4509f;

    /* renamed from: g  reason: collision with root package name */
    public TabHost.OnTabChangeListener f4510g;

    /* renamed from: h  reason: collision with root package name */
    public c f4511h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4512i;

    /* loaded from: classes.dex */
    public static class a implements TabHost.TabContentFactory {

        /* renamed from: a  reason: collision with root package name */
        public final Context f4513a;

        public a(Context context) {
            this.f4513a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f4513a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public String f4514k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        @d.o0
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f4514k + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.f4514k);
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f4514k = parcel.readString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final String f4515a;
        @d.o0

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f4516b;
        @d.q0

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f4517c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f4518d;

        public c(@d.o0 String str, @d.o0 Class<?> cls, @d.q0 Bundle bundle) {
            this.f4515a = str;
            this.f4516b = cls;
            this.f4517c = bundle;
        }
    }

    @Deprecated
    public t0(@d.o0 Context context) {
        super(context, null);
        this.f4505b = new ArrayList<>();
        f(context, null);
    }

    @Deprecated
    public void a(@d.o0 TabHost.TabSpec tabSpec, @d.o0 Class<?> cls, @d.q0 Bundle bundle) {
        tabSpec.setContent(new a(this.f4507d));
        String tag = tabSpec.getTag();
        c cVar = new c(tag, cls, bundle);
        if (this.f4512i) {
            Fragment s02 = this.f4508e.s0(tag);
            cVar.f4518d = s02;
            if (s02 != null && !s02.isDetached()) {
                u0 u6 = this.f4508e.u();
                u6.v(cVar.f4518d);
                u6.q();
            }
        }
        this.f4505b.add(cVar);
        addTab(tabSpec);
    }

    @d.q0
    public final u0 b(@d.q0 String str, @d.q0 u0 u0Var) {
        Fragment fragment;
        c e7 = e(str);
        if (this.f4511h != e7) {
            if (u0Var == null) {
                u0Var = this.f4508e.u();
            }
            c cVar = this.f4511h;
            if (cVar != null && (fragment = cVar.f4518d) != null) {
                u0Var.v(fragment);
            }
            if (e7 != null) {
                Fragment fragment2 = e7.f4518d;
                if (fragment2 == null) {
                    Fragment a7 = this.f4508e.H0().a(this.f4507d.getClassLoader(), e7.f4516b.getName());
                    e7.f4518d = a7;
                    a7.setArguments(e7.f4517c);
                    u0Var.g(this.f4509f, e7.f4518d, e7.f4515a);
                } else {
                    u0Var.p(fragment2);
                }
            }
            this.f4511h = e7;
        }
        return u0Var;
    }

    public final void c() {
        if (this.f4506c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f4509f);
            this.f4506c = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f4509f);
        }
    }

    public final void d(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f4506c = frameLayout2;
            frameLayout2.setId(this.f4509f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @d.q0
    public final c e(String str) {
        int size = this.f4505b.size();
        for (int i7 = 0; i7 < size; i7++) {
            c cVar = this.f4505b.get(i7);
            if (cVar.f4515a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f4509f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void g(@d.o0 Context context, @d.o0 FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.f4507d = context;
        this.f4508e = fragmentManager;
        c();
    }

    @Deprecated
    public void h(@d.o0 Context context, @d.o0 FragmentManager fragmentManager, int i7) {
        d(context);
        super.setup();
        this.f4507d = context;
        this.f4508e = fragmentManager;
        this.f4509f = i7;
        c();
        this.f4506c.setId(i7);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f4505b.size();
        u0 u0Var = null;
        for (int i7 = 0; i7 < size; i7++) {
            c cVar = this.f4505b.get(i7);
            Fragment s02 = this.f4508e.s0(cVar.f4515a);
            cVar.f4518d = s02;
            if (s02 != null && !s02.isDetached()) {
                if (cVar.f4515a.equals(currentTabTag)) {
                    this.f4511h = cVar;
                } else {
                    if (u0Var == null) {
                        u0Var = this.f4508e.u();
                    }
                    u0Var.v(cVar.f4518d);
                }
            }
        }
        this.f4512i = true;
        u0 b7 = b(currentTabTag, u0Var);
        if (b7 != null) {
            b7.q();
            this.f4508e.n0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4512i = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.f4514k);
    }

    @Override // android.view.View
    @d.o0
    @Deprecated
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4514k = getCurrentTabTag();
        return bVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@d.q0 String str) {
        u0 b7;
        if (this.f4512i && (b7 = b(str, null)) != null) {
            b7.q();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f4510g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@d.q0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f4510g = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public t0(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4505b = new ArrayList<>();
        f(context, attributeSet);
    }
}
