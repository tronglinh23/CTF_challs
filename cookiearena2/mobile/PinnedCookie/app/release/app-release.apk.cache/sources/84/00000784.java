package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6816a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Field f6817b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f6818c;

    public static void a(@d.o0 ImageView imageView, @d.q0 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix != null) {
            c(imageView, matrix);
        } else {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        }
    }

    public static void b() {
        if (f6818c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f6817b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f6818c = true;
    }

    @SuppressLint({"NewApi"})
    @d.w0(21)
    public static void c(@d.o0 ImageView imageView, @d.q0 Matrix matrix) {
        if (f6816a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f6816a = false;
            }
        }
    }
}