package x;

import java.util.Iterator;
import w.h;
/* loaded from: classes.dex */
public class b extends w.c {

    /* renamed from: n0  reason: collision with root package name */
    public float f18241n0;

    public b(w.h hVar) {
        super(hVar, h.e.ALIGN_VERTICALLY);
        this.f18241n0 = 0.5f;
    }

    @Override // w.c, w.a, w.e
    public void b() {
        Iterator<Object> it = this.f17926l0.iterator();
        while (it.hasNext()) {
            w.a e7 = this.f17924j0.e(it.next());
            e7.w();
            Object obj = this.S;
            if (obj != null) {
                e7.E0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    e7.D0(obj2);
                } else {
                    e7.E0(w.h.f17934j);
                }
            }
            Object obj3 = this.U;
            if (obj3 != null) {
                e7.q(obj3);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    e7.p(obj4);
                } else {
                    e7.p(w.h.f17934j);
                }
            }
            float f7 = this.f18241n0;
            if (f7 != 0.5f) {
                e7.J0(f7);
            }
        }
    }
}
