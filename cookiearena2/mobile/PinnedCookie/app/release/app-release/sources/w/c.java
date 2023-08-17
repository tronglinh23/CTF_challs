package w;

import java.util.ArrayList;
import java.util.Collections;
import w.h;
/* loaded from: classes.dex */
public class c extends a implements x.e {

    /* renamed from: j0  reason: collision with root package name */
    public final h f17924j0;

    /* renamed from: k0  reason: collision with root package name */
    public final h.e f17925k0;

    /* renamed from: l0  reason: collision with root package name */
    public ArrayList<Object> f17926l0;

    /* renamed from: m0  reason: collision with root package name */
    public y.j f17927m0;

    public c(h hVar, h.e eVar) {
        super(hVar);
        this.f17926l0 = new ArrayList<>();
        this.f17924j0 = hVar;
        this.f17925k0 = eVar;
    }

    public c M0(Object... objArr) {
        Collections.addAll(this.f17926l0, objArr);
        return this;
    }

    public y.j N0() {
        return this.f17927m0;
    }

    public h.e O0() {
        return this.f17925k0;
    }

    public void P0(y.j jVar) {
        this.f17927m0 = jVar;
    }

    @Override // w.a, w.e
    public y.e a() {
        return N0();
    }

    @Override // w.a, w.e
    public void b() {
    }
}
