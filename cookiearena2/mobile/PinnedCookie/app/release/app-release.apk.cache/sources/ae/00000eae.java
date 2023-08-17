package d5;

import java.util.NoSuchElementException;
import x3.s0;

/* loaded from: classes.dex */
public final class k extends s0 {

    /* renamed from: k  reason: collision with root package name */
    public final int f8494k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8495l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8496m;

    /* renamed from: n  reason: collision with root package name */
    public int f8497n;

    public k(int i7, int i8, int i9) {
        this.f8494k = i9;
        this.f8495l = i8;
        boolean z6 = true;
        if (i9 <= 0 ? i7 < i8 : i7 > i8) {
            z6 = false;
        }
        this.f8496m = z6;
        this.f8497n = z6 ? i7 : i8;
    }

    @Override // x3.s0
    public int b() {
        int i7 = this.f8497n;
        if (i7 != this.f8495l) {
            this.f8497n = this.f8494k + i7;
        } else if (!this.f8496m) {
            throw new NoSuchElementException();
        } else {
            this.f8496m = false;
        }
        return i7;
    }

    public final int d() {
        return this.f8494k;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8496m;
    }
}