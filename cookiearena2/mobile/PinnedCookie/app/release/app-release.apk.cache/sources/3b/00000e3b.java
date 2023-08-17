package d;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@w3.e(w3.a.f18193l)
@w3.f(allowedTargets = {w3.b.f18197l, w3.b.f18196k, w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18203r, w3.b.f18200o, w3.b.f18209x})
@w3.c
@w3.d
@Documented
@Repeatable(a.class)
/* loaded from: classes.dex */
public @interface x0 {

    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @u4.n1
    @w3.e(w3.a.f18193l)
    @w3.f(allowedTargets = {w3.b.f18197l, w3.b.f18196k, w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18203r, w3.b.f18200o, w3.b.f18209x})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface a {
        x0[] value();
    }

    int extension();

    int version();
}