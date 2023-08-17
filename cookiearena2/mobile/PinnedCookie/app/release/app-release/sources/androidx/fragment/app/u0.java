package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u1;
import androidx.lifecycle.p;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class u0 {
    public static final int A = 7;
    public static final int B = 8;
    public static final int C = 9;
    public static final int D = 10;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 4097;
    public static final int J = 8194;
    public static final int K = 4099;
    public static final int L = 4100;
    public static final int M = 8197;

    /* renamed from: t  reason: collision with root package name */
    public static final int f4520t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f4521u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f4522v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f4523w = 3;

    /* renamed from: x  reason: collision with root package name */
    public static final int f4524x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final int f4525y = 5;

    /* renamed from: z  reason: collision with root package name */
    public static final int f4526z = 6;

    /* renamed from: a  reason: collision with root package name */
    public final v f4527a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f4528b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<a> f4529c;

    /* renamed from: d  reason: collision with root package name */
    public int f4530d;

    /* renamed from: e  reason: collision with root package name */
    public int f4531e;

    /* renamed from: f  reason: collision with root package name */
    public int f4532f;

    /* renamed from: g  reason: collision with root package name */
    public int f4533g;

    /* renamed from: h  reason: collision with root package name */
    public int f4534h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4535i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4536j;
    @d.q0

    /* renamed from: k  reason: collision with root package name */
    public String f4537k;

    /* renamed from: l  reason: collision with root package name */
    public int f4538l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f4539m;

    /* renamed from: n  reason: collision with root package name */
    public int f4540n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f4541o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<String> f4542p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<String> f4543q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4544r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Runnable> f4545s;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4546a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f4547b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4548c;

        /* renamed from: d  reason: collision with root package name */
        public int f4549d;

        /* renamed from: e  reason: collision with root package name */
        public int f4550e;

        /* renamed from: f  reason: collision with root package name */
        public int f4551f;

        /* renamed from: g  reason: collision with root package name */
        public int f4552g;

        /* renamed from: h  reason: collision with root package name */
        public p.b f4553h;

        /* renamed from: i  reason: collision with root package name */
        public p.b f4554i;

        public a() {
        }

        public a(int i7, Fragment fragment) {
            this.f4546a = i7;
            this.f4547b = fragment;
            this.f4548c = false;
            p.b bVar = p.b.RESUMED;
            this.f4553h = bVar;
            this.f4554i = bVar;
        }

        public a(int i7, Fragment fragment, boolean z6) {
            this.f4546a = i7;
            this.f4547b = fragment;
            this.f4548c = z6;
            p.b bVar = p.b.RESUMED;
            this.f4553h = bVar;
            this.f4554i = bVar;
        }

        public a(int i7, @d.o0 Fragment fragment, p.b bVar) {
            this.f4546a = i7;
            this.f4547b = fragment;
            this.f4548c = false;
            this.f4553h = fragment.mMaxState;
            this.f4554i = bVar;
        }

        public a(a aVar) {
            this.f4546a = aVar.f4546a;
            this.f4547b = aVar.f4547b;
            this.f4548c = aVar.f4548c;
            this.f4549d = aVar.f4549d;
            this.f4550e = aVar.f4550e;
            this.f4551f = aVar.f4551f;
            this.f4552g = aVar.f4552g;
            this.f4553h = aVar.f4553h;
            this.f4554i = aVar.f4554i;
        }
    }

    @Deprecated
    public u0() {
        this.f4529c = new ArrayList<>();
        this.f4536j = true;
        this.f4544r = false;
        this.f4527a = null;
        this.f4528b = null;
    }

    public boolean A() {
        return this.f4529c.isEmpty();
    }

    @d.o0
    public u0 B(@d.o0 Fragment fragment) {
        m(new a(3, fragment));
        return this;
    }

    @d.o0
    public u0 C(@d.d0 int i7, @d.o0 Fragment fragment) {
        return D(i7, fragment, null);
    }

    @d.o0
    public u0 D(@d.d0 int i7, @d.o0 Fragment fragment, @d.q0 String str) {
        if (i7 != 0) {
            x(i7, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @d.o0
    public final u0 E(@d.d0 int i7, @d.o0 Class<? extends Fragment> cls, @d.q0 Bundle bundle) {
        return F(i7, cls, bundle, null);
    }

    @d.o0
    public final u0 F(@d.d0 int i7, @d.o0 Class<? extends Fragment> cls, @d.q0 Bundle bundle, @d.q0 String str) {
        return D(i7, u(cls, bundle), str);
    }

    @d.o0
    public u0 G(@d.o0 Runnable runnable) {
        w();
        if (this.f4545s == null) {
            this.f4545s = new ArrayList<>();
        }
        this.f4545s.add(runnable);
        return this;
    }

    @d.o0
    @Deprecated
    public u0 H(boolean z6) {
        return Q(z6);
    }

    @d.o0
    @Deprecated
    public u0 I(@d.f1 int i7) {
        this.f4540n = i7;
        this.f4541o = null;
        return this;
    }

    @d.o0
    @Deprecated
    public u0 J(@d.q0 CharSequence charSequence) {
        this.f4540n = 0;
        this.f4541o = charSequence;
        return this;
    }

    @d.o0
    @Deprecated
    public u0 K(@d.f1 int i7) {
        this.f4538l = i7;
        this.f4539m = null;
        return this;
    }

    @d.o0
    @Deprecated
    public u0 L(@d.q0 CharSequence charSequence) {
        this.f4538l = 0;
        this.f4539m = charSequence;
        return this;
    }

    @d.o0
    public u0 M(@d.a @d.b int i7, @d.a @d.b int i8) {
        return N(i7, i8, 0, 0);
    }

    @d.o0
    public u0 N(@d.a @d.b int i7, @d.a @d.b int i8, @d.a @d.b int i9, @d.a @d.b int i10) {
        this.f4530d = i7;
        this.f4531e = i8;
        this.f4532f = i9;
        this.f4533g = i10;
        return this;
    }

    @d.o0
    public u0 O(@d.o0 Fragment fragment, @d.o0 p.b bVar) {
        m(new a(10, fragment, bVar));
        return this;
    }

    @d.o0
    public u0 P(@d.q0 Fragment fragment) {
        m(new a(8, fragment));
        return this;
    }

    @d.o0
    public u0 Q(boolean z6) {
        this.f4544r = z6;
        return this;
    }

    @d.o0
    public u0 R(int i7) {
        this.f4534h = i7;
        return this;
    }

    @d.o0
    @Deprecated
    public u0 S(@d.g1 int i7) {
        return this;
    }

    @d.o0
    public u0 T(@d.o0 Fragment fragment) {
        m(new a(5, fragment));
        return this;
    }

    @d.o0
    public u0 f(@d.d0 int i7, @d.o0 Fragment fragment) {
        x(i7, fragment, null, 1);
        return this;
    }

    @d.o0
    public u0 g(@d.d0 int i7, @d.o0 Fragment fragment, @d.q0 String str) {
        x(i7, fragment, str, 1);
        return this;
    }

    @d.o0
    public final u0 h(@d.d0 int i7, @d.o0 Class<? extends Fragment> cls, @d.q0 Bundle bundle) {
        return f(i7, u(cls, bundle));
    }

    @d.o0
    public final u0 i(@d.d0 int i7, @d.o0 Class<? extends Fragment> cls, @d.q0 Bundle bundle, @d.q0 String str) {
        return g(i7, u(cls, bundle), str);
    }

    public u0 j(@d.o0 ViewGroup viewGroup, @d.o0 Fragment fragment, @d.q0 String str) {
        fragment.mContainer = viewGroup;
        return g(viewGroup.getId(), fragment, str);
    }

    @d.o0
    public u0 k(@d.o0 Fragment fragment, @d.q0 String str) {
        x(0, fragment, str, 1);
        return this;
    }

    @d.o0
    public final u0 l(@d.o0 Class<? extends Fragment> cls, @d.q0 Bundle bundle, @d.q0 String str) {
        return k(u(cls, bundle), str);
    }

    public void m(a aVar) {
        this.f4529c.add(aVar);
        aVar.f4549d = this.f4530d;
        aVar.f4550e = this.f4531e;
        aVar.f4551f = this.f4532f;
        aVar.f4552g = this.f4533g;
    }

    @d.o0
    public u0 n(@d.o0 View view, @d.o0 String str) {
        if (w0.f()) {
            String x02 = u1.x0(view);
            if (x02 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f4542p == null) {
                this.f4542p = new ArrayList<>();
                this.f4543q = new ArrayList<>();
            } else if (this.f4543q.contains(str)) {
                throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
            } else if (this.f4542p.contains(x02)) {
                throw new IllegalArgumentException("A shared element with the source name '" + x02 + "' has already been added to the transaction.");
            }
            this.f4542p.add(x02);
            this.f4543q.add(str);
        }
        return this;
    }

    @d.o0
    public u0 o(@d.q0 String str) {
        if (this.f4536j) {
            this.f4535i = true;
            this.f4537k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @d.o0
    public u0 p(@d.o0 Fragment fragment) {
        m(new a(7, fragment));
        return this;
    }

    public abstract int q();

    public abstract int r();

    @d.l0
    public abstract void s();

    @d.l0
    public abstract void t();

    @d.o0
    public final Fragment u(@d.o0 Class<? extends Fragment> cls, @d.q0 Bundle bundle) {
        v vVar = this.f4527a;
        if (vVar != null) {
            ClassLoader classLoader = this.f4528b;
            if (classLoader != null) {
                Fragment a7 = vVar.a(classLoader, cls.getName());
                if (bundle != null) {
                    a7.setArguments(bundle);
                }
                return a7;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @d.o0
    public u0 v(@d.o0 Fragment fragment) {
        m(new a(6, fragment));
        return this;
    }

    @d.o0
    public u0 w() {
        if (this.f4535i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f4536j = false;
        return this;
    }

    public void x(int i7, Fragment fragment, @d.q0 String str, int i8) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            y1.d.i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i9 = fragment.mFragmentId;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i7);
            }
            fragment.mFragmentId = i7;
            fragment.mContainerId = i7;
        }
        m(new a(i8, fragment));
    }

    @d.o0
    public u0 y(@d.o0 Fragment fragment) {
        m(new a(4, fragment));
        return this;
    }

    public boolean z() {
        return this.f4536j;
    }

    public u0(@d.o0 v vVar, @d.q0 ClassLoader classLoader) {
        this.f4529c = new ArrayList<>();
        this.f4536j = true;
        this.f4544r = false;
        this.f4527a = vVar;
        this.f4528b = classLoader;
    }

    public u0(@d.o0 v vVar, @d.q0 ClassLoader classLoader, @d.o0 u0 u0Var) {
        this(vVar, classLoader);
        Iterator<a> it = u0Var.f4529c.iterator();
        while (it.hasNext()) {
            this.f4529c.add(new a(it.next()));
        }
        this.f4530d = u0Var.f4530d;
        this.f4531e = u0Var.f4531e;
        this.f4532f = u0Var.f4532f;
        this.f4533g = u0Var.f4533g;
        this.f4534h = u0Var.f4534h;
        this.f4535i = u0Var.f4535i;
        this.f4536j = u0Var.f4536j;
        this.f4537k = u0Var.f4537k;
        this.f4540n = u0Var.f4540n;
        this.f4541o = u0Var.f4541o;
        this.f4538l = u0Var.f4538l;
        this.f4539m = u0Var.f4539m;
        if (u0Var.f4542p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f4542p = arrayList;
            arrayList.addAll(u0Var.f4542p);
        }
        if (u0Var.f4543q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f4543q = arrayList2;
            arrayList2.addAll(u0Var.f4543q);
        }
        this.f4544r = u0Var.f4544r;
    }
}
