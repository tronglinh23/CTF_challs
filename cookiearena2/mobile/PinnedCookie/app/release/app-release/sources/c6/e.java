package c6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import r5.c0;
import u4.l0;
import u4.w;
import z0.m;
/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: k  reason: collision with root package name */
    public static final b f7987k = new b(null);

    /* renamed from: f  reason: collision with root package name */
    public final Method f7988f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f7989g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f7990h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f7991i;

    /* renamed from: j  reason: collision with root package name */
    public final Class<?> f7992j;

    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7993a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public String f7994b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f7995c;

        public a(@n6.d List<String> list) {
            l0.p(list, "protocols");
            this.f7995c = list;
        }

        @n6.e
        public final String a() {
            return this.f7994b;
        }

        public final boolean b() {
            return this.f7993a;
        }

        public final void c(@n6.e String str) {
            this.f7994b = str;
        }

        public final void d(boolean z6) {
            this.f7993a = z6;
        }

        @Override // java.lang.reflect.InvocationHandler
        @n6.e
        public Object invoke(@n6.d Object obj, @n6.d Method method, @n6.e Object[] objArr) throws Throwable {
            l0.p(obj, "proxy");
            l0.p(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (l0.g(name, "supports") && l0.g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (l0.g(name, "unsupported") && l0.g(Void.TYPE, returnType)) {
                this.f7993a = true;
                return null;
            }
            if (l0.g(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f7995c;
                }
            }
            if ((l0.g(name, "selectProtocol") || l0.g(name, "select")) && l0.g(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i7 = 0;
                            while (true) {
                                Object obj3 = list.get(i7);
                                if (obj3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                String str = (String) obj3;
                                if (!this.f7995c.contains(str)) {
                                    if (i7 == size) {
                                        break;
                                    }
                                    i7++;
                                } else {
                                    this.f7994b = str;
                                    return str;
                                }
                            }
                        }
                        String str2 = this.f7995c.get(0);
                        this.f7994b = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((l0.g(name, "protocolSelected") || l0.g(name, "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f7994b = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        @n6.e
        public final j a() {
            String property = System.getProperty("java.specification.version", m.f19022b);
            try {
                l0.o(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                l0.o(method, "putMethod");
                l0.o(method2, "getMethod");
                l0.o(method3, "removeMethod");
                l0.o(cls3, "clientProviderClass");
                l0.o(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ b(w wVar) {
            this();
        }
    }

    public e(@n6.d Method method, @n6.d Method method2, @n6.d Method method3, @n6.d Class<?> cls, @n6.d Class<?> cls2) {
        l0.p(method, "putMethod");
        l0.p(method2, "getMethod");
        l0.p(method3, "removeMethod");
        l0.p(cls, "clientProviderClass");
        l0.p(cls2, "serverProviderClass");
        this.f7988f = method;
        this.f7989g = method2;
        this.f7990h = method3;
        this.f7991i = cls;
        this.f7992j = cls2;
    }

    @Override // c6.j
    public void c(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        try {
            this.f7990h.invoke(null, sSLSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // c6.j
    public void f(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<? extends c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        try {
            this.f7988f.invoke(null, sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f7991i, this.f7992j}, new a(j.f8005e.b(list))));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // c6.j
    @n6.e
    public String j(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f7989g.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    j.n(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}
