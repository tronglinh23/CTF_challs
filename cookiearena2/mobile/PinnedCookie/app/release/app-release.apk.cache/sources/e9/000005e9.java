package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import i0.x2;
import java.util.Map;
import u4.r1;

@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n215#2,2:222\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:222,2\n*E\n"})
/* loaded from: classes.dex */
public final class t0 implements a.c {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final androidx.savedstate.a f4836a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4837b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public Bundle f4838c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final v3.d0 f4839d;

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.a<u0> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ f1 f4840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1 f1Var) {
            super(0);
            this.f4840l = f1Var;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final u0 n() {
            return s0.e(this.f4840l);
        }
    }

    public t0(@n6.d androidx.savedstate.a aVar, @n6.d f1 f1Var) {
        u4.l0.p(aVar, "savedStateRegistry");
        u4.l0.p(f1Var, "viewModelStoreOwner");
        this.f4836a = aVar;
        this.f4839d = v3.f0.b(new a(f1Var));
    }

    @Override // androidx.savedstate.a.c
    @n6.d
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4838c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, r0> entry : c().h().entrySet()) {
            String key = entry.getKey();
            Bundle a7 = entry.getValue().o().a();
            if (!u4.l0.g(a7, Bundle.EMPTY)) {
                bundle.putBundle(key, a7);
            }
        }
        this.f4837b = false;
        return bundle;
    }

    @n6.e
    public final Bundle b(@n6.d String str) {
        u4.l0.p(str, x2.f10960j);
        d();
        Bundle bundle = this.f4838c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f4838c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f4838c;
        boolean z6 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z6 = true;
        }
        if (z6) {
            this.f4838c = null;
        }
        return bundle2;
    }

    public final u0 c() {
        return (u0) this.f4839d.getValue();
    }

    public final void d() {
        if (this.f4837b) {
            return;
        }
        this.f4838c = this.f4836a.b(s0.f4831b);
        this.f4837b = true;
        c();
    }
}