package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.i2;
@i2
/* loaded from: classes.dex */
public abstract class d<T> extends j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12792a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    @n6.d
    private volatile /* synthetic */ Object _consensus = c.f12786a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.j0
    @n6.d
    public d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.j0
    @n6.e
    public final Object c(@n6.e Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.f12786a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t6, @n6.e Object obj);

    @n6.e
    public final Object e(@n6.e Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = c.f12786a;
        return obj2 != obj3 ? obj2 : p.b.a(f12792a, this, obj3, obj) ? obj : this._consensus;
    }

    @n6.e
    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != c.f12786a;
    }

    @n6.e
    public abstract Object i(T t6);
}
