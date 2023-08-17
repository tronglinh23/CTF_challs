package q5;

import e4.d;
import g4.c;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.m;
import n6.e;
import t4.l;
import t4.p;
import v3.d1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class a {
    public static final void a(d<?> dVar, Throwable th) {
        d1.a aVar = d1.f17778l;
        dVar.D(d1.b(e1.a(th)));
        throw th;
    }

    public static final void b(d<?> dVar, t4.a<m2> aVar) {
        try {
            aVar.n();
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final void c(@n6.d d<? super m2> dVar, @n6.d d<?> dVar2) {
        try {
            d d7 = c.d(dVar);
            d1.a aVar = d1.f17778l;
            m.g(d7, d1.b(m2.f17815a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    @i2
    public static final <T> void d(@n6.d l<? super d<? super T>, ? extends Object> lVar, @n6.d d<? super T> dVar) {
        try {
            d d7 = c.d(c.b(lVar, dVar));
            d1.a aVar = d1.f17778l;
            m.g(d7, d1.b(m2.f17815a), null, 2, null);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final <R, T> void e(@n6.d p<? super R, ? super d<? super T>, ? extends Object> pVar, R r6, @n6.d d<? super T> dVar, @e l<? super Throwable, m2> lVar) {
        try {
            d d7 = c.d(c.c(pVar, r6, dVar));
            d1.a aVar = d1.f17778l;
            m.f(d7, d1.b(m2.f17815a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, d dVar, l lVar, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            lVar = null;
        }
        e(pVar, obj, dVar, lVar);
    }
}
