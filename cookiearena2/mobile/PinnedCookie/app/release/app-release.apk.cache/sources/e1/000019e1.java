package s2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f16251a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f16252b = new Bundle();

    public a(int i7) {
        this.f16251a = i7;
    }

    public static /* synthetic */ a d(a aVar, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = aVar.f16251a;
        }
        return aVar.c(i7);
    }

    @Override // s2.j0
    public int a() {
        return this.f16251a;
    }

    public final int b() {
        return this.f16251a;
    }

    @n6.d
    public final a c(int i7) {
        return new a(i7);
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && u4.l0.g(a.class, obj.getClass()) && a() == ((a) obj).a();
    }

    @Override // s2.j0
    @n6.d
    public Bundle f() {
        return this.f16252b;
    }

    public int hashCode() {
        return 31 + a();
    }

    @n6.d
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + a() + ')';
    }
}