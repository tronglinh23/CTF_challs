package i5;

import java.nio.charset.Charset;
import u4.l0;

/* loaded from: classes.dex */
public final class f {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final f f11070a = new f();
    @n6.d
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f11071b;
    @n6.d
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f11072c;
    @n6.d
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f11073d;
    @n6.d
    @s4.e

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f11074e;
    @n6.d
    @s4.e

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f11075f;
    @n6.d
    @s4.e

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f11076g;
    @n6.e

    /* renamed from: h  reason: collision with root package name */
    public static volatile Charset f11077h;
    @n6.e

    /* renamed from: i  reason: collision with root package name */
    public static volatile Charset f11078i;
    @n6.e

    /* renamed from: j  reason: collision with root package name */
    public static volatile Charset f11079j;

    static {
        Charset forName = Charset.forName("UTF-8");
        l0.o(forName, "forName(\"UTF-8\")");
        f11071b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        l0.o(forName2, "forName(\"UTF-16\")");
        f11072c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        l0.o(forName3, "forName(\"UTF-16BE\")");
        f11073d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        l0.o(forName4, "forName(\"UTF-16LE\")");
        f11074e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        l0.o(forName5, "forName(\"US-ASCII\")");
        f11075f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        l0.o(forName6, "forName(\"ISO-8859-1\")");
        f11076g = forName6;
    }

    @s4.h(name = "UTF32")
    @n6.d
    public final Charset a() {
        Charset charset = f11077h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32");
            l0.o(forName, "forName(\"UTF-32\")");
            f11077h = forName;
            return forName;
        }
        return charset;
    }

    @s4.h(name = "UTF32_BE")
    @n6.d
    public final Charset b() {
        Charset charset = f11079j;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            l0.o(forName, "forName(\"UTF-32BE\")");
            f11079j = forName;
            return forName;
        }
        return charset;
    }

    @s4.h(name = "UTF32_LE")
    @n6.d
    public final Charset c() {
        Charset charset = f11078i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            l0.o(forName, "forName(\"UTF-32LE\")");
            f11078i = forName;
            return forName;
        }
        return charset;
    }
}