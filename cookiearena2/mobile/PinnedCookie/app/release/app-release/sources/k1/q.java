package k1;

import android.widget.ListView;
import d.o0;
/* loaded from: classes.dex */
public class q extends a {
    public final ListView J;

    public q(@o0 ListView listView) {
        super(listView);
        this.J = listView;
    }

    @Override // k1.a
    public boolean a(int i7) {
        return false;
    }

    @Override // k1.a
    public boolean b(int i7) {
        ListView listView = this.J;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i8 = firstVisiblePosition + childCount;
        if (i7 > 0) {
            if (i8 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i7 >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // k1.a
    public void l(int i7, int i8) {
        r.b(this.J, i8);
    }
}
