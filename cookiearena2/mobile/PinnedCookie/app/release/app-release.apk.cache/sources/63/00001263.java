package i6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import v3.b1;

/* loaded from: classes.dex */
public interface o extends o0, ReadableByteChannel {
    @n6.d
    o A0();

    boolean G(long j7) throws IOException;

    void G0(long j7) throws IOException;

    void K0(@n6.d m mVar, long j7) throws IOException;

    long N0(byte b7) throws IOException;

    long P0() throws IOException;

    long Q0(@n6.d m0 m0Var) throws IOException;

    @n6.d
    String R0(@n6.d Charset charset) throws IOException;

    @n6.d
    InputStream S0();

    @n6.d
    String T() throws IOException;

    long U(@n6.d p pVar, long j7) throws IOException;

    @n6.d
    byte[] V() throws IOException;

    long W(@n6.d p pVar, long j7) throws IOException;

    int Y() throws IOException;

    long b0(@n6.d p pVar) throws IOException;

    boolean c0() throws IOException;

    @n6.d
    @v3.k(level = v3.m.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @b1(expression = "buffer", imports = {}))
    m g();

    int g0(@n6.d d0 d0Var) throws IOException;

    @n6.d
    byte[] h0(long j7) throws IOException;

    boolean i0(long j7, @n6.d p pVar, int i7, int i8) throws IOException;

    @n6.d
    m j();

    @n6.d
    String j0() throws IOException;

    @n6.d
    String m0(long j7, @n6.d Charset charset) throws IOException;

    boolean n0(long j7, @n6.d p pVar) throws IOException;

    int o() throws IOException;

    long o0(byte b7, long j7) throws IOException;

    @n6.d
    String q(long j7) throws IOException;

    long r(@n6.d p pVar) throws IOException;

    short r0() throws IOException;

    int read(@n6.d byte[] bArr) throws IOException;

    int read(@n6.d byte[] bArr, int i7, int i8) throws IOException;

    byte readByte() throws IOException;

    void readFully(@n6.d byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    long s0(byte b7, long j7, long j8) throws IOException;

    void skip(long j7) throws IOException;

    @n6.e
    String t0() throws IOException;

    long v0() throws IOException;

    @n6.d
    p x() throws IOException;

    long x0() throws IOException;

    @n6.d
    String y0(long j7) throws IOException;

    @n6.d
    p z(long j7) throws IOException;
}