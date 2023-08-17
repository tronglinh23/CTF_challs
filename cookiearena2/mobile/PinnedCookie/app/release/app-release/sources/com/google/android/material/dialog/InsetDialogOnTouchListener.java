package com.google.android.material.dialog;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import d.b1;
import d.o0;
@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class InsetDialogOnTouchListener implements View.OnTouchListener {
    @o0
    private final Dialog dialog;
    private final int leftInset;
    private final int prePieSlop;
    private final int topInset;

    public InsetDialogOnTouchListener(@o0 Dialog dialog, @o0 Rect rect) {
        this.dialog = dialog;
        this.leftInset = rect.left;
        this.topInset = rect.top;
        this.prePieSlop = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@o0 View view, @o0 MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.leftInset + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.topInset + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i7 = this.prePieSlop;
            obtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.dialog.onTouchEvent(obtain);
    }
}
