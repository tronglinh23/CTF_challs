package j1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import d.l1;
import d.o0;
import d.q0;
import d.w0;
import g1.s;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11383a = 16777216;

    /* renamed from: b  reason: collision with root package name */
    public static final int f11384b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f11385c = new String[0];

    /* renamed from: d  reason: collision with root package name */
    public static final String f11386d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: e  reason: collision with root package name */
    public static final String f11387e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: f  reason: collision with root package name */
    public static final String f11388f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* renamed from: g  reason: collision with root package name */
    public static final String f11389g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* renamed from: h  reason: collision with root package name */
    public static final String f11390h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    @l1

    /* renamed from: i  reason: collision with root package name */
    public static final int f11391i = 2048;
    @l1

    /* renamed from: j  reason: collision with root package name */
    public static final int f11392j = 1024;

    @w0(30)
    /* loaded from: classes.dex */
    public static class a {
        public static CharSequence a(@o0 EditorInfo editorInfo, int i7) {
            CharSequence initialSelectedText;
            initialSelectedText = editorInfo.getInitialSelectedText(i7);
            return initialSelectedText;
        }

        public static CharSequence b(@o0 EditorInfo editorInfo, int i7, int i8) {
            CharSequence initialTextAfterCursor;
            initialTextAfterCursor = editorInfo.getInitialTextAfterCursor(i7, i8);
            return initialTextAfterCursor;
        }

        public static CharSequence c(@o0 EditorInfo editorInfo, int i7, int i8) {
            CharSequence initialTextBeforeCursor;
            initialTextBeforeCursor = editorInfo.getInitialTextBeforeCursor(i7, i8);
            return initialTextBeforeCursor;
        }

        public static void d(@o0 EditorInfo editorInfo, CharSequence charSequence, int i7) {
            editorInfo.setInitialSurroundingSubText(charSequence, i7);
        }
    }

    @Deprecated
    public e() {
    }

    @o0
    public static String[] a(@o0 EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : f11385c;
    }

    @q0
    public static CharSequence b(@o0 EditorInfo editorInfo, int i7) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i7);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i8 = editorInfo.extras.getInt(f11389g);
        int i9 = editorInfo.extras.getInt(f11390h);
        int i10 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i9 - i8 != i10 || (charSequence = editorInfo.extras.getCharSequence(f11388f)) == null) {
            return null;
        }
        return (i7 & 1) != 0 ? charSequence.subSequence(i8, i9) : TextUtils.substring(charSequence, i8, i9);
    }

    @q0
    public static CharSequence c(@o0 EditorInfo editorInfo, int i7, int i8) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i7, i8);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f11388f)) == null) {
            return null;
        }
        int i9 = editorInfo.extras.getInt(f11390h);
        int min = Math.min(i7, charSequence.length() - i9);
        return (i8 & 1) != 0 ? charSequence.subSequence(i9, min + i9) : TextUtils.substring(charSequence, i9, min + i9);
    }

    @q0
    public static CharSequence d(@o0 EditorInfo editorInfo, int i7, int i8) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i7, i8);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f11388f)) == null) {
            return null;
        }
        int i9 = editorInfo.extras.getInt(f11389g);
        int min = Math.min(i7, i9);
        return (i8 & 1) != 0 ? charSequence.subSequence(i9 - min, i9) : TextUtils.substring(charSequence, i9 - min, i9);
    }

    public static int e(EditorInfo editorInfo) {
        return 1;
    }

    public static boolean f(CharSequence charSequence, int i7, int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i7));
        }
        return Character.isLowSurrogate(charSequence.charAt(i7));
    }

    public static boolean g(int i7) {
        int i8 = i7 & 4095;
        return i8 == 129 || i8 == 225 || i8 == 18;
    }

    public static void h(@o0 EditorInfo editorInfo, @q0 String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void i(@o0 EditorInfo editorInfo, @o0 CharSequence charSequence, int i7) {
        s.l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i7);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 - i7 : i8 - i7;
        int i11 = i8 > i9 ? i8 - i7 : i9 - i7;
        int length = charSequence.length();
        if (i7 < 0 || i10 < 0 || i11 > length) {
            k(editorInfo, null, 0, 0);
        } else if (g(editorInfo.inputType)) {
            k(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            k(editorInfo, charSequence, i10, i11);
        } else {
            l(editorInfo, charSequence, i10, i11);
        }
    }

    public static void j(@o0 EditorInfo editorInfo, @o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            i(editorInfo, charSequence, 0);
        }
    }

    public static void k(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f11388f, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f11389g, i7);
        editorInfo.extras.putInt(f11390h, i8);
    }

    public static void l(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        int i9 = i8 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int min = Math.min(charSequence.length() - i8, i11 - Math.min(i7, (int) (i11 * 0.8d)));
        int min2 = Math.min(i7, i11 - min);
        int i12 = i7 - min2;
        if (f(charSequence, i12, 0)) {
            i12++;
            min2--;
        }
        if (f(charSequence, (i8 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i10 != i9 ? TextUtils.concat(charSequence.subSequence(i12, i12 + min2), charSequence.subSequence(i8, min + i8)) : charSequence.subSequence(i12, min2 + i10 + min + i12);
        int i13 = min2 + 0;
        k(editorInfo, concat, i13, i10 + i13);
    }
}
