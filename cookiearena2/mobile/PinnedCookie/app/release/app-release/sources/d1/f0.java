package d1;

import java.nio.CharBuffer;
import java.util.Locale;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f8312a = new e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f8313b = new e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f8314c;

    /* renamed from: d  reason: collision with root package name */
    public static final e0 f8315d;

    /* renamed from: e  reason: collision with root package name */
    public static final e0 f8316e;

    /* renamed from: f  reason: collision with root package name */
    public static final e0 f8317f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f8318g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f8319h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f8320i = 2;

    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f8321b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f8322a;

        public a(boolean z6) {
            this.f8322a = z6;
        }

        @Override // d1.f0.c
        public int a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            boolean z6 = false;
            while (i7 < i9) {
                int a7 = f0.a(Character.getDirectionality(charSequence.charAt(i7)));
                if (a7 != 0) {
                    if (a7 != 1) {
                        continue;
                        i7++;
                        z6 = z6;
                    } else if (!this.f8322a) {
                        return 1;
                    }
                } else if (this.f8322a) {
                    return 0;
                }
                z6 = true;
                i7++;
                z6 = z6;
            }
            if (z6) {
                return this.f8322a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8323a = new b();

        @Override // d1.f0.c
        public int a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            int i10 = 2;
            while (i7 < i9 && i10 == 2) {
                i10 = f0.b(Character.getDirectionality(charSequence.charAt(i7)));
                i7++;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i7, int i8);
    }

    /* loaded from: classes.dex */
    public static abstract class d implements e0 {

        /* renamed from: a  reason: collision with root package name */
        public final c f8324a;

        public d(c cVar) {
            this.f8324a = cVar;
        }

        @Override // d1.e0
        public boolean a(char[] cArr, int i7, int i8) {
            return b(CharBuffer.wrap(cArr), i7, i8);
        }

        @Override // d1.e0
        public boolean b(CharSequence charSequence, int i7, int i8) {
            if (charSequence == null || i7 < 0 || i8 < 0 || charSequence.length() - i8 < i7) {
                throw new IllegalArgumentException();
            }
            return this.f8324a == null ? c() : d(charSequence, i7, i8);
        }

        public abstract boolean c();

        public final boolean d(CharSequence charSequence, int i7, int i8) {
            int a7 = this.f8324a.a(charSequence, i7, i8);
            if (a7 != 0) {
                if (a7 != 1) {
                    return c();
                }
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8325b;

        public e(c cVar, boolean z6) {
            super(cVar);
            this.f8325b = z6;
        }

        @Override // d1.f0.d
        public boolean c() {
            return this.f8325b;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        public static final f f8326b = new f();

        public f() {
            super(null);
        }

        @Override // d1.f0.d
        public boolean c() {
            return g0.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f8323a;
        f8314c = new e(bVar, false);
        f8315d = new e(bVar, true);
        f8316e = new e(a.f8321b, false);
        f8317f = f.f8326b;
    }

    public static int a(int i7) {
        if (i7 != 0) {
            return (i7 == 1 || i7 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i7) {
        if (i7 != 0) {
            if (i7 == 1 || i7 == 2) {
                return 0;
            }
            switch (i7) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
