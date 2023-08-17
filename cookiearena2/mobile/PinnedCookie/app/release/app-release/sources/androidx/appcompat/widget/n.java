package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import f.a;
/* loaded from: classes.dex */
public class n {
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final EditText f1728a;
    @d.o0

    /* renamed from: b  reason: collision with root package name */
    public final w1.a f1729b;

    public n(@d.o0 EditText editText) {
        this.f1728a = editText;
        this.f1729b = new w1.a(editText, false);
    }

    @d.q0
    public KeyListener a(@d.q0 KeyListener keyListener) {
        return b(keyListener) ? this.f1729b.b(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean c() {
        return this.f1729b.d();
    }

    public void d(@d.q0 AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f1728a.getContext().obtainStyledAttributes(attributeSet, a.m.f9590v0, i7, 0);
        try {
            boolean z6 = obtainStyledAttributes.hasValue(a.m.K0) ? obtainStyledAttributes.getBoolean(a.m.K0, true) : true;
            obtainStyledAttributes.recycle();
            f(z6);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @d.q0
    public InputConnection e(@d.q0 InputConnection inputConnection, @d.o0 EditorInfo editorInfo) {
        return this.f1729b.e(inputConnection, editorInfo);
    }

    public void f(boolean z6) {
        this.f1729b.g(z6);
    }
}
