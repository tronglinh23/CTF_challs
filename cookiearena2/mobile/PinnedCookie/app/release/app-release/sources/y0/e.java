package y0;

import android.net.TrafficStats;
import d.o0;
import d.u;
import d.w0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
/* loaded from: classes.dex */
public final class e {

    @w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @u
        public static void b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int i7) {
        TrafficStats.incrementOperationCount(i7);
    }

    @Deprecated
    public static void d(int i7, int i8) {
        TrafficStats.incrementOperationCount(i7, i8);
    }

    @Deprecated
    public static void e(int i7) {
        TrafficStats.setThreadStatsTag(i7);
    }

    public static void f(@o0 DatagramSocket datagramSocket) throws SocketException {
        a.a(datagramSocket);
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(@o0 DatagramSocket datagramSocket) throws SocketException {
        a.b(datagramSocket);
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
