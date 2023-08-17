package x;

import java.util.Iterator;
import w.h;

/* loaded from: classes.dex */
public class g extends d {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18255a;

        static {
            int[] iArr = new int[h.b.values().length];
            f18255a = iArr;
            try {
                iArr[h.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18255a[h.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18255a[h.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(w.h hVar) {
        super(hVar, h.e.HORIZONTAL_CHAIN);
    }

    @Override // w.c, w.a, w.e
    public void b() {
        Iterator<Object> it = this.f17926l0.iterator();
        while (it.hasNext()) {
            this.f17924j0.e(it.next()).v();
        }
        Iterator<Object> it2 = this.f17926l0.iterator();
        w.a aVar = null;
        w.a aVar2 = null;
        while (it2.hasNext()) {
            w.a e7 = this.f17924j0.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.O;
                if (obj != null) {
                    e7.B0(obj).c0(this.f17889m).e0(this.f17895s);
                } else {
                    Object obj2 = this.P;
                    if (obj2 != null) {
                        e7.A0(obj2).c0(this.f17889m).e0(this.f17895s);
                    } else {
                        Object obj3 = this.K;
                        if (obj3 != null) {
                            e7.B0(obj3).c0(this.f17887k).e0(this.f17893q);
                        } else {
                            Object obj4 = this.L;
                            if (obj4 != null) {
                                e7.A0(obj4).c0(this.f17887k).e0(this.f17893q);
                            } else {
                                e7.B0(w.h.f17934j);
                            }
                        }
                    }
                }
                aVar2 = e7;
            }
            if (aVar != null) {
                aVar.B(e7.getKey());
                e7.A0(aVar.getKey());
            }
            aVar = e7;
        }
        if (aVar != null) {
            Object obj5 = this.Q;
            if (obj5 != null) {
                aVar.B(obj5).c0(this.f17890n).e0(this.f17896t);
            } else {
                Object obj6 = this.R;
                if (obj6 != null) {
                    aVar.A(obj6).c0(this.f17890n).e0(this.f17896t);
                } else {
                    Object obj7 = this.M;
                    if (obj7 != null) {
                        aVar.B(obj7).c0(this.f17888l).e0(this.f17894r);
                    } else {
                        Object obj8 = this.N;
                        if (obj8 != null) {
                            aVar.A(obj8).c0(this.f17888l).e0(this.f17894r);
                        } else {
                            aVar.A(w.h.f17934j);
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f7 = this.f18246n0;
        if (f7 != 0.5f) {
            aVar2.Y(f7);
        }
        int i7 = a.f18255a[this.f18247o0.ordinal()];
        if (i7 == 1) {
            aVar2.s0(0);
        } else if (i7 == 2) {
            aVar2.s0(1);
        } else if (i7 != 3) {
        } else {
            aVar2.s0(2);
        }
    }
}