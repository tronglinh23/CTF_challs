package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import d.l;
import d.o0;
import d.q0;
import d.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(@o0 Context context) {
        this(context, null);
    }

    private void addConstraints(List<View> list, androidx.constraintlayout.widget.e eVar, int i7) {
        Iterator<View> it = list.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            eVar.M(it.next().getId(), R.id.circle_center, i7, f7);
            f7 += 360.0f / list.size();
        }
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    private static boolean shouldSkipView(View view) {
        return SKIP_TAG.equals(view.getTag());
    }

    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            view.setId(u1.D());
        }
        updateLayoutParamsAsync();
    }

    @r
    public int getLeveledRadius(int i7) {
        return i7 == 2 ? Math.round(this.radius * LEVEL_RADIUS_RATIO) : this.radius;
    }

    @r
    public int getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i7) {
        this.background.setFillColor(ColorStateList.valueOf(i7));
    }

    public void setRadius(@r int i7) {
        this.radius = i7;
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.H(this);
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != R.id.circle_center && !shouldSkipView(childAt)) {
                int i8 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i8 == null) {
                    i8 = 1;
                }
                if (!hashMap.containsKey(i8)) {
                    hashMap.put(i8, new ArrayList());
                }
                ((List) hashMap.get(i8)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            addConstraints((List) entry.getValue(), eVar, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        eVar.r(this);
    }

    public RadialViewGroup(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        u1.I1(this, createBackground());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i7, 0);
        this.radius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                RadialViewGroup.this.updateLayoutParams();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
