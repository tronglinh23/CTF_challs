package v3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@g1(version = "1.4")
@w3.f(allowedTargets = {w3.b.f18196k, w3.b.f18204s, w3.b.f18199n, w3.b.f18197l, w3.b.f18203r, w3.b.f18206u, w3.b.f18205t, w3.b.f18210y})
@w3.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface l {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}