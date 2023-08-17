package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import d.b1;
import f.a;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f1213b;

    /* renamed from: c  reason: collision with root package name */
    public View f1214c;

    /* renamed from: d  reason: collision with root package name */
    public View f1215d;

    /* renamed from: e  reason: collision with root package name */
    public View f1216e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1217f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1218g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1219h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1220i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1221j;

    /* renamed from: k  reason: collision with root package name */
    public int f1222k;

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1217f;
        if (drawable != null && drawable.isStateful()) {
            this.f1217f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1218g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1218g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1219h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1219h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1214c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1217f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1218g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1219h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1215d = findViewById(a.g.f9131a);
        this.f1216e = findViewById(a.g.f9145h);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1213b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        Drawable drawable;
        super.onLayout(z6, i7, i8, i9, i10);
        View view = this.f1214c;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i11 = layoutParams.bottomMargin;
            view.layout(i7, measuredHeight2 - i11, i9, measuredHeight - i11);
        }
        if (this.f1220i) {
            Drawable drawable2 = this.f1219h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z7 = z8;
        } else {
            if (this.f1217f != null) {
                if (this.f1215d.getVisibility() == 0) {
                    this.f1217f.setBounds(this.f1215d.getLeft(), this.f1215d.getTop(), this.f1215d.getRight(), this.f1215d.getBottom());
                } else {
                    View view2 = this.f1216e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1217f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1217f.setBounds(this.f1216e.getLeft(), this.f1216e.getTop(), this.f1216e.getRight(), this.f1216e.getBottom());
                    }
                }
                z8 = true;
            }
            this.f1221j = z9;
            if (z9 && (drawable = this.f1218g) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z7 = z8;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        if (this.f1215d == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f1222k) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f1215d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        View view = this.f1214c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f1215d) ? a(this.f1215d) : !b(this.f1216e) ? a(this.f1216e) : 0) + a(this.f1214c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i8) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1217f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1217f);
        }
        this.f1217f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1215d;
            if (view != null) {
                this.f1217f.setBounds(view.getLeft(), this.f1215d.getTop(), this.f1215d.getRight(), this.f1215d.getBottom());
            }
        }
        boolean z6 = true;
        if (!this.f1220i ? this.f1217f != null || this.f1218g != null : this.f1219h != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1219h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1219h);
        }
        this.f1219h = drawable;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1220i && (drawable2 = this.f1219h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1220i ? !(this.f1217f != null || this.f1218g != null) : this.f1219h == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1218g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1218g);
        }
        this.f1218g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1221j && (drawable2 = this.f1218g) != null) {
                drawable2.setBounds(this.f1214c.getLeft(), this.f1214c.getTop(), this.f1214c.getRight(), this.f1214c.getBottom());
            }
        }
        boolean z6 = true;
        if (!this.f1220i ? this.f1217f != null || this.f1218g != null : this.f1219h != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(j1 j1Var) {
        View view = this.f1214c;
        if (view != null) {
            removeView(view);
        }
        this.f1214c = j1Var;
        if (j1Var != null) {
            addView(j1Var);
            ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            j1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z6) {
        this.f1213b = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f1217f;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f1218g;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f1219h;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1217f && !this.f1220i) || (drawable == this.f1218g && this.f1221j) || ((drawable == this.f1219h && this.f1220i) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.u1.I1(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.f9428a);
        this.f1217f = obtainStyledAttributes.getDrawable(a.m.f9436b);
        this.f1218g = obtainStyledAttributes.getDrawable(a.m.f9452d);
        this.f1222k = obtainStyledAttributes.getDimensionPixelSize(a.m.f9540o, -1);
        boolean z6 = true;
        if (getId() == a.g.f9150j0) {
            this.f1220i = true;
            this.f1219h = obtainStyledAttributes.getDrawable(a.m.f9444c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1220i ? this.f1217f != null || this.f1218g != null : this.f1219h != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}