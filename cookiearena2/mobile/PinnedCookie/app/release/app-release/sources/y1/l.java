package y1;

import androidx.fragment.app.Fragment;
import u4.l0;
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f18752l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@n6.d Fragment fragment, boolean z6) {
        super(fragment, "Attempting to set user visible hint to " + z6 + " for fragment " + fragment);
        l0.p(fragment, "fragment");
        this.f18752l = z6;
    }

    public final boolean b() {
        return this.f18752l;
    }
}
