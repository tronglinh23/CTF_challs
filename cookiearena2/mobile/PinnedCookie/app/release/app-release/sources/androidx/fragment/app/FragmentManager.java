package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u0;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import c.b;
import d.b1;
import i0.n3;
import i0.t2;
import i0.v2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import x1.a;
import y1.d;
/* loaded from: classes.dex */
public abstract class FragmentManager implements o0 {
    public static final String S = "android:support:fragments";
    public static final String T = "state";
    public static final String U = "result_";
    public static final String V = "fragment_";
    public static boolean W = false;
    @d.b1({b1.a.LIBRARY})
    public static final String X = "FragmentManager";
    public static final int Y = 1;
    public static final String Z = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public androidx.activity.result.i<Intent> D;
    public androidx.activity.result.i<androidx.activity.result.l> E;
    public androidx.activity.result.i<String[]> F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList<androidx.fragment.app.a> M;
    public ArrayList<Boolean> N;
    public ArrayList<Fragment> O;
    public k0 P;
    public d.c Q;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4219b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f4221d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f4222e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f4224g;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<p> f4230m;

    /* renamed from: v  reason: collision with root package name */
    public w<?> f4239v;

    /* renamed from: w  reason: collision with root package name */
    public androidx.fragment.app.t f4240w;

    /* renamed from: x  reason: collision with root package name */
    public Fragment f4241x;
    @d.q0

    /* renamed from: y  reason: collision with root package name */
    public Fragment f4242y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<q> f4218a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final s0 f4220c = new s0();

    /* renamed from: f  reason: collision with root package name */
    public final z f4223f = new z(this);

