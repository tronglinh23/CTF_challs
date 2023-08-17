package z0;

import android.os.PersistableBundle;
import java.util.Map;
import u4.r1;

@r1({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
/* loaded from: classes.dex */
public final class u0 {
    @n6.d
    @d.w0(21)
    public static final PersistableBundle a() {
        return s0.a(0);
    }

    @n6.d
    @d.w0(21)
    public static final PersistableBundle b(@n6.d v3.u0<String, ? extends Object>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        PersistableBundle a7 = s0.a(u0VarArr.length);
        for (v3.u0<String, ? extends Object> u0Var : u0VarArr) {
            s0.b(a7, u0Var.a(), u0Var.b());
        }
        return a7;
    }

    @n6.d
    @d.w0(21)
    public static final PersistableBundle c(@n6.d Map<String, ? extends Object> map) {
        u4.l0.p(map, "<this>");
        PersistableBundle a7 = s0.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            s0.b(a7, entry.getKey(), entry.getValue());
        }
        return a7;
    }
}