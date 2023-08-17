package w1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
@b1({b1.a.LIBRARY})
@w0(19)
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f18173a;

    /* renamed from: b  reason: collision with root package name */
    public f.AbstractC0045f f18174b;

    @w0(19)
    /* loaded from: classes.dex */
    public static class a extends f.AbstractC0045f {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<TextView> f18175a;

        /* renamed from: b  reason: collision with root package name */
        public final Reference<d> f18176b;

        public a(TextView textView, d dVar) {
            this.f18175a = new WeakReference(textView);
            this.f18176b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.f.AbstractC0045f
        public void b() {
            CharSequence text;
            CharSequence u6;
            super.b();
            TextView textView = this.f18175a.get();
            if (c(textView, this.f18176b.get()) && textView.isAttachedToWindow() && text != (u6 = androidx.emoji2.text.f.b().u((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(u6);
                int selectionEnd = Selection.getSelectionEnd(u6);
                textView.setText(u6);
                if (u6 instanceof Spannable) {
                    d.b((Spannable) u6, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(@q0 TextView textView, @q0 InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(@o0 TextView textView) {
        this.f18173a = textView;
    }

    public static void b(Spannable spannable, int i7, int i8) {
        if (i7 >= 0 && i8 >= 0) {
            Selection.setSelection(spannable, i7, i8);
        } else if (i7 >= 0) {
            Selection.setSelection(spannable, i7);
        } else if (i8 >= 0) {
            Selection.setSelection(spannable, i8);
        }
    }

    public final f.AbstractC0045f a() {
        if (this.f18174b == null) {
            this.f18174b = new a(this.f18173a, this);
        }
        return this.f18174b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        if (this.f18173a.isInEditMode()) {
            return charSequence;
        }
        int f7 = androidx.emoji2.text.f.b().f();
        if (f7 != 0) {
            boolean z6 = true;
            if (f7 == 1) {
                if (i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == this.f18173a.getText()) {
                    z6 = false;
                }
                if (!z6 || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return androidx.emoji2.text.f.b().v(charSequence, 0, charSequence.length());
            } else if (f7 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.b().y(a());
        return charSequence;
    }
}
