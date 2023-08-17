package x;

import w.h;
import y.j;
/* loaded from: classes.dex */
public class c extends w.c {

    /* renamed from: n0  reason: collision with root package name */
    public h.d f18242n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f18243o0;

    /* renamed from: p0  reason: collision with root package name */
    public y.a f18244p0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18245a;

        static {
            int[] iArr = new int[h.d.values().length];
            f18245a = iArr;
            try {
                iArr[h.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18245a[h.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18245a[h.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18245a[h.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18245a[h.d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18245a[h.d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(w.h hVar) {
        super(hVar, h.e.BARRIER);
    }

    @Override // w.c
    public j N0() {
        if (this.f18244p0 == null) {
            this.f18244p0 = new y.a();
        }
        return this.f18244p0;
    }

    public void Q0(h.d dVar) {
        this.f18242n0 = dVar;
    }

    @Override // w.c, w.a, w.e
    public void b() {
        N0();
        int i7 = a.f18245a[this.f18242n0.ordinal()];
        int i8 = 3;
        if (i7 == 3 || i7 == 4) {
            i8 = 1;
        } else if (i7 == 5) {
            i8 = 2;
        } else if (i7 != 6) {
            i8 = 0;
        }
        this.f18244p0.u2(i8);
        this.f18244p0.v2(this.f18243o0);
    }

    @Override // w.a
    public w.a c0(int i7) {
        this.f18243o0 = i7;
        return this;
    }

    @Override // w.a
    public w.a d0(Object obj) {
        c0(this.f17924j0.f(obj));
        return this;
    }
}
