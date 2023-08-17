package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import f.a;
/* loaded from: classes.dex */
public class x extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    public final v f1806b;

    public x(@d.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap b7 = this.f1806b.b();
        if (b7 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b7.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }

    public x(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.I2);
    }

    public x(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        o1.a(this, getContext());
        v vVar = new v(this);
        this.f1806b = vVar;
        vVar.c(attributeSet, i7);
    }
}
