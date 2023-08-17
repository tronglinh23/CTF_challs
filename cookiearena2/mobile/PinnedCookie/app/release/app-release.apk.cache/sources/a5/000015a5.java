package kotlinx.coroutines;

@v3.a1
/* loaded from: classes.dex */
public class q2 extends v2 implements c0 {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f12932l;

    public q2(@n6.e n2 n2Var) {
        super(true);
        Y0(n2Var);
        this.f12932l = H1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r0.P0() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
        r0 = r0.S0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        if ((r0 instanceof kotlinx.coroutines.x) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        r0 = (kotlinx.coroutines.x) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        r0 = r0.Y0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H1() {
        /*
            r4 = this;
            kotlinx.coroutines.w r0 = r4.S0()
            boolean r1 = r0 instanceof kotlinx.coroutines.x
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.x r0 = (kotlinx.coroutines.x) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            kotlinx.coroutines.v2 r0 = r0.Y0()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.P0()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            kotlinx.coroutines.w r0 = r0.S0()
            boolean r3 = r0 instanceof kotlinx.coroutines.x
            if (r3 == 0) goto L2a
            kotlinx.coroutines.x r0 = (kotlinx.coroutines.x) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            kotlinx.coroutines.v2 r0 = r0.Y0()
            if (r0 != 0) goto L17
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.q2.H1():boolean");
    }

    @Override // kotlinx.coroutines.v2
    public boolean P0() {
        return this.f12932l;
    }

    @Override // kotlinx.coroutines.v2
    public boolean Q0() {
        return true;
    }

    @Override // kotlinx.coroutines.c0
    public boolean h() {
        return g1(v3.m2.f17815a);
    }

    @Override // kotlinx.coroutines.c0
    public boolean i(@n6.d Throwable th) {
        return g1(new e0(th, false, 2, null));
    }
}