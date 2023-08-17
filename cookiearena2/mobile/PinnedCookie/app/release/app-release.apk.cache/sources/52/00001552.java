package kotlinx.coroutines.internal;

import v3.d1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f12836a;

    static {
        Object b7;
        try {
            d1.a aVar = v3.d1.f17778l;
            b7 = v3.d1.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            d1.a aVar2 = v3.d1.f17778l;
            b7 = v3.d1.b(v3.e1.a(th));
        }
        f12836a = v3.d1.j(b7);
    }

    public static final boolean a() {
        return f12836a;
    }
}