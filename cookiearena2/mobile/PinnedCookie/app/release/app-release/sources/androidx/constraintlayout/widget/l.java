package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
import androidx.constraintlayout.widget.m;
import c0.s;
/* loaded from: classes.dex */
public class l extends View implements m.a {

    /* renamed from: b  reason: collision with root package name */
    public int f3429b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3430c;

    /* renamed from: d  reason: collision with root package name */
    public int f3431d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3432e;

    public l(Context context) {
        super(context);
        this.f3429b = -1;
        this.f3430c = false;
        this.f3431d = 0;
        this.f3432e = true;
        super.setVisibility(8);
        c(null);
    }

    @Override // androidx.constraintlayout.widget.m.a
    public void a(int key, int newValue, int oldValue) {
        setGuidelineBegin(newValue);
        int id = getId();
        if (id > 0 && (getParent() instanceof s)) {
            s sVar = (s) getParent();
            int currentState = sVar.getCurrentState();
            int i7 = this.f3431d;
            if (i7 != 0) {
                currentState = i7;
            }
            int i8 = 0;
            if (!this.f3430c) {
                if (!this.f3432e) {
                    b(newValue, id, sVar, currentState);
                    return;
                }
                int[] constraintSetIds = sVar.getConstraintSetIds();
                while (i8 < constraintSetIds.length) {
                    b(newValue, id, sVar, constraintSetIds[i8]);
                    i8++;
                }
                return;
            }
            if (this.f3432e) {
                int[] constraintSetIds2 = sVar.getConstraintSetIds();
                while (i8 < constraintSetIds2.length) {
                    int i9 = constraintSetIds2[i8];
                    if (i9 != currentState) {
                        b(newValue, id, sVar, i9);
                    }
                    i8++;
                }
            }
            e L = sVar.L(currentState);
            L.d1(id, newValue);
            sVar.K0(currentState, L, 1000);
        }
    }

    public final void b(int newValue, int id, s motionLayout, int currentState) {
        e Z = motionLayout.Z(currentState);
        Z.d1(id, newValue);
        motionLayout.J0(currentState, Z);
    }

    public final void c(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.J8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.N8) {
                    this.f3429b = obtainStyledAttributes.getResourceId(index, this.f3429b);
                } else if (index == k.m.K8) {
                    this.f3430c = obtainStyledAttributes.getBoolean(index, this.f3430c);
                } else if (index == k.m.M8) {
                    this.f3431d = obtainStyledAttributes.getResourceId(index, this.f3431d);
                } else if (index == k.m.L8) {
                    this.f3432e = obtainStyledAttributes.getBoolean(index, this.f3432e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f3429b != -1) {
            ConstraintLayout.getSharedValues().a(this.f3429b, this);
        }
    }

    public boolean d() {
        return this.f3430c;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f3431d;
    }

    public int getAttributeId() {
        return this.f3429b;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean animate) {
        this.f3430c = animate;
    }

    public void setApplyToConstraintSetId(int id) {
        this.f3431d = id;
    }

    public void setAttributeId(int id) {
        m sharedValues = ConstraintLayout.getSharedValues();
        int i7 = this.f3429b;
        if (i7 != -1) {
            sharedValues.e(i7, this);
        }
        this.f3429b = id;
        if (id != -1) {
            sharedValues.a(id, this);
        }
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f2030a = margin;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f2032b = margin;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f2034c = ratio;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public l(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f3429b = -1;
        this.f3430c = false;
        this.f3431d = 0;
        this.f3432e = true;
        super.setVisibility(8);
        c(attrs);
    }

    public l(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f3429b = -1;
        this.f3430c = false;
        this.f3431d = 0;
        this.f3432e = true;
        super.setVisibility(8);
        c(attrs);
    }

    public l(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f3429b = -1;
        this.f3430c = false;
        this.f3431d = 0;
        this.f3432e = true;
        super.setVisibility(8);
        c(attrs);
    }
}
