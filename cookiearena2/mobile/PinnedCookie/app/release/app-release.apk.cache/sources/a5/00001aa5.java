package s4;

/* loaded from: classes.dex */
public class q extends Error {
    public q() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public q(@n6.e String str) {
        super(str);
    }

    public q(@n6.e String str, @n6.e Throwable th) {
        super(str, th);
    }

    public q(@n6.e Throwable th) {
        super(th);
    }
}