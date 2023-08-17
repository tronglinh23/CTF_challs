package u4;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class b extends x3.r {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final boolean[] f17397k;

    /* renamed from: l  reason: collision with root package name */
    public int f17398l;

    public b(@n6.d boolean[] zArr) {
        l0.p(zArr, "array");
        this.f17397k = zArr;
    }

    @Override // x3.r
    public boolean b() {
        try {
            boolean[] zArr = this.f17397k;
            int i7 = this.f17398l;
            this.f17398l = i7 + 1;
            return zArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17398l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17398l < this.f17397k.length;
    }
}
