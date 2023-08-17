package u3;

import android.app.Activity;
import d.b0;
import d.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import u3.k;
import u3.l;
import u3.p;
import u4.l0;
import v3.m2;

@t3.d
/* loaded from: classes.dex */
public final class p implements j {
    @n6.e

    /* renamed from: f */
    public static volatile p f17341f = null;
    @n6.d

    /* renamed from: h */
    public static final String f17343h = "EmbeddingBackend";
    @b0("globalLock")
    @n6.e
    @l1

    /* renamed from: a */
    public l f17344a;
    @n6.d

    /* renamed from: b */
    public final CopyOnWriteArrayList<c> f17345b;
    @n6.d

    /* renamed from: c */
    public final b f17346c;
    @n6.d

    /* renamed from: d */
    public final CopyOnWriteArraySet<m> f17347d;
    @n6.d

    /* renamed from: e */
    public static final a f17340e = new a(null);
    @n6.d

    /* renamed from: g */
    public static final ReentrantLock f17342g = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final p a() {
            if (p.f17341f == null) {
                ReentrantLock reentrantLock = p.f17342g;
                reentrantLock.lock();
                try {
                    if (p.f17341f == null) {
                        p.f17341f = new p(p.f17340e.b());
                    }
                    m2 m2Var = m2.f17815a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            p pVar = p.f17341f;
            l0.m(pVar);
            return pVar;
        }

        public final l b() {
            try {
                k.a aVar = k.f17333c;
                if (c(aVar.b()) && aVar.c()) {
                    return new k();
                }
                return null;
            } catch (Throwable th) {
                l0.C("Failed to load embedding extension: ", th);
                return null;
            }
        }

        @l1
        public final boolean c(@n6.e Integer num) {
            return num != null && num.intValue() >= 1;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public final class b implements l.a {
        @n6.e

        /* renamed from: a */
        public List<t> f17348a;

        /* renamed from: b */
        public final /* synthetic */ p f17349b;

        public b(p pVar) {
            l0.p(pVar, "this$0");
            this.f17349b = pVar;
        }

        @Override // u3.l.a
        public void a(@n6.d List<t> list) {
            l0.p(list, "splitInfo");
            this.f17348a = list;
            Iterator<c> it = this.f17349b.l().iterator();
            while (it.hasNext()) {
                it.next().b(list);
            }
        }

        @n6.e
        public final List<t> b() {
            return this.f17348a;
        }

        public final void c(@n6.e List<t> list) {
            this.f17348a = list;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        @n6.d

        /* renamed from: a */
        public final Activity f17350a;
        @n6.d

        /* renamed from: b */
        public final Executor f17351b;
        @n6.d

        /* renamed from: c */
        public final g1.e<List<t>> f17352c;
        @n6.e

        /* renamed from: d */
        public List<t> f17353d;

        public c(@n6.d Activity activity, @n6.d Executor executor, @n6.d g1.e<List<t>> eVar) {
            l0.p(activity, androidx.appcompat.widget.d.f1516r);
            l0.p(executor, "executor");
            l0.p(eVar, "callback");
            this.f17350a = activity;
            this.f17351b = executor;
            this.f17352c = eVar;
        }

        public static /* synthetic */ void a(c cVar, List list) {
            c(cVar, list);
        }

        public static final void c(c cVar, List list) {
            l0.p(cVar, "this$0");
            l0.p(list, "$splitsWithActivity");
            cVar.f17352c.accept(list);
        }

        public final void b(@n6.d List<t> list) {
            l0.p(list, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((t) obj).a(this.f17350a)) {
                    arrayList.add(obj);
                }
            }
            if (l0.g(arrayList, this.f17353d)) {
                return;
            }
            this.f17353d = arrayList;
            this.f17351b.execute(new Runnable() { // from class: u3.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.c.a(p.c.this, arrayList);
                }
            });
        }

        @n6.d
        public final g1.e<List<t>> d() {
            return this.f17352c;
        }
    }

    @l1
    public p(@n6.e l lVar) {
        this.f17344a = lVar;
        b bVar = new b(this);
        this.f17346c = bVar;
        this.f17345b = new CopyOnWriteArrayList<>();
        l lVar2 = this.f17344a;
        if (lVar2 != null) {
            lVar2.b(bVar);
        }
        this.f17347d = new CopyOnWriteArraySet<>();
    }

    @l1
    public static /* synthetic */ void m() {
    }

    @Override // u3.j
    public void a(@n6.d Set<? extends m> set) {
        l0.p(set, "rules");
        this.f17347d.clear();
        this.f17347d.addAll(set);
        l lVar = this.f17344a;
        if (lVar == null) {
            return;
        }
        lVar.a(this.f17347d);
    }

    @Override // u3.j
    public void b(@n6.d m mVar) {
        l0.p(mVar, "rule");
        if (this.f17347d.contains(mVar)) {
            this.f17347d.remove(mVar);
            l lVar = this.f17344a;
            if (lVar == null) {
                return;
            }
            lVar.a(this.f17347d);
        }
    }

    @Override // u3.j
    public void c(@n6.d Activity activity, @n6.d Executor executor, @n6.d g1.e<List<t>> eVar) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(executor, "executor");
        l0.p(eVar, "callback");
        ReentrantLock reentrantLock = f17342g;
        reentrantLock.lock();
        try {
            if (k() == null) {
                eVar.accept(x3.w.E());
                return;
            }
            c cVar = new c(activity, executor, eVar);
            l().add(cVar);
            if (this.f17346c.b() != null) {
                List<t> b7 = this.f17346c.b();
                l0.m(b7);
                cVar.b(b7);
            } else {
                cVar.b(x3.w.E());
            }
            m2 m2Var = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u3.j
    @n6.d
    public Set<m> d() {
        return this.f17347d;
    }

    @Override // u3.j
    public void e(@n6.d g1.e<List<t>> eVar) {
        l0.p(eVar, "consumer");
        ReentrantLock reentrantLock = f17342g;
        reentrantLock.lock();
        try {
            Iterator<c> it = l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                if (l0.g(next.d(), eVar)) {
                    l().remove(next);
                    break;
                }
            }
            m2 m2Var = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // u3.j
    public void f(@n6.d m mVar) {
        l0.p(mVar, "rule");
        if (this.f17347d.contains(mVar)) {
            return;
        }
        this.f17347d.add(mVar);
        l lVar = this.f17344a;
        if (lVar == null) {
            return;
        }
        lVar.a(this.f17347d);
    }

    @Override // u3.j
    public boolean g() {
        return this.f17344a != null;
    }

    @n6.e
    public final l k() {
        return this.f17344a;
    }

    @n6.d
    public final CopyOnWriteArrayList<c> l() {
        return this.f17345b;
    }

    public final void n(@n6.e l lVar) {
        this.f17344a = lVar;
    }
}