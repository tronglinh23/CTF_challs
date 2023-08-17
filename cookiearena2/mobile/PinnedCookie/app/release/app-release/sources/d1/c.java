package d1;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import d.o0;
import d.q0;
import d.w0;
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8298a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f8299b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8300c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f8301d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f8302e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f8303f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final int f8304g = 16;

    /* renamed from: h  reason: collision with root package name */
    public static final int f8305h = 32;

    /* renamed from: i  reason: collision with root package name */
    public static final int f8306i = 256;

    /* renamed from: j  reason: collision with root package name */
    public static final int f8307j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f8308k = 63;

    @w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static Spanned a(String str, int i7) {
            return Html.fromHtml(str, i7);
        }

        @d.u
        public static Spanned b(String str, int i7, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i7, imageGetter, tagHandler);
        }

        @d.u
        public static String c(Spanned spanned, int i7) {
            return Html.toHtml(spanned, i7);
        }
    }

    @o0
    public static Spanned a(@o0 String str, int i7) {
        return a.a(str, i7);
    }

    @o0
    public static Spanned b(@o0 String str, int i7, @q0 Html.ImageGetter imageGetter, @q0 Html.TagHandler tagHandler) {
        return a.b(str, i7, imageGetter, tagHandler);
    }

    @o0
    public static String c(@o0 Spanned spanned, int i7) {
        return a.c(spanned, i7);
    }
}
