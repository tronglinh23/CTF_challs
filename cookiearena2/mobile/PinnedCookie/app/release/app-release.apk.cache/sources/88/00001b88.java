package u4;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q implements e5.c, Serializable {
    @v3.g1(version = "1.1")

    /* renamed from: q  reason: collision with root package name */
    public static final Object f17458q = a.f17465k;

    /* renamed from: k  reason: collision with root package name */
    public transient e5.c f17459k;
    @v3.g1(version = "1.1")

    /* renamed from: l  reason: collision with root package name */
    public final Object f17460l;
    @v3.g1(version = "1.4")

    /* renamed from: m  reason: collision with root package name */
    public final Class f17461m;
    @v3.g1(version = "1.4")

    /* renamed from: n  reason: collision with root package name */
    public final String f17462n;
    @v3.g1(version = "1.4")

    /* renamed from: o  reason: collision with root package name */
    public final String f17463o;
    @v3.g1(version = "1.4")

    /* renamed from: p  reason: collision with root package name */
    public final boolean f17464p;

    @v3.g1(version = "1.2")
    /* loaded from: classes.dex */
    public static class a implements Serializable {

        /* renamed from: k  reason: collision with root package name */
        public static final a f17465k = new a();

        public final Object b() throws ObjectStreamException {
            return f17465k;
        }
    }

    public q() {
        this(f17458q);
    }

    public String A0() {
        return this.f17463o;
    }

    @Override // e5.b
    public List<Annotation> R() {
        return z0().R();
    }

    @Override // e5.c
    @v3.g1(version = "1.1")
    public e5.w b() {
        return z0().b();
    }

    @Override // e5.c
    @v3.g1(version = "1.1")
    public boolean d() {
        return z0().d();
    }

    @Override // e5.c
    @v3.g1(version = "1.1")
    public boolean g() {
        return z0().g();
    }

    @Override // e5.c
    public String getName() {
        return this.f17462n;
    }

    @Override // e5.c
    @v3.g1(version = "1.3")
    public boolean i() {
        return z0().i();
    }

    @Override // e5.c
    public List<e5.n> i0() {
        return z0().i0();
    }

    @Override // e5.c
    @v3.g1(version = "1.1")
    public boolean isOpen() {
        return z0().isOpen();
    }

    @Override // e5.c
    @v3.g1(version = "1.1")
    public List<e5.t> k() {
        return z0().k();
    }

    @Override // e5.c
    public e5.s k0() {
        return z0().k0();
    }

    @Override // e5.c
    public Object l(Map map) {
        return z0().l(map);
    }

    @Override // e5.c
    public Object r0(Object... objArr) {
        return z0().r0(objArr);
    }

    @v3.g1(version = "1.1")
    public e5.c v0() {
        e5.c cVar = this.f17459k;
        if (cVar == null) {
            e5.c w02 = w0();
            this.f17459k = w02;
            return w02;
        }
        return cVar;
    }

    public abstract e5.c w0();

    @v3.g1(version = "1.1")
    public Object x0() {
        return this.f17460l;
    }

    public e5.h y0() {
        Class cls = this.f17461m;
        if (cls == null) {
            return null;
        }
        return this.f17464p ? l1.g(cls) : l1.d(cls);
    }

    @v3.g1(version = "1.1")
    public e5.c z0() {
        e5.c v02 = v0();
        if (v02 != this) {
            return v02;
        }
        throw new s4.q();
    }

    @v3.g1(version = "1.1")
    public q(Object obj) {
        this(obj, null, null, null, false);
    }

    @v3.g1(version = "1.4")
    public q(Object obj, Class cls, String str, String str2, boolean z6) {
        this.f17460l = obj;
        this.f17461m = cls;
        this.f17462n = str;
        this.f17463o = str2;
        this.f17464p = z6;
    }
}