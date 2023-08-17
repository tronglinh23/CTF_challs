package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class f0 {
    @s4.e
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final Object f11973a;
    @n6.d
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public final t4.l<Throwable, v3.m2> f11974b;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@n6.e Object obj, @n6.d t4.l<? super Throwable, v3.m2> lVar) {
        this.f11973a = obj;
        this.f11974b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f0 d(f0 f0Var, Object obj, t4.l lVar, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = f0Var.f11973a;
        }
        if ((i7 & 2) != 0) {
            lVar = f0Var.f11974b;
        }
        return f0Var.c(obj, lVar);
    }

    @n6.e
    public final Object a() {
        return this.f11973a;
    }

    @n6.d
    public final t4.l<Throwable, v3.m2> b() {
        return this.f11974b;
    }

    @n6.d
    public final f0 c(@n6.e Object obj, @n6.d t4.l<? super Throwable, v3.m2> lVar) {
        return new f0(obj, lVar);
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return u4.l0.g(this.f11973a, f0Var.f11973a) && u4.l0.g(this.f11974b, f0Var.f11974b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f11973a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f11974b.hashCode();
    }

    @n6.d
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f11973a + ", onCancellation=" + this.f11974b + ')';
    }
}