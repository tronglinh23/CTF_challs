package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import g1.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a implements v.a {

    /* renamed from: i  reason: collision with root package name */
    public static final int f5207i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f5208j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f5209k = false;

    /* renamed from: l  reason: collision with root package name */
    public static final String f5210l = "AHT";

    /* renamed from: a  reason: collision with root package name */
    public r.a<b> f5211a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f5212b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f5213c;

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0062a f5214d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f5215e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5216f;

    /* renamed from: g  reason: collision with root package name */
    public final v f5217g;

    /* renamed from: h  reason: collision with root package name */
    public int f5218h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0062a {
        void a(int i7, int i8);

        void b(b bVar);

        RecyclerView.f0 c(int i7);

        void d(int i7, int i8);

        void e(int i7, int i8);

        void f(int i7, int i8);

        void g(b bVar);

        void h(int i7, int i8, Object obj);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f5219e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f5220f = 2;

        /* renamed from: g  reason: collision with root package name */
        public static final int f5221g = 4;

        /* renamed from: h  reason: collision with root package name */
        public static final int f5222h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f5223i = 30;

        /* renamed from: a  reason: collision with root package name */
        public int f5224a;

        /* renamed from: b  reason: collision with root package name */
        public int f5225b;

        /* renamed from: c  reason: collision with root package name */
        public Object f5226c;

        /* renamed from: d  reason: collision with root package name */
        public int f5227d;

        public b(int i7, int i8, int i9, Object obj) {
            this.f5224a = i7;
            this.f5225b = i8;
            this.f5227d = i9;
            this.f5226c = obj;
        }

        public String a() {
            int i7 = this.f5224a;
            return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i7 = this.f5224a;
            if (i7 != bVar.f5224a) {
                return false;
            }
            if (i7 == 8 && Math.abs(this.f5227d - this.f5225b) == 1 && this.f5227d == bVar.f5225b && this.f5225b == bVar.f5227d) {
                return true;
            }
            if (this.f5227d == bVar.f5227d && this.f5225b == bVar.f5225b) {
                Object obj2 = this.f5226c;
                if (obj2 != null) {
                    if (!obj2.equals(bVar.f5226c)) {
                        return false;
                    }
                } else if (bVar.f5226c != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f5224a * 31) + this.f5225b) * 31) + this.f5227d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f5225b + "c:" + this.f5227d + ",p:" + this.f5226c + "]";
        }
    }

    public a(InterfaceC0062a interfaceC0062a) {
        this(interfaceC0062a, false);
    }

    public final int A(int i7, int i8) {
        int i9;
        int i10;
        for (int size = this.f5213c.size() - 1; size >= 0; size--) {
            b bVar = this.f5213c.get(size);
            int i11 = bVar.f5224a;
            if (i11 == 8) {
                int i12 = bVar.f5225b;
                int i13 = bVar.f5227d;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i7 < i10 || i7 > i9) {
                    if (i7 < i12) {
                        if (i8 == 1) {
                            bVar.f5225b = i12 + 1;
                            bVar.f5227d = i13 + 1;
                        } else if (i8 == 2) {
                            bVar.f5225b = i12 - 1;
                            bVar.f5227d = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i8 == 1) {
                        bVar.f5227d = i13 + 1;
                    } else if (i8 == 2) {
                        bVar.f5227d = i13 - 1;
                    }
                    i7++;
                } else {
                    if (i8 == 1) {
                        bVar.f5225b = i12 + 1;
                    } else if (i8 == 2) {
                        bVar.f5225b = i12 - 1;
                    }
                    i7--;
                }
            } else {
                int i14 = bVar.f5225b;
                if (i14 <= i7) {
                    if (i11 == 1) {
                        i7 -= bVar.f5227d;
                    } else if (i11 == 2) {
                        i7 += bVar.f5227d;
                    }
                } else if (i8 == 1) {
                    bVar.f5225b = i14 + 1;
                } else if (i8 == 2) {
                    bVar.f5225b = i14 - 1;
                }
            }
        }
        for (int size2 = this.f5213c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f5213c.get(size2);
            if (bVar2.f5224a == 8) {
                int i15 = bVar2.f5227d;
                if (i15 == bVar2.f5225b || i15 < 0) {
                    this.f5213c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f5227d <= 0) {
                this.f5213c.remove(size2);
                a(bVar2);
            }
        }
        return i7;
    }

    @Override // androidx.recyclerview.widget.v.a
    public void a(b bVar) {
        if (this.f5216f) {
            return;
        }
        bVar.f5226c = null;
        this.f5211a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.v.a
    public b b(int i7, int i8, int i9, Object obj) {
        b b7 = this.f5211a.b();
        if (b7 == null) {
            return new b(i7, i8, i9, obj);
        }
        b7.f5224a = i7;
        b7.f5225b = i8;
        b7.f5227d = i9;
        b7.f5226c = obj;
        return b7;
    }

    public a c(b... bVarArr) {
        Collections.addAll(this.f5212b, bVarArr);
        return this;
    }

    public final void d(b bVar) {
        w(bVar);
    }

    public final void e(b bVar) {
        w(bVar);
    }

    public int f(int i7) {
        int size = this.f5212b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = this.f5212b.get(i8);
            int i9 = bVar.f5224a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = bVar.f5225b;
                    if (i10 <= i7) {
                        int i11 = bVar.f5227d;
                        if (i10 + i11 > i7) {
                            return -1;
                        }
                        i7 -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = bVar.f5225b;
                    if (i12 == i7) {
                        i7 = bVar.f5227d;
                    } else {
                        if (i12 < i7) {
                            i7--;
                        }
                        if (bVar.f5227d <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (bVar.f5225b <= i7) {
                i7 += bVar.f5227d;
            }
        }
        return i7;
    }

    public final void g(b bVar) {
        boolean z6;
        char c7;
        int i7 = bVar.f5225b;
        int i8 = bVar.f5227d + i7;
        char c8 = 65535;
        int i9 = i7;
        int i10 = 0;
        while (i9 < i8) {
            if (this.f5214d.c(i9) != null || i(i9)) {
                if (c8 == 0) {
                    l(b(2, i7, i10, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c7 = 1;
            } else {
                if (c8 == 1) {
                    w(b(2, i7, i10, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c7 = 0;
            }
            if (z6) {
                i9 -= i10;
                i8 -= i10;
                i10 = 1;
            } else {
                i10++;
            }
            i9++;
            c8 = c7;
        }
        if (i10 != bVar.f5227d) {
            a(bVar);
            bVar = b(2, i7, i10, null);
        }
        if (c8 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final void h(b bVar) {
        int i7 = bVar.f5225b;
        int i8 = bVar.f5227d + i7;
        int i9 = 0;
        boolean z6 = true;
        int i10 = i7;
        while (i7 < i8) {
            if (this.f5214d.c(i7) != null || i(i7)) {
                if (!z6) {
                    l(b(4, i10, i9, bVar.f5226c));
                    i10 = i7;
                    i9 = 0;
                }
                z6 = true;
            } else {
                if (z6) {
                    w(b(4, i10, i9, bVar.f5226c));
                    i10 = i7;
                    i9 = 0;
                }
                z6 = false;
            }
            i9++;
            i7++;
        }
        if (i9 != bVar.f5227d) {
            Object obj = bVar.f5226c;
            a(bVar);
            bVar = b(4, i10, i9, obj);
        }
        if (z6) {
            w(bVar);
        } else {
            l(bVar);
        }
    }

    public final boolean i(int i7) {
        int size = this.f5213c.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = this.f5213c.get(i8);
            int i9 = bVar.f5224a;
            if (i9 == 8) {
                if (o(bVar.f5227d, i8 + 1) == i7) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = bVar.f5225b;
                int i11 = bVar.f5227d + i10;
                while (i10 < i11) {
                    if (o(i10, i8 + 1) == i7) {
                        return true;
                    }
                    i10++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void j() {
        int size = this.f5213c.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f5214d.b(this.f5213c.get(i7));
        }
        y(this.f5213c);
        this.f5218h = 0;
    }

    public void k() {
        j();
        int size = this.f5212b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = this.f5212b.get(i7);
            int i8 = bVar.f5224a;
            if (i8 == 1) {
                this.f5214d.b(bVar);
                this.f5214d.e(bVar.f5225b, bVar.f5227d);
            } else if (i8 == 2) {
                this.f5214d.b(bVar);
                this.f5214d.f(bVar.f5225b, bVar.f5227d);
            } else if (i8 == 4) {
                this.f5214d.b(bVar);
                this.f5214d.h(bVar.f5225b, bVar.f5227d, bVar.f5226c);
            } else if (i8 == 8) {
                this.f5214d.b(bVar);
                this.f5214d.a(bVar.f5225b, bVar.f5227d);
            }
            Runnable runnable = this.f5215e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f5212b);
        this.f5218h = 0;
    }

    public final void l(b bVar) {
        int i7;
        int i8 = bVar.f5224a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A = A(bVar.f5225b, i8);
        int i9 = bVar.f5225b;
        int i10 = bVar.f5224a;
        if (i10 == 2) {
            i7 = 0;
        } else if (i10 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i7 = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < bVar.f5227d; i12++) {
            int A2 = A(bVar.f5225b + (i7 * i12), bVar.f5224a);
            int i13 = bVar.f5224a;
            if (i13 == 2 ? A2 == A : i13 == 4 && A2 == A + 1) {
                i11++;
            } else {
                b b7 = b(i13, A, i11, bVar.f5226c);
                m(b7, i9);
                a(b7);
                if (bVar.f5224a == 4) {
                    i9 += i11;
                }
                i11 = 1;
                A = A2;
            }
        }
        Object obj = bVar.f5226c;
        a(bVar);
        if (i11 > 0) {
            b b8 = b(bVar.f5224a, A, i11, obj);
            m(b8, i9);
            a(b8);
        }
    }

    public void m(b bVar, int i7) {
        this.f5214d.g(bVar);
        int i8 = bVar.f5224a;
        if (i8 == 2) {
            this.f5214d.f(i7, bVar.f5227d);
        } else if (i8 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f5214d.h(i7, bVar.f5227d, bVar.f5226c);
        }
    }

    public int n(int i7) {
        return o(i7, 0);
    }

    public int o(int i7, int i8) {
        int size = this.f5213c.size();
        while (i8 < size) {
            b bVar = this.f5213c.get(i8);
            int i9 = bVar.f5224a;
            if (i9 == 8) {
                int i10 = bVar.f5225b;
                if (i10 == i7) {
                    i7 = bVar.f5227d;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (bVar.f5227d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = bVar.f5225b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = bVar.f5227d;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += bVar.f5227d;
                }
            }
            i8++;
        }
        return i7;
    }

    public boolean p(int i7) {
        return (i7 & this.f5218h) != 0;
    }

    public boolean q() {
        return this.f5212b.size() > 0;
    }

    public boolean r() {
        return (this.f5213c.isEmpty() || this.f5212b.isEmpty()) ? false : true;
    }

    public boolean s(int i7, int i8, Object obj) {
        if (i8 < 1) {
            return false;
        }
        this.f5212b.add(b(4, i7, i8, obj));
        this.f5218h |= 4;
        return this.f5212b.size() == 1;
    }

    public boolean t(int i7, int i8) {
        if (i8 < 1) {
            return false;
        }
        this.f5212b.add(b(1, i7, i8, null));
        this.f5218h |= 1;
        return this.f5212b.size() == 1;
    }

    public boolean u(int i7, int i8, int i9) {
        if (i7 == i8) {
            return false;
        }
        if (i9 == 1) {
            this.f5212b.add(b(8, i7, i8, null));
            this.f5218h |= 8;
            return this.f5212b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public boolean v(int i7, int i8) {
        if (i8 < 1) {
            return false;
        }
        this.f5212b.add(b(2, i7, i8, null));
        this.f5218h |= 2;
        return this.f5212b.size() == 1;
    }

    public final void w(b bVar) {
        this.f5213c.add(bVar);
        int i7 = bVar.f5224a;
        if (i7 == 1) {
            this.f5214d.e(bVar.f5225b, bVar.f5227d);
        } else if (i7 == 2) {
            this.f5214d.d(bVar.f5225b, bVar.f5227d);
        } else if (i7 == 4) {
            this.f5214d.h(bVar.f5225b, bVar.f5227d, bVar.f5226c);
        } else if (i7 == 8) {
            this.f5214d.a(bVar.f5225b, bVar.f5227d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void x() {
        this.f5217g.b(this.f5212b);
        int size = this.f5212b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = this.f5212b.get(i7);
            int i8 = bVar.f5224a;
            if (i8 == 1) {
                d(bVar);
            } else if (i8 == 2) {
                g(bVar);
            } else if (i8 == 4) {
                h(bVar);
            } else if (i8 == 8) {
                e(bVar);
            }
            Runnable runnable = this.f5215e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5212b.clear();
    }

    public void y(List<b> list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            a(list.get(i7));
        }
        list.clear();
    }

    public void z() {
        y(this.f5212b);
        y(this.f5213c);
        this.f5218h = 0;
    }

    public a(InterfaceC0062a interfaceC0062a, boolean z6) {
        this.f5211a = new r.b(30);
        this.f5212b = new ArrayList<>();
        this.f5213c = new ArrayList<>();
        this.f5218h = 0;
        this.f5214d = interfaceC0062a;
        this.f5216f = z6;
        this.f5217g = new v(this);
    }
}
