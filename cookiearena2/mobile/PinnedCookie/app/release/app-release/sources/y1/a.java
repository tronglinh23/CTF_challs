package y1;

import androidx.fragment.app.Fragment;
import u4.l0;
/* loaded from: classes.dex */
public final class a extends n {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final String f18723l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@n6.d Fragment fragment, @n6.d String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        l0.p(fragment, "fragment");
        l0.p(str, "previousFragmentId");
        this.f18723l = str;
    }

    @n6.d
    public final String b() {
        return this.f18723l;
    }
}
