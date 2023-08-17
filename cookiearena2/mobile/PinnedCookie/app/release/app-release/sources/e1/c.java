package e1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import d.b1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import e1.c;
import g1.q;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f8740a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<b> f8741b = new Comparator() { // from class: e1.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int o6;
            o6 = c.o((c.b) obj, (c.b) obj2);
            return o6;
        }
    };

    @w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @u
        public static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public URLSpan f8742a;

        /* renamed from: b  reason: collision with root package name */
        public String f8743b;

        /* renamed from: c  reason: collision with root package name */
        public int f8744c;

        /* renamed from: d  reason: collision with root package name */
        public int f8745d;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: e1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0100c {
    }

    public static void b(@o0 TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void c(@o0 TextView textView, @o0 Pattern pattern, @q0 String str) {
        if (r()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            e(textView, pattern, str, null, null, null);
        }
    }

    public static void d(@o0 TextView textView, @o0 Pattern pattern, @q0 String str, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        if (r()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            e(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    public static void e(@o0 TextView textView, @o0 Pattern pattern, @q0 String str, @q0 String[] strArr, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        if (r()) {
            a.a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (i(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            b(textView);
        }
    }

    public static boolean f(@o0 Spannable spannable, int i7) {
        if (r()) {
            return Linkify.addLinks(spannable, i7);
        }
        if (i7 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i7 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            m(arrayList, spannable, q.f10047w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i7 & 2) != 0) {
            m(arrayList, spannable, q.A, new String[]{y0.c.f18714b}, null, null);
        }
        if ((i7 & 8) != 0) {
            n(arrayList, spannable);
        }
        q(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f8742a == null) {
                k(bVar.f8743b, bVar.f8744c, bVar.f8745d, spannable);
            }
        }
        return true;
    }

    public static boolean g(@o0 Spannable spannable, @o0 Pattern pattern, @q0 String str) {
        return r() ? Linkify.addLinks(spannable, pattern, str) : i(spannable, pattern, str, null, null, null);
    }

    public static boolean h(@o0 Spannable spannable, @o0 Pattern pattern, @q0 String str, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        return r() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : i(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static boolean i(@o0 Spannable spannable, @o0 Pattern pattern, @q0 String str, @q0 String[] strArr, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        if (r()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f8740a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str2 = strArr[i7];
            i7++;
            strArr2[i7] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z6 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) && group != null) {
                k(p(group, strArr2, matcher, transformFilter), start, end, spannable);
                z6 = true;
            }
        }
        return z6;
    }

    public static boolean j(@o0 TextView textView, int i7) {
        if (r()) {
            return Linkify.addLinks(textView, i7);
        }
        if (i7 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (f(valueOf, i7)) {
                b(textView);
                textView.setText(valueOf);
                return true;
            }
        } else if (f((Spannable) text, i7)) {
            b(textView);
            return true;
        }
        return false;
    }

    public static void k(String str, int i7, int i8, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i7, i8, 33);
    }

    public static String l(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : e1.a.c(str);
    }

    public static void m(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    b bVar = new b();
                    bVar.f8743b = p(group, strArr, matcher, transformFilter);
                    bVar.f8744c = start;
                    bVar.f8745d = end;
                    arrayList.add(bVar);
                }
            }
        }
    }

    public static void n(ArrayList<b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i7 = 0;
        while (true) {
            try {
                String l7 = l(obj);
                if (l7 != null && (indexOf = obj.indexOf(l7)) >= 0) {
                    b bVar = new b();
                    int length = l7.length() + indexOf;
                    bVar.f8744c = indexOf + i7;
                    i7 += length;
                    bVar.f8745d = i7;
                    obj = obj.substring(length);
                    try {
                        bVar.f8743b = "geo:0,0?q=" + URLEncoder.encode(l7, "UTF-8");
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    public static /* synthetic */ int o(b bVar, b bVar2) {
        int i7 = bVar.f8744c;
        int i8 = bVar2.f8744c;
        if (i7 < i8) {
            return -1;
        }
        if (i7 > i8) {
            return 1;
        }
        return Integer.compare(bVar2.f8745d, bVar.f8745d);
    }

    public static String p(@o0 String str, @o0 String[] strArr, Matcher matcher, @q0 Linkify.TransformFilter transformFilter) {
        boolean z6;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                z6 = false;
                break;
            }
            String str2 = strArr[i7];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z6 = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                }
            } else {
                i7++;
            }
        }
        if (z6 || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    public static void q(ArrayList<b> arrayList, Spannable spannable) {
        int i7;
        int i8 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.f8742a = uRLSpan;
            bVar.f8744c = spannable.getSpanStart(uRLSpan);
            bVar.f8745d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f8741b);
        int size = arrayList.size();
        while (i8 < size - 1) {
            b bVar2 = arrayList.get(i8);
            int i9 = i8 + 1;
            b bVar3 = arrayList.get(i9);
            int i10 = bVar2.f8744c;
            int i11 = bVar3.f8744c;
            if (i10 <= i11 && (i7 = bVar2.f8745d) > i11) {
                int i12 = bVar3.f8745d;
                int i13 = (i12 > i7 && i7 - i10 <= i12 - i11) ? i7 - i10 < i12 - i11 ? i8 : -1 : i9;
                if (i13 != -1) {
                    Object obj = arrayList.get(i13).f8742a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i13);
                    size--;
                }
            }
            i8 = i9;
        }
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
