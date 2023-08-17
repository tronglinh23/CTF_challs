package d;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.ANNOTATION_TYPE})
@w3.e(w3.a.f18193l)
@w3.f(allowedTargets = {w3.b.f18197l})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface z0 {

    /* loaded from: classes.dex */
    public enum a {
        WARNING,
        ERROR
    }

    a level() default a.ERROR;
}
