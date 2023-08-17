package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
@w0(19)
/* loaded from: classes.dex */
public abstract class k extends ReplacementSpan {
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final i f4117b;

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f4116a = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    public short f4118c = -1;

    /* renamed from: d  reason: collision with root package name */
    public short f4119d = -1;

    /* renamed from: e  reason: collision with root package name */
    public float f4120e = 1.0f;

    @b1({b1.a.LIBRARY})
    public k(@o0 i iVar) {
        g1.s.m(iVar, "metadata cannot be null");
        this.f4117b = iVar;
    }

    @b1({b1.a.TESTS})
    public final int a() {
        return this.f4119d;
    }

    @b1({b1.a.TESTS})
    public final int b() {
        return c().g();
    }

    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public final i c() {
        return this.f4117b;
    }

    @b1({b1.a.LIBRARY})
    public final float d() {
        return this.f4120e;
    }

    @b1({b1.a.LIBRARY})
    public final int e() {
        return this.f4118c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@o0 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i7, int i8, @q0 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f4116a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f4116a;
        this.f4120e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f4117b.f();
        this.f4119d = (short) (this.f4117b.f() * this.f4120e);
        short k7 = (short) (this.f4117b.k() * this.f4120e);
        this.f4118c = k7;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f4116a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return k7;
    }
}
