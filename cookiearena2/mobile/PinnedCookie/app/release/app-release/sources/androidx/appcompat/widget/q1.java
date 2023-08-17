package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import d.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class q1 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1756c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<WeakReference<q1>> f1757d;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f1758a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f1759b;

    public q1(@d.o0 Context context) {
        super(context);
        if (!d2.d()) {
            this.f1758a = new s1(this, context.getResources());
            this.f1759b = null;
            return;
        }
        d2 d2Var = new d2(this, context.getResources());
        this.f1758a = d2Var;
        Resources.Theme newTheme = d2Var.newTheme();
        this.f1759b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(@d.o0 Context context) {
        return ((context instanceof q1) || (context.getResources() instanceof s1) || (context.getResources() instanceof d2) || !d2.d()) ? false : true;
    }

    public static Context b(@d.o0 Context context) {
        if (a(context)) {
            synchronized (f1756c) {
                ArrayList<WeakReference<q1>> arrayList = f1757d;
                if (arrayList == null) {
                    f1757d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<q1> weakReference = f1757d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1757d.remove(size);
                        }
                    }
                    for (int size2 = f1757d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<q1> weakReference2 = f1757d.get(size2);
                        q1 q1Var = weakReference2 != null ? weakReference2.get() : null;
                        if (q1Var != null && q1Var.getBaseContext() == context) {
                            return q1Var;
                        }
                    }
                }
                q1 q1Var2 = new q1(context);
                f1757d.add(new WeakReference<>(q1Var2));
                return q1Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1758a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1758a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1759b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        Resources.Theme theme = this.f1759b;
        if (theme == null) {
            super.setTheme(i7);
        } else {
            theme.applyStyle(i7, true);
        }
    }
}
