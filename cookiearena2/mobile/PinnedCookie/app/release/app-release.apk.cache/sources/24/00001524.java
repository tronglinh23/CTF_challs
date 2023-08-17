package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class a0<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12759a = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_cur");
    @n6.d
    private volatile /* synthetic */ Object _cur;

    public a0(boolean z6) {
        this._cur = new b0(8, z6);
    }

    public final boolean a(@n6.d E e7) {
        while (true) {
            b0 b0Var = (b0) this._cur;
            int a7 = b0Var.a(e7);
            if (a7 == 0) {
                return true;
            }
            if (a7 == 1) {
                p.b.a(f12759a, this, b0Var, b0Var.k());
            } else if (a7 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            b0 b0Var = (b0) this._cur;
            if (b0Var.d()) {
                return;
            }
            p.b.a(f12759a, this, b0Var, b0Var.k());
        }
    }

    public final int c() {
        return ((b0) this._cur).f();
    }

    public final boolean d() {
        return ((b0) this._cur).g();
    }

    public final boolean e() {
        return ((b0) this._cur).h();
    }

    @n6.d
    public final <R> List<R> f(@n6.d t4.l<? super E, ? extends R> lVar) {
        return ((b0) this._cur).i(lVar);
    }

    @n6.e
    public final E g() {
        while (true) {
            b0 b0Var = (b0) this._cur;
            E e7 = (E) b0Var.l();
            if (e7 != b0.f12777t) {
                return e7;
            }
            p.b.a(f12759a, this, b0Var, b0Var.k());
        }
    }
}