package n5;

/* loaded from: classes.dex */
public interface p<E> {

    /* loaded from: classes.dex */
    public static final class a {

        @h4.f(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
        /* renamed from: n5.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0193a<E> extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public Object f13973n;

            /* renamed from: o  reason: collision with root package name */
            public /* synthetic */ Object f13974o;

            /* renamed from: p  reason: collision with root package name */
            public int f13975p;

            public C0193a(e4.d<? super C0193a> dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f13974o = obj;
                this.f13975p |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        @s4.h(name = "next")
        @v3.k(level = v3.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ java.lang.Object a(n5.p r4, e4.d r5) {
            /*
                boolean r0 = r5 instanceof n5.p.a.C0193a
                if (r0 == 0) goto L13
                r0 = r5
                n5.p$a$a r0 = (n5.p.a.C0193a) r0
                int r1 = r0.f13975p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13975p = r1
                goto L18
            L13:
                n5.p$a$a r0 = new n5.p$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f13974o
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f13975p
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f13973n
                n5.p r4 = (n5.p) r4
                v3.e1.n(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                v3.e1.n(r5)
                r0.f13973n = r4
                r0.f13975p = r3
                java.lang.Object r5 = r4.b(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                n5.x r4 = new n5.x
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.p.a.a(n5.p, e4.d):java.lang.Object");
        }
    }

    @s4.h(name = "next")
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object a(e4.d dVar);

    @n6.e
    Object b(@n6.d e4.d<? super Boolean> dVar);

    E next();
}