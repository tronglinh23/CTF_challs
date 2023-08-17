package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.sidesheet.SheetCallback;
import d.d0;
import d.f;
import d.g1;
import d.j0;
import d.o0;
import d.q0;
import h1.f0;

/* loaded from: classes.dex */
public abstract class SheetDialog<C extends SheetCallback> extends o {
    private static final int COORDINATOR_LAYOUT_ID = R.id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = R.id.touch_outside;
    @q0
    private Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    @q0
    private FrameLayout container;
    boolean dismissWithAnimation;
    @q0
    private FrameLayout sheet;

    public SheetDialog(@o0 Context context, @g1 int i7, @f int i8, @g1 int i9) {
        super(context, getThemeResId(context, i7, i8, i9));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        supportRequestWindowFeature(1);
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), getLayoutResId(), null);
            this.container = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(getDialogId());
            this.sheet = frameLayout2;
            Sheet<C> behaviorFromSheet = getBehaviorFromSheet(frameLayout2);
            this.behavior = behaviorFromSheet;
            addSheetCancelOnHideCallback(behaviorFromSheet);
        }
    }

    public static /* synthetic */ void f(SheetDialog sheetDialog, View view) {
        sheetDialog.lambda$wrapInSheet$0(view);
    }

    @o0
    private FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    @o0
    private FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    private static int getThemeResId(@o0 Context context, @g1 int i7, @f int i8, @g1 int i9) {
        if (i7 == 0) {
            TypedValue typedValue = new TypedValue();
            return context.getTheme().resolveAttribute(i8, typedValue, true) ? typedValue.resourceId : i9;
        }
        return i7;
    }

    public /* synthetic */ void lambda$wrapInSheet$0(View view) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private View wrapInSheet(int i7, @q0 View view, @q0 ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (i7 != 0 && view == null) {
            view = getLayoutInflater().inflate(i7, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view);
        } else {
            sheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SheetDialog.f(SheetDialog.this, view2);
            }
        });
        u1.B1(getSheet(), new androidx.core.view.a() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            {
                SheetDialog.this = this;
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view2, @o0 f0 f0Var) {
                super.onInitializeAccessibilityNodeInfo(view2, f0Var);
                if (!SheetDialog.this.cancelable) {
                    f0Var.i1(false);
                    return;
                }
                f0Var.a(1048576);
                f0Var.i1(true);
            }

            @Override // androidx.core.view.a
            public boolean performAccessibilityAction(View view2, int i8, Bundle bundle) {
                if (i8 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.cancelable) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i8, bundle);
            }
        });
        return this.container;
    }

    public abstract void addSheetCancelOnHideCallback(Sheet<C> sheet);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet<C> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @o0
    public Sheet<C> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    @o0
    public abstract Sheet<C> getBehaviorFromSheet(@o0 FrameLayout frameLayout);

    @d0
    public abstract int getDialogId();

    @j0
    public abstract int getLayoutResId();

    public abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    @Override // androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void onStart() {
        super.onStart();
        Sheet<C> sheet = this.behavior;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.behavior.setState(getStateOnStart());
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z6) {
        super.setCancelable(z6);
        if (this.cancelable != z6) {
            this.cancelable = z6;
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z6) {
        super.setCanceledOnTouchOutside(z6);
        if (z6 && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z6;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public void setContentView(@j0 int i7) {
        super.setContentView(wrapInSheet(i7, null, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z6) {
        this.dismissWithAnimation = z6;
    }

    @Override // androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public void setContentView(@q0 View view) {
        super.setContentView(wrapInSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public void setContentView(@q0 View view, @q0 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view, layoutParams));
    }
}