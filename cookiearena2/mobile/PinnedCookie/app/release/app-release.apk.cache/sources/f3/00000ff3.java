package g1;

import android.annotation.SuppressLint;
import android.util.Pair;
import u4.l0;
import v3.u0;

/* loaded from: classes.dex */
public final class p {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@n6.d Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@n6.d o<F, S> oVar) {
        l0.p(oVar, "<this>");
        return oVar.f10023a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@n6.d Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (S) pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@n6.d o<F, S> oVar) {
        l0.p(oVar, "<this>");
        return oVar.f10024b;
    }

    @n6.d
    public static final <F, S> Pair<F, S> e(@n6.d u0<? extends F, ? extends S> u0Var) {
        l0.p(u0Var, "<this>");
        return new Pair<>(u0Var.e(), u0Var.f());
    }

    @n6.d
    public static final <F, S> o<F, S> f(@n6.d u0<? extends F, ? extends S> u0Var) {
        l0.p(u0Var, "<this>");
        return new o<>(u0Var.e(), u0Var.f());
    }

    @n6.d
    public static final <F, S> u0<F, S> g(@n6.d Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return new u0<>(pair.first, pair.second);
    }

    @n6.d
    public static final <F, S> u0<F, S> h(@n6.d o<F, S> oVar) {
        l0.p(oVar, "<this>");
        return new u0<>(oVar.f10023a, oVar.f10024b);
    }
}