    /* renamed from: h  reason: collision with root package name */
    public final androidx.activity.k f4225h = new b(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f4226i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, androidx.fragment.app.c> f4227j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f4228k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, o> f4229l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    public final a0 f4231n = new a0(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<l0> f4232o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final g1.e<Configuration> f4233p = new g1.e() { // from class: androidx.fragment.app.b0
        @Override // g1.e
        public final void accept(Object obj) {
            FragmentManager.this.g1((Configuration) obj);
        }
    };

    /* renamed from: q  reason: collision with root package name */
    public final g1.e<Integer> f4234q = new g1.e() { // from class: androidx.fragment.app.c0
        @Override // g1.e
        public final void accept(Object obj) {
            FragmentManager.this.h1((Integer) obj);
        }
    };

    /* renamed from: r  reason: collision with root package name */
    public final g1.e<i0.w> f4235r = new g1.e() { // from class: androidx.fragment.app.d0
        @Override // g1.e
        public final void accept(Object obj) {
            FragmentManager.this.i1((i0.w) obj);
        }
    };

    /* renamed from: s  reason: collision with root package name */
    public final g1.e<n3> f4236s = new g1.e() { // from class: androidx.fragment.app.e0
        @Override // g1.e
        public final void accept(Object obj) {
            FragmentManager.this.j1((n3) obj);
        }
    };

    /* renamed from: t  reason: collision with root package name */
    public final androidx.core.view.a1 f4237t = new c();

    /* renamed from: u  reason: collision with root package name */
    public int f4238u = -1;

    /* renamed from: z  reason: collision with root package name */
    public v f4243z = null;
    public v A = new d();
    public h1 B = null;
    public h1 C = new e();
    public ArrayDeque<n> G = new ArrayDeque<>();
    public Runnable R = new f();

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            n pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f4260k;
            int i8 = pollFirst.f4261l;
            Fragment i9 = FragmentManager.this.f4220c.i(str);
            if (i9 != null) {
                i9.onRequestPermissionsResult(i8, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.k {
        public b(boolean z6) {
            super(z6);
        }

        @Override // androidx.activity.k
        public void e() {
            FragmentManager.this.T0();
        }
    }

    /* loaded from: classes.dex */
    public class c implements androidx.core.view.a1 {
        public c() {
        }

        @Override // androidx.core.view.a1
        public boolean a(@d.o0 MenuItem menuItem) {
            return FragmentManager.this.R(menuItem);
        }

        @Override // androidx.core.view.a1
        public void b(@d.o0 Menu menu) {
            FragmentManager.this.S(menu);
        }

        @Override // androidx.core.view.a1
        public void c(@d.o0 Menu menu, @d.o0 MenuInflater menuInflater) {
            FragmentManager.this.K(menu, menuInflater);
        }

        @Override // androidx.core.view.a1
        public void d(@d.o0 Menu menu) {
            FragmentManager.this.W(menu);
        }
    }

    /* loaded from: classes.dex */
    public class d extends v {
        public d() {
        }

        @Override // androidx.fragment.app.v
        @d.o0
        public Fragment a(@d.o0 ClassLoader classLoader, @d.o0 String str) {
            return FragmentManager.this.K0().c(FragmentManager.this.K0().k(), str, null);
        }
    }

    /* loaded from: classes.dex */
    public class e implements h1 {
        public e() {
        }

        @Override // androidx.fragment.app.h1
        @d.o0
        public f1 a(@d.o0 ViewGroup viewGroup) {
            return new androidx.fragment.app.k(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.j0(true);
        }
    }

    /* loaded from: classes.dex */
    public class g implements l0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Fragment f4254b;

        public g(Fragment fragment) {
            this.f4254b = fragment;
        }

        @Override // androidx.fragment.app.l0
        public void a(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
            this.f4254b.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<androidx.activity.result.a> {
        public h() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            n pollLast = FragmentManager.this.G.pollLast();
            if (pollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollLast.f4260k;
            int i7 = pollLast.f4261l;
            Fragment i8 = FragmentManager.this.f4220c.i(str);
            if (i8 != null) {
                i8.onActivityResult(i7, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            n pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4260k;
            int i7 = pollFirst.f4261l;
            Fragment i8 = FragmentManager.this.f4220c.i(str);
            if (i8 != null) {
                i8.onActivityResult(i7, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        @d.q0
        @Deprecated
        CharSequence a();

        @d.f1
        @Deprecated
        int c();

        @d.f1
        @Deprecated
        int d();

        @d.q0
        @Deprecated
        CharSequence e();

        int getId();

        @d.q0
        String getName();
    }

    /* loaded from: classes.dex */
    public class k implements q {

        /* renamed from: a  reason: collision with root package name */
        public final String f4258a;

        public k(@d.o0 String str) {
            this.f4258a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean b(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.z(arrayList, arrayList2, this.f4258a);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends c.a<androidx.activity.result.l, androidx.activity.result.a> {
        @Override // c.a
        @d.o0
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@d.o0 Context context, androidx.activity.result.l lVar) {
            Bundle bundleExtra;
            Intent intent = new Intent(b.n.f7292b);
            Intent a7 = lVar.a();
            if (a7 != null && (bundleExtra = a7.getBundleExtra(b.m.f7290b)) != null) {
                intent.putExtra(b.m.f7290b, bundleExtra);
                a7.removeExtra(b.m.f7290b);
                if (a7.getBooleanExtra(FragmentManager.Z, false)) {
                    lVar = new l.b(lVar.d()).b(null).c(lVar.c(), lVar.b()).a();
                }
            }
            intent.putExtra(b.n.f7293c, lVar);
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        @Override // c.a
        @d.o0
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i7, @d.q0 Intent intent) {
            return new androidx.activity.result.a(i7, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        @Deprecated
        public void a(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment, @d.q0 Bundle bundle) {
        }

        public void b(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment, @d.o0 Context context) {
        }

        public void c(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment, @d.q0 Bundle bundle) {
        }

        public void d(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
        }

        public void e(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
        }

        public void f(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
        }

        public void g(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment, @d.o0 Context context) {
        }

        public void h(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment, @d.q0 Bundle bundle) {
        }

        public void i(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
        }

        public void j(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment, @d.o0 Bundle bundle) {
        }

        public void k(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
        }

        public void l(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
        }

        public void m(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment, @d.o0 View view, @d.q0 Bundle bundle) {
        }

        public void n(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public static class o implements n0 {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.p f4262a;

        /* renamed from: b  reason: collision with root package name */
        public final n0 f4263b;

        /* renamed from: c  reason: collision with root package name */
        public final androidx.lifecycle.v f4264c;

        public o(@d.o0 androidx.lifecycle.p pVar, @d.o0 n0 n0Var, @d.o0 androidx.lifecycle.v vVar) {
            this.f4262a = pVar;
            this.f4263b = n0Var;
            this.f4264c = vVar;
        }

        @Override // androidx.fragment.app.n0
        public void a(@d.o0 String str, @d.o0 Bundle bundle) {
            this.f4263b.a(str, bundle);
        }

        public boolean b(p.b bVar) {
            return this.f4262a.b().d(bVar);
        }

        public void c() {
            this.f4262a.d(this.f4264c);
        }
    }

    /* loaded from: classes.dex */
    public interface p {
        @d.l0
        default void a(@d.o0 Fragment fragment, boolean z6) {
        }

        @d.l0
        void b();

        @d.l0
        default void c(@d.o0 Fragment fragment, boolean z6) {
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        boolean b(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class r implements q {

        /* renamed from: a  reason: collision with root package name */
        public final String f4265a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4266b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4267c;

        public r(@d.q0 String str, int i7, int i8) {
            this.f4265a = str;
            this.f4266b = i7;
            this.f4267c = i8;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean b(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f4242y;
            if (fragment == null || this.f4266b >= 0 || this.f4265a != null || !fragment.getChildFragmentManager().w1()) {
                return FragmentManager.this.A1(arrayList, arrayList2, this.f4265a, this.f4266b, this.f4267c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class s implements q {

        /* renamed from: a  reason: collision with root package name */
        public final String f4269a;

        public s(@d.o0 String str) {
            this.f4269a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean b(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.L1(arrayList, arrayList2, this.f4269a);
        }
    }

    /* loaded from: classes.dex */
    public class t implements q {

        /* renamed from: a  reason: collision with root package name */
        public final String f4271a;

        public t(@d.o0 String str) {
            this.f4271a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean b(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.T1(arrayList, arrayList2, this.f4271a);
        }
    }

    public static int P1(int i7) {
        int i8 = u0.I;
        if (i7 != 4097) {
            if (i7 != 8194) {
                i8 = u0.M;
                if (i7 == 8197) {
                    return u0.L;
                }
                if (i7 == 4099) {
                    return u0.K;
                }
                if (i7 != 4100) {
                    return 0;
                }
            }
            return i8;
        }
        return 8194;
    }

    @d.q0
    public static Fragment R0(@d.o0 View view) {
        Object tag = view.getTag(a.c.f18264a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    @d.b1({b1.a.LIBRARY})
    public static boolean X0(int i7) {
        return W || Log.isLoggable("FragmentManager", i7);
    }

    @Deprecated
    public static void f0(boolean z6) {
        W = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(Configuration configuration) {
        if (Z0()) {
            H(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(Integer num) {
        if (Z0() && num.intValue() == 80) {
            N(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(i0.w wVar) {
        if (Z0()) {
            O(wVar.b(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1(n3 n3Var) {
        if (Z0()) {
            V(n3Var.b(), false);
        }
    }

    public static void l0(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2, int i7, int i8) {
        while (i7 < i8) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            if (arrayList2.get(i7).booleanValue()) {
                aVar.U(-1);
                aVar.a0();
            } else {
                aVar.U(1);
                aVar.Z();
            }
            i7++;
        }
    }

    @d.o0
    public static <F extends Fragment> F q0(@d.o0 View view) {
        F f7 = (F) v0(view);
        if (f7 != null) {
            return f7;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @d.o0
    public static FragmentManager u0(@d.o0 View view) {
        FragmentActivity fragmentActivity;
        Fragment v02 = v0(view);
        if (v02 != null) {
            if (v02.isAdded()) {
                return v02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + v02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            } else if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.K();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @d.q0
    public static Fragment v0(@d.o0 View view) {
        while (view != null) {
            Fragment R0 = R0(view);
            if (R0 != null) {
                return R0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public final void A() {
        w<?> wVar = this.f4239v;
        if (wVar instanceof androidx.lifecycle.f1 ? this.f4220c.q().r() : wVar.k() instanceof Activity ? !((Activity) this.f4239v.k()).isChangingConfigurations() : true) {
            Iterator<androidx.fragment.app.c> it = this.f4227j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f4332k.iterator();
                while (it2.hasNext()) {
                    this.f4220c.q().j(it2.next());
                }
            }
        }
    }

    @d.o0
    public List<Fragment> A0() {
        return this.f4220c.m();
    }

    public boolean A1(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2, @d.q0 String str, int i7, int i8) {
        int p02 = p0(str, i7, (i8 & 1) != 0);
        if (p02 < 0) {
            return false;
        }
        for (int size = this.f4221d.size() - 1; size >= p02; size--) {
            arrayList.add(this.f4221d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final Set<f1> B() {
        HashSet hashSet = new HashSet();
        Iterator<q0> it = this.f4220c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(f1.s(viewGroup, P0()));
            }
        }
        return hashSet;
    }

    @d.o0
    public j B0(int i7) {
        return this.f4221d.get(i7);
    }

    public void B1(@d.o0 Bundle bundle, @d.o0 String str, @d.o0 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            f2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public final Set<f1> C(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator<u0.a> it = arrayList.get(i7).f4529c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4547b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(f1.r(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    public int C0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4221d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void C1(@d.o0 m mVar, boolean z6) {
        this.f4231n.o(mVar, z6);
    }

    @d.o0
    public q0 D(@d.o0 Fragment fragment) {
        q0 o6 = this.f4220c.o(fragment.mWho);
        if (o6 != null) {
            return o6;
        }
        q0 q0Var = new q0(this.f4231n, this.f4220c, fragment);
        q0Var.o(this.f4239v.k().getClassLoader());
        q0Var.t(this.f4238u);
        return q0Var;
    }

    @d.o0
    public final k0 D0(@d.o0 Fragment fragment) {
        return this.P.m(fragment);
    }

    public void D1(@d.o0 Fragment fragment) {
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean z6 = !fragment.isInBackStack();
        if (!fragment.mDetached || z6) {
            this.f4220c.v(fragment);
            if (Y0(fragment)) {
                this.H = true;
            }
            fragment.mRemoving = true;
            c2(fragment);
        }
    }

    public void E(@d.o0 Fragment fragment) {
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (X0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(fragment);
            }
            this.f4220c.v(fragment);
            if (Y0(fragment)) {
                this.H = true;
            }
            c2(fragment);
        }
    }

    @d.o0
    public androidx.fragment.app.t E0() {
        return this.f4240w;
    }

    public void E1(@d.o0 l0 l0Var) {
        this.f4232o.remove(l0Var);
    }

    public void F() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        a0(4);
    }

    @d.q0
    public Fragment F0(@d.o0 Bundle bundle, @d.o0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment o02 = o0(string);
        if (o02 == null) {
            f2(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return o02;
    }

    public void F1(@d.o0 p pVar) {
        ArrayList<p> arrayList = this.f4230m;
        if (arrayList != null) {
            arrayList.remove(pVar);
        }
    }

    public void G() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        a0(0);
    }

    public final ViewGroup G0(@d.o0 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4240w.g()) {
            View e7 = this.f4240w.e(fragment.mContainerId);
            if (e7 instanceof ViewGroup) {
                return (ViewGroup) e7;
            }
        }
        return null;
    }

    public final void G1(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!arrayList.get(i7).f4544r) {
                if (i8 != i7) {
                    m0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (arrayList2.get(i7).booleanValue()) {
                    while (i8 < size && arrayList2.get(i8).booleanValue() && !arrayList.get(i8).f4544r) {
                        i8++;
                    }
                }
                m0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            m0(arrayList, arrayList2, i8, size);
        }
    }

    public void H(@d.o0 Configuration configuration, boolean z6) {
        if (z6 && (this.f4239v instanceof k0.q0)) {
            f2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z6) {
                    fragment.mChildFragmentManager.H(configuration, true);
                }
            }
        }
    }

    @d.o0
    public v H0() {
        v vVar = this.f4243z;
        if (vVar != null) {
            return vVar;
        }
        Fragment fragment = this.f4241x;
        return fragment != null ? fragment.mFragmentManager.H0() : this.A;
    }

    public void H1(@d.o0 Fragment fragment) {
        this.P.s(fragment);
    }

    public boolean I(@d.o0 MenuItem menuItem) {
        if (this.f4238u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @d.o0
    public s0 I0() {
        return this.f4220c;
    }

    public final void I1() {
        if (this.f4230m != null) {
            for (int i7 = 0; i7 < this.f4230m.size(); i7++) {
                this.f4230m.get(i7).b();
            }
        }
    }

    public void J() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        a0(1);
    }

    @d.o0
    public List<Fragment> J0() {
        return this.f4220c.p();
    }

    public void J1(@d.q0 Parcelable parcelable, @d.q0 i0 i0Var) {
        if (this.f4239v instanceof androidx.lifecycle.f1) {
            f2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.P.t(i0Var);
        N1(parcelable);
    }

    public boolean K(@d.o0 Menu menu, @d.o0 MenuInflater menuInflater) {
        if (this.f4238u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z6 = false;
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null && b1(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z6 = true;
            }
        }
        if (this.f4222e != null) {
            for (int i7 = 0; i7 < this.f4222e.size(); i7++) {
                Fragment fragment2 = this.f4222e.get(i7);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4222e = arrayList;
        return z6;
    }

    @d.b1({b1.a.LIBRARY})
    @d.o0
    public w<?> K0() {
        return this.f4239v;
    }

    public void K1(@d.o0 String str) {
        h0(new s(str), false);
    }

    public void L() {
        this.K = true;
        j0(true);
        g0();
        A();
        a0(-1);
        w<?> wVar = this.f4239v;
        if (wVar instanceof k0.r0) {
            ((k0.r0) wVar).r(this.f4234q);
        }
        w<?> wVar2 = this.f4239v;
        if (wVar2 instanceof k0.q0) {
            ((k0.q0) wVar2).d(this.f4233p);
        }
        w<?> wVar3 = this.f4239v;
        if (wVar3 instanceof t2) {
            ((t2) wVar3).p(this.f4235r);
        }
        w<?> wVar4 = this.f4239v;
        if (wVar4 instanceof v2) {
            ((v2) wVar4).f(this.f4236s);
        }
        w<?> wVar5 = this.f4239v;
        if ((wVar5 instanceof androidx.core.view.u0) && this.f4241x == null) {
            ((androidx.core.view.u0) wVar5).removeMenuProvider(this.f4237t);
        }
        this.f4239v = null;
        this.f4240w = null;
        this.f4241x = null;
        if (this.f4224g != null) {
            this.f4225h.g();
            this.f4224g = null;
        }
        androidx.activity.result.i<Intent> iVar = this.D;
        if (iVar != null) {
            iVar.d();
            this.E.d();
            this.F.d();
        }
    }

    @d.o0
    public LayoutInflater.Factory2 L0() {
        return this.f4223f;
    }

    public boolean L1(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2, @d.o0 String str) {
        androidx.fragment.app.c remove = this.f4227j.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<androidx.fragment.app.a> it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.a next = it.next();
            if (next.Q) {
                Iterator<u0.a> it2 = next.f4529c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f4547b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<androidx.fragment.app.a> it3 = remove.a(this, hashMap).iterator();
        while (true) {
            boolean z6 = false;
            while (it3.hasNext()) {
                if (it3.next().b(arrayList, arrayList2) || z6) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    public void M() {
        a0(1);
    }

    @d.o0
    public a0 M0() {
        return this.f4231n;
    }

    public void M1(@d.q0 Parcelable parcelable) {
        if (this.f4239v instanceof e3.d) {
            f2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        N1(parcelable);
    }

    public void N(boolean z6) {
        if (z6 && (this.f4239v instanceof k0.r0)) {
            f2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z6) {
                    fragment.mChildFragmentManager.N(true);
                }
            }
        }
    }

    @d.q0
    public Fragment N0() {
        return this.f4241x;
    }

    public void N1(@d.q0 Parcelable parcelable) {
        q0 q0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(U) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4239v.k().getClassLoader());
                this.f4228k.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> hashMap = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(V) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4239v.k().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f4220c.y(hashMap);
        j0 j0Var = (j0) bundle3.getParcelable("state");
        if (j0Var == null) {
            return;
        }
        this.f4220c.w();
        Iterator<String> it = j0Var.f4394k.iterator();
        while (it.hasNext()) {
            Bundle C = this.f4220c.C(it.next(), null);
            if (C != null) {
                Fragment l7 = this.P.l(((p0) C.getParcelable("state")).f4451l);
                if (l7 != null) {
                    if (X0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(l7);
                    }
                    q0Var = new q0(this.f4231n, this.f4220c, l7, C);
                } else {
                    q0Var = new q0(this.f4231n, this.f4220c, this.f4239v.k().getClassLoader(), H0(), C);
                }
                Fragment k7 = q0Var.k();
                k7.mSavedFragmentState = C;
                k7.mFragmentManager = this;
                if (X0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(k7.mWho);
                    sb2.append("): ");
                    sb2.append(k7);
                }
                q0Var.o(this.f4239v.k().getClassLoader());
                this.f4220c.s(q0Var);
                q0Var.t(this.f4238u);
            }
        }
        for (Fragment fragment : this.P.o()) {
            if (!this.f4220c.c(fragment.mWho)) {
                if (X0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(j0Var.f4394k);
                }
                this.P.s(fragment);
                fragment.mFragmentManager = this;
                q0 q0Var2 = new q0(this.f4231n, this.f4220c, fragment);
                q0Var2.t(1);
                q0Var2.m();
                fragment.mRemoving = true;
                q0Var2.m();
            }
        }
        this.f4220c.x(j0Var.f4395l);
        if (j0Var.f4396m != null) {
            this.f4221d = new ArrayList<>(j0Var.f4396m.length);
            int i7 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = j0Var.f4396m;
                if (i7 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a b7 = bVarArr[i7].b(this);
                if (X0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i7);
                    sb4.append(" (index ");
                    sb4.append(b7.P);
                    sb4.append("): ");
                    sb4.append(b7);
                    PrintWriter printWriter = new PrintWriter(new c1("FragmentManager"));
                    b7.Y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4221d.add(b7);
                i7++;
            }
        } else {
            this.f4221d = null;
        }
        this.f4226i.set(j0Var.f4397n);
        String str3 = j0Var.f4398o;
        if (str3 != null) {
            Fragment o02 = o0(str3);
            this.f4242y = o02;
            T(o02);
        }
        ArrayList<String> arrayList = j0Var.f4399p;
        if (arrayList != null) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                this.f4227j.put(arrayList.get(i8), j0Var.f4400q.get(i8));
            }
        }
        this.G = new ArrayDeque<>(j0Var.f4401r);
    }

    public void O(boolean z6, boolean z7) {
        if (z7 && (this.f4239v instanceof t2)) {
            f2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z6);
                if (z7) {
                    fragment.mChildFragmentManager.O(z6, true);
                }
            }
        }
    }

    @d.q0
    public Fragment O0() {
        return this.f4242y;
    }

    @Deprecated
    public i0 O1() {
        if (this.f4239v instanceof androidx.lifecycle.f1) {
            f2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.P.p();
    }

    public void P(@d.o0 Fragment fragment) {
        Iterator<l0> it = this.f4232o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    @d.o0
    public h1 P0() {
        h1 h1Var = this.B;
        if (h1Var != null) {
            return h1Var;
        }
        Fragment fragment = this.f4241x;
        return fragment != null ? fragment.mFragmentManager.P0() : this.C;
    }

    public void Q() {
        for (Fragment fragment : this.f4220c.m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.Q();
            }
        }
    }

    @d.q0
    public d.c Q0() {
        return this.Q;
    }

    public Parcelable Q1() {
        if (this.f4239v instanceof e3.d) {
            f2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle f12 = f1();
        if (f12.isEmpty()) {
            return null;
        }
        return f12;
    }

    public boolean R(@d.o0 MenuItem menuItem) {
        if (this.f4238u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @d.o0
    /* renamed from: R1  reason: merged with bridge method [inline-methods] */
    public Bundle f1() {
        androidx.fragment.app.b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        w0();
        g0();
        j0(true);
        this.I = true;
        this.P.u(true);
        ArrayList<String> z6 = this.f4220c.z();
        HashMap<String, Bundle> n7 = this.f4220c.n();
        if (n7.isEmpty()) {
            X0(2);
        } else {
            ArrayList<String> A = this.f4220c.A();
            ArrayList<androidx.fragment.app.a> arrayList = this.f4221d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i7 = 0; i7 < size; i7++) {
                    bVarArr[i7] = new androidx.fragment.app.b(this.f4221d.get(i7));
                    if (X0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i7);
                        sb.append(": ");
                        sb.append(this.f4221d.get(i7));
                    }
                }
            }
            j0 j0Var = new j0();
            j0Var.f4394k = z6;
            j0Var.f4395l = A;
            j0Var.f4396m = bVarArr;
            j0Var.f4397n = this.f4226i.get();
            Fragment fragment = this.f4242y;
            if (fragment != null) {
                j0Var.f4398o = fragment.mWho;
            }
            j0Var.f4399p.addAll(this.f4227j.keySet());
            j0Var.f4400q.addAll(this.f4227j.values());
            j0Var.f4401r = new ArrayList<>(this.G);
            bundle.putParcelable("state", j0Var);
            for (String str : this.f4228k.keySet()) {
                bundle.putBundle(U + str, this.f4228k.get(str));
            }
            for (String str2 : n7.keySet()) {
                bundle.putBundle(V + str2, n7.get(str2));
            }
        }
        return bundle;
    }

    public void S(@d.o0 Menu menu) {
        if (this.f4238u < 1) {
            return;
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    @d.o0
    public androidx.lifecycle.e1 S0(@d.o0 Fragment fragment) {
        return this.P.q(fragment);
    }

    public void S1(@d.o0 String str) {
        h0(new t(str), false);
    }

    public final void T(@d.q0 Fragment fragment) {
        if (fragment == null || !fragment.equals(o0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void T0() {
        j0(true);
        if (this.f4225h.f()) {
            w1();
        } else {
            this.f4224g.g();
        }
    }

    public boolean T1(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2, @d.o0 String str) {
        int i7;
        int p02 = p0(str, -1, true);
        if (p02 < 0) {
            return false;
        }
        for (int i8 = p02; i8 < this.f4221d.size(); i8++) {
            androidx.fragment.app.a aVar = this.f4221d.get(i8);
            if (!aVar.f4544r) {
                f2(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i9 = p02; i9 < this.f4221d.size(); i9++) {
            androidx.fragment.app.a aVar2 = this.f4221d.get(i9);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<u0.a> it = aVar2.f4529c.iterator();
            while (it.hasNext()) {
                u0.a next = it.next();
                Fragment fragment = next.f4547b;
                if (fragment != null) {
                    if (!next.f4548c || (i7 = next.f4546a) == 1 || i7 == 2 || i7 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i10 = next.f4546a;
                    if (i10 == 1 || i10 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb.append(" in ");
                sb.append(aVar2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                f2(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                sb2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb2.append("fragment ");
                sb2.append(fragment2);
                f2(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.A0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f4221d.size() - p02);
        for (int i11 = p02; i11 < this.f4221d.size(); i11++) {
            arrayList4.add(null);
        }
        androidx.fragment.app.c cVar = new androidx.fragment.app.c(arrayList3, arrayList4);
        for (int size = this.f4221d.size() - 1; size >= p02; size--) {
            androidx.fragment.app.a remove = this.f4221d.remove(size);
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(remove);
            aVar3.V();
            arrayList4.set(size - p02, new androidx.fragment.app.b(aVar3));
            remove.Q = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f4227j.put(str, cVar);
        return true;
    }

    public void U() {
        a0(5);
    }

    public void U0(@d.o0 Fragment fragment) {
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        c2(fragment);
    }

    @d.q0
    public Fragment.n U1(@d.o0 Fragment fragment) {
        q0 o6 = this.f4220c.o(fragment.mWho);
        if (o6 == null || !o6.k().equals(fragment)) {
            f2(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return o6.q();
    }

    public void V(boolean z6, boolean z7) {
        if (z7 && (this.f4239v instanceof v2)) {
            f2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z6);
                if (z7) {
                    fragment.mChildFragmentManager.V(z6, true);
                }
            }
        }
    }

    public void V0(@d.o0 Fragment fragment) {
        if (fragment.mAdded && Y0(fragment)) {
            this.H = true;
        }
    }

    public void V1() {
        synchronized (this.f4218a) {
            boolean z6 = true;
            if (this.f4218a.size() != 1) {
                z6 = false;
            }
            if (z6) {
                this.f4239v.l().removeCallbacks(this.R);
                this.f4239v.l().post(this.R);
                h2();
            }
        }
    }

    public boolean W(@d.o0 Menu menu) {
        boolean z6 = false;
        if (this.f4238u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null && b1(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z6 = true;
            }
        }
        return z6;
    }

    public boolean W0() {
        return this.K;
    }

    public void W1(@d.o0 Fragment fragment, boolean z6) {
        ViewGroup G0 = G0(fragment);
        if (G0 == null || !(G0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) G0).setDrawDisappearingViewsLast(!z6);
    }

    public void X() {
        h2();
        T(this.f4242y);
    }

    public void X1(@d.o0 v vVar) {
        this.f4243z = vVar;
    }

    public void Y() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        a0(7);
    }

    public final boolean Y0(@d.o0 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.v();
    }

    public void Y1(@d.o0 Fragment fragment, @d.o0 p.b bVar) {
        if (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void Z() {
        this.I = false;
        this.J = false;
        this.P.u(false);
        a0(5);
    }

    public final boolean Z0() {
        Fragment fragment = this.f4241x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f4241x.getParentFragmentManager().Z0();
    }

    public void Z1(@d.q0 Fragment fragment) {
        if (fragment == null || (fragment.equals(o0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f4242y;
            this.f4242y = fragment;
            T(fragment2);
            T(this.f4242y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Override // androidx.fragment.app.o0
    @SuppressLint({"SyntheticAccessor"})
    public final void a(@d.o0 final String str, @d.o0 androidx.lifecycle.z zVar, @d.o0 final n0 n0Var) {
        final androidx.lifecycle.p lifecycle = zVar.getLifecycle();
        if (lifecycle.b() == p.b.DESTROYED) {
            return;
        }
        androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.v
            public void d(@d.o0 androidx.lifecycle.z zVar2, @d.o0 p.a aVar) {
                Bundle bundle;
                if (aVar == p.a.ON_START && (bundle = (Bundle) FragmentManager.this.f4228k.get(str)) != null) {
                    n0Var.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (aVar == p.a.ON_DESTROY) {
                    lifecycle.d(this);
                    FragmentManager.this.f4229l.remove(str);
                }
            }
        };
        o put = this.f4229l.put(str, new o(lifecycle, n0Var, vVar));
        if (put != null) {
            put.c();
        }
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting FragmentResultListener with key ");
            sb.append(str);
            sb.append(" lifecycleOwner ");
            sb.append(lifecycle);
            sb.append(" and listener ");
            sb.append(n0Var);
        }
        lifecycle.a(vVar);
    }

    public final void a0(int i7) {
        try {
            this.f4219b = true;
            this.f4220c.d(i7);
            n1(i7, false);
            Iterator<f1> it = B().iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            this.f4219b = false;
            j0(true);
        } catch (Throwable th) {
            this.f4219b = false;
            throw th;
        }
    }

    public boolean a1(@d.q0 Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public void a2(@d.o0 h1 h1Var) {
        this.B = h1Var;
    }

    @Override // androidx.fragment.app.o0
    public final void b(@d.o0 String str) {
        o remove = this.f4229l.remove(str);
        if (remove != null) {
            remove.c();
        }
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing FragmentResultListener for key ");
            sb.append(str);
        }
    }

    public void b0() {
        this.J = true;
        this.P.u(true);
        a0(4);
    }

    public boolean b1(@d.q0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void b2(@d.q0 d.c cVar) {
        this.Q = cVar;
    }

    @Override // androidx.fragment.app.o0
    public final void c(@d.o0 String str, @d.o0 Bundle bundle) {
        o oVar = this.f4229l.get(str);
        if (oVar == null || !oVar.b(p.b.STARTED)) {
            this.f4228k.put(str, bundle);
        } else {
            oVar.a(str, bundle);
        }
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting fragment result with key ");
            sb.append(str);
            sb.append(" and result ");
            sb.append(bundle);
        }
    }

    public void c0() {
        a0(2);
    }

    public boolean c1(@d.q0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.O0()) && c1(fragmentManager.f4241x);
    }

    public final void c2(@d.o0 Fragment fragment) {
        ViewGroup G0 = G0(fragment);
        if (G0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (G0.getTag(a.c.f18266c) == null) {
            G0.setTag(a.c.f18266c, fragment);
        }
        ((Fragment) G0.getTag(a.c.f18266c)).setPopDirection(fragment.getPopDirection());
    }

    @Override // androidx.fragment.app.o0
    public final void d(@d.o0 String str) {
        this.f4228k.remove(str);
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing fragment result with key ");
            sb.append(str);
        }
    }

    public final void d0() {
        if (this.L) {
            this.L = false;
            e2();
        }
    }

    public boolean d1(int i7) {
        return this.f4238u >= i7;
    }

    public void d2(@d.o0 Fragment fragment) {
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void e0(@d.o0 String str, @d.q0 FileDescriptor fileDescriptor, @d.o0 PrintWriter printWriter, @d.q0 String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4220c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4222e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                Fragment fragment = this.f4222e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f4221d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                androidx.fragment.app.a aVar = this.f4221d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.X(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4226i.get());
        synchronized (this.f4218a) {
            int size3 = this.f4218a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i9 = 0; i9 < size3; i9++) {
                    q qVar = this.f4218a.get(i9);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i9);
                    printWriter.print(": ");
                    printWriter.println(qVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4239v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4240w);
        if (this.f4241x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4241x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4238u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public boolean e1() {
        return this.I || this.J;
    }

    public final void e2() {
        Iterator<q0> it = this.f4220c.l().iterator();
        while (it.hasNext()) {
            r1(it.next());
        }
    }

    public final void f2(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c1("FragmentManager"));
        w<?> wVar = this.f4239v;
        if (wVar != null) {
            try {
                wVar.m("  ", null, printWriter, new String[0]);
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
            }
        } else {
            try {
                e0("  ", null, printWriter, new String[0]);
            } catch (Exception e8) {
                Log.e("FragmentManager", "Failed dumping state", e8);
            }
        }
        throw runtimeException;
    }

    public final void g0() {
        Iterator<f1> it = B().iterator();
        while (it.hasNext()) {
            it.next().n();
        }
    }

    public void g2(@d.o0 m mVar) {
        this.f4231n.p(mVar);
    }

    public void h0(@d.o0 q qVar, boolean z6) {
        if (!z6) {
            if (this.f4239v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            w();
        }
        synchronized (this.f4218a) {
            if (this.f4239v == null) {
                if (!z6) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f4218a.add(qVar);
            V1();
        }
    }

    public final void h2() {
        synchronized (this.f4218a) {
            if (this.f4218a.isEmpty()) {
                this.f4225h.i(C0() > 0 && c1(this.f4241x));
            } else {
                this.f4225h.i(true);
            }
        }
    }

    public final void i0(boolean z6) {
        if (this.f4219b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4239v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.f4239v.l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z6) {
                w();
            }
            if (this.M == null) {
                this.M = new ArrayList<>();
                this.N = new ArrayList<>();
            }
        }
    }

    public boolean j0(boolean z6) {
        i0(z6);
        boolean z7 = false;
        while (y0(this.M, this.N)) {
            z7 = true;
            this.f4219b = true;
            try {
                G1(this.M, this.N);
            } finally {
                x();
            }
        }
        h2();
        d0();
        this.f4220c.b();
        return z7;
    }

    public void k0(@d.o0 q qVar, boolean z6) {
        if (z6 && (this.f4239v == null || this.K)) {
            return;
        }
        i0(z6);
        if (qVar.b(this.M, this.N)) {
            this.f4219b = true;
            try {
                G1(this.M, this.N);
            } finally {
                x();
            }
        }
        h2();
        d0();
        this.f4220c.b();
    }

    public void k1(@d.o0 Fragment fragment, @d.o0 String[] strArr, int i7) {
        if (this.F == null) {
            this.f4239v.v(fragment, strArr, i7);
            return;
        }
        this.G.addLast(new n(fragment.mWho, i7));
        this.F.b(strArr);
    }

    public void l1(@d.o0 Fragment fragment, @d.o0 Intent intent, int i7, @d.q0 Bundle bundle) {
        if (this.D == null) {
            this.f4239v.z(fragment, intent, i7, bundle);
            return;
        }
        this.G.addLast(new n(fragment.mWho, i7));
        if (bundle != null) {
            intent.putExtra(b.m.f7290b, bundle);
        }
        this.D.b(intent);
    }

    public void m(androidx.fragment.app.a aVar) {
        if (this.f4221d == null) {
            this.f4221d = new ArrayList<>();
        }
        this.f4221d.add(aVar);
    }

    public final void m0(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2, int i7, int i8) {
        ArrayList<p> arrayList3;
        boolean z6 = arrayList.get(i7).f4544r;
        ArrayList<Fragment> arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.f4220c.p());
        Fragment O0 = O0();
        boolean z7 = false;
        for (int i9 = i7; i9 < i8; i9++) {
            androidx.fragment.app.a aVar = arrayList.get(i9);
            O0 = !arrayList2.get(i9).booleanValue() ? aVar.b0(this.O, O0) : aVar.d0(this.O, O0);
            z7 = z7 || aVar.f4535i;
        }
        this.O.clear();
        if (!z6 && this.f4238u >= 1) {
            for (int i10 = i7; i10 < i8; i10++) {
                Iterator<u0.a> it = arrayList.get(i10).f4529c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f4547b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f4220c.s(D(fragment));
                    }
                }
            }
        }
        l0(arrayList, arrayList2, i7, i8);
        boolean booleanValue = arrayList2.get(i8 - 1).booleanValue();
        if (z7 && (arrayList3 = this.f4230m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(x0(it2.next()));
            }
            Iterator<p> it3 = this.f4230m.iterator();
            while (it3.hasNext()) {
                p next = it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    next.c((Fragment) it4.next(), booleanValue);
                }
            }
            Iterator<p> it5 = this.f4230m.iterator();
            while (it5.hasNext()) {
                p next2 = it5.next();
                Iterator it6 = linkedHashSet.iterator();
                while (it6.hasNext()) {
                    next2.a((Fragment) it6.next(), booleanValue);
                }
            }
        }
        for (int i11 = i7; i11 < i8; i11++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i11);
            if (booleanValue) {
                for (int size = aVar2.f4529c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f4529c.get(size).f4547b;
                    if (fragment2 != null) {
                        D(fragment2).m();
                    }
                }
            } else {
                Iterator<u0.a> it7 = aVar2.f4529c.iterator();
                while (it7.hasNext()) {
                    Fragment fragment3 = it7.next().f4547b;
                    if (fragment3 != null) {
                        D(fragment3).m();
                    }
                }
            }
        }
        n1(this.f4238u, true);
        for (f1 f1Var : C(arrayList, i7, i8)) {
            f1Var.v(booleanValue);
            f1Var.t();
            f1Var.k();
        }
        while (i7 < i8) {
            androidx.fragment.app.a aVar3 = arrayList.get(i7);
            if (arrayList2.get(i7).booleanValue() && aVar3.P >= 0) {
                aVar3.P = -1;
            }
            aVar3.c0();
            i7++;
        }
        if (z7) {
            I1();
        }
    }

    public void m1(@d.o0 Fragment fragment, @d.o0 IntentSender intentSender, int i7, @d.q0 Intent intent, int i8, int i9, int i10, @d.q0 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.E == null) {
            this.f4239v.A(fragment, intentSender, i7, intent, i8, i9, i10, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra(Z, true);
            } else {
                intent2 = intent;
            }
            if (X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("ActivityOptions ");
                sb.append(bundle);
                sb.append(" were added to fillInIntent ");
                sb.append(intent2);
                sb.append(" for fragment ");
                sb.append(fragment);
            }
            intent2.putExtra(b.m.f7290b, bundle);
        } else {
            intent2 = intent;
        }
        androidx.activity.result.l a7 = new l.b(intentSender).b(intent2).c(i9, i8).a();
        this.G.addLast(new n(fragment.mWho, i7));
        if (X0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment ");
            sb2.append(fragment);
            sb2.append("is launching an IntentSender for result ");
        }
        this.E.b(a7);
    }

    public q0 n(@d.o0 Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            y1.d.i(fragment, str);
        }
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        q0 D = D(fragment);
        fragment.mFragmentManager = this;
        this.f4220c.s(D);
        if (!fragment.mDetached) {
            this.f4220c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Y0(fragment)) {
                this.H = true;
            }
        }
        return D;
    }

    @d.l0
    public boolean n0() {
        boolean j02 = j0(true);
        w0();
        return j02;
    }

    public void n1(int i7, boolean z6) {
        w<?> wVar;
        if (this.f4239v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i7 != this.f4238u) {
            this.f4238u = i7;
            this.f4220c.u();
            e2();
            if (this.H && (wVar = this.f4239v) != null && this.f4238u == 7) {
                wVar.B();
                this.H = false;
            }
        }
    }

    public void o(@d.o0 l0 l0Var) {
        this.f4232o.add(l0Var);
    }

    @d.q0
    public Fragment o0(@d.o0 String str) {
        return this.f4220c.f(str);
    }

    public void o1() {
        if (this.f4239v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.u(false);
        for (Fragment fragment : this.f4220c.p()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void p(@d.o0 p pVar) {
        if (this.f4230m == null) {
            this.f4230m = new ArrayList<>();
        }
        this.f4230m.add(pVar);
    }

    public final int p0(@d.q0 String str, int i7, boolean z6) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4221d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i7 < 0) {
            if (z6) {
                return 0;
            }
            return this.f4221d.size() - 1;
        }
        int size = this.f4221d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f4221d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i7 >= 0 && i7 == aVar.P)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f4221d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f4221d.get(size - 1);
            if ((str == null || !str.equals(aVar2.getName())) && (i7 < 0 || i7 != aVar2.P)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public void p1(@d.o0 FragmentContainerView fragmentContainerView) {
        View view;
        for (q0 q0Var : this.f4220c.l()) {
            Fragment k7 = q0Var.k();
            if (k7.mContainerId == fragmentContainerView.getId() && (view = k7.mView) != null && view.getParent() == null) {
                k7.mContainer = fragmentContainerView;
                q0Var.b();
            }
        }
    }

    public void q(@d.o0 Fragment fragment) {
        this.P.h(fragment);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    @Deprecated
    public u0 q1() {
        return u();
    }

    public int r() {
        return this.f4226i.getAndIncrement();
    }

    @d.q0
    public Fragment r0(@d.d0 int i7) {
        return this.f4220c.g(i7);
    }

    public void r1(@d.o0 q0 q0Var) {
        Fragment k7 = q0Var.k();
        if (k7.mDeferStart) {
            if (this.f4219b) {
                this.L = true;
                return;
            }
            k7.mDeferStart = false;
            q0Var.m();
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public void s(@d.o0 w<?> wVar, @d.o0 androidx.fragment.app.t tVar, @d.q0 Fragment fragment) {
        String str;
        if (this.f4239v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4239v = wVar;
        this.f4240w = tVar;
        this.f4241x = fragment;
        if (fragment != null) {
            o(new g(fragment));
        } else if (wVar instanceof l0) {
            o((l0) wVar);
        }
        if (this.f4241x != null) {
            h2();
        }
        if (wVar instanceof androidx.activity.t) {
            androidx.activity.t tVar2 = (androidx.activity.t) wVar;
            OnBackPressedDispatcher onBackPressedDispatcher = tVar2.getOnBackPressedDispatcher();
            this.f4224g = onBackPressedDispatcher;
            androidx.lifecycle.z zVar = tVar2;
            if (fragment != null) {
                zVar = fragment;
            }
            onBackPressedDispatcher.c(zVar, this.f4225h);
        }
        if (fragment != null) {
            this.P = fragment.mFragmentManager.D0(fragment);
        } else if (wVar instanceof androidx.lifecycle.f1) {
            this.P = k0.n(((androidx.lifecycle.f1) wVar).getViewModelStore());
        } else {
            this.P = new k0(false);
        }
        this.P.u(e1());
        this.f4220c.B(this.P);
        w<?> wVar2 = this.f4239v;
        if ((wVar2 instanceof e3.d) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((e3.d) wVar2).getSavedStateRegistry();
            savedStateRegistry.j(S, new a.c() { // from class: androidx.fragment.app.f0
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle f12;
                    f12 = FragmentManager.this.f1();
                    return f12;
                }
            });
            Bundle b7 = savedStateRegistry.b(S);
            if (b7 != null) {
                N1(b7);
            }
        }
        w<?> wVar3 = this.f4239v;
        if (wVar3 instanceof androidx.activity.result.k) {
            ActivityResultRegistry o6 = ((androidx.activity.result.k) wVar3).o();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.D = o6.j(str2 + "StartActivityForResult", new b.m(), new h());
            this.E = o6.j(str2 + "StartIntentSenderForResult", new l(), new i());
            this.F = o6.j(str2 + "RequestPermissions", new b.k(), new a());
        }
        w<?> wVar4 = this.f4239v;
        if (wVar4 instanceof k0.q0) {
            ((k0.q0) wVar4).b(this.f4233p);
        }
        w<?> wVar5 = this.f4239v;
        if (wVar5 instanceof k0.r0) {
            ((k0.r0) wVar5).n(this.f4234q);
        }
        w<?> wVar6 = this.f4239v;
        if (wVar6 instanceof t2) {
            ((t2) wVar6).h(this.f4235r);
        }
        w<?> wVar7 = this.f4239v;
        if (wVar7 instanceof v2) {
            ((v2) wVar7).i(this.f4236s);
        }
        w<?> wVar8 = this.f4239v;
        if ((wVar8 instanceof androidx.core.view.u0) && fragment == null) {
            ((androidx.core.view.u0) wVar8).addMenuProvider(this.f4237t);
        }
    }

    @d.q0
    public Fragment s0(@d.q0 String str) {
        return this.f4220c.h(str);
    }

    public void s1() {
        h0(new r(null, -1, 0), false);
    }

    public void t(@d.o0 Fragment fragment) {
        if (X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f4220c.a(fragment);
            if (X0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(fragment);
            }
            if (Y0(fragment)) {
                this.H = true;
            }
        }
    }

    public Fragment t0(@d.o0 String str) {
        return this.f4220c.i(str);
    }

    public void t1(int i7, int i8) {
        u1(i7, i8, false);
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f4241x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4241x)));
            sb.append("}");
        } else {
            w<?> wVar = this.f4239v;
            if (wVar != null) {
                sb.append(wVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4239v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    @d.o0
    public u0 u() {
        return new androidx.fragment.app.a(this);
    }

    public void u1(int i7, int i8, boolean z6) {
        if (i7 >= 0) {
            h0(new r(null, i7, i8), z6);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    public boolean v() {
        boolean z6 = false;
        for (Fragment fragment : this.f4220c.m()) {
            if (fragment != null) {
                z6 = Y0(fragment);
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public void v1(@d.q0 String str, int i7) {
        h0(new r(str, -1, i7), false);
    }

    public final void w() {
        if (e1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void w0() {
        Iterator<f1> it = B().iterator();
        while (it.hasNext()) {
            it.next().o();
        }
    }

    @d.l0
    public boolean w1() {
        return z1(null, -1, 0);
    }

    public final void x() {
        this.f4219b = false;
        this.N.clear();
        this.M.clear();
    }

    public final Set<Fragment> x0(@d.o0 androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < aVar.f4529c.size(); i7++) {
            Fragment fragment = aVar.f4529c.get(i7).f4547b;
            if (fragment != null && aVar.f4535i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public boolean x1(int i7, int i8) {
        if (i7 >= 0) {
            return z1(null, i7, i8);
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    public void y(@d.o0 String str) {
        h0(new k(str), false);
    }

    public final boolean y0(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f4218a) {
            if (this.f4218a.isEmpty()) {
                return false;
            }
            int size = this.f4218a.size();
            boolean z6 = false;
            for (int i7 = 0; i7 < size; i7++) {
                z6 |= this.f4218a.get(i7).b(arrayList, arrayList2);
            }
            this.f4218a.clear();
            this.f4239v.l().removeCallbacks(this.R);
            return z6;
        }
    }

    @d.l0
    public boolean y1(@d.q0 String str, int i7) {
        return z1(str, -1, i7);
    }

    public boolean z(@d.o0 ArrayList<androidx.fragment.app.a> arrayList, @d.o0 ArrayList<Boolean> arrayList2, @d.o0 String str) {
        if (L1(arrayList, arrayList2, str)) {
            return A1(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    public int z0() {
        return this.f4220c.k();
    }

    public final boolean z1(@d.q0 String str, int i7, int i8) {
        j0(false);
        i0(true);
        Fragment fragment = this.f4242y;
        if (fragment == null || i7 >= 0 || str != null || !fragment.getChildFragmentManager().w1()) {
            boolean A1 = A1(this.M, this.N, str, i7, i8);
            if (A1) {
                this.f4219b = true;
                try {
                    G1(this.M, this.N);
                } finally {
                    x();
                }
            }
            h2();
            d0();
            this.f4220c.b();
            return A1;
        }
        return true;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public String f4260k;

        /* renamed from: l  reason: collision with root package name */
        public int f4261l;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i7) {
                return new n[i7];
            }
        }

        public n(@d.o0 String str, int i7) {
            this.f4260k = str;
            this.f4261l = i7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f4260k);
            parcel.writeInt(this.f4261l);
        }

        public n(@d.o0 Parcel parcel) {
            this.f4260k = parcel.readString();
            this.f4261l = parcel.readInt();
        }
    }
}
