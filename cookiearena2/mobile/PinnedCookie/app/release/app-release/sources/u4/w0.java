package u4;

import e5.l;
import e5.q;
/* loaded from: classes.dex */
public abstract class w0 extends a1 implements e5.l {
    public w0() {
    }

    @Override // t4.l
    public Object O(Object obj) {
        return get(obj);
    }

    @Override // e5.q
    @v3.g1(version = "1.1")
    public Object s(Object obj) {
        return ((e5.l) z0()).s(obj);
    }

    @Override // u4.q
    public e5.c w0() {
        return l1.k(this);
    }

    @v3.g1(version = "1.1")
    public w0(Object obj) {
        super(obj);
    }

    @Override // e5.o
    public q.a a() {
        return ((e5.l) z0()).a();
    }

    @Override // e5.j
    public l.a c() {
        return ((e5.l) z0()).c();
    }

    @v3.g1(version = "1.4")
    public w0(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }
}
