package o4;

import java.io.InputStream;
import java.io.OutputStream;
import u4.l0;
import v3.g1;

/* loaded from: classes.dex */
public class h {
    @g1(version = "1.8")
    @n6.d
    @f
    public static final InputStream a(@n6.d InputStream inputStream, @n6.d a aVar) {
        l0.p(inputStream, "<this>");
        l0.p(aVar, "base64");
        return new d(inputStream, aVar);
    }

    @g1(version = "1.8")
    @n6.d
    @f
    public static final OutputStream b(@n6.d OutputStream outputStream, @n6.d a aVar) {
        l0.p(outputStream, "<this>");
        l0.p(aVar, "base64");
        return new e(outputStream, aVar);
    }
}