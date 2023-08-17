package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.t1;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t1 F = t1.F(context, attributeSet, R.styleable.TabItem);
        this.text = F.x(R.styleable.TabItem_android_text);
        this.icon = F.h(R.styleable.TabItem_android_icon);
        this.customLayout = F.u(R.styleable.TabItem_android_layout, 0);
        F.I();
    }
}