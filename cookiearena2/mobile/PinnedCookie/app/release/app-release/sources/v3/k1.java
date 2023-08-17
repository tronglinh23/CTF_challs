package v3;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE})
@g1(version = "1.8")
@w3.e(w3.a.f18193l)
@s
@w3.f(allowedTargets = {w3.b.f18196k})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface k1 {
    Class<? extends Annotation> markerClass();
}
