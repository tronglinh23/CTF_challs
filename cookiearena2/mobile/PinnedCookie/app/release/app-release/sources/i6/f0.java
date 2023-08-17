package i6;
/* loaded from: classes.dex */
public final class f0 implements o0 {

    /* renamed from: k  reason: collision with root package name */
    public final m f11175k;

    /* renamed from: l  reason: collision with root package name */
    public j0 f11176l;

    /* renamed from: m  reason: collision with root package name */
    public int f11177m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11178n;

    /* renamed from: o  reason: collision with root package name */
    public long f11179o;

    /* renamed from: p  reason: collision with root package name */
    public final o f11180p;

    public f0(@n6.d o oVar) {
        u4.l0.p(oVar, "upstream");
        this.f11180p = oVar;
        m j7 = oVar.j();
        this.f11175k = j7;
        j0 j0Var = j7.f11238k;
        this.f11176l = j0Var;
        this.f11177m = j0Var != null ? j0Var.f11213b : -1;
    }

    @Override // i6.o0
    @n6.d
    public q0 c() {
        return this.f11180p.c();
    }

    @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11178n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f11213b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // i6.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l0(@n6.d i6.m r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            u4.l0.p(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f11178n
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            i6.j0 r5 = r8.f11176l
            if (r5 == 0) goto L2a
            i6.m r6 = r8.f11175k
            i6.j0 r6 = r6.f11238k
            if (r5 != r6) goto L2b
            int r5 = r8.f11177m
            u4.l0.m(r6)
            int r6 = r6.f11213b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            i6.o r0 = r8.f11180p
            long r1 = r8.f11179o
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.G(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            i6.j0 r0 = r8.f11176l
            if (r0 != 0) goto L53
            i6.m r0 = r8.f11175k
            i6.j0 r0 = r0.f11238k
            if (r0 == 0) goto L53
            r8.f11176l = r0
            u4.l0.m(r0)
            int r0 = r0.f11213b
            r8.f11177m = r0
        L53:
            i6.m r0 = r8.f11175k
            long r0 = r0.a1()
            long r2 = r8.f11179o
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            i6.m r2 = r8.f11175k
            long r4 = r8.f11179o
            r3 = r9
            r6 = r10
            r2.A(r3, r4, r6)
            long r0 = r8.f11179o
            long r0 = r0 + r10
            r8.f11179o = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.f0.l0(i6.m, long):long");
    }
}
