package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import f.a;

/* loaded from: classes.dex */
public class o {
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1731a;
    @d.o0

    /* renamed from: b  reason: collision with root package name */
    public final w1.f f1732b;

    public o(@d.o0 TextView textView) {
        this.f1731a = textView;
        this.f1732b = new w1.f(textView, false);
    }

    @d.o0
    public InputFilter[] a(@d.o0 InputFilter[] inputFilterArr) {
        return this.f1732b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1732b.b();
    }

    public void c(@d.q0 AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f1731a.getContext().obtainStyledAttributes(attributeSet, a.m.f9590v0, i7, 0);
        try {
            boolean z6 = obtainStyledAttributes.hasValue(a.m.K0) ? obtainStyledAttributes.getBoolean(a.m.K0, true) : true;
            obtainStyledAttributes.recycle();
            e(z6);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z6) {
        this.f1732b.c(z6);
    }

    public void e(boolean z6) {
        this.f1732b.d(z6);
    }

    @d.q0
    public TransformationMethod f(@d.q0 TransformationMethod transformationMethod) {
        return this.f1732b.f(transformationMethod);
    }
}