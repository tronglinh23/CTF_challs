package a;

import android.content.Context;
import h4.h;
import kotlinx.coroutines.q;
import kotlinx.coroutines.r;
import n6.e;
import t4.l;
import u4.i0;
import u4.l0;
import u4.n0;
import v3.d1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements l<Throwable, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ a.a f4l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ b f5m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.a aVar, b bVar) {
            super(1);
            this.f4l = aVar;
            this.f5m = bVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@e Throwable th) {
            this.f4l.k(this.f5m);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q<R> f6a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Context, R> f7b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(q<? super R> qVar, l<? super Context, ? extends R> lVar) {
            this.f6a = qVar;
            this.f7b = lVar;
        }

        @Override // a.d
        public void a(@n6.d Context context) {
            Object b7;
            l0.p(context, "context");
            e4.d dVar = this.f6a;
            l<Context, R> lVar = this.f7b;
            try {
                d1.a aVar = d1.f17778l;
                b7 = d1.b(lVar.O(context));
            } catch (Throwable th) {
                d1.a aVar2 = d1.f17778l;
                b7 = d1.b(e1.a(th));
            }
            dVar.D(b7);
        }
    }

    @e
    public static final <R> Object a(@n6.d a.a aVar, @n6.d l<? super Context, ? extends R> lVar, @n6.d e4.d<? super R> dVar) {
        Context l7 = aVar.l();
        if (l7 != null) {
            return lVar.O(l7);
        }
        r rVar = new r(g4.c.d(dVar), 1);
        rVar.x();
        b bVar = new b(rVar, lVar);
        aVar.c(bVar);
        rVar.N(new a(aVar, bVar));
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h.c(dVar);
        }
        return A;
    }

    public static final <R> Object b(a.a aVar, l<? super Context, ? extends R> lVar, e4.d<? super R> dVar) {
        Context l7 = aVar.l();
        if (l7 != null) {
            return lVar.O(l7);
        }
        i0.e(0);
        r rVar = new r(g4.c.d(dVar), 1);
        rVar.x();
        b bVar = new b(rVar, lVar);
        aVar.c(bVar);
        rVar.N(new a(aVar, bVar));
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h.c(dVar);
        }
        i0.e(1);
        return A;
    }
}
