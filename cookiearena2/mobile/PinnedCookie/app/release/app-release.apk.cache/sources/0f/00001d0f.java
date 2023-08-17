package x;

import java.util.Iterator;
import w.h;

/* loaded from: classes.dex */
public class a extends w.c {

    /* renamed from: n0  reason: collision with root package name */
    public float f18240n0;

    public a(w.h hVar) {
        super(hVar, h.e.ALIGN_VERTICALLY);
        this.f18240n0 = 0.5f;
    }

    @Override // w.c, w.a, w.e
    public void b() {
        Iterator<Object> it = this.f17926l0.iterator();
        while (it.hasNext()) {
            w.a e7 = this.f17924j0.e(it.next());
            e7.v();
            Object obj = this.O;
            if (obj != null) {
                e7.B0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    e7.A0(obj2);
                } else {
                    e7.B0(w.h.f17934j);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                e7.B(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    e7.A(obj4);
                } else {
                    e7.A(w.h.f17934j);
                }
            }
            float f7 = this.f18240n0;
            if (f7 != 0.5f) {
                e7.Y(f7);
            }
        }
    }
}