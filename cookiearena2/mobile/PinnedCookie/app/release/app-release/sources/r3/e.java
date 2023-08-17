package r3;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import d.u0;
import g1.s;
import r3.h;
/* loaded from: classes.dex */
public final class e implements h.m {

    /* renamed from: a  reason: collision with root package name */
    public final int f15619a;

    public e(@u0 int i7) {
        s.j(i7, "Margin must be non-negative");
        this.f15619a = i7;
    }

    @Override // r3.h.m
    public void a(@o0 View view, float f7) {
        h b7 = b(view);
        float f8 = this.f15619a * f7;
        if (b7.getOrientation() != 0) {
            view.setTranslationY(f8);
            return;
        }
        if (b7.k()) {
            f8 = -f8;
        }
        view.setTranslationX(f8);
    }

    public final h b(@o0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof h)) {
            return (h) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
