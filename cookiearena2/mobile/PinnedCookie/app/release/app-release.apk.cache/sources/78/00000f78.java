package f5;

import java.util.Iterator;
import u4.l0;

/* loaded from: classes.dex */
public final class c<T, K> implements m<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9801a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final t4.l<T, K> f9802b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@n6.d m<? extends T> mVar, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "source");
        l0.p(lVar, "keySelector");
        this.f9801a = mVar;
        this.f9802b = lVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new b(this.f9801a.iterator(), this.f9802b);
    }
}