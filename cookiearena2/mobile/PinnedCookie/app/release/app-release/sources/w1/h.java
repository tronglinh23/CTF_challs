package w1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
@b1({b1.a.LIBRARY})
@w0(19)
/* loaded from: classes.dex */
public class h implements TransformationMethod {
    @q0

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f18191a;

    public h(@q0 TransformationMethod transformationMethod) {
        this.f18191a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f18191a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@q0 CharSequence charSequence, @o0 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f18191a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.f.b().f() != 1) ? charSequence : androidx.emoji2.text.f.b().u(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f18191a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i7, rect);
        }
    }
}
