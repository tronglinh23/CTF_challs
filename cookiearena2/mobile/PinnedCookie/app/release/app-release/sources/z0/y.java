package z0;

import android.annotation.SuppressLint;
import android.os.Message;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19052a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f19053b = true;

    @d.w0(22)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(Message message) {
            return message.isAsynchronous();
        }

        @d.u
        public static void b(Message message, boolean z6) {
            message.setAsynchronous(z6);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@d.o0 Message message) {
        return a.a(message);
    }

    @SuppressLint({"NewApi"})
    public static void b(@d.o0 Message message, boolean z6) {
        a.b(message, z6);
    }
}
