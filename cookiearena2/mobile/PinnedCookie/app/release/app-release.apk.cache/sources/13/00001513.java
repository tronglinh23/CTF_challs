package kotlinx.coroutines.flow;

import v3.m2;

/* loaded from: classes.dex */
public final class z0 implements j<Object> {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final Throwable f12746k;

    public z0(@n6.d Throwable th) {
        this.f12746k = th;
    }

    @Override // kotlinx.coroutines.flow.j
    @n6.e
    public Object f(@n6.e Object obj, @n6.d e4.d<? super m2> dVar) {
        throw this.f12746k;
    }
}