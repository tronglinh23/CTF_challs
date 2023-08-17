package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import d.b1;
import d.l;
import d.n1;
import d.o0;
import d.q0;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import q0.c;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DrawableUtils {
    private DrawableUtils() {
    }

    @q0
    public static Drawable compositeTwoLayeredDrawable(@q0 Drawable drawable, @q0 Drawable drawable2) {
        int intrinsicHeight;
        int i7;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
            i7 = intrinsicWidth;
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth2 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
            if (intrinsicWidth2 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                i7 = drawable.getIntrinsicWidth();
                intrinsicHeight = (int) (i7 / intrinsicWidth2);
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                i7 = (int) (intrinsicWidth2 * intrinsicHeight);
            }
        } else {
            i7 = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        layerDrawable.setLayerSize(1, i7, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @q0
    public static Drawable createTintableDrawableIfNeeded(@q0 Drawable drawable, @q0 ColorStateList colorStateList, @q0 PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @q0
    public static Drawable createTintableMutatedDrawableIfNeeded(@q0 Drawable drawable, @q0 ColorStateList colorStateList, @q0 PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @o0
    public static int[] getCheckedState(@o0 int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            if (i8 == 16842912) {
                return iArr;
            }
            if (i8 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i7] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    @o0
    public static int[] getUncheckedState(@o0 int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i7 = 0;
        for (int i8 : iArr) {
            if (i8 != 16842912) {
                iArr2[i7] = i8;
                i7++;
            }
        }
        return iArr2;
    }

    @o0
    public static AttributeSet parseDrawableXml(@o0 Context context, @n1 int i7, @o0 CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i7);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e7) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i7));
            notFoundException.initCause(e7);
            throw notFoundException;
        }
    }

    public static void setOutlineToPath(@o0 Outline outline, @o0 Path path) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            outline.setPath(path);
        } else if (i7 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(@q0 RippleDrawable rippleDrawable, int i7) {
        rippleDrawable.setRadius(i7);
    }

    public static void setTint(@o0 Drawable drawable, @l int i7) {
        if (i7 != 0) {
            c.n(drawable, i7);
        } else {
            c.o(drawable, null);
        }
    }

    @q0
    public static PorterDuffColorFilter updateTintFilter(@o0 Drawable drawable, @q0 ColorStateList colorStateList, @q0 PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    @q0
    private static Drawable createTintableMutatedDrawableIfNeeded(@q0 Drawable drawable, @q0 ColorStateList colorStateList, @q0 PorterDuff.Mode mode, boolean z6) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = c.r(drawable).mutate();
            if (mode != null) {
                c.p(drawable, mode);
            }
        } else if (z6) {
            drawable.mutate();
        }
        return drawable;
    }
}
