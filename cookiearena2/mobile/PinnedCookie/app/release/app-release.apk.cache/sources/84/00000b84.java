package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.MaterialCheckable;
import d.b1;
import d.d0;
import d.q0;

@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public interface MaterialCheckable<T extends MaterialCheckable<T>> extends Checkable {

    /* loaded from: classes.dex */
    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C c7, boolean z6);
    }

    @d0
    int getId();

    void setInternalOnCheckedChangeListener(@q0 OnCheckedChangeListener<T> onCheckedChangeListener);
}