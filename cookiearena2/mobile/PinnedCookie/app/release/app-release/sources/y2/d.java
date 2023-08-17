package y2;

import android.annotation.SuppressLint;
import android.view.Menu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import s2.g0;
import s2.k0;
import u4.l0;
import u4.r1;
import u4.w;
@r1({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,307:1\n1229#2,2:308\n*S KotlinDebug\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n*L\n100#1:308,2\n*E\n"})
/* loaded from: classes.dex */
public final class d {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Set<Integer> f18763a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final androidx.customview.widget.c f18764b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final b f18765c;

    /* loaded from: classes.dex */
    public interface b {
        boolean b();
    }

    public /* synthetic */ d(Set set, androidx.customview.widget.c cVar, b bVar, w wVar) {
        this(set, cVar, bVar);
    }

    @v3.k(message = "Use {@link #getOpenableLayout()}.")
    @n6.e
    public final s1.a a() {
        androidx.customview.widget.c cVar = this.f18764b;
        if (cVar instanceof s1.a) {
            return (s1.a) cVar;
        }
        return null;
    }

    @n6.e
    public final b b() {
        return this.f18765c;
    }

    @n6.e
    public final androidx.customview.widget.c c() {
        return this.f18764b;
    }

    @n6.d
    public final Set<Integer> d() {
        return this.f18763a;
    }

    public final boolean e(@n6.d g0 g0Var) {
        boolean z6;
        l0.p(g0Var, "destination");
        Iterator<g0> it = g0.f16312t.c(g0Var).iterator();
        do {
            z6 = false;
            if (!it.hasNext()) {
                return false;
            }
            g0 next = it.next();
            if (this.f18763a.contains(Integer.valueOf(next.r())) && (!(next instanceof k0) || g0Var.r() == k0.f16370z.a((k0) next).r())) {
                z6 = true;
            }
        } while (!z6);
        return true;
    }

    public d(Set<Integer> set, androidx.customview.widget.c cVar, b bVar) {
        this.f18763a = set;
        this.f18764b = cVar;
        this.f18765c = bVar;
    }

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final Set<Integer> f18766a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public androidx.customview.widget.c f18767b;
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public b f18768c;

        public a(@n6.d k0 k0Var) {
            l0.p(k0Var, "navGraph");
            HashSet hashSet = new HashSet();
            this.f18766a = hashSet;
            hashSet.add(Integer.valueOf(k0.f16370z.a(k0Var).r()));
        }

        @n6.d
        @SuppressLint({"SyntheticAccessor"})
        public final d a() {
            return new d(this.f18766a, this.f18767b, this.f18768c, null);
        }

        @n6.d
        @v3.k(message = "Use {@link #setOpenableLayout(Openable)}.")
        public final a b(@n6.e s1.a aVar) {
            this.f18767b = aVar;
            return this;
        }

        @n6.d
        public final a c(@n6.e b bVar) {
            this.f18768c = bVar;
            return this;
        }

        @n6.d
        public final a d(@n6.e androidx.customview.widget.c cVar) {
            this.f18767b = cVar;
            return this;
        }

        public a(@n6.d Menu menu) {
            l0.p(menu, "topLevelMenu");
            this.f18766a = new HashSet();
            int size = menu.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f18766a.add(Integer.valueOf(menu.getItem(i7).getItemId()));
            }
        }

        public a(@n6.d int... iArr) {
            l0.p(iArr, "topLevelDestinationIds");
            this.f18766a = new HashSet();
            for (int i7 : iArr) {
                this.f18766a.add(Integer.valueOf(i7));
            }
        }

        public a(@n6.d Set<Integer> set) {
            l0.p(set, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.f18766a = hashSet;
            hashSet.addAll(set);
        }
    }
}
