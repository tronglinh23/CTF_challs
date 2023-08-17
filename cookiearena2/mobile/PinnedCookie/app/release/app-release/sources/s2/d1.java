package s2;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import s2.g0;
import u4.r1;
import v3.m2;
@r1({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,241:1\n1295#2,2:242\n*S KotlinDebug\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n*L\n131#1:242,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class d1<D extends g0> {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public g1 f16290a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16291b;

    /* loaded from: classes.dex */
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @w3.e(w3.a.RUNTIME)
    @w3.f(allowedTargets = {w3.b.ANNOTATION_CLASS, w3.b.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.l<t, t> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ d1<D> f16292l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ u0 f16293m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ a f16294n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d1<D> d1Var, u0 u0Var, a aVar) {
            super(1);
            this.f16292l = d1Var;
            this.f16293m = u0Var;
            this.f16294n = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final t O(@n6.d t tVar) {
            g0 d7;
            u4.l0.p(tVar, "backStackEntry");
            g0 e7 = tVar.e();
            if (!(e7 instanceof g0)) {
                e7 = null;
            }
            if (e7 != null && (d7 = this.f16292l.d(e7, tVar.c(), this.f16293m, this.f16294n)) != null) {
                return u4.l0.g(d7, e7) ? tVar : this.f16292l.b().a(d7, d7.g(tVar.c()));
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.l<v0, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final d f16295l = new d();

        public d() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(v0 v0Var) {
            b(v0Var);
            return m2.f17815a;
        }

        public final void b(@n6.d v0 v0Var) {
            u4.l0.p(v0Var, "$this$navOptions");
            v0Var.m(true);
        }
    }

    @n6.d
    public abstract D a();

    @n6.d
    public final g1 b() {
        g1 g1Var = this.f16290a;
        if (g1Var != null) {
            return g1Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean c() {
        return this.f16291b;
    }

    @n6.e
    public g0 d(@n6.d D d7, @n6.e Bundle bundle, @n6.e u0 u0Var, @n6.e a aVar) {
        u4.l0.p(d7, "destination");
        return d7;
    }

    public void e(@n6.d List<t> list, @n6.e u0 u0Var, @n6.e a aVar) {
        u4.l0.p(list, "entries");
        Iterator it = f5.u.v0(f5.u.k1(x3.e0.v1(list), new c(this, u0Var, aVar))).iterator();
        while (it.hasNext()) {
            b().k((t) it.next());
        }
    }

    @d.i
    public void f(@n6.d g1 g1Var) {
        u4.l0.p(g1Var, "state");
        this.f16290a = g1Var;
        this.f16291b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(@n6.d t tVar) {
        u4.l0.p(tVar, "backStackEntry");
        g0 e7 = tVar.e();
        if (!(e7 instanceof g0)) {
            e7 = null;
        }
        if (e7 == null) {
            return;
        }
        d(e7, null, w0.a(d.f16295l), null);
        b().f(tVar);
    }

    public void h(@n6.d Bundle bundle) {
        u4.l0.p(bundle, "savedState");
    }

    @n6.e
    public Bundle i() {
        return null;
    }

    public void j(@n6.d t tVar, boolean z6) {
        u4.l0.p(tVar, "popUpTo");
        List<t> value = b().b().getValue();
        if (!value.contains(tVar)) {
            throw new IllegalStateException(("popBackStack was called with " + tVar + " which does not exist in back stack " + value).toString());
        }
        ListIterator<t> listIterator = value.listIterator(value.size());
        t tVar2 = null;
        while (k()) {
            tVar2 = listIterator.previous();
            if (u4.l0.g(tVar2, tVar)) {
                break;
            }
        }
        if (tVar2 != null) {
            b().h(tVar2, z6);
        }
    }

    public boolean k() {
        return true;
    }
}
