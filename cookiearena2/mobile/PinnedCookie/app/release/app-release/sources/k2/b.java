package k2;

import androidx.lifecycle.c1;
import androidx.lifecycle.z0;
import u4.l0;
import u4.r1;
@r1({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public final class b implements c1.b {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final h<?>[] f11627b;

    public b(@n6.d h<?>... hVarArr) {
        l0.p(hVarArr, "initializers");
        this.f11627b = hVarArr;
    }

    @Override // androidx.lifecycle.c1.b
    @n6.d
    public <T extends z0> T b(@n6.d Class<T> cls, @n6.d a aVar) {
        l0.p(cls, "modelClass");
        l0.p(aVar, "extras");
        T t6 = null;
        for (h<?> hVar : this.f11627b) {
            if (l0.g(hVar.a(), cls)) {
                Object O = hVar.b().O(aVar);
                t6 = O instanceof z0 ? (T) O : null;
            }
        }
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
