package d;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.ANNOTATION_TYPE})
@w3.e(w3.a.f18192k)
@w3.f(allowedTargets = {w3.b.f18197l})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface f0 {
    boolean flag() default false;

    boolean open() default false;

    int[] value() default {};
}
