package z;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import y.e;
/* loaded from: classes.dex */
public class o {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f18972g = false;

    /* renamed from: h  reason: collision with root package name */
    public static int f18973h;

    /* renamed from: b  reason: collision with root package name */
    public int f18975b;

    /* renamed from: d  reason: collision with root package name */
    public int f18977d;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<y.e> f18974a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f18976c = false;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<a> f18978e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f18979f = -1;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<y.e> f18980a;

        /* renamed from: b  reason: collision with root package name */
        public int f18981b;

        /* renamed from: c  reason: collision with root package name */
        public int f18982c;

        /* renamed from: d  reason: collision with root package name */
        public int f18983d;

        /* renamed from: e  reason: collision with root package name */
        public int f18984e;

        /* renamed from: f  reason: collision with root package name */
        public int f18985f;

        /* renamed from: g  reason: collision with root package name */
        public int f18986g;

        public a(y.e eVar, q.e eVar2, int i7) {
            this.f18980a = new WeakReference<>(eVar);
            this.f18981b = eVar2.O(eVar.Q);
            this.f18982c = eVar2.O(eVar.R);
            this.f18983d = eVar2.O(eVar.S);
            this.f18984e = eVar2.O(eVar.T);
            this.f18985f = eVar2.O(eVar.U);
            this.f18986g = i7;
        }

        public void a() {
            y.e eVar = this.f18980a.get();
            if (eVar != null) {
                eVar.p1(this.f18981b, this.f18982c, this.f18983d, this.f18984e, this.f18985f, this.f18986g);
            }
        }
    }

    public o(int i7) {
        int i8 = f18973h;
        f18973h = i8 + 1;
        this.f18975b = i8;
        this.f18977d = i7;
    }

    public boolean a(y.e eVar) {
        if (this.f18974a.contains(eVar)) {
            return false;
        }
        this.f18974a.add(eVar);
        return true;
    }

    public void b() {
        if (this.f18978e != null && this.f18976c) {
            for (int i7 = 0; i7 < this.f18978e.size(); i7++) {
                this.f18978e.get(i7).a();
            }
        }
    }

    public void c(ArrayList<o> arrayList) {
        int size = this.f18974a.size();
        if (this.f18979f != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                o oVar = arrayList.get(i7);
                if (this.f18979f == oVar.f18975b) {
                    m(this.f18977d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f18974a.clear();
    }

    public final boolean e(y.e eVar) {
        return this.f18974a.contains(eVar);
    }

    public int f() {
        return this.f18975b;
    }

    public int g() {
        return this.f18977d;
    }

    public final String h() {
        int i7 = this.f18977d;
        return i7 == 0 ? "Horizontal" : i7 == 1 ? "Vertical" : i7 == 2 ? "Both" : "Unknown";
    }

    public boolean i(o oVar) {
        for (int i7 = 0; i7 < this.f18974a.size(); i7++) {
            if (oVar.e(this.f18974a.get(i7))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f18976c;
    }

    public final int k(int i7, y.e eVar) {
        e.b z6 = eVar.z(i7);
        if (z6 == e.b.WRAP_CONTENT || z6 == e.b.MATCH_PARENT || z6 == e.b.FIXED) {
            return i7 == 0 ? eVar.m0() : eVar.D();
        }
        return -1;
    }

    public int l(q.e eVar, int i7) {
        if (this.f18974a.size() == 0) {
            return 0;
        }
        return q(eVar, this.f18974a, i7);
    }

    public void m(int i7, o oVar) {
        Iterator<y.e> it = this.f18974a.iterator();
        while (it.hasNext()) {
            y.e next = it.next();
            oVar.a(next);
            if (i7 == 0) {
                next.S0 = oVar.f();
            } else {
                next.T0 = oVar.f();
            }
        }
        this.f18979f = oVar.f18975b;
    }

    public void n(boolean z6) {
        this.f18976c = z6;
    }

    public void o(int i7) {
        this.f18977d = i7;
    }

    public int p() {
        return this.f18974a.size();
    }

    public final int q(q.e eVar, ArrayList<y.e> arrayList, int i7) {
        int O;
        int O2;
        y.f fVar = (y.f) arrayList.get(0).U();
        eVar.Y();
        fVar.g(eVar, false);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList.get(i8).g(eVar, false);
        }
        if (i7 == 0 && fVar.M1 > 0) {
            y.b.b(fVar, eVar, arrayList, 0);
        }
        if (i7 == 1 && fVar.N1 > 0) {
            y.b.b(fVar, eVar, arrayList, 1);
        }
        try {
            eVar.T();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        this.f18978e = new ArrayList<>();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            this.f18978e.add(new a(arrayList.get(i9), eVar, i7));
        }
        if (i7 == 0) {
            O = eVar.O(fVar.Q);
            O2 = eVar.O(fVar.S);
            eVar.Y();
        } else {
            O = eVar.O(fVar.R);
            O2 = eVar.O(fVar.T);
            eVar.Y();
        }
        return O2 - O;
    }

    public String toString() {
        String str = h() + " [" + this.f18975b + "] <";
        Iterator<y.e> it = this.f18974a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().y();
        }
        return str + " >";
    }
}
