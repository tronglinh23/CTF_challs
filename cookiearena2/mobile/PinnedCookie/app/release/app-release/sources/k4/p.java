package k4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import u4.n1;
import v3.g1;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@g1(version = "1.2")
@Retention(RetentionPolicy.SOURCE)
@w3.e(w3.a.SOURCE)
@w3.f(allowedTargets = {w3.b.CLASS, w3.b.FUNCTION, w3.b.PROPERTY, w3.b.CONSTRUCTOR, w3.b.TYPEALIAS})
@w3.d
@Repeatable(a.class)
/* loaded from: classes.dex */
public @interface p {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @n1
    @w3.e(w3.a.SOURCE)
    @w3.f(allowedTargets = {w3.b.CLASS, w3.b.FUNCTION, w3.b.PROPERTY, w3.b.CONSTRUCTOR, w3.b.TYPEALIAS})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    v3.m level() default v3.m.ERROR;

    String message() default "";

    String version();

    q versionKind() default q.LANGUAGE_VERSION;
}
