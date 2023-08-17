package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import d.b1;
import f.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: l  reason: collision with root package name */
    public static final String f1599l = "ACTVAutoSizeHelper";

    /* renamed from: n  reason: collision with root package name */
    public static final int f1601n = 12;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1602o = 112;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1603p = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final float f1606s = -1.0f;

    /* renamed from: t  reason: collision with root package name */
    public static final int f1607t = 1048576;

    /* renamed from: a  reason: collision with root package name */
    public int f1608a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1609b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f1610c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1611d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1612e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1613f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1614g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1615h;
    @d.o0

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1616i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1617j;

    /* renamed from: k  reason: collision with root package name */
    public final f f1618k;

    /* renamed from: m  reason: collision with root package name */
    public static final RectF f1600m = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: q  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1604q = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: r  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f1605r = new ConcurrentHashMap<>();

    @d.w0(16)
    /* loaded from: classes.dex */
    public static final class a {
        @d.u
        @d.o0
        public static StaticLayout a(@d.o0 CharSequence charSequence, @d.o0 Layout.Alignment alignment, int i7, @d.o0 TextView textView, @d.o0 TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i7, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @d.u
        public static int b(@d.o0 TextView textView) {
            return textView.getMaxLines();
        }
    }

    @d.w0(18)
    /* loaded from: classes.dex */
    public static final class b {
        @d.u
        public static boolean a(@d.o0 View view) {
            return view.isInLayout();
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static final class c {
        @d.u
        @d.o0
        public static StaticLayout a(@d.o0 CharSequence charSequence, @d.o0 Layout.Alignment alignment, int i7, int i8, @d.o0 TextView textView, @d.o0 TextPaint textPaint, @d.o0 f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i8 == -1) {
                i8 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i8);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w(g0.f1599l, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.appcompat.widget.g0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) g0.p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.appcompat.widget.g0.d, androidx.appcompat.widget.g0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.g0.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) g0.p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public g0(@d.o0 TextView textView) {
        this.f1616i = textView;
        this.f1617j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1618k = new e();
        } else {
            this.f1618k = new d();
        }
    }

    public static <T> T a(@d.o0 Object obj, @d.o0 String str, @d.o0 T t6) {
        try {
            Field m7 = m(str);
            return m7 == null ? t6 : (T) m7.get(obj);
        } catch (IllegalAccessException e7) {
            Log.w(f1599l, "Failed to access TextView#" + str + " member", e7);
            return t6;
        }
    }

    @d.q0
    public static Field m(@d.o0 String str) {
        try {
            Field field = f1605r.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1605r.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e7) {
            Log.w(f1599l, "Failed to access TextView#" + str + " member", e7);
            return null;
        }
    }

    @d.q0
    public static Method n(@d.o0 String str) {
        try {
            Method method = f1604q.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1604q.put(str, method);
            }
            return method;
        } catch (Exception e7) {
            Log.w(f1599l, "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static <T> T p(@d.o0 Object obj, @d.o0 String str, @d.o0 T t6) {
        try {
            return (T) n(str).invoke(obj, new Object[0]);
        } catch (Exception e7) {
            Log.w(f1599l, "Failed to invoke TextView#" + str + "() method", e7);
            return t6;
        }
    }

    public final boolean A(int i7, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1616i.getText();
        TransformationMethod transformationMethod = this.f1616i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1616i)) != null) {
            text = transformation;
        }
        int b7 = a.b(this.f1616i);
        o(i7);
        StaticLayout e7 = e(text, (Layout.Alignment) p(this.f1616i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b7);
        return (b7 == -1 || (e7.getLineCount() <= b7 && e7.getLineEnd(e7.getLineCount() - 1) == text.length())) && ((float) e7.getHeight()) <= rectF.bottom;
    }

    public final boolean B() {
        return !(this.f1616i instanceof m);
    }

    public final void C(float f7, float f8, float f9) throws IllegalArgumentException {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        } else if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        } else if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        } else {
            this.f1608a = 1;
            this.f1611d = f7;
            this.f1612e = f8;
            this.f1610c = f9;
            this.f1614g = false;
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void b() {
        if (q()) {
            if (this.f1609b) {
                if (this.f1616i.getMeasuredHeight() <= 0 || this.f1616i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1618k.b(this.f1616i) ? 1048576 : (this.f1616i.getMeasuredWidth() - this.f1616i.getTotalPaddingLeft()) - this.f1616i.getTotalPaddingRight();
                int height = (this.f1616i.getHeight() - this.f1616i.getCompoundPaddingBottom()) - this.f1616i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1600m;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float g7 = g(rectF);
                    if (g7 != this.f1616i.getTextSize()) {
                        w(0, g7);
                    }
                }
            }
            this.f1609b = true;
        }
    }

    public final int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    public final void d() {
        this.f1608a = 0;
        this.f1611d = -1.0f;
        this.f1612e = -1.0f;
        this.f1610c = -1.0f;
        this.f1613f = new int[0];
        this.f1609b = false;
    }

    @d.l1
    @d.o0
    public StaticLayout e(@d.o0 CharSequence charSequence, @d.o0 Layout.Alignment alignment, int i7, int i8) {
        return c.a(charSequence, alignment, i7, i8, this.f1616i, this.f1615h, this.f1618k);
    }

    public final StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i7) {
        return new StaticLayout(charSequence, this.f1615h, i7, alignment, ((Float) a(this.f1616i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f1616i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f1616i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    public final int g(RectF rectF) {
        int length = this.f1613f.length;
        if (length != 0) {
            int i7 = 1;
            int i8 = length - 1;
            int i9 = 0;
            while (i7 <= i8) {
                int i10 = (i7 + i8) / 2;
                if (A(this.f1613f[i10], rectF)) {
                    int i11 = i10 + 1;
                    i9 = i7;
                    i7 = i11;
                } else {
                    i9 = i10 - 1;
                    i8 = i9;
                }
            }
            return this.f1613f[i9];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int h() {
        return Math.round(this.f1612e);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int i() {
        return Math.round(this.f1611d);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int j() {
        return Math.round(this.f1610c);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int[] k() {
        return this.f1613f;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int l() {
        return this.f1608a;
    }

    @d.l1
    public void o(int i7) {
        TextPaint textPaint = this.f1615h;
        if (textPaint == null) {
            this.f1615h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1615h.set(this.f1616i.getPaint());
        this.f1615h.setTextSize(i7);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean q() {
        return B() && this.f1608a != 0;
    }

    public void r(@d.q0 AttributeSet attributeSet, int i7) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1617j.obtainStyledAttributes(attributeSet, a.m.f9590v0, i7, 0);
        TextView textView = this.f1616i;
        androidx.core.view.u1.z1(textView, textView.getContext(), a.m.f9590v0, attributeSet, obtainStyledAttributes, i7, 0);
        if (obtainStyledAttributes.hasValue(a.m.B0)) {
            this.f1608a = obtainStyledAttributes.getInt(a.m.B0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(a.m.A0) ? obtainStyledAttributes.getDimension(a.m.A0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(a.m.f9611y0) ? obtainStyledAttributes.getDimension(a.m.f9611y0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(a.m.f9604x0) ? obtainStyledAttributes.getDimension(a.m.f9604x0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(a.m.f9618z0) && (resourceId = obtainStyledAttributes.getResourceId(a.m.f9618z0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!B()) {
            this.f1608a = 0;
        } else if (this.f1608a == 1) {
            if (!this.f1614g) {
                DisplayMetrics displayMetrics = this.f1617j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                C(dimension2, dimension3, dimension);
            }
            x();
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void s(int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        if (B()) {
            DisplayMetrics displayMetrics = this.f1617j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (x()) {
                b();
            }
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void t(@d.o0 int[] iArr, int i7) throws IllegalArgumentException {
        if (B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1617j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                this.f1613f = c(iArr2);
                if (!z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1614g = false;
            }
            if (x()) {
                b();
            }
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void u(int i7) {
        if (B()) {
            if (i7 == 0) {
                d();
            } else if (i7 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i7);
            } else {
                DisplayMetrics displayMetrics = this.f1617j.getResources().getDisplayMetrics();
                C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (x()) {
                    b();
                }
            }
        }
    }

    public final void v(float f7) {
        if (f7 != this.f1616i.getPaint().getTextSize()) {
            this.f1616i.getPaint().setTextSize(f7);
            boolean a7 = b.a(this.f1616i);
            if (this.f1616i.getLayout() != null) {
                this.f1609b = false;
                try {
                    Method n7 = n("nullLayouts");
                    if (n7 != null) {
                        n7.invoke(this.f1616i, new Object[0]);
                    }
                } catch (Exception e7) {
                    Log.w(f1599l, "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (a7) {
                    this.f1616i.forceLayout();
                } else {
                    this.f1616i.requestLayout();
                }
                this.f1616i.invalidate();
            }
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void w(int i7, float f7) {
        Context context = this.f1617j;
        v(TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean x() {
        if (B() && this.f1608a == 1) {
            if (!this.f1614g || this.f1613f.length == 0) {
                int floor = ((int) Math.floor((this.f1612e - this.f1611d) / this.f1610c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round(this.f1611d + (i7 * this.f1610c));
                }
                this.f1613f = c(iArr);
            }
            this.f1609b = true;
        } else {
            this.f1609b = false;
        }
        return this.f1609b;
    }

    public final void y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = typedArray.getDimensionPixelSize(i7, -1);
            }
            this.f1613f = c(iArr);
            z();
        }
    }

    public final boolean z() {
        boolean z6 = this.f1613f.length > 0;
        this.f1614g = z6;
        if (z6) {
            this.f1608a = 1;
            this.f1611d = r0[0];
            this.f1612e = r0[r1 - 1];
            this.f1610c = -1.0f;
        }
        return z6;
    }
}
