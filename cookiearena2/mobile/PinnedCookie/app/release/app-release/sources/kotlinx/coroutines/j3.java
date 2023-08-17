package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class j3 implements Runnable {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final o0 f12890k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final q<v3.m2> f12891l;

    /* JADX WARN: Multi-variable type inference failed */
    public j3(@n6.d o0 o0Var, @n6.d q<? super v3.m2> qVar) {
        this.f12890k = o0Var;
        this.f12891l = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12891l.r(this.f12890k, v3.m2.f17815a);
    }
}
