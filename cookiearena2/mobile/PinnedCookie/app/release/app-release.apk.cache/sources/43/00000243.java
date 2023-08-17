package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.n;
import d.b1;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface k0 {
    void a(Menu menu, n.a aVar);

    boolean c();

    void d();

    boolean e();

    boolean f();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    void l(SparseArray<Parcelable> sparseArray);

    void m(int i7);

    void n();

    void o(SparseArray<Parcelable> sparseArray);

    void setIcon(int i7);

    void setIcon(Drawable drawable);

    void setLogo(int i7);

    void setUiOptions(int i7);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}