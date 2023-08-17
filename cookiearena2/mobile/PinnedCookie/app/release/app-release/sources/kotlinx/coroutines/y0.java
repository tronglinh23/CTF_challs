package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class y0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f13176a = "kotlinx.coroutines.debug";
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f13177b = "kotlinx.coroutines.stacktrace.recovery";
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final String f13178c = "auto";
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final String f13179d = "on";
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final String f13180e = "off";

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f13181f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f13182g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f13183h;
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLong f13184i;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0.equals(kotlinx.coroutines.y0.f13179d) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.t0.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L63
            int r3 = r0.hashCode()
            if (r3 == 0) goto L39
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L30
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L43
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L63
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L63
        L30:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L41
        L39:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
        L41:
            r0 = r1
            goto L64
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L63:
            r0 = r2
        L64:
            kotlinx.coroutines.y0.f13182g = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.t0.e(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            kotlinx.coroutines.y0.f13183h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.y0.f13184i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.y0.<clinit>():void");
    }

    @k4.f
    public static final void a(t4.a<Boolean> aVar) {
    }

    public static final boolean b() {
        return f13181f;
    }

    @n6.d
    public static final AtomicLong c() {
        return f13184i;
    }

    public static final boolean d() {
        return f13182g;
    }

    public static final boolean e() {
        return f13183h;
    }

    public static final void f() {
        f13184i.set(0L);
    }
}
