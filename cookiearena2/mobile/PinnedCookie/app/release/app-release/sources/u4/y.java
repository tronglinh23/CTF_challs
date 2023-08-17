package u4;
/* loaded from: classes.dex */
public final class y extends c1<double[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final double[] f17521d;

    public y(int i7) {
        super(i7);
        this.f17521d = new double[i7];
    }

    public final void h(double d7) {
        double[] dArr = this.f17521d;
        int b7 = b();
        e(b7 + 1);
        dArr[b7] = d7;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length;
    }

    @n6.d
    public final double[] j() {
        return g(this.f17521d, new double[f()]);
    }
}
