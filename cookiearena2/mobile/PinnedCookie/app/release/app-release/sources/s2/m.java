package s2;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import u4.r1;
import v3.m2;
@r1({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,259:1\n37#2,2:260\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n*L\n206#1:260,2\n*E\n"})
@i0
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public int f16386a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f16387b = new LinkedHashMap();
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public u0 f16388c;

    @n6.d
    public final l a() {
        Bundle b7;
        int i7 = this.f16386a;
        u0 u0Var = this.f16388c;
        if (this.f16387b.isEmpty()) {
            b7 = null;
        } else {
            v3.u0[] u0VarArr = (v3.u0[]) x3.c1.J1(this.f16387b).toArray(new v3.u0[0]);
            b7 = z0.i.b((v3.u0[]) Arrays.copyOf(u0VarArr, u0VarArr.length));
        }
        return new l(i7, u0Var, b7);
    }

    @n6.d
    public final Map<String, Object> b() {
        return this.f16387b;
    }

    public final int c() {
        return this.f16386a;
    }

    public final void d(@n6.d t4.l<? super v0, m2> lVar) {
        u4.l0.p(lVar, "optionsBuilder");
        v0 v0Var = new v0();
        lVar.O(v0Var);
        this.f16388c = v0Var.b();
    }

    public final void e(int i7) {
        this.f16386a = i7;
    }
}
