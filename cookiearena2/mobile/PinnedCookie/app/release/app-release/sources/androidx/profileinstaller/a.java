package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import d.o0;
import d.w0;
import java.io.File;
/* loaded from: classes.dex */
public class a {

    @w0(api = 21)
    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0059a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @w0(api = 24)
    /* loaded from: classes.dex */
    public static class b {
        public static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : listFiles) {
            z6 = a(file2) && z6;
        }
        return z6;
    }

    public static void b(@o0 Context context, @o0 ProfileInstallReceiver.a aVar) {
        if (a(b.a(context))) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
