package k1;

import android.widget.ListView;
import d.o0;
import d.w0;
/* loaded from: classes.dex */
public final class r {

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(ListView listView, int i7) {
            return listView.canScrollList(i7);
        }

        @d.u
        public static void b(ListView listView, int i7) {
            listView.scrollListBy(i7);
        }
    }

    public static boolean a(@o0 ListView listView, int i7) {
        return a.a(listView, i7);
    }

    public static void b(@o0 ListView listView, int i7) {
        a.b(listView, i7);
    }
}
