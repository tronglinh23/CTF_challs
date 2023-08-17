package i3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import d.o0;
import d.q0;
import i3.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f11003d = "Startup";

    /* renamed from: e  reason: collision with root package name */
    public static volatile a f11004e;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f11005f = new Object();
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final Context f11008c;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f11007b = new HashSet();
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f11006a = new HashMap();

    public a(@o0 Context context) {
        this.f11008c = context.getApplicationContext();
    }

    @o0
    public static a e(@o0 Context context) {
        if (f11004e == null) {
            synchronized (f11005f) {
                if (f11004e == null) {
                    f11004e = new a(context);
                }
            }
        }
        return f11004e;
    }

    public static void h(@o0 a aVar) {
        synchronized (f11005f) {
            f11004e = aVar;
        }
    }

    public void a() {
        try {
            try {
                j3.b.c(f11003d);
                b(this.f11008c.getPackageManager().getProviderInfo(new ComponentName(this.f11008c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e7) {
                throw new d(e7);
            }
        } finally {
            j3.b.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(@q0 Bundle bundle) {
        String string = this.f11008c.getString(c.a.f11009a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f11007b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.f11007b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e7) {
                throw new d(e7);
            }
        }
    }

    @o0
    public <T> T c(@o0 Class<? extends b<?>> cls) {
        T t6;
        synchronized (f11005f) {
            t6 = (T) this.f11006a.get(cls);
            if (t6 == null) {
                t6 = (T) d(cls, new HashSet());
            }
        }
        return t6;
    }

    @o0
    public final <T> T d(@o0 Class<? extends b<?>> cls, @o0 Set<Class<?>> set) {
        T t6;
        if (j3.b.h()) {
            try {
                j3.b.c(cls.getSimpleName());
            } finally {
                j3.b.f();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f11006a.containsKey(cls)) {
            t6 = (T) this.f11006a.get(cls);
        } else {
            set.add(cls);
            b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends b<?>>> a7 = newInstance.a();
            if (!a7.isEmpty()) {
                for (Class<? extends b<?>> cls2 : a7) {
                    if (!this.f11006a.containsKey(cls2)) {
                        d(cls2, set);
                    }
                }
            }
            t6 = (T) newInstance.b(this.f11008c);
            set.remove(cls);
            this.f11006a.put(cls, t6);
        }
        return t6;
    }

    @o0
    public <T> T f(@o0 Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@o0 Class<? extends b<?>> cls) {
        return this.f11007b.contains(cls);
    }
}