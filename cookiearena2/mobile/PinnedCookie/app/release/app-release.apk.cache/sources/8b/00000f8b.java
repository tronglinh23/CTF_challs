package f5;

import java.util.Collection;
import java.util.Iterator;
import v3.g1;
import v3.m2;

@g1(version = "1.3")
@e4.j
/* loaded from: classes.dex */
public abstract class o<T> {
    @n6.e
    public abstract Object a(T t6, @n6.d e4.d<? super m2> dVar);

    @n6.e
    public final Object f(@n6.d m<? extends T> mVar, @n6.d e4.d<? super m2> dVar) {
        Object j7 = j(mVar.iterator(), dVar);
        return j7 == g4.d.h() ? j7 : m2.f17815a;
    }

    @n6.e
    public final Object i(@n6.d Iterable<? extends T> iterable, @n6.d e4.d<? super m2> dVar) {
        Object j7;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (j7 = j(iterable.iterator(), dVar)) == g4.d.h()) ? j7 : m2.f17815a;
    }

    @n6.e
    public abstract Object j(@n6.d Iterator<? extends T> it, @n6.d e4.d<? super m2> dVar);
}