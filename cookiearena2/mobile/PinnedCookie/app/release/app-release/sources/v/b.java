package v;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<c> f17592r;

    public b(char[] cArr) {
        super(cArr);
        this.f17592r = new ArrayList<>();
    }

    public static c v(char[] cArr) {
        return new b(cArr);
    }

    public a A(String str) {
        c M = M(str);
        if (M instanceof a) {
            return (a) M;
        }
        return null;
    }

    public boolean B(int i7) throws h {
        c w6 = w(i7);
        if (w6 instanceof j) {
            return ((j) w6).v();
        }
        throw new h("no boolean at index " + i7, this);
    }

    public boolean C(String str) throws h {
        c x6 = x(str);
        if (x6 instanceof j) {
            return ((j) x6).v();
        }
        throw new h("no boolean found for key <" + str + ">, found [" + x6.k() + "] : " + x6, this);
    }

    public float D(int i7) throws h {
        c w6 = w(i7);
        if (w6 != null) {
            return w6.g();
        }
        throw new h("no float at index " + i7, this);
    }

    public float E(String str) throws h {
        c x6 = x(str);
        if (x6 != null) {
            return x6.g();
        }
        throw new h("no float found for key <" + str + ">, found [" + x6.k() + "] : " + x6, this);
    }

    public float F(String str) {
        c M = M(str);
        if (M instanceof e) {
            return M.g();
        }
        return Float.NaN;
    }

    public int G(int i7) throws h {
        c w6 = w(i7);
        if (w6 != null) {
            return w6.h();
        }
        throw new h("no int at index " + i7, this);
    }

    public int H(String str) throws h {
        c x6 = x(str);
        if (x6 != null) {
            return x6.h();
        }
        throw new h("no int found for key <" + str + ">, found [" + x6.k() + "] : " + x6, this);
    }

    public f I(int i7) throws h {
        c w6 = w(i7);
        if (w6 instanceof f) {
            return (f) w6;
        }
        throw new h("no object at index " + i7, this);
    }

    public f J(String str) throws h {
        c x6 = x(str);
        if (x6 instanceof f) {
            return (f) x6;
        }
        throw new h("no object found for key <" + str + ">, found [" + x6.k() + "] : " + x6, this);
    }

    public f K(String str) {
        c M = M(str);
        if (M instanceof f) {
            return (f) M;
        }
        return null;
    }

    public c L(int i7) {
        if (i7 < 0 || i7 >= this.f17592r.size()) {
            return null;
        }
        return this.f17592r.get(i7);
    }

    public c M(String str) {
        Iterator<c> it = this.f17592r.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.b().equals(str)) {
                return dVar.Y();
            }
        }
        return null;
    }

    public String N(int i7) throws h {
        c w6 = w(i7);
        if (w6 instanceof i) {
            return w6.b();
        }
        throw new h("no string at index " + i7, this);
    }

    public String O(String str) throws h {
        c x6 = x(str);
        if (x6 instanceof i) {
            return x6.b();
        }
        throw new h("no string found for key <" + str + ">, found [" + (x6 != null ? x6.k() : null) + "] : " + x6, this);
    }

    public String P(int i7) {
        c L = L(i7);
        if (L instanceof i) {
            return L.b();
        }
        return null;
    }

    public String Q(String str) {
        c M = M(str);
        if (M instanceof i) {
            return M.b();
        }
        return null;
    }

    public boolean R(String str) {
        Iterator<c> it = this.f17592r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if ((next instanceof d) && ((d) next).b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> S() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<c> it = this.f17592r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next instanceof d) {
                arrayList.add(((d) next).b());
            }
        }
        return arrayList;
    }

    public void T(String str, c cVar) {
        Iterator<c> it = this.f17592r.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.b().equals(str)) {
                dVar.Z(cVar);
                return;
            }
        }
        this.f17592r.add((d) d.W(str, cVar));
    }

    public void U(String str, float f7) {
        T(str, new e(f7));
    }

    public void V(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = this.f17592r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (((d) next).b().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f17592r.remove((c) it2.next());
        }
    }

    public int size() {
        return this.f17592r.size();
    }

    @Override // v.c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<c> it = this.f17592r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public void u(c cVar) {
        this.f17592r.add(cVar);
        if (g.f17605d) {
            System.out.println("added element " + cVar + " to " + this);
        }
    }

    public c w(int i7) throws h {
        if (i7 < 0 || i7 >= this.f17592r.size()) {
            throw new h("no element at index " + i7, this);
        }
        return this.f17592r.get(i7);
    }

    public c x(String str) throws h {
        Iterator<c> it = this.f17592r.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.b().equals(str)) {
                return dVar.Y();
            }
        }
        throw new h("no element for key <" + str + ">", this);
    }

    public a y(int i7) throws h {
        c w6 = w(i7);
        if (w6 instanceof a) {
            return (a) w6;
        }
        throw new h("no array at index " + i7, this);
    }

    public a z(String str) throws h {
        c x6 = x(str);
        if (x6 instanceof a) {
            return (a) x6;
        }
        throw new h("no array found for key <" + str + ">, found [" + x6.k() + "] : " + x6, this);
    }
}
