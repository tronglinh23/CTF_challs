package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

@d.w0(18)
/* loaded from: classes.dex */
public class c1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewOverlay f5683a;

    public c1(@d.o0 View view) {
        this.f5683a = view.getOverlay();
    }

    @Override // androidx.transition.d1
    public void add(@d.o0 Drawable drawable) {
        this.f5683a.add(drawable);
    }

    @Override // androidx.transition.d1
    public void remove(@d.o0 Drawable drawable) {
        this.f5683a.remove(drawable);
    }
}