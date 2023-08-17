package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.c1;
import d.b1;
/* loaded from: classes.dex */
public abstract class a extends c1.d implements c1.b {
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final C0049a f4680e = new C0049a(null);
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final String f4681f = "androidx.lifecycle.savedstate.vm.tag";
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public androidx.savedstate.a f4682b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public p f4683c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public Bundle f4684d;

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0049a {
        public /* synthetic */ C0049a(u4.w wVar) {
            this();
        }

        public C0049a() {
        }
    }

    public a() {
    }

    @Override // androidx.lifecycle.c1.b
    @n6.d
    public <T extends z0> T a(@n6.d Class<T> cls) {
        u4.l0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f4683c != null) {
                return (T) e(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.c1.b
    @n6.d
    public <T extends z0> T b(@n6.d Class<T> cls, @n6.d k2.a aVar) {
        u4.l0.p(cls, "modelClass");
        u4.l0.p(aVar, "extras");
        String str = (String) aVar.a(c1.c.f4727d);
        if (str != null) {
            return this.f4682b != null ? (T) e(str, cls) : (T) f(str, cls, s0.b(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.c1.d
    @d.b1({b1.a.LIBRARY_GROUP})
    public void d(@n6.d z0 z0Var) {
        u4.l0.p(z0Var, "viewModel");
        androidx.savedstate.a aVar = this.f4682b;
        if (aVar != null) {
            u4.l0.m(aVar);
            p pVar = this.f4683c;
            u4.l0.m(pVar);
            LegacySavedStateHandleController.a(z0Var, aVar, pVar);
        }
    }

    public final <T extends z0> T e(String str, Class<T> cls) {
        androidx.savedstate.a aVar = this.f4682b;
        u4.l0.m(aVar);
        p pVar = this.f4683c;
        u4.l0.m(pVar);
        SavedStateHandleController b7 = LegacySavedStateHandleController.b(aVar, pVar, str, this.f4684d);
        T t6 = (T) f(str, cls, b7.getHandle());
        t6.g("androidx.lifecycle.savedstate.vm.tag", b7);
        return t6;
    }

    @n6.d
    public abstract <T extends z0> T f(@n6.d String str, @n6.d Class<T> cls, @n6.d r0 r0Var);

    public a(@n6.d e3.d dVar, @n6.e Bundle bundle) {
        u4.l0.p(dVar, "owner");
        this.f4682b = dVar.getSavedStateRegistry();
        this.f4683c = dVar.getLifecycle();
        this.f4684d = bundle;
    }
}
