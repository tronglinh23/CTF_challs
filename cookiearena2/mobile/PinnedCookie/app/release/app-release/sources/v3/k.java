package v3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@w3.f(allowedTargets = {w3.b.CLASS, w3.b.FUNCTION, w3.b.PROPERTY, w3.b.ANNOTATION_CLASS, w3.b.CONSTRUCTOR, w3.b.PROPERTY_SETTER, w3.b.PROPERTY_GETTER, w3.b.TYPEALIAS})
@w3.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface k {
    m level() default m.WARNING;

    String message();

    b1 replaceWith() default @b1(expression = "", imports = {});
}
