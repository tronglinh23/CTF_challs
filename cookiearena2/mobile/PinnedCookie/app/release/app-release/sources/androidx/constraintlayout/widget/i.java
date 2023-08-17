package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class i extends View {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2462b;

    public i(Context context) {
        super(context);
        this.f2462b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean filter) {
        this.f2462b = filter;
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2462b && bVar.f2030a == margin) {
            return;
        }
        bVar.f2030a = margin;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2462b && bVar.f2032b == margin) {
            return;
        }
        bVar.f2032b = margin;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2462b && bVar.f2034c == ratio) {
            return;
        }
        bVar.f2034c = ratio;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public i(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2462b = true;
        super.setVisibility(8);
    }

    public i(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2462b = true;
        super.setVisibility(8);
    }

    public i(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f2462b = true;
        super.setVisibility(8);
    }
}
