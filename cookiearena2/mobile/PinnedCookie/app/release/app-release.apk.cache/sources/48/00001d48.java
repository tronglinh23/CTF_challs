package x3;

import java.util.List;

/* loaded from: classes.dex */
public class h1<T> extends c<T> {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final List<T> f18307l;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(@n6.d List<? extends T> list) {
        u4.l0.p(list, "delegate");
        this.f18307l = list;
    }

    @Override // x3.c, x3.a
    public int a() {
        return this.f18307l.size();
    }

    @Override // x3.c, java.util.List
    public T get(int i7) {
        int Y0;
        List<T> list = this.f18307l;
        Y0 = c0.Y0(this, i7);
        return list.get(Y0);
    }
}