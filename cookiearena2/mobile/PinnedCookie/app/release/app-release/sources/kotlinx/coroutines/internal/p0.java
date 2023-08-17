package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.o0;
@s4.f
/* loaded from: classes.dex */
public final class p0<S extends o0<S>> {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final Object f12837a;

    public /* synthetic */ p0(Object obj) {
        this.f12837a = obj;
    }

    public static final /* synthetic */ p0 a(Object obj) {
        return new p0(obj);
    }

    @n6.d
    public static <S extends o0<S>> Object b(@n6.e Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof p0) && u4.l0.g(obj, ((p0) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return u4.l0.g(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @n6.d
    public static final S f(Object obj) {
        if (obj != g.f12805b) {
            if (obj != null) {
                return (S) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj == g.f12805b;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f12837a, obj);
    }

    public int hashCode() {
        return g(this.f12837a);
    }

    public final /* synthetic */ Object j() {
        return this.f12837a;
    }

    public String toString() {
        return i(this.f12837a);
    }
}
