package s2;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class l {
    @d.d0

    /* renamed from: a  reason: collision with root package name */
    public final int f16379a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public u0 f16380b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public Bundle f16381c;

    @s4.i
    public l(@d.d0 int i7) {
        this(i7, null, null, 6, null);
    }

    @n6.e
    public final Bundle a() {
        return this.f16381c;
    }

    public final int b() {
        return this.f16379a;
    }

    @n6.e
    public final u0 c() {
        return this.f16380b;
    }

    public final void d(@n6.e Bundle bundle) {
        this.f16381c = bundle;
    }

    public final void e(@n6.e u0 u0Var) {
        this.f16380b = u0Var;
    }

    @s4.i
    public l(@d.d0 int i7, @n6.e u0 u0Var) {
        this(i7, u0Var, null, 4, null);
    }

    @s4.i
    public l(@d.d0 int i7, @n6.e u0 u0Var, @n6.e Bundle bundle) {
        this.f16379a = i7;
        this.f16380b = u0Var;
        this.f16381c = bundle;
    }

    public /* synthetic */ l(int i7, u0 u0Var, Bundle bundle, int i8, u4.w wVar) {
        this(i7, (i8 & 2) != 0 ? null : u0Var, (i8 & 4) != 0 ? null : bundle);
    }
}
