package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
public class y {
    public static <T> ObjectAnimator a(T t6, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t6, property, (TypeConverter) null, path);
    }
}
