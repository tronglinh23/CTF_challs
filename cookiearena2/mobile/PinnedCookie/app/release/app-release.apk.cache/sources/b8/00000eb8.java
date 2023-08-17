package d5;

import java.lang.Comparable;
import u4.l0;
import v3.g1;

@g1(version = "1.7")
@v3.r
/* loaded from: classes.dex */
public interface r<T extends Comparable<? super T>> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@n6.d r<T> rVar, @n6.d T t6) {
            l0.p(t6, "value");
            return t6.compareTo(rVar.b()) >= 0 && t6.compareTo(rVar.d()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@n6.d r<T> rVar) {
            return rVar.b().compareTo(rVar.d()) >= 0;
        }
    }

    boolean a(@n6.d T t6);

    @n6.d
    T b();

    @n6.d
    T d();

    boolean isEmpty();
}