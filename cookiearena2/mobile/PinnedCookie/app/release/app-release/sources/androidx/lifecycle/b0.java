package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.p;
import d.l1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class b0 extends p {
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public static final a f4687j = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4688b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public m.a<y, b> f4689c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public p.b f4690d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<z> f4691e;

    /* renamed from: f  reason: collision with root package name */
    public int f4692f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4693g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4694h;
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<p.b> f4695i;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        @l1
        public final b0 a(@n6.d z zVar) {
            u4.l0.p(zVar, "owner");
            return new b0(zVar, false, null);
        }

        @n6.d
        @s4.m
        public final p.b b(@n6.d p.b bVar, @n6.e p.b bVar2) {
            u4.l0.p(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public p.b f4696a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public v f4697b;

        public b(@n6.e y yVar, @n6.d p.b bVar) {
            u4.l0.p(bVar, "initialState");
            u4.l0.m(yVar);
            this.f4697b = d0.f(yVar);
            this.f4696a = bVar;
        }

        public final void a(@n6.e z zVar, @n6.d p.a aVar) {
            u4.l0.p(aVar, i0.k0.I0);
            p.b h7 = aVar.h();
            this.f4696a = b0.f4687j.b(this.f4696a, h7);
            v vVar = this.f4697b;
            u4.l0.m(zVar);
            vVar.d(zVar, aVar);
            this.f4696a = h7;
        }

        @n6.d
        public final v b() {
            return this.f4697b;
        }

        @n6.d
        public final p.b c() {
            return this.f4696a;
        }

        public final void d(@n6.d v vVar) {
            u4.l0.p(vVar, "<set-?>");
            this.f4697b = vVar;
        }

        public final void e(@n6.d p.b bVar) {
            u4.l0.p(bVar, "<set-?>");
            this.f4696a = bVar;
        }
    }

    public /* synthetic */ b0(z zVar, boolean z6, u4.w wVar) {
        this(zVar, z6);
    }

    @n6.d
    @s4.m
    @l1
    public static final b0 h(@n6.d z zVar) {
        return f4687j.a(zVar);
    }

    @n6.d
    @s4.m
    public static final p.b o(@n6.d p.b bVar, @n6.e p.b bVar2) {
        return f4687j.b(bVar, bVar2);
    }

    @Override // androidx.lifecycle.p
    public void a(@n6.d y yVar) {
        z zVar;
        u4.l0.p(yVar, "observer");
        i("addObserver");
        p.b bVar = this.f4690d;
        p.b bVar2 = p.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = p.b.INITIALIZED;
        }
        b bVar3 = new b(yVar, bVar2);
        if (this.f4689c.h(yVar, bVar3) == null && (zVar = this.f4691e.get()) != null) {
            boolean z6 = this.f4692f != 0 || this.f4693g;
            p.b g7 = g(yVar);
            this.f4692f++;
            while (bVar3.c().compareTo(g7) < 0 && this.f4689c.contains(yVar)) {
                r(bVar3.c());
                p.a c7 = p.a.Companion.c(bVar3.c());
                if (c7 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.c());
                }
                bVar3.a(zVar, c7);
                q();
                g7 = g(yVar);
            }
            if (!z6) {
                t();
            }
            this.f4692f--;
        }
    }

    @Override // androidx.lifecycle.p
    @n6.d
    public p.b b() {
        return this.f4690d;
    }

    @Override // androidx.lifecycle.p
    public void d(@n6.d y yVar) {
        u4.l0.p(yVar, "observer");
        i("removeObserver");
        this.f4689c.i(yVar);
    }

    public final void f(z zVar) {
        Iterator<Map.Entry<y, b>> a7 = this.f4689c.a();
        u4.l0.o(a7, "observerMap.descendingIterator()");
        while (a7.hasNext() && !this.f4694h) {
            Map.Entry<y, b> next = a7.next();
            u4.l0.o(next, "next()");
            y key = next.getKey();
            b value = next.getValue();
            while (value.c().compareTo(this.f4690d) > 0 && !this.f4694h && this.f4689c.contains(key)) {
                p.a a8 = p.a.Companion.a(value.c());
                if (a8 == null) {
                    throw new IllegalStateException("no event down from " + value.c());
                }
                r(a8.h());
                value.a(zVar, a8);
                q();
            }
        }
    }

    public final p.b g(y yVar) {
        b value;
        Map.Entry<y, b> j7 = this.f4689c.j(yVar);
        p.b bVar = null;
        p.b c7 = (j7 == null || (value = j7.getValue()) == null) ? null : value.c();
        if ((!this.f4695i.isEmpty()) != false) {
            bVar = this.f4695i.get(r0.size() - 1);
        }
        a aVar = f4687j;
        return aVar.b(aVar.b(this.f4690d, c7), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void i(String str) {
        if (!this.f4688b || l.c.h().c()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void j(z zVar) {
        m.b<y, b>.d e7 = this.f4689c.e();
        u4.l0.o(e7, "observerMap.iteratorWithAdditions()");
        while (e7.hasNext() && !this.f4694h) {
            Map.Entry next = e7.next();
            y yVar = (y) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.c().compareTo(this.f4690d) < 0 && !this.f4694h && this.f4689c.contains(yVar)) {
                r(bVar.c());
                p.a c7 = p.a.Companion.c(bVar.c());
                if (c7 == null) {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
                bVar.a(zVar, c7);
                q();
            }
        }
    }

    public int k() {
        i("getObserverCount");
        return this.f4689c.size();
    }

    public void l(@n6.d p.a aVar) {
        u4.l0.p(aVar, i0.k0.I0);
        i("handleLifecycleEvent");
        p(aVar.h());
    }

    public final boolean m() {
        if (this.f4689c.size() == 0) {
            return true;
        }
        Map.Entry<y, b> b7 = this.f4689c.b();
        u4.l0.m(b7);
        p.b c7 = b7.getValue().c();
        Map.Entry<y, b> f7 = this.f4689c.f();
        u4.l0.m(f7);
        p.b c8 = f7.getValue().c();
        return c7 == c8 && this.f4690d == c8;
    }

    @d.l0
    @v3.k(message = "Override [currentState].")
    public void n(@n6.d p.b bVar) {
        u4.l0.p(bVar, "state");
        i("markState");
        s(bVar);
    }

    public final void p(p.b bVar) {
        p.b bVar2 = this.f4690d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == p.b.INITIALIZED && bVar == p.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f4690d + " in component " + this.f4691e.get()).toString());
        }
        this.f4690d = bVar;
        if (this.f4693g || this.f4692f != 0) {
            this.f4694h = true;
            return;
        }
        this.f4693g = true;
        t();
        this.f4693g = false;
        if (this.f4690d == p.b.DESTROYED) {
            this.f4689c = new m.a<>();
        }
    }

    public final void q() {
        this.f4695i.remove(r0.size() - 1);
    }

    public final void r(p.b bVar) {
        this.f4695i.add(bVar);
    }

    public void s(@n6.d p.b bVar) {
        u4.l0.p(bVar, "state");
        i("setCurrentState");
        p(bVar);
    }

    public final void t() {
        z zVar = this.f4691e.get();
        if (zVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m()) {
            this.f4694h = false;
            p.b bVar = this.f4690d;
            Map.Entry<y, b> b7 = this.f4689c.b();
            u4.l0.m(b7);
            if (bVar.compareTo(b7.getValue().c()) < 0) {
                f(zVar);
            }
            Map.Entry<y, b> f7 = this.f4689c.f();
            if (!this.f4694h && f7 != null && this.f4690d.compareTo(f7.getValue().c()) > 0) {
                j(zVar);
            }
        }
        this.f4694h = false;
    }

    public b0(z zVar, boolean z6) {
        this.f4688b = z6;
        this.f4689c = new m.a<>();
        this.f4690d = p.b.INITIALIZED;
        this.f4695i = new ArrayList<>();
        this.f4691e = new WeakReference<>(zVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(@n6.d z zVar) {
        this(zVar, true);
        u4.l0.p(zVar, "provider");
    }
}
