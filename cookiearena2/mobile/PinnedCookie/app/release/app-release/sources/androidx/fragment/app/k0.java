package androidx.fragment.app;

import androidx.lifecycle.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class k0 extends androidx.lifecycle.z0 {

    /* renamed from: k  reason: collision with root package name */
    public static final String f4420k = "FragmentManager";

    /* renamed from: l  reason: collision with root package name */
    public static final c1.b f4421l = new a();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4425g;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Fragment> f4422d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, k0> f4423e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.e1> f4424f = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f4426h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4427i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4428j = false;

    /* loaded from: classes.dex */
    public class a implements c1.b {
        @Override // androidx.lifecycle.c1.b
        @d.o0
        public <T extends androidx.lifecycle.z0> T a(@d.o0 Class<T> cls) {
            return new k0(true);
        }
    }

    public k0(boolean z6) {
        this.f4425g = z6;
    }

    @d.o0
    public static k0 n(androidx.lifecycle.e1 e1Var) {
        return (k0) new androidx.lifecycle.c1(e1Var, f4421l).a(k0.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f4422d.equals(k0Var.f4422d) && this.f4423e.equals(k0Var.f4423e) && this.f4424f.equals(k0Var.f4424f);
    }

    @Override // androidx.lifecycle.z0
    public void f() {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f4426h = true;
    }

    public void h(@d.o0 Fragment fragment) {
        if (this.f4428j) {
            FragmentManager.X0(2);
        } else if (this.f4422d.containsKey(fragment.mWho)) {
        } else {
            this.f4422d.put(fragment.mWho, fragment);
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    public int hashCode() {
        return (((this.f4422d.hashCode() * 31) + this.f4423e.hashCode()) * 31) + this.f4424f.hashCode();
    }

    public void i(@d.o0 Fragment fragment) {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        k(fragment.mWho);
    }

    public void j(@d.o0 String str) {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        k(str);
    }

    public final void k(@d.o0 String str) {
        k0 k0Var = this.f4423e.get(str);
        if (k0Var != null) {
            k0Var.f();
            this.f4423e.remove(str);
        }
        androidx.lifecycle.e1 e1Var = this.f4424f.get(str);
        if (e1Var != null) {
            e1Var.a();
            this.f4424f.remove(str);
        }
    }

    @d.q0
    public Fragment l(String str) {
        return this.f4422d.get(str);
    }

    @d.o0
    public k0 m(@d.o0 Fragment fragment) {
        k0 k0Var = this.f4423e.get(fragment.mWho);
        if (k0Var == null) {
            k0 k0Var2 = new k0(this.f4425g);
            this.f4423e.put(fragment.mWho, k0Var2);
            return k0Var2;
        }
        return k0Var;
    }

    @d.o0
    public Collection<Fragment> o() {
        return new ArrayList(this.f4422d.values());
    }

    @d.q0
    @Deprecated
    public i0 p() {
        if (this.f4422d.isEmpty() && this.f4423e.isEmpty() && this.f4424f.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, k0> entry : this.f4423e.entrySet()) {
            i0 p6 = entry.getValue().p();
            if (p6 != null) {
                hashMap.put(entry.getKey(), p6);
            }
        }
        this.f4427i = true;
        if (this.f4422d.isEmpty() && hashMap.isEmpty() && this.f4424f.isEmpty()) {
            return null;
        }
        return new i0(new ArrayList(this.f4422d.values()), hashMap, new HashMap(this.f4424f));
    }

    @d.o0
    public androidx.lifecycle.e1 q(@d.o0 Fragment fragment) {
        androidx.lifecycle.e1 e1Var = this.f4424f.get(fragment.mWho);
        if (e1Var == null) {
            androidx.lifecycle.e1 e1Var2 = new androidx.lifecycle.e1();
            this.f4424f.put(fragment.mWho, e1Var2);
            return e1Var2;
        }
        return e1Var;
    }

    public boolean r() {
        return this.f4426h;
    }

    public void s(@d.o0 Fragment fragment) {
        if (this.f4428j) {
            FragmentManager.X0(2);
            return;
        }
        if ((this.f4422d.remove(fragment.mWho) != null) && FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    @Deprecated
    public void t(@d.q0 i0 i0Var) {
        this.f4422d.clear();
        this.f4423e.clear();
        this.f4424f.clear();
        if (i0Var != null) {
            Collection<Fragment> b7 = i0Var.b();
            if (b7 != null) {
                for (Fragment fragment : b7) {
                    if (fragment != null) {
                        this.f4422d.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, i0> a7 = i0Var.a();
            if (a7 != null) {
                for (Map.Entry<String, i0> entry : a7.entrySet()) {
                    k0 k0Var = new k0(this.f4425g);
                    k0Var.t(entry.getValue());
                    this.f4423e.put(entry.getKey(), k0Var);
                }
            }
            Map<String, androidx.lifecycle.e1> c7 = i0Var.c();
            if (c7 != null) {
                this.f4424f.putAll(c7);
            }
        }
        this.f4427i = false;
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f4422d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f4423e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4424f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public void u(boolean z6) {
        this.f4428j = z6;
    }

    public boolean v(@d.o0 Fragment fragment) {
        if (this.f4422d.containsKey(fragment.mWho)) {
            return this.f4425g ? this.f4426h : !this.f4427i;
        }
        return true;
    }
}
