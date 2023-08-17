package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.s;
import androidx.constraintlayout.widget.k;
import d.w0;
/* loaded from: classes.dex */
public class b extends s {

    /* renamed from: b  reason: collision with root package name */
    public c f8187b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8188c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f8189d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f8190e;

    /* renamed from: f  reason: collision with root package name */
    public float f8191f;

    /* renamed from: g  reason: collision with root package name */
    public float f8192g;

    /* renamed from: h  reason: collision with root package name */
    public float f8193h;

    /* renamed from: i  reason: collision with root package name */
    public Path f8194i;

    /* renamed from: j  reason: collision with root package name */
    public ViewOutlineProvider f8195j;

    /* renamed from: k  reason: collision with root package name */
    public RectF f8196k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable[] f8197l;

    /* renamed from: m  reason: collision with root package name */
    public LayerDrawable f8198m;

    /* renamed from: n  reason: collision with root package name */
    public float f8199n;

    /* renamed from: o  reason: collision with root package name */
    public float f8200o;

    /* renamed from: p  reason: collision with root package name */
    public float f8201p;

    /* renamed from: q  reason: collision with root package name */
    public float f8202q;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, b.this.getWidth(), b.this.getHeight(), (Math.min(r3, r4) * b.this.f8192g) / 2.0f);
        }
    }

    /* renamed from: d0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0091b extends ViewOutlineProvider {
        public C0091b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, b.this.getWidth(), b.this.getHeight(), b.this.f8193h);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float[] f8205a = new float[20];

        /* renamed from: b  reason: collision with root package name */
        public ColorMatrix f8206b = new ColorMatrix();

        /* renamed from: c  reason: collision with root package name */
        public ColorMatrix f8207c = new ColorMatrix();

        /* renamed from: d  reason: collision with root package name */
        public float f8208d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f8209e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f8210f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f8211g = 1.0f;

        public final void a(float brightness) {
            float[] fArr = this.f8205a;
            fArr[0] = brightness;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = brightness;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = brightness;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void b(float saturationStrength) {
            float f7 = 1.0f - saturationStrength;
            float f8 = 0.2999f * f7;
            float f9 = 0.587f * f7;
            float f10 = f7 * 0.114f;
            float[] fArr = this.f8205a;
            fArr[0] = f8 + saturationStrength;
            fArr[1] = f9;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f8;
            fArr[6] = f9 + saturationStrength;
            fArr[7] = f10;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f8;
            fArr[11] = f9;
            fArr[12] = f10 + saturationStrength;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView view) {
            boolean z6;
            this.f8206b.reset();
            float f7 = this.f8209e;
            boolean z7 = true;
            if (f7 != 1.0f) {
                b(f7);
                this.f8206b.set(this.f8205a);
                z6 = true;
            } else {
                z6 = false;
            }
            float f8 = this.f8210f;
            if (f8 != 1.0f) {
                this.f8207c.setScale(f8, f8, f8, 1.0f);
                this.f8206b.postConcat(this.f8207c);
                z6 = true;
            }
            float f9 = this.f8211g;
            if (f9 != 1.0f) {
                d(f9);
                this.f8207c.set(this.f8205a);
                this.f8206b.postConcat(this.f8207c);
                z6 = true;
            }
            float f10 = this.f8208d;
            if (f10 != 1.0f) {
                a(f10);
                this.f8207c.set(this.f8205a);
                this.f8206b.postConcat(this.f8207c);
            } else {
                z7 = z6;
            }
            if (z7) {
                view.setColorFilter(new ColorMatrixColorFilter(this.f8206b));
            } else {
                view.clearColorFilter();
            }
        }

        public final void d(float warmth) {
            float log;
            float f7;
            if (warmth <= 0.0f) {
                warmth = 0.01f;
            }
            float f8 = (5000.0f / warmth) / 100.0f;
            if (f8 > 66.0f) {
                double d7 = f8 - 60.0f;
                f7 = ((float) Math.pow(d7, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d7, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f8)) * 99.4708f) - 161.11957f;
                f7 = 255.0f;
            }
            float log2 = f8 < 66.0f ? f8 > 19.0f ? (((float) Math.log(f8 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f7, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log2, 0.0f));
            float log3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float log4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log3, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log4, 0.0f));
            float[] fArr = this.f8205a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public b(Context context) {
        super(context);
        this.f8187b = new c();
        this.f8188c = true;
        this.f8189d = null;
        this.f8190e = null;
        this.f8191f = 0.0f;
        this.f8192g = 0.0f;
        this.f8193h = Float.NaN;
        this.f8197l = new Drawable[2];
        this.f8199n = Float.NaN;
        this.f8200o = Float.NaN;
        this.f8201p = Float.NaN;
        this.f8202q = Float.NaN;
        e(context, null);
    }

    private void setOverlay(boolean overlay) {
        this.f8188c = overlay;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.te);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f8189d = obtainStyledAttributes.getDrawable(k.m.ue);
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.ye) {
                    this.f8191f = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == k.m.He) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.Ge) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.xe) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.we) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.Ee) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == k.m.Fe) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.De) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f8188c));
                } else if (index == k.m.ze) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f8199n));
                } else if (index == k.m.Ae) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f8200o));
                } else if (index == k.m.Be) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f8202q));
                } else if (index == k.m.Ce) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f8201p));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f8190e = drawable;
            if (this.f8189d == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f8190e = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f8197l;
                    Drawable mutate = drawable2.mutate();
                    this.f8190e = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f8197l;
            Drawable mutate2 = getDrawable().mutate();
            this.f8190e = mutate2;
            drawableArr2[0] = mutate2;
            this.f8197l[1] = this.f8189d.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f8197l);
            this.f8198m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f8191f * 255.0f));
            if (!this.f8188c) {
                this.f8198m.getDrawable(0).setAlpha((int) ((1.0f - this.f8191f) * 255.0f));
            }
            super.setImageDrawable(this.f8198m);
        }
    }

    public final void f() {
        if (Float.isNaN(this.f8199n) && Float.isNaN(this.f8200o) && Float.isNaN(this.f8201p) && Float.isNaN(this.f8202q)) {
            return;
        }
        float f7 = Float.isNaN(this.f8199n) ? 0.0f : this.f8199n;
        float f8 = Float.isNaN(this.f8200o) ? 0.0f : this.f8200o;
        float f9 = Float.isNaN(this.f8201p) ? 1.0f : this.f8201p;
        float f10 = Float.isNaN(this.f8202q) ? 0.0f : this.f8202q;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f11 = f9 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f11, f11);
        float f12 = intrinsicWidth * f11;
        float f13 = f11 * intrinsicHeight;
        matrix.postTranslate((((f7 * (width - f12)) + width) - f12) * 0.5f, (((f8 * (height - f13)) + height) - f13) * 0.5f);
        matrix.postRotate(f10, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void g() {
        if (Float.isNaN(this.f8199n) && Float.isNaN(this.f8200o) && Float.isNaN(this.f8201p) && Float.isNaN(this.f8202q)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            f();
        }
    }

    public float getBrightness() {
        return this.f8187b.f8208d;
    }

    public float getContrast() {
        return this.f8187b.f8210f;
    }

    public float getCrossfade() {
        return this.f8191f;
    }

    public float getImagePanX() {
        return this.f8199n;
    }

    public float getImagePanY() {
        return this.f8200o;
    }

    public float getImageRotate() {
        return this.f8202q;
    }

    public float getImageZoom() {
        return this.f8201p;
    }

    public float getRound() {
        return this.f8193h;
    }

    public float getRoundPercent() {
        return this.f8192g;
    }

    public float getSaturation() {
        return this.f8187b.f8209e;
    }

    public float getWarmth() {
        return this.f8187b.f8211g;
    }

    @Override // android.view.View
    public void layout(int l7, int t6, int r6, int b7) {
        super.layout(l7, t6, r6, b7);
        f();
    }

    public void setAltImageResource(int resId) {
        Drawable mutate = g.a.b(getContext(), resId).mutate();
        this.f8189d = mutate;
        Drawable[] drawableArr = this.f8197l;
        drawableArr[0] = this.f8190e;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f8197l);
        this.f8198m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8191f);
    }

    public void setBrightness(float brightness) {
        c cVar = this.f8187b;
        cVar.f8208d = brightness;
        cVar.c(this);
    }

    public void setContrast(float contrast) {
        c cVar = this.f8187b;
        cVar.f8210f = contrast;
        cVar.c(this);
    }

    public void setCrossfade(float crossfade) {
        this.f8191f = crossfade;
        if (this.f8197l != null) {
            if (!this.f8188c) {
                this.f8198m.getDrawable(0).setAlpha((int) ((1.0f - this.f8191f) * 255.0f));
            }
            this.f8198m.getDrawable(1).setAlpha((int) (this.f8191f * 255.0f));
            super.setImageDrawable(this.f8198m);
        }
    }

    @Override // androidx.appcompat.widget.s, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f8189d == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f8190e = mutate;
        Drawable[] drawableArr = this.f8197l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8189d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f8197l);
        this.f8198m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8191f);
    }

    public void setImagePanX(float pan) {
        this.f8199n = pan;
        g();
    }

    public void setImagePanY(float pan) {
        this.f8200o = pan;
        g();
    }

    @Override // androidx.appcompat.widget.s, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f8189d == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable mutate = g.a.b(getContext(), resId).mutate();
        this.f8190e = mutate;
        Drawable[] drawableArr = this.f8197l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8189d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f8197l);
        this.f8198m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8191f);
    }

    public void setImageRotate(float rotation) {
        this.f8202q = rotation;
        g();
    }

    public void setImageZoom(float zoom) {
        this.f8201p = zoom;
        g();
    }

    @w0(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f8193h = round;
            float f7 = this.f8192g;
            this.f8192g = -1.0f;
            setRoundPercent(f7);
            return;
        }
        boolean z6 = this.f8193h != round;
        this.f8193h = round;
        if (round != 0.0f) {
            if (this.f8194i == null) {
                this.f8194i = new Path();
            }
            if (this.f8196k == null) {
                this.f8196k = new RectF();
            }
            if (this.f8195j == null) {
                C0091b c0091b = new C0091b();
                this.f8195j = c0091b;
                setOutlineProvider(c0091b);
            }
            setClipToOutline(true);
            this.f8196k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8194i.reset();
            Path path = this.f8194i;
            RectF rectF = this.f8196k;
            float f8 = this.f8193h;
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
        boolean z6 = this.f8192g != round;
        this.f8192g = round;
        if (round != 0.0f) {
            if (this.f8194i == null) {
                this.f8194i = new Path();
            }
            if (this.f8196k == null) {
                this.f8196k = new RectF();
            }
            if (this.f8195j == null) {
                a aVar = new a();
                this.f8195j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8192g) / 2.0f;
            this.f8196k.set(0.0f, 0.0f, width, height);
            this.f8194i.reset();
            this.f8194i.addRoundRect(this.f8196k, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z6) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        c cVar = this.f8187b;
        cVar.f8209e = saturation;
        cVar.c(this);
    }

    public void setWarmth(float warmth) {
        c cVar = this.f8187b;
        cVar.f8211g = warmth;
        cVar.c(this);
    }

    public b(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f8187b = new c();
        this.f8188c = true;
        this.f8189d = null;
        this.f8190e = null;
        this.f8191f = 0.0f;
        this.f8192g = 0.0f;
        this.f8193h = Float.NaN;
        this.f8197l = new Drawable[2];
        this.f8199n = Float.NaN;
        this.f8200o = Float.NaN;
        this.f8201p = Float.NaN;
        this.f8202q = Float.NaN;
        e(context, attrs);
    }

    public b(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f8187b = new c();
        this.f8188c = true;
        this.f8189d = null;
        this.f8190e = null;
        this.f8191f = 0.0f;
        this.f8192g = 0.0f;
        this.f8193h = Float.NaN;
        this.f8197l = new Drawable[2];
        this.f8199n = Float.NaN;
        this.f8200o = Float.NaN;
        this.f8201p = Float.NaN;
        this.f8202q = Float.NaN;
        e(context, attrs);
    }
}
