package d5;

import java.util.NoSuchElementException;
import u4.l0;

/* loaded from: classes.dex */
public final class b extends x3.t {

    /* renamed from: k  reason: collision with root package name */
    public final int f8476k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8477l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8478m;

    /* renamed from: n  reason: collision with root package name */
    public int f8479n;

    public b(char c7, char c8, int i7) {
        this.f8476k = i7;
        this.f8477l = c8;
        boolean z6 = true;
        if (i7 <= 0 ? l0.t(c7, c8) < 0 : l0.t(c7, c8) > 0) {
            z6 = false;
        }
        this.f8478m = z6;
        this.f8479n = z6 ? c7 : c8;
    }

    @Override // x3.t
    public char b() {
        int i7 = this.f8479n;
        if (i7 != this.f8477l) {
            this.f8479n = this.f8476k + i7;
        } else if (!this.f8478m) {
            throw new NoSuchElementException();
        } else {
            this.f8478m = false;
        }
        return (char) i7;
    }

    public final int d() {
        return this.f8476k;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8478m;
    }
}