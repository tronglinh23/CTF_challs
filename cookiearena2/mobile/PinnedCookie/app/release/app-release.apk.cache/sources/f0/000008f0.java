package c6;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r5.c0;
import u4.l0;
import u4.w;

/* loaded from: classes.dex */
public class h extends j {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f7996f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f7997g = new a(0);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.e
        public final h a() {
            if (b()) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f7996f;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1.intValue() >= 9) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [u4.w] */
    /* JADX WARN: Type inference failed for: r1v5 */
    static {
        /*
            c6.h$a r0 = new c6.h$a
            r1 = 0
            r0.<init>(r1)
            c6.h.f7997g = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = i5.a0.Y0(r0)
        L14:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L21
            goto L2c
        L21:
            r0 = r2
            goto L2c
        L23:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L21
        L2c:
            c6.h.f7996f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.h.<clinit>():void");
    }

    @Override // c6.j
    @s5.c
    public void f(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> b7 = j.f8005e.b(list);
        l0.o(sSLParameters, "sslParameters");
        Object[] array = b7.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // c6.j
    @s5.c
    @n6.e
    public String j(@n6.d SSLSocket sSLSocket) {
        String applicationProtocol;
        l0.p(sSLSocket, "sslSocket");
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // c6.j
    @n6.e
    public X509TrustManager s(@n6.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}