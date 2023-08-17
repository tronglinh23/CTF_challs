package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public abstract class DayViewDecorator implements Parcelable {
    @q0
    public ColorStateList getBackgroundColor(@o0 Context context, int i7, int i8, int i9, boolean z6, boolean z7) {
        return null;
    }

    @q0
    public Drawable getCompoundDrawableBottom(@o0 Context context, int i7, int i8, int i9, boolean z6, boolean z7) {
        return null;
    }

    @q0
    public Drawable getCompoundDrawableLeft(@o0 Context context, int i7, int i8, int i9, boolean z6, boolean z7) {
        return null;
    }

    @q0
    public Drawable getCompoundDrawableRight(@o0 Context context, int i7, int i8, int i9, boolean z6, boolean z7) {
        return null;
    }

    @q0
    public Drawable getCompoundDrawableTop(@o0 Context context, int i7, int i8, int i9, boolean z6, boolean z7) {
        return null;
    }

    @q0
    public CharSequence getContentDescription(@o0 Context context, int i7, int i8, int i9, boolean z6, boolean z7, @q0 CharSequence charSequence) {
        return charSequence;
    }

    public void initialize(@o0 Context context) {
    }
}