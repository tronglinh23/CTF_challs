package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.widget.k;
import c0.s;
/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f8261t = "MotionTelltales";

    /* renamed from: m  reason: collision with root package name */
    public Paint f8262m;

    /* renamed from: n  reason: collision with root package name */
    public s f8263n;

    /* renamed from: o  reason: collision with root package name */
    public float[] f8264o;

    /* renamed from: p  reason: collision with root package name */
    public Matrix f8265p;

    /* renamed from: q  reason: collision with root package name */
    public int f8266q;

    /* renamed from: r  reason: collision with root package name */
    public int f8267r;

    /* renamed from: s  reason: collision with root package name */
    public float f8268s;

    public f(Context context) {
        super(context);
        this.f8262m = new Paint();
        this.f8264o = new float[2];
        this.f8265p = new Matrix();
        this.f8266q = 0;
        this.f8267r = -65281;
        this.f8268s = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.sk);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.tk) {
                    this.f8267r = obtainStyledAttributes.getColor(index, this.f8267r);
                } else if (index == k.m.vk) {
                    this.f8266q = obtainStyledAttributes.getInt(index, this.f8266q);
                } else if (index == k.m.uk) {
                    this.f8268s = obtainStyledAttributes.getFloat(index, this.f8268s);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8262m.setColor(this.f8267r);
        this.f8262m.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // d0.c, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f8265p);
        if (this.f8263n == null) {
            ViewParent parent = getParent();
            if (parent instanceof s) {
                this.f8263n = (s) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i7 = 0; i7 < 5; i7++) {
            float f7 = fArr[i7];
            for (int i8 = 0; i8 < 5; i8++) {
                float f8 = fArr[i8];
                this.f8263n.e0(this, f8, f7, this.f8264o, this.f8266q);
                this.f8265p.mapVectors(this.f8264o);
                float f9 = width * f8;
                float f10 = height * f7;
                float[] fArr2 = this.f8264o;
                float f11 = fArr2[0];
                float f12 = this.f8268s;
                float f13 = f10 - (fArr2[1] * f12);
                this.f8265p.mapVectors(fArr2);
                canvas.drawLine(f9, f10, f9 - (f11 * f12), f13, this.f8262m);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        postInvalidate();
    }

    public void setText(CharSequence text) {
        this.f8217g = text.toString();
        requestLayout();
    }

    public f(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f8262m = new Paint();
        this.f8264o = new float[2];
        this.f8265p = new Matrix();
        this.f8266q = 0;
        this.f8267r = -65281;
        this.f8268s = 0.25f;
        a(context, attrs);
    }

    public f(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f8262m = new Paint();
        this.f8264o = new float[2];
        this.f8265p = new Matrix();
        this.f8266q = 0;
        this.f8267r = -65281;
        this.f8268s = 0.25f;
        a(context, attrs);
    }
}
