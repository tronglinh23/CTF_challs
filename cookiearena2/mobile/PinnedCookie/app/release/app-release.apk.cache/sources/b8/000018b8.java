package p5;

import v3.m2;

/* loaded from: classes.dex */
public final class i<T> extends h<T, T> {
    public /* synthetic */ i(kotlinx.coroutines.flow.i iVar, e4.g gVar, int i7, n5.m mVar, int i8, u4.w wVar) {
        this(iVar, (i8 & 2) != 0 ? e4.i.f8770k : gVar, (i8 & 4) != 0 ? -3 : i7, (i8 & 8) != 0 ? n5.m.SUSPEND : mVar);
    }

    @Override // p5.e
    @n6.d
    public e<T> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return new i(this.f14868n, gVar, i7, mVar);
    }

    @Override // p5.e
    @n6.d
    public kotlinx.coroutines.flow.i<T> l() {
        return (kotlinx.coroutines.flow.i<T>) this.f14868n;
    }

    @Override // p5.h
    @n6.e
    public Object t(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
        Object a7 = this.f14868n.a(jVar, dVar);
        return a7 == g4.d.h() ? a7 : m2.f17815a;
    }

    public i(@n6.d kotlinx.coroutines.flow.i<? extends T> iVar, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        super(iVar, gVar, i7, mVar);
    }
}