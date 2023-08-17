package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.c1;
import d.b1;
import i0.x2;
import java.lang.reflect.Constructor;
/* loaded from: classes.dex */
public final class v0 extends c1.d implements c1.b {
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public Application f4844b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final c1.b f4845c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public Bundle f4846d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public p f4847e;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public androidx.savedstate.a f4848f;

    public v0() {
        this.f4845c = new c1.a();
    }

    @Override // androidx.lifecycle.c1.b
    @n6.d
    public <T extends z0> T a(@n6.d Class<T> cls) {
        u4.l0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, cls);
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
            if (aVar.a(s0.f4832c) == null || aVar.a(s0.f4833d) == null) {
                if (this.f4847e != null) {
                    return (T) e(str, cls);
                }
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
            Application application = (Application) aVar.a(c1.a.f4720i);
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor c7 = (!isAssignableFrom || application == null) ? w0.c(cls, w0.b()) : w0.c(cls, w0.a());
            return c7 == null ? (T) this.f4845c.b(cls, aVar) : (!isAssignableFrom || application == null) ? (T) w0.d(cls, c7, s0.b(aVar)) : (T) w0.d(cls, c7, application, s0.b(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.c1.d
    @d.b1({b1.a.LIBRARY_GROUP})
    public void d(@n6.d z0 z0Var) {
        u4.l0.p(z0Var, "viewModel");
        if (this.f4847e != null) {
            androidx.savedstate.a aVar = this.f4848f;
            u4.l0.m(aVar);
            p pVar = this.f4847e;
            u4.l0.m(pVar);
            LegacySavedStateHandleController.a(z0Var, aVar, pVar);
        }
    }

    @n6.d
    public final <T extends z0> T e(@n6.d String str, @n6.d Class<T> cls) {
        T t6;
        Application application;
        u4.l0.p(str, x2.f10960j);
        u4.l0.p(cls, "modelClass");
        p pVar = this.f4847e;
        if (pVar != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor c7 = (!isAssignableFrom || this.f4844b == null) ? w0.c(cls, w0.b()) : w0.c(cls, w0.a());
            if (c7 == null) {
                return this.f4844b != null ? (T) this.f4845c.a(cls) : (T) c1.c.f4725b.a().a(cls);
            }
            androidx.savedstate.a aVar = this.f4848f;
            u4.l0.m(aVar);
            SavedStateHandleController b7 = LegacySavedStateHandleController.b(aVar, pVar, str, this.f4846d);
            if (!isAssignableFrom || (application = this.f4844b) == null) {
                t6 = (T) w0.d(cls, c7, b7.getHandle());
            } else {
                u4.l0.m(application);
                t6 = (T) w0.d(cls, c7, application, b7.getHandle());
            }
            t6.g("androidx.lifecycle.savedstate.vm.tag", b7);
            return t6;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(@n6.e Application application, @n6.d e3.d dVar) {
        this(application, dVar, null);
        u4.l0.p(dVar, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public v0(@n6.e Application application, @n6.d e3.d dVar, @n6.e Bundle bundle) {
        c1.a aVar;
        u4.l0.p(dVar, "owner");
        this.f4848f = dVar.getSavedStateRegistry();
        this.f4847e = dVar.getLifecycle();
        this.f4846d = bundle;
        this.f4844b = application;
        if (application != null) {
            aVar = c1.a.f4717f.b(application);
        } else {
            aVar = new c1.a();
        }
        this.f4845c = aVar;
    }
}
