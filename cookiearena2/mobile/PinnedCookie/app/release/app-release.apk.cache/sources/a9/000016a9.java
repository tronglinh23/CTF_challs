package m4;

import b5.f;
import d5.l;
import i5.j;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import n6.d;
import s4.e;
import u4.l0;
import u4.r1;

/* loaded from: classes.dex */
public class a extends l4.a {

    @r1({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* renamed from: m4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0183a {
        @d

        /* renamed from: a  reason: collision with root package name */
        public static final C0183a f13544a = new C0183a();
        @e
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f13545b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                m4.a$a r0 = new m4.a$a
                r0.<init>()
                m4.a.C0183a.f13544a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                m4.a.C0183a.f13545b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.a.C0183a.<clinit>():void");
        }
    }

    private final boolean e(int i7) {
        Integer num = C0183a.f13545b;
        return num == null || num.intValue() >= i7;
    }

    @Override // k4.l
    @d
    public f b() {
        return e(34) ? new c5.a() : super.b();
    }

    @Override // k4.l
    @n6.e
    public j c(@d MatchResult matchResult, @d String str) {
        l0.p(matchResult, "matchResult");
        l0.p(str, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher != null) {
            l lVar = new l(matcher.start(str), matcher.end(str) - 1);
            if (lVar.b().intValue() >= 0) {
                String group = matcher.group(str);
                l0.o(group, "matcher.group(name)");
                return new j(group, lVar);
            }
            return null;
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}