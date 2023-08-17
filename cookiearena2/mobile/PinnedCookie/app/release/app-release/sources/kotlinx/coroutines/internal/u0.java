package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final /* synthetic */ class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12849a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f12849a;
    }

    @n6.e
    public static final String b(@n6.d String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
