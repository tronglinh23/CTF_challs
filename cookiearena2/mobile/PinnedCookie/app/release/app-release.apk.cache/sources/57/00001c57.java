package v3;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@w3.e(w3.a.f18193l)
@w3.f(allowedTargets = {w3.b.f18196k, w3.b.f18199n, w3.b.f18203r, w3.b.f18204s, w3.b.f18210y})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface q2 {
    Class<? extends Annotation>[] markerClass();
}