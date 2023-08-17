package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import u4.l0;
import u4.n0;
import v3.d0;
import v3.f0;
import v3.m2;
/* loaded from: classes.dex */
public final class g<I, O> extends i<m2> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final i<I> f589a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final c.a<I, O> f590b;

    /* renamed from: c  reason: collision with root package name */
    public final I f591c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final d0 f592d;

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.a<C0016a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ g<I, O> f593l;

        /* renamed from: androidx.activity.result.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0016a extends c.a<m2, O> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g<I, O> f594a;

            public C0016a(g<I, O> gVar) {
                this.f594a = gVar;
            }

            @Override // c.a
            public O c(int i7, @n6.e Intent intent) {
                return this.f594a.e().c(i7, intent);
            }

            @Override // c.a
            @n6.d
            /* renamed from: d  reason: merged with bridge method [inline-methods] */
            public Intent a(@n6.d Context context, @n6.d m2 m2Var) {
                l0.p(context, "context");
                l0.p(m2Var, "input");
                return this.f594a.e().a(context, this.f594a.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g<I, O> gVar) {
            super(0);
            this.f593l = gVar;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final C0016a n() {
            return new C0016a(this.f593l);
        }
    }

    public g(@n6.d i<I> iVar, @n6.d c.a<I, O> aVar, I i7) {
        l0.p(iVar, "launcher");
        l0.p(aVar, "callerContract");
        this.f589a = iVar;
        this.f590b = aVar;
        this.f591c = i7;
        this.f592d = f0.b(new a(this));
    }

    @Override // androidx.activity.result.i
    @n6.d
    public c.a<m2, ?> a() {
        return (c.a<m2, O>) h();
    }

    @Override // androidx.activity.result.i
    public void d() {
        this.f589a.d();
    }

    @n6.d
    public final c.a<I, O> e() {
        return this.f590b;
    }

    public final I f() {
        return this.f591c;
    }

    @n6.d
    public final i<I> g() {
        return this.f589a;
    }

    @n6.d
    public final c.a<m2, O> h() {
        return (c.a) this.f592d.getValue();
    }

    @Override // androidx.activity.result.i
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public void c(@n6.d m2 m2Var, @n6.e i0.i iVar) {
        l0.p(m2Var, "input");
        this.f589a.c(this.f591c, iVar);
    }
}
