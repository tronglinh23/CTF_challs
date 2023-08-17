package r5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import u4.l0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f16017a = new o();

    @n6.d
    @s4.i
    @s4.m
    public static final String a(@n6.d String str, @n6.d String str2) {
        return c(str, str2, null, 4, null);
    }

    @n6.d
    @s4.i
    @s4.m
    public static final String b(@n6.d String str, @n6.d String str2, @n6.d Charset charset) {
        l0.p(str, "username");
        l0.p(str2, "password");
        l0.p(charset, "charset");
        return "Basic " + i6.p.f11252p.j(str + ':' + str2, charset).h();
    }

    public static /* synthetic */ String c(String str, String str2, Charset charset, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            l0.o(charset, "ISO_8859_1");
        }
        return b(str, str2, charset);
    }
}