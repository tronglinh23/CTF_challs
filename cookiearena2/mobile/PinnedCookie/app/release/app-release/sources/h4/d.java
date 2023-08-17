package h4;

import e4.g;
import u4.l0;
import u4.r1;
import v3.g1;
@r1({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
@g1(version = "1.3")
/* loaded from: classes.dex */
public abstract class d extends a {
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public final e4.g f10311l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public transient e4.d<Object> f10312m;

    public d(@n6.e e4.d<Object> dVar, @n6.e e4.g gVar) {
        super(dVar);
        this.f10311l = gVar;
    }

    @Override // h4.a
    public void R() {
        e4.d<?> dVar = this.f10312m;
        if (dVar != null && dVar != this) {
            g.b e7 = g().e(e4.e.f8765a);
            l0.m(e7);
            ((e4.e) e7).U0(dVar);
        }
        this.f10312m = c.f10310k;
    }

    @n6.d
    public final e4.d<Object> S() {
        e4.d<Object> dVar = this.f10312m;
        if (dVar == null) {
            e4.e eVar = (e4.e) g().e(e4.e.f8765a);
            if (eVar == null || (dVar = eVar.S(this)) == null) {
                dVar = this;
            }
            this.f10312m = dVar;
        }
        return dVar;
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        e4.g gVar = this.f10311l;
        l0.m(gVar);
        return gVar;
    }

    public d(@n6.e e4.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.g() : null);
    }
}
