package v3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@g1(version = "1.3")
@w3.e(w3.a.f18194m)
@w3.f(allowedTargets = {w3.b.f18196k})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface i0 {

    /* loaded from: classes.dex */
    public static final class a {
        @k(level = m.f17811k, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @g1(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @g1(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }

    @s4.h(name = "bv")
    int[] bv() default {1, 0, 3};

    @s4.h(name = "d1")
    String[] d1() default {};

    @s4.h(name = "d2")
    String[] d2() default {};

    @s4.h(name = "k")
    int k() default 1;

    @s4.h(name = "mv")
    int[] mv() default {};

    @s4.h(name = "pn")
    String pn() default "";

    @s4.h(name = "xi")
    int xi() default 0;

    @s4.h(name = "xs")
    String xs() default "";
}