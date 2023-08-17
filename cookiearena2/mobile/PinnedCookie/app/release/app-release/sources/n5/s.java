package n5;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.e3;
import v3.a1;
import v3.b1;
import v3.m2;
import v3.u0;
/* loaded from: classes.dex */
public final class s {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f13998a = "Channel was closed";

    @n6.d
    @a1
    public static final <E, R> i0<R> J(@n6.d i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super e4.d<? super R>, ? extends Object> pVar) {
        return v.E(i0Var, gVar, pVar);
    }

    @n6.d
    @a1
    public static final <E, R> i0<R> L(@n6.d i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.q<? super Integer, ? super E, ? super e4.d<? super R>, ? extends Object> qVar) {
        return v.G(i0Var, gVar, qVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> kotlinx.coroutines.selects.d<E> U(@n6.d i0<? extends E> i0Var) {
        return u.h(i0Var);
    }

    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @n6.e
    public static final <E> Object V(@n6.d i0<? extends E> i0Var, @n6.d e4.d<? super E> dVar) {
        return u.i(i0Var, dVar);
    }

    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @b1(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@n6.d m0<? super E> m0Var, E e7) {
        t.a(m0Var, e7);
    }

    @a1
    public static final void b(@n6.d i0<?> i0Var, @n6.e Throwable th) {
        u.a(i0Var, th);
    }

    @e3
    public static final <E, R> R c(@n6.d i<E> iVar, @n6.d t4.l<? super i0<? extends E>, ? extends R> lVar) {
        return (R) u.b(iVar, lVar);
    }

    public static final <E, R> R d(@n6.d i0<? extends E> i0Var, @n6.d t4.l<? super i0<? extends E>, ? extends R> lVar) {
        return (R) u.c(i0Var, lVar);
    }

    @e3
    @n6.e
    public static final <E> Object e(@n6.d i<E> iVar, @n6.d t4.l<? super E, m2> lVar, @n6.d e4.d<? super m2> dVar) {
        return u.d(iVar, lVar, dVar);
    }

    @n6.e
    @a1
    public static final <E, C extends m0<? super E>> Object e0(@n6.d i0<? extends E> i0Var, @n6.d C c7, @n6.d e4.d<? super C> dVar) {
        return v.W(i0Var, c7, dVar);
    }

    @n6.e
    public static final <E> Object f(@n6.d i0<? extends E> i0Var, @n6.d t4.l<? super E, m2> lVar, @n6.d e4.d<? super m2> dVar) {
        return u.e(i0Var, lVar, dVar);
    }

    @n6.e
    @a1
    public static final <E, C extends Collection<? super E>> Object f0(@n6.d i0<? extends E> i0Var, @n6.d C c7, @n6.d e4.d<? super C> dVar) {
        return v.X(i0Var, c7, dVar);
    }

    @n6.d
    @a1
    public static final t4.l<Throwable, m2> g(@n6.d i0<?> i0Var) {
        return v.b(i0Var);
    }

    @n6.e
    public static final <E> Object g0(@n6.d i0<? extends E> i0Var, @n6.d e4.d<? super List<? extends E>> dVar) {
        return u.j(i0Var, dVar);
    }

    @n6.d
    @a1
    public static final t4.l<Throwable, m2> h(@n6.d i0<?>... i0VarArr) {
        return v.c(i0VarArr);
    }

    @n6.e
    @a1
    public static final <K, V, M extends Map<? super K, ? super V>> Object i0(@n6.d i0<? extends u0<? extends K, ? extends V>> i0Var, @n6.d M m7, @n6.d e4.d<? super M> dVar) {
        return v.Z(i0Var, m7, dVar);
    }

    @n6.d
    @a1
    public static final <E, K> i0<E> k(@n6.d i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super e4.d<? super K>, ? extends Object> pVar) {
        return v.f(i0Var, gVar, pVar);
    }

    @n6.e
    @a1
    public static final <E> Object k0(@n6.d i0<? extends E> i0Var, @n6.d e4.d<? super Set<E>> dVar) {
        return v.b0(i0Var, dVar);
    }

    @n6.d
    public static final <E> Object m0(@n6.d m0<? super E> m0Var, E e7) {
        return t.b(m0Var, e7);
    }

    @n6.d
    @a1
    public static final <E, R, V> i0<V> q0(@n6.d i0<? extends E> i0Var, @n6.d i0<? extends R> i0Var2, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super R, ? extends V> pVar) {
        return v.g0(i0Var, i0Var2, gVar, pVar);
    }

    @n6.d
    @a1
    public static final <E> i0<E> s(@n6.d i0<? extends E> i0Var, @n6.d e4.g gVar, @n6.d t4.p<? super E, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return v.n(i0Var, gVar, pVar);
    }

    @n6.d
    @a1
    public static final <E> i0<E> y(@n6.d i0<? extends E> i0Var) {
        return v.t(i0Var);
    }
}
