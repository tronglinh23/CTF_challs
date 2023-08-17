package kotlinx.coroutines.selects;

import kotlinx.coroutines.c2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.r0;
import t4.l;
import u4.i0;
import v3.m2;
/* loaded from: classes.dex */
public final class g {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13034a = new r0("NOT_SELECTED");
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final Object f13035b = new r0("ALREADY_SELECTED");
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final Object f13036c = new r0("UNDECIDED");
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final Object f13037d = new r0("RESUMED");
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final i f13038e = new i();

    public static final /* synthetic */ Object a() {
        return f13037d;
    }

    public static final /* synthetic */ i b() {
        return f13038e;
    }

    public static final /* synthetic */ Object c() {
        return f13036c;
    }

    @n6.d
    public static final Object d() {
        return f13035b;
    }

    public static /* synthetic */ void e() {
    }

    @n6.d
    public static final Object f() {
        return f13034a;
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c2
    public static final <R> void k(@n6.d a<? super R> aVar, long j7, @n6.d l<? super e4.d<? super R>, ? extends Object> lVar) {
        aVar.f(f1.e(j7), lVar);
    }

    @n6.e
    public static final <R> Object l(@n6.d l<? super a<? super R>, m2> lVar, @n6.d e4.d<? super R> dVar) {
        b bVar = new b(dVar);
        try {
            lVar.O(bVar);
        } catch (Throwable th) {
            bVar.g1(th);
        }
        Object f12 = bVar.f1();
        if (f12 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return f12;
    }

    public static final <R> Object m(l<? super a<? super R>, m2> lVar, e4.d<? super R> dVar) {
        i0.e(0);
        b bVar = new b(dVar);
        try {
            lVar.O(bVar);
        } catch (Throwable th) {
            bVar.g1(th);
        }
        Object f12 = bVar.f1();
        if (f12 == g4.d.h()) {
            h4.h.c(dVar);
        }
        i0.e(1);
        return f12;
    }
}
