package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import d.b1;
import d.o0;
import d.q0;
@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class TouchObserverFrameLayout extends FrameLayout {
    @q0
    private View.OnTouchListener onTouchListener;

    public TouchObserverFrameLayout(@o0 Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.onTouchListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnTouchListener(@q0 View.OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }

    public TouchObserverFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchObserverFrameLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
