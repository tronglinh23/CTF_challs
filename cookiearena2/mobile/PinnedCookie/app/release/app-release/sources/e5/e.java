package e5;

import u4.l0;
import u4.r1;
import v3.g1;
import v3.q2;
@s4.h(name = "KClasses")
@r1({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @k4.h
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T> T a(@n6.d d<T> dVar, @n6.e Object obj) {
        l0.p(dVar, "<this>");
        if (dVar.Q(obj)) {
            l0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @k4.h
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <T> T b(@n6.d d<T> dVar, @n6.e Object obj) {
        l0.p(dVar, "<this>");
        if (dVar.Q(obj)) {
            l0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return obj;
        }
        return null;
    }
}
