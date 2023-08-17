package x;

import w.h;

/* loaded from: classes.dex */
public class d extends w.c {

    /* renamed from: n0  reason: collision with root package name */
    public float f18246n0;

    /* renamed from: o0  reason: collision with root package name */
    public h.b f18247o0;

    public d(w.h hVar, h.e eVar) {
        super(hVar, eVar);
        this.f18246n0 = 0.5f;
        this.f18247o0 = h.b.SPREAD;
    }

    @Override // w.a
    /* renamed from: Q0  reason: merged with bridge method [inline-methods] */
    public d n(float f7) {
        this.f18246n0 = f7;
        return this;
    }

    public float R0() {
        return this.f18246n0;
    }

    public h.b S0() {
        return h.b.SPREAD;
    }

    public d T0(h.b bVar) {
        this.f18247o0 = bVar;
        return this;
    }
}