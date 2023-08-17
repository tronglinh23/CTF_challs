package androidx.activity.result;

import u4.l0;
import v3.m2;

/* loaded from: classes.dex */
public final class f {
    public static /* synthetic */ void a(t4.l lVar, Object obj) {
        f(lVar, obj);
    }

    public static /* synthetic */ void b(t4.l lVar, Object obj) {
        e(lVar, obj);
    }

    @n6.d
    public static final <I, O> i<m2> c(@n6.d c cVar, @n6.d c.a<I, O> aVar, I i7, @n6.d ActivityResultRegistry activityResultRegistry, @n6.d final t4.l<? super O, m2> lVar) {
        l0.p(cVar, "<this>");
        l0.p(aVar, "contract");
        l0.p(activityResultRegistry, "registry");
        l0.p(lVar, "callback");
        i<I> registerForActivityResult = cVar.registerForActivityResult(aVar, activityResultRegistry, new b() { // from class: androidx.activity.result.e
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                f.b(t4.l.this, obj);
            }
        });
        l0.o(registerForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new g(registerForActivityResult, aVar, i7);
    }

    @n6.d
    public static final <I, O> i<m2> d(@n6.d c cVar, @n6.d c.a<I, O> aVar, I i7, @n6.d final t4.l<? super O, m2> lVar) {
        l0.p(cVar, "<this>");
        l0.p(aVar, "contract");
        l0.p(lVar, "callback");
        i<I> registerForActivityResult = cVar.registerForActivityResult(aVar, new b() { // from class: androidx.activity.result.d
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                f.a(t4.l.this, obj);
            }
        });
        l0.o(registerForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new g(registerForActivityResult, aVar, i7);
    }

    public static final void e(t4.l lVar, Object obj) {
        l0.p(lVar, "$callback");
        lVar.O(obj);
    }

    public static final void f(t4.l lVar, Object obj) {
        l0.p(lVar, "$callback");
        lVar.O(obj);
    }
}