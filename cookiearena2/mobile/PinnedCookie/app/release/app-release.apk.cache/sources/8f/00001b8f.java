package u4;

/* loaded from: classes.dex */
public final class s extends c1<char[]> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final char[] f17484d;

    public s(int i7) {
        super(i7);
        this.f17484d = new char[i7];
    }

    public final void h(char c7) {
        char[] cArr = this.f17484d;
        int b7 = b();
        e(b7 + 1);
        cArr[b7] = c7;
    }

    @Override // u4.c1
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public int c(@n6.d char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length;
    }

    @n6.d
    public final char[] j() {
        return g(this.f17484d, new char[f()]);
    }
}