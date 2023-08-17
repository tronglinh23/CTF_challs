package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
import java.util.HashMap;
/* loaded from: classes.dex */
public class p extends androidx.constraintlayout.widget.b implements q {

    /* renamed from: k  reason: collision with root package name */
    public boolean f7573k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7574l;

    /* renamed from: m  reason: collision with root package name */
    public float f7575m;

    /* renamed from: n  reason: collision with root package name */
    public View[] f7576n;

    public p(Context context) {
        super(context);
        this.f7573k = false;
        this.f7574l = false;
    }

    public void J(View view, float progress) {
    }

    @Override // c0.q
    public void a(Canvas canvas) {
    }

    @Override // c0.q
    public void b(Canvas canvas) {
    }

    @Override // c0.s.l
    public void c(s motionLayout, int startId, int endId) {
    }

    public void d(s motionLayout, int startId, int endId, float progress) {
    }

    public boolean e() {
        return false;
    }

    public void f(s motionLayout, HashMap<View, o> controllerMap) {
    }

    @Override // c0.s.l
    public void g(s motionLayout, int triggerId, boolean positive, float progress) {
    }

    @Override // c0.a
    public float getProgress() {
        return this.f7575m;
    }

    public void h(s motionLayout, int currentId) {
    }

    @Override // c0.q
    public boolean i() {
        return this.f7573k;
    }

    @Override // c0.q
    public boolean j() {
        return this.f7574l;
    }

    @Override // c0.q
    public void k(s motionLayout) {
    }

    @Override // c0.a
    public void setProgress(float progress) {
        this.f7575m = progress;
        int i7 = 0;
        if (this.f2142c > 0) {
            this.f7576n = w((ConstraintLayout) getParent());
            while (i7 < this.f2142c) {
                J(this.f7576n[i7], progress);
                i7++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i7 < childCount) {
            View childAt = viewGroup.getChildAt(i7);
            if (!(childAt instanceof p)) {
                J(childAt, progress);
            }
            i7++;
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void y(AttributeSet attrs) {
        super.y(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.Fj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.Hj) {
                    this.f7573k = obtainStyledAttributes.getBoolean(index, this.f7573k);
                } else if (index == k.m.Gj) {
                    this.f7574l = obtainStyledAttributes.getBoolean(index, this.f7574l);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public p(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f7573k = false;
        this.f7574l = false;
        y(attrs);
    }

    public p(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f7573k = false;
        this.f7574l = false;
        y(attrs);
    }
}
