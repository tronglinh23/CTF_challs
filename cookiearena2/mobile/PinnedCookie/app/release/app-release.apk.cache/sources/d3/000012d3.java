package k0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d.g1;
import v3.m2;

/* loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ <T> T a(Context context) {
        u4.l0.p(context, "<this>");
        u4.l0.y(4, "T");
        return (T) d.o(context, Object.class);
    }

    public static final void b(@n6.d Context context, @g1 int i7, @n6.d int[] iArr, @n6.d t4.l<? super TypedArray, m2> lVar) {
        u4.l0.p(context, "<this>");
        u4.l0.p(iArr, "attrs");
        u4.l0.p(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, iArr);
        u4.l0.o(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        lVar.O(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void c(@n6.d Context context, @n6.e AttributeSet attributeSet, @n6.d int[] iArr, @d.f int i7, @g1 int i8, @n6.d t4.l<? super TypedArray, m2> lVar) {
        u4.l0.p(context, "<this>");
        u4.l0.p(iArr, "attrs");
        u4.l0.p(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
        u4.l0.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        lVar.O(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, t4.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            attributeSet = null;
        }
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        u4.l0.p(context, "<this>");
        u4.l0.p(iArr, "attrs");
        u4.l0.p(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
        u4.l0.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        lVar.O(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}