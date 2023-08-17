package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.h4;
import androidx.core.view.k1;
import androidx.core.view.o5;
import androidx.core.view.u1;
import com.google.android.material.R;
import d.b1;
import d.o0;
import d.q0;
import d.r;
import d.w0;
import java.util.ArrayList;
import java.util.List;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ViewUtils {
    @w0(16)
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    /* loaded from: classes.dex */
    public interface OnApplyWindowInsetsListener {
        h4 onApplyWindowInsets(View view, h4 h4Var, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(@q0 View view, @o0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @o0
    public static Rect calculateRectFromBounds(@o0 View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static void doOnApplyWindowInsets(@o0 View view, @q0 AttributeSet attributeSet, int i7, int i8) {
        doOnApplyWindowInsets(view, attributeSet, i7, i8, null);
    }

    public static float dpToPx(@o0 Context context, @r(unit = 0) int i7) {
        return TypedValue.applyDimension(1, i7, context.getResources().getDisplayMetrics());
    }

    @q0
    public static Integer getBackgroundColor(@o0 View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    @o0
    public static List<View> getChildren(@q0 View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                arrayList.add(viewGroup.getChildAt(i7));
            }
        }
        return arrayList;
    }

    @q0
    public static ViewGroup getContentView(@q0 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @q0
    public static ViewOverlayImpl getContentViewOverlay(@o0 View view) {
        return getOverlay(getContentView(view));
    }

    @q0
    private static InputMethodManager getInputMethodManager(@o0 View view) {
        return (InputMethodManager) k0.d.o(view.getContext(), InputMethodManager.class);
    }

    @q0
    public static ViewOverlayImpl getOverlay(@q0 View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static float getParentAbsoluteElevation(@o0 View view) {
        float f7 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f7 += u1.R((View) parent);
        }
        return f7;
    }

    public static void hideKeyboard(@o0 View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        return u1.Z(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i7, PorterDuff.Mode mode) {
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 9) {
                    switch (i7) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void removeOnGlobalLayoutListener(@q0 View view, @o0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(@o0 View view) {
        if (u1.O0(view)) {
            u1.v1(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.4
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@o0 View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    u1.v1(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(@o0 final View view) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    public static void setBoundsFromRect(@o0 View view, @o0 Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(@o0 View view) {
        showKeyboard(view, true);
    }

    @o0
    public static Rect calculateRectFromBounds(@o0 View view, int i7) {
        return new Rect(view.getLeft(), view.getTop() + i7, view.getRight(), view.getBottom() + i7);
    }

    public static void doOnApplyWindowInsets(@o0 View view, @q0 AttributeSet attributeSet, int i7, int i8, @q0 final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i7, i8);
        final boolean z6 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z7 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z8 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @o0
            public h4 onApplyWindowInsets(View view2, @o0 h4 h4Var, @o0 RelativePadding relativePadding) {
                if (z6) {
                    relativePadding.bottom += h4Var.o();
                }
                boolean isLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z7) {
                    if (isLayoutRtl) {
                        relativePadding.end += h4Var.p();
                    } else {
                        relativePadding.start += h4Var.p();
                    }
                }
                if (z8) {
                    if (isLayoutRtl) {
                        relativePadding.start += h4Var.q();
                    } else {
                        relativePadding.end += h4Var.q();
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, h4Var, relativePadding) : h4Var;
            }
        });
    }

    public static void hideKeyboard(@o0 View view, boolean z6) {
        o5 B0;
        if (z6 && (B0 = u1.B0(view)) != null) {
            B0.d(h4.m.d());
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void removeOnGlobalLayoutListener(@o0 ViewTreeObserver viewTreeObserver, @o0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void showKeyboard(@o0 View view, boolean z6) {
        o5 B0;
        if (z6 && (B0 = u1.B0(view)) != null) {
            B0.k(h4.m.d());
        } else {
            getInputMethodManager(view).showSoftInput(view, 1);
        }
    }

    /* loaded from: classes.dex */
    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i7, int i8, int i9, int i10) {
            this.start = i7;
            this.top = i8;
            this.end = i9;
            this.bottom = i10;
        }

        public void applyToView(View view) {
            u1.d2(view, this.start, this.top, this.end, this.bottom);
        }

        public RelativePadding(@o0 RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(@o0 View view, @o0 final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(u1.k0(view), view.getPaddingTop(), u1.j0(view), view.getPaddingBottom());
        u1.a2(view, new k1() { // from class: com.google.android.material.internal.ViewUtils.3
            @Override // androidx.core.view.k1
            public h4 onApplyWindowInsets(View view2, h4 h4Var) {
                return OnApplyWindowInsetsListener.this.onApplyWindowInsets(view2, h4Var, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }
}
