package d6;

import d6.l;
import d6.m;
import i5.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r5.c0;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public class h implements m {
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final l.a f8541f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f8542g;

    /* renamed from: a  reason: collision with root package name */
    public final Method f8543a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f8544b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f8545c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f8546d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<? super SSLSocket> f8547e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d6.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0096a implements l.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8548a;

            public C0096a(String str) {
                this.f8548a = str;
            }

            @Override // d6.l.a
            public boolean a(@n6.d SSLSocket sSLSocket) {
                l0.p(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                l0.o(name, "sslSocket.javaClass.name");
                return b0.v2(name, this.f8548a + '.', false, 2, null);
            }

            @Override // d6.l.a
            @n6.d
            public m b(@n6.d SSLSocket sSLSocket) {
                l0.p(sSLSocket, "sslSocket");
                return h.f8542g.b(sSLSocket.getClass());
            }
        }

        public a() {
        }

        public final h b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!l0.g(cls2.getSimpleName(), "OpenSSLSocketImpl")) != false) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            l0.m(cls2);
            return new h(cls2);
        }

        @n6.d
        public final l.a c(@n6.d String str) {
            l0.p(str, "packageName");
            return new C0096a(str);
        }

        @n6.d
        public final l.a d() {
            return h.f8541f;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f8542g = aVar;
        f8541f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(@n6.d Class<? super SSLSocket> cls) {
        l0.p(cls, "sslSocketClass");
        this.f8547e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        l0.o(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f8543a = declaredMethod;
        this.f8544b = cls.getMethod("setHostname", String.class);
        this.f8545c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f8546d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // d6.m
    public boolean a(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        return this.f8547e.isInstance(sSLSocket);
    }

    @Override // d6.m
    @n6.e
    public String b(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f8545c.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    l0.o(charset, "StandardCharsets.UTF_8");
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (NullPointerException e8) {
                if (l0.g(e8.getMessage(), "ssl == null")) {
                    return null;
                }
                throw e8;
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
        return null;
    }

    @Override // d6.m
    @n6.e
    public X509TrustManager c(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // d6.m
    public boolean d(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // d6.m
    public void e(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<? extends c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f8543a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f8544b.invoke(sSLSocket, str);
                }
                this.f8546d.invoke(sSLSocket, c6.j.f8005e.c(list));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    @Override // d6.m
    public boolean isSupported() {
        return c6.b.f7975i.b();
    }
}
