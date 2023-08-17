package x;

import java.util.Iterator;
import w.h;
/* loaded from: classes.dex */
public class h extends d {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18256a;

        static {
            int[] iArr = new int[h.b.values().length];
            f18256a = iArr;
            try {
                iArr[h.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18256a[h.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18256a[h.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(w.h hVar) {
        super(hVar, h.e.VERTICAL_CHAIN);
    }

    @Override // w.c, w.a, w.e
    public void b() {
        Iterator<Object> it = this.f17926l0.iterator();
        while (it.hasNext()) {
            this.f17924j0.e(it.next()).w();
        }
        Iterator<Object> it2 = this.f17926l0.iterator();
        w.a aVar = null;
        w.a aVar2 = null;
        while (it2.hasNext()) {
            w.a e7 = this.f17924j0.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.S;
                if (obj != null) {
                    e7.E0(obj).c0(this.f17891o).e0(this.f17897u);
                } else {
                    Object obj2 = this.T;
                    if (obj2 != null) {
                        e7.D0(obj2).c0(this.f17891o).e0(this.f17897u);
                    } else {
                        e7.E0(w.h.f17934j);
                    }
                }
                aVar2 = e7;
            }
            if (aVar != null) {
                aVar.q(e7.getKey());
                e7.D0(aVar.getKey());
            }
            aVar = e7;
        }
        if (aVar != null) {
            Object obj3 = this.U;
            if (obj3 != null) {
                aVar.q(obj3).c0(this.f17892p).e0(this.f17898v);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    aVar.p(obj4).c0(this.f17892p).e0(this.f17898v);
                } else {
                    aVar.p(w.h.f17934j);
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f7 = this.f18246n0;
        if (f7 != 0.5f) {
            aVar2.J0(f7);
        }
        int i7 = a.f18256a[this.f18247o0.ordinal()];
        if (i7 == 1) {
            aVar2.v0(0);
        } else if (i7 == 2) {
            aVar2.v0(1);
        } else if (i7 != 3) {
        } else {
            aVar2.v0(2);
        }
    }
}
