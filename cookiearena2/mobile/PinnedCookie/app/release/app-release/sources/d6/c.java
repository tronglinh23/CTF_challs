package d6;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import d6.m;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r5.c0;
import u4.l0;
import u4.w;
@s5.c
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8532a = new a(null);

    @s5.c
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.e
        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            return c6.j.f8005e.h() && Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @Override // d6.m
    public boolean a(@n6.d SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        l0.p(sSLSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // d6.m
    @n6.e
    @SuppressLint({"NewApi"})
    public String b(@n6.d SSLSocket sSLSocket) {
        String applicationProtocol;
        l0.p(sSLSocket, "sslSocket");
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
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
    @SuppressLint({"NewApi"})
    public void e(@n6.d SSLSocket sSLSocket, @n6.e String str, @n6.d List<? extends c0> list) {
        l0.p(sSLSocket, "sslSocket");
        l0.p(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            l0.o(sSLParameters, "sslParameters");
            Object[] array = c6.j.f8005e.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e7) {
            throw new IOException("Android internal error", e7);
        }
    }

    @Override // d6.m
    public boolean isSupported() {
        return f8532a.b();
    }
}
