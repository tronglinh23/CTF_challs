package androidx.savedstate;

import android.os.Bundle;
import androidx.appcompat.widget.d;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import i0.k0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import u4.l0;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/p$a;", k0.I0, "Lv3/m2;", d.f1513o, "", "className", "h", "Le3/d;", "k", "Le3/d;", "owner", "<init>", "(Le3/d;)V", "l", "a", "b", "savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Recreator implements v {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final String f5639m = "classes_to_restore";
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final String f5640n = "androidx.savedstate.Restarter";
    @n6.d

    /* renamed from: k  reason: collision with root package name and from kotlin metadata */
    public final e3.d owner;

    /* loaded from: classes.dex */
    public static final class b implements a.c {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f5642a;

        public b(@n6.d a aVar) {
            l0.p(aVar, "registry");
            this.f5642a = new LinkedHashSet();
            aVar.j(Recreator.f5640n, this);
        }

        @Override // androidx.savedstate.a.c
        @n6.d
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f5639m, new ArrayList<>(this.f5642a));
            return bundle;
        }

        public final void b(@n6.d String str) {
            l0.p(str, "className");
            this.f5642a.add(str);
        }
    }

    public Recreator(@n6.d e3.d dVar) {
        l0.p(dVar, "owner");
        this.owner = dVar;
    }

    @Override // androidx.lifecycle.v
    public void d(@n6.d z zVar, @n6.d p.a aVar) {
        l0.p(zVar, "source");
        l0.p(aVar, k0.I0);
        if (aVar != p.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        zVar.getLifecycle().d(this);
        Bundle b7 = this.owner.getSavedStateRegistry().b(f5640n);
        if (b7 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b7.getStringArrayList(f5639m);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0066a.class);
            l0.o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    l0.o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0066a) newInstance).a(this.owner);
                } catch (Exception e7) {
                    throw new RuntimeException("Failed to instantiate " + str, e7);
                }
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("Class " + str + " wasn't found", e9);
        }
    }
}
