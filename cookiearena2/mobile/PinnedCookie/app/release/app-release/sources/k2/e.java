package k2;

import i0.x2;
import k2.a;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class e extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [k2.a, u4.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.e.<init>():void");
    }

    @Override // k2.a
    @n6.e
    public <T> T a(@n6.d a.b<T> bVar) {
        l0.p(bVar, x2.f10960j);
        return (T) b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@n6.d a.b<T> bVar, T t6) {
        l0.p(bVar, x2.f10960j);
        b().put(bVar, t6);
    }

    public e(@n6.d a aVar) {
        l0.p(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ e(a aVar, int i7, w wVar) {
        this((i7 & 1) != 0 ? a.C0139a.f11626b : aVar);
    }
}
