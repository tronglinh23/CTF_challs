package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import d.w0;
import u4.l0;
@w0(26)
/* loaded from: classes.dex */
public final class c {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final c f545a = new c();

    public final void a(@n6.d Activity activity, @n6.d Rect rect) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(rect, "hint");
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rect).build());
    }
}
