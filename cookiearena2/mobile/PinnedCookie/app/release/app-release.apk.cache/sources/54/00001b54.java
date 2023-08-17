package u4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends x3.s {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f17402k;

    /* renamed from: l  reason: collision with root package name */
    public int f17403l;

    public c(@n6.d byte[] bArr) {
        l0.p(bArr, "array");
        this.f17402k = bArr;
    }

    @Override // x3.s
    public byte b() {
        try {
            byte[] bArr = this.f17402k;
            int i7 = this.f17403l;
            this.f17403l = i7 + 1;
            return bArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17403l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17403l < this.f17402k.length;
    }
}