package s2;

import androidx.lifecycle.c1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u4.r1;
/* loaded from: classes.dex */
public final class y extends androidx.lifecycle.z0 implements z0 {
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final b f16552e = new b(null);
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final c1.b f16553f = new a();
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, androidx.lifecycle.e1> f16554d = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a implements c1.b {
        @Override // androidx.lifecycle.c1.b
        @n6.d
        public <T extends androidx.lifecycle.z0> T a(@n6.d Class<T> cls) {
            u4.l0.p(cls, "modelClass");
            return new y();
        }
    }

    @r1({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n+ 2 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProviderGetKt\n*L\n1#1,82:1\n374#2:83\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n*L\n78#1:83\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        public final y a(@n6.d androidx.lifecycle.e1 e1Var) {
            u4.l0.p(e1Var, "viewModelStore");
            return (y) new androidx.lifecycle.c1(e1Var, y.f16553f, null, 4, null).a(y.class);
        }

        public b() {
        }
    }

    @n6.d
    @s4.m
    public static final y j(@n6.d androidx.lifecycle.e1 e1Var) {
        return f16552e.a(e1Var);
    }

    @Override // s2.z0
    @n6.d
    public androidx.lifecycle.e1 a(@n6.d String str) {
        u4.l0.p(str, "backStackEntryId");
        androidx.lifecycle.e1 e1Var = this.f16554d.get(str);
        if (e1Var == null) {
            androidx.lifecycle.e1 e1Var2 = new androidx.lifecycle.e1();
            this.f16554d.put(str, e1Var2);
            return e1Var2;
        }
        return e1Var;
    }

    @Override // androidx.lifecycle.z0
    public void f() {
        Iterator<androidx.lifecycle.e1> it = this.f16554d.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f16554d.clear();
    }

    public final void i(@n6.d String str) {
        u4.l0.p(str, "backStackEntryId");
        androidx.lifecycle.e1 remove = this.f16554d.remove(str);
        if (remove != null) {
            remove.a();
        }
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.f16554d.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        u4.l0.o(sb2, "sb.toString()");
        return sb2;
    }
}
