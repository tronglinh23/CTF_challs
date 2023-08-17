package u4;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class f extends x3.k0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final float[] f17412k;

    /* renamed from: l  reason: collision with root package name */
    public int f17413l;

    public f(@n6.d float[] fArr) {
        l0.p(fArr, "array");
        this.f17412k = fArr;
    }

    @Override // x3.k0
    public float b() {
        try {
            float[] fArr = this.f17412k;
            int i7 = this.f17413l;
            this.f17413l = i7 + 1;
            return fArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17413l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17413l < this.f17412k.length;
    }
}
