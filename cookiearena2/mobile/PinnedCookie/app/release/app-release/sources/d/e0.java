package d;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@w3.e(w3.a.f18192k)
@v3.k(message = "Replaced by the {@code androidx.resourceinpsection} package.")
@w3.f(allowedTargets = {w3.b.f18204s, w3.b.f18205t, w3.b.f18206u})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface e0 {

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @w3.e(w3.a.f18192k)
    @w3.f(allowedTargets = {w3.b.f18197l, w3.b.f18196k})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
        String name();

        int value();
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @w3.e(w3.a.f18192k)
    @w3.f(allowedTargets = {w3.b.f18197l, w3.b.f18196k})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
        int mask() default 0;

        String name();

        int target();
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    int attributeId() default 0;

    a[] enumMapping() default {};

    b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    c valueType() default c.INFERRED;
}
