package s2;

import android.os.Bundle;
import d.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import u4.r1;
import v3.m2;
import x3.l1;
import x3.m1;
@r1({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1747#2,3:231\n1747#2,3:234\n959#2,7:237\n1747#2,3:244\n2624#2,3:247\n533#2,6:250\n378#2,7:256\n451#2,6:263\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n85#1:231,3\n86#1:234,3\n114#1:237,7\n136#1:244,3\n137#1:247,3\n142#1:250,6\n169#1:256,7\n194#1:263,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class g1 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f16332a = new ReentrantLock(true);
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.coroutines.flow.e0<List<t>> f16333b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final kotlinx.coroutines.flow.e0<Set<t>> f16334c;
    @d.b1({b1.a.LIBRARY_GROUP})

    /* renamed from: d  reason: collision with root package name */
    public boolean f16335d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t0<List<t>> f16336e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t0<Set<t>> f16337f;

    public g1() {
        kotlinx.coroutines.flow.e0<List<t>> a7 = kotlinx.coroutines.flow.v0.a(x3.w.E());
        this.f16333b = a7;
        kotlinx.coroutines.flow.e0<Set<t>> a8 = kotlinx.coroutines.flow.v0.a(l1.k());
        this.f16334c = a8;
        this.f16336e = kotlinx.coroutines.flow.k.m(a7);
        this.f16337f = kotlinx.coroutines.flow.k.m(a8);
    }

    @n6.d
    public abstract t a(@n6.d g0 g0Var, @n6.e Bundle bundle);

    @n6.d
    public final kotlinx.coroutines.flow.t0<List<t>> b() {
        return this.f16336e;
    }

    @n6.d
    public final kotlinx.coroutines.flow.t0<Set<t>> c() {
        return this.f16337f;
    }

    public final boolean d() {
        return this.f16335d;
    }

    public void e(@n6.d t tVar) {
        u4.l0.p(tVar, "entry");
        kotlinx.coroutines.flow.e0<Set<t>> e0Var = this.f16334c;
        e0Var.setValue(m1.z(e0Var.getValue(), tVar));
    }

    @d.i
    public void f(@n6.d t tVar) {
        int i7;
        u4.l0.p(tVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f16332a;
        reentrantLock.lock();
        try {
            List<t> T5 = x3.e0.T5(this.f16336e.getValue());
            ListIterator<t> listIterator = T5.listIterator(T5.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i7 = -1;
                    break;
                } else if (u4.l0.g(listIterator.previous().f(), tVar.f())) {
                    i7 = listIterator.nextIndex();
                    break;
                }
            }
            T5.set(i7, tVar);
            this.f16333b.setValue(T5);
            m2 m2Var = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @d.i
    public void g(@n6.d t tVar) {
        u4.l0.p(tVar, "backStackEntry");
        List<t> value = this.f16336e.getValue();
        ListIterator<t> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            t previous = listIterator.previous();
            if (u4.l0.g(previous.f(), tVar.f())) {
                kotlinx.coroutines.flow.e0<Set<t>> e0Var = this.f16334c;
                e0Var.setValue(m1.E(m1.E(e0Var.getValue(), previous), tVar));
                f(tVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(@n6.d t tVar, boolean z6) {
        u4.l0.p(tVar, "popUpTo");
        ReentrantLock reentrantLock = this.f16332a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.e0<List<t>> e0Var = this.f16333b;
            List<t> value = e0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if ((!u4.l0.g((t) obj, tVar)) != true) {
                    break;
                }
                arrayList.add(obj);
            }
            e0Var.setValue(arrayList);
            m2 m2Var = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void i(@n6.d t tVar, boolean z6) {
        boolean z7;
        t tVar2;
        boolean z8;
        u4.l0.p(tVar, "popUpTo");
        Set<t> value = this.f16334c.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((t) it.next()) == tVar) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        if (z7) {
            List<t> value2 = this.f16336e.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (it2.hasNext()) {
                    if (((t) it2.next()) == tVar) {
                        z8 = false;
                        break;
                    }
                }
            }
            z8 = true;
            if (z8) {
                return;
            }
        }
        kotlinx.coroutines.flow.e0<Set<t>> e0Var = this.f16334c;
        e0Var.setValue(m1.E(e0Var.getValue(), tVar));
        List<t> value3 = this.f16336e.getValue();
        ListIterator<t> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                tVar2 = null;
                break;
            }
            tVar2 = listIterator.previous();
            t tVar3 = tVar2;
            if (!u4.l0.g(tVar3, tVar) && this.f16336e.getValue().lastIndexOf(tVar3) < this.f16336e.getValue().lastIndexOf(tVar)) {
                break;
            }
        }
        t tVar4 = tVar2;
        if (tVar4 != null) {
            kotlinx.coroutines.flow.e0<Set<t>> e0Var2 = this.f16334c;
            e0Var2.setValue(m1.E(e0Var2.getValue(), tVar4));
        }
        h(tVar, z6);
    }

    @d.i
    public void j(@n6.d t tVar) {
        u4.l0.p(tVar, "entry");
        kotlinx.coroutines.flow.e0<Set<t>> e0Var = this.f16334c;
        e0Var.setValue(m1.E(e0Var.getValue(), tVar));
    }

    public void k(@n6.d t tVar) {
        u4.l0.p(tVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f16332a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.e0<List<t>> e0Var = this.f16333b;
            e0Var.setValue(x3.e0.A4(e0Var.getValue(), tVar));
            m2 m2Var = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l(@n6.d t tVar) {
        boolean z6;
        u4.l0.p(tVar, "backStackEntry");
        Set<t> value = this.f16334c.getValue();
        boolean z7 = true;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((t) it.next()) == tVar) {
                    z6 = true;
                    break;
                }
            }
        }
        z6 = false;
        if (z6) {
            List<t> value2 = this.f16336e.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (it2.hasNext()) {
                    if (((t) it2.next()) == tVar) {
                        break;
                    }
                }
            }
            z7 = false;
            if (z7) {
                return;
            }
        }
        t tVar2 = (t) x3.e0.q3(this.f16336e.getValue());
        if (tVar2 != null) {
            kotlinx.coroutines.flow.e0<Set<t>> e0Var = this.f16334c;
            e0Var.setValue(m1.E(e0Var.getValue(), tVar2));
        }
        kotlinx.coroutines.flow.e0<Set<t>> e0Var2 = this.f16334c;
        e0Var2.setValue(m1.E(e0Var2.getValue(), tVar));
        k(tVar);
    }

    public final void m(boolean z6) {
        this.f16335d = z6;
    }
}
