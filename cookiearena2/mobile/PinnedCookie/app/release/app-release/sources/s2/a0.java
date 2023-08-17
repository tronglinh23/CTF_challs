package s2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import i0.x3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import s2.d1;
/* loaded from: classes.dex */
public final class a0 {
    @n6.d

    /* renamed from: a */
    public final Context f16253a;
    @n6.d

    /* renamed from: b */
    public final Intent f16254b;
    @n6.e

    /* renamed from: c */
    public k0 f16255c;
    @n6.d

    /* renamed from: d */
    public final List<a> f16256d;
    @n6.e

    /* renamed from: e */
    public Bundle f16257e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f16258a;
        @n6.e

        /* renamed from: b */
        public final Bundle f16259b;

        public a(int i7, @n6.e Bundle bundle) {
            this.f16258a = i7;
            this.f16259b = bundle;
        }

        @n6.e
        public final Bundle a() {
            return this.f16259b;
        }

        public final int b() {
            return this.f16258a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e1 {
        @n6.d

        /* renamed from: d */
        public final d1<g0> f16260d = new a();

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"s2/a0$b$a", "Ls2/d1;", "Ls2/g0;", "a", "destination", "Landroid/os/Bundle;", "args", "Ls2/u0;", "navOptions", "Ls2/d1$a;", "navigatorExtras", androidx.appcompat.widget.d.f1513o, "", "k", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class a extends d1<g0> {
            @Override // s2.d1
            @n6.d
            public g0 a() {
                return new g0("permissive");
            }

            @Override // s2.d1
            @n6.e
            public g0 d(@n6.d g0 g0Var, @n6.e Bundle bundle, @n6.e u0 u0Var, @n6.e d1.a aVar) {
                u4.l0.p(g0Var, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // s2.d1
            public boolean k() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public b() {
            c(new o0(this));
        }

        @Override // s2.e1
        @n6.d
        public <T extends d1<? extends g0>> T f(@n6.d String str) {
            u4.l0.p(str, "name");
            try {
                return (T) super.f(str);
            } catch (IllegalStateException unused) {
                d1<g0> d1Var = this.f16260d;
                u4.l0.n(d1Var, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return d1Var;
            }
        }
    }

    public a0(@n6.d Context context) {
        Intent launchIntentForPackage;
        u4.l0.p(context, "context");
        this.f16253a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f16254b = launchIntentForPackage;
        this.f16256d = new ArrayList();
    }

    public static /* synthetic */ a0 e(a0 a0Var, int i7, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return a0Var.b(i7, bundle);
    }

    public static /* synthetic */ a0 f(a0 a0Var, String str, Bundle bundle, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            bundle = null;
        }
        return a0Var.d(str, bundle);
    }

    public static /* synthetic */ a0 r(a0 a0Var, int i7, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return a0Var.o(i7, bundle);
    }

    public static /* synthetic */ a0 s(a0 a0Var, String str, Bundle bundle, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            bundle = null;
        }
        return a0Var.q(str, bundle);
    }

    @n6.d
    @s4.i
    public final a0 a(@d.d0 int i7) {
        return e(this, i7, null, 2, null);
    }

    @n6.d
    @s4.i
    public final a0 b(@d.d0 int i7, @n6.e Bundle bundle) {
        this.f16256d.add(new a(i7, bundle));
        if (this.f16255c != null) {
            v();
        }
        return this;
    }

    @n6.d
    @s4.i
    public final a0 c(@n6.d String str) {
        u4.l0.p(str, "route");
        return f(this, str, null, 2, null);
    }

    @n6.d
    @s4.i
    public final a0 d(@n6.d String str, @n6.e Bundle bundle) {
        u4.l0.p(str, "route");
        this.f16256d.add(new a(g0.f16312t.a(str).hashCode(), bundle));
        if (this.f16255c != null) {
            v();
        }
        return this;
    }

    @n6.d
    public final PendingIntent g() {
        int i7;
        Bundle bundle = this.f16257e;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            i7 = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i7 = (i7 * 31) + (obj != null ? obj.hashCode() : 0);
            }
        } else {
            i7 = 0;
        }
        for (a aVar : this.f16256d) {
            i7 = (i7 * 31) + aVar.b();
            Bundle a7 = aVar.a();
            if (a7 != null) {
                Iterator<String> it2 = a7.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = a7.get(it2.next());
                    i7 = (i7 * 31) + (obj2 != null ? obj2.hashCode() : 0);
                }
            }
        }
        PendingIntent m7 = h().m(i7, 201326592);
        u4.l0.m(m7);
        return m7;
    }

