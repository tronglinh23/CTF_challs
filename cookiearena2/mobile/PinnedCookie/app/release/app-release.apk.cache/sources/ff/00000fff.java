package g1;

import android.annotation.SuppressLint;
import java.util.Objects;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface y<T> {
    static /* synthetic */ boolean c(Object obj) {
        return Objects.isNull(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> y<T> d(@SuppressLint({"MissingNullability"}) y<? super T> yVar) {
        Objects.requireNonNull(yVar);
        return (y<? super T>) yVar.negate();
    }

    static /* synthetic */ boolean e(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    static /* synthetic */ boolean f(y yVar, y yVar2, Object obj) {
        return yVar.h(yVar2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean h(y yVar, Object obj) {
        return test(obj) && yVar.test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean i(y yVar, Object obj) {
        return test(obj) || yVar.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> y<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new y() { // from class: g1.u
            @Override // g1.y
            public final boolean test(Object obj2) {
                return y.c(obj2);
            }
        } : new y() { // from class: g1.v
            @Override // g1.y
            public final boolean test(Object obj2) {
                return y.e(obj, obj2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean j(Object obj) {
        return !test(obj);
    }

    static /* synthetic */ boolean k(y yVar, y yVar2, Object obj) {
        return yVar.i(yVar2, obj);
    }

    static /* synthetic */ boolean l(y yVar, Object obj) {
        return yVar.j(obj);
    }

    @SuppressLint({"MissingNullability"})
    default y<T> g(@SuppressLint({"MissingNullability"}) final y<? super T> yVar) {
        Objects.requireNonNull(yVar);
        return new y() { // from class: g1.t
            @Override // g1.y
            public final boolean test(Object obj) {
                return y.k(y.this, yVar, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default y<T> m(@SuppressLint({"MissingNullability"}) final y<? super T> yVar) {
        Objects.requireNonNull(yVar);
        return new y() { // from class: g1.w
            @Override // g1.y
            public final boolean test(Object obj) {
                return y.f(y.this, yVar, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default y<T> negate() {
        return new y() { // from class: g1.x
            @Override // g1.y
            public final boolean test(Object obj) {
                return y.l(y.this, obj);
            }
        };
    }

    boolean test(T t6);
}