package j3;

import android.os.Trace;
import d.o0;
import d.w0;

@w0(29)
/* loaded from: classes.dex */
public final class d {
    public static void a(@o0 String str, int i7) {
        Trace.beginAsyncSection(str, i7);
    }

    public static void b(@o0 String str, int i7) {
        Trace.endAsyncSection(str, i7);
    }

    public static void c(@o0 String str, int i7) {
        Trace.setCounter(str, i7);
    }
}