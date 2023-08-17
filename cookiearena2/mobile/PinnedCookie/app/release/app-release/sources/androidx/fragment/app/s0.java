package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: e  reason: collision with root package name */
    public static final String f4500e = "FragmentManager";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Fragment> f4501a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, q0> f4502b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, Bundle> f4503c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public k0 f4504d;

    @d.q0
    public ArrayList<String> A() {
        synchronized (this.f4501a) {
            if (this.f4501a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4501a.size());
            Iterator<Fragment> it = this.f4501a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.X0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.mWho);
                    sb.append("): ");
                    sb.append(next);
                }
            }
            return arrayList;
        }
    }

    public void B(@d.o0 k0 k0Var) {
        this.f4504d = k0Var;
    }

    @d.q0
    public Bundle C(@d.o0 String str, @d.q0 Bundle bundle) {
        return bundle != null ? this.f4503c.put(str, bundle) : this.f4503c.remove(str);
    }

    public void a(@d.o0 Fragment fragment) {
        if (this.f4501a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4501a) {
            this.f4501a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f4502b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(@d.o0 String str) {
        return this.f4502b.get(str) != null;
    }

    public void d(int i7) {
        for (q0 q0Var : this.f4502b.values()) {
            if (q0Var != null) {
                q0Var.t(i7);
            }
        }
    }

    public void e(@d.o0 String str, @d.q0 FileDescriptor fileDescriptor, @d.o0 PrintWriter printWriter, @d.q0 String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4502b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : this.f4502b.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    Fragment k7 = q0Var.k();
                    printWriter.println(k7);
                    k7.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4501a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size; i7++) {
                Fragment fragment = this.f4501a.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @d.q0
    public Fragment f(@d.o0 String str) {
        q0 q0Var = this.f4502b.get(str);
        if (q0Var != null) {
            return q0Var.k();
        }
        return null;
    }

    @d.q0
    public Fragment g(@d.d0 int i7) {
        for (int size = this.f4501a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4501a.get(size);
            if (fragment != null && fragment.mFragmentId == i7) {
                return fragment;
            }
        }
        for (q0 q0Var : this.f4502b.values()) {
            if (q0Var != null) {
                Fragment k7 = q0Var.k();
                if (k7.mFragmentId == i7) {
                    return k7;
                }
            }
        }
        return null;
    }

    @d.q0
    public Fragment h(@d.q0 String str) {
        if (str != null) {
            for (int size = this.f4501a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4501a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (q0 q0Var : this.f4502b.values()) {
                if (q0Var != null) {
                    Fragment k7 = q0Var.k();
                    if (str.equals(k7.mTag)) {
                        return k7;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @d.q0
    public Fragment i(@d.o0 String str) {
        Fragment findFragmentByWho;
        for (q0 q0Var : this.f4502b.values()) {
            if (q0Var != null && (findFragmentByWho = q0Var.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int j(@d.o0 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4501a.indexOf(fragment);
        for (int i7 = indexOf - 1; i7 >= 0; i7--) {
            Fragment fragment2 = this.f4501a.get(i7);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4501a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4501a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public int k() {
        return this.f4502b.size();
    }

    @d.o0
    public List<q0> l() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : this.f4502b.values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    @d.o0
    public List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : this.f4502b.values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @d.o0
    public HashMap<String, Bundle> n() {
        return this.f4503c;
    }

    @d.q0
    public q0 o(@d.o0 String str) {
        return this.f4502b.get(str);
    }

    @d.o0
    public List<Fragment> p() {
        ArrayList arrayList;
        if (this.f4501a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4501a) {
            arrayList = new ArrayList(this.f4501a);
        }
        return arrayList;
    }

    public k0 q() {
        return this.f4504d;
    }

    @d.q0
    public Bundle r(@d.o0 String str) {
        return this.f4503c.get(str);
    }

    public void s(@d.o0 q0 q0Var) {
        Fragment k7 = q0Var.k();
        if (c(k7.mWho)) {
            return;
        }
        this.f4502b.put(k7.mWho, q0Var);
        if (k7.mRetainInstanceChangedWhileDetached) {
            if (k7.mRetainInstance) {
                this.f4504d.h(k7);
            } else {
                this.f4504d.s(k7);
            }
            k7.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(k7);
        }
    }

    public void t(@d.o0 q0 q0Var) {
        Fragment k7 = q0Var.k();
        if (k7.mRetainInstance) {
            this.f4504d.s(k7);
        }
        if (this.f4502b.get(k7.mWho) == q0Var && this.f4502b.put(k7.mWho, null) != null && FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k7);
        }
    }

    public void u() {
        Iterator<Fragment> it = this.f4501a.iterator();
        while (it.hasNext()) {
            q0 q0Var = this.f4502b.get(it.next().mWho);
            if (q0Var != null) {
                q0Var.m();
            }
        }
        for (q0 q0Var2 : this.f4502b.values()) {
            if (q0Var2 != null) {
                q0Var2.m();
                Fragment k7 = q0Var2.k();
                if (k7.mRemoving && !k7.isInBackStack()) {
                    if (k7.mBeingSaved && !this.f4503c.containsKey(k7.mWho)) {
                        C(k7.mWho, q0Var2.r());
                    }
                    t(q0Var2);
                }
            }
        }
    }

    public void v(@d.o0 Fragment fragment) {
        synchronized (this.f4501a) {
            this.f4501a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void w() {
        this.f4502b.clear();
    }

    public void x(@d.q0 List<String> list) {
        this.f4501a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f7 = f(str);
                if (f7 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.X0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: added (");
                    sb.append(str);
                    sb.append("): ");
                    sb.append(f7);
                }
                a(f7);
            }
        }
    }

    public void y(@d.o0 HashMap<String, Bundle> hashMap) {
        this.f4503c.clear();
        this.f4503c.putAll(hashMap);
    }

    @d.o0
    public ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>(this.f4502b.size());
        for (q0 q0Var : this.f4502b.values()) {
            if (q0Var != null) {
                Fragment k7 = q0Var.k();
                C(k7.mWho, q0Var.r());
                arrayList.add(k7.mWho);
                if (FragmentManager.X0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k7);
                    sb.append(": ");
                    sb.append(k7.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }
}
