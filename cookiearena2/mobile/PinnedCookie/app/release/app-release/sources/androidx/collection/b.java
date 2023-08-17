package androidx.collection;

import u4.l0;
import v3.u0;
/* loaded from: classes.dex */
public final class b {
    @n6.d
    public static final <K, V> a<K, V> a() {
        return new a<>();
    }

    @n6.d
    public static final <K, V> a<K, V> b(@n6.d u0<? extends K, ? extends V>... u0VarArr) {
        l0.q(u0VarArr, "pairs");
        a<K, V> aVar = new a<>(u0VarArr.length);
        for (u0<? extends K, ? extends V> u0Var : u0VarArr) {
            aVar.put(u0Var.e(), u0Var.f());
        }
        return aVar;
    }
}
