package v3;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@g1(version = "1.3")
@w3.e(w3.a.f18192k)
@w3.f(allowedTargets = {w3.b.f18196k, w3.b.f18199n, w3.b.f18201p, w3.b.f18202q, w3.b.f18203r, w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18208w, w3.b.f18209x, w3.b.f18210y})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface r0 {
    Class<? extends Annotation>[] markerClass();
}