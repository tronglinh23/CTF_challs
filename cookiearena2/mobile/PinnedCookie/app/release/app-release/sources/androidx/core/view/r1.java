package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
/* loaded from: classes.dex */
public interface r1 {
    @d.q0
    ColorStateList getSupportBackgroundTintList();

    @d.q0
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@d.q0 ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@d.q0 PorterDuff.Mode mode);
}
