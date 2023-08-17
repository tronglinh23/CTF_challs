package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.k;
/* loaded from: classes.dex */
public abstract class o extends b {

    /* renamed from: k  reason: collision with root package name */
    public boolean f3456k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3457l;

    public o(Context context) {
        super(context);
    }

    public void J(y.n layout, int widthMeasureSpec, int heightMeasureSpec) {
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3456k || this.f3457l) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i7 = 0; i7 < this.f2142c; i7++) {
                    View viewById = constraintLayout.getViewById(this.f2141b[i7]);
                    if (viewById != null) {
                        if (this.f3456k) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f3457l && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void r(ConstraintLayout container) {
        q(container);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        p();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        p();
    }

    @Override // androidx.constraintlayout.widget.b
    public void y(AttributeSet attrs) {
        super.y(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.E6) {
                    this.f3456k = true;
                } else if (index == k.m.U6) {
                    this.f3457l = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public o(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public o(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
