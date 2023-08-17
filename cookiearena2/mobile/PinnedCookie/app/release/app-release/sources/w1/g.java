package w1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import d.b1;
import d.q0;
import d.w0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
@b1({b1.a.LIBRARY})
@w0(19)
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: b  reason: collision with root package name */
    public final EditText f18184b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18185c;

    /* renamed from: d  reason: collision with root package name */
    public f.AbstractC0045f f18186d;

    /* renamed from: e  reason: collision with root package name */
    public int f18187e = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public int f18188f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18189g = true;

    @w0(19)
    /* loaded from: classes.dex */
    public static class a extends f.AbstractC0045f {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f18190a;

        public a(EditText editText) {
            this.f18190a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0045f
        public void b() {
            super.b();
            g.e(this.f18190a.get(), 1);
        }
    }

    public g(EditText editText, boolean z6) {
        this.f18184b = editText;
        this.f18185c = z6;
    }

    public static void e(@q0 EditText editText, int i7) {
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.b().u(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public int a() {
        return this.f18188f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public final f.AbstractC0045f b() {
        if (this.f18186d == null) {
            this.f18186d = new a(this.f18184b);
        }
        return this.f18186d;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    public int c() {
        return this.f18187e;
    }

    public boolean d() {
        return this.f18189g;
    }

    public void f(int i7) {
        this.f18188f = i7;
    }

    public void g(boolean z6) {
        if (this.f18189g != z6) {
            if (this.f18186d != null) {
                androidx.emoji2.text.f.b().C(this.f18186d);
            }
            this.f18189g = z6;
            if (z6) {
                e(this.f18184b, androidx.emoji2.text.f.b().f());
            }
        }
    }

    public void h(int i7) {
        this.f18187e = i7;
    }

    public final boolean i() {
        return (this.f18189g && (this.f18185c || androidx.emoji2.text.f.n())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        if (this.f18184b.isInEditMode() || i() || i8 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int f7 = androidx.emoji2.text.f.b().f();
        if (f7 != 0) {
            if (f7 == 1) {
                androidx.emoji2.text.f.b().x((Spannable) charSequence, i7, i7 + i9, this.f18187e, this.f18188f);
                return;
            } else if (f7 != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.b().y(b());
    }
}
