package k5;

import k5.r;
import u4.l0;
import u4.w;
@l
/* loaded from: classes.dex */
public final class c implements r {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final r f11781k;

    /* renamed from: l  reason: collision with root package name */
    public final long f11782l;

    public /* synthetic */ c(r rVar, long j7, w wVar) {
        this(rVar, j7);
    }

    @Override // k5.r
    @n6.d
    public r a(long j7) {
        return r.a.c(this, j7);
    }

    @Override // k5.r
    @n6.d
    public r b(long j7) {
        return new c(this.f11781k, e.h0(this.f11782l, j7), null);
    }

    @Override // k5.r
    public boolean c() {
        return r.a.b(this);
    }

    @Override // k5.r
    public boolean d() {
        return r.a.a(this);
    }

    @Override // k5.r
    public long e() {
        return e.g0(this.f11781k.e(), this.f11782l);
    }

    public final long h() {
        return this.f11782l;
    }

    @n6.d
    public final r i() {
        return this.f11781k;
    }

    public c(r rVar, long j7) {
        l0.p(rVar, "mark");
        this.f11781k = rVar;
        this.f11782l = j7;
    }
}
