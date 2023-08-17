package u4;
/* loaded from: classes.dex */
public final class n extends c1<boolean[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f17445d;

    public n(int i7) {
        super(i7);
        this.f17445d = new boolean[i7];
    }

    public final void h(boolean z6) {
        boolean[] zArr = this.f17445d;
        int b7 = b();
        e(b7 + 1);
        zArr[b7] = z6;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length;
    }

    @n6.d
    public final boolean[] j() {
        return g(this.f17445d, new boolean[f()]);
    }
}
