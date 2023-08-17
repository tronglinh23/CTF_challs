package n5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.e3;
import kotlinx.coroutines.internal.r0;
import n5.i;
import u4.u1;
import v3.b1;
import v3.m2;
@e3
/* loaded from: classes.dex */
public final class z<E> implements i<E> {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14215l;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14216m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14217n;
    @n6.d
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    public static final r0 f14219p;
    @n6.d
    @Deprecated

    /* renamed from: q  reason: collision with root package name */
    public static final c<Object> f14220q;
    @n6.d
    private volatile /* synthetic */ Object _state;
    @n6.d
    private volatile /* synthetic */ int _updating;
    @n6.d
    private volatile /* synthetic */ Object onCloseHandler;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final b f14214k = new b(null);
    @n6.d
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final a f14218o = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        @s4.e
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f14221a;

        public a(@n6.e Throwable th) {
            this.f14221a = th;
        }

        @n6.d
        public final Throwable a() {
            Throwable th = this.f14221a;
            return th == null ? new y(s.f13998a) : th;
        }

        @n6.d
        public final Throwable b() {
            Throwable th = this.f14221a;
            return th == null ? new IllegalStateException(s.f13998a) : th;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c<E> {
        @s4.e
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public final Object f14222a;
        @s4.e
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public final d<E>[] f14223b;

        public c(@n6.e Object obj, @n6.e d<E>[] dVarArr) {
            this.f14222a = obj;
            this.f14223b = dVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<E> extends a0<E> implements i0<E> {
        @n6.d

        /* renamed from: p  reason: collision with root package name */
        public final z<E> f14224p;

        public d(@n6.d z<E> zVar) {
            super(null);
            this.f14224p = zVar;
        }

        @Override // n5.a0, n5.c
        @n6.d
        public Object H(E e7) {
            return super.H(e7);
        }

        @Override // n5.a0, n5.a
        public void k0(boolean z6) {
            if (z6) {
                this.f14224p.e(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements kotlinx.coroutines.selects.e<E, m0<? super E>> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ z<E> f14225k;

        public e(z<E> zVar) {
            this.f14225k = zVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void H(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, E e7, @n6.d t4.p<? super m0<? super E>, ? super e4.d<? super R>, ? extends Object> pVar) {
            this.f14225k.n(fVar, e7, pVar);
        }
    }

    static {
        r0 r0Var = new r0("UNDEFINED");
        f14219p = r0Var;
        f14220q = new c<>(r0Var, null);
        f14215l = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_state");
        f14216m = AtomicIntegerFieldUpdater.newUpdater(z.class, "_updating");
        f14217n = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "onCloseHandler");
    }

    public z() {
        this._state = f14220q;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public static /* synthetic */ void h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n5.i
    @n6.d
    public i0<E> B() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.b(((a) obj).f14221a);
                return dVar;
            } else if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            } else {
                cVar = (c) obj;
                Object obj2 = cVar.f14222a;
                if (obj2 != f14219p) {
                    dVar.H(obj2);
                }
            }
        } while (!p.b.a(f14215l, this, obj, new c(cVar.f14222a, d(cVar.f14223b, dVar))));
        return dVar;
    }

    @Override // n5.m0
    @n6.d
    public Object V(E e7) {
        a l7 = l(e7);
        return l7 != null ? r.f13994b.a(l7.a()) : r.f13994b.c(m2.f17815a);
    }

    @Override // n5.m0
    public boolean W() {
        return this._state instanceof a;
    }

    @Override // n5.m0
    public void a0(@n6.d t4.l<? super Throwable, m2> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14217n;
        if (p.b.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            Object obj = this._state;
            if ((obj instanceof a) && p.b.a(atomicReferenceFieldUpdater, this, lVar, n5.b.f13906h)) {
                lVar.O(((a) obj).f14221a);
                return;
            }
            return;
        }
        Object obj2 = this.onCloseHandler;
        if (obj2 == n5.b.f13906h) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj2);
    }

    public final d<E>[] d(d<E>[] dVarArr, d<E> dVar) {
        return dVarArr == null ? new d[]{dVar} : (d[]) x3.o.X3(dVarArr, dVar);
    }

    public final void e(d<E> dVar) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
            c cVar = (c) obj;
            obj2 = cVar.f14222a;
            dVarArr = cVar.f14223b;
            u4.l0.m(dVarArr);
        } while (!p.b.a(f14215l, this, obj, new c(obj2, o(dVarArr, dVar))));
    }

