package k1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import d.b1;
import d.q0;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface e0 {
    @q0
    ColorStateList getSupportImageTintList();

    @q0
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@q0 ColorStateList colorStateList);

    void setSupportImageTintMode(@q0 PorterDuff.Mode mode);
}