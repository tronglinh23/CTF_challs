package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class s1 implements g2 {

    /* renamed from: k  reason: collision with root package name */
    public final boolean f12946k;

    public s1(boolean z6) {
        this.f12946k = z6;
    }

    @Override // kotlinx.coroutines.g2
    public boolean d() {
        return this.f12946k;
    }

    @Override // kotlinx.coroutines.g2
    @n6.e
    public a3 j0() {
        return null;
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}