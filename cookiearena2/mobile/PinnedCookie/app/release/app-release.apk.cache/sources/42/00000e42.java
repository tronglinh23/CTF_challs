package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.q;
import androidx.constraintlayout.widget.k;
import d.w0;
import d0.b;

/* loaded from: classes.dex */
public class a extends q {

    /* renamed from: b  reason: collision with root package name */
    public b.c f8169b;

    /* renamed from: c  reason: collision with root package name */
    public float f8170c;

    /* renamed from: d  reason: collision with root package name */
    public float f8171d;

    /* renamed from: e  reason: collision with root package name */
    public float f8172e;

    /* renamed from: f  reason: collision with root package name */
    public Path f8173f;

    /* renamed from: g  reason: collision with root package name */
    public ViewOutlineProvider f8174g;

    /* renamed from: h  reason: collision with root package name */
    public RectF f8175h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable[] f8176i;

    /* renamed from: j  reason: collision with root package name */
    public LayerDrawable f8177j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8178k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f8179l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f8180m;

    /* renamed from: n  reason: collision with root package name */
    public float f8181n;

    /* renamed from: o  reason: collision with root package name */
    public float f8182o;

    /* renamed from: p  reason: collision with root package name */
    public float f8183p;

    /* renamed from: q  reason: collision with root package name */
    public float f8184q;

