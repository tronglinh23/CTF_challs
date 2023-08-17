package kotlinx.coroutines;

import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class f {

    @h4.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f11965n;

        /* renamed from: o  reason: collision with root package name */
        public int f11966o;

        /* renamed from: p  reason: collision with root package name */
        public int f11967p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f11968q;

        /* renamed from: r  reason: collision with root package name */
        public int f11969r;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f11968q = obj;
            this.f11969r |= Integer.MIN_VALUE;
            return f.d(null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f11970n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f11971o;

        /* renamed from: p  reason: collision with root package name */
        public int f11972p;

        public b(e4.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f11971o = obj;
            this.f11972p |= Integer.MIN_VALUE;
            return f.c(null, this);
        }
    }

    @n6.e
    public static final <T> Object a(@n6.d Collection<? extends c1<? extends T>> collection, @n6.d e4.d<? super List<? extends T>> dVar) {
        if (collection.isEmpty()) {
            return x3.w.E();
        }
        Object[] array = collection.toArray(new c1[0]);
        if (array != null) {
            return new e((c1[]) array).b(dVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @n6.e
    public static final <T> Object b(@n6.d c1<? extends T>[] c1VarArr, @n6.d e4.d<? super List<? extends T>> dVar) {
        return c1VarArr.length == 0 ? x3.w.E() : new e(c1VarArr).b(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@n6.d java.util.Collection<? extends kotlinx.coroutines.n2> r4, @n6.d e4.d<? super v3.m2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.f.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.f$b r0 = (kotlinx.coroutines.f.b) r0
            int r1 = r0.f11972p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11972p = r1
            goto L18
        L13:
            kotlinx.coroutines.f$b r0 = new kotlinx.coroutines.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11971o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f11972p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f11970n
            java.util.Iterator r4 = (java.util.Iterator) r4
            v3.e1.n(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            v3.e1.n(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.n2 r5 = (kotlinx.coroutines.n2) r5
            r0.f11970n = r4
            r0.f11972p = r3
            java.lang.Object r5 = r5.E0(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            v3.m2 r4 = v3.m2.f17815a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.c(java.util.Collection, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please submit an issue!!! */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@n6.d kotlinx.coroutines.n2[] r6, @n6.d e4.d<? super v3.m2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.f.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.f$a r0 = (kotlinx.coroutines.f.a) r0
            int r1 = r0.f11969r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11969r = r1
            goto L18
        L13:
            kotlinx.coroutines.f$a r0 = new kotlinx.coroutines.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11968q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f11969r
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f11967p
            int r2 = r0.f11966o
            java.lang.Object r4 = r0.f11965n
            kotlinx.coroutines.n2[] r4 = (kotlinx.coroutines.n2[]) r4
            v3.e1.n(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            v3.e1.n(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f11965n = r7
            r0.f11966o = r2
            r0.f11967p = r6
            r0.f11969r = r3
            java.lang.Object r4 = r4.E0(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            v3.m2 r6 = v3.m2.f17815a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.f.d(kotlinx.coroutines.n2[], e4.d):java.lang.Object");
    }
}
