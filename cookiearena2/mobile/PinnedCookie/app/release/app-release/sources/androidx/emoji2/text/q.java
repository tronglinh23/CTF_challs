package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import d.b1;
import d.o0;
import d.q0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class q extends SpannableStringBuilder {
    @o0

    /* renamed from: k  reason: collision with root package name */
    public final Class<?> f4159k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public final List<a> f4160l;

    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final Object f4161b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f4162c = new AtomicInteger(0);

        public a(Object obj) {
            this.f4161b = obj;
        }

        public final void a() {
            this.f4162c.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f4161b).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof k;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f4161b).beforeTextChanged(charSequence, i7, i8, i9);
        }

        public final void c() {
            this.f4162c.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f4162c.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f4161b).onSpanAdded(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
            int i11;
            int i12;
            if (this.f4162c.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i7 > i8) {
                        i7 = 0;
                    }
                    if (i9 > i10) {
                        i11 = i7;
                        i12 = 0;
                        ((SpanWatcher) this.f4161b).onSpanChanged(spannable, obj, i11, i8, i12, i10);
                    }
                }
                i11 = i7;
                i12 = i9;
                ((SpanWatcher) this.f4161b).onSpanChanged(spannable, obj, i11, i8, i12, i10);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f4162c.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f4161b).onSpanRemoved(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f4161b).onTextChanged(charSequence, i7, i8, i9);
        }
    }

    @b1({b1.a.LIBRARY})
    public q(@o0 Class<?> cls) {
        this.f4160l = new ArrayList();
        g1.s.m(cls, "watcherClass cannot be null");
        this.f4159k = cls;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public static q c(@o0 Class<?> cls, @o0 CharSequence charSequence) {
        return new q(cls, charSequence);
    }

    @b1({b1.a.LIBRARY})
    public void a() {
        b();
    }

    public final void b() {
        for (int i7 = 0; i7 < this.f4160l.size(); i7++) {
            this.f4160l.get(i7).a();
        }
    }

    @b1({b1.a.LIBRARY})
    public void d() {
        i();
        e();
    }

    public final void e() {
        for (int i7 = 0; i7 < this.f4160l.size(); i7++) {
            this.f4160l.get(i7).onTextChanged(this, 0, length(), length());
        }
    }

    public final a f(Object obj) {
        for (int i7 = 0; i7 < this.f4160l.size(); i7++) {
            a aVar = this.f4160l.get(i7);
            if (aVar.f4161b == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean g(@o0 Class<?> cls) {
        return this.f4159k == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@q0 Object obj) {
        a f7;
        if (h(obj) && (f7 = f(obj)) != null) {
            obj = f7;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@q0 Object obj) {
        a f7;
        if (h(obj) && (f7 = f(obj)) != null) {
            obj = f7;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@q0 Object obj) {
        a f7;
        if (h(obj) && (f7 = f(obj)) != null) {
            obj = f7;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i7, int i8, @o0 Class<T> cls) {
        if (g(cls)) {
            a[] aVarArr = (a[]) super.getSpans(i7, i8, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i9 = 0; i9 < aVarArr.length; i9++) {
                tArr[i9] = aVarArr[i9].f4161b;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i7, i8, cls);
    }

    public final boolean h(@q0 Object obj) {
        return obj != null && g(obj.getClass());
    }

    public final void i() {
        for (int i7 = 0; i7 < this.f4160l.size(); i7++) {
            this.f4160l.get(i7).c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i7, int i8, @q0 Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@q0 Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f4160l.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@q0 Object obj, int i7, int i8, int i9) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f4160l.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i7, int i8) {
        return new q(this.f4159k, this, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        b();
        super.replace(i7, i8, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    @b1({b1.a.LIBRARY})
    public q(@o0 Class<?> cls, @o0 CharSequence charSequence) {
        super(charSequence);
        this.f4160l = new ArrayList();
        g1.s.m(cls, "watcherClass cannot be null");
        this.f4159k = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        b();
        super.replace(i7, i8, charSequence, i9, i10);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public SpannableStringBuilder append(char c7) {
        super.append(c7);
        return this;
    }

    @b1({b1.a.LIBRARY})
    public q(@o0 Class<?> cls, @o0 CharSequence charSequence, int i7, int i8) {
        super(charSequence, i7, i8);
        this.f4160l = new ArrayList();
        g1.s.m(cls, "watcherClass cannot be null");
        this.f4159k = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}
