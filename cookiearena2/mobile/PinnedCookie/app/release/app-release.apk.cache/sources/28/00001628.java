package kotlinx.coroutines;

/* loaded from: classes.dex */
public abstract class z2 extends o0 {
    @Override // kotlinx.coroutines.o0
    @n6.d
    public o0 Y0(int i7) {
        kotlinx.coroutines.internal.t.a(i7);
        return this;
    }

    @n6.d
    public abstract z2 a1();

    @n6.e
    @i2
    public final String b1() {
        z2 z2Var;
        z2 e7 = m1.e();
        if (this == e7) {
            return "Dispatchers.Main";
        }
        try {
            z2Var = e7.a1();
        } catch (UnsupportedOperationException unused) {
            z2Var = null;
        }
        if (this == z2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        String b12 = b1();
        if (b12 == null) {
            return z0.a(this) + '@' + z0.b(this);
        }
        return b12;
    }
}