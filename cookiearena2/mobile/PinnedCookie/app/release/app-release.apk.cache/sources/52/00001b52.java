package u4;

/* loaded from: classes.dex */
public final class b0 extends c1<float[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final float[] f17399d;

    public b0(int i7) {
        super(i7);
        this.f17399d = new float[i7];
    }

    public final void h(float f7) {
        float[] fArr = this.f17399d;
        int b7 = b();
        e(b7 + 1);
        fArr[b7] = f7;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length;
    }

    @n6.d
    public final float[] j() {
        return g(this.f17399d, new float[f()]);
    }
}