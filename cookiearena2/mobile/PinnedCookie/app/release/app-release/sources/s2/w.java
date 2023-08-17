package s2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.p;
import d.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s2.d1;
import s2.e0;
import s2.g0;
import s2.t;
import s2.y;
import u4.k1;
import u4.r1;
import u4.u1;
import v3.m2;
import v3.q1;
@r1({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2565:1\n179#2,2:2566\n1295#2,2:2576\n1295#2,2:2578\n179#2,2:2697\n1#3:2568\n150#4:2569\n533#5,6:2570\n1855#5,2:2580\n1855#5,2:2582\n1855#5,2:2584\n1855#5,2:2586\n1864#5,3:2588\n1774#5,4:2591\n1855#5:2595\n766#5:2596\n857#5,2:2597\n1856#5:2599\n766#5:2600\n857#5,2:2601\n766#5:2603\n857#5,2:2604\n1855#5,2:2606\n1855#5:2608\n1789#5,3:2609\n1856#5:2612\n819#5:2620\n847#5,2:2621\n1855#5:2623\n1856#5:2631\n1855#5,2:2632\n1855#5,2:2634\n378#5,7:2636\n1855#5,2:2643\n1855#5,2:2645\n819#5:2647\n847#5,2:2648\n1855#5,2:2650\n1855#5,2:2652\n533#5,6:2654\n533#5,6:2660\n533#5,6:2666\n1855#5,2:2672\n1855#5,2:2674\n1864#5,3:2677\n1855#5,2:2683\n533#5,6:2685\n533#5,6:2691\n361#6,7:2613\n361#6,7:2624\n29#7:2676\n13674#8,3:2680\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n77#1:2566,2\n663#1:2576,2\n682#1:2578,2\n2473#1:2697,2\n161#1:2569\n605#1:2570,6\n805#1:2580,2\n810#1:2582,2\n818#1:2584,2\n822#1:2586,2\n904#1:2588,3\n964#1:2591,4\n1098#1:2595\n1099#1:2596\n1099#1:2597,2\n1098#1:2599\n1106#1:2600\n1106#1:2601,2\n1110#1:2603\n1110#1:2604,2\n1179#1:2606,2\n1195#1:2608\n1198#1:2609,3\n1195#1:2612\n1262#1:2620\n1262#1:2621,2\n1262#1:2623\n1262#1:2631\n1801#1:2632,2\n1839#1:2634,2\n1859#1:2636,7\n1872#1:2643,2\n1882#1:2645,2\n1950#1:2647\n1950#1:2648,2\n1953#1:2650,2\n1995#1:2652,2\n2037#1:2654,6\n2062#1:2660,6\n2089#1:2666,6\n2099#1:2672,2\n2115#1:2674,2\n2260#1:2677,3\n2303#1:2683,2\n2408#1:2685,6\n2430#1:2691,6\n1248#1:2613,7\n1263#1:2624,7\n2187#1:2676\n2298#1:2680,3\n*E\n"})
/* loaded from: classes.dex */
public class w {
    @n6.d
    public static final String J = "NavController";
    @n6.d
    public static final String K = "android-support-nav:controller:navigatorState";
    @n6.d
    public static final String L = "android-support-nav:controller:navigatorState:names";
    @n6.d
    public static final String M = "android-support-nav:controller:backStack";
    @n6.d
    public static final String N = "android-support-nav:controller:backStackDestIds";
    @n6.d
    public static final String O = "android-support-nav:controller:backStackIds";
    @n6.d
    public static final String P = "android-support-nav:controller:backStackStates";
    @n6.d
    public static final String Q = "android-support-nav:controller:backStackStates:";
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public static final String R = "android-support-nav:controller:deepLinkIds";
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public static final String S = "android-support-nav:controller:deepLinkArgs";
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public static final String T = "android-support-nav:controller:deepLinkExtras";
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public static final String U = "android-support-nav:controller:deepLinkHandled";
    @n6.d
    public static final String V = "android-support-nav:controller:deepLinkIntent";
    @n6.e
    public t4.l<? super t, m2> A;
    @n6.e
    public t4.l<? super t, m2> B;
    @n6.d
    public final Map<t, Boolean> C;
    public int D;
    @n6.d
    public final List<t> E;
    @n6.d
    public final v3.d0 F;
    @n6.d
    public final kotlinx.coroutines.flow.d0<t> G;
    @n6.d
    public final kotlinx.coroutines.flow.i<t> H;
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Context f16491a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public Activity f16492b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public t0 f16493c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public k0 f16494d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public Bundle f16495e;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public Parcelable[] f16496f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16497g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final x3.k<t> f16498h;
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public final kotlinx.coroutines.flow.e0<List<t>> f16499i;
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t0<List<t>> f16500j;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final kotlinx.coroutines.flow.e0<List<t>> f16501k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t0<List<t>> f16502l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final Map<t, t> f16503m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final Map<t, AtomicInteger> f16504n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final Map<Integer, String> f16505o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final Map<String, x3.k<u>> f16506p;
    @n6.e

    /* renamed from: q  reason: collision with root package name */
    public androidx.lifecycle.z f16507q;
    @n6.e

    /* renamed from: r  reason: collision with root package name */
    public OnBackPressedDispatcher f16508r;
    @n6.e

    /* renamed from: s  reason: collision with root package name */
    public y f16509s;
    @n6.d

    /* renamed from: t  reason: collision with root package name */
    public final CopyOnWriteArrayList<c> f16510t;
    @n6.d

    /* renamed from: u  reason: collision with root package name */
    public p.b f16511u;
    @n6.d

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.y f16512v;
    @n6.d

    /* renamed from: w  reason: collision with root package name */
    public final androidx.activity.k f16513w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16514x;
    @n6.d

    /* renamed from: y  reason: collision with root package name */
    public e1 f16515y;
    @n6.d

    /* renamed from: z  reason: collision with root package name */
    public final Map<d1<? extends g0>, b> f16516z;
    @n6.d
    public static final a I = new a(null);
    public static boolean W = true;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @s4.m
        @f0
        public final void a(boolean z6) {
            w.W = z6;
        }

        public a() {
        }
    }

    @r1({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2565:1\n150#2:2566\n150#2:2567\n2624#3,3:2568\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n*L\n288#1:2566\n325#1:2567\n357#1:2568,3\n*E\n"})
    /* loaded from: classes.dex */
    public final class b extends g1 {
        @n6.d

        /* renamed from: g  reason: collision with root package name */
        public final d1<? extends g0> f16517g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ w f16518h;

        /* loaded from: classes.dex */
        public static final class a extends u4.n0 implements t4.a<m2> {

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ t f16520m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ boolean f16521n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, boolean z6) {
                super(0);
                this.f16520m = tVar;
                this.f16521n = z6;
            }

            public final void b() {
                b.super.h(this.f16520m, this.f16521n);
            }

            @Override // t4.a
            public /* bridge */ /* synthetic */ m2 n() {
                b();
                return m2.f17815a;
            }
        }

        public b(@n6.d w wVar, d1<? extends g0> d1Var) {
            u4.l0.p(d1Var, "navigator");
            this.f16518h = wVar;
            this.f16517g = d1Var;
        }

        @Override // s2.g1
        @n6.d
        public t a(@n6.d g0 g0Var, @n6.e Bundle bundle) {
            u4.l0.p(g0Var, "destination");
            return t.a.b(t.f16429p, this.f16518h.J(), g0Var, bundle, this.f16518h.Q(), this.f16518h.f16509s, null, null, 96, null);
        }

        @Override // s2.g1
        public void e(@n6.d t tVar) {
            y yVar;
            u4.l0.p(tVar, "entry");
            boolean g7 = u4.l0.g(this.f16518h.C.get(tVar), Boolean.TRUE);
            super.e(tVar);
            this.f16518h.C.remove(tVar);
            if (this.f16518h.f16498h.contains(tVar)) {
                if (d()) {
                    return;
                }
                this.f16518h.e1();
                this.f16518h.f16499i.k(x3.e0.T5(this.f16518h.f16498h));
                this.f16518h.f16501k.k(this.f16518h.M0());
                return;
            }
            this.f16518h.d1(tVar);
            if (tVar.getLifecycle().b().d(p.b.CREATED)) {
                tVar.l(p.b.DESTROYED);
            }
            x3.k kVar = this.f16518h.f16498h;
            boolean z6 = true;
            if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
                Iterator<E> it = kVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (u4.l0.g(((t) it.next()).f(), tVar.f())) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6 && !g7 && (yVar = this.f16518h.f16509s) != null) {
                yVar.i(tVar.f());
            }
            this.f16518h.e1();
            this.f16518h.f16501k.k(this.f16518h.M0());
        }

        @Override // s2.g1
        public void h(@n6.d t tVar, boolean z6) {
            u4.l0.p(tVar, "popUpTo");
            d1 f7 = this.f16518h.f16515y.f(tVar.e().t());
            if (!u4.l0.g(f7, this.f16517g)) {
                Object obj = this.f16518h.f16516z.get(f7);
                u4.l0.m(obj);
                ((b) obj).h(tVar, z6);
                return;
            }
            t4.l lVar = this.f16518h.B;
            if (lVar == null) {
                this.f16518h.E0(tVar, new a(tVar, z6));
                return;
            }
            lVar.O(tVar);
            super.h(tVar, z6);
        }

        @Override // s2.g1
        public void i(@n6.d t tVar, boolean z6) {
            u4.l0.p(tVar, "popUpTo");
            super.i(tVar, z6);
            this.f16518h.C.put(tVar, Boolean.valueOf(z6));
        }

        @Override // s2.g1
        public void j(@n6.d t tVar) {
            u4.l0.p(tVar, "entry");
            super.j(tVar);
            if (!this.f16518h.f16498h.contains(tVar)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            tVar.l(p.b.STARTED);
        }

        @Override // s2.g1
        public void k(@n6.d t tVar) {
            u4.l0.p(tVar, "backStackEntry");
            d1 f7 = this.f16518h.f16515y.f(tVar.e().t());
            if (!u4.l0.g(f7, this.f16517g)) {
                Object obj = this.f16518h.f16516z.get(f7);
                if (obj != null) {
                    ((b) obj).k(tVar);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + tVar.e().t() + " should already be created").toString());
            }
            t4.l lVar = this.f16518h.A;
            if (lVar != null) {
                lVar.O(tVar);
                o(tVar);
                return;
            }
            Log.i(w.J, "Ignoring add of destination " + tVar.e() + " outside of the call to navigate(). ");
        }

        public final void o(@n6.d t tVar) {
            u4.l0.p(tVar, "backStackEntry");
            super.k(tVar);
        }

        @n6.d
        public final d1<? extends g0> p() {
            return this.f16517g;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(@n6.d w wVar, @n6.d g0 g0Var, @n6.e Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.l<Context, Context> {

        /* renamed from: l  reason: collision with root package name */
        public static final d f16522l = new d();

        public d() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Context O(@n6.d Context context) {
            u4.l0.p(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends u4.n0 implements t4.l<v0, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final e f16523l = new e();

        public e() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(v0 v0Var) {
            b(v0Var);
            return m2.f17815a;
        }

        public final void b(@n6.d v0 v0Var) {
            u4.l0.p(v0Var, "$this$navOptions");
            v0Var.q(true);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends u4.n0 implements t4.l<t, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.a f16524l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ k1.a f16525m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ w f16526n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ boolean f16527o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ x3.k<u> f16528p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k1.a aVar, k1.a aVar2, w wVar, boolean z6, x3.k<u> kVar) {
            super(1);
            this.f16524l = aVar;
            this.f16525m = aVar2;
            this.f16526n = wVar;
            this.f16527o = z6;
            this.f16528p = kVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(t tVar) {
            b(tVar);
            return m2.f17815a;
        }

        public final void b(@n6.d t tVar) {
            u4.l0.p(tVar, "entry");
            this.f16524l.f17429k = true;
            this.f16525m.f17429k = true;
            this.f16526n.K0(tVar, this.f16527o, this.f16528p);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends u4.n0 implements t4.l<g0, g0> {

        /* renamed from: l  reason: collision with root package name */
        public static final g f16529l = new g();

        public g() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final g0 O(@n6.d g0 g0Var) {
            u4.l0.p(g0Var, "destination");
            k0 u6 = g0Var.u();
            boolean z6 = false;
            if (u6 != null && u6.a0() == g0Var.r()) {
                z6 = true;
            }
            if (z6) {
                return g0Var.u();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends u4.n0 implements t4.l<g0, Boolean> {
        public h() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d g0 g0Var) {
            u4.l0.p(g0Var, "destination");
            return Boolean.valueOf(!w.this.f16505o.containsKey(Integer.valueOf(g0Var.r())));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends u4.n0 implements t4.l<g0, g0> {

        /* renamed from: l  reason: collision with root package name */
        public static final i f16531l = new i();

        public i() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final g0 O(@n6.d g0 g0Var) {
            u4.l0.p(g0Var, "destination");
            k0 u6 = g0Var.u();
            boolean z6 = false;
            if (u6 != null && u6.a0() == g0Var.r()) {
                z6 = true;
            }
            if (z6) {
                return g0Var.u();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends u4.n0 implements t4.l<g0, Boolean> {
        public j() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d g0 g0Var) {
            u4.l0.p(g0Var, "destination");
            return Boolean.valueOf(!w.this.f16505o.containsKey(Integer.valueOf(g0Var.r())));
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends u4.n0 implements t4.l<t, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.a f16533l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ List<t> f16534m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ k1.f f16535n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ w f16536o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Bundle f16537p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(k1.a aVar, List<t> list, k1.f fVar, w wVar, Bundle bundle) {
            super(1);
            this.f16533l = aVar;
            this.f16534m = list;
            this.f16535n = fVar;
            this.f16536o = wVar;
            this.f16537p = bundle;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(t tVar) {
            b(tVar);
            return m2.f17815a;
        }

        public final void b(@n6.d t tVar) {
            List<t> E;
            u4.l0.p(tVar, "entry");
            this.f16533l.f17429k = true;
            int indexOf = this.f16534m.indexOf(tVar);
            if (indexOf != -1) {
                int i7 = indexOf + 1;
                E = this.f16534m.subList(this.f16535n.f17434k, i7);
                this.f16535n.f17434k = i7;
            } else {
                E = x3.w.E();
            }
            this.f16536o.q(tVar.e(), this.f16537p, tVar, E);
        }
    }

    @r1({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,2565:1\n2141#2,2:2566\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n*L\n1409#1:2566,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class l extends u4.n0 implements t4.l<v0, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ g0 f16538l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ w f16539m;

        /* loaded from: classes.dex */
        public static final class a extends u4.n0 implements t4.l<s2.h, m2> {

            /* renamed from: l  reason: collision with root package name */
            public static final a f16540l = new a();

            public a() {
                super(1);
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(s2.h hVar) {
                b(hVar);
                return m2.f17815a;
            }

            public final void b(@n6.d s2.h hVar) {
                u4.l0.p(hVar, "$this$anim");
                hVar.e(0);
                hVar.f(0);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends u4.n0 implements t4.l<i1, m2> {

            /* renamed from: l  reason: collision with root package name */
            public static final b f16541l = new b();

            public b() {
                super(1);
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(i1 i1Var) {
                b(i1Var);
                return m2.f17815a;
            }

            public final void b(@n6.d i1 i1Var) {
                u4.l0.p(i1Var, "$this$popUpTo");
                i1Var.d(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(g0 g0Var, w wVar) {
            super(1);
            this.f16538l = g0Var;
            this.f16539m = wVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(v0 v0Var) {
            b(v0Var);
            return m2.f17815a;
        }

        public final void b(@n6.d v0 v0Var) {
            boolean z6;
            u4.l0.p(v0Var, "$this$navOptions");
            v0Var.a(a.f16540l);
            g0 g0Var = this.f16538l;
            boolean z7 = false;
            if (g0Var instanceof k0) {
                f5.m<g0> c7 = g0.f16312t.c(g0Var);
                w wVar = this.f16539m;
                Iterator<g0> it = c7.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    g0 next = it.next();
                    g0 N = wVar.N();
                    if (u4.l0.g(next, N != null ? N.u() : null)) {
                        z6 = false;
                        break;
                    }
                }
                if (z6) {
                    z7 = true;
                }
            }
            if (z7 && w.W) {
                v0Var.i(k0.f16370z.a(this.f16539m.P()).r(), b.f16541l);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends u4.n0 implements t4.a<t0> {
        public m() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final t0 n() {
            t0 t0Var = w.this.f16493c;
            return t0Var == null ? new t0(w.this.J(), w.this.f16515y) : t0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends u4.n0 implements t4.l<t, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.a f16543l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ w f16544m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ g0 f16545n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Bundle f16546o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(k1.a aVar, w wVar, g0 g0Var, Bundle bundle) {
            super(1);
            this.f16543l = aVar;
            this.f16544m = wVar;
            this.f16545n = g0Var;
            this.f16546o = bundle;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(t tVar) {
            b(tVar);
            return m2.f17815a;
        }

        public final void b(@n6.d t tVar) {
            u4.l0.p(tVar, "it");
            this.f16543l.f17429k = true;
            w.r(this.f16544m, this.f16545n, this.f16546o, tVar, null, 8, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends u4.n0 implements t4.l<t, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final o f16547l = new o();

        public o() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(t tVar) {
            b(tVar);
            return m2.f17815a;
        }

        public final void b(@n6.d t tVar) {
            u4.l0.p(tVar, "it");
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends androidx.activity.k {
        public p() {
            super(false);
        }

        @Override // androidx.activity.k
        public void e() {
            w.this.y0();
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends u4.n0 implements t4.l<t, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final q f16549l = new q();

        public q() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(t tVar) {
            b(tVar);
            return m2.f17815a;
        }

        public final void b(@n6.d t tVar) {
            u4.l0.p(tVar, "it");
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends u4.n0 implements t4.l<String, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f16550l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(1);
            this.f16550l = str;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.e String str) {
            return Boolean.valueOf(u4.l0.g(str, this.f16550l));
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends u4.n0 implements t4.l<String, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f16551l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(1);
            this.f16551l = str;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.e String str) {
            return Boolean.valueOf(u4.l0.g(str, this.f16551l));
        }
    }

    public w(@n6.d Context context) {
        Object obj;
        u4.l0.p(context, "context");
        this.f16491a = context;
        Iterator it = f5.s.l(context, d.f16522l).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f16492b = (Activity) obj;
        this.f16498h = new x3.k<>();
        kotlinx.coroutines.flow.e0<List<t>> a7 = kotlinx.coroutines.flow.v0.a(x3.w.E());
        this.f16499i = a7;
        this.f16500j = kotlinx.coroutines.flow.k.m(a7);
        kotlinx.coroutines.flow.e0<List<t>> a8 = kotlinx.coroutines.flow.v0.a(x3.w.E());
        this.f16501k = a8;
        this.f16502l = kotlinx.coroutines.flow.k.m(a8);
        this.f16503m = new LinkedHashMap();
        this.f16504n = new LinkedHashMap();
        this.f16505o = new LinkedHashMap();
        this.f16506p = new LinkedHashMap();
        this.f16510t = new CopyOnWriteArrayList<>();
        this.f16511u = p.b.INITIALIZED;
        this.f16512v = new androidx.lifecycle.v() { // from class: s2.v
            @Override // androidx.lifecycle.v
            public final void d(androidx.lifecycle.z zVar, p.a aVar) {
                w.Z(w.this, zVar, aVar);
            }
        };
        this.f16513w = new p();
        this.f16514x = true;
        this.f16515y = new e1();
        this.f16516z = new LinkedHashMap();
        this.C = new LinkedHashMap();
        e1 e1Var = this.f16515y;
        e1Var.c(new o0(e1Var));
        this.f16515y.c(new s2.d(this.f16491a));
        this.E = new ArrayList();
        this.F = v3.f0.b(new m());
        kotlinx.coroutines.flow.d0<t> b7 = kotlinx.coroutines.flow.k0.b(1, 0, n5.m.DROP_OLDEST, 2, null);
        this.G = b7;
        this.H = kotlinx.coroutines.flow.k.l(b7);
    }

    public static /* synthetic */ boolean D0(w wVar, String str, boolean z6, boolean z7, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 4) != 0) {
                z7 = false;
            }
            return wVar.C0(str, z6, z7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0(w wVar, d1 d1Var, t tVar, boolean z6, t4.l lVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i7 & 4) != 0) {
            lVar = q.f16549l;
        }
        wVar.F0(d1Var, tVar, z6, lVar);
    }

    public static /* synthetic */ boolean J0(w wVar, int i7, boolean z6, boolean z7, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 4) != 0) {
                z7 = false;
            }
            return wVar.G0(i7, z6, z7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void L0(w wVar, t tVar, boolean z6, x3.k kVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            kVar = new x3.k();
        }
        wVar.K0(tVar, z6, kVar);
    }

    public static final void Z(w wVar, androidx.lifecycle.z zVar, p.a aVar) {
        u4.l0.p(wVar, "this$0");
        u4.l0.p(zVar, "<anonymous parameter 0>");
        u4.l0.p(aVar, i0.k0.I0);
        wVar.f16511u = aVar.h();
        if (wVar.f16494d != null) {
            Iterator<t> it = wVar.f16498h.iterator();
            while (it.hasNext()) {
                it.next().i(aVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r(w wVar, g0 g0Var, Bundle bundle, t tVar, List list, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i7 & 8) != 0) {
            list = x3.w.E();
        }
        wVar.q(g0Var, bundle, tVar, list);
    }

    public static /* synthetic */ void t0(w wVar, String str, u0 u0Var, d1.a aVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i7 & 2) != 0) {
            u0Var = null;
        }
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        wVar.k0(str, u0Var, aVar);
    }

    public static /* synthetic */ void v0(w wVar, d1 d1Var, List list, u0 u0Var, d1.a aVar, t4.l lVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        o oVar = lVar;
        if ((i7 & 8) != 0) {
            oVar = o.f16547l;
        }
        wVar.u0(d1Var, list, u0Var, aVar, oVar);
    }

    @s4.m
    @f0
    public static final void z(boolean z6) {
        I.a(z6);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public void A(boolean z6) {
        this.f16514x = z6;
        f1();
    }

    @d.l0
    public boolean A0(@d.d0 int i7, boolean z6, boolean z7) {
        return G0(i7, z6, z7) && y();
    }

    public final boolean B(List<? extends d1<?>> list, g0 g0Var, boolean z6, boolean z7) {
        k1.a aVar = new k1.a();
        x3.k<u> kVar = new x3.k<>();
        Iterator<? extends d1<?>> it = list.iterator();
        while (it.hasNext()) {
            d1<? extends g0> d1Var = (d1) it.next();
            k1.a aVar2 = new k1.a();
            F0(d1Var, this.f16498h.s(), z7, new f(aVar2, aVar, this, z7, kVar));
            if (!aVar2.f17429k) {
                break;
            }
        }
        if (z7) {
            if (!z6) {
                for (g0 g0Var2 : f5.u.Z2(f5.s.l(g0Var, g.f16529l), new h())) {
                    Map<Integer, String> map = this.f16505o;
                    Integer valueOf = Integer.valueOf(g0Var2.r());
                    u n7 = kVar.n();
                    map.put(valueOf, n7 != null ? n7.c() : null);
                }
            }
            if ((!kVar.isEmpty()) != false) {
                u m7 = kVar.m();
                Iterator it2 = f5.u.Z2(f5.s.l(D(m7.b()), i.f16531l), new j()).iterator();
                while (it2.hasNext()) {
                    this.f16505o.put(Integer.valueOf(((g0) it2.next()).r()), m7.c());
                }
                this.f16506p.put(m7.c(), kVar);
            }
        }
        f1();
        return aVar.f17429k;
    }

    @d.l0
    @s4.i
    public final boolean B0(@n6.d String str, boolean z6) {
        u4.l0.p(str, "route");
        return D0(this, str, z6, false, 4, null);
    }

    public final boolean C(List<t> list, Bundle bundle, u0 u0Var, d1.a aVar) {
        t tVar;
        g0 e7;
        ArrayList<List<t>> arrayList = new ArrayList();
        ArrayList<t> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((t) obj).e() instanceof k0)) {
                arrayList2.add(obj);
            }
        }
        for (t tVar2 : arrayList2) {
            List list2 = (List) x3.e0.q3(arrayList);
            if (u4.l0.g((list2 == null || (tVar = (t) x3.e0.k3(list2)) == null || (e7 = tVar.e()) == null) ? null : e7.t(), tVar2.e().t())) {
                list2.add(tVar2);
            } else {
                arrayList.add(x3.w.P(tVar2));
            }
        }
        k1.a aVar2 = new k1.a();
        for (List<t> list3 : arrayList) {
            u0(this.f16515y.f(((t) x3.e0.w2(list3)).e().t()), list3, u0Var, aVar, new k(aVar2, list, new k1.f(), this, bundle));
        }
        return aVar2.f17429k;
    }

    @d.l0
    @s4.i
    public final boolean C0(@n6.d String str, boolean z6, boolean z7) {
        u4.l0.p(str, "route");
        return H0(str, z6, z7) && y();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final g0 D(@d.d0 int i7) {
        g0 g0Var;
        k0 k0Var = this.f16494d;
        if (k0Var == null) {
            return null;
        }
        u4.l0.m(k0Var);
        if (k0Var.r() == i7) {
            return this.f16494d;
        }
        t t6 = this.f16498h.t();
        if (t6 == null || (g0Var = t6.e()) == null) {
            g0Var = this.f16494d;
            u4.l0.m(g0Var);
        }
        return F(g0Var, i7);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final g0 E(@n6.d String str) {
        k0 k0Var;
        k0 u6;
        u4.l0.p(str, "route");
        k0 k0Var2 = this.f16494d;
        if (k0Var2 == null) {
            return null;
        }
        u4.l0.m(k0Var2);
        if (!u4.l0.g(k0Var2.v(), str)) {
            k0 k0Var3 = this.f16494d;
            u4.l0.m(k0Var3);
            if (k0Var3.A(str) == null) {
                t t6 = this.f16498h.t();
                if (t6 == null || (k0Var = t6.e()) == null) {
                    k0Var = this.f16494d;
                    u4.l0.m(k0Var);
                }
                if (k0Var instanceof k0) {
                    u6 = k0Var;
                } else {
                    u6 = k0Var.u();
                    u4.l0.m(u6);
                }
                return u6.U(str);
            }
        }
        return this.f16494d;
    }

    public final void E0(@n6.d t tVar, @n6.d t4.a<m2> aVar) {
        u4.l0.p(tVar, "popUpTo");
        u4.l0.p(aVar, "onComplete");
        int indexOf = this.f16498h.indexOf(tVar);
        if (indexOf < 0) {
            Log.i(J, "Ignoring pop of " + tVar + " as it was not found on the current back stack");
            return;
        }
        int i7 = indexOf + 1;
        if (i7 != this.f16498h.size()) {
            G0(this.f16498h.get(i7).e().r(), true, false);
        }
        L0(this, tVar, false, null, 6, null);
        aVar.n();
        f1();
        y();
    }

    public final g0 F(g0 g0Var, @d.d0 int i7) {
        k0 u6;
        if (g0Var.r() == i7) {
            return g0Var;
        }
        if (g0Var instanceof k0) {
            u6 = (k0) g0Var;
        } else {
            u6 = g0Var.u();
            u4.l0.m(u6);
        }
        return u6.S(i7);
    }

    public final void F0(d1<? extends g0> d1Var, t tVar, boolean z6, t4.l<? super t, m2> lVar) {
        this.B = lVar;
        d1Var.j(tVar, z6);
        this.B = null;
    }

    public final String G(int[] iArr) {
        k0 k0Var;
        k0 k0Var2 = this.f16494d;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            g0 g0Var = null;
            if (i7 >= length) {
                return null;
            }
            int i8 = iArr[i7];
            if (i7 == 0) {
                k0 k0Var3 = this.f16494d;
                u4.l0.m(k0Var3);
                if (k0Var3.r() == i8) {
                    g0Var = this.f16494d;
                }
            } else {
                u4.l0.m(k0Var2);
                g0Var = k0Var2.S(i8);
            }
            if (g0Var == null) {
                return g0.f16312t.b(this.f16491a, i8);
            }
            if (i7 != iArr.length - 1 && (g0Var instanceof k0)) {
                while (true) {
                    k0Var = (k0) g0Var;
                    u4.l0.m(k0Var);
                    if (!(k0Var.S(k0Var.a0()) instanceof k0)) {
                        break;
                    }
                    g0Var = k0Var.S(k0Var.a0());
                }
                k0Var2 = k0Var;
            }
            i7++;
        }
    }

    @d.l0
    public final boolean G0(@d.d0 int i7, boolean z6, boolean z7) {
        g0 g0Var;
        if (this.f16498h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = x3.e0.S4(this.f16498h).iterator();
        while (true) {
            if (!it.hasNext()) {
                g0Var = null;
                break;
            }
            g0Var = ((t) it.next()).e();
            d1 f7 = this.f16515y.f(g0Var.t());
            if (z6 || g0Var.r() != i7) {
                arrayList.add(f7);
            }
            if (g0Var.r() == i7) {
                break;
            }
        }
        if (g0Var == null) {
            Log.i(J, "Ignoring popBackStack to destination " + g0.f16312t.b(this.f16491a, i7) + " as it was not found on the current back stack");
            return false;
        }
        return B(arrayList, g0Var, z6, z7);
    }

    @n6.d
    public t H(@d.d0 int i7) {
        t tVar;
        x3.k<t> kVar = this.f16498h;
        ListIterator<t> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                tVar = null;
                break;
            }
            tVar = listIterator.previous();
            if (tVar.e().r() == i7) {
                break;
            }
        }
        t tVar2 = tVar;
        if (tVar2 != null) {
            return tVar2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i7 + " is on the NavController's back stack. The current destination is " + N()).toString());
    }

    public final boolean H0(String str, boolean z6, boolean z7) {
        t tVar;
        if (this.f16498h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        x3.k<t> kVar = this.f16498h;
        ListIterator<t> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                tVar = null;
                break;
            }
            tVar = listIterator.previous();
            t tVar2 = tVar;
            boolean z8 = tVar2.e().z(str, tVar2.c());
            if (z6 || !z8) {
                arrayList.add(this.f16515y.f(tVar2.e().t()));
            }
            if (z8) {
                break;
            }
        }
        t tVar3 = tVar;
        g0 e7 = tVar3 != null ? tVar3.e() : null;
        if (e7 == null) {
            Log.i(J, "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
            return false;
        }
        return B(arrayList, e7, z6, z7);
    }

    @n6.d
    public final t I(@n6.d String str) {
        t tVar;
        u4.l0.p(str, "route");
        x3.k<t> kVar = this.f16498h;
        ListIterator<t> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                tVar = null;
                break;
            }
            tVar = listIterator.previous();
            t tVar2 = tVar;
            if (tVar2.e().z(str, tVar2.c())) {
                break;
            }
        }
        t tVar3 = tVar;
        if (tVar3 != null) {
            return tVar3;
        }
        throw new IllegalArgumentException(("No destination with route " + str + " is on the NavController's back stack. The current destination is " + N()).toString());
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final Context J() {
        return this.f16491a;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final kotlinx.coroutines.flow.t0<List<t>> K() {
        return this.f16500j;
    }

    public final void K0(t tVar, boolean z6, x3.k<u> kVar) {
        y yVar;
        kotlinx.coroutines.flow.t0<Set<t>> c7;
        Set<t> value;
        t s6 = this.f16498h.s();
        if (!u4.l0.g(s6, tVar)) {
            throw new IllegalStateException(("Attempted to pop " + tVar.e() + ", which is not the top of the back stack (" + s6.e() + ')').toString());
        }
        this.f16498h.y();
        b bVar = this.f16516z.get(S().f(s6.e().t()));
        boolean z7 = true;
        if (!((bVar == null || (c7 = bVar.c()) == null || (value = c7.getValue()) == null || !value.contains(s6)) ? false : true) && !this.f16504n.containsKey(s6)) {
            z7 = false;
        }
        p.b b7 = s6.getLifecycle().b();
        p.b bVar2 = p.b.CREATED;
        if (b7.d(bVar2)) {
            if (z6) {
                s6.l(bVar2);
                kVar.d(new u(s6));
            }
            if (z7) {
                s6.l(bVar2);
            } else {
                s6.l(p.b.DESTROYED);
                d1(s6);
            }
        }
        if (z6 || z7 || (yVar = this.f16509s) == null) {
            return;
        }
        yVar.i(s6.f());
    }

    @n6.e
    public t L() {
        return this.f16498h.t();
    }

    @n6.d
    public final kotlinx.coroutines.flow.i<t> M() {
        return this.H;
    }

    @n6.d
    public final List<t> M0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f16516z.values().iterator();
        while (it.hasNext()) {
            Set<t> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                t tVar = (t) obj;
                if ((arrayList.contains(tVar) || tVar.g().d(p.b.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            x3.b0.o0(arrayList, arrayList2);
        }
        x3.k<t> kVar = this.f16498h;
        ArrayList arrayList3 = new ArrayList();
        for (t tVar2 : kVar) {
            t tVar3 = tVar2;
            if (!arrayList.contains(tVar3) && tVar3.g().d(p.b.STARTED)) {
                arrayList3.add(tVar2);
            }
        }
        x3.b0.o0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if ((!(((t) obj2).e() instanceof k0)) != false) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    @n6.e
    public g0 N() {
        t L2 = L();
        if (L2 != null) {
            return L2.e();
        }
        return null;
    }

    public void N0(@n6.d c cVar) {
        u4.l0.p(cVar, "listener");
        this.f16510t.remove(cVar);
    }

    public final int O() {
        x3.k<t> kVar = this.f16498h;
        int i7 = 0;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<t> it = kVar.iterator();
            while (it.hasNext()) {
                if ((!(it.next().e() instanceof k0)) != false && (i7 = i7 + 1) < 0) {
                    x3.w.V();
                }
            }
        }
        return i7;
    }

    @d.i
    public void O0(@n6.e Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f16491a.getClassLoader());
        this.f16495e = bundle.getBundle(K);
        this.f16496f = bundle.getParcelableArray(M);
        this.f16506p.clear();
        int[] intArray = bundle.getIntArray(N);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(O);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                this.f16505o.put(Integer.valueOf(intArray[i7]), stringArrayList.get(i8));
                i7++;
                i8++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(P);
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(Q + str);
                if (parcelableArray != null) {
                    Map<String, x3.k<u>> map = this.f16506p;
                    u4.l0.o(str, "id");
                    x3.k<u> kVar = new x3.k<>(parcelableArray.length);
                    Iterator a7 = u4.i.a(parcelableArray);
                    while (a7.hasNext()) {
                        Parcelable parcelable = (Parcelable) a7.next();
                        u4.l0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        kVar.add((u) parcelable);
                    }
                    map.put(str, kVar);
                }
            }
        }
        this.f16497g = bundle.getBoolean(U);
    }

    @d.l0
    @n6.d
    public k0 P() {
        k0 k0Var = this.f16494d;
        if (k0Var != null) {
            u4.l0.n(k0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return k0Var;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final boolean P0(int i7, Bundle bundle, u0 u0Var, d1.a aVar) {
        if (this.f16505o.containsKey(Integer.valueOf(i7))) {
            String str = this.f16505o.get(Integer.valueOf(i7));
            x3.b0.D0(this.f16505o.values(), new r(str));
            return C(X((x3.k) u1.k(this.f16506p).remove(str)), bundle, u0Var, aVar);
        }
        return false;
    }

    @n6.d
    public final p.b Q() {
        return this.f16507q == null ? p.b.CREATED : this.f16511u;
    }

    public final boolean Q0(String str) {
        u n7;
        int hashCode = g0.f16312t.a(str).hashCode();
        if (this.f16505o.containsKey(Integer.valueOf(hashCode))) {
            return P0(hashCode, null, null, null);
        }
        g0 E = E(str);
        if (!(E != null)) {
            throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + N()).toString());
        }
        String str2 = this.f16505o.get(Integer.valueOf(E.r()));
        x3.b0.D0(this.f16505o.values(), new s(str2));
        x3.k<u> kVar = (x3.k) u1.k(this.f16506p).remove(str2);
        g0.c A = E.A(str);
        u4.l0.m(A);
        if (A.h((kVar == null || (n7 = kVar.n()) == null) ? null : n7.a())) {
            return C(X(kVar), null, null, null);
        }
        return false;
    }

    @n6.d
    public t0 R() {
        return (t0) this.F.getValue();
    }

    @d.i
    @n6.e
    public Bundle R0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, d1<? extends g0>> entry : this.f16515y.g().entrySet()) {
            String key = entry.getKey();
            Bundle i7 = entry.getValue().i();
            if (i7 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, i7);
            }
        }
        if ((!arrayList.isEmpty()) == true) {
            bundle = new Bundle();
            bundle2.putStringArrayList(L, arrayList);
            bundle.putBundle(K, bundle2);
        } else {
            bundle = null;
        }
        if ((!this.f16498h.isEmpty()) != false) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f16498h.size()];
            Iterator<t> it = this.f16498h.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                parcelableArr[i8] = new u(it.next());
                i8++;
            }
            bundle.putParcelableArray(M, parcelableArr);
        }
        if ((!this.f16505o.isEmpty()) != false) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f16505o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i9 = 0;
            for (Map.Entry<Integer, String> entry2 : this.f16505o.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i9] = intValue;
                arrayList2.add(value);
                i9++;
            }
            bundle.putIntArray(N, iArr);
            bundle.putStringArrayList(O, arrayList2);
        }
        if ((!this.f16506p.isEmpty()) != false) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, x3.k<u>> entry3 : this.f16506p.entrySet()) {
                String key2 = entry3.getKey();
                x3.k<u> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i10 = 0;
                for (u uVar : value2) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        x3.w.W();
                    }
                    parcelableArr2[i10] = uVar;
                    i10 = i11;
                }
                bundle.putParcelableArray(Q + key2, parcelableArr2);
            }
            bundle.putStringArrayList(P, arrayList3);
        }
        if (this.f16497g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(U, this.f16497g);
        }
        return bundle;
    }

    @n6.d
    public e1 S() {
        return this.f16515y;
    }

    @d.i
    @d.l0
    public void S0(@d.n0 int i7) {
        V0(R().b(i7), null);
    }

    @n6.e
    public t T() {
        Object obj;
        Iterator it = x3.e0.S4(this.f16498h).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = f5.s.e(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if ((!(((t) obj).e() instanceof k0)) != false) {
                break;
            }
        }
        return (t) obj;
    }

    @d.i
    @d.l0
    public void T0(@d.n0 int i7, @n6.e Bundle bundle) {
        V0(R().b(i7), bundle);
    }

    @n6.d
    public androidx.lifecycle.f1 U(@d.d0 int i7) {
        if (this.f16509s != null) {
            t H = H(i7);
            if (H.e() instanceof k0) {
                return H;
            }
            throw new IllegalArgumentException(("No NavGraph with ID " + i7 + " is on the NavController's back stack").toString());
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
    }

    @d.i
    @d.l0
    public void U0(@n6.d k0 k0Var) {
        u4.l0.p(k0Var, "graph");
        V0(k0Var, null);
    }

    @n6.d
    public final kotlinx.coroutines.flow.t0<List<t>> V() {
        return this.f16502l;
    }

    @d.i
    @d.l0
    public void V0(@n6.d k0 k0Var, @n6.e Bundle bundle) {
        u4.l0.p(k0Var, "graph");
        if (!u4.l0.g(this.f16494d, k0Var)) {
            k0 k0Var2 = this.f16494d;
            if (k0Var2 != null) {
                for (Integer num : new ArrayList(this.f16505o.keySet())) {
                    u4.l0.o(num, "id");
                    v(num.intValue());
                }
                J0(this, k0Var2.r(), true, false, 4, null);
            }
            this.f16494d = k0Var;
            x0(bundle);
            return;
        }
        int E = k0Var.X().E();
        for (int i7 = 0; i7 < E; i7++) {
            g0 F = k0Var.X().F(i7);
            k0 k0Var3 = this.f16494d;
            u4.l0.m(k0Var3);
            int t6 = k0Var3.X().t(i7);
            k0 k0Var4 = this.f16494d;
            u4.l0.m(k0Var4);
            k0Var4.X().B(t6, F);
        }
        for (t tVar : this.f16498h) {
            List<g0> W0 = x3.c0.W0(f5.u.c3(g0.f16312t.c(tVar.e())));
            g0 g0Var = this.f16494d;
            u4.l0.m(g0Var);
            for (g0 g0Var2 : W0) {
                if (!u4.l0.g(g0Var2, this.f16494d) || !u4.l0.g(g0Var, k0Var)) {
                    if (g0Var instanceof k0) {
                        g0Var = ((k0) g0Var).S(g0Var2.r());
                        u4.l0.m(g0Var);
                    }
                }
            }
            tVar.k(g0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        if ((r0.length == 0) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    @d.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean W(@n6.e android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.w.W(android.content.Intent):boolean");
    }

    public final void W0(@n6.d p.b bVar) {
        u4.l0.p(bVar, "<set-?>");
        this.f16511u = bVar;
    }

    public final List<t> X(x3.k<u> kVar) {
        g0 P2;
        ArrayList arrayList = new ArrayList();
        t t6 = this.f16498h.t();
        if (t6 == null || (P2 = t6.e()) == null) {
            P2 = P();
        }
        if (kVar != null) {
            for (u uVar : kVar) {
                g0 F = F(P2, uVar.b());
                if (F == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + g0.f16312t.b(this.f16491a, uVar.b()) + " cannot be found from the current destination " + P2).toString());
                }
                arrayList.add(uVar.f(this.f16491a, F, Q(), this.f16509s));
                P2 = F;
            }
        }
        return arrayList;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public void X0(@n6.d androidx.lifecycle.z zVar) {
        androidx.lifecycle.p lifecycle;
        u4.l0.p(zVar, "owner");
        if (u4.l0.g(zVar, this.f16507q)) {
            return;
        }
        androidx.lifecycle.z zVar2 = this.f16507q;
        if (zVar2 != null && (lifecycle = zVar2.getLifecycle()) != null) {
            lifecycle.d(this.f16512v);
        }
        this.f16507q = zVar;
        zVar.getLifecycle().a(this.f16512v);
    }

    public final boolean Y(g0 g0Var, Bundle bundle) {
        int i7;
        g0 e7;
        t L2 = L();
        if ((L2 == null || (e7 = L2.e()) == null || (g0Var instanceof k0 ? k0.f16370z.a((k0) g0Var).r() : g0Var.r()) != e7.r()) ? false : true) {
            x3.k<t> kVar = new x3.k();
            x3.k<t> kVar2 = this.f16498h;
            ListIterator<t> listIterator = kVar2.listIterator(kVar2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i7 = -1;
                    break;
                }
                if (listIterator.previous().e() == g0Var) {
                    i7 = listIterator.nextIndex();
                    break;
                }
            }
            while (x3.w.G(this.f16498h) >= i7) {
                t y6 = this.f16498h.y();
                d1(y6);
                kVar.d(new t(y6, y6.e().g(bundle)));
            }
            for (t tVar : kVar) {
                k0 u6 = tVar.e().u();
                if (u6 != null) {
                    a0(tVar, H(u6.r()));
                }
                this.f16498h.add(tVar);
            }
            for (t tVar2 : kVar) {
                this.f16515y.f(tVar2.e().t()).g(tVar2);
            }
            return true;
        }
        return false;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public void Y0(@n6.d e1 e1Var) {
        u4.l0.p(e1Var, "navigatorProvider");
        if (!this.f16498h.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
        }
        this.f16515y = e1Var;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public void Z0(@n6.d OnBackPressedDispatcher onBackPressedDispatcher) {
        u4.l0.p(onBackPressedDispatcher, "dispatcher");
        if (u4.l0.g(onBackPressedDispatcher, this.f16508r)) {
            return;
        }
        androidx.lifecycle.z zVar = this.f16507q;
        if (zVar == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
        this.f16513w.g();
        this.f16508r = onBackPressedDispatcher;
        onBackPressedDispatcher.c(zVar, this.f16513w);
        androidx.lifecycle.p lifecycle = zVar.getLifecycle();
        lifecycle.d(this.f16512v);
        lifecycle.a(this.f16512v);
    }

    public final void a0(t tVar, t tVar2) {
        this.f16503m.put(tVar, tVar2);
        if (this.f16504n.get(tVar2) == null) {
            this.f16504n.put(tVar2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f16504n.get(tVar2);
        u4.l0.m(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public void a1(@n6.d androidx.lifecycle.e1 e1Var) {
        u4.l0.p(e1Var, "viewModelStore");
        y yVar = this.f16509s;
        y.b bVar = y.f16552e;
        if (u4.l0.g(yVar, bVar.a(e1Var))) {
            return;
        }
        if (!this.f16498h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        this.f16509s = bVar.a(e1Var);
    }

    @d.l0
    public void b0(@d.d0 int i7) {
        c0(i7, null);
    }

    public final boolean b1() {
        int i7 = 0;
        if (this.f16497g) {
            Activity activity = this.f16492b;
            u4.l0.m(activity);
            Intent intent = activity.getIntent();
            Bundle extras = intent.getExtras();
            u4.l0.m(extras);
            int[] intArray = extras.getIntArray(R);
            u4.l0.m(intArray);
            List<Integer> sz = x3.p.sz(intArray);
            ArrayList parcelableArrayList = extras.getParcelableArrayList(S);
            int intValue = ((Number) x3.b0.L0(sz)).intValue();
            if (parcelableArrayList != null) {
                Bundle bundle = (Bundle) x3.b0.L0(parcelableArrayList);
            }
            if (sz.isEmpty()) {
                return false;
            }
            g0 F = F(P(), intValue);
            if (F instanceof k0) {
                intValue = k0.f16370z.a((k0) F).r();
            }
            g0 N2 = N();
            if (N2 != null && intValue == N2.r()) {
                a0 x6 = x();
                Bundle b7 = z0.i.b(q1.a(V, intent));
                Bundle bundle2 = extras.getBundle(T);
                if (bundle2 != null) {
                    b7.putAll(bundle2);
                }
                x6.k(b7);
                for (Object obj : sz) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        x3.w.W();
                    }
                    x6.b(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i7) : null);
                    i7 = i8;
                }
                x6.h().o();
                Activity activity2 = this.f16492b;
                if (activity2 != null) {
                    activity2.finish();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @d.l0
    public void c0(@d.d0 int i7, @n6.e Bundle bundle) {
        d0(i7, bundle, null);
    }

    public final boolean c1() {
        g0 N2 = N();
        u4.l0.m(N2);
        int r6 = N2.r();
        for (k0 u6 = N2.u(); u6 != null; u6 = u6.u()) {
            if (u6.a0() != r6) {
                Bundle bundle = new Bundle();
                Activity activity = this.f16492b;
                if (activity != null) {
                    u4.l0.m(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f16492b;
                        u4.l0.m(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f16492b;
                            u4.l0.m(activity3);
                            bundle.putParcelable(V, activity3.getIntent());
                            k0 k0Var = this.f16494d;
                            u4.l0.m(k0Var);
                            Activity activity4 = this.f16492b;
                            u4.l0.m(activity4);
                            Intent intent = activity4.getIntent();
                            u4.l0.o(intent, "activity!!.intent");
                            g0.c B = k0Var.B(new e0(intent));
                            if ((B != null ? B.e() : null) != null) {
                                bundle.putAll(B.d().g(B.e()));
                            }
                        }
                    }
                }
                a0.r(new a0(this), u6.r(), null, 2, null).k(bundle).h().o();
                Activity activity5 = this.f16492b;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            r6 = u6.r();
        }
        return false;
    }

    @d.l0
    public void d0(@d.d0 int i7, @n6.e Bundle bundle, @n6.e u0 u0Var) {
        e0(i7, bundle, u0Var, null);
    }

    @n6.e
    public final t d1(@n6.d t tVar) {
        u4.l0.p(tVar, "child");
        t remove = this.f16503m.remove(tVar);
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f16504n.get(remove);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            b bVar = this.f16516z.get(this.f16515y.f(remove.e().t()));
            if (bVar != null) {
                bVar.e(remove);
            }
            this.f16504n.remove(remove);
        }
        return remove;
    }

    @d.l0
    public void e0(@d.d0 int i7, @n6.e Bundle bundle, @n6.e u0 u0Var, @n6.e d1.a aVar) {
        int i8;
        g0 e7 = this.f16498h.isEmpty() ? this.f16494d : this.f16498h.s().e();
        if (e7 == null) {
            throw new IllegalStateException("no current navigation node");
        }
        s2.l m7 = e7.m(i7);
        Bundle bundle2 = null;
        if (m7 != null) {
            if (u0Var == null) {
                u0Var = m7.c();
            }
            i8 = m7.b();
            Bundle a7 = m7.a();
            if (a7 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(a7);
            }
        } else {
            i8 = i7;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i8 == 0 && u0Var != null && u0Var.f() != -1) {
            z0(u0Var.f(), u0Var.h());
            return;
        }
        if (!(i8 != 0)) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        g0 D = D(i8);
        if (D != null) {
            p0(D, bundle2, u0Var, aVar);
            return;
        }
        g0.b bVar = g0.f16312t;
        String b7 = bVar.b(this.f16491a, i8);
        if (m7 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + b7 + " cannot be found from the current destination " + e7);
        }
        throw new IllegalArgumentException(("Navigation destination " + b7 + " referenced from action " + bVar.b(this.f16491a, i7) + " cannot be found from the current destination " + e7).toString());
    }

    public final void e1() {
        g0 g0Var;
        kotlinx.coroutines.flow.t0<Set<t>> c7;
        Set<t> value;
        List<t> T5 = x3.e0.T5(this.f16498h);
        if (T5.isEmpty()) {
            return;
        }
        g0 e7 = ((t) x3.e0.k3(T5)).e();
        if (e7 instanceof s2.i) {
            Iterator it = x3.e0.S4(T5).iterator();
            while (it.hasNext()) {
                g0Var = ((t) it.next()).e();
                if (!(g0Var instanceof k0) && !(g0Var instanceof s2.i)) {
                    break;
                }
            }
        }
        g0Var = null;
        HashMap hashMap = new HashMap();
        for (t tVar : x3.e0.S4(T5)) {
            p.b g7 = tVar.g();
            g0 e8 = tVar.e();
            if (e7 != null && e8.r() == e7.r()) {
                p.b bVar = p.b.RESUMED;
                if (g7 != bVar) {
                    b bVar2 = this.f16516z.get(S().f(tVar.e().t()));
                    if (!u4.l0.g((bVar2 == null || (c7 = bVar2.c()) == null || (value = c7.getValue()) == null) ? null : Boolean.valueOf(value.contains(tVar)), Boolean.TRUE)) {
                        AtomicInteger atomicInteger = this.f16504n.get(tVar);
                        boolean z6 = false;
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z6 = true;
                        }
                        if (!z6) {
                            hashMap.put(tVar, bVar);
                        }
                    }
                    hashMap.put(tVar, p.b.STARTED);
                }
                e7 = e7.u();
            } else if (g0Var == null || e8.r() != g0Var.r()) {
                tVar.l(p.b.CREATED);
            } else {
                if (g7 == p.b.RESUMED) {
                    tVar.l(p.b.STARTED);
                } else {
                    p.b bVar3 = p.b.STARTED;
                    if (g7 != bVar3) {
                        hashMap.put(tVar, bVar3);
                    }
                }
                g0Var = g0Var.u();
            }
        }
        for (t tVar2 : T5) {
            p.b bVar4 = (p.b) hashMap.get(tVar2);
            if (bVar4 != null) {
                tVar2.l(bVar4);
            } else {
                tVar2.m();
            }
        }
    }

    @d.l0
    public void f0(@n6.d Uri uri) {
        u4.l0.p(uri, t0.f16449e);
        m0(new e0(uri, null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (O() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f1() {
        /*
            r3 = this;
            androidx.activity.k r0 = r3.f16513w
            boolean r1 = r3.f16514x
            if (r1 == 0) goto Le
            int r1 = r3.O()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.w.f1():void");
    }

    @d.l0
    public void g0(@n6.d Uri uri, @n6.e u0 u0Var) {
        u4.l0.p(uri, t0.f16449e);
        o0(new e0(uri, null, null), u0Var, null);
    }

    @d.l0
    public void h0(@n6.d Uri uri, @n6.e u0 u0Var, @n6.e d1.a aVar) {
        u4.l0.p(uri, t0.f16449e);
        o0(new e0(uri, null, null), u0Var, aVar);
    }

    @d.l0
    @s4.i
    public final void i0(@n6.d String str) {
        u4.l0.p(str, "route");
        t0(this, str, null, null, 6, null);
    }

    @d.l0
    @s4.i
    public final void j0(@n6.d String str, @n6.e u0 u0Var) {
        u4.l0.p(str, "route");
        t0(this, str, u0Var, null, 4, null);
    }

    @d.l0
    @s4.i
    public final void k0(@n6.d String str, @n6.e u0 u0Var, @n6.e d1.a aVar) {
        u4.l0.p(str, "route");
        e0.a.C0242a c0242a = e0.a.f16305d;
        Uri parse = Uri.parse(g0.f16312t.a(str));
        u4.l0.h(parse, "Uri.parse(this)");
        o0(c0242a.c(parse).a(), u0Var, aVar);
    }

    @d.l0
    public final void l0(@n6.d String str, @n6.d t4.l<? super v0, m2> lVar) {
        u4.l0.p(str, "route");
        u4.l0.p(lVar, "builder");
        t0(this, str, w0.a(lVar), null, 4, null);
    }

    @d.l0
    public void m0(@n6.d e0 e0Var) {
        u4.l0.p(e0Var, "request");
        n0(e0Var, null);
    }

    @d.l0
    public void n0(@n6.d e0 e0Var, @n6.e u0 u0Var) {
        u4.l0.p(e0Var, "request");
        o0(e0Var, u0Var, null);
    }

    @d.l0
    public void o0(@n6.d e0 e0Var, @n6.e u0 u0Var, @n6.e d1.a aVar) {
        u4.l0.p(e0Var, "request");
        k0 k0Var = this.f16494d;
        u4.l0.m(k0Var);
        g0.c B = k0Var.B(e0Var);
        if (B == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + e0Var + " cannot be found in the navigation graph " + this.f16494d);
        }
        Bundle g7 = B.d().g(B.e());
        if (g7 == null) {
            g7 = new Bundle();
        }
        g0 d7 = B.d();
        Intent intent = new Intent();
        intent.setDataAndType(e0Var.c(), e0Var.b());
        intent.setAction(e0Var.a());
        g7.putParcelable(V, intent);
        p0(d7, g7, u0Var, aVar);
    }

    @d.l0
    public final void p0(g0 g0Var, Bundle bundle, u0 u0Var, d1.a aVar) {
        boolean z6;
        Iterator<T> it = this.f16516z.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        k1.a aVar2 = new k1.a();
        boolean G0 = (u0Var == null || u0Var.f() == -1) ? false : G0(u0Var.f(), u0Var.h(), u0Var.j());
        Bundle g7 = g0Var.g(bundle);
        if ((u0Var != null && u0Var.k()) && this.f16505o.containsKey(Integer.valueOf(g0Var.r()))) {
            aVar2.f17429k = P0(g0Var.r(), g7, u0Var, aVar);
            z6 = false;
        } else {
            z6 = (u0Var != null && u0Var.i()) && Y(g0Var, bundle);
            if (!z6) {
                u0(this.f16515y.f(g0Var.t()), x3.v.k(t.a.b(t.f16429p, this.f16491a, g0Var, g7, Q(), this.f16509s, null, null, 96, null)), u0Var, aVar, new n(aVar2, this, g0Var, g7));
            }
        }
        f1();
        Iterator<T> it2 = this.f16516z.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        if (G0 || aVar2.f17429k || z6) {
            y();
        } else {
            e1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0283, code lost:
        if (r2 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0285, code lost:
        r2.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ae, code lost:
        throw new java.lang.IllegalStateException(("NavigatorBackStack for " + r33.t() + " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02af, code lost:
        r32.f16498h.addAll(r11);
        r32.f16498h.add(r8);
        r0 = x3.e0.A4(r11, r8).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c5, code lost:
        if (r0.hasNext() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c7, code lost:
        r1 = (s2.t) r0.next();
        r2 = r1.e().u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d5, code lost:
        if (r2 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d7, code lost:
        a0(r1, H(r2.r()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r5 = new x3.k();
        r4 = true;
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        if ((r33 instanceof s2.k0) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        u4.l0.m(r0);
        r3 = r0.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r0.hasPrevious() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        r1 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        if (u4.l0.g(r1.e(), r3) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        r20 = r12;
        r0 = r13;
        r2 = r15;
        r8 = r14;
        r1 = s2.t.a.b(s2.t.f16429p, r32.f16491a, r3, r34, Q(), r32.f16509s, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
        r20 = r12;
        r0 = r13;
        r8 = r14;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
        r5.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
        if ((r32.f16498h.isEmpty() ^ r4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        if (r32.f16498h.s().e() != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
        r13 = r0;
        r14 = r2;
        r9 = r3;
        r10 = r4;
        r11 = r5;
        L0(r32, r32.f16498h.s(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
        r13 = r0;
        r14 = r2;
        r9 = r3;
        r10 = r4;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
        r9 = r3;
        r10 = r4;
        r11 = r5;
        r20 = r12;
        r8 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
        if (r9 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
        if (r9 != r33) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
        r0 = r9;
        r4 = r10;
        r5 = r11;
        r15 = r14;
        r12 = r20;
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
        r10 = true;
        r11 = r5;
        r20 = r12;
        r8 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
        if (r11.isEmpty() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
        if ((r12 instanceof s2.i) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0112, code lost:
        r12 = ((s2.t) r11.m()).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
        if (r12 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:
        if (D(r12.r()) == r12) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
        r12 = r12.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
        if (r12 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
        if (r14 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        if (r34.isEmpty() != r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
        if (r4 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
        if (r0.hasPrevious() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
        r1 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r32.f16498h.isEmpty() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
        if (u4.l0.g(r1.e(), r12) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
        r1 = s2.t.a.b(s2.t.f16429p, r32.f16491a, r12, r12.g(r15), Q(), r32.f16509s, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
        r11.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018e, code lost:
        if (r11.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0193, code lost:
        r12 = ((s2.t) r11.m()).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a3, code lost:
        if (r32.f16498h.isEmpty() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b3, code lost:
        if ((r32.f16498h.s().e() instanceof s2.k0) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b5, code lost:
        r0 = r32.f16498h.s().e();
        u4.l0.n(r0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d0, code lost:
        if (((s2.k0) r0).T(r12.r(), false) != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d2, code lost:
        L0(r32, r32.f16498h.s(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e5, code lost:
        r0 = r32.f16498h.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ed, code lost:
        if (r0 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        if ((r32.f16498h.s().e() instanceof s2.i) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ef, code lost:
        r0 = (s2.t) r11.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f5, code lost:
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f7, code lost:
        r0 = r0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fc, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0204, code lost:
        if (u4.l0.g(r0, r32.f16494d) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0206, code lost:
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0212, code lost:
        if (r0.hasPrevious() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0214, code lost:
        r1 = r0.previous();
        r2 = r1.e();
        r3 = r32.f16494d;
        u4.l0.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0228, code lost:
        if (u4.l0.g(r2, r3) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022a, code lost:
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022c, code lost:
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022e, code lost:
        if (r18 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0230, code lost:
        r19 = s2.t.f16429p;
        r0 = r32.f16491a;
        r1 = r32.f16494d;
        u4.l0.m(r1);
        r2 = r32.f16494d;
        u4.l0.m(r2);
        r18 = s2.t.a.b(r19, r0, r1, r2.g(r14), Q(), r32.f16509s, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025a, code lost:
        r11.d(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025f, code lost:
        r0 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0267, code lost:
        if (r0.hasNext() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
        r1 = (s2.t) r0.next();
        r2 = r32.f16516z.get(r32.f16515y.f(r1.e().t()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (J0(r32, r32.f16498h.s().e().r(), true, false, 4, null) != false) goto L114;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(s2.g0 r33, android.os.Bundle r34, s2.t r35, java.util.List<s2.t> r36) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.w.q(s2.g0, android.os.Bundle, s2.t, java.util.List):void");
    }

    @d.l0
    public void q0(@n6.d j0 j0Var) {
        u4.l0.p(j0Var, "directions");
        d0(j0Var.a(), j0Var.f(), null);
    }

    @d.l0
    public void r0(@n6.d j0 j0Var, @n6.e u0 u0Var) {
        u4.l0.p(j0Var, "directions");
        d0(j0Var.a(), j0Var.f(), u0Var);
    }

    public void s(@n6.d c cVar) {
        u4.l0.p(cVar, "listener");
        this.f16510t.add(cVar);
        if ((!this.f16498h.isEmpty()) == true) {
            t s6 = this.f16498h.s();
            cVar.a(this, s6.e(), s6.c());
        }
    }

    @d.l0
    public void s0(@n6.d j0 j0Var, @n6.d d1.a aVar) {
        u4.l0.p(j0Var, "directions");
        u4.l0.p(aVar, "navigatorExtras");
        e0(j0Var.a(), j0Var.f(), null, aVar);
    }

    @d.l0
    public final boolean t(@d.d0 int i7) {
        return v(i7) && y();
    }

    @d.l0
    public final boolean u(@n6.d String str) {
        u4.l0.p(str, "route");
        return w(str) && y();
    }

    public final void u0(d1<? extends g0> d1Var, List<t> list, u0 u0Var, d1.a aVar, t4.l<? super t, m2> lVar) {
        this.A = lVar;
        d1Var.e(list, u0Var, aVar);
        this.A = null;
    }

    @d.l0
    public final boolean v(@d.d0 int i7) {
        Iterator<T> it = this.f16516z.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        boolean P0 = P0(i7, null, w0.a(e.f16523l), null);
        Iterator<T> it2 = this.f16516z.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        return P0 && G0(i7, true, false);
    }

    @d.l0
    public final boolean w(String str) {
        Iterator<T> it = this.f16516z.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        boolean Q0 = Q0(str);
        Iterator<T> it2 = this.f16516z.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        return Q0 && H0(str, true, false);
    }

    @d.l0
    public boolean w0() {
        Intent intent;
        if (O() == 1) {
            Activity activity = this.f16492b;
            Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
            return (extras != null ? extras.getIntArray(R) : null) != null ? b1() : c1();
        }
        return y0();
    }

    @n6.d
    public a0 x() {
        return new a0(this);
    }

    @d.l0
    public final void x0(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f16495e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(L)) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                e1 e1Var = this.f16515y;
                u4.l0.o(next, "name");
                d1 f7 = e1Var.f(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    f7.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f16496f;
        boolean z6 = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                u4.l0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                u uVar = (u) parcelable;
                g0 D = D(uVar.b());
                if (D == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + g0.f16312t.b(this.f16491a, uVar.b()) + " cannot be found from the current destination " + N());
                }
                t f8 = uVar.f(this.f16491a, D, Q(), this.f16509s);
                d1<? extends g0> f9 = this.f16515y.f(D.t());
                Map<d1<? extends g0>, b> map = this.f16516z;
                b bVar = map.get(f9);
                if (bVar == null) {
                    bVar = new b(this, f9);
                    map.put(f9, bVar);
                }
                this.f16498h.add(f8);
                bVar.o(f8);
                k0 u6 = f8.e().u();
                if (u6 != null) {
                    a0(f8, H(u6.r()));
                }
            }
            f1();
            this.f16496f = null;
        }
        Collection<d1<? extends g0>> values = this.f16515y.g().values();
        ArrayList<d1<? extends g0>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((d1) obj).c()) {
                arrayList.add(obj);
            }
        }
        for (d1<? extends g0> d1Var : arrayList) {
            Map<d1<? extends g0>, b> map2 = this.f16516z;
            b bVar2 = map2.get(d1Var);
            if (bVar2 == null) {
                bVar2 = new b(this, d1Var);
                map2.put(d1Var, bVar2);
            }
            d1Var.f(bVar2);
        }
        if (this.f16494d == null || !this.f16498h.isEmpty()) {
            y();
            return;
        }
        if (!this.f16497g && (activity = this.f16492b) != null) {
            u4.l0.m(activity);
            if (W(activity.getIntent())) {
                z6 = true;
            }
        }
        if (z6) {
            return;
        }
        k0 k0Var = this.f16494d;
        u4.l0.m(k0Var);
        p0(k0Var, bundle, null, null);
    }

    public final boolean y() {
        while (!this.f16498h.isEmpty() && (this.f16498h.s().e() instanceof k0)) {
            L0(this, this.f16498h.s(), false, null, 6, null);
        }
        t t6 = this.f16498h.t();
        if (t6 != null) {
            this.E.add(t6);
        }
        this.D++;
        e1();
        int i7 = this.D - 1;
        this.D = i7;
        if (i7 == 0) {
            List<t> T5 = x3.e0.T5(this.E);
            this.E.clear();
            for (t tVar : T5) {
                Iterator<c> it = this.f16510t.iterator();
                while (it.hasNext()) {
                    it.next().a(this, tVar.e(), tVar.c());
                }
                this.G.k(tVar);
            }
            this.f16499i.k(x3.e0.T5(this.f16498h));
            this.f16501k.k(M0());
        }
        return t6 != null;
    }

    @d.l0
    public boolean y0() {
        if (this.f16498h.isEmpty()) {
            return false;
        }
        g0 N2 = N();
        u4.l0.m(N2);
        return z0(N2.r(), true);
    }

    @d.l0
    public boolean z0(@d.d0 int i7, boolean z6) {
        return A0(i7, z6, false);
    }
}
