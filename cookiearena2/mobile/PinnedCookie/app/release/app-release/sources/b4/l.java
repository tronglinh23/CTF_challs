package b4;

import java.util.Comparator;
import u4.l0;
/* loaded from: classes.dex */
public final class l<T> implements Comparator<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<T> f7251a;

    public l(@n6.d Comparator<T> comparator) {
        l0.p(comparator, "comparator");
        this.f7251a = comparator;
    }

    @n6.d
    public final Comparator<T> a() {
        return this.f7251a;
    }

    @Override // java.util.Comparator
    public int compare(T t6, T t7) {
        return this.f7251a.compare(t7, t6);
    }

    @Override // java.util.Comparator
    @n6.d
    public final Comparator<T> reversed() {
        return this.f7251a;
    }
}
