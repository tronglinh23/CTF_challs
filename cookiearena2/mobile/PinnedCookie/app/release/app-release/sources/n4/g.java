package n4;

import java.io.ByteArrayOutputStream;
import u4.l0;
/* loaded from: classes.dex */
public final class g extends ByteArrayOutputStream {
    public g(int i7) {
        super(i7);
    }

    @n6.d
    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        l0.o(bArr, "buf");
        return bArr;
    }
}
