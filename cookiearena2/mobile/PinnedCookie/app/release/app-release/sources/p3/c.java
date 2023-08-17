package p3;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.g0;
import androidx.core.view.u1;
import d.l;
import d.o0;
import d.q0;
import d.x;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k1.v;
import p3.d;
@d.e
/* loaded from: classes.dex */
public class c extends ViewGroup {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f14658p = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f14659q = {16843660};

    /* renamed from: r  reason: collision with root package name */
    public static final float f14660r = 0.6f;

    /* renamed from: s  reason: collision with root package name */
    public static final int f14661s = 16;

    /* renamed from: b  reason: collision with root package name */
    public d f14662b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f14663c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f14664d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f14665e;

    /* renamed from: f  reason: collision with root package name */
    public int f14666f;

    /* renamed from: g  reason: collision with root package name */
    public float f14667g;

    /* renamed from: h  reason: collision with root package name */
    public int f14668h;

    /* renamed from: i  reason: collision with root package name */
    public int f14669i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14670j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14671k;

    /* renamed from: l  reason: collision with root package name */
    public final a f14672l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<p3.a> f14673m;

    /* renamed from: n  reason: collision with root package name */
    public int f14674n;

    /* renamed from: o  reason: collision with root package name */
    public int f14675o;

    /* loaded from: classes.dex */
    public class a extends DataSetObserver implements d.j, d.i {

        /* renamed from: a  reason: collision with root package name */
        public int f14676a;

        public a() {
        }

