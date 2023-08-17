package d5;

import java.lang.Comparable;
import u4.l0;

/* loaded from: classes.dex */
public interface g<T extends Comparable<? super T>> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@n6.d g<T> gVar, @n6.d T t6) {
            l0.p(t6, "value");
            return t6.compareTo(gVar.b()) >= 0 && t6.compareTo(gVar.g()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@n6.d g<T> gVar) {
            return gVar.b().compareTo(gVar.g()) > 0;
        }
    }

    boolean a(@n6.d T t6);

    @n6.d
    T b();

    @n6.d
    T g();

    boolean isEmpty();
}