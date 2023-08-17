package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.p;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements v {

    /* renamed from: k  reason: collision with root package name */
    public final Object f4630k;

    /* renamed from: l  reason: collision with root package name */
    public final c.a f4631l;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4630k = obj;
        this.f4631l = c.f4704c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.v
    public void d(@d.o0 z zVar, @d.o0 p.a aVar) {
        this.f4631l.a(zVar, aVar, this.f4630k);
    }
}