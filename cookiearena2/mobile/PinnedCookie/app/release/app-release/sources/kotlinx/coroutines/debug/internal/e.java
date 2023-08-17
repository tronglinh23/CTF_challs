package kotlinx.coroutines.debug.internal;

import java.util.List;
import v3.a1;
@a1
/* loaded from: classes.dex */
public final class e {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final e4.g f11896a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final h4.e f11897b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11898c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final List<StackTraceElement> f11899d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final String f11900e;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public final Thread f11901f;
    @n6.e

    /* renamed from: g  reason: collision with root package name */
    public final h4.e f11902g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final List<StackTraceElement> f11903h;

    public e(@n6.d f fVar, @n6.d e4.g gVar) {
        this.f11896a = gVar;
        this.f11897b = fVar.d();
        this.f11898c = fVar.f11905b;
        this.f11899d = fVar.e();
        this.f11900e = fVar.g();
        this.f11901f = fVar.f11908e;
        this.f11902g = fVar.f();
        this.f11903h = fVar.h();
    }

    @n6.d
    public final e4.g a() {
        return this.f11896a;
    }

    @n6.e
    public final h4.e b() {
        return this.f11897b;
    }

    @n6.d
    public final List<StackTraceElement> c() {
        return this.f11899d;
    }

    @n6.e
    public final h4.e d() {
        return this.f11902g;
    }

    @n6.e
    public final Thread e() {
        return this.f11901f;
    }

    public final long f() {
        return this.f11898c;
    }

    @n6.d
    public final String g() {
        return this.f11900e;
    }

    @s4.h(name = "lastObservedStackTrace")
    @n6.d
    public final List<StackTraceElement> h() {
        return this.f11903h;
    }
}
