package w1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import d.b1;
import d.g0;
import d.o0;
import d.w0;

@b1({b1.a.LIBRARY})
@w0(19)
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f18171a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18172b;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@o0 InputConnection inputConnection, @o0 Editable editable, @g0(from = 0) int i7, @g0(from = 0) int i8, boolean z6) {
            return androidx.emoji2.text.f.g(inputConnection, editable, i7, i8, z6);
        }

        public void b(@o0 EditorInfo editorInfo) {
            if (androidx.emoji2.text.f.n()) {
                androidx.emoji2.text.f.b().D(editorInfo);
            }
        }
    }

    public c(@o0 TextView textView, @o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    public final Editable a() {
        return this.f18171a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        return this.f18172b.a(this, a(), i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return this.f18172b.a(this, a(), i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    public c(@o0 TextView textView, @o0 InputConnection inputConnection, @o0 EditorInfo editorInfo, @o0 a aVar) {
        super(inputConnection, false);
        this.f18171a = textView;
        this.f18172b = aVar;
        aVar.b(editorInfo);
    }
}