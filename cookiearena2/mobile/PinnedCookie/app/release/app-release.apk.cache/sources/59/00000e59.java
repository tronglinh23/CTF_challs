package d1;

import android.text.Spanned;
import android.text.SpannedString;
import u4.l0;

/* loaded from: classes.dex */
public final class c0 {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i7, int i8) {
        l0.p(spanned, "<this>");
        l0.y(4, "T");
        T[] tArr = (T[]) spanned.getSpans(i7, i8, Object.class);
        l0.o(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = spanned.length();
        }
        l0.p(spanned, "<this>");
        l0.y(4, "T");
        Object[] spans = spanned.getSpans(i7, i8, Object.class);
        l0.o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @n6.d
    public static final Spanned c(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}