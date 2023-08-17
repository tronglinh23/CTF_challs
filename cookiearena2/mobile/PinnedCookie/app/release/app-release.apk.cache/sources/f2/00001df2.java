package y1;

import androidx.fragment.app.Fragment;
import u4.l0;
import u4.w;

/* loaded from: classes.dex */
public abstract class n extends RuntimeException {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Fragment f18753k;

    public /* synthetic */ n(Fragment fragment, String str, int i7, w wVar) {
        this(fragment, (i7 & 2) != 0 ? null : str);
    }

    @n6.d
    public final Fragment a() {
        return this.f18753k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@n6.d Fragment fragment, @n6.e String str) {
        super(str);
        l0.p(fragment, "fragment");
        this.f18753k = fragment;
    }
}