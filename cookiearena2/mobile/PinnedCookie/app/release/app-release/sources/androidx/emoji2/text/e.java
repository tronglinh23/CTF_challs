package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;
import d.b1;
import d.o0;
import p0.x0;
@b1({b1.a.LIBRARY})
@d.d
/* loaded from: classes.dex */
public class e implements f.e {

    /* renamed from: b  reason: collision with root package name */
    public static final int f4041b = 10;

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f4042c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f4043a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.f4043a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f4042c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(@o0 CharSequence charSequence, int i7, int i8, int i9) {
        StringBuilder b7 = b();
        b7.setLength(0);
        while (i7 < i8) {
            b7.append(charSequence.charAt(i7));
            i7++;
        }
        return x0.a(this.f4043a, b7.toString());
    }
}
