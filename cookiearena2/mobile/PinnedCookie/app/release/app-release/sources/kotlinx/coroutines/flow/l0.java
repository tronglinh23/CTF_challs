package kotlinx.coroutines.flow;

import v3.m2;
/* loaded from: classes.dex */
public final class l0 extends p5.d<j0<?>> {
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public long f12327a = -1;
    @s4.e
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public e4.d<? super m2> f12328b;

    @Override // p5.d
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public boolean a(@n6.d j0<?> j0Var) {
        if (this.f12327a >= 0) {
            return false;
        }
        this.f12327a = j0Var.f0();
        return true;
    }

    @Override // p5.d
    @n6.d
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public e4.d<m2>[] b(@n6.d j0<?> j0Var) {
        long j7 = this.f12327a;
        this.f12327a = -1L;
        this.f12328b = null;
        return j0Var.e0(j7);
    }
}
