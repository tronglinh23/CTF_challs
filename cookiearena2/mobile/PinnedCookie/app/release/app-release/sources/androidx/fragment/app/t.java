package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
/* loaded from: classes.dex */
public abstract class t {
    @d.o0
    @Deprecated
    public Fragment c(@d.o0 Context context, @d.o0 String str, @d.q0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @d.q0
    public abstract View e(@d.d0 int i7);

    public abstract boolean g();
}