        @Override // p3.d.i
        public void onAdapterChanged(d dVar, p3.a aVar, p3.a aVar2) {
            c.this.b(aVar, aVar2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            c cVar = c.this;
            cVar.c(cVar.f14662b.getCurrentItem(), c.this.f14662b.getAdapter());
            c cVar2 = c.this;
            float f7 = cVar2.f14667g;
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            cVar2.d(cVar2.f14662b.getCurrentItem(), f7, true);
        }

        @Override // p3.d.j
        public void onPageScrollStateChanged(int i7) {
            this.f14676a = i7;
        }

        @Override // p3.d.j
        public void onPageScrolled(int i7, float f7, int i8) {
            if (f7 > 0.5f) {
                i7++;
            }
            c.this.d(i7, f7, false);
        }

        @Override // p3.d.j
        public void onPageSelected(int i7) {
            if (this.f14676a == 0) {
                c cVar = c.this;
                cVar.c(cVar.f14662b.getCurrentItem(), c.this.f14662b.getAdapter());
                c cVar2 = c.this;
                float f7 = cVar2.f14667g;
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                cVar2.d(cVar2.f14662b.getCurrentItem(), f7, true);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends SingleLineTransformationMethod {

        /* renamed from: a  reason: collision with root package name */
        public Locale f14678a;

        public b(Context context) {
            this.f14678a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f14678a);
            }
            return null;
        }
    }

    public c(@o0 Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i7, float f7) {
        this.f14663c.setTextSize(i7, f7);
        this.f14664d.setTextSize(i7, f7);
        this.f14665e.setTextSize(i7, f7);
    }

    public void b(p3.a aVar, p3.a aVar2) {
        if (aVar != null) {
            aVar.u(this.f14672l);
            this.f14673m = null;
        }
        if (aVar2 != null) {
            aVar2.m(this.f14672l);
            this.f14673m = new WeakReference<>(aVar2);
        }
        d dVar = this.f14662b;
        if (dVar != null) {
            this.f14666f = -1;
            this.f14667g = -1.0f;
            c(dVar.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public void c(int i7, p3.a aVar) {
        int e7 = aVar != null ? aVar.e() : 0;
        this.f14670j = true;
        CharSequence charSequence = null;
        this.f14663c.setText((i7 < 1 || aVar == null) ? null : aVar.g(i7 - 1));
        this.f14664d.setText((aVar == null || i7 >= e7) ? null : aVar.g(i7));
        int i8 = i7 + 1;
        if (i8 < e7 && aVar != null) {
            charSequence = aVar.g(i8);
        }
        this.f14665e.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f14663c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f14664d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f14665e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f14666f = i7;
        if (!this.f14671k) {
            d(i7, this.f14667g, false);
        }
        this.f14670j = false;
    }

    public void d(int i7, float f7, boolean z6) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (i7 != this.f14666f) {
            c(i7, this.f14662b.getAdapter());
        } else if (!z6 && f7 == this.f14667g) {
            return;
        }
        this.f14671k = true;
        int measuredWidth = this.f14663c.getMeasuredWidth();
        int measuredWidth2 = this.f14664d.getMeasuredWidth();
        int measuredWidth3 = this.f14665e.getMeasuredWidth();
        int i12 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i13 = paddingRight + i12;
        int i14 = (width - (paddingLeft + i12)) - i13;
        float f8 = 0.5f + f7;
        if (f8 > 1.0f) {
            f8 -= 1.0f;
        }
        int i15 = ((width - i13) - ((int) (i14 * f8))) - i12;
        int i16 = measuredWidth2 + i15;
        int baseline = this.f14663c.getBaseline();
        int baseline2 = this.f14664d.getBaseline();
        int baseline3 = this.f14665e.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i17 = max - baseline;
        int i18 = max - baseline2;
        int i19 = max - baseline3;
        int max2 = Math.max(Math.max(this.f14663c.getMeasuredHeight() + i17, this.f14664d.getMeasuredHeight() + i18), this.f14665e.getMeasuredHeight() + i19);
        int i20 = this.f14669i & g0.f1602o;
        if (i20 == 16) {
            i8 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i20 != 80) {
            i9 = i17 + paddingTop;
            i10 = i18 + paddingTop;
            i11 = paddingTop + i19;
            TextView textView = this.f14664d;
            textView.layout(i15, i10, i16, textView.getMeasuredHeight() + i10);
            int min = Math.min(paddingLeft, (i15 - this.f14668h) - measuredWidth);
            TextView textView2 = this.f14663c;
            textView2.layout(min, i9, measuredWidth + min, textView2.getMeasuredHeight() + i9);
            int max3 = Math.max((width - paddingRight) - measuredWidth3, i16 + this.f14668h);
            TextView textView3 = this.f14665e;
            textView3.layout(max3, i11, max3 + measuredWidth3, textView3.getMeasuredHeight() + i11);
            this.f14667g = f7;
            this.f14671k = false;
        } else {
            i8 = (height - paddingBottom) - max2;
        }
        i9 = i17 + i8;
        i10 = i18 + i8;
        i11 = i8 + i19;
        TextView textView4 = this.f14664d;
        textView4.layout(i15, i10, i16, textView4.getMeasuredHeight() + i10);
        int min2 = Math.min(paddingLeft, (i15 - this.f14668h) - measuredWidth);
        TextView textView22 = this.f14663c;
        textView22.layout(min2, i9, measuredWidth + min2, textView22.getMeasuredHeight() + i9);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i16 + this.f14668h);
        TextView textView32 = this.f14665e;
        textView32.layout(max32, i11, max32 + measuredWidth3, textView32.getMeasuredHeight() + i11);
        this.f14667g = f7;
        this.f14671k = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f14668h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof d)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        d dVar = (d) parent;
        p3.a adapter = dVar.getAdapter();
        dVar.V(this.f14672l);
        dVar.b(this.f14672l);
        this.f14662b = dVar;
        WeakReference<p3.a> weakReference = this.f14673m;
        b(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.f14662b;
        if (dVar != null) {
            b(dVar.getAdapter(), null);
            this.f14662b.V(null);
            this.f14662b.N(this.f14672l);
            this.f14662b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (this.f14662b != null) {
            float f7 = this.f14667g;
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            d(this.f14666f, f7, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int max;
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i7);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, (int) (size * 0.2f), -2);
        this.f14663c.measure(childMeasureSpec2, childMeasureSpec);
        this.f14664d.measure(childMeasureSpec2, childMeasureSpec);
        this.f14665e.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i8) == 1073741824) {
            max = View.MeasureSpec.getSize(i8);
        } else {
            max = Math.max(getMinHeight(), this.f14664d.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i8, this.f14664d.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f14670j) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i7) {
        this.f14669i = i7;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@x(from = 0.0d, to = 1.0d) float f7) {
        int i7 = ((int) (f7 * 255.0f)) & 255;
        this.f14674n = i7;
        int i8 = (i7 << 24) | (this.f14675o & u1.f3815s);
        this.f14663c.setTextColor(i8);
        this.f14665e.setTextColor(i8);
    }

    public void setTextColor(@l int i7) {
        this.f14675o = i7;
        this.f14664d.setTextColor(i7);
        int i8 = (this.f14674n << 24) | (this.f14675o & u1.f3815s);
        this.f14663c.setTextColor(i8);
        this.f14665e.setTextColor(i8);
    }

    public void setTextSpacing(int i7) {
        this.f14668h = i7;
        requestLayout();
    }

    public c(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14666f = -1;
        this.f14667g = -1.0f;
        this.f14672l = new a();
        TextView textView = new TextView(context);
        this.f14663c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f14664d = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f14665e = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14658p);
        boolean z6 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            v.E(this.f14663c, resourceId);
            v.E(this.f14664d, resourceId);
            v.E(this.f14665e, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f14663c.setTextColor(color);
            this.f14664d.setTextColor(color);
            this.f14665e.setTextColor(color);
        }
        this.f14669i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f14675o = this.f14664d.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f14663c.setEllipsize(TextUtils.TruncateAt.END);
        this.f14664d.setEllipsize(TextUtils.TruncateAt.END);
        this.f14665e.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f14659q);
            z6 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z6) {
            setSingleLineAllCaps(this.f14663c);
            setSingleLineAllCaps(this.f14664d);
            setSingleLineAllCaps(this.f14665e);
        } else {
            this.f14663c.setSingleLine();
            this.f14664d.setSingleLine();
            this.f14665e.setSingleLine();
        }
        this.f14668h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
