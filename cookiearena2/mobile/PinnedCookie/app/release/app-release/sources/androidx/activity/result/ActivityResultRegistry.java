package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.z;
import d.l0;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: i  reason: collision with root package name */
    public static final String f556i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: j  reason: collision with root package name */
    public static final String f557j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: k  reason: collision with root package name */
    public static final String f558k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: l  reason: collision with root package name */
    public static final String f559l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: m  reason: collision with root package name */
    public static final String f560m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* renamed from: n  reason: collision with root package name */
    public static final String f561n = "ActivityResultRegistry";

    /* renamed from: o  reason: collision with root package name */
    public static final int f562o = 65536;

    /* renamed from: a  reason: collision with root package name */
    public Random f563a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f564b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f565c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, d> f566d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f567e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, c<?>> f568f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f569g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f570h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends i<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f575a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f576b;

        public a(String str, c.a aVar) {
            this.f575a = str;
            this.f576b = aVar;
        }

        @Override // androidx.activity.result.i
        @o0
        public c.a<I, ?> a() {
            return this.f576b;
        }

        @Override // androidx.activity.result.i
        public void c(I i7, @q0 i0.i iVar) {
            Integer num = ActivityResultRegistry.this.f565c.get(this.f575a);
            if (num != null) {
                ActivityResultRegistry.this.f567e.add(this.f575a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f576b, i7, iVar);
                    return;
                } catch (Exception e7) {
                    ActivityResultRegistry.this.f567e.remove(this.f575a);
                    throw e7;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f576b + " and input " + i7 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.i
        public void d() {
            ActivityResultRegistry.this.l(this.f575a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends i<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f578a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f579b;

        public b(String str, c.a aVar) {
            this.f578a = str;
            this.f579b = aVar;
        }

        @Override // androidx.activity.result.i
        @o0
        public c.a<I, ?> a() {
            return this.f579b;
        }

        @Override // androidx.activity.result.i
        public void c(I i7, @q0 i0.i iVar) {
            Integer num = ActivityResultRegistry.this.f565c.get(this.f578a);
            if (num != null) {
                ActivityResultRegistry.this.f567e.add(this.f578a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f579b, i7, iVar);
                    return;
                } catch (Exception e7) {
                    ActivityResultRegistry.this.f567e.remove(this.f578a);
                    throw e7;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f579b + " and input " + i7 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.i
        public void d() {
            ActivityResultRegistry.this.l(this.f578a);
        }
    }

    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.activity.result.b<O> f581a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a<?, O> f582b;

        public c(androidx.activity.result.b<O> bVar, c.a<?, O> aVar) {
            this.f581a = bVar;
            this.f582b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final p f583a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<v> f584b = new ArrayList<>();

        public d(@o0 p pVar) {
            this.f583a = pVar;
        }

        public void a(@o0 v vVar) {
            this.f583a.a(vVar);
            this.f584b.add(vVar);
        }

        public void b() {
            Iterator<v> it = this.f584b.iterator();
            while (it.hasNext()) {
                this.f583a.d(it.next());
            }
            this.f584b.clear();
        }
    }

    public final void a(int i7, String str) {
        this.f564b.put(Integer.valueOf(i7), str);
        this.f565c.put(str, Integer.valueOf(i7));
    }

    @l0
    public final boolean b(int i7, int i8, @q0 Intent intent) {
        String str = this.f564b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        d(str, i8, intent, this.f568f.get(str));
        return true;
    }

    @l0
    public final <O> boolean c(int i7, @SuppressLint({"UnknownNullness"}) O o6) {
        androidx.activity.result.b<?> bVar;
        String str = this.f564b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f568f.get(str);
        if (cVar == null || (bVar = cVar.f581a) == null) {
            this.f570h.remove(str);
            this.f569g.put(str, o6);
            return true;
        } else if (this.f567e.remove(str)) {
            bVar.a(o6);
            return true;
        } else {
            return true;
        }
    }

    public final <O> void d(String str, int i7, @q0 Intent intent, @q0 c<O> cVar) {
        if (cVar == null || cVar.f581a == null || !this.f567e.contains(str)) {
            this.f569g.remove(str);
            this.f570h.putParcelable(str, new androidx.activity.result.a(i7, intent));
            return;
        }
        cVar.f581a.a(cVar.f582b.c(i7, intent));
        this.f567e.remove(str);
    }

    public final int e() {
        int nextInt = this.f563a.nextInt(2147418112);
        while (true) {
            int i7 = nextInt + 65536;
            if (!this.f564b.containsKey(Integer.valueOf(i7))) {
                return i7;
            }
            nextInt = this.f563a.nextInt(2147418112);
        }
    }

    @l0
    public abstract <I, O> void f(int i7, @o0 c.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i8, @q0 i0.i iVar);

    public final void g(@q0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f556i);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f557j);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f567e = bundle.getStringArrayList(f558k);
        this.f563a = (Random) bundle.getSerializable(f560m);
        this.f570h.putAll(bundle.getBundle(f559l));
        for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
            String str = stringArrayList.get(i7);
            if (this.f565c.containsKey(str)) {
                Integer remove = this.f565c.remove(str);
                if (!this.f570h.containsKey(str)) {
                    this.f564b.remove(remove);
                }
            }
            a(integerArrayList.get(i7).intValue(), stringArrayList.get(i7));
        }
    }

    public final void h(@o0 Bundle bundle) {
        bundle.putIntegerArrayList(f556i, new ArrayList<>(this.f565c.values()));
        bundle.putStringArrayList(f557j, new ArrayList<>(this.f565c.keySet()));
        bundle.putStringArrayList(f558k, new ArrayList<>(this.f567e));
        bundle.putBundle(f559l, (Bundle) this.f570h.clone());
        bundle.putSerializable(f560m, this.f563a);
    }

    @o0
    public final <I, O> i<I> i(@o0 final String str, @o0 z zVar, @o0 final c.a<I, O> aVar, @o0 final androidx.activity.result.b<O> bVar) {
        p lifecycle = zVar.getLifecycle();
        if (lifecycle.b().d(p.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + zVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = this.f566d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new v() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.v
            public void d(@o0 z zVar2, @o0 p.a aVar2) {
                if (!p.a.ON_START.equals(aVar2)) {
                    if (p.a.ON_STOP.equals(aVar2)) {
                        ActivityResultRegistry.this.f568f.remove(str);
                        return;
                    } else if (p.a.ON_DESTROY.equals(aVar2)) {
                        ActivityResultRegistry.this.l(str);
                        return;
                    } else {
                        return;
                    }
                }
                ActivityResultRegistry.this.f568f.put(str, new c<>(bVar, aVar));
                if (ActivityResultRegistry.this.f569g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f569g.get(str);
                    ActivityResultRegistry.this.f569g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) ActivityResultRegistry.this.f570h.getParcelable(str);
                if (aVar3 != null) {
                    ActivityResultRegistry.this.f570h.remove(str);
                    bVar.a(aVar.c(aVar3.b(), aVar3.a()));
                }
            }
        });
        this.f566d.put(str, dVar);
        return new a(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public final <I, O> i<I> j(@o0 String str, @o0 c.a<I, O> aVar, @o0 androidx.activity.result.b<O> bVar) {
        k(str);
        this.f568f.put(str, new c<>(bVar, aVar));
        if (this.f569g.containsKey(str)) {
            Object obj = this.f569g.get(str);
            this.f569g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f570h.getParcelable(str);
        if (aVar2 != null) {
            this.f570h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    public final void k(String str) {
        if (this.f565c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    @l0
    public final void l(@o0 String str) {
        Integer remove;
        if (!this.f567e.contains(str) && (remove = this.f565c.remove(str)) != null) {
            this.f564b.remove(remove);
        }
        this.f568f.remove(str);
        if (this.f569g.containsKey(str)) {
            Log.w(f561n, "Dropping pending result for request " + str + ": " + this.f569g.get(str));
            this.f569g.remove(str);
        }
        if (this.f570h.containsKey(str)) {
            Log.w(f561n, "Dropping pending result for request " + str + ": " + this.f570h.getParcelable(str));
            this.f570h.remove(str);
        }
        d dVar = this.f566d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f566d.remove(str);
        }
    }
}
