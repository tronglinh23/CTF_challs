package u4;

/* loaded from: classes.dex */
public final class k0 extends c1<int[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final int[] f17428d;

    public k0(int i7) {
        super(i7);
        this.f17428d = new int[i7];
    }

    public final void h(int i7) {
        int[] iArr = this.f17428d;
        int b7 = b();
        e(b7 + 1);
        iArr[b7] = i7;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length;
    }

    @n6.d
    public final int[] j() {
        return g(this.f17428d, new int[f()]);
    }
}