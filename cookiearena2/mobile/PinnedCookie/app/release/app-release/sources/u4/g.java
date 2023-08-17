package u4;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class g extends x3.s0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final int[] f17414k;

    /* renamed from: l  reason: collision with root package name */
    public int f17415l;

    public g(@n6.d int[] iArr) {
        l0.p(iArr, "array");
        this.f17414k = iArr;
    }

    @Override // x3.s0
    public int b() {
        try {
            int[] iArr = this.f17414k;
            int i7 = this.f17415l;
            this.f17415l = i7 + 1;
            return iArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17415l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17415l < this.f17414k.length;
    }
}
