package d1;

import android.text.TextUtils;
import d.o0;
import d.q0;
import d.w0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Locale f8327a = new Locale("", "");

    /* renamed from: b  reason: collision with root package name */
    public static final String f8328b = "Arab";

    /* renamed from: c  reason: collision with root package name */
    public static final String f8329c = "Hebr";

    @w0(17)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(@o0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(@q0 Locale locale) {
        return a.a(locale);
    }

    @o0
    public static String c(@o0 String str) {
        return TextUtils.htmlEncode(str);
    }
}