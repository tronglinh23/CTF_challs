package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class z3<U, T extends U> extends kotlinx.coroutines.internal.n0<T> implements Runnable {
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public final long f13189n;

    public z3(long j7, @n6.d e4.d<? super U> dVar) {
        super(dVar.g(), dVar);
        this.f13189n = j7;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.v2
    @n6.d
    public String j1() {
        return super.j1() + "(timeMillis=" + this.f13189n + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        o0(a4.a(this.f13189n, this));
    }
}
