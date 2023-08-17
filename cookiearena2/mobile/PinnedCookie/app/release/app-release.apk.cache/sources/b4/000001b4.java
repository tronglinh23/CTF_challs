package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.w0;
import d.b1;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements w0 {

    /* renamed from: b  reason: collision with root package name */
    public w0.a f1336b;

    public FitWindowsLinearLayout(@d.o0 Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        w0.a aVar = this.f1336b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.w0
    public void setOnFitSystemWindowsListener(w0.a aVar) {
        this.f1336b = aVar;
    }

    public FitWindowsLinearLayout(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}