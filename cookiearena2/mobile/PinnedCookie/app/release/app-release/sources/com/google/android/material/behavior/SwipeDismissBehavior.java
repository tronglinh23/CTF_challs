package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import androidx.customview.widget.d;
import d.l1;
import d.o0;
import h1.f0;
import h1.q0;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    d viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final d.c dragCallback = new d.c() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@o0 View view, float f7) {
            int i7 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i7 == 0) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z6 = u1.Z(view) == 1;
            int i8 = SwipeDismissBehavior.this.swipeDirection;
            if (i8 == 2) {
                return true;
            }
            if (i8 == 0) {
                if (z6) {
                    if (f7 >= 0.0f) {
                        return false;
                    }
                } else if (i7 <= 0) {
                    return false;
                }
                return true;
            } else if (i8 == 1) {
                if (z6) {
                    if (i7 <= 0) {
                        return false;
                    }
                } else if (f7 >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionHorizontal(@o0 View view, int i7, int i8) {
            int width;
            int width2;
            int width3;
            boolean z6 = u1.Z(view) == 1;
            int i9 = SwipeDismissBehavior.this.swipeDirection;
            if (i9 == 0) {
                if (z6) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i9 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z6) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i7, width2);
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionVertical(@o0 View view, int i7, int i8) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int getViewHorizontalDragRange(@o0 View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.d.c
        public void onViewCaptured(@o0 View view, int i7) {
            this.activePointerId = i7;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // androidx.customview.widget.d.c
        public void onViewDragStateChanged(int i7) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i7);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void onViewPositionChanged(@o0 View view, int i7, int i8, int i9, int i10) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float abs = Math.abs(i7 - this.originalCapturedViewLeft);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.d.c
        public void onViewReleased(@o0 View view, float f7, float f8) {
            int i7;
            boolean z6;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f7)) {
                if (f7 >= 0.0f) {
                    int left = view.getLeft();
                    int i8 = this.originalCapturedViewLeft;
                    if (left >= i8) {
                        i7 = i8 + width;
                        z6 = true;
                    }
                }
                i7 = this.originalCapturedViewLeft - width;
                z6 = true;
            } else {
                i7 = this.originalCapturedViewLeft;
                z6 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.V(i7, view.getTop())) {
                u1.p1(view, new SettleRunnable(view, z6));
            } else if (!z6 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
            } else {
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean tryCaptureView(View view, int i7) {
            int i8 = this.activePointerId;
            return (i8 == -1 || i8 == i7) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    /* loaded from: classes.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i7);
    }

    /* loaded from: classes.dex */
    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z6) {
            this.view = view;
            this.dismiss = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            d dVar = SwipeDismissBehavior.this.viewDragHelper;
            if (dVar != null && dVar.o(true)) {
                u1.p1(this.view, this);
            } else if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
            } else {
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f7, float f8, float f9) {
        return Math.min(Math.max(f7, f8), f9);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? d.p(viewGroup, this.sensitivity, this.dragCallback) : d.q(viewGroup, this.dragCallback);
        }
    }

    public static float fraction(float f7, float f8, float f9) {
        return (f9 - f7) / (f8 - f7);
    }

    private void updateAccessibilityActions(View view) {
        u1.r1(view, 1048576);
        if (canSwipeDismissView(view)) {
            u1.u1(view, f0.a.f10228z, null, new q0() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // h1.q0
                public boolean perform(@o0 View view2, @d.q0 q0.a aVar) {
                    boolean z6 = false;
                    if (SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        boolean z7 = u1.Z(view2) == 1;
                        int i7 = SwipeDismissBehavior.this.swipeDirection;
                        if ((i7 == 0 && z7) || (i7 == 1 && !z7)) {
                            z6 = true;
                        }
                        int width = view2.getWidth();
                        if (z6) {
                            width = -width;
                        }
                        u1.e1(view2, width);
                        view2.setAlpha(0.0f);
                        OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                        if (onDismissListener != null) {
                            onDismissListener.onDismiss(view2);
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@o0 View view) {
        return true;
    }

    public int getDragState() {
        d dVar = this.viewDragHelper;
        if (dVar != null) {
            return dVar.F();
        }
        return 0;
    }

    @d.q0
    @l1
    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, @o0 MotionEvent motionEvent) {
        boolean z6 = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z6 = coordinatorLayout.isPointInChildBounds(v6, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z6;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (z6) {
            ensureViewDragHelper(coordinatorLayout);
            return !this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.W(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@o0 CoordinatorLayout coordinatorLayout, @o0 V v6, int i7) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v6, i7);
        if (u1.V(v6) == 0) {
            u1.R1(v6, 1);
            updateAccessibilityActions(v6);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v6, MotionEvent motionEvent) {
        if (this.viewDragHelper != null) {
            if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
                return true;
            }
            this.viewDragHelper.M(motionEvent);
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f7) {
        this.dragDismissThreshold = clamp(0.0f, f7, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f7) {
        this.alphaEndSwipeDistance = clamp(0.0f, f7, 1.0f);
    }

    public void setListener(@d.q0 OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f7) {
        this.sensitivity = f7;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f7) {
        this.alphaStartSwipeDistance = clamp(0.0f, f7, 1.0f);
    }

    public void setSwipeDirection(int i7) {
        this.swipeDirection = i7;
    }

    public static int clamp(int i7, int i8, int i9) {
        return Math.min(Math.max(i7, i8), i9);
    }
}
