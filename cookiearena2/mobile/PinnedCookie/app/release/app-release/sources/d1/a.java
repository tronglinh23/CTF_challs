package d1;

import android.text.SpannableStringBuilder;
import i5.h0;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final e0 f8269d;

    /* renamed from: e  reason: collision with root package name */
    public static final char f8270e = 8234;

    /* renamed from: f  reason: collision with root package name */
    public static final char f8271f = 8235;

    /* renamed from: g  reason: collision with root package name */
    public static final char f8272g = 8236;

    /* renamed from: h  reason: collision with root package name */
    public static final char f8273h = 8206;

    /* renamed from: i  reason: collision with root package name */
    public static final char f8274i = 8207;

    /* renamed from: j  reason: collision with root package name */
    public static final String f8275j;

    /* renamed from: k  reason: collision with root package name */
    public static final String f8276k;

    /* renamed from: l  reason: collision with root package name */
    public static final String f8277l = "";

    /* renamed from: m  reason: collision with root package name */
    public static final int f8278m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f8279n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final a f8280o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f8281p;

    /* renamed from: q  reason: collision with root package name */
    public static final int f8282q = -1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f8283r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f8284s = 1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8285a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8286b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f8287c;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        public static final int f8291f = 1792;

        /* renamed from: g  reason: collision with root package name */
        public static final byte[] f8292g = new byte[f8291f];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f8293a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8294b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8295c;

        /* renamed from: d  reason: collision with root package name */
        public int f8296d;

        /* renamed from: e  reason: collision with root package name */
        public char f8297e;

        static {
            for (int i7 = 0; i7 < 1792; i7++) {
                f8292g[i7] = Character.getDirectionality(i7);
            }
        }

        public b(CharSequence charSequence, boolean z6) {
            this.f8293a = charSequence;
            this.f8294b = z6;
            this.f8295c = charSequence.length();
        }

        public static byte c(char c7) {
            return c7 < 1792 ? f8292g[c7] : Character.getDirectionality(c7);
        }

        public byte a() {
            char charAt = this.f8293a.charAt(this.f8296d - 1);
            this.f8297e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f8293a, this.f8296d);
                this.f8296d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f8296d--;
            byte c7 = c(this.f8297e);
            if (this.f8294b) {
                char c8 = this.f8297e;
                return c8 == '>' ? h() : c8 == ';' ? f() : c7;
            }
            return c7;
        }

        public byte b() {
            char charAt = this.f8293a.charAt(this.f8296d);
            this.f8297e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f8293a, this.f8296d);
                this.f8296d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f8296d++;
            byte c7 = c(this.f8297e);
            if (this.f8294b) {
                char c8 = this.f8297e;
                return c8 == '<' ? i() : c8 == '&' ? g() : c7;
            }
            return c7;
        }

        public int d() {
            this.f8296d = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (this.f8296d < this.f8295c && i7 == 0) {
                byte b7 = b();
                if (b7 != 0) {
                    if (b7 == 1 || b7 == 2) {
                        if (i9 == 0) {
                            return 1;
                        }
                    } else if (b7 != 9) {
                        switch (b7) {
                            case 14:
                            case 15:
                                i9++;
                                i8 = -1;
                                break;
                            case 16:
                            case 17:
                                i9++;
                                i8 = 1;
                                break;
                            case 18:
                                i9--;
                                i8 = 0;
                                break;
                        }
                    }
                } else if (i9 == 0) {
                    return -1;
                }
                i7 = i9;
            }
            if (i7 == 0) {
                return 0;
            }
            if (i8 != 0) {
                return i8;
            }
            while (this.f8296d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i7 == i9) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i7 == i9) {
                            return 1;
                        }
                        break;
                    case 18:
                        i9++;
                        continue;
                }
                i9--;
            }
            return 0;
        }

        public int e() {
            this.f8296d = this.f8295c;
            int i7 = 0;
            while (true) {
                int i8 = i7;
                while (this.f8296d > 0) {
                    byte a7 = a();
                    if (a7 != 0) {
                        if (a7 == 1 || a7 == 2) {
                            if (i7 == 0) {
                                return 1;
                            }
                            if (i8 == 0) {
                                break;
                            }
                        } else if (a7 != 9) {
                            switch (a7) {
                                case 14:
                                case 15:
                                    if (i8 == i7) {
                                        return -1;
                                    }
                                    i7--;
                                    break;
                                case 16:
                                case 17:
                                    if (i8 == i7) {
                                        return 1;
                                    }
                                    i7--;
                                    break;
                                case 18:
                                    i7++;
                                    break;
                                default:
                                    if (i8 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i7 == 0) {
                        return -1;
                    } else {
                        if (i8 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i7 = this.f8296d;
            do {
                int i8 = this.f8296d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f8293a;
                int i9 = i8 - 1;
                this.f8296d = i9;
                charAt = charSequence.charAt(i9);
                this.f8297e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f8296d = i7;
            this.f8297e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i7 = this.f8296d;
                if (i7 >= this.f8295c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f8293a;
                this.f8296d = i7 + 1;
                charAt = charSequence.charAt(i7);
                this.f8297e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char charAt;
            int i7 = this.f8296d;
            while (true) {
                int i8 = this.f8296d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f8293a;
                int i9 = i8 - 1;
                this.f8296d = i9;
                char charAt2 = charSequence.charAt(i9);
                this.f8297e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i10 = this.f8296d;
                        if (i10 > 0) {
                            CharSequence charSequence2 = this.f8293a;
                            int i11 = i10 - 1;
                            this.f8296d = i11;
                            charAt = charSequence2.charAt(i11);
                            this.f8297e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f8296d = i7;
            this.f8297e = h0.f11097f;
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i7 = this.f8296d;
            while (true) {
                int i8 = this.f8296d;
                if (i8 >= this.f8295c) {
                    this.f8296d = i7;
                    this.f8297e = h0.f11096e;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f8293a;
                this.f8296d = i8 + 1;
                char charAt2 = charSequence.charAt(i8);
                this.f8297e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i9 = this.f8296d;
                        if (i9 < this.f8295c) {
                            CharSequence charSequence2 = this.f8293a;
                            this.f8296d = i9 + 1;
                            charAt = charSequence2.charAt(i9);
                            this.f8297e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        e0 e0Var = f0.f8314c;
        f8269d = e0Var;
        f8275j = Character.toString(f8273h);
        f8276k = Character.toString(f8274i);
        f8280o = new a(false, 2, e0Var);
        f8281p = new a(true, 2, e0Var);
    }

    public a(boolean z6, int i7, e0 e0Var) {
        this.f8285a = z6;
        this.f8286b = i7;
        this.f8287c = e0Var;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0092a().a();
    }

    public static a d(Locale locale) {
        return new C0092a(locale).a();
    }

    public static a e(boolean z6) {
        return new C0092a(z6).a();
    }

    public static boolean j(Locale locale) {
        return g0.b(locale) == 1;
    }

    public boolean f() {
        return (this.f8286b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f8287c.b(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f8285a;
    }

    public final String k(CharSequence charSequence, e0 e0Var) {
        boolean b7 = e0Var.b(charSequence, 0, charSequence.length());
        return (this.f8285a || !(b7 || b(charSequence) == 1)) ? this.f8285a ? (!b7 || b(charSequence) == -1) ? f8276k : "" : "" : f8275j;
    }

    public final String l(CharSequence charSequence, e0 e0Var) {
        boolean b7 = e0Var.b(charSequence, 0, charSequence.length());
        return (this.f8285a || !(b7 || a(charSequence) == 1)) ? this.f8285a ? (!b7 || a(charSequence) == -1) ? f8276k : "" : "" : f8275j;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f8287c, true);
    }

    public CharSequence n(CharSequence charSequence, e0 e0Var) {
        return o(charSequence, e0Var, true);
    }

    public CharSequence o(CharSequence charSequence, e0 e0Var, boolean z6) {
        if (charSequence == null) {
            return null;
        }
        boolean b7 = e0Var.b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z6) {
            spannableStringBuilder.append((CharSequence) l(charSequence, b7 ? f0.f8313b : f0.f8312a));
        }
        if (b7 != this.f8285a) {
            spannableStringBuilder.append(b7 ? f8271f : f8270e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f8272g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z6) {
            spannableStringBuilder.append((CharSequence) k(charSequence, b7 ? f0.f8313b : f0.f8312a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z6) {
        return o(charSequence, this.f8287c, z6);
    }

    public String q(String str) {
        return s(str, this.f8287c, true);
    }

    public String r(String str, e0 e0Var) {
        return s(str, e0Var, true);
    }

    public String s(String str, e0 e0Var, boolean z6) {
        if (str == null) {
            return null;
        }
        return o(str, e0Var, z6).toString();
    }

    public String t(String str, boolean z6) {
        return s(str, this.f8287c, z6);
    }

    /* renamed from: d1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0092a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8288a;

        /* renamed from: b  reason: collision with root package name */
        public int f8289b;

        /* renamed from: c  reason: collision with root package name */
        public e0 f8290c;

        public C0092a() {
            c(a.j(Locale.getDefault()));
        }

        public static a b(boolean z6) {
            return z6 ? a.f8281p : a.f8280o;
        }

        public a a() {
            return (this.f8289b == 2 && this.f8290c == a.f8269d) ? b(this.f8288a) : new a(this.f8288a, this.f8289b, this.f8290c);
        }

        public final void c(boolean z6) {
            this.f8288a = z6;
            this.f8290c = a.f8269d;
            this.f8289b = 2;
        }

        public C0092a d(e0 e0Var) {
            this.f8290c = e0Var;
            return this;
        }

        public C0092a e(boolean z6) {
            if (z6) {
                this.f8289b |= 2;
            } else {
                this.f8289b &= -3;
            }
            return this;
        }

        public C0092a(boolean z6) {
            c(z6);
        }

        public C0092a(Locale locale) {
            c(a.j(locale));
        }
    }
}
