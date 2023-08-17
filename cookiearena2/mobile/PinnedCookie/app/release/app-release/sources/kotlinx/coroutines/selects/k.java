package kotlinx.coroutines.selects;

import kotlinx.coroutines.c2;
import t4.l;
import u4.i0;
import v3.m2;
/* loaded from: classes.dex */
public final class k {

    @h4.f(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f13055n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f13056o;

        /* renamed from: p  reason: collision with root package name */
        public int f13057p;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f13056o = obj;
            this.f13057p |= Integer.MIN_VALUE;
            return k.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:25:0x0059). Please submit an issue!!! */
    @kotlinx.coroutines.c2
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@n6.d t4.l<? super kotlinx.coroutines.selects.a<? super java.lang.Boolean>, v3.m2> r4, @n6.d e4.d<? super v3.m2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.k.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.k$a r0 = (kotlinx.coroutines.selects.k.a) r0
            int r1 = r0.f13057p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13057p = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.k$a r0 = new kotlinx.coroutines.selects.k$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13056o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f13057p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f13055n
            t4.l r4 = (t4.l) r4
            v3.e1.n(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
        L38:
            r0.f13055n = r4
            r0.f13057p = r3
            kotlinx.coroutines.selects.b r5 = new kotlinx.coroutines.selects.b
            r5.<init>(r0)
            r4.O(r5)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r5.g1(r2)
        L49:
            java.lang.Object r5 = r5.f1()
            java.lang.Object r2 = g4.d.h()
            if (r5 != r2) goto L56
            h4.h.c(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            v3.m2 r4 = v3.m2.f17815a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.k.a(t4.l, e4.d):java.lang.Object");
    }

    @c2
    public static final Object b(l<? super kotlinx.coroutines.selects.a<? super Boolean>, m2> lVar, e4.d<? super m2> dVar) {
        Object f12;
        do {
            i0.e(0);
            b bVar = new b(dVar);
            try {
                lVar.O(bVar);
            } catch (Throwable th) {
                bVar.g1(th);
            }
            f12 = bVar.f1();
            if (f12 == g4.d.h()) {
                h4.h.c(dVar);
            }
            i0.e(1);
        } while (((Boolean) f12).booleanValue());
        return m2.f17815a;
    }
}
