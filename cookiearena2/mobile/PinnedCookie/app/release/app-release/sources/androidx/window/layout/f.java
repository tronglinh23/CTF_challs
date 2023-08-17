package androidx.window.layout;

import android.view.DisplayCutout;
import d.w0;
import u4.l0;
@w0(28)
/* loaded from: classes.dex */
public final class f {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final f f7054a = new f();

    public final int a(@n6.d DisplayCutout displayCutout) {
        int safeInsetBottom;
        l0.p(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int b(@n6.d DisplayCutout displayCutout) {
        int safeInsetLeft;
        l0.p(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int c(@n6.d DisplayCutout displayCutout) {
        int safeInsetRight;
        l0.p(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int d(@n6.d DisplayCutout displayCutout) {
        int safeInsetTop;
        l0.p(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
