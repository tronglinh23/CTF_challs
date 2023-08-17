package d1;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import u4.l0;
import u4.r1;
import v3.m2;

@r1({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {
    @n6.d
    public static final SpannableStringBuilder a(@n6.d SpannableStringBuilder spannableStringBuilder, @d.l int i7, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i7);
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder b(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannedString c(@n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(lVar, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        lVar.O(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @n6.d
    public static final SpannableStringBuilder d(@n6.d SpannableStringBuilder spannableStringBuilder, @d.l int i7, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i7);
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder e(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d Object obj, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(obj, "span");
        l0.p(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder f(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d Object[] objArr, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(objArr, "spans");
        l0.p(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder g(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder h(@n6.d SpannableStringBuilder spannableStringBuilder, float f7, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f7);
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder i(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder j(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder k(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @n6.d
    public static final SpannableStringBuilder l(@n6.d SpannableStringBuilder spannableStringBuilder, @n6.d t4.l<? super SpannableStringBuilder, m2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        lVar.O(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}