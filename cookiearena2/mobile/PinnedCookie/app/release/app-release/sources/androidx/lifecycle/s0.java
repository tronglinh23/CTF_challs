package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import k2.a;
import u4.l1;
import u4.r1;
@s4.h(name = "SavedStateHandleSupport")
@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"})
/* loaded from: classes.dex */
public final class s0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f4830a = "androidx.lifecycle.internal.SavedStateHandlesVM";
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f4831b = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    @n6.d
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<e3.d> f4832c = new b();
    @n6.d
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public static final a.b<f1> f4833d = new c();
    @n6.d
    @s4.e

    /* renamed from: e  reason: collision with root package name */
    public static final a.b<Bundle> f4834e = new a();

    /* loaded from: classes.dex */
    public static final class a implements a.b<Bundle> {
    }

    /* loaded from: classes.dex */
    public static final class b implements a.b<e3.d> {
    }

    /* loaded from: classes.dex */
    public static final class c implements a.b<f1> {
    }

    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.l<k2.a, u0> {

        /* renamed from: l  reason: collision with root package name */
        public static final d f4835l = new d();

        public d() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final u0 O(@n6.d k2.a aVar) {
            u4.l0.p(aVar, "$this$initializer");
            return new u0();
        }
    }

    public static final r0 a(e3.d dVar, f1 f1Var, String str, Bundle bundle) {
        t0 d7 = d(dVar);
        u0 e7 = e(f1Var);
        r0 r0Var = e7.h().get(str);
        if (r0Var == null) {
            r0 a7 = r0.f4810f.a(d7.b(str), bundle);
            e7.h().put(str, a7);
            return a7;
        }
        return r0Var;
    }

    @d.l0
    @n6.d
    public static final r0 b(@n6.d k2.a aVar) {
        u4.l0.p(aVar, "<this>");
        e3.d dVar = (e3.d) aVar.a(f4832c);
        if (dVar != null) {
            f1 f1Var = (f1) aVar.a(f4833d);
            if (f1Var != null) {
                Bundle bundle = (Bundle) aVar.a(f4834e);
                String str = (String) aVar.a(c1.c.f4727d);
                if (str != null) {
                    return a(dVar, f1Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d.l0
    public static final <T extends e3.d & f1> void c(@n6.d T t6) {
        u4.l0.p(t6, "<this>");
        p.b b7 = t6.getLifecycle().b();
        if (!(b7 == p.b.INITIALIZED || b7 == p.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t6.getSavedStateRegistry().c(f4831b) == null) {
            t0 t0Var = new t0(t6.getSavedStateRegistry(), t6);
            t6.getSavedStateRegistry().j(f4831b, t0Var);
            t6.getLifecycle().a(new SavedStateHandleAttacher(t0Var));
        }
    }

    @n6.d
    public static final t0 d(@n6.d e3.d dVar) {
        u4.l0.p(dVar, "<this>");
        a.c c7 = dVar.getSavedStateRegistry().c(f4831b);
        t0 t0Var = c7 instanceof t0 ? (t0) c7 : null;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @n6.d
    public static final u0 e(@n6.d f1 f1Var) {
        u4.l0.p(f1Var, "<this>");
        k2.c cVar = new k2.c();
        cVar.a(l1.d(u0.class), d.f4835l);
        return (u0) new c1(f1Var, cVar.b()).b(f4830a, u0.class);
    }
}
