package d;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@w3.e(w3.a.f18193l)
@w3.f(allowedTargets = {w3.b.f18197l, w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18203r, w3.b.f18200o, w3.b.f18202q})
@w3.c
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface a1 {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @w3.f(allowedTargets = {w3.b.f18200o, w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18202q})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface a {
        a1 value() default @a1;
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @w3.f(allowedTargets = {w3.b.f18200o, w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18202q})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        a1 value() default @a1;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
