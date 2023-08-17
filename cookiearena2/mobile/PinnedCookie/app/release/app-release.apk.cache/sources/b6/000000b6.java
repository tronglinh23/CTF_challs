package androidx.activity;

import d.l0;
import d.o0;
import d.q0;
import d.s0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z0.a;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f550a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<d> f551b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public g1.e<Boolean> f552c;

    public k(boolean z6) {
        this.f550a = z6;
    }

    public void d(@o0 d dVar) {
        this.f551b.add(dVar);
    }

    @l0
    public abstract void e();

    @l0
    public final boolean f() {
        return this.f550a;
    }

    @l0
    public final void g() {
        Iterator<d> it = this.f551b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void h(@o0 d dVar) {
        this.f551b.remove(dVar);
    }

    @l0
    @s0(markerClass = {a.b.class})
    public final void i(boolean z6) {
        this.f550a = z6;
        g1.e<Boolean> eVar = this.f552c;
        if (eVar != null) {
            eVar.accept(Boolean.valueOf(z6));
        }
    }

    public void j(@q0 g1.e<Boolean> eVar) {
        this.f552c = eVar;
    }
}