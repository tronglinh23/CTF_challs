package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import d.b1;
import d.g0;
import d.o0;
import d.q0;
import d.w0;

@b1({b1.a.LIBRARY_GROUP})
@w0(19)
/* loaded from: classes.dex */
public final class r extends k {
    @q0

    /* renamed from: f  reason: collision with root package name */
    public static Paint f4163f;

    public r(@o0 i iVar) {
        super(iVar);
    }

    @o0
    public static Paint f() {
        if (f4163f == null) {
            TextPaint textPaint = new TextPaint();
            f4163f = textPaint;
            textPaint.setColor(f.b().e());
            f4163f.setStyle(Paint.Style.FILL);
        }
        return f4163f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@o0 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @g0(from = 0) int i7, @g0(from = 0) int i8, float f7, int i9, int i10, int i11, @o0 Paint paint) {
        if (f.b().o()) {
            canvas.drawRect(f7, i9, f7 + e(), i11, f());
        }
        c().a(canvas, f7, i10, paint);
    }
}