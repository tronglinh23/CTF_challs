package s4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@w3.e(w3.a.f18193l)
@w3.f(allowedTargets = {w3.b.f18196k, w3.b.f18204s, w3.b.f18199n, w3.b.f18207v})
@w3.c
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface n {
    boolean suppress() default true;
}