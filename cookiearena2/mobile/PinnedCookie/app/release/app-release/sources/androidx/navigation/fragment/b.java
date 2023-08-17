package androidx.navigation.fragment;

import androidx.fragment.app.m;
import androidx.navigation.fragment.DialogFragmentNavigator;
import d.d0;
import s2.h0;
import s2.i0;
import u4.l0;
import v3.b1;
import v3.k;
@i0
/* loaded from: classes.dex */
public final class b extends h0<DialogFragmentNavigator.b> {
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public e5.d<? extends m> f4885h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @b1(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public b(@n6.d DialogFragmentNavigator dialogFragmentNavigator, @d0 int i7, @n6.d e5.d<? extends m> dVar) {
        super(dialogFragmentNavigator, i7);
        l0.p(dialogFragmentNavigator, "navigator");
        l0.p(dVar, "fragmentClass");
        this.f4885h = dVar;
    }

    @Override // s2.h0
    @n6.d
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public DialogFragmentNavigator.b c() {
        DialogFragmentNavigator.b bVar = (DialogFragmentNavigator.b) super.c();
        String name = s4.a.d(this.f4885h).getName();
        l0.o(name, "fragmentClass.java.name");
        bVar.P(name);
        return bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@n6.d DialogFragmentNavigator dialogFragmentNavigator, @n6.d String str, @n6.d e5.d<? extends m> dVar) {
        super(dialogFragmentNavigator, str);
        l0.p(dialogFragmentNavigator, "navigator");
        l0.p(str, "route");
        l0.p(dVar, "fragmentClass");
        this.f4885h = dVar;
    }
}
