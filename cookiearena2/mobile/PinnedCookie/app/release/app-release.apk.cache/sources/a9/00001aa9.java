package s4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@w3.e(w3.a.f18192k)
@w3.f(allowedTargets = {w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18203r})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface u {
    Class<? extends Throwable>[] exceptionClasses();
}