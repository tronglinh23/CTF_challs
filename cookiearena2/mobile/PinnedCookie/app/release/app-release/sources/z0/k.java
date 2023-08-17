package z0;

import android.content.res.Configuration;
import android.os.LocaleList;
/* loaded from: classes.dex */
public final class k {

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @d.o0
    public static u a(@d.o0 Configuration configuration) {
        return u.o(a.a(configuration));
    }
}
