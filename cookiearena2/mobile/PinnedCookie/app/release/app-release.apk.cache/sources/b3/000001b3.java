package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.w0;
import d.b1;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements w0 {

    /* renamed from: b  reason: collision with root package name */
    public w0.a f1335b;

    public FitWindowsFrameLayout(@d.o0 Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        w0.a aVar = this.f1335b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.w0
    public void setOnFitSystemWindowsListener(w0.a aVar) {
        this.f1335b = aVar;
    }

    public FitWindowsFrameLayout(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}