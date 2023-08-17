package d1;

import android.text.TextUtils;
import u4.l0;

/* loaded from: classes.dex */
public final class b {
    public static final boolean a(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}