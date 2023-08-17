package i6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import v3.b1;
/* loaded from: classes.dex */
public interface n extends m0, WritableByteChannel {
    long B(@n6.d o0 o0Var) throws IOException;

    @n6.d
    n B0(int i7) throws IOException;

    @n6.d
    n D() throws IOException;

    @n6.d
    n D0(@n6.d String str, int i7, int i8, @n6.d Charset charset) throws IOException;

    @n6.d
    n F(int i7) throws IOException;

    @n6.d
    n F0(long j7) throws IOException;

    @n6.d
    n H(int i7) throws IOException;

    @n6.d
    n H0(@n6.d String str) throws IOException;

    @n6.d
    n J(int i7) throws IOException;

    @n6.d
    n J0(long j7) throws IOException;

    @n6.d
    n K(@n6.d p pVar) throws IOException;

    @n6.d
    OutputStream L0();

    @n6.d
    n M(@n6.d p pVar, int i7, int i8) throws IOException;

    @n6.d
    n N(@n6.d o0 o0Var, long j7) throws IOException;

    @n6.d
    n P(long j7) throws IOException;

    @n6.d
    n a0(int i7) throws IOException;

    @n6.d
    n e0(int i7) throws IOException;

    @Override // i6.m0, java.io.Flushable
    void flush() throws IOException;

    @n6.d
    @v3.k(level = v3.m.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @b1(expression = "buffer", imports = {}))
    m g();

    @n6.d
    m j();

    @n6.d
    n k0(@n6.d byte[] bArr) throws IOException;

    @n6.d
    n n(@n6.d byte[] bArr, int i7, int i8) throws IOException;

    @n6.d
    n s(@n6.d String str, int i7, int i8) throws IOException;

    @n6.d
    n u0() throws IOException;

    @n6.d
    n v(long j7) throws IOException;

    @n6.d
    n y(@n6.d String str, @n6.d Charset charset) throws IOException;
}
