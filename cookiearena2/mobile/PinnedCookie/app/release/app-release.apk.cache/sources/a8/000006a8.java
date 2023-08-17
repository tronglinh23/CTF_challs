package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import d.l1;
import d.o0;
import d.q0;
import g1.r;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f5416c = false;
    @l1

    /* renamed from: a  reason: collision with root package name */
    public final androidx.collection.m<RecyclerView.f0, a> f5417a = new androidx.collection.m<>();
    @l1

    /* renamed from: b  reason: collision with root package name */
    public final androidx.collection.h<RecyclerView.f0> f5418b = new androidx.collection.h<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final int f5419d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f5420e = 2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f5421f = 4;

        /* renamed from: g  reason: collision with root package name */
        public static final int f5422g = 8;

        /* renamed from: h  reason: collision with root package name */
        public static final int f5423h = 3;

        /* renamed from: i  reason: collision with root package name */
        public static final int f5424i = 12;

        /* renamed from: j  reason: collision with root package name */
        public static final int f5425j = 14;

        /* renamed from: k  reason: collision with root package name */
        public static r.a<a> f5426k = new r.b(20);

        /* renamed from: a  reason: collision with root package name */
        public int f5427a;
        @q0

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.l.d f5428b;
        @q0

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.l.d f5429c;

        public static void a() {
            do {
            } while (f5426k.b() != null);
        }

        public static a b() {
            a b7 = f5426k.b();
            return b7 == null ? new a() : b7;
        }

        public static void c(a aVar) {
            aVar.f5427a = 0;
            aVar.f5428b = null;
            aVar.f5429c = null;
            f5426k.a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.f0 f0Var);

        void b(RecyclerView.f0 f0Var, @q0 RecyclerView.l.d dVar, RecyclerView.l.d dVar2);

        void c(RecyclerView.f0 f0Var, @o0 RecyclerView.l.d dVar, @q0 RecyclerView.l.d dVar2);

        void d(RecyclerView.f0 f0Var, @o0 RecyclerView.l.d dVar, @o0 RecyclerView.l.d dVar2);
    }

    public void a(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVar = this.f5417a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5417a.put(f0Var, aVar);
        }
        aVar.f5427a |= 2;
        aVar.f5428b = dVar;
    }

    public void b(RecyclerView.f0 f0Var) {
        a aVar = this.f5417a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5417a.put(f0Var, aVar);
        }
        aVar.f5427a |= 1;
    }

    public void c(long j7, RecyclerView.f0 f0Var) {
        this.f5418b.u(j7, f0Var);
    }

    public void d(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVar = this.f5417a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5417a.put(f0Var, aVar);
        }
        aVar.f5429c = dVar;
        aVar.f5427a |= 8;
    }

    public void e(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVar = this.f5417a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5417a.put(f0Var, aVar);
        }
        aVar.f5428b = dVar;
        aVar.f5427a |= 4;
    }

    public void f() {
        this.f5417a.clear();
        this.f5418b.g();
    }

    public RecyclerView.f0 g(long j7) {
        return this.f5418b.o(j7);
    }

    public boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.f5417a.get(f0Var);
        return (aVar == null || (aVar.f5427a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.f5417a.get(f0Var);
        return (aVar == null || (aVar.f5427a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    public final RecyclerView.l.d l(RecyclerView.f0 f0Var, int i7) {
        a o6;
        RecyclerView.l.d dVar;
        int g7 = this.f5417a.g(f0Var);
        if (g7 >= 0 && (o6 = this.f5417a.o(g7)) != null) {
            int i8 = o6.f5427a;
            if ((i8 & i7) != 0) {
                int i9 = (~i7) & i8;
                o6.f5427a = i9;
                if (i7 == 4) {
                    dVar = o6.f5428b;
                } else if (i7 != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    dVar = o6.f5429c;
                }
                if ((i9 & 12) == 0) {
                    this.f5417a.m(g7);
                    a.c(o6);
                }
                return dVar;
            }
        }
        return null;
    }

    @q0
    public RecyclerView.l.d m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    @q0
    public RecyclerView.l.d n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.f5417a.size() - 1; size >= 0; size--) {
            RecyclerView.f0 k7 = this.f5417a.k(size);
            a m7 = this.f5417a.m(size);
            int i7 = m7.f5427a;
            if ((i7 & 3) == 3) {
                bVar.a(k7);
            } else if ((i7 & 1) != 0) {
                RecyclerView.l.d dVar = m7.f5428b;
                if (dVar == null) {
                    bVar.a(k7);
                } else {
                    bVar.c(k7, dVar, m7.f5429c);
                }
            } else if ((i7 & 14) == 14) {
                bVar.b(k7, m7.f5428b, m7.f5429c);
            } else if ((i7 & 12) == 12) {
                bVar.d(k7, m7.f5428b, m7.f5429c);
            } else if ((i7 & 4) != 0) {
                bVar.c(k7, m7.f5428b, null);
            } else if ((i7 & 8) != 0) {
                bVar.b(k7, m7.f5428b, m7.f5429c);
            }
            a.c(m7);
        }
    }

    public void p(RecyclerView.f0 f0Var) {
        a aVar = this.f5417a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f5427a &= -2;
    }

    public void q(RecyclerView.f0 f0Var) {
        int D = this.f5418b.D() - 1;
        while (true) {
            if (D < 0) {
                break;
            } else if (f0Var == this.f5418b.E(D)) {
                this.f5418b.z(D);
                break;
            } else {
                D--;
            }
        }
        a remove = this.f5417a.remove(f0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}