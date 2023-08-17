package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.d;
import d.d0;
import s2.h0;
import s2.i0;
import u4.l0;
import v3.b1;
import v3.k;
@i0
/* loaded from: classes.dex */
public final class e extends h0<d.c> {
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public e5.d<? extends Fragment> f4909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your FragmentNavigatorDestination instead", replaceWith = @b1(expression = "FragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public e(@n6.d d dVar, @d0 int i7, @n6.d e5.d<? extends Fragment> dVar2) {
        super(dVar, i7);
        l0.p(dVar, "navigator");
        l0.p(dVar2, "fragmentClass");
        this.f4909h = dVar2;
    }

    @Override // s2.h0
    @n6.d
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public d.c c() {
        d.c cVar = (d.c) super.c();
        String name = s4.a.d(this.f4909h).getName();
        l0.o(name, "fragmentClass.java.name");
        cVar.P(name);
        return cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@n6.d d dVar, @n6.d String str, @n6.d e5.d<? extends Fragment> dVar2) {
        super(dVar, str);
        l0.p(dVar, "navigator");
        l0.p(str, "route");
        l0.p(dVar2, "fragmentClass");
        this.f4909h = dVar2;
    }
}
