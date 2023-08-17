package y1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import u4.l0;
/* loaded from: classes.dex */
public final class o extends n {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final ViewGroup f18754l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@n6.d Fragment fragment, @n6.d ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        l0.p(fragment, "fragment");
        l0.p(viewGroup, "container");
        this.f18754l = viewGroup;
    }

    @n6.d
    public final ViewGroup b() {
        return this.f18754l;
    }
}
