package y1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import u4.l0;
/* loaded from: classes.dex */
public final class e extends n {
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public final ViewGroup f18749l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@n6.d Fragment fragment, @n6.e ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        l0.p(fragment, "fragment");
        this.f18749l = viewGroup;
    }

    @n6.e
    public final ViewGroup b() {
        return this.f18749l;
    }
}
