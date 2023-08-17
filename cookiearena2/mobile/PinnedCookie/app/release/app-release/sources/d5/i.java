package d5;

import d5.g;
import java.lang.Comparable;
import u4.l0;
/* loaded from: classes.dex */
public class i<T extends Comparable<? super T>> implements g<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final T f8488k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final T f8489l;

    public i(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "start");
        l0.p(t7, "endInclusive");
        this.f8488k = t6;
        this.f8489l = t7;
    }

    @Override // d5.g, d5.r
    public boolean a(@n6.d T t6) {
        return g.a.a(this, t6);
    }

    @Override // d5.g, d5.r
    @n6.d
    public T b() {
        return this.f8488k;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!l0.g(b(), iVar.b()) || !l0.g(g(), iVar.g())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.g
    @n6.d
    public T g() {
        return this.f8489l;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b().hashCode() * 31) + g().hashCode();
    }

    @Override // d5.g, d5.r
    public boolean isEmpty() {
        return g.a.b(this);
    }

    @n6.d
    public String toString() {
        return b() + ".." + g();
    }
}
