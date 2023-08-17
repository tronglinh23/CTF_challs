package k2;

import androidx.lifecycle.c1;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t4.l;
import u4.l0;
import u4.r1;
@r1({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
@g
/* loaded from: classes.dex */
public final class c {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final List<h<?>> f11628a = new ArrayList();

    public final <T extends z0> void a(@n6.d e5.d<T> dVar, @n6.d l<? super a, ? extends T> lVar) {
        l0.p(dVar, "clazz");
        l0.p(lVar, "initializer");
        this.f11628a.add(new h<>(s4.a.d(dVar), lVar));
    }

    @n6.d
    public final c1.b b() {
        h[] hVarArr = (h[]) this.f11628a.toArray(new h[0]);
        return new b((h[]) Arrays.copyOf(hVarArr, hVarArr.length));
    }
}
