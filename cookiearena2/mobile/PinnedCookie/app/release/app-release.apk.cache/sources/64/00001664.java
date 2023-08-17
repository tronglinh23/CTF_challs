package l4;

import java.util.List;
import k4.l;
import n6.d;
import s4.e;
import u4.l0;
import u4.r1;
import x3.o;

/* loaded from: classes.dex */
public class a extends l {

    @r1({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: l4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0179a {
        @d

        /* renamed from: a  reason: collision with root package name */
        public static final C0179a f13386a = new C0179a();
        @e
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f13387b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                l4.a$a r0 = new l4.a$a
                r0.<init>()
                l4.a.C0179a.f13386a = r0
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
                l4.a.C0179a.f13387b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l4.a.C0179a.<clinit>():void");
        }
    }

    @Override // k4.l
    public void a(@d Throwable th, @d Throwable th2) {
        l0.p(th, "cause");
        l0.p(th2, "exception");
        if (e(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // k4.l
    @d
    public List<Throwable> d(@d Throwable th) {
        l0.p(th, "exception");
        if (e(19)) {
            Throwable[] suppressed = th.getSuppressed();
            l0.o(suppressed, "exception.suppressed");
            return o.t(suppressed);
        }
        return super.d(th);
    }

    public final boolean e(int i7) {
        Integer num = C0179a.f13387b;
        return num == null || num.intValue() >= i7;
    }
}