package d5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v3.g1;
import v3.x1;
@g1(version = "1.3")
/* loaded from: classes.dex */
public final class w implements Iterator<x1>, v4.a {

    /* renamed from: k  reason: collision with root package name */
    public final int f8518k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8519l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8520m;

    /* renamed from: n  reason: collision with root package name */
    public int f8521n;

    public /* synthetic */ w(int i7, int i8, int i9, u4.w wVar) {
        this(i7, i8, i9);
    }

    public int a() {
        int i7 = this.f8521n;
        if (i7 != this.f8518k) {
            this.f8521n = x1.l(this.f8520m + i7);
        } else if (!this.f8519l) {
            throw new NoSuchElementException();
        } else {
            this.f8519l = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8519l;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ x1 next() {
        return x1.d(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public w(int i7, int i8, int i9) {
        this.f8518k = i8;
        boolean z6 = true;
        int compareUnsigned = Integer.compareUnsigned(i7, i8);
        if (i9 <= 0 ? compareUnsigned < 0 : compareUnsigned > 0) {
            z6 = false;
        }
        this.f8519l = z6;
        this.f8520m = x1.l(i9);
        this.f8521n = this.f8519l ? i7 : i8;
    }
}
