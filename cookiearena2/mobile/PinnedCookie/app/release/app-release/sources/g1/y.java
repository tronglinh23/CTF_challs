package g1;

import android.annotation.SuppressLint;
import java.util.Objects;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface y<T> {
    @SuppressLint({"MissingNullability"})
    static <T> y<T> d(@SuppressLint({"MissingNullability"}) y<? super T> yVar) {
        Objects.requireNonNull(yVar);
        return (y<? super T>) yVar.negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean h(y yVar, Object obj) {
        return test(obj) && yVar.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean i(y yVar, Object obj) {
        return test(obj) || yVar.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> y<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new y() { // from class: g1.u
            @Override // g1.y
            public final boolean test(Object obj2) {
                boolean isNull;
                isNull = Objects.isNull(obj2);
                return isNull;
            }
        } : new y() { // from class: g1.v
            @Override // g1.y
            public final boolean test(Object obj2) {
                boolean equals;
                equals = obj.equals(obj2);
                return equals;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean j(Object obj) {
        return !test(obj);
    }

    @SuppressLint({"MissingNullability"})
    default y<T> g(@SuppressLint({"MissingNullability"}) final y<? super T> yVar) {
        Objects.requireNonNull(yVar);
        return new y() { // from class: g1.t
            @Override // g1.y
            public final boolean test(Object obj) {
                boolean i7;
                i7 = y.this.i(yVar, obj);
                return i7;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default y<T> m(@SuppressLint({"MissingNullability"}) final y<? super T> yVar) {
        Objects.requireNonNull(yVar);
        return new y() { // from class: g1.w
            @Override // g1.y
            public final boolean test(Object obj) {
                boolean h7;
                h7 = y.this.h(yVar, obj);
                return h7;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default y<T> negate() {
        return new y() { // from class: g1.x
            @Override // g1.y
            public final boolean test(Object obj) {
                boolean j7;
                j7 = y.this.j(obj);
                return j7;
            }
        };
    }

    boolean test(T t6);
}
