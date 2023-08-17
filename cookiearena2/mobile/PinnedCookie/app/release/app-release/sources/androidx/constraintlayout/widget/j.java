package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
import y.e;
/* loaded from: classes.dex */
public class j extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f2463b;

    /* renamed from: c  reason: collision with root package name */
    public View f2464c;

    /* renamed from: d  reason: collision with root package name */
    public int f2465d;

    public j(Context context) {
        super(context);
        this.f2463b = -1;
        this.f2464c = null;
        this.f2465d = 4;
        a(null);
    }

    public final void a(AttributeSet attrs) {
        super.setVisibility(this.f2465d);
        this.f2463b = -1;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.O8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.P8) {
                    this.f2463b = obtainStyledAttributes.getResourceId(index, this.f2463b);
                } else if (index == k.m.Q8) {
                    this.f2465d = obtainStyledAttributes.getInt(index, this.f2465d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout container) {
        if (this.f2464c == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f2464c.getLayoutParams();
        bVar2.f2073v0.b2(0);
        e.b H = bVar.f2073v0.H();
        e.b bVar3 = e.b.FIXED;
        if (H != bVar3) {
            bVar.f2073v0.c2(bVar2.f2073v0.m0());
        }
        if (bVar.f2073v0.j0() != bVar3) {
            bVar.f2073v0.y1(bVar2.f2073v0.D());
        }
        bVar2.f2073v0.b2(8);
    }

    public void c(ConstraintLayout container) {
        if (this.f2463b == -1 && !isInEditMode()) {
            setVisibility(this.f2465d);
        }
        View findViewById = container.findViewById(this.f2463b);
        this.f2464c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f2049j0 = true;
            this.f2464c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2464c;
    }

    public int getEmptyVisibility() {
        return this.f2465d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int id) {
        View findViewById;
        if (this.f2463b == id) {
            return;
        }
        View view = this.f2464c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f2464c.getLayoutParams()).f2049j0 = false;
            this.f2464c = null;
        }
        this.f2463b = id;
        if (id == -1 || (findViewById = ((View) getParent()).findViewById(id)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int visibility) {
        this.f2465d = visibility;
    }

    public j(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2463b = -1;
        this.f2464c = null;
        this.f2465d = 4;
        a(attrs);
    }

    public j(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2463b = -1;
        this.f2464c = null;
        this.f2465d = 4;
        a(attrs);
    }

    public j(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f2463b = -1;
        this.f2464c = null;
        this.f2465d = 4;
        a(attrs);
    }
}
