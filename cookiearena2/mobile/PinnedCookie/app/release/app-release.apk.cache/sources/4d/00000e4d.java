package d0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.g0;
import androidx.constraintlayout.widget.k;
import androidx.core.view.m0;
import d.q0;
import d.w0;
import f.a;

/* loaded from: classes.dex */
public class e extends View implements c0.e {

    /* renamed from: a0  reason: collision with root package name */
    public static String f8230a0 = "MotionLabel";

    /* renamed from: b0  reason: collision with root package name */
    public static final int f8231b0 = 1;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f8232c0 = 2;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f8233d0 = 3;
    public int A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public Drawable F;
    public Matrix G;
    public Bitmap H;
    public BitmapShader I;
    public Matrix J;
    public float K;
    public float L;
    public float M;
    public float N;
    public Paint O;
    public int P;
    public Rect Q;
    public Paint R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;

    /* renamed from: b  reason: collision with root package name */
    public TextPaint f8234b;

    /* renamed from: c  reason: collision with root package name */
    public Path f8235c;

    /* renamed from: d  reason: collision with root package name */
    public int f8236d;

    /* renamed from: e  reason: collision with root package name */
    public int f8237e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8238f;

    /* renamed from: g  reason: collision with root package name */
    public float f8239g;

    /* renamed from: h  reason: collision with root package name */
    public float f8240h;

    /* renamed from: i  reason: collision with root package name */
    public ViewOutlineProvider f8241i;

    /* renamed from: j  reason: collision with root package name */
    public RectF f8242j;

    /* renamed from: k  reason: collision with root package name */
    public float f8243k;

    /* renamed from: l  reason: collision with root package name */
    public float f8244l;

    /* renamed from: m  reason: collision with root package name */
    public int f8245m;

    /* renamed from: n  reason: collision with root package name */
    public int f8246n;

    /* renamed from: o  reason: collision with root package name */
    public float f8247o;

    /* renamed from: p  reason: collision with root package name */
    public String f8248p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8249q;

    /* renamed from: r  reason: collision with root package name */
    public Rect f8250r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f8251s;

    /* renamed from: t  reason: collision with root package name */
    public int f8252t;

    /* renamed from: u  reason: collision with root package name */
    public int f8253u;

    /* renamed from: v  reason: collision with root package name */
    public int f8254v;

    /* renamed from: w  reason: collision with root package name */
    public int f8255w;

    /* renamed from: x  reason: collision with root package name */
    public String f8256x;

    /* renamed from: y  reason: collision with root package name */
    public Layout f8257y;

