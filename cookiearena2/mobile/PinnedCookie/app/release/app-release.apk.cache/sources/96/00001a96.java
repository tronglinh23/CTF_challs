package s4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import v3.g1;

@Target({ElementType.METHOD})
@g1(version = "1.2")
@v3.k(message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`")
@w3.f(allowedTargets = {w3.b.f18204s, w3.b.f18199n})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface b {
}