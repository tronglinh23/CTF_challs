package i0;

import android.app.Service;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10927a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10928b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10929c = 2;

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(Service service, int i7) {
            service.stopForeground(i7);
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static void a(@d.o0 Service service, int i7) {
        a.a(service, i7);
    }
}
