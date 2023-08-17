package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlin.Metadata;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.t2;
import v3.m2;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "Lv3/m2;", "l", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/p$a;", i0.k0.I0, androidx.appcompat.widget.d.f1513o, "Landroidx/lifecycle/p;", "k", "Landroidx/lifecycle/p;", "h", "()Landroidx/lifecycle/p;", "lifecycle", "Le4/g;", "Le4/g;", "I", "()Le4/g;", "coroutineContext", "<init>", "(Landroidx/lifecycle/p;Le4/g;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends s implements v {
    @n6.d

    /* renamed from: k  reason: collision with root package name and from kotlin metadata */
    public final p lifecycle;
    @n6.d

    /* renamed from: l  reason: collision with root package name and from kotlin metadata */
    public final e4.g coroutineContext;

    @h4.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f4607o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f4608p;

        public a(e4.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f4608p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f4607o == 0) {
                v3.e1.n(obj);
                kotlinx.coroutines.u0 u0Var = (kotlinx.coroutines.u0) this.f4608p;
                if (LifecycleCoroutineScopeImpl.this.getLifecycle().b().compareTo(p.b.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.getLifecycle().a(LifecycleCoroutineScopeImpl.this);
                } else {
                    t2.i(u0Var.getCoroutineContext(), null, 1, null);
                }
                return m2.f17815a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    public LifecycleCoroutineScopeImpl(@n6.d p pVar, @n6.d e4.g gVar) {
        u4.l0.p(pVar, "lifecycle");
        u4.l0.p(gVar, "coroutineContext");
        this.lifecycle = pVar;
        this.coroutineContext = gVar;
        if (getLifecycle().b() == p.b.DESTROYED) {
            t2.i(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.u0
    @n6.d
    /* renamed from: I  reason: from getter */
    public e4.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.v
    public void d(@n6.d z zVar, @n6.d p.a aVar) {
        u4.l0.p(zVar, "source");
        u4.l0.p(aVar, i0.k0.I0);
        if (getLifecycle().b().compareTo(p.b.DESTROYED) <= 0) {
            getLifecycle().d(this);
            t2.i(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.s
    @n6.d
    /* renamed from: h  reason: from getter */
    public p getLifecycle() {
        return this.lifecycle;
    }

    public final void l() {
        kotlinx.coroutines.j.e(this, m1.e().c1(), null, new a(null), 2, null);
    }
}
