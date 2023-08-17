package j3;

import android.os.Trace;
import d.o0;
import d.w0;

@w0(18)
/* loaded from: classes.dex */
public final class c {
    public static void a(@o0 String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}