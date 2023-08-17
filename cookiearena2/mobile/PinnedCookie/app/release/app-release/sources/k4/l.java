package k4;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import u4.l0;
import u4.r1;
import x3.w;
@r1({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes.dex */
public class l {

    @r1({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f11765a = new a();
        @s4.e
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public static final Method f11766b;
        @s4.e
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public static final Method f11767c;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[LOOP:0: B:3:0x0015->B:13:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[EDGE_INSN: B:24:0x0043->B:15:0x0043 BREAK  A[LOOP:0: B:3:0x0015->B:13:0x003f], SYNTHETIC] */
        static {
            /*
                k4.l$a r0 = new k4.l$a
                r0.<init>()
                k4.l.a.f11765a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                u4.l0.o(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = u4.l0.g(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                u4.l0.o(r7, r8)
                java.lang.Object r7 = x3.p.bu(r7)
                boolean r7 = u4.l0.g(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                k4.l.a.f11766b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = u4.l0.g(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                k4.l.a.f11767c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k4.l.a.<clinit>():void");
        }
    }

    public void a(@n6.d Throwable th, @n6.d Throwable th2) {
        l0.p(th, "cause");
        l0.p(th2, "exception");
        Method method = a.f11766b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    @n6.d
    public b5.f b() {
        return new b5.b();
    }

    @n6.e
    public i5.j c(@n6.d MatchResult matchResult, @n6.d String str) {
        l0.p(matchResult, "matchResult");
        l0.p(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @n6.d
    public List<Throwable> d(@n6.d Throwable th) {
        Object invoke;
        List<Throwable> t6;
        l0.p(th, "exception");
        Method method = a.f11767c;
        return (method == null || (invoke = method.invoke(th, new Object[0])) == null || (t6 = x3.o.t((Throwable[]) invoke)) == null) ? w.E() : t6;
    }
}
