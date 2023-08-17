package d;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@w3.e(w3.a.f18193l)
@w3.f(allowedTargets = {w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18197l, w3.b.f18196k, w3.b.f18203r})
@w3.c
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface p {
    int api();

    String message() default "";
}