package q0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import d.o0;
import d.w0;
import java.lang.reflect.Method;
@w0(21)
/* loaded from: classes.dex */
public class q extends p {

    /* renamed from: i  reason: collision with root package name */
    public static final String f15145i = "WrappedDrawableApi21";

    /* renamed from: j  reason: collision with root package name */
    public static Method f15146j;

    public q(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override // q0.p
    public boolean c() {
        return false;
    }

    public final void g() {
        if (f15146j == null) {
            try {
                f15146j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e7) {
                Log.w(f15145i, "Failed to retrieve Drawable#isProjected() method", e7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Rect getDirtyBounds() {
        return this.f15144g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@o0 Outline outline) {
        this.f15144g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f15144g;
        if (drawable != null && (method = f15146j) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e7) {
                Log.w(f15145i, "Error calling Drawable#isProjected() method", e7);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        this.f15144g.setHotspot(f7, f8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        this.f15144g.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // q0.p, android.graphics.drawable.Drawable
    public boolean setState(@o0 int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // q0.p, android.graphics.drawable.Drawable, q0.n
    public void setTint(int i7) {
        if (c()) {
            super.setTint(i7);
        } else {
            this.f15144g.setTint(i7);
        }
    }

    @Override // q0.p, android.graphics.drawable.Drawable, q0.n
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f15144g.setTintList(colorStateList);
        }
    }

    @Override // q0.p, android.graphics.drawable.Drawable, q0.n
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f15144g.setTintMode(mode);
        }
    }

    public q(r rVar, Resources resources) {
        super(rVar, resources);
        g();
    }
}
