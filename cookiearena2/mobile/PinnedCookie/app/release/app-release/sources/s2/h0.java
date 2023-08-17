package s2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s2.g0;
import u4.r1;
import v3.m2;
@r1({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n215#2,2:260\n215#2,2:264\n1855#3,2:262\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n152#1:260,2\n158#1:264,2\n155#1:262,2\n*E\n"})
@i0
/* loaded from: classes.dex */
public class h0<D extends g0> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final d1<? extends D> f16342a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16343b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final String f16344c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f16345d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public Map<String, q> f16346e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public List<z> f16347f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, l> f16348g;

    public h0(@n6.d d1<? extends D> d1Var, @d.d0 int i7, @n6.e String str) {
        u4.l0.p(d1Var, "navigator");
        this.f16342a = d1Var;
        this.f16343b = i7;
        this.f16344c = str;
        this.f16346e = new LinkedHashMap();
        this.f16347f = new ArrayList();
        this.f16348g = new LinkedHashMap();
    }

    @v3.k(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void a(int i7, @n6.d t4.l<? super m, m2> lVar) {
        u4.l0.p(lVar, "actionBuilder");
        Map<Integer, l> map = this.f16348g;
        Integer valueOf = Integer.valueOf(i7);
        m mVar = new m();
        lVar.O(mVar);
        map.put(valueOf, mVar.a());
    }

    public final void b(@n6.d String str, @n6.d t4.l<? super r, m2> lVar) {
        u4.l0.p(str, "name");
        u4.l0.p(lVar, "argumentBuilder");
        Map<String, q> map = this.f16346e;
        r rVar = new r();
        lVar.O(rVar);
        map.put(str, rVar.a());
    }

    @n6.d
    public D c() {
        D a7 = this.f16342a.a();
        a7.K(this.f16345d);
        for (Map.Entry<String, q> entry : this.f16346e.entrySet()) {
            a7.b(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.f16347f.iterator();
        while (it.hasNext()) {
            a7.f((z) it.next());
        }
        for (Map.Entry<Integer, l> entry2 : this.f16348g.entrySet()) {
            a7.G(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.f16344c;
        if (str != null) {
            a7.M(str);
        }
        int i7 = this.f16343b;
        if (i7 != -1) {
            a7.J(i7);
        }
        return a7;
    }

    public final void d(@n6.d String str) {
        u4.l0.p(str, "uriPattern");
        this.f16347f.add(new z(str));
    }

    public final void e(@n6.d t4.l<? super c0, m2> lVar) {
        u4.l0.p(lVar, "navDeepLink");
        List<z> list = this.f16347f;
        c0 c0Var = new c0();
        lVar.O(c0Var);
        list.add(c0Var.a());
    }

    public final int f() {
        return this.f16343b;
    }

    @n6.e
    public final CharSequence g() {
        return this.f16345d;
    }

    @n6.d
    public final d1<? extends D> h() {
        return this.f16342a;
    }

    @n6.e
    public final String i() {
        return this.f16344c;
    }

    public final void j(@n6.e CharSequence charSequence) {
        this.f16345d = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @v3.k(message = "Use routes to build your NavDestination instead", replaceWith = @v3.b1(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public h0(@n6.d d1<? extends D> d1Var, @d.d0 int i7) {
        this(d1Var, i7, null);
        u4.l0.p(d1Var, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(@n6.d d1<? extends D> d1Var, @n6.e String str) {
        this(d1Var, -1, str);
        u4.l0.p(d1Var, "navigator");
    }
}