    /* renamed from: z  reason: collision with root package name */
    public int f8258z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, e.this.getWidth(), e.this.getHeight(), (Math.min(r3, r4) * e.this.f8239g) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, e.this.getWidth(), e.this.getHeight(), e.this.f8240h);
        }
    }

    public e(Context context) {
        super(context);
        this.f8234b = new TextPaint();
        this.f8235c = new Path();
        this.f8236d = 65535;
        this.f8237e = 65535;
        this.f8238f = false;
        this.f8239g = 0.0f;
        this.f8240h = Float.NaN;
        this.f8243k = 48.0f;
        this.f8244l = Float.NaN;
        this.f8247o = 0.0f;
        this.f8248p = "Hello World";
        this.f8249q = true;
        this.f8250r = new Rect();
        this.f8252t = 1;
        this.f8253u = 1;
        this.f8254v = 1;
        this.f8255w = 1;
        this.f8258z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        g(context, null);
    }

    private float getHorizontalOffset() {
        float f7 = Float.isNaN(this.f8244l) ? 1.0f : this.f8243k / this.f8244l;
        TextPaint textPaint = this.f8234b;
        String str = this.f8248p;
        return (((((Float.isNaN(this.D) ? getMeasuredWidth() : this.D) - getPaddingLeft()) - getPaddingRight()) - (f7 * textPaint.measureText(str, 0, str.length()))) * (this.M + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f7 = Float.isNaN(this.f8244l) ? 1.0f : this.f8243k / this.f8244l;
        Paint.FontMetrics fontMetrics = this.f8234b.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.E) ? getMeasuredHeight() : this.E) - getPaddingTop()) - getPaddingBottom();
        float f8 = fontMetrics.descent;
        float f9 = fontMetrics.ascent;
        return (((measuredHeight - ((f8 - f9) * f7)) * (1.0f - this.N)) / 2.0f) - (f7 * f9);
    }

    @Override // c0.e
    public void a(float l7, float t6, float r6, float b7) {
        int i7 = (int) (l7 + 0.5f);
        this.C = l7 - i7;
        int i8 = (int) (r6 + 0.5f);
        int i9 = i8 - i7;
        int i10 = (int) (b7 + 0.5f);
        int i11 = (int) (0.5f + t6);
        int i12 = i10 - i11;
        float f7 = r6 - l7;
        this.D = f7;
        float f8 = b7 - t6;
        this.E = f8;
        d(l7, t6, r6, b7);
        if (getMeasuredHeight() == i12 && getMeasuredWidth() == i9) {
            super.layout(i7, i11, i8, i10);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            super.layout(i7, i11, i8, i10);
        }
        if (this.B) {
            if (this.Q == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(this.f8234b);
                this.S = this.R.getTextSize();
            }
            this.D = f7;
            this.E = f8;
            Paint paint = this.R;
            String str = this.f8248p;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            float height = this.Q.height() * 1.3f;
            float f9 = (f7 - this.f8253u) - this.f8252t;
            float f10 = (f8 - this.f8255w) - this.f8254v;
            float width = this.Q.width();
            if (width * f10 > height * f9) {
                this.f8234b.setTextSize((this.S * f9) / width);
            } else {
                this.f8234b.setTextSize((this.S * f10) / height);
            }
            if (this.f8238f || !Float.isNaN(this.f8244l)) {
                f(Float.isNaN(this.f8244l) ? 1.0f : this.f8243k / this.f8244l);
            }
        }
    }

    public final void d(float l7, float t6, float r6, float b7) {
        if (this.J == null) {
            return;
        }
        this.D = r6 - l7;
        this.E = b7 - t6;
        l();
    }

    public Bitmap e(Bitmap bitmapOriginal, int factor) {
        System.nanoTime();
        int width = bitmapOriginal.getWidth() / 2;
        int height = bitmapOriginal.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapOriginal, width, height, true);
        for (int i7 = 0; i7 < factor && width >= 32 && height >= 32; i7++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    public void f(float scale) {
        if (this.f8238f || scale != 1.0f) {
            this.f8235c.reset();
            String str = this.f8248p;
            int length = str.length();
            this.f8234b.getTextBounds(str, 0, length, this.f8250r);
            this.f8234b.getTextPath(str, 0, length, 0.0f, 0.0f, this.f8235c);
            if (scale != 1.0f) {
                StringBuilder sb = new StringBuilder();
                sb.append(c0.c.f());
                sb.append(" scale ");
                sb.append(scale);
                Matrix matrix = new Matrix();
                matrix.postScale(scale, scale);
                this.f8235c.transform(matrix);
            }
            Rect rect = this.f8250r;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f8249q = false;
        }
    }

    public final void g(Context context, AttributeSet attrs) {
        i(context, attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.Ij);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.Oj) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == k.m.Qj) {
                    this.f8256x = obtainStyledAttributes.getString(index);
                } else if (index == k.m.Uj) {
                    this.f8244l = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f8244l);
                } else if (index == k.m.Jj) {
                    this.f8243k = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f8243k);
                } else if (index == k.m.Lj) {
                    this.f8245m = obtainStyledAttributes.getInt(index, this.f8245m);
                } else if (index == k.m.Kj) {
                    this.f8246n = obtainStyledAttributes.getInt(index, this.f8246n);
                } else if (index == k.m.Mj) {
                    this.f8236d = obtainStyledAttributes.getColor(index, this.f8236d);
                } else if (index == k.m.Sj) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f8240h);
                    this.f8240h = dimension;
                    setRound(dimension);
                } else if (index == k.m.Tj) {
                    float f7 = obtainStyledAttributes.getFloat(index, this.f8239g);
                    this.f8239g = f7;
                    setRoundPercent(f7);
                } else if (index == k.m.Nj) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == k.m.Rj) {
                    this.A = obtainStyledAttributes.getInt(index, 0);
                } else if (index == k.m.ak) {
                    this.f8237e = obtainStyledAttributes.getInt(index, this.f8237e);
                    this.f8238f = true;
                } else if (index == k.m.bk) {
                    this.f8247o = obtainStyledAttributes.getDimension(index, this.f8247o);
                    this.f8238f = true;
                } else if (index == k.m.Vj) {
                    this.F = obtainStyledAttributes.getDrawable(index);
                    this.f8238f = true;
                } else if (index == k.m.Wj) {
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                } else if (index == k.m.Xj) {
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                } else if (index == k.m.ck) {
                    this.M = obtainStyledAttributes.getFloat(index, this.M);
                } else if (index == k.m.dk) {
                    this.N = obtainStyledAttributes.getFloat(index, this.N);
                } else if (index == k.m.Yj) {
                    this.W = obtainStyledAttributes.getFloat(index, this.W);
                } else if (index == k.m.Zj) {
                    this.V = obtainStyledAttributes.getFloat(index, this.V);
                } else if (index == k.m.gk) {
                    this.K = obtainStyledAttributes.getDimension(index, this.K);
                } else if (index == k.m.hk) {
                    this.L = obtainStyledAttributes.getDimension(index, this.L);
                } else if (index == k.m.fk) {
                    this.P = obtainStyledAttributes.getInt(index, this.P);
                }
            }
            obtainStyledAttributes.recycle();
        }
        k();
        j();
    }

    public float getRound() {
        return this.f8240h;
    }

    public float getRoundPercent() {
        return this.f8239g;
    }

    public float getScaleFromTextSize() {
        return this.f8244l;
    }

    public float getTextBackgroundPanX() {
        return this.T;
    }

    public float getTextBackgroundPanY() {
        return this.U;
    }

    public float getTextBackgroundRotate() {
        return this.W;
    }

    public float getTextBackgroundZoom() {
        return this.V;
    }

    public int getTextOutlineColor() {
        return this.f8237e;
    }

    public float getTextPanX() {
        return this.M;
    }

    public float getTextPanY() {
        return this.N;
    }

    public float getTextureHeight() {
        return this.K;
    }

    public float getTextureWidth() {
        return this.L;
    }

    public Typeface getTypeface() {
        return this.f8234b.getTypeface();
    }

    public final void h(String familyName, int typefaceIndex, int styleIndex) {
        Typeface typeface;
        if (familyName != null) {
            typeface = Typeface.create(familyName, styleIndex);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        if (typefaceIndex == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (typefaceIndex == 2) {
            typeface = Typeface.SERIF;
        } else if (typefaceIndex == 3) {
            typeface = Typeface.MONOSPACE;
        }
        if (styleIndex <= 0) {
            this.f8234b.setFakeBoldText(false);
            this.f8234b.setTextSkewX(0.0f);
            setTypeface(typeface);
            return;
        }
        Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(styleIndex) : Typeface.create(typeface, styleIndex);
        setTypeface(defaultFromStyle);
        int i7 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & styleIndex;
        this.f8234b.setFakeBoldText((i7 & 1) != 0);
        this.f8234b.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
    }

    public final void i(Context context, @q0 AttributeSet attrs) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.J0, typedValue, true);
        TextPaint textPaint = this.f8234b;
        int i7 = typedValue.data;
        this.f8236d = i7;
        textPaint.setColor(i7);
    }

    public void j() {
        this.f8252t = getPaddingLeft();
        this.f8253u = getPaddingRight();
        this.f8254v = getPaddingTop();
        this.f8255w = getPaddingBottom();
        h(this.f8256x, this.f8246n, this.f8245m);
        this.f8234b.setColor(this.f8236d);
        this.f8234b.setStrokeWidth(this.f8247o);
        this.f8234b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f8234b.setFlags(128);
        setTextSize(this.f8243k);
        this.f8234b.setAntiAlias(true);
    }

    public final void k() {
        if (this.F != null) {
            this.J = new Matrix();
            int intrinsicWidth = this.F.getIntrinsicWidth();
            int intrinsicHeight = this.F.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.L) ? 128 : (int) this.L;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.K) ? 128 : (int) this.K;
            }
            if (this.P != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.H = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.H);
            this.F.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.F.setFilterBitmap(true);
            this.F.draw(canvas);
            if (this.P != 0) {
                this.H = e(this.H, 4);
            }
            Bitmap bitmap = this.H;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.I = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void l() {
        float f7 = Float.isNaN(this.T) ? 0.0f : this.T;
        float f8 = Float.isNaN(this.U) ? 0.0f : this.U;
        float f9 = Float.isNaN(this.V) ? 1.0f : this.V;
        float f10 = Float.isNaN(this.W) ? 0.0f : this.W;
        this.J.reset();
        float width = this.H.getWidth();
        float height = this.H.getHeight();
        float f11 = Float.isNaN(this.L) ? this.D : this.L;
        float f12 = Float.isNaN(this.K) ? this.E : this.K;
        float f13 = f9 * (width * f12 < height * f11 ? f11 / width : f12 / height);
        this.J.postScale(f13, f13);
        float f14 = width * f13;
        float f15 = f11 - f14;
        float f16 = f13 * height;
        float f17 = f12 - f16;
        if (!Float.isNaN(this.K)) {
            f17 = this.K / 2.0f;
        }
        if (!Float.isNaN(this.L)) {
            f15 = this.L / 2.0f;
        }
        this.J.postTranslate((((f7 * f15) + f11) - f14) * 0.5f, (((f8 * f17) + f12) - f16) * 0.5f);
        this.J.postRotate(f10, f11 / 2.0f, f12 / 2.0f);
        this.I.setLocalMatrix(this.J);
    }

    @Override // android.view.View
    public void layout(int l7, int t6, int r6, int b7) {
        super.layout(l7, t6, r6, b7);
        boolean isNaN = Float.isNaN(this.f8244l);
        float f7 = isNaN ? 1.0f : this.f8243k / this.f8244l;
        this.D = r6 - l7;
        this.E = b7 - t6;
        if (this.B) {
            if (this.Q == null) {
                this.R = new Paint();
                this.Q = new Rect();
                this.R.set(this.f8234b);
                this.S = this.R.getTextSize();
            }
            Paint paint = this.R;
            String str = this.f8248p;
            paint.getTextBounds(str, 0, str.length(), this.Q);
            int width = this.Q.width();
            int height = (int) (this.Q.height() * 1.3f);
            float f8 = (this.D - this.f8253u) - this.f8252t;
            float f9 = (this.E - this.f8255w) - this.f8254v;
            if (isNaN) {
                float f10 = width;
                float f11 = height;
                if (f10 * f9 > f11 * f8) {
                    this.f8234b.setTextSize((this.S * f8) / f10);
                } else {
                    this.f8234b.setTextSize((this.S * f9) / f11);
                }
            } else {
                float f12 = width;
                float f13 = height;
                f7 = f12 * f9 > f13 * f8 ? f8 / f12 : f9 / f13;
            }
        }
        if (this.f8238f || !isNaN) {
            d(l7, t6, r6, b7);
            f(f7);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f7 = Float.isNaN(this.f8244l) ? 1.0f : this.f8243k / this.f8244l;
        super.onDraw(canvas);
        if (!this.f8238f && f7 == 1.0f) {
            canvas.drawText(this.f8248p, this.C + this.f8252t + getHorizontalOffset(), this.f8254v + getVerticalOffset(), this.f8234b);
            return;
        }
        if (this.f8249q) {
            f(f7);
        }
        if (this.G == null) {
            this.G = new Matrix();
        }
        if (!this.f8238f) {
            float horizontalOffset = this.f8252t + getHorizontalOffset();
            float verticalOffset = this.f8254v + getVerticalOffset();
            this.G.reset();
            this.G.preTranslate(horizontalOffset, verticalOffset);
            this.f8235c.transform(this.G);
            this.f8234b.setColor(this.f8236d);
            this.f8234b.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f8234b.setStrokeWidth(this.f8247o);
            canvas.drawPath(this.f8235c, this.f8234b);
            this.G.reset();
            this.G.preTranslate(-horizontalOffset, -verticalOffset);
            this.f8235c.transform(this.G);
            return;
        }
        this.O.set(this.f8234b);
        this.G.reset();
        float horizontalOffset2 = this.f8252t + getHorizontalOffset();
        float verticalOffset2 = this.f8254v + getVerticalOffset();
        this.G.postTranslate(horizontalOffset2, verticalOffset2);
        this.G.preScale(f7, f7);
        this.f8235c.transform(this.G);
        if (this.I != null) {
            this.f8234b.setFilterBitmap(true);
            this.f8234b.setShader(this.I);
        } else {
            this.f8234b.setColor(this.f8236d);
        }
        this.f8234b.setStyle(Paint.Style.FILL);
        this.f8234b.setStrokeWidth(this.f8247o);
        canvas.drawPath(this.f8235c, this.f8234b);
        if (this.I != null) {
            this.f8234b.setShader(null);
        }
        this.f8234b.setColor(this.f8237e);
        this.f8234b.setStyle(Paint.Style.STROKE);
        this.f8234b.setStrokeWidth(this.f8247o);
        canvas.drawPath(this.f8235c, this.f8234b);
        this.G.reset();
        this.G.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f8235c.transform(this.G);
        this.f8234b.set(this.O);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        this.B = false;
        this.f8252t = getPaddingLeft();
        this.f8253u = getPaddingRight();
        this.f8254v = getPaddingTop();
        this.f8255w = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f8234b;
            String str = this.f8248p;
            textPaint.getTextBounds(str, 0, str.length(), this.f8250r);
            if (mode != 1073741824) {
                size = (int) (this.f8250r.width() + 0.99999f);
            }
            size += this.f8252t + this.f8253u;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f8234b.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f8254v + this.f8255w + fontMetricsInt;
            }
        } else if (this.A != 0) {
            this.B = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int gravity) {
        if ((gravity & m0.f3716d) == 0) {
            gravity |= m0.f3714b;
        }
        if ((gravity & g0.f1602o) == 0) {
            gravity |= 48;
        }
        if (gravity != this.f8258z) {
            invalidate();
        }
        this.f8258z = gravity;
        int i7 = gravity & g0.f1602o;
        if (i7 == 48) {
            this.N = -1.0f;
        } else if (i7 != 80) {
            this.N = 0.0f;
        } else {
            this.N = 1.0f;
        }
        int i8 = gravity & m0.f3716d;
        if (i8 != 3) {
            if (i8 != 5) {
                if (i8 != 8388611) {
                    if (i8 != 8388613) {
                        this.M = 0.0f;
                        return;
                    }
                }
            }
            this.M = 1.0f;
            return;
        }
        this.M = -1.0f;
    }

    @w0(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f8240h = round;
            float f7 = this.f8239g;
            this.f8239g = -1.0f;
            setRoundPercent(f7);
            return;
        }
        boolean z6 = this.f8240h != round;
        this.f8240h = round;
        if (round != 0.0f) {
            if (this.f8235c == null) {
                this.f8235c = new Path();
            }
            if (this.f8242j == null) {
                this.f8242j = new RectF();
            }
            if (this.f8241i == null) {
                b bVar = new b();
                this.f8241i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f8242j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8235c.reset();
            Path path = this.f8235c;
            RectF rectF = this.f8242j;
            float f8 = this.f8240h;
            path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z6) {
            invalidateOutline();
        }
    }

    @w0(21)
    public void setRoundPercent(float round) {
        boolean z6 = this.f8239g != round;
        this.f8239g = round;
        if (round != 0.0f) {
            if (this.f8235c == null) {
                this.f8235c = new Path();
            }
            if (this.f8242j == null) {
                this.f8242j = new RectF();
            }
            if (this.f8241i == null) {
                a aVar = new a();
                this.f8241i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8239g) / 2.0f;
            this.f8242j.set(0.0f, 0.0f, width, height);
            this.f8235c.reset();
            this.f8235c.addRoundRect(this.f8242j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z6) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float size) {
        this.f8244l = size;
    }

    public void setText(CharSequence text) {
        this.f8248p = text.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float pan) {
        this.T = pan;
        l();
        invalidate();
    }

    public void setTextBackgroundPanY(float pan) {
        this.U = pan;
        l();
        invalidate();
    }

    public void setTextBackgroundRotate(float rotation) {
        this.W = rotation;
        l();
        invalidate();
    }

    public void setTextBackgroundZoom(float zoom) {
        this.V = zoom;
        l();
        invalidate();
    }

    public void setTextFillColor(int color) {
        this.f8236d = color;
        invalidate();
    }

    public void setTextOutlineColor(int color) {
        this.f8237e = color;
        this.f8238f = true;
        invalidate();
    }

    public void setTextOutlineThickness(float width) {
        this.f8247o = width;
        this.f8238f = true;
        if (Float.isNaN(width)) {
            this.f8247o = 1.0f;
            this.f8238f = false;
        }
        invalidate();
    }

    public void setTextPanX(float textPanX) {
        this.M = textPanX;
        invalidate();
    }

    public void setTextPanY(float textPanY) {
        this.N = textPanY;
        invalidate();
    }

    public void setTextSize(float size) {
        this.f8243k = size;
        StringBuilder sb = new StringBuilder();
        sb.append(c0.c.f());
        sb.append("  ");
        sb.append(size);
        sb.append(" / ");
        sb.append(this.f8244l);
        TextPaint textPaint = this.f8234b;
        if (!Float.isNaN(this.f8244l)) {
            size = this.f8244l;
        }
        textPaint.setTextSize(size);
        f(Float.isNaN(this.f8244l) ? 1.0f : this.f8243k / this.f8244l);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float mTextureHeight) {
        this.K = mTextureHeight;
        l();
        invalidate();
    }

    public void setTextureWidth(float mTextureWidth) {
        this.L = mTextureWidth;
        l();
        invalidate();
    }

    public void setTypeface(Typeface tf) {
        if (this.f8234b.getTypeface() != tf) {
            this.f8234b.setTypeface(tf);
            if (this.f8257y != null) {
                this.f8257y = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public e(Context context, @q0 AttributeSet attrs) {
        super(context, attrs);
        this.f8234b = new TextPaint();
        this.f8235c = new Path();
        this.f8236d = 65535;
        this.f8237e = 65535;
        this.f8238f = false;
        this.f8239g = 0.0f;
        this.f8240h = Float.NaN;
        this.f8243k = 48.0f;
        this.f8244l = Float.NaN;
        this.f8247o = 0.0f;
        this.f8248p = "Hello World";
        this.f8249q = true;
        this.f8250r = new Rect();
        this.f8252t = 1;
        this.f8253u = 1;
        this.f8254v = 1;
        this.f8255w = 1;
        this.f8258z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        g(context, attrs);
    }

    public e(Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f8234b = new TextPaint();
        this.f8235c = new Path();
        this.f8236d = 65535;
        this.f8237e = 65535;
        this.f8238f = false;
        this.f8239g = 0.0f;
        this.f8240h = Float.NaN;
        this.f8243k = 48.0f;
        this.f8244l = Float.NaN;
        this.f8247o = 0.0f;
        this.f8248p = "Hello World";
        this.f8249q = true;
        this.f8250r = new Rect();
        this.f8252t = 1;
        this.f8253u = 1;
        this.f8254v = 1;
        this.f8255w = 1;
        this.f8258z = 8388659;
        this.A = 0;
        this.B = false;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = new Paint();
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        g(context, attrs);
    }
}