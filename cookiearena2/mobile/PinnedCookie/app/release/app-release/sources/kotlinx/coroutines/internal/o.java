package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
/* loaded from: classes.dex */
public final class o {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final o f12832a = new o();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f12833b = "META-INF/services/";

    public final d0 a(Class<d0> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            return x3.e0.Q5(ServiceLoader.load(cls, classLoader));
        }
    }

    @n6.d
    public final List<d0> d() {
        d0 d0Var;
        if (p.a()) {
            try {
                ArrayList arrayList = new ArrayList(2);
                d0 d0Var2 = null;
                try {
                    d0Var = (d0) d0.class.cast(Class.forName("m5.a", true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused) {
                    d0Var = null;
                }
                if (d0Var != null) {
                    arrayList.add(d0Var);
                }
                try {
                    d0Var2 = (d0) d0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused2) {
                }
                if (d0Var2 != null) {
                    arrayList.add(d0Var2);
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable unused3) {
                return c(d0.class, d0.class.getClassLoader());
            }
        }
        return c(d0.class, d0.class.getClassLoader());
    }

    @n6.d
    public final <S> List<S> e(@n6.d Class<S> cls, @n6.d ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(f12833b + cls.getName()));
        u4.l0.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x3.b0.o0(arrayList, f12832a.f((URL) it.next()));
        }
        Set V5 = x3.e0.V5(arrayList);
        if ((!V5.isEmpty()) == true) {
            ArrayList arrayList2 = new ArrayList(x3.x.Y(V5, 10));
            Iterator it2 = V5.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f12832a.b((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    public final List<String> f(URL url) {
        String url2 = url.toString();
        if (!i5.b0.v2(url2, "jar", false, 2, null)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> g7 = f12832a.g(bufferedReader);
                n4.c.a(bufferedReader, null);
                return g7;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n4.c.a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        String x52 = i5.c0.x5(i5.c0.q5(url2, "jar:file:", null, 2, null), PublicSuffixDatabase.f14435h, null, 2, null);
        String q52 = i5.c0.q5(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(x52, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(q52)), "UTF-8"));
            List<String> g8 = f12832a.g(bufferedReader2);
            n4.c.a(bufferedReader2, null);
            jarFile.close();
            return g8;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    v3.p.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    public final List<String> g(BufferedReader bufferedReader) {
        boolean z6;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return x3.e0.Q5(linkedHashSet);
            }
            String obj = i5.c0.F5(i5.c0.y5(readLine, "#", null, 2, null)).toString();
            int i7 = 0;
            while (true) {
                if (i7 >= obj.length()) {
                    z6 = true;
                    break;
                }
                char charAt = obj.charAt(i7);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z6 = false;
                    break;
                }
                i7++;
            }
            if (!z6) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final <R> R h(JarFile jarFile, t4.l<? super JarFile, ? extends R> lVar) {
        try {
            R O = lVar.O(jarFile);
            u4.i0.d(1);
            jarFile.close();
            u4.i0.c(1);
            return O;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u4.i0.d(1);
                try {
                    jarFile.close();
                    u4.i0.c(1);
                    throw th2;
                } catch (Throwable th3) {
                    v3.p.a(th, th3);
                    throw th;
                }
            }
        }
    }
}
