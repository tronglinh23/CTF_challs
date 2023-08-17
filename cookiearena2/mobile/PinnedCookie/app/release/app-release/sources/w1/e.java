package w1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import d.b1;
import d.o0;
import d.w0;
@b1({b1.a.LIBRARY})
@w0(19)
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f18177a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18178b;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@o0 Editable editable, int i7, @o0 KeyEvent keyEvent) {
            return androidx.emoji2.text.f.h(editable, i7, keyEvent);
        }
    }

    public e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f18177a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f18177a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f18178b.a(editable, i7, keyEvent) || this.f18177a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f18177a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f18177a.onKeyUp(view, editable, i7, keyEvent);
    }

    public e(KeyListener keyListener, a aVar) {
        this.f18177a = keyListener;
        this.f18178b = aVar;
    }
}
