package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import d.b1;
import d.g0;
import d.o0;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@b1({b1.a.LIBRARY_GROUP})
@d.d
@w0(19)
/* loaded from: classes.dex */
public class i {

    /* renamed from: d  reason: collision with root package name */
    public static final int f4090d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4091e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4092f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<v1.o> f4093g = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f4094a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final p f4095b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f4096c = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public i(@o0 p pVar, @g0(from = 0) int i7) {
        this.f4095b = pVar;
        this.f4094a = i7;
    }

    public void a(@o0 Canvas canvas, float f7, float f8, @o0 Paint paint) {
        Typeface j7 = this.f4095b.j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(j7);
        canvas.drawText(this.f4095b.f(), this.f4094a * 2, 2, f7, f8, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i7) {
        return h().F(i7);
    }

    public int c() {
        return h().I();
    }

    public short d() {
        return h().L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int e() {
        return this.f4096c;
    }

    public short f() {
        return h().S();
    }

    public int g() {
        return h().T();
    }

    public final v1.o h() {
        ThreadLocal<v1.o> threadLocal = f4093g;
        v1.o oVar = threadLocal.get();
        if (oVar == null) {
            oVar = new v1.o();
            threadLocal.set(oVar);
        }
        this.f4095b.g().J(oVar, this.f4094a);
        return oVar;
    }

    public short i() {
        return h().U();
    }

    @o0
    public Typeface j() {
        return this.f4095b.j();
    }

    public short k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    @b1({b1.a.TESTS})
    public void m() {
        this.f4096c = 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void n(boolean z6) {
        this.f4096c = z6 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(g()));
        sb.append(", codepoints:");
        int c7 = c();
        for (int i7 = 0; i7 < c7; i7++) {
            sb.append(Integer.toHexString(b(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
