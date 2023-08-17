package x3;

import java.util.List;
/* loaded from: classes.dex */
public final class g1<T> extends f<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final List<T> f18304k;

    public g1(@n6.d List<T> list) {
        u4.l0.p(list, "delegate");
        this.f18304k = list;
    }

    @Override // x3.f
    public int a() {
        return this.f18304k.size();
    }

    @Override // x3.f, java.util.AbstractList, java.util.List
    public void add(int i7, T t6) {
        int Z0;
        List<T> list = this.f18304k;
        Z0 = c0.Z0(this, i7);
        list.add(Z0, t6);
    }

    @Override // x3.f
    public T b(int i7) {
        int Y0;
        List<T> list = this.f18304k;
        Y0 = c0.Y0(this, i7);
        return list.remove(Y0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f18304k.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i7) {
        int Y0;
        List<T> list = this.f18304k;
        Y0 = c0.Y0(this, i7);
        return list.get(Y0);
    }

    @Override // x3.f, java.util.AbstractList, java.util.List
    public T set(int i7, T t6) {
        int Y0;
        List<T> list = this.f18304k;
        Y0 = c0.Y0(this, i7);
        return list.set(Y0, t6);
    }
}