    @n6.d
    public final x3 h() {
        if (this.f16255c != null) {
            if ((!this.f16256d.isEmpty()) == true) {
                i();
                x3 b7 = x3.g(this.f16253a).b(new Intent(this.f16254b));
                u4.l0.o(b7, "create(context)\n        …rentStack(Intent(intent))");
                int k7 = b7.k();
                for (int i7 = 0; i7 < k7; i7++) {
                    Intent h7 = b7.h(i7);
                    if (h7 != null) {
                        h7.putExtra(w.V, this.f16254b);
                    }
                }
                return b7;
            }
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        g0 g0Var = null;
        for (a aVar : this.f16256d) {
            int b7 = aVar.b();
            Bundle a7 = aVar.a();
            g0 j7 = j(b7);
            if (j7 == null) {
                throw new IllegalArgumentException("Navigation destination " + g0.f16312t.b(this.f16253a, b7) + " cannot be found in the navigation graph " + this.f16255c);
            }
            for (int i7 : j7.j(g0Var)) {
                arrayList.add(Integer.valueOf(i7));
                arrayList2.add(a7);
            }
            g0Var = j7;
        }
        this.f16254b.putExtra(w.R, x3.e0.P5(arrayList));
        this.f16254b.putParcelableArrayListExtra(w.S, arrayList2);
    }

    public final g0 j(@d.d0 int i7) {
        x3.k kVar = new x3.k();
        k0 k0Var = this.f16255c;
        u4.l0.m(k0Var);
        kVar.add(k0Var);
        while (!kVar.isEmpty()) {
            g0 g0Var = (g0) kVar.w();
            if (g0Var.r() == i7) {
                return g0Var;
            }
            if (g0Var instanceof k0) {
                Iterator<g0> it = ((k0) g0Var).iterator();
                while (it.hasNext()) {
                    kVar.add(it.next());
                }
            }
        }
        return null;
    }

    @n6.d
    public final a0 k(@n6.e Bundle bundle) {
        this.f16257e = bundle;
        this.f16254b.putExtra(w.T, bundle);
        return this;
    }

    @n6.d
    public final a0 l(@n6.d ComponentName componentName) {
        u4.l0.p(componentName, "componentName");
        this.f16254b.setComponent(componentName);
        return this;
    }

    @n6.d
    public final a0 m(@n6.d Class<? extends Activity> cls) {
        u4.l0.p(cls, "activityClass");
        return l(new ComponentName(this.f16253a, cls));
    }

    @n6.d
    @s4.i
    public final a0 n(@d.d0 int i7) {
        return r(this, i7, null, 2, null);
    }

    @n6.d
    @s4.i
    public final a0 o(@d.d0 int i7, @n6.e Bundle bundle) {
        this.f16256d.clear();
        this.f16256d.add(new a(i7, bundle));
        if (this.f16255c != null) {
            v();
        }
        return this;
    }

    @n6.d
    @s4.i
    public final a0 p(@n6.d String str) {
        u4.l0.p(str, "destRoute");
        return s(this, str, null, 2, null);
    }

    @n6.d
    @s4.i
    public final a0 q(@n6.d String str, @n6.e Bundle bundle) {
        u4.l0.p(str, "destRoute");
        this.f16256d.clear();
        this.f16256d.add(new a(g0.f16312t.a(str).hashCode(), bundle));
        if (this.f16255c != null) {
            v();
        }
        return this;
    }

    @n6.d
    public final a0 t(@d.n0 int i7) {
        return u(new t0(this.f16253a, new b()).b(i7));
    }

    @n6.d
    public final a0 u(@n6.d k0 k0Var) {
        u4.l0.p(k0Var, "navGraph");
        this.f16255c = k0Var;
        v();
        return this;
    }

    public final void v() {
        Iterator<a> it = this.f16256d.iterator();
        while (it.hasNext()) {
            int b7 = it.next().b();
            if (j(b7) == null) {
                throw new IllegalArgumentException("Navigation destination " + g0.f16312t.b(this.f16253a, b7) + " cannot be found in the navigation graph " + this.f16255c);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(@n6.d w wVar) {
        this(wVar.J());
        u4.l0.p(wVar, "navController");
        this.f16255c = wVar.P();
    }
}
