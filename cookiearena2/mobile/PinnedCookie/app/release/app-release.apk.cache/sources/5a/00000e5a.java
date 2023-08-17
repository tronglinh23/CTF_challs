package d1;

import android.text.Html;
import android.text.Spanned;
import u4.l0;

/* loaded from: classes.dex */
public final class d {
    @n6.d
    public static final Spanned a(@n6.d String str, int i7, @n6.e Html.ImageGetter imageGetter, @n6.e Html.TagHandler tagHandler) {
        l0.p(str, "<this>");
        Spanned b7 = c.b(str, i7, imageGetter, tagHandler);
        l0.o(b7, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b7;
    }

    public static /* synthetic */ Spanned b(String str, int i7, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            imageGetter = null;
        }
        if ((i8 & 4) != 0) {
            tagHandler = null;
        }
        l0.p(str, "<this>");
        Spanned b7 = c.b(str, i7, imageGetter, tagHandler);
        l0.o(b7, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b7;
    }

    @n6.d
    public static final String c(@n6.d Spanned spanned, int i7) {
        l0.p(spanned, "<this>");
        String c7 = c.c(spanned, i7);
        l0.o(c7, "toHtml(this, option)");
        return c7;
    }

    public static /* synthetic */ String d(Spanned spanned, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        l0.p(spanned, "<this>");
        String c7 = c.c(spanned, i7);
        l0.o(c7, "toHtml(this, option)");
        return c7;
    }
}