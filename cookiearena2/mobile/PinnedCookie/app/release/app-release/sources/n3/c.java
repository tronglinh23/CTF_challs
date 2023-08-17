package n3;

import android.view.View;
import android.view.ViewGroup;
import d.d0;
import d.q0;
/* loaded from: classes.dex */
public class c {
    @q0
    public static <T extends View> T a(View view, @d0 int i7) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                T t6 = (T) viewGroup.getChildAt(i8).findViewById(i7);
                if (t6 != null) {
                    return t6;
                }
            }
            return null;
        }
        return null;
    }
}
