package d5;

import java.util.NoSuchElementException;
import x3.t0;
/* loaded from: classes.dex */
public final class n extends t0 {

    /* renamed from: k  reason: collision with root package name */
    public final long f8504k;

    /* renamed from: l  reason: collision with root package name */
    public final long f8505l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8506m;

    /* renamed from: n  reason: collision with root package name */
    public long f8507n;

    public n(long j7, long j8, long j9) {
        this.f8504k = j9;
        this.f8505l = j8;
        boolean z6 = true;
        if (j9 <= 0 ? j7 < j8 : j7 > j8) {
            z6 = false;
        }
        this.f8506m = z6;
        this.f8507n = z6 ? j7 : j8;
    }

    @Override // x3.t0
    public long b() {
        long j7 = this.f8507n;
        if (j7 != this.f8505l) {
            this.f8507n = this.f8504k + j7;
        } else if (!this.f8506m) {
            throw new NoSuchElementException();
        } else {
            this.f8506m = false;
        }
        return j7;
    }

    public final long d() {
        return this.f8504k;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8506m;
    }
}
