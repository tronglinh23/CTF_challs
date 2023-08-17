package s2;

import android.os.Bundle;
import d.b1;

/* loaded from: classes.dex */
public final class q {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final y0<Object> f16417a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16418b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16419c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public final Object f16420d;

    /* loaded from: classes.dex */
    public static final class a {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public y0<Object> f16421a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16422b;
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public Object f16423c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16424d;

        @n6.d
        public final q a() {
            y0<Object> y0Var = this.f16421a;
            if (y0Var == null) {
                y0Var = y0.f16555c.c(this.f16423c);
                u4.l0.n(y0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new q(y0Var, this.f16422b, this.f16423c, this.f16424d);
        }

        @n6.d
        public final a b(@n6.e Object obj) {
            this.f16423c = obj;
            this.f16424d = true;
            return this;
        }

        @n6.d
        public final a c(boolean z6) {
            this.f16422b = z6;
            return this;
        }

        @n6.d
        public final <T> a d(@n6.d y0<T> y0Var) {
            u4.l0.p(y0Var, "type");
            this.f16421a = y0Var;
            return this;
        }
    }

    public q(@n6.d y0<Object> y0Var, boolean z6, @n6.e Object obj, boolean z7) {
        u4.l0.p(y0Var, "type");
        if (!(y0Var.f() || !z6)) {
            throw new IllegalArgumentException((y0Var.c() + " does not allow nullable values").toString());
        }
        if ((!z6 && z7 && obj == null) ? false : true) {
            this.f16417a = y0Var;
            this.f16418b = z6;
            this.f16420d = obj;
            this.f16419c = z7;
            return;
        }
        throw new IllegalArgumentException(("Argument with type " + y0Var.c() + " has null value but is not nullable.").toString());
    }

    @n6.e
    public final Object a() {
        return this.f16420d;
    }

    @n6.d
    public final y0<Object> b() {
        return this.f16417a;
    }

    public final boolean c() {
        return this.f16419c;
    }

    public final boolean d() {
        return this.f16418b;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void e(@n6.d String str, @n6.d Bundle bundle) {
        u4.l0.p(str, "name");
        u4.l0.p(bundle, "bundle");
        if (this.f16419c) {
            this.f16417a.k(bundle, str, this.f16420d);
        }
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !u4.l0.g(q.class, obj.getClass())) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f16418b == qVar.f16418b && this.f16419c == qVar.f16419c && u4.l0.g(this.f16417a, qVar.f16417a)) {
            Object obj2 = this.f16420d;
            return obj2 != null ? u4.l0.g(obj2, qVar.f16420d) : qVar.f16420d == null;
        }
        return false;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final boolean f(@n6.d String str, @n6.d Bundle bundle) {
        u4.l0.p(str, "name");
        u4.l0.p(bundle, "bundle");
        if (!this.f16418b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f16417a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = ((((this.f16417a.hashCode() * 31) + (this.f16418b ? 1 : 0)) * 31) + (this.f16419c ? 1 : 0)) * 31;
        Object obj = this.f16420d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.class.getSimpleName());
        sb.append(" Type: " + this.f16417a);
        sb.append(" Nullable: " + this.f16418b);
        if (this.f16419c) {
            sb.append(" DefaultValue: " + this.f16420d);
        }
        String sb2 = sb.toString();
        u4.l0.o(sb2, "sb.toString()");
        return sb2;
    }
}