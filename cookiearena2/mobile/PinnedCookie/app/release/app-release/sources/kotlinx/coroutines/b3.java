package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.n2;
/* loaded from: classes.dex */
public final class b3 extends e4.a implements n2 {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final b3 f11856l = new b3();
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final String f11857m = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public b3() {
        super(n2.f12920c);
    }

    @v3.k(level = v3.m.WARNING, message = f11857m)
    public static /* synthetic */ void V0() {
    }

    @v3.k(level = v3.m.WARNING, message = f11857m)
    public static /* synthetic */ void W0() {
    }

    @v3.k(level = v3.m.WARNING, message = f11857m)
    public static /* synthetic */ void X0() {
    }

    @v3.k(level = v3.m.WARNING, message = f11857m)
    public static /* synthetic */ void Y0() {
    }

    @v3.k(level = v3.m.WARNING, message = f11857m)
    public static /* synthetic */ void Z0() {
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public n2 A(@n6.d n2 n2Var) {
        return n2.a.i(this, n2Var);
    }

    @Override // kotlinx.coroutines.n2
    @v3.k(level = v3.m.WARNING, message = f11857m)
    @n6.e
    public Object E0(@n6.d e4.d<? super v3.m2> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public f5.m<n2> Q() {
        return f5.s.g();
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    @v3.k(level = v3.m.WARNING, message = f11857m)
    public w T0(@n6.d y yVar) {
        return c3.f11860k;
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    @v3.k(level = v3.m.WARNING, message = f11857m)
    public p1 X(@n6.d t4.l<? super Throwable, v3.m2> lVar) {
        return c3.f11860k;
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    public kotlinx.coroutines.selects.c Z() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.n2
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean b(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        f(null);
    }

    @Override // kotlinx.coroutines.n2
    public boolean d() {
        return true;
    }

    @Override // kotlinx.coroutines.n2
    @v3.k(level = v3.m.WARNING, message = f11857m)
    public void f(@n6.e CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.n2
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    public boolean l() {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    @v3.k(level = v3.m.WARNING, message = f11857m)
    public p1 p0(boolean z6, boolean z7, @n6.d t4.l<? super Throwable, v3.m2> lVar) {
        return c3.f11860k;
    }

    @Override // kotlinx.coroutines.n2
    @v3.k(level = v3.m.WARNING, message = f11857m)
    public boolean start() {
        return false;
    }

    @n6.d
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.n2
    @n6.d
    @v3.k(level = v3.m.WARNING, message = f11857m)
    public CancellationException w0() {
        throw new IllegalStateException("This job is always active");
    }
}
