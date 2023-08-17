package e;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import v3.b1;
import v3.k;
import w3.e;
import w3.f;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@e(w3.a.f18193l)
@k(message = "This annotation has been replaced by `@OptIn`", replaceWith = @b1(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@f(allowedTargets = {w3.b.f18196k, w3.b.f18199n, w3.b.f18201p, w3.b.f18202q, w3.b.f18203r, w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18209x, w3.b.f18210y})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface c {
    Class<? extends Annotation>[] markerClass();
}
