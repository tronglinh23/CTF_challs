package k1;

import android.view.View;
import android.widget.PopupMenu;
import d.o0;
import d.q0;
import d.w0;

/* loaded from: classes.dex */
public final class s {

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static View.OnTouchListener a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    @q0
    public static View.OnTouchListener a(@o0 Object obj) {
        return a.a((PopupMenu) obj);
    }
}