package i6;

@s4.h(name = "-Platform")
/* loaded from: classes.dex */
public final class i {
    @n6.d
    public static final byte[] a(@n6.d String str) {
        u4.l0.p(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(i5.f.f11071b);
        u4.l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final <R> R b(@n6.d Object obj, @n6.d t4.a<? extends R> aVar) {
        R n7;
        u4.l0.p(obj, "lock");
        u4.l0.p(aVar, "block");
        synchronized (obj) {
            try {
                n7 = aVar.n();
                u4.i0.d(1);
            } catch (Throwable th) {
                u4.i0.d(1);
                u4.i0.c(1);
                throw th;
            }
        }
        u4.i0.c(1);
        return n7;
    }

    @n6.d
    public static final String c(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "$this$toUtf8String");
        return new String(bArr, i5.f.f11071b);
    }
}