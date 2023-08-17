package y1;

import androidx.fragment.app.Fragment;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public abstract class m extends n {
    public /* synthetic */ m(Fragment fragment, String str, int i7, w wVar) {
        this(fragment, (i7 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@n6.d Fragment fragment, @n6.e String str) {
        super(fragment, str);
        l0.p(fragment, "fragment");
    }
}
