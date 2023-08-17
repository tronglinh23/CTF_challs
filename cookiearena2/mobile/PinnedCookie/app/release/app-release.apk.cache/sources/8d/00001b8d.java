package u4;

/* loaded from: classes.dex */
public final class r0 extends c1<long[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final long[] f17483d;

    public r0(int i7) {
        super(i7);
        this.f17483d = new long[i7];
    }

    public final void h(long j7) {
        long[] jArr = this.f17483d;
        int b7 = b();
        e(b7 + 1);
        jArr[b7] = j7;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length;
    }

    @n6.d
    public final long[] j() {
        return g(this.f17483d, new long[f()]);
    }
}