package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.b1;
import m0.i;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1796a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1797b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1798c;

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @d.u
        public static int b(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    public t1(Context context, TypedArray typedArray) {
        this.f1796a = context;
        this.f1797b = typedArray;
    }

    public static t1 E(Context context, int i7, int[] iArr) {
        return new t1(context, context.obtainStyledAttributes(i7, iArr));
    }

    public static t1 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static t1 G(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        return new t1(context, context.obtainStyledAttributes(attributeSet, iArr, i7, i8));
    }

    public boolean A(int i7, TypedValue typedValue) {
        return this.f1797b.getValue(i7, typedValue);
    }

    public TypedArray B() {
        return this.f1797b;
    }

    public boolean C(int i7) {
        return this.f1797b.hasValue(i7);
    }

    public int D() {
        return this.f1797b.length();
    }

    public TypedValue H(int i7) {
        return this.f1797b.peekValue(i7);
    }

    public void I() {
        this.f1797b.recycle();
    }

    public boolean a(int i7, boolean z6) {
        return this.f1797b.getBoolean(i7, z6);
    }

    @d.w0(21)
    public int b() {
        return a.a(this.f1797b);
    }

    public int c(int i7, int i8) {
        return this.f1797b.getColor(i7, i8);
    }

    public ColorStateList d(int i7) {
        int resourceId;
        ColorStateList a7;
        return (!this.f1797b.hasValue(i7) || (resourceId = this.f1797b.getResourceId(i7, 0)) == 0 || (a7 = g.a.a(this.f1796a, resourceId)) == null) ? this.f1797b.getColorStateList(i7) : a7;
    }

    public float e(int i7, float f7) {
        return this.f1797b.getDimension(i7, f7);
    }

    public int f(int i7, int i8) {
        return this.f1797b.getDimensionPixelOffset(i7, i8);
    }

    public int g(int i7, int i8) {
        return this.f1797b.getDimensionPixelSize(i7, i8);
    }

    public Drawable h(int i7) {
        int resourceId;
        return (!this.f1797b.hasValue(i7) || (resourceId = this.f1797b.getResourceId(i7, 0)) == 0) ? this.f1797b.getDrawable(i7) : g.a.b(this.f1796a, resourceId);
    }

    public Drawable i(int i7) {
        int resourceId;
        if (!this.f1797b.hasValue(i7) || (resourceId = this.f1797b.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return l.b().d(this.f1796a, resourceId, true);
    }

    public float j(int i7, float f7) {
        return this.f1797b.getFloat(i7, f7);
    }

    @d.q0
    public Typeface k(@d.h1 int i7, int i8, @d.q0 i.g gVar) {
        int resourceId = this.f1797b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1798c == null) {
            this.f1798c = new TypedValue();
        }
        return m0.i.k(this.f1796a, resourceId, this.f1798c, i8, gVar);
    }

    public float l(int i7, int i8, int i9, float f7) {
        return this.f1797b.getFraction(i7, i8, i9, f7);
    }

    public int m(int i7) {
        return this.f1797b.getIndex(i7);
    }

    public int n() {
        return this.f1797b.getIndexCount();
    }

    public int o(int i7, int i8) {
        return this.f1797b.getInt(i7, i8);
    }

    public int p(int i7, int i8) {
        return this.f1797b.getInteger(i7, i8);
    }

    public int q(int i7, int i8) {
        return this.f1797b.getLayoutDimension(i7, i8);
    }

    public int r(int i7, String str) {
        return this.f1797b.getLayoutDimension(i7, str);
    }

    public String s(int i7) {
        return this.f1797b.getNonResourceString(i7);
    }

    public String t() {
        return this.f1797b.getPositionDescription();
    }

    public int u(int i7, int i8) {
        return this.f1797b.getResourceId(i7, i8);
    }

    public Resources v() {
        return this.f1797b.getResources();
    }

    public String w(int i7) {
        return this.f1797b.getString(i7);
    }

    public CharSequence x(int i7) {
        return this.f1797b.getText(i7);
    }

    public CharSequence[] y(int i7) {
        return this.f1797b.getTextArray(i7);
    }

    public int z(int i7) {
        return a.b(this.f1797b, i7);
    }
}
