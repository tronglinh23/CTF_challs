package d1;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import u4.l0;
import u4.r1;

@r1({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,68:1\n31#2,4:69\n13579#3,2:73\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n34#1:69,4\n34#1:73,2\n*E\n"})
/* loaded from: classes.dex */
public final class b0 {
    @SuppressLint({"SyntheticAccessor"})
    public static final void a(@n6.d Spannable spannable) {
        l0.p(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        l0.o(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(@n6.d Spannable spannable, int i7, int i8, @n6.d Object obj) {
        l0.p(spannable, "<this>");
        l0.p(obj, "span");
        spannable.setSpan(obj, i7, i8, 17);
    }

    public static final void c(@n6.d Spannable spannable, @n6.d d5.l lVar, @n6.d Object obj) {
        l0.p(spannable, "<this>");
        l0.p(lVar, "range");
        l0.p(obj, "span");
        spannable.setSpan(obj, lVar.b().intValue(), lVar.g().intValue(), 17);
    }

    @n6.d
    public static final Spannable d(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}