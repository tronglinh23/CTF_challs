package q0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import d.o0;
import d.q0;
import d.w0;

/* loaded from: classes.dex */
public class p extends Drawable implements Drawable.Callback, o, n {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f15138h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public int f15139b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f15140c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15141d;

    /* renamed from: e  reason: collision with root package name */
    public r f15142e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15143f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f15144g;

    public p(@o0 r rVar, @q0 Resources resources) {
        this.f15142e = rVar;
        e(resources);
    }

    @Override // q0.o
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f15144g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f15144g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            r rVar = this.f15142e;
            if (rVar != null) {
                rVar.f15148b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // q0.o
    public final Drawable b() {
        return this.f15144g;
    }

    public boolean c() {
        return true;
    }

    @o0
    public final r d() {
        return new r(this.f15142e);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        this.f15144g.draw(canvas);
    }

    public final void e(@q0 Resources resources) {
        Drawable.ConstantState constantState;
        r rVar = this.f15142e;
        if (rVar == null || (constantState = rVar.f15148b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (c()) {
            r rVar = this.f15142e;
            ColorStateList colorStateList = rVar.f15149c;
            PorterDuff.Mode mode = rVar.f15150d;
            if (colorStateList == null || mode == null) {
                this.f15141d = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f15141d || colorForState != this.f15139b || mode != this.f15140c) {
                    setColorFilter(colorForState, mode);
                    this.f15139b = colorForState;
                    this.f15140c = mode;
                    this.f15141d = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        r rVar = this.f15142e;
        return changingConfigurations | (rVar != null ? rVar.getChangingConfigurations() : 0) | this.f15144g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        r rVar = this.f15142e;
        if (rVar == null || !rVar.a()) {
            return null;
        }
        this.f15142e.f15147a = getChangingConfigurations();
        return this.f15142e;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f15144g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15144g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15144g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(23)
    public int getLayoutDirection() {
        return c.f(this.f15144g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f15144g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f15144g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f15144g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        return this.f15144g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public int[] getState() {
        return this.f15144g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f15144g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@o0 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(19)
    public boolean isAutoMirrored() {
        return c.h(this.f15144g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        r rVar;
        ColorStateList colorStateList = (!c() || (rVar = this.f15142e) == null) ? null : rVar.f15149c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f15144g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f15144g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f15143f && super.mutate() == this) {
            this.f15142e = d();
            Drawable drawable = this.f15144g;
            if (drawable != null) {
                drawable.mutate();
            }
            r rVar = this.f15142e;
            if (rVar != null) {
                Drawable drawable2 = this.f15144g;
                rVar.f15148b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f15143f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15144g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @w0(23)
    public boolean onLayoutDirectionChanged(int i7) {
        return c.m(this.f15144g, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        return this.f15144g.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f15144g.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    @w0(19)
    public void setAutoMirrored(boolean z6) {
        c.j(this.f15144g, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i7) {
        this.f15144g.setChangingConfigurations(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15144g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        this.f15144g.setDither(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        this.f15144g.setFilterBitmap(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@o0 int[] iArr) {
        return f(iArr) || this.f15144g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintList(ColorStateList colorStateList) {
        this.f15142e.f15149c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        this.f15142e.f15150d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        return super.setVisible(z6, z7) || this.f15144g.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public p(@q0 Drawable drawable) {
        this.f15142e = d();
        a(drawable);
    }
}