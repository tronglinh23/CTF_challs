package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11960b = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_handled");
    @n6.d
    private volatile /* synthetic */ int _handled;
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f11961a;

    public e0(@n6.d Throwable th, boolean z6) {
        this.f11961a = th;
        this._handled = z6 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f11960b.compareAndSet(this, 0, 1);
    }

    @n6.d
    public String toString() {
        return z0.a(this) + '[' + this.f11961a + ']';
    }

    public /* synthetic */ e0(Throwable th, boolean z6, int i7, u4.w wVar) {
        this(th, (i7 & 2) != 0 ? false : z6);
    }
}