package s2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import s2.g0;
import t2.a;
import u4.r1;
import v3.m2;
@r1({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 7 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,488:1\n232#2,3:489\n1603#3,9:492\n1855#3:501\n1856#3:503\n1612#3:504\n1#4:502\n1#4:505\n179#5,2:506\n32#6,2:508\n22#7:510\n56#7,4:511\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n59#1:489,3\n71#1:492,9\n71#1:501\n71#1:503\n71#1:504\n71#1:502\n202#1:506,2\n396#1:508,2\n398#1:510\n405#1:511,4\n*E\n"})
/* loaded from: classes.dex */
public class k0 extends g0 implements Iterable<g0>, v4.a {
    @n6.d

    /* renamed from: z  reason: collision with root package name */
    public static final a f16370z = new a(null);
    @n6.d

    /* renamed from: v  reason: collision with root package name */
    public final androidx.collection.n<g0> f16371v;

    /* renamed from: w  reason: collision with root package name */
    public int f16372w;
    @n6.e

    /* renamed from: x  reason: collision with root package name */
    public String f16373x;
    @n6.e

    /* renamed from: y  reason: collision with root package name */
    public String f16374y;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: s2.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0243a extends u4.n0 implements t4.l<g0, g0> {

            /* renamed from: l  reason: collision with root package name */
            public static final C0243a f16375l = new C0243a();

            public C0243a() {
                super(1);
            }

            @Override // t4.l
            @n6.e
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final g0 O(@n6.d g0 g0Var) {
                u4.l0.p(g0Var, "it");
                if (g0Var instanceof k0) {
                    k0 k0Var = (k0) g0Var;
                    return k0Var.S(k0Var.a0());
                }
                return null;
            }
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        public final g0 a(@n6.d k0 k0Var) {
            u4.l0.p(k0Var, "<this>");
            return (g0) f5.u.f1(f5.s.l(k0Var.S(k0Var.a0()), C0243a.f16375l));
        }

        public a() {
        }
    }

    @r1({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n1#2:489\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements Iterator<g0>, v4.d {

        /* renamed from: k  reason: collision with root package name */
        public int f16376k = -1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16377l;

        public b() {
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public g0 next() {
            if (hasNext()) {
                this.f16377l = true;
                androidx.collection.n<g0> X = k0.this.X();
                int i7 = this.f16376k + 1;
                this.f16376k = i7;
                g0 F = X.F(i7);
                u4.l0.o(F, "nodes.valueAt(++index)");
                return F;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16376k + 1 < k0.this.X().E();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f16377l) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            androidx.collection.n<g0> X = k0.this.X();
            X.F(this.f16376k).L(null);
            X.z(this.f16376k);
            this.f16376k--;
            this.f16377l = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@n6.d d1<? extends k0> d1Var) {
        super(d1Var);
        u4.l0.p(d1Var, "navGraphNavigator");
        this.f16371v = new androidx.collection.n<>();
    }

    @n6.d
    @s4.m
    public static final g0 W(@n6.d k0 k0Var) {
        return f16370z.a(k0Var);
    }

    @Override // s2.g0
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public g0.c B(@n6.d e0 e0Var) {
        u4.l0.p(e0Var, "navDeepLinkRequest");
        g0.c B = super.B(e0Var);
        ArrayList arrayList = new ArrayList();
        Iterator<g0> it = iterator();
        while (it.hasNext()) {
            g0.c B2 = it.next().B(e0Var);
            if (B2 != null) {
                arrayList.add(B2);
            }
        }
        return (g0.c) x3.e0.K3(x3.w.N(B, (g0.c) x3.e0.K3(arrayList)));
    }

    @Override // s2.g0
    public void C(@n6.d Context context, @n6.d AttributeSet attributeSet) {
        u4.l0.p(context, "context");
        u4.l0.p(attributeSet, "attrs");
        super.C(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a.b.f16820w);
        u4.l0.o(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        g0(obtainAttributes.getResourceId(a.b.f16821x, 0));
        this.f16373x = g0.f16312t.b(context, this.f16372w);
        m2 m2Var = m2.f17815a;
        obtainAttributes.recycle();
    }

    public final void O(@n6.d k0 k0Var) {
        u4.l0.p(k0Var, "other");
        Iterator<g0> it = k0Var.iterator();
        while (it.hasNext()) {
            g0 next = it.next();
            it.remove();
            P(next);
        }
    }

    public final void P(@n6.d g0 g0Var) {
        u4.l0.p(g0Var, "node");
        int r6 = g0Var.r();
        if (!((r6 == 0 && g0Var.v() == null) ? false : true)) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (v() != null && (!u4.l0.g(r1, v())) != true) {
            throw new IllegalArgumentException(("Destination " + g0Var + " cannot have the same route as graph " + this).toString());
        }
        if (!(r6 != r())) {
            throw new IllegalArgumentException(("Destination " + g0Var + " cannot have the same id as graph " + this).toString());
        }
        g0 o6 = this.f16371v.o(r6);
        if (o6 == g0Var) {
            return;
        }
        if (!(g0Var.u() == null)) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (o6 != null) {
            o6.L(null);
        }
        g0Var.L(this);
        this.f16371v.u(g0Var.r(), g0Var);
    }

    public final void Q(@n6.d Collection<? extends g0> collection) {
        u4.l0.p(collection, "nodes");
        for (g0 g0Var : collection) {
            if (g0Var != null) {
                P(g0Var);
            }
        }
    }

    public final void R(@n6.d g0... g0VarArr) {
        u4.l0.p(g0VarArr, "nodes");
        for (g0 g0Var : g0VarArr) {
            P(g0Var);
        }
    }

    @n6.e
    public final g0 S(@d.d0 int i7) {
        return T(i7, true);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final g0 T(@d.d0 int i7, boolean z6) {
        g0 o6 = this.f16371v.o(i7);
        if (o6 == null) {
            if (!z6 || u() == null) {
                return null;
            }
            k0 u6 = u();
            u4.l0.m(u6);
            return u6.S(i7);
        }
        return o6;
    }

    @n6.e
    public final g0 U(@n6.e String str) {
        if (str == null || i5.b0.V1(str)) {
            return null;
        }
        return V(str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final g0 V(@n6.d String str, boolean z6) {
        ?? r22;
        u4.l0.p(str, "route");
        g0 o6 = this.f16371v.o(g0.f16312t.a(str).hashCode());
        if (o6 == null) {
            Iterator it = f5.s.e(androidx.collection.o.k(this.f16371v)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    r22 = 0;
                    break;
                }
                r22 = it.next();
                if (((g0) r22).A(str) != null) {
                    break;
                }
            }
            o6 = r22;
        }
        if (o6 == null) {
            if (!z6 || u() == null) {
                return null;
            }
            k0 u6 = u();
            u4.l0.m(u6);
            return u6.U(str);
        }
        return o6;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final androidx.collection.n<g0> X() {
        return this.f16371v;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final String Y() {
        if (this.f16373x == null) {
            String str = this.f16374y;
            if (str == null) {
                str = String.valueOf(this.f16372w);
            }
            this.f16373x = str;
        }
        String str2 = this.f16373x;
        u4.l0.m(str2);
        return str2;
    }

    @d.d0
    @v3.k(message = "Use getStartDestinationId instead.", replaceWith = @v3.b1(expression = "startDestinationId", imports = {}))
    public final int Z() {
        return a0();
    }

    @d.d0
    public final int a0() {
        return this.f16372w;
    }

    @n6.e
    public final String b0() {
        return this.f16374y;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final g0.c c0(@n6.d e0 e0Var) {
        u4.l0.p(e0Var, "request");
        return super.B(e0Var);
    }

    public final void clear() {
        Iterator<g0> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public final void d0(@n6.d g0 g0Var) {
        u4.l0.p(g0Var, "node");
        int q6 = this.f16371v.q(g0Var.r());
        if (q6 >= 0) {
            this.f16371v.F(q6).L(null);
            this.f16371v.z(q6);
        }
    }

    public final void e0(int i7) {
        g0(i7);
    }

    @Override // s2.g0
    public boolean equals(@n6.e Object obj) {
        if (obj == null || !(obj instanceof k0)) {
            return false;
        }
        List d32 = f5.u.d3(f5.s.e(androidx.collection.o.k(this.f16371v)));
        k0 k0Var = (k0) obj;
        Iterator k7 = androidx.collection.o.k(k0Var.f16371v);
        while (k7.hasNext()) {
            d32.remove((g0) k7.next());
        }
        return super.equals(obj) && this.f16371v.E() == k0Var.f16371v.E() && a0() == k0Var.a0() && d32.isEmpty();
    }

    public final void f0(@n6.d String str) {
        u4.l0.p(str, "startDestRoute");
        h0(str);
    }

    public final void g0(int i7) {
        if (i7 != r()) {
            if (this.f16374y != null) {
                h0(null);
            }
            this.f16372w = i7;
            this.f16373x = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i7 + " cannot use the same id as the graph " + this).toString());
    }

    public final void h0(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if ((!u4.l0.g(str, v())) != true) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if ((!i5.b0.V1(str)) != true) {
            throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
        } else {
            hashCode = g0.f16312t.a(str).hashCode();
        }
        this.f16372w = hashCode;
        this.f16374y = str;
    }

    @Override // s2.g0
    public int hashCode() {
        int a02 = a0();
        androidx.collection.n<g0> nVar = this.f16371v;
        int E = nVar.E();
        for (int i7 = 0; i7 < E; i7++) {
            a02 = (((a02 * 31) + nVar.t(i7)) * 31) + nVar.F(i7).hashCode();
        }
        return a02;
    }

    @Override // java.lang.Iterable
    @n6.d
    public final Iterator<g0> iterator() {
        return new b();
    }

    @Override // s2.g0
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public String o() {
        return r() != 0 ? super.o() : "the root navigation";
    }

    @Override // s2.g0
    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        g0 U = U(this.f16374y);
        if (U == null) {
            U = S(a0());
        }
        sb.append(" startDestination=");
        if (U == null) {
            String str = this.f16374y;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f16373x;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f16372w));
                }
            }
        } else {
            sb.append("{");
            sb.append(U.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        u4.l0.o(sb2, "sb.toString()");
        return sb2;
    }
}
