package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.k;

/* loaded from: classes.dex */
public class c extends View {

    /* renamed from: b  reason: collision with root package name */
    public Paint f8212b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f8213c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f8214d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8215e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8216f;

    /* renamed from: g  reason: collision with root package name */
    public String f8217g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f8218h;

    /* renamed from: i  reason: collision with root package name */
    public int f8219i;

    /* renamed from: j  reason: collision with root package name */
    public int f8220j;

    /* renamed from: k  reason: collision with root package name */
    public int f8221k;

    /* renamed from: l  reason: collision with root package name */
    public int f8222l;

    public c(Context context) {
        super(context);
        this.f8212b = new Paint();
        this.f8213c = new Paint();
        this.f8214d = new Paint();
        this.f8215e = true;
        this.f8216f = true;
        this.f8217g = null;
        this.f8218h = new Rect();
        this.f8219i = Color.argb(255, 0, 0, 0);
        this.f8220j = Color.argb(255, 200, 200, 200);
        this.f8221k = Color.argb(255, 50, 50, 50);
        this.f8222l = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.ej);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.gj) {
                    this.f8217g = obtainStyledAttributes.getString(index);
                } else if (index == k.m.jj) {
                    this.f8215e = obtainStyledAttributes.getBoolean(index, this.f8215e);
                } else if (index == k.m.fj) {
                    this.f8219i = obtainStyledAttributes.getColor(index, this.f8219i);
                } else if (index == k.m.hj) {
                    this.f8221k = obtainStyledAttributes.getColor(index, this.f8221k);
                } else if (index == k.m.ij) {
                    this.f8220j = obtainStyledAttributes.getColor(index, this.f8220j);
                } else if (index == k.m.kj) {
                    this.f8216f = obtainStyledAttributes.getBoolean(index, this.f8216f);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f8217g == null) {
            try {
                this.f8217g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f8212b.setColor(this.f8219i);
        this.f8212b.setAntiAlias(true);
        this.f8213c.setColor(this.f8220j);
        this.f8213c.setAntiAlias(true);
        this.f8214d.setColor(this.f8221k);
        this.f8222l = Math.round(this.f8222l * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f8215e) {
            width--;
            height--;
            float f7 = width;
            float f8 = height;
            canvas.drawLine(0.0f, 0.0f, f7, f8, this.f8212b);
            canvas.drawLine(0.0f, f8, f7, 0.0f, this.f8212b);
            canvas.drawLine(0.0f, 0.0f, f7, 0.0f, this.f8212b);
            canvas.drawLine(f7, 0.0f, f7, f8, this.f8212b);
            canvas.drawLine(f7, f8, 0.0f, f8, this.f8212b);
            canvas.drawLine(0.0f, f8, 0.0f, 0.0f, this.f8212b);
        }
        String str = this.f8217g;
        if (str == null || !this.f8216f) {
            return;
        }
        this.f8213c.getTextBounds(str, 0, str.length(), this.f8218h);
        float width2 = (width - this.f8218h.width()) / 2.0f;
        float height2 = ((height - this.f8218h.height()) / 2.0f) + this.f8218h.height();
        this.f8218h.offset((int) width2, (int) height2);
        Rect rect = this.f8218h;
        int i7 = rect.left;
        int i8 = this.f8222l;
        rect.set(i7 - i8, rect.top - i8, rect.right + i8, rect.bottom + i8);
        canvas.drawRect(this.f8218h, this.f8214d);
        canvas.drawText(this.f8217g, width2, height2, this.f8213c);
    }

    public c(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f8212b = new Paint();
        this.f8213c = new Paint();
        this.f8214d = new Paint();
        this.f8215e = true;
        this.f8216f = true;
        this.f8217g = null;
        this.f8218h = new Rect();
        this.f8219i = Color.argb(255, 0, 0, 0);
        this.f8220j = Color.argb(255, 200, 200, 200);
        this.f8221k = Color.argb(255, 50, 50, 50);
        this.f8222l = 4;
        a(context, attrs);
    }

    public c(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f8212b = new Paint();
        this.f8213c = new Paint();
        this.f8214d = new Paint();
        this.f8215e = true;
        this.f8216f = true;
        this.f8217g = null;
        this.f8218h = new Rect();
        this.f8219i = Color.argb(255, 0, 0, 0);
        this.f8220j = Color.argb(255, 200, 200, 200);
        this.f8221k = Color.argb(255, 50, 50, 50);
        this.f8222l = 4;
        a(context, attrs);
    }
}