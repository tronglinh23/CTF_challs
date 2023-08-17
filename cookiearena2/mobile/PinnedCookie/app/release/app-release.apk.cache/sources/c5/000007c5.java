package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import d.w0;
import u4.l0;

@w0(17)
/* loaded from: classes.dex */
public final class e {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final e f7053a = new e();

    public final void a(@n6.d Display display, @n6.d Point point) {
        l0.p(display, "display");
        l0.p(point, "point");
        display.getRealSize(point);
    }
}