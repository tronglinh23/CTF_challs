package h4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p0.x0;
import v3.g1;
@Target({ElementType.TYPE})
@g1(version = "1.3")
@w3.f(allowedTargets = {w3.b.f18196k})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface f {
    @s4.h(name = "c")
    String c() default "";

    @s4.h(name = "f")
    String f() default "";

    @s4.h(name = "i")
    int[] i() default {};

    @s4.h(name = "l")
    int[] l() default {};

    @s4.h(name = x0.f14590b)
    String m() default "";

    @s4.h(name = "n")
    String[] n() default {};

    @s4.h(name = "s")
    String[] s() default {};

    @s4.h(name = "v")
    int v() default 1;
}
