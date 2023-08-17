package h4;

import i0.o2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import u4.l0;
import u4.r1;
import v3.g1;
@r1({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10313a = 1;

    public static final void a(int i7, int i8) {
        if (i8 <= i7) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i7 + ", got " + i8 + ". Please update the Kotlin standard library.").toString());
    }

    public static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    public static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField(o2.f10774k);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @s4.h(name = "getSpilledVariableFieldMapping")
    @g1(version = "1.3")
    @n6.e
    public static final String[] d(@n6.d a aVar) {
        l0.p(aVar, "<this>");
        f b7 = b(aVar);
        if (b7 == null) {
            return null;
        }
        a(1, b7.v());
        ArrayList arrayList = new ArrayList();
        int c7 = c(aVar);
        int[] i7 = b7.i();
        int length = i7.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i7[i8] == c7) {
                arrayList.add(b7.s()[i8]);
                arrayList.add(b7.n()[i8]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @s4.h(name = "getStackTraceElement")
    @g1(version = "1.3")
    @n6.e
    public static final StackTraceElement e(@n6.d a aVar) {
        String str;
        l0.p(aVar, "<this>");
        f b7 = b(aVar);
        if (b7 == null) {
            return null;
        }
        a(1, b7.v());
        int c7 = c(aVar);
        int i7 = c7 < 0 ? -1 : b7.l()[c7];
        String b8 = i.f10314a.b(aVar);
        if (b8 == null) {
            str = b7.c();
        } else {
            str = b8 + '/' + b7.c();
        }
        return new StackTraceElement(str, b7.m(), b7.f(), i7);
    }
}
