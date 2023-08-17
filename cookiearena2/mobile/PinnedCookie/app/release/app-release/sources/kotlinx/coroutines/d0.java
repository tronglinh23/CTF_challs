package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class d0 {
    @s4.e
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final Object f11863a;
    @s4.e
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final o f11864b;
    @s4.e
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final t4.l<Throwable, v3.m2> f11865c;
    @s4.e
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public final Object f11866d;
    @s4.e
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f11867e;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@n6.e Object obj, @n6.e o oVar, @n6.e t4.l<? super Throwable, v3.m2> lVar, @n6.e Object obj2, @n6.e Throwable th) {
        this.f11863a = obj;
        this.f11864b = oVar;
        this.f11865c = lVar;
        this.f11866d = obj2;
        this.f11867e = th;
    }

    public static /* synthetic */ d0 g(d0 d0Var, Object obj, o oVar, t4.l lVar, Object obj2, Throwable th, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = d0Var.f11863a;
        }
        if ((i7 & 2) != 0) {
            oVar = d0Var.f11864b;
        }
        o oVar2 = oVar;
        t4.l<Throwable, v3.m2> lVar2 = lVar;
        if ((i7 & 4) != 0) {
            lVar2 = d0Var.f11865c;
        }
        t4.l lVar3 = lVar2;
        if ((i7 & 8) != 0) {
            obj2 = d0Var.f11866d;
        }
        Object obj4 = obj2;
        if ((i7 & 16) != 0) {
            th = d0Var.f11867e;
        }
        return d0Var.f(obj, oVar2, lVar3, obj4, th);
    }

    @n6.e
    public final Object a() {
        return this.f11863a;
    }

    @n6.e
    public final o b() {
        return this.f11864b;
    }

    @n6.e
    public final t4.l<Throwable, v3.m2> c() {
        return this.f11865c;
    }

    @n6.e
    public final Object d() {
        return this.f11866d;
    }

    @n6.e
    public final Throwable e() {
        return this.f11867e;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return u4.l0.g(this.f11863a, d0Var.f11863a) && u4.l0.g(this.f11864b, d0Var.f11864b) && u4.l0.g(this.f11865c, d0Var.f11865c) && u4.l0.g(this.f11866d, d0Var.f11866d) && u4.l0.g(this.f11867e, d0Var.f11867e);
        }
        return false;
    }

    @n6.d
    public final d0 f(@n6.e Object obj, @n6.e o oVar, @n6.e t4.l<? super Throwable, v3.m2> lVar, @n6.e Object obj2, @n6.e Throwable th) {
        return new d0(obj, oVar, lVar, obj2, th);
    }

    public final boolean h() {
        return this.f11867e != null;
    }

    public int hashCode() {
        Object obj = this.f11863a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        o oVar = this.f11864b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        t4.l<Throwable, v3.m2> lVar = this.f11865c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f11866d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f11867e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void i(@n6.d r<?> rVar, @n6.d Throwable th) {
        o oVar = this.f11864b;
        if (oVar != null) {
            rVar.m(oVar, th);
        }
        t4.l<Throwable, v3.m2> lVar = this.f11865c;
        if (lVar != null) {
            rVar.s(lVar, th);
        }
    }

    @n6.d
    public String toString() {
        return "CompletedContinuation(result=" + this.f11863a + ", cancelHandler=" + this.f11864b + ", onCancellation=" + this.f11865c + ", idempotentResume=" + this.f11866d + ", cancelCause=" + this.f11867e + ')';
    }

    public /* synthetic */ d0(Object obj, o oVar, t4.l lVar, Object obj2, Throwable th, int i7, u4.w wVar) {
        this(obj, (i7 & 2) != 0 ? null : oVar, (i7 & 4) != 0 ? null : lVar, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : th);
    }
}
