package q0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import u4.l0;
/* loaded from: classes.dex */
public final class a {
    @n6.d
    public static final BitmapDrawable a(@n6.d Bitmap bitmap, @n6.d Resources resources) {
        l0.p(bitmap, "<this>");
        l0.p(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
