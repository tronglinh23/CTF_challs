package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.cardview.widget.g;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import d.q0;
import d.r;
import d.u0;
import d.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    @u0
    private final int selectorStrokeWidth;

    /* loaded from: classes.dex */
    public interface OnActionUpListener {
        void onActionUp(@x(from = 0.0d, to = 360.0d) float f7, boolean z6);
    }

    /* loaded from: classes.dex */
    public interface OnRotateListener {
        void onRotate(@x(from = 0.0d, to = 360.0d) float f7, boolean z6);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void adjustLevel(float f7, float f8) {
        this.currentLevel = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f7, f8) > ((float) getLeveledCircleRadius(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f7 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f7;
        float f8 = height;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f8;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f7, f8, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.paint);
        canvas.drawCircle(f7, f8, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f7, float f8) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f8 - (getHeight() / 2), f7 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    @r
    private int getLeveledCircleRadius(int i7) {
        return i7 == 2 ? Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }

    private Pair<Float, Float> getValuesForAnimation(float f7) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f7) > 180.0f) {
            if (handRotation > 180.0f && f7 < 180.0f) {
                f7 += 360.0f;
            }
            if (handRotation < 180.0f && f7 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f7));
    }

    private boolean handleTouchInput(float f7, float f8, boolean z6, boolean z7, boolean z8) {
        float degreesFromXY = getDegreesFromXY(f7, f8);
        boolean z9 = false;
        boolean z10 = getHandRotation() != degreesFromXY;
        if (z7 && z10) {
            return true;
        }
        if (z10 || z6) {
            if (z8 && this.animatingOnTouchUp) {
                z9 = true;
            }
            setHandRotation(degreesFromXY, z9);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHandRotation$0(ValueAnimator valueAnimator) {
        setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void setHandRotationInternal(@x(from = 0.0d, to = 360.0d) float f7, boolean z6) {
        float f8 = f7 % 360.0f;
        this.originalDeg = f8;
        this.degRad = Math.toRadians(f8 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = width + (((float) Math.cos(this.degRad)) * leveledCircleRadius);
        float sin = height + (leveledCircleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i7 = this.selectorRadius;
        rectF.set(cos - i7, sin - i7, cos + i7, sin + i7);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f8, z6);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    @x(from = g.f1896q, to = 360.0d)
    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        boolean z8;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        if (actionMasked == 0) {
            this.downX = x6;
            this.downY = y6;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z6 = false;
            z7 = false;
            z8 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i7 = (int) (x6 - this.downX);
            int i8 = (int) (y6 - this.downY);
            this.isInTapRegion = (i7 * i7) + (i8 * i8) > this.scaledTouchSlop;
            boolean z9 = this.changedDuringTouch;
            z6 = actionMasked == 1;
            if (this.isMultiLevel) {
                adjustLevel(x6, y6);
            }
            z8 = false;
            z7 = z9;
        } else {
            z6 = false;
            z7 = false;
            z8 = false;
        }
        boolean handleTouchInput = handleTouchInput(x6, y6, z7, z8, z6) | this.changedDuringTouch;
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z6 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x6, y6), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z6) {
        this.animatingOnTouchUp = z6;
    }

    public void setCircleRadius(@r int i7) {
        this.circleRadius = i7;
        invalidate();
    }

    public void setCurrentLevel(int i7) {
        this.currentLevel = i7;
        invalidate();
    }

    public void setHandRotation(@x(from = 0.0d, to = 360.0d) float f7) {
        setHandRotation(f7, false);
    }

    public void setMultiLevel(boolean z6) {
        if (this.isMultiLevel && !z6) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z6;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public ClockHandView(Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public void setHandRotation(@x(from = 0.0d, to = 360.0d) float f7, boolean z6) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z6) {
            setHandRotationInternal(f7, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f7);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.lambda$setHandRotation$0(valueAnimator2);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    public ClockHandView(Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i7, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        u1.R1(this, 2);
        obtainStyledAttributes.recycle();
    }
}
