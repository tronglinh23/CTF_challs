package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.collection.m;
import d.b;
import d.h1;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final m<String, MotionTiming> timings = new m<>();
    private final m<String, PropertyValuesHolder[]> propertyValues = new m<>();

    private static void addInfoFromAnimator(@o0 MotionSpec motionSpec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.createFromAnimator(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @o0
    private PropertyValuesHolder[] clonePropertyValuesHolder(@o0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i7 = 0; i7 < propertyValuesHolderArr.length; i7++) {
            propertyValuesHolderArr2[i7] = propertyValuesHolderArr[i7].clone();
        }
        return propertyValuesHolderArr2;
    }

    @q0
    public static MotionSpec createFromAttribute(@o0 Context context, @o0 TypedArray typedArray, @h1 int i7) {
        int resourceId;
        if (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    @q0
    public static MotionSpec createFromResource(@o0 Context context, @b int i7) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i7);
            if (loadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return createSpecFromAnimators(arrayList);
            }
            return null;
        } catch (Exception e7) {
            Log.w(TAG, "Can't load animation resource ID #0x" + Integer.toHexString(i7), e7);
            return null;
        }
    }

    @o0
    private static MotionSpec createSpecFromAnimators(@o0 List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            addInfoFromAnimator(motionSpec, list.get(i7));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.timings.equals(((MotionSpec) obj).timings);
        }
        return false;
    }

    @o0
    public <T> ObjectAnimator getAnimator(@o0 String str, @o0 T t6, @o0 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t6, getPropertyValues(str));
        ofPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @o0
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.propertyValues.get(str));
        }
        throw new IllegalArgumentException();
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.timings.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int size = this.timings.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            MotionTiming o6 = this.timings.o(i7);
            j7 = Math.max(j7, o6.getDelay() + o6.getDuration());
        }
        return j7;
    }

    public boolean hasPropertyValues(String str) {
        return this.propertyValues.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.timings.get(str) != null;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.propertyValues.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @q0 MotionTiming motionTiming) {
        this.timings.put(str, motionTiming);
    }

    @o0
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}