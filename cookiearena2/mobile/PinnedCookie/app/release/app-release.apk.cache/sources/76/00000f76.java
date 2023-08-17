package f5;

import java.util.HashSet;
import java.util.Iterator;
import u4.l0;

/* loaded from: classes.dex */
public final class b<T, K> extends x3.b<T> {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final Iterator<T> f9798m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final t4.l<T, K> f9799n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final HashSet<K> f9800o;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@n6.d Iterator<? extends T> it, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(it, "source");
        l0.p(lVar, "keySelector");
        this.f9798m = it;
        this.f9799n = lVar;
        this.f9800o = new HashSet<>();
    }

    @Override // x3.b
    public void a() {
        while (this.f9798m.hasNext()) {
            T next = this.f9798m.next();
            if (this.f9800o.add(this.f9799n.O(next))) {
                d(next);
                return;
            }
        }
        b();
    }
}