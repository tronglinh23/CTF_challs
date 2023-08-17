package i6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n0 extends k {

    /* renamed from: n  reason: collision with root package name */
    public final Socket f11249n;

    public n0(@n6.d Socket socket) {
        u4.l0.p(socket, "socket");
        this.f11249n = socket;
    }

    @Override // i6.k
    public void B() {
        Logger logger;
        Logger logger2;
        try {
            this.f11249n.close();
        } catch (AssertionError e7) {
            if (!a0.e(e7)) {
                throw e7;
            }
            logger2 = b0.f11165a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f11249n, (Throwable) e7);
        } catch (Exception e8) {
            logger = b0.f11165a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f11249n, (Throwable) e8);
        }
    }

    @Override // i6.k
    @n6.d
    public IOException x(@n6.e IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}