package w1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import d.b1;
import d.g0;
import d.o0;
import d.q0;
import d.w0;
import g1.s;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f18163a;

    /* renamed from: b  reason: collision with root package name */
    public int f18164b;

    /* renamed from: c  reason: collision with root package name */
    public int f18165c;

    @w0(19)
    /* renamed from: w1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0258a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f18166a;

        /* renamed from: b  reason: collision with root package name */
        public final g f18167b;

        public C0258a(@o0 EditText editText, boolean z6) {
            this.f18166a = editText;
            g gVar = new g(editText, z6);
            this.f18167b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(w1.b.getInstance());
        }

        @Override // w1.a.b
        public KeyListener a(@q0 KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // w1.a.b
        public boolean b() {
            return this.f18167b.d();
        }

        @Override // w1.a.b
        public InputConnection c(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f18166a, inputConnection, editorInfo);
        }

        @Override // w1.a.b
        public void d(int i7) {
            this.f18167b.f(i7);
        }

        @Override // w1.a.b
        public void e(boolean z6) {
            this.f18167b.g(z6);
        }

        @Override // w1.a.b
        public void f(int i7) {
            this.f18167b.h(i7);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        @q0
        public KeyListener a(@q0 KeyListener keyListener) {
            return keyListener;
        }

        public boolean b() {
            return false;
        }

        public InputConnection c(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
            return inputConnection;
        }

        public void d(int i7) {
        }

        public void e(boolean z6) {
        }

        public void f(int i7) {
        }
    }

    public a(@o0 EditText editText) {
        this(editText, true);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int a() {
        return this.f18165c;
    }

    @q0
    public KeyListener b(@q0 KeyListener keyListener) {
        return this.f18163a.a(keyListener);
    }

    public int c() {
        return this.f18164b;
    }

    public boolean d() {
        return this.f18163a.b();
    }

    @q0
    public InputConnection e(@q0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f18163a.c(inputConnection, editorInfo);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void f(int i7) {
        this.f18165c = i7;
        this.f18163a.d(i7);
    }

    public void g(boolean z6) {
        this.f18163a.e(z6);
    }

    public void h(@g0(from = 0) int i7) {
        s.j(i7, "maxEmojiCount should be greater than 0");
        this.f18164b = i7;
        this.f18163a.f(i7);
    }

    public a(@o0 EditText editText, boolean z6) {
        this.f18164b = Integer.MAX_VALUE;
        this.f18165c = 0;
        s.m(editText, "editText cannot be null");
        this.f18163a = new C0258a(editText, z6);
    }
}
