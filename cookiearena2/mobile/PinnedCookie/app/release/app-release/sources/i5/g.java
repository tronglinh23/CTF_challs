package i5;

import java.nio.charset.Charset;
import u4.l0;
@s4.h(name = "CharsetsKt")
/* loaded from: classes.dex */
public final class g {
    @k4.f
    public static final Charset a(String str) {
        l0.p(str, "charsetName");
        Charset forName = Charset.forName(str);
        l0.o(forName, "forName(charsetName)");
        return forName;
    }
}
