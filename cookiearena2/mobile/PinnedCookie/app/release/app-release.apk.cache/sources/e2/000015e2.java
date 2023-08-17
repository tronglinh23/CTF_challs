package kotlinx.coroutines.sync;

import v3.k;
import v3.m;
import v3.m2;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {
        @k(level = m.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ Object b(c cVar, Object obj, e4.d dVar, int i7, Object obj2) {
            if (obj2 == null) {
                if ((i7 & 1) != 0) {
                    obj = null;
                }
                return cVar.a(obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean c(c cVar, Object obj, int i7, Object obj2) {
            if (obj2 == null) {
                if ((i7 & 1) != 0) {
                    obj = null;
                }
                return cVar.e(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void d(c cVar, Object obj, int i7, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i7 & 1) != 0) {
                obj = null;
            }
            cVar.b(obj);
        }
    }

    @n6.e
    Object a(@n6.e Object obj, @n6.d e4.d<? super m2> dVar);

    void b(@n6.e Object obj);

    boolean c(@n6.d Object obj);

    @n6.d
    kotlinx.coroutines.selects.e<Object, c> d();

    boolean e(@n6.e Object obj);

    boolean f();
}