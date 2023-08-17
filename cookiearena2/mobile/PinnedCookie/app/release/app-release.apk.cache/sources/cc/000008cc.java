package c1;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import d.o0;
import d.q0;
import d.w0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    @w0(28)
    /* loaded from: classes.dex */
    public static class a {
        public static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set namedContentLocales;
            Set namedContentLocales2;
            CharSequence nameForLocale;
            namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            namedContentLocales2 = serviceInfo.getNamedContentLocales();
            Iterator it = namedContentLocales2.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                strArr[i7] = ((Locale) it.next()).toLanguageTag();
                i7++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            nameForLocale = serviceInfo.getNameForLocale(firstMatch);
            return nameForLocale;
        }
    }

    @q0
    public static CharSequence a(@o0 Context context, @o0 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(context, serviceInfo);
        }
        return null;
    }
}