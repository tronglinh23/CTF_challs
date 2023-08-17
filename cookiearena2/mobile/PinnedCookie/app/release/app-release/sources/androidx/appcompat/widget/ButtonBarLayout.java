package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final int f1323e = 16;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1324b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1325c;

    /* renamed from: d  reason: collision with root package name */
    public int f1326d;

    public ButtonBarLayout(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1326d = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.f9558q3);
        androidx.core.view.u1.z1(this, context, a.m.f9558q3, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1324b = obtainStyledAttributes.getBoolean(a.m.f9565r3, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1324b);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f1325c != z6) {
            if (!z6 || this.f1324b) {
                this.f1325c = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View findViewById = findViewById(a.g.f9148i0);
                if (findViewById != null) {
                    findViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int a(int i7) {
        int childCount = getChildCount();
        while (i7 < childCount) {
            if (getChildAt(i7).getVisibility() == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public final boolean b() {
        return this.f1325c;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        boolean z6;
        int size = View.MeasureSpec.getSize(i7);
        int i10 = 0;
        if (this.f1324b) {
            if (size > this.f1326d && b()) {
                setStacked(false);
            }
            this.f1326d = size;
        }
        if (b() || View.MeasureSpec.getMode(i7) != 1073741824) {
            i9 = i7;
            z6 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(i9, i8);
        if (this.f1324b && !b()) {
            if ((getMeasuredWidthAndState() & androidx.core.view.u1.f3816t) == 16777216) {
                setStacked(true);
                z6 = true;
            }
        }
        if (z6) {
            super.onMeasure(i7, i8);
        }
        int a7 = a(0);
        if (a7 >= 0) {
            View childAt = getChildAt(a7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a8 = a(a7 + 1);
                if (a8 >= 0) {
                    paddingTop += getChildAt(a8).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i10 = paddingTop;
            } else {
                i10 = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.u1.e0(this) != i10) {
            setMinimumHeight(i10);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f1324b != z6) {
            this.f1324b = z6;
            if (!z6 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
