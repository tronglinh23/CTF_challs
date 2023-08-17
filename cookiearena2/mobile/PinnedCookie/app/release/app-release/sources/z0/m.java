package z0;

import android.os.Environment;
import java.io.File;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19021a = "EnvironmentCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final String f19022b = "unknown";

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static String a(File file) {
            return Environment.getStorageState(file);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @d.o0
    public static String a(@d.o0 File file) {
        return b.a(file);
    }
}
