package m6;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface a {
    @n6.c

    /* renamed from: j  reason: collision with root package name */
    public static final String f13560j = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    @n6.c

    /* renamed from: k  reason: collision with root package name */
    public static final String f13561k = "this";
    @n6.c

    /* renamed from: l  reason: collision with root package name */
    public static final String f13562l = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    @n6.c

    /* renamed from: m  reason: collision with root package name */
    public static final String f13563m = "The return value of this method";
    @n6.c

    /* renamed from: n  reason: collision with root package name */
    public static final String f13564n = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
