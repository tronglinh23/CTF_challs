package k5;

import u4.l0;
import u4.w;
import v3.g1;

@l
@g1(version = "1.3")
/* loaded from: classes.dex */
public final class t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f11812a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11813b;

    public /* synthetic */ t(Object obj, long j7, w wVar) {
        this(obj, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t d(t tVar, Object obj, long j7, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = tVar.f11812a;
        }
        if ((i7 & 2) != 0) {
            j7 = tVar.f11813b;
        }
        return tVar.c(obj, j7);
    }

    public final T a() {
        return this.f11812a;
    }

    public final long b() {
        return this.f11813b;
    }

    @n6.d
    public final t<T> c(T t6, long j7) {
        return new t<>(t6, j7, null);
    }

    public final long e() {
        return this.f11813b;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return l0.g(this.f11812a, tVar.f11812a) && e.r(this.f11813b, tVar.f11813b);
        }
        return false;
    }

    public final T f() {
        return this.f11812a;
    }

    public int hashCode() {
        T t6 = this.f11812a;
        return ((t6 == null ? 0 : t6.hashCode()) * 31) + e.Z(this.f11813b);
    }

    @n6.d
    public String toString() {
        return "TimedValue(value=" + this.f11812a + ", duration=" + ((Object) e.u0(this.f11813b)) + ')';
    }

    public t(T t6, long j7) {
        this.f11812a = t6;
        this.f11813b = j7;
    }
}