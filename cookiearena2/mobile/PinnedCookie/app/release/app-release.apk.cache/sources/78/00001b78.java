package u4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l extends x3.n1 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final short[] f17438k;

    /* renamed from: l  reason: collision with root package name */
    public int f17439l;

    public l(@n6.d short[] sArr) {
        l0.p(sArr, "array");
        this.f17438k = sArr;
    }

    @Override // x3.n1
    public short b() {
        try {
            short[] sArr = this.f17438k;
            int i7 = this.f17439l;
            this.f17439l = i7 + 1;
            return sArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17439l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17439l < this.f17438k.length;
    }
}