package v1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class d implements r {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f17638a;

    public d(ByteBuffer byteBuffer) {
        this.f17638a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // v1.q
    public String A(int i7, int i8) {
        return a0.h(this.f17638a, i7, i8);
    }

    @Override // v1.r, v1.q
    public int a() {
        return this.f17638a.limit();
    }

    @Override // v1.r
    public void b(int i7, short s6) {
        f(i7 + 2);
        this.f17638a.putShort(i7, s6);
    }

    @Override // v1.r
    public void c(int i7, byte[] bArr, int i8, int i9) {
        f((i9 - i8) + i7);
        int position = this.f17638a.position();
        this.f17638a.position(i7);
        this.f17638a.put(bArr, i8, i9);
        this.f17638a.position(position);
    }

    @Override // v1.r
    public void d(int i7, double d7) {
        f(i7 + 8);
        this.f17638a.putDouble(i7, d7);
    }

    @Override // v1.r
    public void e(boolean z6) {
        this.f17638a.put(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // v1.r
    public boolean f(int i7) {
        return i7 <= this.f17638a.limit();
    }

    @Override // v1.r
    public void g(int i7, int i8) {
        f(i7 + 4);
        this.f17638a.putInt(i7, i8);
    }

    @Override // v1.q
    public byte get(int i7) {
        return this.f17638a.get(i7);
    }

    @Override // v1.r
    public void h(int i7, byte b7) {
        f(i7 + 1);
        this.f17638a.put(i7, b7);
    }

    @Override // v1.q
    public double i(int i7) {
        return this.f17638a.getDouble(i7);
    }

    @Override // v1.r
    public void j(int i7, long j7) {
        f(i7 + 8);
        this.f17638a.putLong(i7, j7);
    }

    @Override // v1.q
    public boolean k(int i7) {
        return get(i7) != 0;
    }

    @Override // v1.q
    public int l(int i7) {
        return this.f17638a.getInt(i7);
    }

    @Override // v1.r
    public int m() {
        return this.f17638a.position();
    }

    @Override // v1.r
    public void n(int i7, boolean z6) {
        h(i7, z6 ? (byte) 1 : (byte) 0);
    }

    @Override // v1.q
    public float o(int i7) {
        return this.f17638a.getFloat(i7);
    }

    @Override // v1.r
    public void p(float f7) {
        this.f17638a.putFloat(f7);
    }

    @Override // v1.r
    public void q(int i7) {
        this.f17638a.putInt(i7);
    }

    @Override // v1.q
    public long r(int i7) {
        return this.f17638a.getLong(i7);
    }

    @Override // v1.r
    public void s(byte[] bArr, int i7, int i8) {
        this.f17638a.put(bArr, i7, i8);
    }

    @Override // v1.r
    public void t(double d7) {
        this.f17638a.putDouble(d7);
    }

    @Override // v1.r
    public void u(short s6) {
        this.f17638a.putShort(s6);
    }

    @Override // v1.r
    public void v(byte b7) {
        this.f17638a.put(b7);
    }

    @Override // v1.q
    public short w(int i7) {
        return this.f17638a.getShort(i7);
    }

    @Override // v1.r
    public void x(int i7, float f7) {
        f(i7 + 4);
        this.f17638a.putFloat(i7, f7);
    }

    @Override // v1.q
    public byte[] y() {
        return this.f17638a.array();
    }

    @Override // v1.r
    public void z(long j7) {
        this.f17638a.putLong(j7);
    }
}