    @Override // n5.i
    public void f(@n6.e CancellationException cancellationException) {
        b(cancellationException);
    }

    public final E g() {
        Object obj = this._state;
        if (obj instanceof a) {
            throw ((a) obj).b();
        }
        if (obj instanceof c) {
            E e7 = (E) ((c) obj).f14222a;
            if (e7 != f14219p) {
                return e7;
            }
            throw new IllegalStateException("No value");
        }
        throw new IllegalStateException(("Invalid state " + obj).toString());
    }

    @n6.e
    public final E i() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (!(obj instanceof c)) {
            throw new IllegalStateException(("Invalid state " + obj).toString());
        }
        r0 r0Var = f14219p;
        E e7 = (E) ((c) obj).f14222a;
        if (e7 == r0Var) {
            return null;
        }
        return e7;
    }

    @Override // n5.m0
    @n6.d
    public kotlinx.coroutines.selects.e<E, m0<E>> j() {
        return new e(this);
    }

    public final void k(Throwable th) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (r0Var = n5.b.f13906h) || !p.b.a(f14217n, this, obj, r0Var)) {
            return;
        }
        ((t4.l) u1.q(obj, 1)).O(th);
    }

    public final a l(E e7) {
        Object obj;
        if (!f14216m.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof a) {
                    return (a) obj;
                }
                if (!(obj instanceof c)) {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!p.b.a(f14215l, this, obj, new c(e7, ((c) obj).f14223b)));
        d<E>[] dVarArr = ((c) obj).f14223b;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.H(e7);
            }
        }
        return null;
    }

    public final <R> void n(kotlinx.coroutines.selects.f<? super R> fVar, E e7, t4.p<? super m0<? super E>, ? super e4.d<? super R>, ? extends Object> pVar) {
        if (fVar.S()) {
            a l7 = l(e7);
            if (l7 != null) {
                fVar.H(l7.a());
            } else {
                q5.b.d(pVar, this, fVar.h());
            }
        }
    }

    public final d<E>[] o(d<E>[] dVarArr, d<E> dVar) {
        int length = dVarArr.length;
        int jg = x3.p.jg(dVarArr, dVar);
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr2 = new d[length - 1];
        x3.o.l1(dVarArr, dVarArr2, 0, 0, jg, 6, null);
        x3.o.l1(dVarArr, dVarArr2, jg, jg + 1, 0, 8, null);
        return dVarArr2;
    }

    @Override // n5.m0
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean s(E e7) {
        return i.a.c(this, e7);
    }

    @Override // n5.i
    /* renamed from: w  reason: merged with bridge method [inline-methods] */
    public boolean b(@n6.e Throwable th) {
        Object obj;
        int i7;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!p.b.a(f14215l, this, obj, th == null ? f14218o : new a(th)));
        d<E>[] dVarArr = ((c) obj).f14223b;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.b(th);
            }
        }
        k(th);
        return true;
    }

    @Override // n5.m0
    @n6.e
    public Object z(E e7, @n6.d e4.d<? super m2> dVar) {
        a l7 = l(e7);
        if (l7 == null) {
            if (g4.d.h() == null) {
                return null;
            }
            return m2.f17815a;
        }
        throw l7.a();
    }

    public z(E e7) {
        this();
        f14215l.lazySet(this, new c(e7, null));
    }
}
