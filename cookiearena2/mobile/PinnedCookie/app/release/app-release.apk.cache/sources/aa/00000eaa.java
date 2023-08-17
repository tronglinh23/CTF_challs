package d5;

import d5.r;
import java.lang.Comparable;
import u4.l0;

/* loaded from: classes.dex */
public class h<T extends Comparable<? super T>> implements r<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final T f8486k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final T f8487l;

    public h(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "start");
        l0.p(t7, "endExclusive");
        this.f8486k = t6;
        this.f8487l = t7;
    }

    @Override // d5.r
    public boolean a(@n6.d T t6) {
        return r.a.a(this, t6);
    }

    @Override // d5.r
    @n6.d
    public T b() {
        return this.f8486k;
    }

    @Override // d5.r
    @n6.d
    public T d() {
        return this.f8487l;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (!l0.g(b(), hVar.b()) || !l0.g(d(), hVar.d())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b().hashCode() * 31) + d().hashCode();
    }

    @Override // d5.r
    public boolean isEmpty() {
        return r.a.b(this);
    }

    @n6.d
    public String toString() {
        return b() + "..<" + d();
    }
}