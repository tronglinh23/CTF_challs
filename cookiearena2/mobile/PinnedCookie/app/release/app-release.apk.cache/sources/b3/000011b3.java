package i0;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;
import z0.a;

/* loaded from: classes.dex */
public final class u {

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static z0.u a(Configuration configuration) {
            return z0.u.c(configuration.getLocales().toLanguageTags());
        }
    }

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static LocaleList a(Object obj) {
            LocaleList systemLocales;
            systemLocales = androidx.appcompat.app.i.a(obj).getSystemLocales();
            return systemLocales;
        }
    }

    @d.l1
    public static z0.u a(Configuration configuration) {
        return b.a(configuration);
    }

    @d.w0(33)
    public static Object b(Context context) {
        return context.getSystemService("locale");
    }

    @d.d
    @d.o0
    @d.s0(markerClass = {a.b.class})
    public static z0.u c(@d.o0 Context context) {
        z0.u g7 = z0.u.g();
        if (z0.a.k()) {
            Object b7 = b(context);
            return b7 != null ? z0.u.o(c.a(b7)) : g7;
        }
        return a(context.getApplicationContext().getResources().getConfiguration());
    }
}