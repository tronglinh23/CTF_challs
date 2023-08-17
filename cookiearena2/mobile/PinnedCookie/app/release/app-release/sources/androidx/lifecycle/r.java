package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlinx.coroutines.n2;
import u4.r1;
@d.l0
@r1({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* loaded from: classes.dex */
public final class r {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final p f4806a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final p.b f4807b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final j f4808c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final v f4809d;

    public r(@n6.d p pVar, @n6.d p.b bVar, @n6.d j jVar, @n6.d final n2 n2Var) {
        u4.l0.p(pVar, "lifecycle");
        u4.l0.p(bVar, "minState");
        u4.l0.p(jVar, "dispatchQueue");
        u4.l0.p(n2Var, "parentJob");
        this.f4806a = pVar;
        this.f4807b = bVar;
        this.f4808c = jVar;
        v vVar = new v() { // from class: androidx.lifecycle.q
            @Override // androidx.lifecycle.v
            public final void d(z zVar, p.a aVar) {
                r.d(r.this, n2Var, zVar, aVar);
            }
        };
        this.f4809d = vVar;
        if (pVar.b() != p.b.DESTROYED) {
            pVar.a(vVar);
            return;
        }
        n2.a.b(n2Var, null, 1, null);
        b();
    }

    public static final void d(r rVar, n2 n2Var, z zVar, p.a aVar) {
        u4.l0.p(rVar, "this$0");
        u4.l0.p(n2Var, "$parentJob");
        u4.l0.p(zVar, "source");
        u4.l0.p(aVar, "<anonymous parameter 1>");
        if (zVar.getLifecycle().b() == p.b.DESTROYED) {
            n2.a.b(n2Var, null, 1, null);
            rVar.b();
        } else if (zVar.getLifecycle().b().compareTo(rVar.f4807b) < 0) {
            rVar.f4808c.h();
        } else {
            rVar.f4808c.i();
        }
    }

    @d.l0
    public final void b() {
        this.f4806a.d(this.f4809d);
        this.f4808c.g();
    }

    public final void c(n2 n2Var) {
        n2.a.b(n2Var, null, 1, null);
        b();
    }
}
