package u4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e extends x3.f0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final double[] f17410k;

    /* renamed from: l  reason: collision with root package name */
    public int f17411l;

    public e(@n6.d double[] dArr) {
        l0.p(dArr, "array");
        this.f17410k = dArr;
    }

    @Override // x3.f0
    public double b() {
        try {
            double[] dArr = this.f17410k;
            int i7 = this.f17411l;
            this.f17411l = i7 + 1;
            return dArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17411l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17411l < this.f17410k.length;
    }
}