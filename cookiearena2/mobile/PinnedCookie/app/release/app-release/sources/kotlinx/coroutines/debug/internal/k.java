package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import v3.a1;
@a1
/* loaded from: classes.dex */
public final class k implements Serializable {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final Long f11941k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public final String f11942l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public final String f11943m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final String f11944n;
    @n6.e

    /* renamed from: o  reason: collision with root package name */
    public final String f11945o;
    @n6.e

    /* renamed from: p  reason: collision with root package name */
    public final String f11946p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final List<StackTraceElement> f11947q;

    /* renamed from: r  reason: collision with root package name */
    public final long f11948r;

    public k(@n6.d f fVar, @n6.d e4.g gVar) {
        Thread.State state;
        s0 s0Var = (s0) gVar.e(s0.f12944m);
        this.f11941k = s0Var != null ? Long.valueOf(s0Var.Y0()) : null;
        e4.e eVar = (e4.e) gVar.e(e4.e.f8765a);
        this.f11942l = eVar != null ? eVar.toString() : null;
        t0 t0Var = (t0) gVar.e(t0.f13111m);
        this.f11943m = t0Var != null ? t0Var.Y0() : null;
        this.f11944n = fVar.g();
        Thread thread = fVar.f11908e;
        this.f11945o = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = fVar.f11908e;
        this.f11946p = thread2 != null ? thread2.getName() : null;
        this.f11947q = fVar.h();
        this.f11948r = fVar.f11905b;
    }

    @n6.e
    public final Long a() {
        return this.f11941k;
    }

    @n6.e
    public final String b() {
        return this.f11942l;
    }

    @n6.d
    public final List<StackTraceElement> c() {
        return this.f11947q;
    }

    @n6.e
    public final String d() {
        return this.f11946p;
    }

    @n6.e
    public final String e() {
        return this.f11945o;
    }

    @n6.e
    public final String f() {
        return this.f11943m;
    }

    public final long g() {
        return this.f11948r;
    }

    @n6.d
    public final String h() {
        return this.f11944n;
    }
}
