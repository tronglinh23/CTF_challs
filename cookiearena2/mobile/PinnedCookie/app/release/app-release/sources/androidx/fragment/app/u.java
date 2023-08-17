package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public final w<?> f4519a;

    public u(w<?> wVar) {
        this.f4519a = wVar;
    }

    @d.o0
    public static u b(@d.o0 w<?> wVar) {
        return new u((w) g1.s.m(wVar, "callbacks == null"));
    }

    @d.q0
    public Fragment A(@d.o0 String str) {
        return this.f4519a.f4560f.t0(str);
    }

    @d.o0
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f4519a.f4560f.A0();
    }

    public int C() {
        return this.f4519a.f4560f.z0();
    }

    @d.o0
    public FragmentManager D() {
        return this.f4519a.f4560f;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public o2.a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f4519a.f4560f.o1();
    }

    @d.q0
    public View G(@d.q0 View view, @d.o0 String str, @d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        return this.f4519a.f4560f.L0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@d.q0 Parcelable parcelable, @d.q0 i0 i0Var) {
        this.f4519a.f4560f.J1(parcelable, i0Var);
    }

    @Deprecated
    public void J(@d.q0 Parcelable parcelable, @d.q0 List<Fragment> list) {
        this.f4519a.f4560f.J1(parcelable, new i0(list, null, null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) androidx.collection.m<String, o2.a> mVar) {
    }

    @Deprecated
    public void L(@d.q0 Parcelable parcelable) {
        w<?> wVar = this.f4519a;
        if (!(wVar instanceof androidx.lifecycle.f1)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        wVar.f4560f.M1(parcelable);
    }

    @d.q0
    @Deprecated
    public androidx.collection.m<String, o2.a> M() {
        return null;
    }

    @d.q0
    @Deprecated
    public i0 N() {
        return this.f4519a.f4560f.O1();
    }

    @d.q0
    @Deprecated
    public List<Fragment> O() {
        i0 O1 = this.f4519a.f4560f.O1();
        if (O1 == null || O1.b() == null) {
            return null;
        }
        return new ArrayList(O1.b());
    }

    @d.q0
    @Deprecated
    public Parcelable P() {
        return this.f4519a.f4560f.Q1();
    }

    public void a(@d.q0 Fragment fragment) {
        w<?> wVar = this.f4519a;
        wVar.f4560f.s(wVar, wVar, fragment);
    }

    public void c() {
        this.f4519a.f4560f.F();
    }

    @Deprecated
    public void d(@d.o0 Configuration configuration) {
        this.f4519a.f4560f.H(configuration, true);
    }

    public boolean e(@d.o0 MenuItem menuItem) {
        return this.f4519a.f4560f.I(menuItem);
    }

    public void f() {
        this.f4519a.f4560f.J();
    }

    @Deprecated
    public boolean g(@d.o0 Menu menu, @d.o0 MenuInflater menuInflater) {
        return this.f4519a.f4560f.K(menu, menuInflater);
    }

    public void h() {
        this.f4519a.f4560f.L();
    }

    public void i() {
        this.f4519a.f4560f.M();
    }

    @Deprecated
    public void j() {
        this.f4519a.f4560f.N(true);
    }

    @Deprecated
    public void k(boolean z6) {
        this.f4519a.f4560f.O(z6, true);
    }

    @Deprecated
    public boolean l(@d.o0 MenuItem menuItem) {
        return this.f4519a.f4560f.R(menuItem);
    }

    @Deprecated
    public void m(@d.o0 Menu menu) {
        this.f4519a.f4560f.S(menu);
    }

    public void n() {
        this.f4519a.f4560f.U();
    }

    @Deprecated
    public void o(boolean z6) {
        this.f4519a.f4560f.V(z6, true);
    }

    @Deprecated
    public boolean p(@d.o0 Menu menu) {
        return this.f4519a.f4560f.W(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f4519a.f4560f.Y();
    }

    public void s() {
        this.f4519a.f4560f.Z();
    }

    public void t() {
        this.f4519a.f4560f.b0();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z6) {
    }

    @Deprecated
    public void y(@d.o0 String str, @d.q0 FileDescriptor fileDescriptor, @d.o0 PrintWriter printWriter, @d.q0 String[] strArr) {
    }

    public boolean z() {
        return this.f4519a.f4560f.j0(true);
    }
}
