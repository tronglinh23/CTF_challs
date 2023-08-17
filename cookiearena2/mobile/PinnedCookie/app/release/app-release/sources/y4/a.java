package y4;

import f5.m;
import f5.s;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import n6.d;
import n6.e;
import u4.l0;
import v3.g1;
import v3.q2;
import v3.r;
import x3.k1;
import x3.l1;
import x3.v;
import x3.w;
/* loaded from: classes.dex */
public final class a {
    @g1(version = "1.8")
    @d
    @q2(markerClass = {r.class})
    public static final <T> m<T> a(@d Optional<? extends T> optional) {
        l0.p(optional, "<this>");
        return optional.isPresent() ? s.q(optional.get()) : s.g();
    }

    @g1(version = "1.8")
    @q2(markerClass = {r.class})
    public static final <T> T b(@d Optional<? extends T> optional, T t6) {
        l0.p(optional, "<this>");
        return optional.isPresent() ? optional.get() : t6;
    }

    @g1(version = "1.8")
    @q2(markerClass = {r.class})
    public static final <T> T c(@d Optional<? extends T> optional, @d t4.a<? extends T> aVar) {
        l0.p(optional, "<this>");
        l0.p(aVar, "defaultValue");
        return optional.isPresent() ? optional.get() : aVar.n();
    }

    @g1(version = "1.8")
    @e
    @q2(markerClass = {r.class})
    public static final <T> T d(@d Optional<T> optional) {
        l0.p(optional, "<this>");
        return optional.orElse(null);
    }

    @g1(version = "1.8")
    @d
    @q2(markerClass = {r.class})
    public static final <T, C extends Collection<? super T>> C e(@d Optional<T> optional, @d C c7) {
        l0.p(optional, "<this>");
        l0.p(c7, "destination");
        if (optional.isPresent()) {
            T t6 = optional.get();
            l0.o(t6, "get()");
            c7.add(t6);
        }
        return c7;
    }

    @g1(version = "1.8")
    @d
    @q2(markerClass = {r.class})
    public static final <T> List<T> f(@d Optional<? extends T> optional) {
        l0.p(optional, "<this>");
        return optional.isPresent() ? v.k(optional.get()) : w.E();
    }

    @g1(version = "1.8")
    @d
    @q2(markerClass = {r.class})
    public static final <T> Set<T> g(@d Optional<? extends T> optional) {
        l0.p(optional, "<this>");
        return optional.isPresent() ? k1.f(optional.get()) : l1.k();
    }
}
