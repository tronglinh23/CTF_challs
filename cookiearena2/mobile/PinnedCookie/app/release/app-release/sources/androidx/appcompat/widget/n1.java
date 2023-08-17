package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import com.google.android.material.color.utilities.Contrast;
import f.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class n1 extends CompoundButton implements v0 {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    @d.o0
    private o mAppCompatEmojiTextHelper;
    @d.q0
    private c mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    @d.q0
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final d0 mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;
    private static final Property<n1, Float> THUMB_POS = new a(Float.class, "thumbPos");
    private static final int[] CHECKED_STATE_SET = {16842912};

    /* loaded from: classes.dex */
    public class a extends Property<n1, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float get(n1 n1Var) {
            return Float.valueOf(n1Var.mThumbPosition);
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(n1 n1Var, Float f7) {
            n1Var.setThumbPosition(f7.floatValue());
        }
    }

    @d.w0(18)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static void a(ObjectAnimator objectAnimator, boolean z6) {
            objectAnimator.setAutoCancel(z6);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f.AbstractC0045f {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<n1> f1730a;

        public c(n1 n1Var) {
            this.f1730a = new WeakReference(n1Var);
        }

        @Override // androidx.emoji2.text.f.AbstractC0045f
        public void a(@d.q0 Throwable th) {
            n1 n1Var = this.f1730a.get();
            if (n1Var != null) {
                n1Var.onEmojiCompatInitializedForSwitchText();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0045f
        public void b() {
            n1 n1Var = this.f1730a.get();
            if (n1Var != null) {
                n1Var.onEmojiCompatInitializedForSwitchText();
            }
        }
    }

    public n1(@d.o0 Context context) {
        this(context, null);
    }

    public static float f(float f7, float f8, float f9) {
        return f7 < f8 ? f8 : f7 > f9 ? f9 : f7;
    }

    @d.o0
    private o getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new o(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((e2.b(this) ? 1.0f - this.mThumbPosition : this.mThumbPosition) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            Rect rect = this.mTempRect;
            drawable.getPadding(rect);
            Drawable drawable2 = this.mThumbDrawable;
            Rect d7 = drawable2 != null ? q0.d(drawable2) : q0.f1749c;
            return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - d7.left) - d7.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = g(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            m();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = g(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            m();
        }
    }

    public final void a(boolean z6) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, THUMB_POS, z6 ? 1.0f : 0.0f);
        this.mPositionAnimator = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.mPositionAnimator, true);
        this.mPositionAnimator.start();
    }

    public final void b() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable mutate = q0.c.r(drawable).mutate();
                this.mThumbDrawable = mutate;
                if (this.mHasThumbTint) {
                    q0.c.o(mutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    q0.c.p(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable mutate = q0.c.r(drawable).mutate();
                this.mTrackDrawable = mutate;
                if (this.mHasTrackTint) {
                    q0.c.o(mutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    q0.c.p(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        int i8;
        Rect rect = this.mTempRect;
        int i9 = this.mSwitchLeft;
        int i10 = this.mSwitchTop;
        int i11 = this.mSwitchRight;
        int i12 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.mThumbDrawable;
        Rect d7 = drawable != null ? q0.d(drawable) : q0.f1749c;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i13 = rect.left;
            thumbOffset += i13;
            if (d7 != null) {
                int i14 = d7.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = d7.top;
                int i16 = rect.top;
                i7 = i15 > i16 ? (i15 - i16) + i10 : i10;
                int i17 = d7.right;
                int i18 = rect.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = d7.bottom;
                int i20 = rect.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                    this.mTrackDrawable.setBounds(i9, i7, i11, i8);
                }
            } else {
                i7 = i10;
            }
            i8 = i12;
            this.mTrackDrawable.setBounds(i9, i7, i11, i8);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i21 = thumbOffset - rect.left;
            int i22 = thumbOffset + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                q0.c.l(background, i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            q0.c.k(drawable, f7, f8);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            q0.c.k(drawable2, f7, f8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean z6 = false;
        if (drawable != null && drawable.isStateful()) {
            z6 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            z6 |= drawable2.setState(drawableState);
        }
        if (z6) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    @d.q0
    public final CharSequence g(@d.q0 CharSequence charSequence) {
        TransformationMethod f7 = getEmojiTextViewHelper().f(this.mSwitchTransformationMethod);
        return f7 != null ? f7.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (e2.b(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (e2.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @d.q0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k1.v.G(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    @d.x(from = androidx.cardview.widget.g.f1896q, to = Contrast.RATIO_MIN)
    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    @d.q0
    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    @d.q0
    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    @d.q0
    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    @d.q0
    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    public final boolean h(float f7, float f8) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i7 = this.mSwitchTop;
        int i8 = this.mTouchSlop;
        int i9 = i7 - i8;
        int i10 = (this.mSwitchLeft + thumbOffset) - i8;
        int i11 = this.mThumbWidth + i10;
        Rect rect = this.mTempRect;
        return f7 > ((float) i10) && f7 < ((float) (((i11 + rect.left) + rect.right) + i8)) && f8 > ((float) i9) && f8 < ((float) (this.mSwitchBottom + i8));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // androidx.appcompat.widget.v0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOff;
            if (charSequence == null) {
                charSequence = getResources().getString(a.k.f9226g);
            }
            androidx.core.view.u1.q2(this, charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOn;
            if (charSequence == null) {
                charSequence = getResources().getString(a.k.f9227h);
            }
            androidx.core.view.u1.q2(this, charSequence);
        }
    }

    public final void l(int i7, int i8) {
        setSwitchTypeface(i7 != 1 ? i7 != 2 ? i7 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i8);
    }

    public final void m() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.b() && androidx.emoji2.text.f.n()) {
            androidx.emoji2.text.f b7 = androidx.emoji2.text.f.b();
            int f7 = b7.f();
            if (f7 == 3 || f7 == 0) {
                c cVar = new c(this);
                this.mEmojiCompatInitCallback = cVar;
                b7.y(cVar);
            }
        }
    }

    public final void n(MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean z6 = true;
        boolean z7 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z7) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) <= this.mMinFlingVelocity) {
                z6 = getTargetCheckedState();
            } else if (!e2.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z6 = false;
            }
        } else {
            z6 = isChecked;
        }
        if (z6 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z6);
        e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.mSwitchTop;
        int i8 = this.mSwitchBottom;
        int i9 = i7 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d7 = q0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d7.left;
                rect.right -= d7.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i9 + i10) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int width;
        int i12;
        int i13;
        int i14;
        int i15;
        super.onLayout(z6, i7, i8, i9, i10);
        int i16 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d7 = q0.d(this.mThumbDrawable);
            i11 = Math.max(0, d7.left - rect.left);
            i16 = Math.max(0, d7.right - rect.right);
        } else {
            i11 = 0;
        }
        if (e2.b(this)) {
            i12 = getPaddingLeft() + i11;
            width = ((this.mSwitchWidth + i12) - i11) - i16;
        } else {
            width = (getWidth() - getPaddingRight()) - i16;
            i12 = (width - this.mSwitchWidth) + i11 + i16;
        }
        int gravity = getGravity() & g0.f1602o;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i13 = this.mSwitchHeight;
            i14 = paddingTop - (i13 / 2);
        } else if (gravity == 80) {
            i15 = getHeight() - getPaddingBottom();
            i14 = i15 - this.mSwitchHeight;
            this.mSwitchLeft = i12;
            this.mSwitchTop = i14;
            this.mSwitchBottom = i15;
            this.mSwitchRight = width;
        } else {
            i14 = getPaddingTop();
            i13 = this.mSwitchHeight;
        }
        i15 = i13 + i14;
        this.mSwitchLeft = i12;
        this.mSwitchTop = i14;
        this.mSwitchBottom = i15;
        this.mSwitchRight = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = i(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = i(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int i11 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i9 = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            i10 = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            i9 = 0;
            i10 = 0;
        }
        this.mThumbWidth = Math.max(this.mShowText ? Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2) : 0, i9);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i11 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i12 = rect.left;
        int i13 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect d7 = q0.d(drawable3);
            i12 = Math.max(i12, d7.left);
            i13 = Math.max(i13, d7.right);
        }
        int max = this.mEnforceSwitchWidth ? Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + i12 + i13) : this.mSwitchMinWidth;
        int max2 = Math.max(i11, i10);
        this.mSwitchWidth = max;
        this.mSwitchHeight = max2;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.mTouchMode
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.mTouchX
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.e2.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.mThumbPosition
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.mThumbPosition
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.mTouchX = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.mTouchX
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.mTouchY
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.mTouchMode = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.mTouchX = r0
            r6.mTouchY = r3
            return r1
        L89:
            int r0 = r6.mTouchMode
            if (r0 != r2) goto L94
            r6.n(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.mTouchMode = r0
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.mTouchMode = r1
            r6.mTouchX = r0
            r6.mTouchY = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        super.setChecked(z6);
        boolean isChecked = isChecked();
        if (isChecked) {
            k();
        } else {
            j();
        }
        if (getWindowToken() != null && androidx.core.view.u1.U0(this)) {
            a(isChecked);
            return;
        }
        d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@d.q0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k1.v.H(this, callback));
    }

    @Override // androidx.appcompat.widget.v0
    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z6) {
        this.mEnforceSwitchWidth = z6;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@d.o0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z6) {
        if (this.mShowText != z6) {
            this.mShowText = z6;
            requestLayout();
            if (z6) {
                m();
            }
        }
    }

    public void setSplitTrack(boolean z6) {
        this.mSplitTrack = z6;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.mSwitchMinWidth = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.mSwitchPadding = i7;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i7) {
        t1 E = t1.E(context, i7, a.m.Y5);
        ColorStateList d7 = E.d(a.m.f9451c6);
        if (d7 != null) {
            this.mTextColors = d7;
        } else {
            this.mTextColors = getTextColors();
        }
        int g7 = E.g(a.m.Z5, 0);
        if (g7 != 0) {
            float f7 = g7;
            if (f7 != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f7);
                requestLayout();
            }
        }
        l(E.o(a.m.f9435a6, -1), E.o(a.m.f9443b6, -1));
        if (E.a(a.m.f9539n6, false)) {
            this.mSwitchTransformationMethod = new i.a(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        E.I();
    }

    public void setSwitchTypeface(Typeface typeface, int i7) {
        Typeface create;
        if (i7 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i7);
            } else {
                create = Typeface.create(typeface, i7);
            }
            setSwitchTypeface(create);
            int i8 = (~(create != null ? create.getStyle() : 0)) & i7;
            this.mTextPaint.setFakeBoldText((i8 & 1) != 0);
            this.mTextPaint.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        j();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            k();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f7) {
        this.mThumbPosition = f7;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(g.a.b(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.mThumbTextPadding = i7;
        requestLayout();
    }

    public void setThumbTintList(@d.q0 ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        b();
    }

    public void setThumbTintMode(@d.q0 PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(g.a.b(getContext(), i7));
    }

    public void setTrackTintList(@d.q0 ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        c();
    }

    public void setTrackTintMode(@d.q0 PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public n1(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f8900l3);
    }

    public n1(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        o1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        t1 G = t1.G(context, attributeSet, a.m.J5, i7, 0);
        androidx.core.view.u1.z1(this, context, a.m.J5, attributeSet, G.B(), i7, 0);
        Drawable h7 = G.h(a.m.M5);
        this.mThumbDrawable = h7;
        if (h7 != null) {
            h7.setCallback(this);
        }
        Drawable h8 = G.h(a.m.V5);
        this.mTrackDrawable = h8;
        if (h8 != null) {
            h8.setCallback(this);
        }
        setTextOnInternal(G.x(a.m.K5));
        setTextOffInternal(G.x(a.m.L5));
        this.mShowText = G.a(a.m.N5, true);
        this.mThumbTextPadding = G.g(a.m.S5, 0);
        this.mSwitchMinWidth = G.g(a.m.P5, 0);
        this.mSwitchPadding = G.g(a.m.Q5, 0);
        this.mSplitTrack = G.a(a.m.O5, false);
        ColorStateList d7 = G.d(a.m.T5);
        if (d7 != null) {
            this.mThumbTintList = d7;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode e7 = q0.e(G.o(a.m.U5, -1), null);
        if (this.mThumbTintMode != e7) {
            this.mThumbTintMode = e7;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            b();
        }
        ColorStateList d8 = G.d(a.m.W5);
        if (d8 != null) {
            this.mTrackTintList = d8;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode e8 = q0.e(G.o(a.m.X5, -1), null);
        if (this.mTrackTintMode != e8) {
            this.mTrackTintMode = e8;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            c();
        }
        int u6 = G.u(a.m.R5, 0);
        if (u6 != 0) {
            setSwitchTextAppearance(context, u6);
        }
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.m(attributeSet, i7);
        G.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i7);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
