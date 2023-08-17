package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class s1 extends h1 {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f1791b;

    public s1(@d.o0 Context context, @d.o0 Resources resources) {
        super(resources);
        this.f1791b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.h1, android.content.res.Resources
    public Drawable getDrawable(int i7) throws Resources.NotFoundException {
        Drawable a7 = a(i7);
        Context context = this.f1791b.get();
        if (a7 != null && context != null) {
            g1.h().x(context, i7, a7);
        }
        return a7;
    }
}