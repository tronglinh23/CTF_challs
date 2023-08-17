package u4;

/* loaded from: classes.dex */
public final class q1 extends c1<short[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final short[] f17471d;

    public q1(int i7) {
        super(i7);
        this.f17471d = new short[i7];
    }

    public final void h(short s6) {
        short[] sArr = this.f17471d;
        int b7 = b();
        e(b7 + 1);
        sArr[b7] = s6;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length;
    }

    @n6.d
    public final short[] j() {
        return g(this.f17471d, new short[f()]);
    }
}