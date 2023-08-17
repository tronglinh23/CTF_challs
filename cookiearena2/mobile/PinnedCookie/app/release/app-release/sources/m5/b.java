package m5;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.p0;
/* loaded from: classes.dex */
public final class b extends e4.a implements p0 {
    @n6.e
    private volatile Object _preHandler;

    public b() {
        super(p0.f12928b);
        this._preHandler = this;
    }

    @Override // kotlinx.coroutines.p0
    public void I0(@n6.d e4.g gVar, @n6.d Throwable th) {
        if (Build.VERSION.SDK_INT < 28) {
            Method V0 = V0();
            Object invoke = V0 != null ? V0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public final Method V0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z6 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z6 = true;
                }
            }
            if (z6) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }
}
