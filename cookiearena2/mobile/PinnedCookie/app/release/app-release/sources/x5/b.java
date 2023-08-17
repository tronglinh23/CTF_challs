package x5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import r5.l;
import u4.l0;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f18399a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18400b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18401c;

    /* renamed from: d  reason: collision with root package name */
    public final List<l> f18402d;

    public b(@n6.d List<l> list) {
        l0.p(list, "connectionSpecs");
        this.f18402d = list;
    }

    @n6.d
    public final l a(@n6.d SSLSocket sSLSocket) throws IOException {
        l lVar;
        l0.p(sSLSocket, "sslSocket");
        int i7 = this.f18399a;
        int size = this.f18402d.size();
        while (true) {
            if (i7 >= size) {
                lVar = null;
                break;
            }
            lVar = this.f18402d.get(i7);
            if (lVar.h(sSLSocket)) {
                this.f18399a = i7 + 1;
                break;
            }
            i7++;
        }
        if (lVar != null) {
            this.f18400b = c(sSLSocket);
            lVar.f(sSLSocket, this.f18401c);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f18401c);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.f18402d);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        l0.m(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        l0.o(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(@n6.d IOException iOException) {
        l0.p(iOException, "e");
        this.f18401c = true;
        return (!this.f18400b || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket sSLSocket) {
        int size = this.f18402d.size();
        for (int i7 = this.f18399a; i7 < size; i7++) {
            if (this.f18402d.get(i7).h(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
