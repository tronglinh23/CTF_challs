package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlinx.coroutines.selects.a;
import t4.l;
import t4.p;
import u4.n0;
import v3.a1;
import v3.m2;

@a1
/* loaded from: classes.dex */
public final class j<R> implements kotlinx.coroutines.selects.a<R> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final kotlinx.coroutines.selects.b<R> f13040k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<t4.a<m2>> f13041l = new ArrayList<>();

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.a<m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.selects.c f13042l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ j<R> f13043m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ l<e4.d<? super R>, Object> f13044n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.selects.c cVar, j<? super R> jVar, l<? super e4.d<? super R>, ? extends Object> lVar) {
            super(0);
            this.f13042l = cVar;
            this.f13043m = jVar;
            this.f13044n = lVar;
        }

        public final void b() {
            this.f13042l.P(this.f13043m.b(), this.f13044n);
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            b();
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.selects.d<Q> f13045l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ j<R> f13046m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ p<Q, e4.d<? super R>, Object> f13047n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.selects.d<? extends Q> dVar, j<? super R> jVar, p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
            super(0);
            this.f13045l = dVar;
            this.f13046m = jVar;
            this.f13047n = pVar;
        }

        public final void b() {
            this.f13045l.c(this.f13046m.b(), this.f13047n);
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            b();
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.a<m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e<P, Q> f13048l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ j<R> f13049m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ P f13050n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ p<Q, e4.d<? super R>, Object> f13051o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e<? super P, ? extends Q> eVar, j<? super R> jVar, P p6, p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
            super(0);
            this.f13048l = eVar;
            this.f13049m = jVar;
            this.f13050n = p6;
            this.f13051o = pVar;
        }

        public final void b() {
            this.f13048l.H(this.f13049m.b(), this.f13050n, this.f13051o);
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            b();
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.a<m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ j<R> f13052l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ long f13053m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ l<e4.d<? super R>, Object> f13054n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(j<? super R> jVar, long j7, l<? super e4.d<? super R>, ? extends Object> lVar) {
            super(0);
            this.f13052l = jVar;
            this.f13053m = j7;
            this.f13054n = lVar;
        }

        public final void b() {
            this.f13052l.b().f(this.f13053m, this.f13054n);
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            b();
            return m2.f17815a;
        }
    }

    public j(@n6.d e4.d<? super R> dVar) {
        this.f13040k = new kotlinx.coroutines.selects.b<>(dVar);
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void G(@n6.d e<? super P, ? extends Q> eVar, P p6, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
        this.f13041l.add(new c(eVar, this, p6, pVar));
    }

    @n6.d
    public final ArrayList<t4.a<m2>> a() {
        return this.f13041l;
    }

    @n6.d
    public final kotlinx.coroutines.selects.b<R> b() {
        return this.f13040k;
    }

    @a1
    public final void c(@n6.d Throwable th) {
        this.f13040k.g1(th);
    }

    @n6.e
    @a1
    public final Object d() {
        if (!this.f13040k.p0()) {
            try {
                Collections.shuffle(this.f13041l);
                Iterator<T> it = this.f13041l.iterator();
                while (it.hasNext()) {
                    ((t4.a) it.next()).n();
                }
            } catch (Throwable th) {
                this.f13040k.g1(th);
            }
        }
        return this.f13040k.f1();
    }

    @Override // kotlinx.coroutines.selects.a
    public void f(long j7, @n6.d l<? super e4.d<? super R>, ? extends Object> lVar) {
        this.f13041l.add(new d(this, j7, lVar));
    }

    @Override // kotlinx.coroutines.selects.a
    public <Q> void h0(@n6.d kotlinx.coroutines.selects.d<? extends Q> dVar, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
        this.f13041l.add(new b(dVar, this, pVar));
    }

    @Override // kotlinx.coroutines.selects.a
    public void k(@n6.d kotlinx.coroutines.selects.c cVar, @n6.d l<? super e4.d<? super R>, ? extends Object> lVar) {
        this.f13041l.add(new a(cVar, this, lVar));
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void q0(@n6.d e<? super P, ? extends Q> eVar, @n6.d p<? super Q, ? super e4.d<? super R>, ? extends Object> pVar) {
        a.C0173a.a(this, eVar, pVar);
    }
}