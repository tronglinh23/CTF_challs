package d4;

import v3.g1;
import v3.v;
@g1(version = "1.3")
@f
@k4.b
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ d4.a a(c cVar, v vVar, g gVar, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 2) != 0) {
                    gVar = g.UNKNOWN;
                }
                return cVar.a(vVar, gVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
        }
    }

    @n6.d
    @k4.b
    <R> d4.a a(@n6.d v<? extends R> vVar, @n6.d g gVar);

    @n6.d
    @k4.b
    h b();

    @n6.d
    @k4.b
    i c();

    @n6.d
    @k4.b
    h d(@n6.e Object obj);
}
