package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u0;
import androidx.lifecycle.p;
import java.io.PrintWriter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a extends u0 implements FragmentManager.j, FragmentManager.q {
    public static final String R = "FragmentManager";
    public final FragmentManager N;
    public boolean O;
    public int P;
    public boolean Q;

    public a(@d.o0 FragmentManager fragmentManager) {
        super(fragmentManager.H0(), fragmentManager.K0() != null ? fragmentManager.K0().k().getClassLoader() : null);
        this.P = -1;
        this.Q = false;
        this.N = fragmentManager;
    }

    @Override // androidx.fragment.app.u0
    public boolean A() {
        return this.f4529c.isEmpty();
    }

    @Override // androidx.fragment.app.u0
    @d.o0
    public u0 B(@d.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.B(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.u0
    @d.o0
    public u0 O(@d.o0 Fragment fragment, @d.o0 p.b bVar) {
        if (fragment.mFragmentManager != this.N) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.N);
        } else if (bVar == p.b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != p.b.DESTROYED) {
            return super.O(fragment, bVar);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    @Override // androidx.fragment.app.u0
    @d.o0
    public u0 P(@d.q0 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.N) {
            return super.P(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.u0
    @d.o0
    public u0 T(@d.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.T(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void U(int i7) {
        if (this.f4535i) {
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i7);
            }
            int size = this.f4529c.size();
            for (int i8 = 0; i8 < size; i8++) {
                u0.a aVar = this.f4529c.get(i8);
                Fragment fragment = aVar.f4547b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i7;
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f4547b);
                        sb2.append(" to ");
                        sb2.append(aVar.f4547b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public void V() {
        int size = this.f4529c.size() - 1;
        while (size >= 0) {
            u0.a aVar = this.f4529c.get(size);
            if (aVar.f4548c) {
                if (aVar.f4546a == 8) {
                    aVar.f4548c = false;
                    this.f4529c.remove(size - 1);
                    size--;
                } else {
                    int i7 = aVar.f4547b.mContainerId;
                    aVar.f4546a = 2;
                    aVar.f4548c = false;
                    for (int i8 = size - 1; i8 >= 0; i8--) {
                        u0.a aVar2 = this.f4529c.get(i8);
                        if (aVar2.f4548c && aVar2.f4547b.mContainerId == i7) {
                            this.f4529c.remove(i8);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int W(boolean z6) {
        if (this.O) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new c1("FragmentManager"));
            X("  ", printWriter);
            printWriter.close();
        }
        this.O = true;
        if (this.f4535i) {
            this.P = this.N.r();
        } else {
            this.P = -1;
        }
        this.N.h0(this, z6);
        return this.P;
    }

    public void X(String str, PrintWriter printWriter) {
        Y(str, printWriter, true);
    }

    public void Y(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4537k);
            printWriter.print(" mIndex=");
            printWriter.print(this.P);
            printWriter.print(" mCommitted=");
            printWriter.println(this.O);
            if (this.f4534h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4534h));
            }
            if (this.f4530d != 0 || this.f4531e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4530d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4531e));
            }
            if (this.f4532f != 0 || this.f4533g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4532f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4533g));
            }
            if (this.f4538l != 0 || this.f4539m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4538l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4539m);
            }
            if (this.f4540n != 0 || this.f4541o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4540n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4541o);
            }
        }
        if (this.f4529c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4529c.size();
        for (int i7 = 0; i7 < size; i7++) {
            u0.a aVar = this.f4529c.get(i7);
            switch (aVar.f4546a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4546a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4547b);
            if (z6) {
                if (aVar.f4549d != 0 || aVar.f4550e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4549d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4550e));
                }
                if (aVar.f4551f != 0 || aVar.f4552g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4551f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4552g));
                }
            }
        }
    }

    public void Z() {
        int size = this.f4529c.size();
        for (int i7 = 0; i7 < size; i7++) {
            u0.a aVar = this.f4529c.get(i7);
            Fragment fragment = aVar.f4547b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4534h);
                fragment.setSharedElementNames(this.f4542p, this.f4543q);
            }
            switch (aVar.f4546a) {
                case 1:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.W1(fragment, false);
                    this.N.n(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4546a);
                case 3:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.D1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.U0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.W1(fragment, false);
                    this.N.d2(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.E(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.W1(fragment, false);
                    this.N.t(fragment);
                    break;
                case 8:
                    this.N.Z1(fragment);
                    break;
                case 9:
                    this.N.Z1(null);
                    break;
                case 10:
                    this.N.Y1(fragment, aVar.f4554i);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @d.q0
    public CharSequence a() {
        return this.f4538l != 0 ? this.N.K0().k().getText(this.f4538l) : this.f4539m;
    }

    public void a0() {
        for (int size = this.f4529c.size() - 1; size >= 0; size--) {
            u0.a aVar = this.f4529c.get(size);
            Fragment fragment = aVar.f4547b;
            if (fragment != null) {
                fragment.mBeingSaved = this.Q;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.P1(this.f4534h));
                fragment.setSharedElementNames(this.f4543q, this.f4542p);
            }
            switch (aVar.f4546a) {
                case 1:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.W1(fragment, true);
                    this.N.D1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4546a);
                case 3:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.n(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.d2(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.W1(fragment, true);
                    this.N.U0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.t(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4549d, aVar.f4550e, aVar.f4551f, aVar.f4552g);
                    this.N.W1(fragment, true);
                    this.N.E(fragment);
                    break;
                case 8:
                    this.N.Z1(null);
                    break;
                case 9:
                    this.N.Z1(fragment);
                    break;
                case 10:
                    this.N.Y1(fragment, aVar.f4553h);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public boolean b(@d.o0 ArrayList<a> arrayList, @d.o0 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f4535i) {
            this.N.m(this);
            return true;
        }
        return true;
    }

    public Fragment b0(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i7 = 0;
        while (i7 < this.f4529c.size()) {
            u0.a aVar = this.f4529c.get(i7);
            int i8 = aVar.f4546a;
            if (i8 != 1) {
                if (i8 == 2) {
                    Fragment fragment3 = aVar.f4547b;
                    int i9 = fragment3.mContainerId;
                    boolean z6 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i9) {
                            if (fragment4 == fragment3) {
                                z6 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4529c.add(i7, new u0.a(9, fragment4, true));
                                    i7++;
                                    fragment2 = null;
                                }
                                u0.a aVar2 = new u0.a(3, fragment4, true);
                                aVar2.f4549d = aVar.f4549d;
                                aVar2.f4551f = aVar.f4551f;
                                aVar2.f4550e = aVar.f4550e;
                                aVar2.f4552g = aVar.f4552g;
                                this.f4529c.add(i7, aVar2);
                                arrayList.remove(fragment4);
                                i7++;
                            }
                        }
                    }
                    if (z6) {
                        this.f4529c.remove(i7);
                        i7--;
                    } else {
                        aVar.f4546a = 1;
                        aVar.f4548c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i8 == 3 || i8 == 6) {
                    arrayList.remove(aVar.f4547b);
                    Fragment fragment5 = aVar.f4547b;
                    if (fragment5 == fragment2) {
                        this.f4529c.add(i7, new u0.a(9, fragment5));
                        i7++;
                        fragment2 = null;
                    }
                } else if (i8 != 7) {
                    if (i8 == 8) {
                        this.f4529c.add(i7, new u0.a(9, fragment2, true));
                        aVar.f4548c = true;
                        i7++;
                        fragment2 = aVar.f4547b;
                    }
                }
                i7++;
            }
            arrayList.add(aVar.f4547b);
            i7++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int c() {
        return this.f4538l;
    }

    public void c0() {
        if (this.f4545s != null) {
            for (int i7 = 0; i7 < this.f4545s.size(); i7++) {
                this.f4545s.get(i7).run();
            }
            this.f4545s = null;
        }
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int d() {
        return this.f4540n;
    }

    public Fragment d0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4529c.size() - 1; size >= 0; size--) {
            u0.a aVar = this.f4529c.get(size);
            int i7 = aVar.f4546a;
            if (i7 != 1) {
                if (i7 != 3) {
                    switch (i7) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f4547b;
                            break;
                        case 10:
                            aVar.f4554i = aVar.f4553h;
                            break;
                    }
                }
                arrayList.add(aVar.f4547b);
            }
            arrayList.remove(aVar.f4547b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @d.q0
    public CharSequence e() {
        return this.f4540n != 0 ? this.N.K0().k().getText(this.f4540n) : this.f4541o;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getId() {
        return this.P;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    @d.q0
    public String getName() {
        return this.f4537k;
    }

    @Override // androidx.fragment.app.u0
    public int q() {
        return W(false);
    }

    @Override // androidx.fragment.app.u0
    public int r() {
        return W(true);
    }

    @Override // androidx.fragment.app.u0
    public void s() {
        w();
        this.N.k0(this, false);
    }

    @Override // androidx.fragment.app.u0
    public void t() {
        w();
        this.N.k0(this, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.P >= 0) {
            sb.append(" #");
            sb.append(this.P);
        }
        if (this.f4537k != null) {
            sb.append(" ");
            sb.append(this.f4537k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.u0
    @d.o0
    public u0 v(@d.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.v(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.u0
    public void x(int i7, Fragment fragment, @d.q0 String str, int i8) {
        super.x(i7, fragment, str, i8);
        fragment.mFragmentManager = this.N;
    }

    @Override // androidx.fragment.app.u0
    @d.o0
    public u0 y(@d.o0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.N) {
            return super.y(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public a(@d.o0 a aVar) {
        super(aVar.N.H0(), aVar.N.K0() != null ? aVar.N.K0().k().getClassLoader() : null, aVar);
        this.P = -1;
        this.Q = false;
        this.N = aVar.N;
        this.O = aVar.O;
        this.P = aVar.P;
        this.Q = aVar.Q;
    }
}
