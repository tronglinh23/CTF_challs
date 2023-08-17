package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.h;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u0;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import d.i;
import d.o0;
import d.q0;
import g1.s;
import java.util.Iterator;
import r3.h;
/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.g<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {

    /* renamed from: i  reason: collision with root package name */
    public static final String f6997i = "f#";

    /* renamed from: j  reason: collision with root package name */
    public static final String f6998j = "s#";

    /* renamed from: k  reason: collision with root package name */
    public static final long f6999k = 10000;

    /* renamed from: a  reason: collision with root package name */
    public final p f7000a;

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f7001b;

    /* renamed from: c  reason: collision with root package name */
    public final h<Fragment> f7002c;

    /* renamed from: d  reason: collision with root package name */
    public final h<Fragment.n> f7003d;

    /* renamed from: e  reason: collision with root package name */
    public final h<Integer> f7004e;

    /* renamed from: f  reason: collision with root package name */
    public FragmentMaxLifecycleEnforcer f7005f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7006g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7007h;

    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a  reason: collision with root package name */
        public h.j f7013a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i f7014b;

        /* renamed from: c  reason: collision with root package name */
        public v f7015c;

        /* renamed from: d  reason: collision with root package name */
        public r3.h f7016d;

        /* renamed from: e  reason: collision with root package name */
        public long f7017e = -1;

        /* loaded from: classes.dex */
        public class a extends h.j {
            public a() {
            }

            @Override // r3.h.j
            public void onPageScrollStateChanged(int i7) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // r3.h.j
            public void onPageSelected(int i7) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* loaded from: classes.dex */
        public class b extends d {
            public b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @o0
        public final r3.h a(@o0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof r3.h) {
                return (r3.h) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void b(@o0 RecyclerView recyclerView) {
            this.f7016d = a(recyclerView);
            a aVar = new a();
            this.f7013a = aVar;
            this.f7016d.n(aVar);
            b bVar = new b();
            this.f7014b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            v vVar = new v() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.v
                public void d(@o0 z zVar, @o0 p.a aVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f7015c = vVar;
            FragmentStateAdapter.this.f7000a.a(vVar);
        }

        public void c(@o0 RecyclerView recyclerView) {
            a(recyclerView).x(this.f7013a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f7014b);
            FragmentStateAdapter.this.f7000a.d(this.f7015c);
            this.f7016d = null;
        }

        public void d(boolean z6) {
            int currentItem;
            Fragment o6;
            if (FragmentStateAdapter.this.v() || this.f7016d.getScrollState() != 0 || FragmentStateAdapter.this.f7002c.s() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f7016d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f7017e || z6) && (o6 = FragmentStateAdapter.this.f7002c.o(itemId)) != null && o6.isAdded()) {
                this.f7017e = itemId;
                u0 u6 = FragmentStateAdapter.this.f7001b.u();
                Fragment fragment = null;
                for (int i7 = 0; i7 < FragmentStateAdapter.this.f7002c.D(); i7++) {
                    long t6 = FragmentStateAdapter.this.f7002c.t(i7);
                    Fragment E = FragmentStateAdapter.this.f7002c.E(i7);
                    if (E.isAdded()) {
                        if (t6 != this.f7017e) {
                            u6.O(E, p.b.STARTED);
                        } else {
                            fragment = E;
                        }
                        E.setMenuVisibility(t6 == this.f7017e);
                    }
                }
                if (fragment != null) {
                    u6.O(fragment, p.b.RESUMED);
                }
                if (u6.A()) {
                    return;
                }
                u6.s();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f7022a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.viewpager2.adapter.a f7023b;

        public a(FrameLayout frameLayout, androidx.viewpager2.adapter.a aVar) {
            this.f7022a = frameLayout;
            this.f7023b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            if (this.f7022a.getParent() != null) {
                this.f7022a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.r(this.f7023b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends FragmentManager.m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f7025a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f7026b;

        public b(Fragment fragment, FrameLayout frameLayout) {
            this.f7025a = fragment;
            this.f7026b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void m(@o0 FragmentManager fragmentManager, @o0 Fragment fragment, @o0 View view, @q0 Bundle bundle) {
            if (fragment == this.f7025a) {
                fragmentManager.g2(this);
                FragmentStateAdapter.this.c(view, this.f7026b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f7006g = false;
            fragmentStateAdapter.h();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends RecyclerView.i {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i7, int i8) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i7, int i8) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i7, int i8, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i7, int i8) {
            onChanged();
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i7, int i8, @q0 Object obj) {
            onChanged();
        }
    }

    public FragmentStateAdapter(@o0 FragmentActivity fragmentActivity) {
        this(fragmentActivity.K(), fragmentActivity.getLifecycle());
    }

    @o0
    public static String f(@o0 String str, long j7) {
        return str + j7;
    }

    public static boolean j(@o0 String str, @o0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    public static long q(@o0 String str, @o0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @Override // androidx.viewpager2.adapter.b
    @o0
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f7002c.D() + this.f7003d.D());
        for (int i7 = 0; i7 < this.f7002c.D(); i7++) {
            long t6 = this.f7002c.t(i7);
            Fragment o6 = this.f7002c.o(t6);
            if (o6 != null && o6.isAdded()) {
                this.f7001b.B1(bundle, f(f6997i, t6), o6);
            }
        }
        for (int i8 = 0; i8 < this.f7003d.D(); i8++) {
            long t7 = this.f7003d.t(i8);
            if (d(t7)) {
                bundle.putParcelable(f(f6998j, t7), this.f7003d.o(t7));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.b
    public final void b(@o0 Parcelable parcelable) {
        if (!this.f7003d.s() || !this.f7002c.s()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (j(str, f6997i)) {
                this.f7002c.u(q(str, f6997i), this.f7001b.F0(bundle, str));
            } else if (!j(str, f6998j)) {
                throw new IllegalArgumentException("Unexpected key in savedState: " + str);
            } else {
                long q6 = q(str, f6998j);
                Fragment.n nVar = (Fragment.n) bundle.getParcelable(str);
                if (d(q6)) {
                    this.f7003d.u(q6, nVar);
                }
            }
        }
        if (this.f7002c.s()) {
            return;
        }
        this.f7007h = true;
        this.f7006g = true;
        h();
        t();
    }

    public void c(@o0 View view, @o0 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean d(long j7) {
        return j7 >= 0 && j7 < ((long) getItemCount());
    }

    @o0
    public abstract Fragment e(int i7);

    public final void g(int i7) {
        long itemId = getItemId(i7);
        if (this.f7002c.k(itemId)) {
            return;
        }
        Fragment e7 = e(i7);
        e7.setInitialSavedState(this.f7003d.o(itemId));
        this.f7002c.u(itemId, e7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i7) {
        return i7;
    }

    public void h() {
        if (!this.f7007h || v()) {
            return;
        }
        androidx.collection.c cVar = new androidx.collection.c();
        for (int i7 = 0; i7 < this.f7002c.D(); i7++) {
            long t6 = this.f7002c.t(i7);
            if (!d(t6)) {
                cVar.add(Long.valueOf(t6));
                this.f7004e.x(t6);
            }
        }
        if (!this.f7006g) {
            this.f7007h = false;
            for (int i8 = 0; i8 < this.f7002c.D(); i8++) {
                long t7 = this.f7002c.t(i8);
                if (!i(t7)) {
                    cVar.add(Long.valueOf(t7));
                }
            }
        }
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            s(((Long) it.next()).longValue());
        }
    }

    public final boolean i(long j7) {
        View view;
        if (this.f7004e.k(j7)) {
            return true;
        }
        Fragment o6 = this.f7002c.o(j7);
        return (o6 == null || (view = o6.getView()) == null || view.getParent() == null) ? false : true;
    }

    public final Long k(int i7) {
        Long l7 = null;
        for (int i8 = 0; i8 < this.f7004e.D(); i8++) {
            if (this.f7004e.E(i8).intValue() == i7) {
                if (l7 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l7 = Long.valueOf(this.f7004e.t(i8));
            }
        }
        return l7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@o0 androidx.viewpager2.adapter.a aVar, int i7) {
        long itemId = aVar.getItemId();
        int id = aVar.c().getId();
        Long k7 = k(id);
        if (k7 != null && k7.longValue() != itemId) {
            s(k7.longValue());
            this.f7004e.x(k7.longValue());
        }
        this.f7004e.u(itemId, Integer.valueOf(id));
        g(i7);
        FrameLayout c7 = aVar.c();
        if (u1.O0(c7)) {
            if (c7.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            c7.addOnLayoutChangeListener(new a(c7, aVar));
        }
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @o0
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public final androidx.viewpager2.adapter.a onCreateViewHolder(@o0 ViewGroup viewGroup, int i7) {
        return androidx.viewpager2.adapter.a.b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(@o0 androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@o0 androidx.viewpager2.adapter.a aVar) {
        r(aVar);
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @i
    public void onAttachedToRecyclerView(@o0 RecyclerView recyclerView) {
        s.a(this.f7005f == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f7005f = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @i
    public void onDetachedFromRecyclerView(@o0 RecyclerView recyclerView) {
        this.f7005f.c(recyclerView);
        this.f7005f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: p  reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@o0 androidx.viewpager2.adapter.a aVar) {
        Long k7 = k(aVar.c().getId());
        if (k7 != null) {
            s(k7.longValue());
            this.f7004e.x(k7.longValue());
        }
    }

    public void r(@o0 final androidx.viewpager2.adapter.a aVar) {
        Fragment o6 = this.f7002c.o(aVar.getItemId());
        if (o6 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout c7 = aVar.c();
        View view = o6.getView();
        if (!o6.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (o6.isAdded() && view == null) {
            u(o6, c7);
        } else if (o6.isAdded() && view.getParent() != null) {
            if (view.getParent() != c7) {
                c(view, c7);
            }
        } else if (o6.isAdded()) {
            c(view, c7);
        } else if (v()) {
            if (this.f7001b.W0()) {
                return;
            }
            this.f7000a.a(new v() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.v
                public void d(@o0 z zVar, @o0 p.a aVar2) {
                    if (FragmentStateAdapter.this.v()) {
                        return;
                    }
                    zVar.getLifecycle().d(this);
                    if (u1.O0(aVar.c())) {
                        FragmentStateAdapter.this.r(aVar);
                    }
                }
            });
        } else {
            u(o6, c7);
            this.f7001b.u().k(o6, "f" + aVar.getItemId()).O(o6, p.b.STARTED).s();
            this.f7005f.d(false);
        }
    }

    public final void s(long j7) {
        ViewParent parent;
        Fragment o6 = this.f7002c.o(j7);
        if (o6 == null) {
            return;
        }
        if (o6.getView() != null && (parent = o6.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!d(j7)) {
            this.f7003d.x(j7);
        }
        if (!o6.isAdded()) {
            this.f7002c.x(j7);
        } else if (v()) {
            this.f7007h = true;
        } else {
            if (o6.isAdded() && d(j7)) {
                this.f7003d.u(j7, this.f7001b.U1(o6));
            }
            this.f7001b.u().B(o6).s();
            this.f7002c.x(j7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void setHasStableIds(boolean z6) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public final void t() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f7000a.a(new v() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.v
            public void d(@o0 z zVar, @o0 p.a aVar) {
                if (aVar == p.a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    zVar.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000L);
    }

    public final void u(Fragment fragment, @o0 FrameLayout frameLayout) {
        this.f7001b.C1(new b(fragment, frameLayout), false);
    }

    public boolean v() {
        return this.f7001b.e1();
    }

    public FragmentStateAdapter(@o0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@o0 FragmentManager fragmentManager, @o0 p pVar) {
        this.f7002c = new androidx.collection.h<>();
        this.f7003d = new androidx.collection.h<>();
        this.f7004e = new androidx.collection.h<>();
        this.f7006g = false;
        this.f7007h = false;
        this.f7001b = fragmentManager;
        this.f7000a = pVar;
        super.setHasStableIds(true);
    }
}
