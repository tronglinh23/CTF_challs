package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.collection.m<ClassLoader, androidx.collection.m<String, Class<?>>> f4555a = new androidx.collection.m<>();

    public static boolean b(@d.o0 ClassLoader classLoader, @d.o0 String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @d.o0
    public static Class<?> c(@d.o0 ClassLoader classLoader, @d.o0 String str) throws ClassNotFoundException {
        androidx.collection.m<ClassLoader, androidx.collection.m<String, Class<?>>> mVar = f4555a;
        androidx.collection.m<String, Class<?>> mVar2 = mVar.get(classLoader);
        if (mVar2 == null) {
            mVar2 = new androidx.collection.m<>();
            mVar.put(classLoader, mVar2);
        }
        Class<?> cls = mVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            mVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    @d.o0
    public static Class<? extends Fragment> d(@d.o0 ClassLoader classLoader, @d.o0 String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e7) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e7);
        } catch (ClassNotFoundException e8) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists", e8);
        }
    }

    @d.o0
    public Fragment a(@d.o0 ClassLoader classLoader, @d.o0 String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e7) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }
}
