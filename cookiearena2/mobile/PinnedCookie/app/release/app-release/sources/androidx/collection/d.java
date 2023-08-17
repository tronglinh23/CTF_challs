package androidx.collection;

import androidx.lifecycle.r0;
import u4.l0;
/* loaded from: classes.dex */
public final class d {
    @n6.d
    public static final <T> c<T> a() {
        return new c<>();
    }

    @n6.d
    public static final <T> c<T> b(@n6.d T... tArr) {
        l0.q(tArr, r0.f4811g);
        c<T> cVar = new c<>(tArr.length);
        for (T t6 : tArr) {
            cVar.add(t6);
        }
        return cVar;
    }
}
