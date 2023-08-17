package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public abstract class j0 {
    @n6.e
    public abstract d<?> a();

    public final boolean b(@n6.d j0 j0Var) {
        d<?> a7;
        d<?> a8 = a();
        return (a8 == null || (a7 = j0Var.a()) == null || a8.g() >= a7.g()) ? false : true;
    }

    @n6.e
    public abstract Object c(@n6.e Object obj);

    @n6.d
    public String toString() {
        return kotlinx.coroutines.z0.a(this) + '@' + kotlinx.coroutines.z0.b(this);
    }
}