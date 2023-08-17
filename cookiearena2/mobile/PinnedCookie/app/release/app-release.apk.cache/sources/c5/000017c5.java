package o4;

import java.nio.charset.Charset;
import u4.l0;
import v3.g1;

/* loaded from: classes.dex */
public final class b {
    @g1(version = "1.8")
    @k4.f
    @f
    public static final byte[] a(a aVar, CharSequence charSequence, int i7, int i8) {
        l0.p(aVar, "<this>");
        l0.p(charSequence, "source");
        if (charSequence instanceof String) {
            aVar.g(charSequence.length(), i7, i8);
            String substring = ((String) charSequence).substring(i7, i8);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = i5.f.f11076g;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        return aVar.e(charSequence, i7, i8);
    }

    @g1(version = "1.8")
    @k4.f
    @f
    public static final int b(a aVar, byte[] bArr, byte[] bArr2, int i7, int i8, int i9) {
        l0.p(aVar, "<this>");
        l0.p(bArr, "source");
        l0.p(bArr2, "destination");
        return aVar.v(bArr, bArr2, i7, i8, i9);
    }

    @g1(version = "1.8")
    @k4.f
    @f
    public static final byte[] c(a aVar, byte[] bArr, int i7, int i8) {
        l0.p(aVar, "<this>");
        l0.p(bArr, "source");
        return aVar.B(bArr, i7, i8);
    }

    @g1(version = "1.8")
    @k4.f
    @f
    public static final String d(a aVar, byte[] bArr, int i7, int i8) {
        l0.p(aVar, "<this>");
        l0.p(bArr, "source");
        return new String(aVar.B(bArr, i7, i8), i5.f.f11076g);
    }
}