package u4;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class k extends x3.t0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final long[] f17426k;

    /* renamed from: l  reason: collision with root package name */
    public int f17427l;

    public k(@n6.d long[] jArr) {
        l0.p(jArr, "array");
        this.f17426k = jArr;
    }

    @Override // x3.t0
    public long b() {
        try {
            long[] jArr = this.f17426k;
            int i7 = this.f17427l;
            this.f17427l = i7 + 1;
            return jArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17427l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17427l < this.f17426k.length;
    }
}
