package com.google.android.material.timepicker;

import d.f1;
import d.g0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
interface TimePickerControls {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ActiveSelection {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ClockPeriod {
    }

    void setActiveSelection(int i7);

    void setHandRotation(float f7);

    void setValues(String[] strArr, @f1 int i7);

    void updateTime(int i7, int i8, @g0(from = 0) int i9);
}
