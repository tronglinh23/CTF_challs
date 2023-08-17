package d5;

import java.lang.Comparable;
import u4.l0;
import v3.g1;
@g1(version = "1.1")
/* loaded from: classes.dex */
public interface f<T extends Comparable<? super T>> extends g<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@n6.d f<T> fVar, @n6.d T t6) {
            l0.p(t6, "value");
            return fVar.f(fVar.b(), t6) && fVar.f(t6, fVar.g());
        }

        public static <T extends Comparable<? super T>> boolean b(@n6.d f<T> fVar) {
            return !fVar.f(fVar.b(), fVar.g());
        }
    }

    @Override // d5.g, d5.r
    boolean a(@n6.d T t6);

    boolean f(@n6.d T t6, @n6.d T t7);

    @Override // d5.g, d5.r
    boolean isEmpty();
}
