package p3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.u1;
import d.l;
import d.n;
import d.o0;
import d.q0;
import d.v;

/* loaded from: classes.dex */
public class b extends c {
    public static final String J = "PagerTabStrip";
    public static final int K = 3;
    public static final int L = 6;
    public static final int M = 16;
    public static final int N = 32;
    public static final int O = 64;
    public static final int P = 1;
    public static final int Q = 32;
    public final Rect A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public float G;
    public float H;
    public int I;

    /* renamed from: t  reason: collision with root package name */
    public int f14649t;

    /* renamed from: u  reason: collision with root package name */
    public int f14650u;

    /* renamed from: v  reason: collision with root package name */
    public int f14651v;

    /* renamed from: w  reason: collision with root package name */
    public int f14652w;

    /* renamed from: x  reason: collision with root package name */
    public int f14653x;

    /* renamed from: y  reason: collision with root package name */
    public int f14654y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f14655z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f14662b.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* renamed from: p3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0208b implements View.OnClickListener {
        public ViewOnClickListenerC0208b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = b.this.f14662b;
            dVar.setCurrentItem(dVar.getCurrentItem() + 1);
        }
    }

    public b(@o0 Context context) {
        this(context, null);
    }

    @Override // p3.c
    public void d(int i7, float f7, boolean z6) {
        Rect rect = this.A;
        int height = getHeight();
        int left = this.f14664d.getLeft() - this.f14654y;
        int right = this.f14664d.getRight() + this.f14654y;
        int i8 = height - this.f14650u;
        rect.set(left, i8, right, height);
        super.d(i7, f7, z6);
        this.B = (int) (Math.abs(f7 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f14664d.getLeft() - this.f14654y, i8, this.f14664d.getRight() + this.f14654y, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.C;
    }

    @Override // p3.c
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f14653x);
    }

    @l
    public int getTabIndicatorColor() {
        return this.f14649t;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f14664d.getLeft() - this.f14654y;
        int right = this.f14664d.getRight() + this.f14654y;
        int i7 = height - this.f14650u;
        this.f14655z.setColor((this.B << 24) | (this.f14649t & u1.f3815s));
        float f7 = height;
        canvas.drawRect(left, i7, right, f7, this.f14655z);
        if (this.C) {
            this.f14655z.setColor((this.f14649t & u1.f3815s) | u1.f3816t);
            canvas.drawRect(getPaddingLeft(), height - this.E, getWidth() - getPaddingRight(), f7, this.f14655z);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || !this.F) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            if (action == 0) {
                this.G = x6;
                this.H = y6;
                this.F = false;
            } else if (action != 1) {
                if (action == 2 && (Math.abs(x6 - this.G) > this.I || Math.abs(y6 - this.H) > this.I)) {
                    this.F = true;
                }
            } else if (x6 < this.f14664d.getLeft() - this.f14654y) {
                d dVar = this.f14662b;
                dVar.setCurrentItem(dVar.getCurrentItem() - 1);
            } else if (x6 > this.f14664d.getRight() + this.f14654y) {
                d dVar2 = this.f14662b;
                dVar2.setCurrentItem(dVar2.getCurrentItem() + 1);
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i7) {
        super.setBackgroundColor(i7);
        if (this.D) {
            return;
        }
        this.C = (i7 & u1.f3816t) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.D) {
            return;
        }
        this.C = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@v int i7) {
        super.setBackgroundResource(i7);
        if (this.D) {
            return;
        }
        this.C = i7 == 0;
    }

    public void setDrawFullUnderline(boolean z6) {
        this.C = z6;
        this.D = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        int i11 = this.f14651v;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setPadding(i7, i8, i9, i10);
    }

    public void setTabIndicatorColor(@l int i7) {
        this.f14649t = i7;
        this.f14655z.setColor(i7);
        invalidate();
    }

    public void setTabIndicatorColorResource(@n int i7) {
        setTabIndicatorColor(k0.d.f(getContext(), i7));
    }

    @Override // p3.c
    public void setTextSpacing(int i7) {
        int i8 = this.f14652w;
        if (i7 < i8) {
            i7 = i8;
        }
        super.setTextSpacing(i7);
    }

    public b(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f14655z = paint;
        this.A = new Rect();
        this.B = 255;
        this.C = false;
        this.D = false;
        int i7 = this.f14675o;
        this.f14649t = i7;
        paint.setColor(i7);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f14650u = (int) ((3.0f * f7) + 0.5f);
        this.f14651v = (int) ((6.0f * f7) + 0.5f);
        this.f14652w = (int) (64.0f * f7);
        this.f14654y = (int) ((16.0f * f7) + 0.5f);
        this.E = (int) ((1.0f * f7) + 0.5f);
        this.f14653x = (int) ((f7 * 32.0f) + 0.5f);
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f14663c.setFocusable(true);
        this.f14663c.setOnClickListener(new a());
        this.f14665e.setFocusable(true);
        this.f14665e.setOnClickListener(new ViewOnClickListenerC0208b());
        if (getBackground() == null) {
            this.C = true;
        }
    }
}