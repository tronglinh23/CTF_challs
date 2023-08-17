package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.g;
import d.w0;
@w0(17)
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: androidx.cardview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0028a implements g.a {
        public C0028a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f7, Paint paint) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void g() {
        g.f1898s = new C0028a();
    }
}
