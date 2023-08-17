package a0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.o;
import y.i;
import y.l;
import y.n;
/* loaded from: classes.dex */
public class f extends o {

    /* renamed from: n  reason: collision with root package name */
    public static final String f65n = "MotionPlaceholder";

    /* renamed from: m  reason: collision with root package name */
    public l f66m;

    public f(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public void H(y.f container, i helper, SparseArray<y.e> map) {
    }

    @Override // androidx.constraintlayout.widget.o
    public void J(n layout, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (layout == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        layout.v2(mode, size, mode2, size2);
        setMeasuredDimension(layout.q2(), layout.p2());
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        J(this.f66m, widthMeasureSpec, heightMeasureSpec);
    }

    @Override // androidx.constraintlayout.widget.o, androidx.constraintlayout.widget.b
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.f2144e = new l();
        I();
    }

    public f(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public f(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public f(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
    }
}
