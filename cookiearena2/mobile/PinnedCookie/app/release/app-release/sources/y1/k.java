package y1;

import androidx.fragment.app.Fragment;
import u4.l0;
/* loaded from: classes.dex */
public final class k extends m {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final Fragment f18750l;

    /* renamed from: m  reason: collision with root package name */
    public final int f18751m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@n6.d Fragment fragment, @n6.d Fragment fragment2, int i7) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i7 + " for fragment " + fragment);
        l0.p(fragment, "fragment");
        l0.p(fragment2, "targetFragment");
        this.f18750l = fragment2;
        this.f18751m = i7;
    }

    public final int b() {
        return this.f18751m;
    }

    @n6.d
    public final Fragment c() {
        return this.f18750l;
    }
}
