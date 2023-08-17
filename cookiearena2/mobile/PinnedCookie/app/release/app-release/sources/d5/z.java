package d5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v3.b2;
import v3.g1;
@g1(version = "1.3")
/* loaded from: classes.dex */
public final class z implements Iterator<b2>, v4.a {

    /* renamed from: k  reason: collision with root package name */
    public final long f8528k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8529l;

    /* renamed from: m  reason: collision with root package name */
    public final long f8530m;

    /* renamed from: n  reason: collision with root package name */
    public long f8531n;

    public /* synthetic */ z(long j7, long j8, long j9, u4.w wVar) {
        this(j7, j8, j9);
    }

    public long a() {
        long j7 = this.f8531n;
        if (j7 != this.f8528k) {
            this.f8531n = b2.l(this.f8530m + j7);
        } else if (!this.f8529l) {
            throw new NoSuchElementException();
        } else {
            this.f8529l = false;
        }
        return j7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8529l;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ b2 next() {
        return b2.d(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public z(long j7, long j8, long j9) {
        this.f8528k = j8;
        boolean z6 = true;
        if (j9 <= 0 ? Long.compareUnsigned(j7, j8) < 0 : Long.compareUnsigned(j7, j8) > 0) {
            z6 = false;
        }
        this.f8529l = z6;
        this.f8530m = b2.l(j9);
        this.f8531n = this.f8529l ? j7 : j8;
    }
}
