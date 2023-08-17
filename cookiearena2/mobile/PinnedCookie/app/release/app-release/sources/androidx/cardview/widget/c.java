package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;
import d.q0;
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f1883a = new RectF();

    /* loaded from: classes.dex */
    public class a implements g.a {
        public a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f7, Paint paint) {
            float f8 = 2.0f * f7;
            float width = (rectF.width() - f8) - 1.0f;
            float height = (rectF.height() - f8) - 1.0f;
            if (f7 >= 1.0f) {
                float f9 = f7 + 0.5f;
                float f10 = -f9;
                c.this.f1883a.set(f10, f10, f9, f9);
                int save = canvas.save();
                canvas.translate(rectF.left + f9, rectF.top + f9);
                canvas.drawArc(c.this.f1883a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1883a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1883a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1883a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f11 = (rectF.left + f9) - 1.0f;
                float f12 = rectF.top;
                canvas.drawRect(f11, f12, (rectF.right - f9) + 1.0f, f12 + f9, paint);
                float f13 = (rectF.left + f9) - 1.0f;
                float f14 = rectF.bottom;
                canvas.drawRect(f13, f14 - f9, (rectF.right - f9) + 1.0f, f14, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f7, rectF.right, rectF.bottom - f7, paint);
        }
    }

    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return q(dVar).i();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList b(d dVar) {
        return q(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, Context context, ColorStateList colorStateList, float f7, float f8, float f9) {
        g p6 = p(context, colorStateList, f7, f8, f9);
        p6.m(dVar.d());
        dVar.c(p6);
        f(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void d(d dVar, float f7) {
        q(dVar).p(f7);
        f(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float e(d dVar) {
        return q(dVar).l();
    }

    @Override // androidx.cardview.widget.e
    public void f(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.b((int) Math.ceil(j(dVar)), (int) Math.ceil(i(dVar)));
        dVar.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public void g() {
        g.f1898s = new a();
    }

    @Override // androidx.cardview.widget.e
    public float h(d dVar) {
        return q(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return q(dVar).j();
    }

    @Override // androidx.cardview.widget.e
    public float j(d dVar) {
        return q(dVar).k();
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void l(d dVar, float f7) {
        q(dVar).r(f7);
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        q(dVar).m(dVar.d());
        f(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @q0 ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f7) {
        q(dVar).q(f7);
        f(dVar);
    }

    public final g p(Context context, ColorStateList colorStateList, float f7, float f8, float f9) {
        return new g(context.getResources(), colorStateList, f7, f8, f9);
    }

    public final g q(d dVar) {
        return (g) dVar.f();
    }
}
