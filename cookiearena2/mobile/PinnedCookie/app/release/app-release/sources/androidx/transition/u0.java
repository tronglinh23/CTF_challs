package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class u0 extends b1 implements w0 {
    public u0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static u0 c(ViewGroup viewGroup) {
        return (u0) b1.a(viewGroup);
    }

    @Override // androidx.transition.w0
    public void add(@d.o0 View view) {
        this.f5676a.b(view);
    }

    @Override // androidx.transition.w0
    public void remove(@d.o0 View view) {
        this.f5676a.h(view);
    }
}
