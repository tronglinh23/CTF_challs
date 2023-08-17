package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.n2;
import v3.a1;
import v3.b1;
import v3.m2;
/* loaded from: classes.dex */
public final class k {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f12256a = "kotlinx.coroutines.flow.defaultConcurrency";

    @n6.e
    public static final <T> Object A(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar, @n6.d e4.d<? super m2> dVar) {
        return n.f(iVar, pVar, dVar);
    }

    @d2
    @n6.d
    public static final <T, R> i<R> A0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.a(iVar, pVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> A1(@n6.d i<? extends T> iVar, long j7) {
        return r.h(iVar, j7);
    }

    @n6.e
    public static final <T> Object B(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar, @n6.d e4.d<? super m2> dVar) {
        return v.b(iVar, pVar, dVar);
    }

    @c2
    @n6.d
    public static final <T, R> i<R> B0(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.b(iVar, pVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> B1(@n6.d i<? extends T> iVar, long j7) {
        return r.i(iVar, j7);
    }

    @d2
    @n6.d
    public static final <T, R> i<R> C0(@n6.d i<? extends T> iVar, int i7, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.c(iVar, i7, pVar);
    }

    @n6.d
    public static final <T, R> i<R> C1(@n6.d i<? extends T> iVar, R r6, @v3.b @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar) {
        return a0.j(iVar, r6, qVar);
    }

    @n6.d
    public static final <T1, T2, T3, T4, T5, R> i<R> D(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @n6.d i<? extends T5> iVar5, @n6.d t4.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super e4.d<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @b1(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> D1(@n6.d i<? extends T> iVar, R r6, @v3.b @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar) {
        return x.B(iVar, r6, qVar);
    }

    @n6.d
    public static final <T1, T2, T3, T4, R> i<R> E(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @n6.d t4.s<? super T1, ? super T2, ? super T3, ? super T4, ? super e4.d<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> E0(@n6.d i<? extends i<? extends T>> iVar) {
        return x.m(iVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @b1(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> E1(@n6.d i<? extends T> iVar, @n6.d t4.q<? super T, ? super T, ? super e4.d<? super T>, ? extends Object> qVar) {
        return x.C(iVar, qVar);
    }

    @n6.d
    public static final <T1, T2, T3, R> i<R> F(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @v3.b @n6.d t4.r<? super T1, ? super T2, ? super T3, ? super e4.d<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> F0(@n6.d i<? extends i<? extends T>> iVar) {
        return w.e(iVar);
    }

    @n6.d
    public static final <T> i0<T> F1(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var, @n6.d o0 o0Var, int i7) {
        return z.g(iVar, u0Var, o0Var, i7);
    }

    @n6.d
    public static final <T1, T2, R> i<R> G(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return b0.f(iVar, iVar2, qVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> G0(@n6.d i<? extends i<? extends T>> iVar, int i7) {
        return w.f(iVar, i7);
    }

    @n6.e
    public static final <T> Object H1(@n6.d i<? extends T> iVar, @n6.d e4.d<? super T> dVar) {
        return y.j(iVar, dVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> I(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @n6.d i<? extends T5> iVar5, @n6.d t4.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super e4.d<? super R>, ? extends Object> tVar) {
        return x.b(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @n6.d
    public static final <T> i<T> I0(@v3.b @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return l.n(pVar);
    }

    @n6.e
    public static final <T> Object I1(@n6.d i<? extends T> iVar, @n6.d e4.d<? super T> dVar) {
        return y.k(iVar, dVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> J(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @n6.d t4.s<? super T1, ? super T2, ? super T3, ? super T4, ? super e4.d<? super R>, ? extends Object> sVar) {
        return x.c(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @s4.h(name = "flowCombine")
    @n6.d
    public static final <T1, T2, R> i<R> J0(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return b0.p(iVar, iVar2, qVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @b1(expression = "drop(count)", imports = {}))
    public static final <T> i<T> J1(@n6.d i<? extends T> iVar, int i7) {
        return x.D(iVar, i7);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> K(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d t4.r<? super T1, ? super T2, ? super T3, ? super e4.d<? super R>, ? extends Object> rVar) {
        return x.d(iVar, iVar2, iVar3, rVar);
    }

    @s4.h(name = "flowCombineTransform")
    @n6.d
    public static final <T1, T2, R> i<R> K0(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @v3.b @n6.d t4.r<? super j<? super R>, ? super T1, ? super T2, ? super e4.d<? super m2>, ? extends Object> rVar) {
        return b0.q(iVar, iVar2, rVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @b1(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> K1(@n6.d i<? extends T> iVar, T t6) {
        return x.E(iVar, t6);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> L(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return x.e(iVar, iVar2, qVar);
    }

    @n6.d
    public static final <T> i<T> L0(T t6) {
        return l.o(t6);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @b1(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> L1(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        return x.F(iVar, iVar2);
    }

    @n6.d
    public static final <T> i<T> M0(@n6.d T... tArr) {
        return l.p(tArr);
    }

    @n6.e
    public static final <T> Object M1(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var, @n6.d e4.d<? super t0<? extends T>> dVar) {
        return z.i(iVar, u0Var, dVar);
    }

    @n6.d
    public static final <T1, T2, T3, T4, T5, R> i<R> N(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @n6.d i<? extends T5> iVar5, @v3.b @n6.d t4.u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super e4.d<? super m2>, ? extends Object> uVar) {
        return b0.i(iVar, iVar2, iVar3, iVar4, iVar5, uVar);
    }

    @n6.d
    public static final <T> i<T> N0(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        return p.h(iVar, gVar);
    }

    @n6.d
    public static final <T> t0<T> N1(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var, @n6.d o0 o0Var, T t6) {
        return z.j(iVar, u0Var, o0Var, t6);
    }

    @n6.d
    public static final <T1, T2, T3, T4, R> i<R> O(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @v3.b @n6.d t4.t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super e4.d<? super m2>, ? extends Object> tVar) {
        return b0.j(iVar, iVar2, iVar3, iVar4, tVar);
    }

    @n6.e
    public static final <T, R> Object O0(@n6.d i<? extends T> iVar, R r6, @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar, @n6.d e4.d<? super R> dVar) {
        return y.e(iVar, r6, qVar, dVar);
    }

    @v3.k(level = v3.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@n6.d i<? extends T> iVar) {
        x.G(iVar);
    }

    @n6.d
    public static final <T1, T2, T3, R> i<R> P(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @v3.b @n6.d t4.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super e4.d<? super m2>, ? extends Object> sVar) {
        return b0.k(iVar, iVar2, iVar3, sVar);
    }

    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @b1(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar) {
        x.n(iVar, pVar);
    }

    @v3.k(level = v3.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar) {
        x.H(iVar, pVar);
    }

    @n6.d
    public static final <T1, T2, R> i<R> Q(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @v3.b @n6.d t4.r<? super j<? super R>, ? super T1, ? super T2, ? super e4.d<? super m2>, ? extends Object> rVar) {
        return b0.l(iVar, iVar2, rVar);
    }

    public static final int Q0() {
        return w.h();
    }

    @v3.k(level = v3.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar, @n6.d t4.p<? super Throwable, ? super e4.d<? super m2>, ? extends Object> pVar2) {
        x.I(iVar, pVar, pVar2);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Use 'flowOn' instead")
    public static final <T> i<T> R1(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        return x.J(iVar, gVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @b1(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> S(@n6.d i<? extends T> iVar, @n6.d t4.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        return x.f(iVar, lVar);
    }

    @n6.e
    public static final <T> Object S0(@n6.d i<? extends T> iVar, @n6.d e4.d<? super T> dVar) {
        return y.g(iVar, dVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @b1(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> S1(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.K(iVar, pVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> T(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, ? extends i<? extends R>> lVar) {
        return x.g(iVar, lVar);
    }

    @n6.e
    public static final <T> Object T0(@n6.d i<? extends T> iVar, @n6.d e4.d<? super T> dVar) {
        return y.h(iVar, dVar);
    }

    @n6.d
    public static final <T> i<T> T1(@n6.d i<? extends T> iVar, int i7) {
        return v.g(iVar, i7);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @b1(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> U(@n6.d i<? extends T> iVar, T t6) {
        return x.h(iVar, t6);
    }

    @n6.d
    public static final <T> n2 U0(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var) {
        return n.h(iVar, u0Var);
    }

    @n6.d
    public static final <T> i<T> U1(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return v.h(iVar, pVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> V(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        return x.i(iVar, iVar2);
    }

    @n6.d
    public static final <T, R> i<R> V0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        return a0.e(iVar, pVar);
    }

    @n6.e
    public static final <T, C extends Collection<? super T>> Object V1(@n6.d i<? extends T> iVar, @n6.d C c7, @n6.d e4.d<? super C> dVar) {
        return o.a(iVar, c7, dVar);
    }

    @n6.d
    public static final <T> i<T> W(@n6.d i<? extends T> iVar) {
        return p.g(iVar);
    }

    @c2
    @n6.d
    public static final <T, R> i<R> W0(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        return w.k(iVar, pVar);
    }

    @n6.e
    public static final <T> Object W1(@n6.d i<? extends T> iVar, @n6.d List<T> list, @n6.d e4.d<? super List<? extends T>> dVar) {
        return o.b(iVar, list, dVar);
    }

    @n6.d
    public static final <T> i<T> X(@n6.d n5.i0<? extends T> i0Var) {
        return m.c(i0Var);
    }

    @n6.d
    public static final <T, R> i<R> X0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super R>, ? extends Object> pVar) {
        return a0.f(iVar, pVar);
    }

    @n6.e
    public static final <T> Object Y(@n6.d i<? extends T> iVar, @n6.d e4.d<? super Integer> dVar) {
        return q.a(iVar, dVar);
    }

    @n6.d
    public static final <T> i<T> Y0(@n6.d Iterable<? extends i<? extends T>> iterable) {
        return w.l(iterable);
    }

    @n6.e
    public static final <T> Object Y1(@n6.d i<? extends T> iVar, @n6.d Set<T> set, @n6.d e4.d<? super Set<? extends T>> dVar) {
        return o.d(iVar, set, dVar);
    }

    @n6.e
    public static final <T> Object Z(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar, @n6.d e4.d<? super Integer> dVar) {
        return q.b(iVar, pVar, dVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> Z0(@n6.d i<? extends i<? extends T>> iVar) {
        return x.o(iVar);
    }

    @n6.d
    public static final i<Integer> a(@n6.d d5.l lVar) {
        return l.a(lVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> a0(@n6.d i<? extends T> iVar, long j7) {
        return r.a(iVar, j7);
    }

    @n6.d
    public static final <T> i<T> a1(@n6.d i<? extends T>... iVarArr) {
        return w.m(iVarArr);
    }

    @n6.d
    public static final <T, R> i<R> a2(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return t.g(iVar, qVar);
    }

    @n6.d
    public static final i<Long> b(@n6.d d5.o oVar) {
        return l.b(oVar);
    }

    @d2
    @n6.d
    @v3.t0
    public static final <T> i<T> b0(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, Long> lVar) {
        return r.b(iVar, lVar);
    }

    @n6.d
    public static final Void b1() {
        return x.p();
    }

    @c2
    @n6.d
    public static final <T, R> i<R> b2(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return w.n(iVar, qVar);
    }

    @n6.d
    public static final <T> i<T> c(@n6.d f5.m<? extends T> mVar) {
        return l.c(mVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> c0(@n6.d i<? extends T> iVar, long j7) {
        return r.c(iVar, j7);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> c1(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        return x.q(iVar, gVar);
    }

    @n6.d
    public static final <T, R> i<R> c2(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.q<? super j<? super R>, ? super T, ? super e4.d<? super Boolean>, ? extends Object> qVar) {
        return v.i(iVar, qVar);
    }

    @n6.d
    public static final <T> i<T> d(@n6.d Iterable<? extends T> iterable) {
        return l.d(iterable);
    }

    @d2
    @s4.h(name = "debounceDuration")
    @v3.t0
    @n6.d
    public static final <T> i<T> d0(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, k5.e> lVar) {
        return r.d(iVar, lVar);
    }

    @n6.d
    public static final <T> i<T> d1(@n6.d i<? extends T> iVar, @n6.d t4.q<? super j<? super T>, ? super Throwable, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return t.d(iVar, qVar);
    }

    @n6.d
    @a1
    public static final <T, R> i<R> d2(@n6.d i<? extends T> iVar, @v3.b @n6.d t4.q<? super j<? super R>, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return t.h(iVar, qVar);
    }

    @n6.d
    public static final <T> i<T> e(@n6.d Iterator<? extends T> it) {
        return l.e(it);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> e0(@n6.d i<? extends T> iVar, long j7) {
        return x.j(iVar, j7);
    }

    @n6.d
    public static final <T> i<T> e1(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return a0.g(iVar, pVar);
    }

    @n6.d
    public static final <T> i<x3.p0<T>> e2(@n6.d i<? extends T> iVar) {
        return a0.k(iVar);
    }

    @n6.d
    @v3.k(level = v3.m.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> f(@n6.d n5.i<T> iVar) {
        return m.b(iVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> f0(@n6.d i<? extends T> iVar, long j7) {
        return x.k(iVar, j7);
    }

    @n6.d
    public static final <T> i<T> f1(@n6.d i<? extends T> iVar, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return t.e(iVar, pVar);
    }

    @n6.d
    public static final <T1, T2, R> i<R> f2(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return b0.s(iVar, iVar2, qVar);
    }

    @d2
    @n6.d
    public static final <T> i<T> g(@n6.d t4.a<? extends T> aVar) {
        return l.f(aVar);
    }

    @n6.d
    public static final <T> i<T> g0(@n6.d i<? extends T> iVar) {
        return s.a(iVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> g1(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        return x.r(iVar, iVar2);
    }

    @d2
    @n6.d
    public static final <T> i<T> h(@n6.d t4.l<? super e4.d<? super T>, ? extends Object> lVar) {
        return l.g(lVar);
    }

    @n6.d
    public static final <T> i<T> h0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super T, Boolean> pVar) {
        return s.b(iVar, pVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> h1(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        return x.s(iVar, iVar2);
    }

    @n6.d
    public static final i<Integer> i(@n6.d int[] iArr) {
        return l.h(iArr);
    }

    @n6.d
    public static final <T, K> i<T> i0(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, ? extends K> lVar) {
        return s.c(iVar, lVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @b1(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> i1(@n6.d i<? extends T> iVar, T t6) {
        return x.t(iVar, t6);
    }

    @n6.d
    public static final i<Long> j(@n6.d long[] jArr) {
        return l.i(jArr);
    }

    @n6.d
    public static final <T> i<T> j0(@n6.d i<? extends T> iVar, int i7) {
        return v.d(iVar, i7);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> j1(@n6.d i<? extends T> iVar, T t6, @n6.d t4.l<? super Throwable, Boolean> lVar) {
        return x.u(iVar, t6, lVar);
    }

    @n6.d
    public static final <T> i<T> k(@n6.d T[] tArr) {
        return l.j(tArr);
    }

    @n6.d
    public static final <T> i<T> k0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return v.e(iVar, pVar);
    }

    @n6.d
    public static final <T> i0<T> l(@n6.d d0<T> d0Var) {
        return z.a(d0Var);
    }

    @n6.e
    public static final <T> Object l0(@n6.d j<? super T> jVar, @n6.d i<? extends T> iVar, @n6.d e4.d<? super m2> dVar) {
        return n.g(jVar, iVar, dVar);
    }

    @n6.d
    public static final <T> i<T> l1(@n6.d i<? extends T> iVar, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return t.f(iVar, pVar);
    }

    @n6.d
    public static final <T> t0<T> m(@n6.d e0<T> e0Var) {
        return z.b(e0Var);
    }

    @n6.e
    public static final <T> Object m0(@n6.d j<? super T> jVar, @n6.d n5.i0<? extends T> i0Var, @n6.d e4.d<? super m2> dVar) {
        return m.d(jVar, i0Var, dVar);
    }

    @n6.d
    public static final <T> i0<T> m1(@n6.d i0<? extends T> i0Var, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return z.f(i0Var, pVar);
    }

    @n6.d
    public static final <T> i<T> n0() {
        return l.m();
    }

    @d2
    @n6.d
    public static final <T> n5.i0<T> n1(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var) {
        return m.f(iVar, u0Var);
    }

    @n6.d
    public static final <T> i<T> o(@n6.d i<? extends T> iVar, int i7, @n6.d n5.m mVar) {
        return p.b(iVar, i7, mVar);
    }

    public static final void o0(@n6.d j<?> jVar) {
        t.b(jVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> o1(@n6.d i<? extends T> iVar) {
        return x.w(iVar);
    }

    @n6.d
    public static final <T> i<T> p0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return a0.a(iVar, pVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> p1(@n6.d i<? extends T> iVar, int i7) {
        return x.x(iVar, i7);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> q1(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        return x.y(iVar, gVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> r(@n6.d i<? extends T> iVar) {
        return x.a(iVar);
    }

    @n6.d
    public static final <T> i<T> r0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return a0.c(iVar, pVar);
    }

    @n6.d
    public static final <T> i<T> r1(@n6.d n5.i0<? extends T> i0Var) {
        return m.g(i0Var);
    }

    @n6.d
    public static final <T> i<T> s(@v3.b @n6.d t4.p<? super n5.g0<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return l.k(pVar);
    }

    @n6.d
    public static final <T> i<T> s0(@n6.d i<? extends T> iVar) {
        return a0.d(iVar);
    }

    @n6.e
    public static final <S, T extends S> Object s1(@n6.d i<? extends T> iVar, @n6.d t4.q<? super S, ? super T, ? super e4.d<? super S>, ? extends Object> qVar, @n6.d e4.d<? super S> dVar) {
        return y.i(iVar, qVar, dVar);
    }

    @n6.d
    public static final <T> i<T> t(@n6.d i<? extends T> iVar) {
        return p.e(iVar);
    }

    @n6.e
    public static final <T> Object t0(@n6.d i<? extends T> iVar, @n6.d e4.d<? super T> dVar) {
        return y.a(iVar, dVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> t1(@n6.d i<? extends T> iVar) {
        return x.z(iVar);
    }

    @n6.d
    public static final <T> i<T> u(@n6.d i<? extends T> iVar, @n6.d t4.q<? super j<? super T>, ? super Throwable, ? super e4.d<? super m2>, ? extends Object> qVar) {
        return u.a(iVar, qVar);
    }

    @n6.e
    public static final <T> Object u0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return y.b(iVar, pVar, dVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> u1(@n6.d i<? extends T> iVar, int i7) {
        return x.A(iVar, i7);
    }

    @n6.e
    public static final <T> Object v(@n6.d i<? extends T> iVar, @n6.d j<? super T> jVar, @n6.d e4.d<? super Throwable> dVar) {
        return u.b(iVar, jVar, dVar);
    }

    @n6.e
    public static final <T> Object v0(@n6.d i<? extends T> iVar, @n6.d e4.d<? super T> dVar) {
        return y.c(iVar, dVar);
    }

    @n6.d
    public static final <T> i<T> v1(@n6.d i<? extends T> iVar, long j7, @n6.d t4.p<? super Throwable, ? super e4.d<? super Boolean>, ? extends Object> pVar) {
        return u.e(iVar, j7, pVar);
    }

    @n6.d
    public static final <T> i<T> w(@v3.b @n6.d t4.p<? super n5.g0<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        return l.l(pVar);
    }

    @n6.e
    public static final <T> Object w0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super Boolean>, ? extends Object> pVar, @n6.d e4.d<? super T> dVar) {
        return y.d(iVar, pVar, dVar);
    }

    @n6.e
    public static final Object x(@n6.d i<?> iVar, @n6.d e4.d<? super m2> dVar) {
        return n.a(iVar, dVar);
    }

    @n6.d
    public static final n5.i0<m2> x0(@n6.d kotlinx.coroutines.u0 u0Var, long j7, long j8) {
        return r.f(u0Var, j7, j8);
    }

    @n6.d
    public static final <T> i<T> x1(@n6.d i<? extends T> iVar, @n6.d t4.r<? super j<? super T>, ? super Throwable, ? super Long, ? super e4.d<? super Boolean>, ? extends Object> rVar) {
        return u.g(iVar, rVar);
    }

    @n6.d
    public static final <T, R> i<R> y1(@n6.d i<? extends T> iVar, R r6, @v3.b @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar) {
        return a0.h(iVar, r6, qVar);
    }

    @n6.e
    public static final <T> Object z(@n6.d i<? extends T> iVar, @n6.d t4.q<? super Integer, ? super T, ? super e4.d<? super m2>, ? extends Object> qVar, @n6.d e4.d<? super m2> dVar) {
        return n.d(iVar, qVar, dVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> z0(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.l(iVar, pVar);
    }

    @n6.d
    public static final <T> i<T> z1(@n6.d i<? extends T> iVar, @n6.d t4.q<? super T, ? super T, ? super e4.d<? super T>, ? extends Object> qVar) {
        return a0.i(iVar, qVar);
    }
}
