package a5;

import e5.o;
import u4.l0;

/* loaded from: classes.dex */
public final class b<T> implements f<Object, T> {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public T f220a;

    @Override // a5.f, a5.e
    @n6.d
    public T a(@n6.e Object obj, @n6.d o<?> oVar) {
        l0.p(oVar, "property");
        T t6 = this.f220a;
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException("Property " + oVar.getName() + " should be initialized before get.");
    }

    @Override // a5.f
    public void b(@n6.e Object obj, @n6.d o<?> oVar, @n6.d T t6) {
        l0.p(oVar, "property");
        l0.p(t6, "value");
        this.f220a = t6;
    }
}