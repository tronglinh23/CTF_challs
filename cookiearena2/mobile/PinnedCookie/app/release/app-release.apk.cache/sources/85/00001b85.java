package u4;

/* loaded from: classes.dex */
public final class p extends c1<byte[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f17452d;

    public p(int i7) {
        super(i7);
        this.f17452d = new byte[i7];
    }

    public final void h(byte b7) {
        byte[] bArr = this.f17452d;
        int b8 = b();
        e(b8 + 1);
        bArr[b8] = b7;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length;
    }

    @n6.d
    public final byte[] j() {
        return g(this.f17452d, new byte[f()]);
    }
}