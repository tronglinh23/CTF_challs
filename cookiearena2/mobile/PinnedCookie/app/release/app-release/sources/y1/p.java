package y1;

import androidx.fragment.app.Fragment;
import u4.l0;
/* loaded from: classes.dex */
public final class p extends n {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final Fragment f18755l;

    /* renamed from: m  reason: collision with root package name */
    public final int f18756m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@n6.d Fragment fragment, @n6.d Fragment fragment2, int i7) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + fragment2 + " via container with ID " + i7 + " without using parent's childFragmentManager");
        l0.p(fragment, "fragment");
        l0.p(fragment2, "expectedParentFragment");
        this.f18755l = fragment2;
        this.f18756m = i7;
    }

    public final int b() {
        return this.f18756m;
    }

    @n6.d
    public final Fragment c() {
        return this.f18755l;
    }
}
