package a5;

import e5.o;
import u4.l0;
/* loaded from: classes.dex */
public abstract class c<V> implements f<Object, V> {

    /* renamed from: a  reason: collision with root package name */
    public V f221a;

    public c(V v6) {
        this.f221a = v6;
    }

    @Override // a5.f, a5.e
    public V a(@n6.e Object obj, @n6.d o<?> oVar) {
        l0.p(oVar, "property");
        return this.f221a;
    }

    @Override // a5.f
    public void b(@n6.e Object obj, @n6.d o<?> oVar, V v6) {
        l0.p(oVar, "property");
        V v7 = this.f221a;
        if (d(oVar, v7, v6)) {
            this.f221a = v6;
            c(oVar, v7, v6);
        }
    }

    public void c(@n6.d o<?> oVar, V v6, V v7) {
        l0.p(oVar, "property");
    }

    public boolean d(@n6.d o<?> oVar, V v6, V v7) {
        l0.p(oVar, "property");
        return true;
    }
}
