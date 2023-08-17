package h4;

import u4.e0;
import u4.l0;
import u4.l1;
import v3.g1;
@g1(version = "1.3")
/* loaded from: classes.dex */
public abstract class o extends d implements e0<Object>, n {

    /* renamed from: n  reason: collision with root package name */
    public final int f10322n;

    public o(int i7, @n6.e e4.d<Object> dVar) {
        super(dVar);
        this.f10322n = i7;
    }

    @Override // u4.e0
    public int e() {
        return this.f10322n;
    }

    @Override // h4.a
    @n6.d
    public String toString() {
        if (L() == null) {
            String w6 = l1.w(this);
            l0.o(w6, "renderLambdaToString(this)");
            return w6;
        }
        return super.toString();
    }

    public o(int i7) {
        this(i7, null);
    }
}
