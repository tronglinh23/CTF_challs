package u4;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class d extends x3.t {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final char[] f17408k;

    /* renamed from: l  reason: collision with root package name */
    public int f17409l;

    public d(@n6.d char[] cArr) {
        l0.p(cArr, "array");
        this.f17408k = cArr;
    }

    @Override // x3.t
    public char b() {
        try {
            char[] cArr = this.f17408k;
            int i7 = this.f17409l;
            this.f17409l = i7 + 1;
            return cArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f17409l--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17409l < this.f17408k.length;
    }
}
