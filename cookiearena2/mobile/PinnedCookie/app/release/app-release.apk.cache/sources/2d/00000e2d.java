package d;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@w3.e(w3.a.f18193l)
@w3.f(allowedTargets = {w3.b.f18204s, w3.b.f18205t, w3.b.f18206u, w3.b.f18202q, w3.b.f18200o, w3.b.f18201p, w3.b.f18197l})
@w3.c
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface r {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final a f8158a = a.f8162a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f8159b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8160c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f8161d = 2;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8162a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f8163b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f8164c = 1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f8165d = 2;
    }

    int unit() default 1;
}