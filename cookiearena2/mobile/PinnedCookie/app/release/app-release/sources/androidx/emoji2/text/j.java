package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.p;
import d.b1;
import d.g0;
import d.o0;
import d.q0;
import d.w0;
import java.util.Arrays;
@b1({b1.a.LIBRARY})
@d.d
@w0(19)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: f  reason: collision with root package name */
    public static final int f4097f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4098g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4099h = 3;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final f.l f4100a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final p f4101b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public f.e f4102c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4103d;
    @q0

    /* renamed from: e  reason: collision with root package name */
    public final int[] f4104e;

    @w0(19)
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f4105a = -1;

        public static int a(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z6 = false;
                while (i8 != 0) {
                    i7--;
                    if (i7 < 0) {
                        return z6 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i7);
                    if (z6) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i8--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i8--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z6 = true;
                    }
                }
                return i7;
            }
        }

        public static int b(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z6 = false;
                while (i8 != 0) {
                    if (i7 >= length) {
                        if (z6) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i7);
                    if (z6) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i8--;
                        i7++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i8--;
                        i7++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i7++;
                        z6 = true;
                    }
                }
                return i7;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: i  reason: collision with root package name */
        public static final int f4106i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f4107j = 2;

        /* renamed from: a  reason: collision with root package name */
        public int f4108a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final p.a f4109b;

        /* renamed from: c  reason: collision with root package name */
        public p.a f4110c;

        /* renamed from: d  reason: collision with root package name */
        public p.a f4111d;

        /* renamed from: e  reason: collision with root package name */
        public int f4112e;

        /* renamed from: f  reason: collision with root package name */
        public int f4113f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f4114g;

        /* renamed from: h  reason: collision with root package name */
        public final int[] f4115h;

        public b(p.a aVar, boolean z6, int[] iArr) {
            this.f4109b = aVar;
            this.f4110c = aVar;
            this.f4114g = z6;
            this.f4115h = iArr;
        }

        public static boolean d(int i7) {
            return i7 == 65039;
        }

        public static boolean f(int i7) {
            return i7 == 65038;
        }

        public int a(int i7) {
            p.a a7 = this.f4110c.a(i7);
            int i8 = 2;
            if (this.f4108a != 2) {
                if (a7 == null) {
                    i8 = g();
                } else {
                    this.f4108a = 2;
                    this.f4110c = a7;
                    this.f4113f = 1;
                }
            } else if (a7 != null) {
                this.f4110c = a7;
                this.f4113f++;
            } else if (f(i7)) {
                i8 = g();
            } else if (!d(i7)) {
                if (this.f4110c.b() != null) {
                    i8 = 3;
                    if (this.f4113f != 1) {
                        this.f4111d = this.f4110c;
                        g();
                    } else if (h()) {
                        this.f4111d = this.f4110c;
                        g();
                    } else {
                        i8 = g();
                    }
                } else {
                    i8 = g();
                }
            }
            this.f4112e = i7;
            return i8;
        }

        public i b() {
            return this.f4110c.b();
        }

        public i c() {
            return this.f4111d.b();
        }

        public boolean e() {
            return this.f4108a == 2 && this.f4110c.b() != null && (this.f4113f > 1 || h());
        }

        public final int g() {
            this.f4108a = 1;
            this.f4110c = this.f4109b;
            this.f4113f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f4110c.b().l() || d(this.f4112e)) {
                return true;
            }
            if (this.f4114g) {
                if (this.f4115h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f4115h, this.f4110c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public j(@o0 p pVar, @o0 f.l lVar, @o0 f.e eVar, boolean z6, @q0 int[] iArr) {
        this.f4100a = lVar;
        this.f4101b = pVar;
        this.f4102c = eVar;
        this.f4103d = z6;
        this.f4104e = iArr;
    }

    public static boolean b(@o0 Editable editable, @o0 KeyEvent keyEvent, boolean z6) {
        k[] kVarArr;
        if (i(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!h(selectionStart, selectionEnd) && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(@o0 InputConnection inputConnection, @o0 Editable editable, @g0(from = 0) int i7, @g0(from = 0) int i8, boolean z6) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i7 >= 0 && i8 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (h(selectionStart, selectionEnd)) {
                return false;
            }
            if (z6) {
                max = a.a(editable, selectionStart, Math.max(i7, 0));
                min = a.b(editable, selectionEnd, Math.max(i8, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i7, 0);
                min = Math.min(selectionEnd + i8, editable.length());
            }
            k[] kVarArr = (k[]) editable.getSpans(max, min, k.class);
            if (kVarArr != null && kVarArr.length > 0) {
                for (k kVar : kVarArr) {
                    int spanStart = editable.getSpanStart(kVar);
                    int spanEnd = editable.getSpanEnd(kVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean f(@o0 Editable editable, int i7, @o0 KeyEvent keyEvent) {
        if (i7 != 67 ? i7 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    public static boolean h(int i7, int i8) {
        return i7 == -1 || i8 == -1 || i7 != i8;
    }

    public static boolean i(@o0 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void a(@o0 Spannable spannable, i iVar, int i7, int i8) {
        spannable.setSpan(this.f4100a.a(iVar), i7, i8, 33);
    }

    public int c(@o0 CharSequence charSequence) {
        return d(charSequence, this.f4101b.h());
    }

    public int d(@o0 CharSequence charSequence, int i7) {
        b bVar = new b(this.f4101b.i(), this.f4103d, this.f4104e);
        int length = charSequence.length();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int codePointAt = Character.codePointAt(charSequence, i8);
            int a7 = bVar.a(codePointAt);
            i b7 = bVar.b();
            if (a7 == 1) {
                i8 += Character.charCount(codePointAt);
                i10 = 0;
            } else if (a7 == 2) {
                i8 += Character.charCount(codePointAt);
            } else if (a7 == 3) {
                b7 = bVar.c();
                if (b7.d() <= i7) {
                    i9++;
                }
            }
            if (b7 != null && b7.d() <= i7) {
                i10++;
            }
        }
        if (i9 != 0) {
            return 2;
        }
        if (!bVar.e() || bVar.b().d() > i7) {
            return i10 == 0 ? 0 : 2;
        }
        return 1;
    }

    public final boolean g(CharSequence charSequence, int i7, int i8, i iVar) {
        if (iVar.e() == 0) {
            iVar.n(this.f4102c.a(charSequence, i7, i8, iVar.i()));
        }
        return iVar.e() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
        ((androidx.emoji2.text.q) r11).d();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:19:0x0037, B:21:0x003f, B:23:0x0042, B:25:0x0046, B:27:0x0052, B:28:0x0055, B:30:0x0062, B:36:0x0071, B:37:0x007d, B:41:0x0098, B:49:0x00a8, B:52:0x00b4, B:53:0x00be, B:54:0x00c8, B:56:0x00cf, B:57:0x00d4, B:59:0x00df, B:61:0x00e6, B:65:0x00f0, B:68:0x00fc, B:69:0x0102, B:71:0x010b, B:16:0x002c), top: B:85:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:19:0x0037, B:21:0x003f, B:23:0x0042, B:25:0x0046, B:27:0x0052, B:28:0x0055, B:30:0x0062, B:36:0x0071, B:37:0x007d, B:41:0x0098, B:49:0x00a8, B:52:0x00b4, B:53:0x00be, B:54:0x00c8, B:56:0x00cf, B:57:0x00d4, B:59:0x00df, B:61:0x00e6, B:65:0x00f0, B:68:0x00fc, B:69:0x0102, B:71:0x010b, B:16:0x002c), top: B:85:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #0 {all -> 0x0129, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:19:0x0037, B:21:0x003f, B:23:0x0042, B:25:0x0046, B:27:0x0052, B:28:0x0055, B:30:0x0062, B:36:0x0071, B:37:0x007d, B:41:0x0098, B:49:0x00a8, B:52:0x00b4, B:53:0x00be, B:54:0x00c8, B:56:0x00cf, B:57:0x00d4, B:59:0x00df, B:61:0x00e6, B:65:0x00f0, B:68:0x00fc, B:69:0x0102, B:71:0x010b, B:16:0x002c), top: B:85:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence j(@d.o0 java.lang.CharSequence r11, @d.g0(from = 0) int r12, @d.g0(from = 0) int r13, @d.g0(from = 0) int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
