package u4;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class n0<R> implements e0<R>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public final int f17446k;

    public n0(int i7) {
        this.f17446k = i7;
    }

    @Override // u4.e0
    public int e() {
        return this.f17446k;
    }

    @n6.d
    public String toString() {
        String x6 = l1.x(this);
        l0.o(x6, "renderLambdaToString(this)");
        return x6;
    }
}