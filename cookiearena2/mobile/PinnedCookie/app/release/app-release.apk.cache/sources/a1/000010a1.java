package h5;

import k4.f;
import s4.h;

@h(name = "ProcessKt")
/* loaded from: classes.dex */
public final class a {
    @f
    public static final Void a(int i7) {
        System.exit(i7);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}