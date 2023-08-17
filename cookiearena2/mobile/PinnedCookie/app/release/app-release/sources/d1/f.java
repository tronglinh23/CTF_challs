package d1;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import d.w0;
import java.util.Locale;
import u4.l0;
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class f {
    @w0(17)
    public static final int a(@n6.d Locale locale) {
        l0.p(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
