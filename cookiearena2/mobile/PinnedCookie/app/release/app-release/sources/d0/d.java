package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.g;
import androidx.constraintlayout.widget.k;
import d.w0;
/* loaded from: classes.dex */
public class d extends g {

    /* renamed from: b  reason: collision with root package name */
    public float f8223b;

    /* renamed from: c  reason: collision with root package name */
    public float f8224c;

    /* renamed from: d  reason: collision with root package name */
    public Path f8225d;

    /* renamed from: e  reason: collision with root package name */
    public ViewOutlineProvider f8226e;

    /* renamed from: f  reason: collision with root package name */
    public RectF f8227f;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, d.this.getWidth(), d.this.getHeight(), (Math.min(r3, r4) * d.this.f8223b) / 2.0f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, d.this.getWidth(), d.this.getHeight(), d.this.f8224c);
        }
    }

    public d(Context context) {
        super(context);
        this.f8223b = 0.0f;
        this.f8224c = Float.NaN;
        c(context, null);
    }

    public final void c(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.te);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.Ee) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == k.m.Fe) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f8224c;
    }

    public float getRoundPercent() {
        return this.f8223b;
    }

    @w0(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f8224c = round;
            float f7 = this.f8223b;
            this.f8223b = -1.0f;
            setRoundPercent(f7);
            return;
        }
        boolean z6 = this.f8224c != round;
        this.f8224c = round;
        if (round != 0.0f) {
            if (this.f8225d == null) {
                this.f8225d = new Path();
            }
            if (this.f8227f == null) {
                this.f8227f = new RectF();
            }
            if (this.f8226e == null) {
                b bVar = new b();
                this.f8226e = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f8227f.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8225d.reset();
            Path path = this.f8225d;
            RectF rectF = this.f8227f;
            float f8 = this.f8224c;
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
        boolean z6 = this.f8223b != round;
        this.f8223b = round;
        if (round != 0.0f) {
            if (this.f8225d == null) {
                this.f8225d = new Path();
            }
            if (this.f8227f == null) {
                this.f8227f = new RectF();
            }
            if (this.f8226e == null) {
                a aVar = new a();
                this.f8226e = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8223b) / 2.0f;
            this.f8227f.set(0.0f, 0.0f, width, height);
            this.f8225d.reset();
            this.f8225d.addRoundRect(this.f8227f, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z6) {
            invalidateOutline();
        }
    }

    public d(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f8223b = 0.0f;
        this.f8224c = Float.NaN;
        c(context, attrs);
    }

    public d(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f8223b = 0.0f;
        this.f8224c = Float.NaN;
        c(context, attrs);
    }
}
