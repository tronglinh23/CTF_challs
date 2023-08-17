package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v3.d1;
/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11953b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final c1<T>[] f11954a;
    @n6.d
    volatile /* synthetic */ int notCompletedCount;

    /* loaded from: classes.dex */
    public final class a extends u2 {
        @n6.d
        private volatile /* synthetic */ Object _disposer = null;
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public final q<List<? extends T>> f11955o;

        /* renamed from: p  reason: collision with root package name */
        public p1 f11956p;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@n6.d q<? super List<? extends T>> qVar) {
            this.f11955o = qVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
            X0(th);
            return v3.m2.f17815a;
        }

        @Override // kotlinx.coroutines.g0
        public void X0(@n6.e Throwable th) {
            if (th != null) {
                Object r02 = this.f11955o.r0(th);
                if (r02 != null) {
                    this.f11955o.t0(r02);
                    e<T>.b a12 = a1();
                    if (a12 != null) {
                        a12.d();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f11953b.decrementAndGet(e.this) == 0) {
                q<List<? extends T>> qVar = this.f11955o;
                c1[] c1VarArr = e.this.f11954a;
                ArrayList arrayList = new ArrayList(c1VarArr.length);
                for (c1 c1Var : c1VarArr) {
                    arrayList.add(c1Var.u());
                }
                d1.a aVar = v3.d1.f17778l;
                qVar.D(v3.d1.b(arrayList));
            }
        }

        @n6.e
        public final e<T>.b a1() {
            return (b) this._disposer;
        }

        @n6.d
        public final p1 b1() {
            p1 p1Var = this.f11956p;
            if (p1Var != null) {
                return p1Var;
            }
            u4.l0.S("handle");
            return null;
        }

        public final void c1(@n6.e e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void d1(@n6.d p1 p1Var) {
            this.f11956p = p1Var;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends o {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final e<T>.a[] f11958k;

        public b(@n6.d e<T>.a[] aVarArr) {
            this.f11958k = aVarArr;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
            b(th);
            return v3.m2.f17815a;
        }

        @Override // kotlinx.coroutines.p
        public void b(@n6.e Throwable th) {
            d();
        }

        public final void d() {
            for (e<T>.a aVar : this.f11958k) {
                aVar.b1().j();
            }
        }

        @n6.d
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f11958k + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@n6.d c1<? extends T>[] c1VarArr) {
        this.f11954a = c1VarArr;
        this.notCompletedCount = c1VarArr.length;
    }

    @n6.e
    public final Object b(@n6.d e4.d<? super List<? extends T>> dVar) {
        r rVar = new r(g4.c.d(dVar), 1);
        rVar.x();
        int length = this.f11954a.length;
        a[] aVarArr = new a[length];
        for (int i7 = 0; i7 < length; i7++) {
            c1 c1Var = this.f11954a[i7];
            c1Var.start();
            a aVar = new a(rVar);
            aVar.d1(c1Var.X(aVar));
            v3.m2 m2Var = v3.m2.f17815a;
            aVarArr[i7] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i8 = 0; i8 < length; i8++) {
            aVarArr[i8].c1(bVar);
        }
        if (rVar.l()) {
            bVar.d();
        } else {
            rVar.N(bVar);
        }
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A;
    }
}
