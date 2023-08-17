package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@d.w0(18)
/* loaded from: classes.dex */
public class v0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroupOverlay f6814a;

    public v0(@d.o0 ViewGroup viewGroup) {
        this.f6814a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.d1
    public void add(@d.o0 Drawable drawable) {
        this.f6814a.add(drawable);
    }

    @Override // androidx.transition.d1
    public void remove(@d.o0 Drawable drawable) {
        this.f6814a.remove(drawable);
    }

    @Override // androidx.transition.w0
    public void add(@d.o0 View view) {
        this.f6814a.add(view);
    }

    @Override // androidx.transition.w0
    public void remove(@d.o0 View view) {
        this.f6814a.remove(view);
    }
}