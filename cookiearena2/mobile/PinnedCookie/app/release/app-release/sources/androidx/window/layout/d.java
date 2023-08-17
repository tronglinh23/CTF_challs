package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowMetrics;
import d.w0;
import u4.l0;
@w0(30)
/* loaded from: classes.dex */
public final class d {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final d f7052a = new d();

    @n6.d
    public final Rect a(@n6.d Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        l0.o(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @n6.d
    public final Rect b(@n6.d Activity activity) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        l0.o(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
