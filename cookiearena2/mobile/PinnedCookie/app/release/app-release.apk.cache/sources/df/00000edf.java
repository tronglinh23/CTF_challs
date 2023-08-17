package e;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import v3.b1;
import v3.k;
import w3.e;
import w3.f;

@Target({ElementType.ANNOTATION_TYPE})
@e(w3.a.f18193l)
@k(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @b1(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@f(allowedTargets = {w3.b.f18197l})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface a {

    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0097a {
        WARNING,
        ERROR
    }

    EnumC0097a level() default EnumC0097a.ERROR;
}