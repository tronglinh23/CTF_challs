package i3;

import android.util.Log;
import d.b1;
import d.o0;
import d.q0;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11010a = "StartupLogger";

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f11011b = false;

    public static void a(@o0 String str, @q0 Throwable th) {
        Log.e(f11010a, str, th);
    }

    public static void b(@o0 String str) {
        Log.i(f11010a, str);
    }

    public static void c(@o0 String str) {
        Log.w(f11010a, str);
    }
}
