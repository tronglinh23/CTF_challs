package kotlinx.coroutines.flow;
/* loaded from: classes.dex */
public final class v0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r0 f12599a = new kotlinx.coroutines.internal.r0("NONE");
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r0 f12600b = new kotlinx.coroutines.internal.r0("PENDING");

    @n6.d
    public static final <T> e0<T> a(T t6) {
        if (t6 == null) {
            t6 = (T) p5.u.f14964a;
        }
        return new u0(t6);
    }

    @n6.d
    public static final <T> i<T> d(@n6.d t0<? extends T> t0Var, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < 2) {
            z6 = true;
        }
        return ((z6 || i7 == -2) && mVar == n5.m.DROP_OLDEST) ? t0Var : k0.e(t0Var, gVar, i7, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@n6.d e0<T> e0Var, @n6.d t4.l<? super T, ? extends T> lVar) {
        ?? r02;
        do {
            r02 = (Object) e0Var.getValue();
        } while (!e0Var.h(r02, lVar.O(r02)));
        return r02;
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void h(@n6.d e0<T> e0Var, @n6.d t4.l<? super T, ? extends T> lVar) {
        Object obj;
        do {
            obj = (Object) e0Var.getValue();
        } while (!e0Var.h(obj, lVar.O(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T i(@n6.d e0<T> e0Var, @n6.d t4.l<? super T, ? extends T> lVar) {
        Object obj;
        T O;
        do {
            obj = (Object) e0Var.getValue();
            O = lVar.O(obj);
        } while (!e0Var.h(obj, O));
        return O;
    }
}
