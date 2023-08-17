package k2;

import androidx.lifecycle.z0;
import t4.l;
import u4.l0;

/* loaded from: classes.dex */
public final class h<T extends z0> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f11630a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final l<a, T> f11631b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@n6.d Class<T> cls, @n6.d l<? super a, ? extends T> lVar) {
        l0.p(cls, "clazz");
        l0.p(lVar, "initializer");
        this.f11630a = cls;
        this.f11631b = lVar;
    }

    @n6.d
    public final Class<T> a() {
        return this.f11630a;
    }

    @n6.d
    public final l<a, T> b() {
        return this.f11631b;
    }
}