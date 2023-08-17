package d1;

import android.text.TextUtils;
import u4.l0;
/* loaded from: classes.dex */
public final class d0 {
    @n6.d
    public static final String a(@n6.d String str) {
        l0.p(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        l0.o(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
