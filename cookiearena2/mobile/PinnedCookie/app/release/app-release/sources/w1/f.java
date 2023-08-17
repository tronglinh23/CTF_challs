package w1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
import g1.s;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f18179a;

    @w0(19)
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f18180a;

        /* renamed from: b  reason: collision with root package name */
        public final d f18181b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f18182c = true;

        public a(TextView textView) {
            this.f18180a = textView;
            this.f18181b = new d(textView);
        }

        @Override // w1.f.b
        @o0
        public InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
            return !this.f18182c ? i(inputFilterArr) : g(inputFilterArr);
        }

        @Override // w1.f.b
        public boolean b() {
            return this.f18182c;
        }

        @Override // w1.f.b
        public void c(boolean z6) {
            if (z6) {
                e();
            }
        }

        @Override // w1.f.b
        public void d(boolean z6) {
            this.f18182c = z6;
            e();
            l();
        }

        @Override // w1.f.b
        public void e() {
            this.f18180a.setTransformationMethod(f(this.f18180a.getTransformationMethod()));
        }

        @Override // w1.f.b
        @q0
        public TransformationMethod f(@q0 TransformationMethod transformationMethod) {
            return this.f18182c ? m(transformationMethod) : k(transformationMethod);
        }

        @o0
        public final InputFilter[] g(@o0 InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f18181b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f18181b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> h(@o0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            return sparseArray;
        }

        @o0
        public final InputFilter[] i(@o0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> h7 = h(inputFilterArr);
            if (h7.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - h7.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (h7.indexOfKey(i8) < 0) {
                    inputFilterArr2[i7] = inputFilterArr[i8];
                    i7++;
                }
            }
            return inputFilterArr2;
        }

        @b1({b1.a.LIBRARY})
        public void j(boolean z6) {
            this.f18182c = z6;
        }

        @q0
        public final TransformationMethod k(@q0 TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void l() {
            this.f18180a.setFilters(a(this.f18180a.getFilters()));
        }

        @o0
        public final TransformationMethod m(@q0 TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        @o0
        public InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z6) {
        }

        public void d(boolean z6) {
        }

        public void e() {
        }

        @q0
        public TransformationMethod f(@q0 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f18183a;

        public c(TextView textView) {
            this.f18183a = new a(textView);
        }

        @Override // w1.f.b
        @o0
        public InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
            return g() ? inputFilterArr : this.f18183a.a(inputFilterArr);
        }

        @Override // w1.f.b
        public boolean b() {
            return this.f18183a.b();
        }

        @Override // w1.f.b
        public void c(boolean z6) {
            if (g()) {
                return;
            }
            this.f18183a.c(z6);
        }

        @Override // w1.f.b
        public void d(boolean z6) {
            if (g()) {
                this.f18183a.j(z6);
            } else {
                this.f18183a.d(z6);
            }
        }

        @Override // w1.f.b
        public void e() {
            if (g()) {
                return;
            }
            this.f18183a.e();
        }

        @Override // w1.f.b
        @q0
        public TransformationMethod f(@q0 TransformationMethod transformationMethod) {
            return g() ? transformationMethod : this.f18183a.f(transformationMethod);
        }

        public final boolean g() {
            return !androidx.emoji2.text.f.n();
        }
    }

    public f(@o0 TextView textView) {
        this(textView, true);
    }

    @o0
    public InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
        return this.f18179a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f18179a.b();
    }

    public void c(boolean z6) {
        this.f18179a.c(z6);
    }

    public void d(boolean z6) {
        this.f18179a.d(z6);
    }

    public void e() {
        this.f18179a.e();
    }

    @q0
    public TransformationMethod f(@q0 TransformationMethod transformationMethod) {
        return this.f18179a.f(transformationMethod);
    }

    public f(@o0 TextView textView, boolean z6) {
        s.m(textView, "textView cannot be null");
        if (!z6) {
            this.f18179a = new c(textView);
        } else {
            this.f18179a = new a(textView);
        }
    }
}
