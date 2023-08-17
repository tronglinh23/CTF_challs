package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.transition.b0;
import androidx.transition.j0;
import androidx.transition.z;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import d.d0;
import d.f;
import d.l;
import d.o0;
import d.q0;
import d.x;
import p0.a1;

/* loaded from: classes.dex */
class TransitionUtils {
    @f
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final RectF transformAlphaRectF = new RectF();

    /* loaded from: classes.dex */
    public interface CornerSizeBinaryOperator {
        @o0
        CornerSize apply(@o0 CornerSize cornerSize, @o0 CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    public static /* synthetic */ CornerSize a(RectF rectF, CornerSize cornerSize) {
        return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
    }

    public static float calculateArea(@o0 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return TransitionUtils.a(rectF, cornerSize);
            }
        });
    }

    public static Shader createColorShader(@l int i7) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i7, i7, Shader.TileMode.CLAMP);
    }

    @o0
    public static <T> T defaultIfNull(@q0 T t6, @o0 T t7) {
        return t6 != null ? t6 : t7;
    }

    public static View findAncestorById(View view, @d0 int i7) {
        String resourceName = view.getResources().getResourceName(i7);
        while (view != null) {
            if (view.getId() != i7) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    public static View findDescendantOrAncestorById(View view, @d0 int i7) {
        View findViewById = view.findViewById(i7);
        return findViewById != null ? findViewById : findAncestorById(view, i7);
    }

    public static RectF getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    public static RectF getRelativeBounds(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect getRelativeBoundsRect(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    public static float lerp(float f7, float f8, float f9) {
        return f7 + (f9 * (f8 - f7));
    }

    public static void maybeAddTransition(androidx.transition.o0 o0Var, @q0 j0 j0Var) {
        if (j0Var != null) {
            o0Var.E(j0Var);
        }
    }

    public static boolean maybeApplyThemeDuration(j0 j0Var, Context context, @f int i7) {
        int resolveThemeDuration;
        if (i7 == 0 || j0Var.getDuration() != -1 || (resolveThemeDuration = MotionUtils.resolveThemeDuration(context, i7, -1)) == -1) {
            return false;
        }
        j0Var.setDuration(resolveThemeDuration);
        return true;
    }

    public static boolean maybeApplyThemeInterpolator(j0 j0Var, Context context, @f int i7, TimeInterpolator timeInterpolator) {
        if (i7 == 0 || j0Var.getInterpolator() != null) {
            return false;
        }
        j0Var.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i7, timeInterpolator));
        return true;
    }

    public static boolean maybeApplyThemePath(j0 j0Var, Context context, @f int i7) {
        z resolveThemePath;
        if (i7 == 0 || (resolveThemePath = resolveThemePath(context, i7)) == null) {
            return false;
        }
        j0Var.setPathMotion(resolveThemePath);
        return true;
    }

    public static void maybeRemoveTransition(androidx.transition.o0 o0Var, @q0 j0 j0Var) {
        if (j0Var != null) {
            o0Var.O(j0Var);
        }
    }

    @q0
    public static z resolveThemePath(Context context, @f int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            int i8 = typedValue.type;
            if (i8 != 16) {
                if (i8 == 3) {
                    return new b0(a1.e(String.valueOf(typedValue.string)));
                }
                throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
            }
            int i9 = typedValue.data;
            if (i9 == 0) {
                return null;
            }
            if (i9 == 1) {
                return new MaterialArcMotion();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i9);
        }
        return null;
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i7) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i7);
    }

    public static void transform(Canvas canvas, Rect rect, float f7, float f8, float f9, int i7, CanvasCompat.CanvasOperation canvasOperation) {
        if (i7 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f7, f8);
        canvas.scale(f9, f9);
        if (i7 < 255) {
            saveLayerAlphaCompat(canvas, rect, i7);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(save);
    }

    public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (isShapeAppearanceSignificant(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }

    public static float lerp(float f7, float f8, @x(from = 0.0d, to = 1.0d) float f9, @x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11) {
        return lerp(f7, f8, f9, f10, f11, false);
    }

    public static float lerp(float f7, float f8, @x(from = 0.0d, to = 1.0d) float f9, @x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d) float f11, boolean z6) {
        if (!z6 || (f11 >= 0.0f && f11 <= 1.0f)) {
            return f11 < f9 ? f7 : f11 > f10 ? f8 : lerp(f7, f8, (f11 - f9) / (f10 - f9));
        }
        return lerp(f7, f8, f11);
    }

    public static int lerp(int i7, int i8, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f8, @x(from = 0.0d, to = 1.0d) float f9) {
        return f9 < f7 ? i7 : f9 > f8 ? i8 : (int) lerp(i7, i8, (f9 - f7) / (f8 - f7));
    }

    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, final RectF rectF, final RectF rectF2, @x(from = 0.0d, to = 1.0d) final float f7, @x(from = 0.0d, to = 1.0d) final float f8, @x(from = 0.0d, to = 1.0d) final float f9) {
        return f9 < f7 ? shapeAppearanceModel : f9 > f8 ? shapeAppearanceModel2 : transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1
            @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
            @o0
            public CornerSize apply(@o0 CornerSize cornerSize, @o0 CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f7, f8, f9));
            }
        });
    }
}