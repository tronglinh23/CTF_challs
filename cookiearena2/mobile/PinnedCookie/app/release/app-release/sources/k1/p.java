package k1;

import android.view.View;
import android.widget.ListPopupWindow;
import d.o0;
import d.q0;
import d.w0;
/* loaded from: classes.dex */
public final class p {

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static View.OnTouchListener a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    @q0
    public static View.OnTouchListener a(@o0 ListPopupWindow listPopupWindow, @o0 View view) {
        return a.a(listPopupWindow, view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}
