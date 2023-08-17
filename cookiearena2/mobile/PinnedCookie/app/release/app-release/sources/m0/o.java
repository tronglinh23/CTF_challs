package m0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import d.h1;
import d.r;
import d.w0;
import u4.l0;
/* loaded from: classes.dex */
public final class o {
    public static final void a(TypedArray typedArray, @h1 int i7) {
        if (!typedArray.hasValue(i7)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getBoolean(i7, false);
    }

    @d.l
    public static final int c(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getColor(i7, 0);
    }

    @n6.d
    public static final ColorStateList d(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        ColorStateList colorStateList = typedArray.getColorStateList(i7);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float e(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getDimension(i7, 0.0f);
    }

    @r
    public static final int f(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getDimensionPixelOffset(i7, 0);
    }

    @r
    public static final int g(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getDimensionPixelSize(i7, 0);
    }

    @n6.d
    public static final Drawable h(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        Drawable drawable = typedArray.getDrawable(i7);
        l0.m(drawable);
        return drawable;
    }

    public static final float i(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getFloat(i7, 0.0f);
    }

    @n6.d
    @w0(26)
    public static final Typeface j(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return n.a(typedArray, i7);
    }

    public static final int k(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getInt(i7, 0);
    }

    public static final int l(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getInteger(i7, 0);
    }

    @d.c
    public static final int m(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        return typedArray.getResourceId(i7, 0);
    }

    @n6.d
    public static final String n(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        String string = typedArray.getString(i7);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @n6.d
    public static final CharSequence[] o(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        CharSequence[] textArray = typedArray.getTextArray(i7);
        l0.o(textArray, "getTextArray(index)");
        return textArray;
    }

    @n6.d
    public static final CharSequence p(@n6.d TypedArray typedArray, @h1 int i7) {
        l0.p(typedArray, "<this>");
        a(typedArray, i7);
        CharSequence text = typedArray.getText(i7);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R q(@n6.d TypedArray typedArray, @n6.d t4.l<? super TypedArray, ? extends R> lVar) {
        l0.p(typedArray, "<this>");
        l0.p(lVar, "block");
        R O = lVar.O(typedArray);
        typedArray.recycle();
        return O;
    }
}
