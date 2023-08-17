package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import d.o0;
import d.w0;
import d1.z;
import java.util.stream.IntStream;
/* loaded from: classes.dex */
public class s implements Spannable {

    /* renamed from: k  reason: collision with root package name */
    public boolean f4164k = false;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public Spannable f4165l;

    @w0(24)
    /* loaded from: classes.dex */
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof z;
        }
    }

    @w0(28)
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.s.b
        public boolean a(CharSequence charSequence) {
            return d1.g.a(charSequence) || (charSequence instanceof z);
        }
    }

    public s(@o0 Spannable spannable) {
        this.f4165l = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.f4165l;
        if (!this.f4164k && c().a(spannable)) {
            this.f4165l = new SpannableString(spannable);
        }
        this.f4164k = true;
    }

    public Spannable b() {
        return this.f4165l;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i7) {
        return this.f4165l.charAt(i7);
    }

    @Override // java.lang.CharSequence
    @o0
    @w0(api = 24)
    public IntStream chars() {
        return a.a(this.f4165l);
    }

    @Override // java.lang.CharSequence
    @o0
    @w0(api = 24)
    public IntStream codePoints() {
        return a.b(this.f4165l);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f4165l.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f4165l.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f4165l.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        return (T[]) this.f4165l.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f4165l.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f4165l.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f4165l.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f4165l.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    @o0
    public CharSequence subSequence(int i7, int i8) {
        return this.f4165l.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    @o0
    public String toString() {
        return this.f4165l.toString();
    }

    public s(@o0 Spanned spanned) {
        this.f4165l = new SpannableString(spanned);
    }

    public s(@o0 CharSequence charSequence) {
        this.f4165l = new SpannableString(charSequence);
    }
}