    /* renamed from: d0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0090a extends ViewOutlineProvider {
        public C0090a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, a.this.getWidth(), a.this.getHeight(), (Math.min(r3, r4) * a.this.f8171d) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, a.this.getWidth(), a.this.getHeight(), a.this.f8172e);
        }
    }

    public a(Context context) {
        super(context);
        this.f8169b = new b.c();
        this.f8170c = 0.0f;
        this.f8171d = 0.0f;
        this.f8172e = Float.NaN;
        this.f8176i = new Drawable[2];
        this.f8178k = true;
        this.f8179l = null;
        this.f8180m = null;
        this.f8181n = Float.NaN;
        this.f8182o = Float.NaN;
        this.f8183p = Float.NaN;
        this.f8184q = Float.NaN;
        c(context, null);
    }

    private void setOverlay(boolean overlay) {
        this.f8178k = overlay;
    }

    public final void c(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.te);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f8179l = obtainStyledAttributes.getDrawable(k.m.ue);
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.ye) {
                    this.f8170c = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == k.m.He) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.Ge) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.xe) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.Ee) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == k.m.Fe) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == k.m.De) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f8178k));
                } else if (index == k.m.ze) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f8181n));
                } else if (index == k.m.Ae) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f8182o));
                } else if (index == k.m.Be) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f8184q));
                } else if (index == k.m.Ce) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f8183p));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f8180m = drawable;
            if (this.f8179l == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f8180m = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f8176i;
                    Drawable mutate = drawable2.mutate();
                    this.f8180m = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f8176i;
            Drawable mutate2 = getDrawable().mutate();
            this.f8180m = mutate2;
            drawableArr2[0] = mutate2;
            this.f8176i[1] = this.f8179l.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f8176i);
            this.f8177j = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f8170c * 255.0f));
            if (!this.f8178k) {
                this.f8177j.getDrawable(0).setAlpha((int) ((1.0f - this.f8170c) * 255.0f));
            }
            super.setImageDrawable(this.f8177j);
        }
    }

    public final void d() {
        if (Float.isNaN(this.f8181n) && Float.isNaN(this.f8182o) && Float.isNaN(this.f8183p) && Float.isNaN(this.f8184q)) {
            return;
        }
        float f7 = Float.isNaN(this.f8181n) ? 0.0f : this.f8181n;
        float f8 = Float.isNaN(this.f8182o) ? 0.0f : this.f8182o;
        float f9 = Float.isNaN(this.f8183p) ? 1.0f : this.f8183p;
        float f10 = Float.isNaN(this.f8184q) ? 0.0f : this.f8184q;
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

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e() {
        if (Float.isNaN(this.f8181n) && Float.isNaN(this.f8182o) && Float.isNaN(this.f8183p) && Float.isNaN(this.f8184q)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getContrast() {
        return this.f8169b.f8210f;
    }

    public float getCrossfade() {
        return this.f8170c;
    }

    public float getImagePanX() {
        return this.f8181n;
    }

    public float getImagePanY() {
        return this.f8182o;
    }

    public float getImageRotate() {
        return this.f8184q;
    }

    public float getImageZoom() {
        return this.f8183p;
    }

    public float getRound() {
        return this.f8172e;
    }

    public float getRoundPercent() {
        return this.f8171d;
    }

    public float getSaturation() {
        return this.f8169b.f8209e;
    }

    public float getWarmth() {
        return this.f8169b.f8211g;
    }

    @Override // android.view.View
    public void layout(int l7, int t6, int r6, int b7) {
        super.layout(l7, t6, r6, b7);
        d();
    }

    public void setAltImageResource(int resId) {
        Drawable mutate = g.a.b(getContext(), resId).mutate();
        this.f8179l = mutate;
        Drawable[] drawableArr = this.f8176i;
        drawableArr[0] = this.f8180m;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f8176i);
        this.f8177j = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8170c);
    }

    public void setBrightness(float brightness) {
        b.c cVar = this.f8169b;
        cVar.f8208d = brightness;
        cVar.c(this);
    }

    public void setContrast(float contrast) {
        b.c cVar = this.f8169b;
        cVar.f8210f = contrast;
        cVar.c(this);
    }

    public void setCrossfade(float crossfade) {
        this.f8170c = crossfade;
        if (this.f8176i != null) {
            if (!this.f8178k) {
                this.f8177j.getDrawable(0).setAlpha((int) ((1.0f - this.f8170c) * 255.0f));
            }
            this.f8177j.getDrawable(1).setAlpha((int) (this.f8170c * 255.0f));
            super.setImageDrawable(this.f8177j);
        }
    }

    @Override // androidx.appcompat.widget.q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f8179l == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f8180m = mutate;
        Drawable[] drawableArr = this.f8176i;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8179l;
        LayerDrawable layerDrawable = new LayerDrawable(this.f8176i);
        this.f8177j = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8170c);
    }

    public void setImagePanX(float pan) {
        this.f8181n = pan;
        e();
    }

    public void setImagePanY(float pan) {
        this.f8182o = pan;
        e();
    }

    @Override // androidx.appcompat.widget.q, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f8179l == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable mutate = g.a.b(getContext(), resId).mutate();
        this.f8180m = mutate;
        Drawable[] drawableArr = this.f8176i;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8179l;
        LayerDrawable layerDrawable = new LayerDrawable(this.f8176i);
        this.f8177j = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8170c);
    }

    public void setImageRotate(float rotation) {
        this.f8184q = rotation;
        e();
    }

    public void setImageZoom(float zoom) {
        this.f8183p = zoom;
        e();
    }

    @w0(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f8172e = round;
            float f7 = this.f8171d;
            this.f8171d = -1.0f;
            setRoundPercent(f7);
            return;
        }
        boolean z6 = this.f8172e != round;
        this.f8172e = round;
        if (round != 0.0f) {
            if (this.f8173f == null) {
                this.f8173f = new Path();
            }
            if (this.f8175h == null) {
                this.f8175h = new RectF();
            }
            if (this.f8174g == null) {
                b bVar = new b();
                this.f8174g = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f8175h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8173f.reset();
            Path path = this.f8173f;
            RectF rectF = this.f8175h;
            float f8 = this.f8172e;
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
        boolean z6 = this.f8171d != round;
        this.f8171d = round;
        if (round != 0.0f) {
            if (this.f8173f == null) {
                this.f8173f = new Path();
            }
            if (this.f8175h == null) {
                this.f8175h = new RectF();
            }
            if (this.f8174g == null) {
                C0090a c0090a = new C0090a();
                this.f8174g = c0090a;
                setOutlineProvider(c0090a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8171d) / 2.0f;
            this.f8175h.set(0.0f, 0.0f, width, height);
            this.f8173f.reset();
            this.f8173f.addRoundRect(this.f8175h, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z6) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        b.c cVar = this.f8169b;
        cVar.f8209e = saturation;
        cVar.c(this);
    }

    public void setWarmth(float warmth) {
        b.c cVar = this.f8169b;
        cVar.f8211g = warmth;
        cVar.c(this);
    }

    public a(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f8169b = new b.c();
        this.f8170c = 0.0f;
        this.f8171d = 0.0f;
        this.f8172e = Float.NaN;
        this.f8176i = new Drawable[2];
        this.f8178k = true;
        this.f8179l = null;
        this.f8180m = null;
        this.f8181n = Float.NaN;
        this.f8182o = Float.NaN;
        this.f8183p = Float.NaN;
        this.f8184q = Float.NaN;
        c(context, attrs);
    }

    public a(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f8169b = new b.c();
        this.f8170c = 0.0f;
        this.f8171d = 0.0f;
        this.f8172e = Float.NaN;
        this.f8176i = new Drawable[2];
        this.f8178k = true;
        this.f8179l = null;
        this.f8180m = null;
        this.f8181n = Float.NaN;
        this.f8182o = Float.NaN;
        this.f8183p = Float.NaN;
        this.f8184q = Float.NaN;
        c(context, attrs);
    }
}