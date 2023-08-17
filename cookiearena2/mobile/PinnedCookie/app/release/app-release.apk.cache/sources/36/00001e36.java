package y5;

import i6.o;
import r5.g0;
import r5.x;
import u4.l0;

/* loaded from: classes.dex */
public final class h extends g0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f18875m;

    /* renamed from: n  reason: collision with root package name */
    public final long f18876n;

    /* renamed from: o  reason: collision with root package name */
    public final o f18877o;

    public h(@n6.e String str, long j7, @n6.d o oVar) {
        l0.p(oVar, "source");
        this.f18875m = str;
        this.f18876n = j7;
        this.f18877o = oVar;
    }

    @Override // r5.g0
    @n6.d
    public o I() {
        return this.f18877o;
    }

    @Override // r5.g0
    public long i() {
        return this.f18876n;
    }

    @Override // r5.g0
    @n6.e
    public x k() {
        String str = this.f18875m;
        if (str != null) {
            return x.f16088i.d(str);
        }
        return null;
    }
}