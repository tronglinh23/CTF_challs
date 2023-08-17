package x3;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d1<E> extends c<E> implements RandomAccess {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final List<E> f18293l;

    /* renamed from: m  reason: collision with root package name */
    public int f18294m;

    /* renamed from: n  reason: collision with root package name */
    public int f18295n;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(@n6.d List<? extends E> list) {
        u4.l0.p(list, "list");
        this.f18293l = list;
    }

    @Override // x3.c, x3.a
    public int a() {
        return this.f18295n;
    }

    public final void b(int i7, int i8) {
        c.f18278k.d(i7, i8, this.f18293l.size());
        this.f18294m = i7;
        this.f18295n = i8 - i7;
    }

    @Override // x3.c, java.util.List
    public E get(int i7) {
        c.f18278k.b(i7, this.f18295n);
        return this.f18293l.get(this.f18294m + i7);
    }
}