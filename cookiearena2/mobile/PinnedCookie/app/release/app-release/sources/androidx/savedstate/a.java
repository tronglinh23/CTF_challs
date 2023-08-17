package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.z;
import androidx.savedstate.Recreator;
import i0.k0;
import i0.x2;
import java.util.Iterator;
import java.util.Map;
import n6.d;
import n6.e;
import u4.l0;
import u4.r1;
import u4.w;
@r1({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {
    @d

    /* renamed from: g  reason: collision with root package name */
    public static final b f5643g = new b(null);
    @d
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final String f5644h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* renamed from: b  reason: collision with root package name */
    public boolean f5646b;
    @e

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5647c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5648d;
    @e

    /* renamed from: e  reason: collision with root package name */
    public Recreator.b f5649e;
    @d

    /* renamed from: a  reason: collision with root package name */
    public final m.b<String, c> f5645a = new m.b<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5650f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0066a {
        void a(@d e3.d dVar);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(w wVar) {
            this();
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        @d
        Bundle a();
    }

    public static final void f(a aVar, z zVar, p.a aVar2) {
        l0.p(aVar, "this$0");
        l0.p(zVar, "<anonymous parameter 0>");
        l0.p(aVar2, k0.I0);
        if (aVar2 == p.a.ON_START) {
            aVar.f5650f = true;
        } else if (aVar2 == p.a.ON_STOP) {
            aVar.f5650f = false;
        }
    }

    @d.l0
    @e
    public final Bundle b(@d String str) {
        l0.p(str, x2.f10960j);
        if (this.f5648d) {
            Bundle bundle = this.f5647c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.f5647c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f5647c;
                boolean z6 = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z6 = true;
                }
                if (!z6) {
                    this.f5647c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @e
    public final c c(@d String str) {
        l0.p(str, x2.f10960j);
        Iterator<Map.Entry<String, c>> it = this.f5645a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            l0.o(next, "components");
            String key = next.getKey();
            c value = next.getValue();
            if (l0.g(key, str)) {
                return value;
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f5650f;
    }

    @d.l0
    public final boolean e() {
        return this.f5648d;
    }

    @d.l0
    public final void g(@d p pVar) {
        l0.p(pVar, "lifecycle");
        if ((!this.f5646b) != true) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        pVar.a(new v() { // from class: e3.b
            @Override // androidx.lifecycle.v
            public final void d(z zVar, p.a aVar) {
                androidx.savedstate.a.f(androidx.savedstate.a.this, zVar, aVar);
            }
        });
        this.f5646b = true;
    }

    @d.l0
    public final void h(@e Bundle bundle) {
        if (!this.f5646b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if ((!this.f5648d) != true) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f5647c = bundle != null ? bundle.getBundle(f5644h) : null;
        this.f5648d = true;
    }

    @d.l0
    public final void i(@d Bundle bundle) {
        l0.p(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5647c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<String, c>.d e7 = this.f5645a.e();
        l0.o(e7, "this.components.iteratorWithAdditions()");
        while (e7.hasNext()) {
            Map.Entry next = e7.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle(f5644h, bundle2);
    }

    @d.l0
    public final void j(@d String str, @d c cVar) {
        l0.p(str, x2.f10960j);
        l0.p(cVar, "provider");
        if (!(this.f5645a.h(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @d.l0
    public final void k(@d Class<? extends InterfaceC0066a> cls) {
        l0.p(cls, "clazz");
        if (!this.f5650f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f5649e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f5649e = bVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f5649e;
            if (bVar2 != null) {
                String name = cls.getName();
                l0.o(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }

    public final void l(boolean z6) {
        this.f5650f = z6;
    }

    @d.l0
    public final void m(@d String str) {
        l0.p(str, x2.f10960j);
        this.f5645a.i(str);
    }
}
