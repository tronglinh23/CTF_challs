package s2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;
import d.b1;
import i0.x2;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import u4.r1;
@r1({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n1726#2,3:302\n1855#2,2:305\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n*L\n258#1:302,3\n266#1:305,2\n*E\n"})
/* loaded from: classes.dex */
public final class t implements androidx.lifecycle.z, androidx.lifecycle.f1, androidx.lifecycle.o, e3.d {
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final a f16429p = new a(null);
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final Context f16430b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public g0 f16431c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f16432d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public p.b f16433e;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public final z0 f16434f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final String f16435g;
    @n6.e

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f16436h;
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public androidx.lifecycle.b0 f16437i;
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public final e3.c f16438j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16439k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final v3.d0 f16440l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final v3.d0 f16441m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public p.b f16442n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final c1.b f16443o;

    @d.b1({b1.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public static /* synthetic */ t b(a aVar, Context context, g0 g0Var, Bundle bundle, p.b bVar, z0 z0Var, String str, Bundle bundle2, int i7, Object obj) {
            String str2;
            Bundle bundle3 = (i7 & 4) != 0 ? null : bundle;
            p.b bVar2 = (i7 & 8) != 0 ? p.b.CREATED : bVar;
            z0 z0Var2 = (i7 & 16) != 0 ? null : z0Var;
            if ((i7 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                u4.l0.o(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return aVar.a(context, g0Var, bundle3, bVar2, z0Var2, str2, (i7 & 64) != 0 ? null : bundle2);
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        public final t a(@n6.e Context context, @n6.d g0 g0Var, @n6.e Bundle bundle, @n6.d p.b bVar, @n6.e z0 z0Var, @n6.d String str, @n6.e Bundle bundle2) {
            u4.l0.p(g0Var, "destination");
            u4.l0.p(bVar, "hostLifecycleState");
            u4.l0.p(str, "id");
            return new t(context, g0Var, bundle, bVar, z0Var, str, bundle2, null);
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@n6.d e3.d dVar) {
            super(dVar, null);
            u4.l0.p(dVar, "owner");
        }

        @Override // androidx.lifecycle.a
        @n6.d
        public <T extends androidx.lifecycle.z0> T f(@n6.d String str, @n6.d Class<T> cls, @n6.d androidx.lifecycle.r0 r0Var) {
            u4.l0.p(str, x2.f10960j);
            u4.l0.p(cls, "modelClass");
            u4.l0.p(r0Var, "handle");
            return new c(r0Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends androidx.lifecycle.z0 {
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public final androidx.lifecycle.r0 f16444d;

        public c(@n6.d androidx.lifecycle.r0 r0Var) {
            u4.l0.p(r0Var, "handle");
            this.f16444d = r0Var;
        }

        @n6.d
        public final androidx.lifecycle.r0 h() {
            return this.f16444d;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.a<androidx.lifecycle.v0> {
        public d() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.v0 n() {
            Context context = t.this.f16430b;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            t tVar = t.this;
            return new androidx.lifecycle.v0(application, tVar, tVar.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends u4.n0 implements t4.a<androidx.lifecycle.r0> {
        public e() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.r0 n() {
            if (t.this.f16439k) {
                if (t.this.getLifecycle().b() != p.b.DESTROYED) {
                    return ((c) new androidx.lifecycle.c1(t.this, new b(t.this)).a(c.class)).h();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    public /* synthetic */ t(Context context, g0 g0Var, Bundle bundle, p.b bVar, z0 z0Var, String str, Bundle bundle2, u4.w wVar) {
        this(context, g0Var, bundle, bVar, z0Var, str, bundle2);
    }

    @n6.e
    public final Bundle c() {
        if (this.f16432d == null) {
            return null;
        }
        return new Bundle(this.f16432d);
    }

    public final androidx.lifecycle.v0 d() {
        return (androidx.lifecycle.v0) this.f16440l.getValue();
    }

    @n6.d
    public final g0 e() {
        return this.f16431c;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@n6.e java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L87
            boolean r1 = r7 instanceof s2.t
            if (r1 != 0) goto L9
            goto L87
        L9:
            java.lang.String r1 = r6.f16435g
            s2.t r7 = (s2.t) r7
            java.lang.String r2 = r7.f16435g
            boolean r1 = u4.l0.g(r1, r2)
            if (r1 == 0) goto L87
            s2.g0 r1 = r6.f16431c
            s2.g0 r2 = r7.f16431c
            boolean r1 = u4.l0.g(r1, r2)
            if (r1 == 0) goto L87
            androidx.lifecycle.p r1 = r6.getLifecycle()
            androidx.lifecycle.p r2 = r7.getLifecycle()
            boolean r1 = u4.l0.g(r1, r2)
            if (r1 == 0) goto L87
            androidx.savedstate.a r1 = r6.getSavedStateRegistry()
            androidx.savedstate.a r2 = r7.getSavedStateRegistry()
            boolean r1 = u4.l0.g(r1, r2)
            if (r1 == 0) goto L87
            android.os.Bundle r1 = r6.f16432d
            android.os.Bundle r2 = r7.f16432d
            boolean r1 = u4.l0.g(r1, r2)
            r2 = 1
            if (r1 != 0) goto L86
            android.os.Bundle r1 = r6.f16432d
            if (r1 == 0) goto L83
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L83
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L58
        L56:
            r7 = r2
            goto L7f
        L58:
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f16432d
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f16432d
            if (r5 == 0) goto L77
            java.lang.Object r3 = r5.get(r3)
            goto L78
        L77:
            r3 = 0
        L78:
            boolean r3 = u4.l0.g(r4, r3)
            if (r3 != 0) goto L5c
            r7 = r0
        L7f:
            if (r7 != r2) goto L83
            r7 = r2
            goto L84
        L83:
            r7 = r0
        L84:
            if (r7 == 0) goto L87
        L86:
            r0 = r2
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.t.equals(java.lang.Object):boolean");
    }

    @n6.d
    public final String f() {
        return this.f16435g;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final p.b g() {
        return this.f16442n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [k2.a, u4.w] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // androidx.lifecycle.o
    @n6.d
    public k2.a getDefaultViewModelCreationExtras() {
        k2.e eVar = new k2.e(r2, 1, r2);
        Context context = this.f16430b;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        r2 = applicationContext instanceof Application ? (Application) applicationContext : 0;
        if (r2 != 0) {
            eVar.c(c1.a.f4720i, r2);
        }
        eVar.c(androidx.lifecycle.s0.f4832c, this);
        eVar.c(androidx.lifecycle.s0.f4833d, this);
        Bundle c7 = c();
        if (c7 != null) {
            eVar.c(androidx.lifecycle.s0.f4834e, c7);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.o
    @n6.d
    public c1.b getDefaultViewModelProviderFactory() {
        return this.f16443o;
    }

    @Override // androidx.lifecycle.z
    @n6.d
    public androidx.lifecycle.p getLifecycle() {
        return this.f16437i;
    }

    @Override // e3.d
    @n6.d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.f16438j.b();
    }

    @Override // androidx.lifecycle.f1
    @n6.d
    public androidx.lifecycle.e1 getViewModelStore() {
        if (this.f16439k) {
            if (getLifecycle().b() != p.b.DESTROYED) {
                z0 z0Var = this.f16434f;
                if (z0Var != null) {
                    return z0Var.a(this.f16435g);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    @n6.d
    public final androidx.lifecycle.r0 h() {
        return (androidx.lifecycle.r0) this.f16441m.getValue();
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.f16435g.hashCode() * 31) + this.f16431c.hashCode();
        Bundle bundle = this.f16432d;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i7 = hashCode * 31;
                Object obj = this.f16432d.get((String) it.next());
                hashCode = i7 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void i(@n6.d p.a aVar) {
        u4.l0.p(aVar, i0.k0.I0);
        this.f16433e = aVar.h();
        m();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void j(@n6.d Bundle bundle) {
        u4.l0.p(bundle, "outBundle");
        this.f16438j.e(bundle);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void k(@n6.d g0 g0Var) {
        u4.l0.p(g0Var, "<set-?>");
        this.f16431c = g0Var;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void l(@n6.d p.b bVar) {
        u4.l0.p(bVar, "maxState");
        this.f16442n = bVar;
        m();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void m() {
        if (!this.f16439k) {
            this.f16438j.c();
            this.f16439k = true;
            if (this.f16434f != null) {
                androidx.lifecycle.s0.c(this);
            }
            this.f16438j.d(this.f16436h);
        }
        if (this.f16433e.ordinal() < this.f16442n.ordinal()) {
            this.f16437i.s(this.f16433e);
        } else {
            this.f16437i.s(this.f16442n);
        }
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t.class.getSimpleName());
        sb.append('(' + this.f16435g + ')');
        sb.append(" destination=");
        sb.append(this.f16431c);
        String sb2 = sb.toString();
        u4.l0.o(sb2, "sb.toString()");
        return sb2;
    }

    public t(Context context, g0 g0Var, Bundle bundle, p.b bVar, z0 z0Var, String str, Bundle bundle2) {
        this.f16430b = context;
        this.f16431c = g0Var;
        this.f16432d = bundle;
        this.f16433e = bVar;
        this.f16434f = z0Var;
        this.f16435g = str;
        this.f16436h = bundle2;
        this.f16437i = new androidx.lifecycle.b0(this);
        this.f16438j = e3.c.f8748d.a(this);
        this.f16440l = v3.f0.b(new d());
        this.f16441m = v3.f0.b(new e());
        this.f16442n = p.b.INITIALIZED;
        this.f16443o = d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ t(android.content.Context r11, s2.g0 r12, android.os.Bundle r13, androidx.lifecycle.p.b r14, s2.z0 r15, java.lang.String r16, android.os.Bundle r17, int r18, u4.w r19) {
        /*
            r10 = this;
            r0 = r18 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r13
        L8:
            r0 = r18 & 8
            if (r0 == 0) goto L10
            androidx.lifecycle.p$b r0 = androidx.lifecycle.p.b.CREATED
            r6 = r0
            goto L11
        L10:
            r6 = r14
        L11:
            r0 = r18 & 16
            if (r0 == 0) goto L17
            r7 = r1
            goto L18
        L17:
            r7 = r15
        L18:
            r0 = r18 & 32
            if (r0 == 0) goto L2b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "randomUUID().toString()"
            u4.l0.o(r0, r2)
            r8 = r0
            goto L2d
        L2b:
            r8 = r16
        L2d:
            r0 = r18 & 64
            if (r0 == 0) goto L33
            r9 = r1
            goto L35
        L33:
            r9 = r17
        L35:
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.t.<init>(android.content.Context, s2.g0, android.os.Bundle, androidx.lifecycle.p$b, s2.z0, java.lang.String, android.os.Bundle, int, u4.w):void");
    }

    public /* synthetic */ t(t tVar, Bundle bundle, int i7, u4.w wVar) {
        this(tVar, (i7 & 2) != 0 ? tVar.c() : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @d.b1({b1.a.LIBRARY_GROUP})
    public t(@n6.d t tVar, @n6.e Bundle bundle) {
        this(tVar.f16430b, tVar.f16431c, bundle, tVar.f16433e, tVar.f16434f, tVar.f16435g, tVar.f16436h);
        u4.l0.p(tVar, "entry");
        this.f16433e = tVar.f16433e;
        l(tVar.f16442n);
    }
}
