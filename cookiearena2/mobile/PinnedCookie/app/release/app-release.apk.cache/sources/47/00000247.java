package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.core.view.z2;
import d.b1;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface l0 {
    void A(CharSequence charSequence);

    int B();

    int C();

    void D(Drawable drawable);

    void E(SparseArray<Parcelable> sparseArray);

    void F(int i7);

    Menu G();

    void H(int i7);

    boolean I();

    int J();

    void K(View view);

    void L(int i7);

    z2 M(int i7, long j7);

    void N(int i7);

    void O();

    int P();

    void Q();

    void R(Drawable drawable);

    void S(boolean z6);

    void T(int i7);

    void a(Menu menu, n.a aVar);

    int b();

    boolean c();

    void collapseActionView();

    void d();

    boolean e();

    boolean f();

    Context g();

    int getHeight();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    void l(int i7);

    void m();

    void n(n.a aVar, g.a aVar2);

    View o();

    void p(j1 j1Var);

    ViewGroup q();

    void r(boolean z6);

    void s(Drawable drawable);

    void setBackgroundDrawable(Drawable drawable);

    void setIcon(int i7);

    void setIcon(Drawable drawable);

    void setLogo(int i7);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i7);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void u(SparseArray<Parcelable> sparseArray);

    boolean v();

    boolean w();

    void x(int i7);

    CharSequence y();

    void z(CharSequence charSequence);
}