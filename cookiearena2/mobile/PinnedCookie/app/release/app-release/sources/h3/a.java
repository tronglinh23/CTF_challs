package h3;

import android.app.Activity;
import androidx.window.layout.g;
import androidx.window.layout.l;
import androidx.window.layout.s;
import androidx.window.layout.w;
import h4.f;
import h4.o;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import n6.d;
import n6.e;
import t4.p;
import u4.l0;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class a {
    @d

    /* renamed from: a  reason: collision with root package name */
    public final s f10255a;
    @d

    /* renamed from: b  reason: collision with root package name */
    public final Executor f10256b;
    @e

    /* renamed from: c  reason: collision with root package name */
    public n2 f10257c;
    @e

    /* renamed from: d  reason: collision with root package name */
    public InterfaceC0117a f10258d;

    /* renamed from: h3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0117a {
        void a(@d l lVar);
    }

    @f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {androidx.constraintlayout.widget.e.Q1}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends o implements p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f10259o;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ Activity f10261q;

        /* renamed from: h3.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0118a implements j<l> {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ a f10262k;

            public C0118a(a aVar) {
                this.f10262k = aVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @e
            public Object f(l lVar, @d e4.d<? super m2> dVar) {
                m2 m2Var;
                l lVar2 = lVar;
                InterfaceC0117a interfaceC0117a = this.f10262k.f10258d;
                if (interfaceC0117a == null) {
                    m2Var = null;
                } else {
                    interfaceC0117a.a(lVar2);
                    m2Var = m2.f17815a;
                }
                return m2Var == g4.d.h() ? m2Var : m2.f17815a;
            }
        }

        /* renamed from: h3.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0119b implements i<l> {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ i f10263k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ a f10264l;

            /* renamed from: h3.a$b$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0120a implements j<w> {

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ j f10265k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ a f10266l;

                @f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                /* renamed from: h3.a$b$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0121a extends h4.d {

                    /* renamed from: n  reason: collision with root package name */
                    public /* synthetic */ Object f10267n;

                    /* renamed from: o  reason: collision with root package name */
                    public int f10268o;

                    /* renamed from: p  reason: collision with root package name */
                    public Object f10269p;

                    public C0121a(e4.d dVar) {
                        super(dVar);
                    }

                    @Override // h4.a
                    @e
                    public final Object Q(@d Object obj) {
                        this.f10267n = obj;
                        this.f10268o |= Integer.MIN_VALUE;
                        return C0120a.this.f(null, this);
                    }
                }

                public C0120a(j jVar, a aVar) {
                    this.f10265k = jVar;
                    this.f10266l = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.j
                @n6.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object f(androidx.window.layout.w r5, @n6.d e4.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof h3.a.b.C0119b.C0120a.C0121a
                        if (r0 == 0) goto L13
                        r0 = r6
                        h3.a$b$b$a$a r0 = (h3.a.b.C0119b.C0120a.C0121a) r0
                        int r1 = r0.f10268o
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10268o = r1
                        goto L18
                    L13:
                        h3.a$b$b$a$a r0 = new h3.a$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f10267n
                        java.lang.Object r1 = g4.d.h()
                        int r2 = r0.f10268o
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        v3.e1.n(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        v3.e1.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f10265k
                        androidx.window.layout.w r5 = (androidx.window.layout.w) r5
                        h3.a r2 = r4.f10266l
                        androidx.window.layout.l r5 = h3.a.a(r2, r5)
                        if (r5 != 0) goto L41
                        goto L4a
                    L41:
                        r0.f10268o = r3
                        java.lang.Object r5 = r6.f(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        v3.m2 r5 = v3.m2.f17815a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: h3.a.b.C0119b.C0120a.f(java.lang.Object, e4.d):java.lang.Object");
                }
            }

            public C0119b(i iVar, a aVar) {
                this.f10263k = iVar;
                this.f10264l = aVar;
            }

            @Override // kotlinx.coroutines.flow.i
            @e
            public Object a(@d j<? super l> jVar, @d e4.d dVar) {
                Object a7 = this.f10263k.a(new C0120a(jVar, this.f10264l), dVar);
                return a7 == g4.d.h() ? a7 : m2.f17815a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f10261q = activity;
        }

        @Override // h4.a
        @d
        public final e4.d<m2> H(@e Object obj, @d e4.d<?> dVar) {
            return new b(this.f10261q, dVar);
        }

        @Override // h4.a
        @e
        public final Object Q(@d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f10259o;
            if (i7 == 0) {
                e1.n(obj);
                i g02 = k.g0(new C0119b(a.this.f10255a.c(this.f10261q), a.this));
                C0118a c0118a = new C0118a(a.this);
                this.f10259o = 1;
                if (g02.a(c0118a, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@d u0 u0Var, @e e4.d<? super m2> dVar) {
            return ((b) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    public a(@d s sVar, @d Executor executor) {
        l0.p(sVar, "windowInfoTracker");
        l0.p(executor, "executor");
        this.f10255a = sVar;
        this.f10256b = executor;
    }

    public final l d(w wVar) {
        Object obj;
        Iterator<T> it = wVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g) obj) instanceof l) {
                break;
            }
        }
        if (obj instanceof l) {
            return (l) obj;
        }
        return null;
    }

    public final void e(@d Activity activity) {
        n2 f7;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        n2 n2Var = this.f10257c;
        if (n2Var != null) {
            n2.a.b(n2Var, null, 1, null);
        }
        f7 = kotlinx.coroutines.l.f(v0.a(b2.c(this.f10256b)), null, null, new b(activity, null), 3, null);
        this.f10257c = f7;
    }

    public final void f(@d InterfaceC0117a interfaceC0117a) {
        l0.p(interfaceC0117a, "onFoldingFeatureChangeListener");
        this.f10258d = interfaceC0117a;
    }

    public final void g() {
        n2 n2Var = this.f10257c;
        if (n2Var == null) {
            return;
        }
        n2.a.b(n2Var, null, 1, null);
    }
}
