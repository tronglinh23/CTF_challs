package androidx.activity.result;

import android.annotation.SuppressLint;
import d.l0;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public abstract class i<I> {
    @o0
    public abstract c.a<I, ?> a();

    public void b(@SuppressLint({"UnknownNullness"}) I i7) {
        c(i7, null);
    }

    public abstract void c(@SuppressLint({"UnknownNullness"}) I i7, @q0 i0.i iVar);

    @l0
    public abstract void d();
}
