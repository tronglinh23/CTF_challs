package k4;

import u4.l0;
import v3.a0;
import v3.a1;
import v3.g1;

/* loaded from: classes.dex */
public final class m {
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final l f11768a;

    static {
        l lVar;
        Object newInstance;
        try {
            newInstance = m4.a.class.newInstance();
            l0.o(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                } catch (ClassCastException e7) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = l.class.getClassLoader();
                    if (l0.g(classLoader, classLoader2)) {
                        throw e7;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e7);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = l4.a.class.newInstance();
                l0.o(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        if (newInstance2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        lVar = (l) newInstance2;
                    } catch (ClassNotFoundException unused2) {
                        lVar = new l();
                    }
                } catch (ClassCastException e8) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = l.class.getClassLoader();
                    if (l0.g(classLoader3, classLoader4)) {
                        throw e8;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e8);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            l0.o(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    lVar = (l) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    l0.o(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        lVar = (l) newInstance4;
                    } catch (ClassCastException e9) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = l.class.getClassLoader();
                        if (l0.g(classLoader5, classLoader6)) {
                            throw e9;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e9);
                    }
                }
            } catch (ClassCastException e10) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = l.class.getClassLoader();
                if (l0.g(classLoader7, classLoader8)) {
                    throw e10;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e10);
            }
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        lVar = (l) newInstance;
        f11768a = lVar;
    }

    @g1(version = "1.2")
    @a1
    public static final boolean a(int i7, int i8, int i9) {
        return a0.f17760q.j(i7, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    public static final /* synthetic */ <T> T b(Object obj) {
        try {
            l0.y(1, "T");
            return obj;
        } catch (ClassCastException e7) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            l0.y(4, "T");
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (l0.g(classLoader, classLoader2)) {
                throw e7;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e7);
        }
    }
}