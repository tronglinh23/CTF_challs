package v;

import java.util.ArrayList;
import u.v;
/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: s  reason: collision with root package name */
    public static ArrayList<String> f17600s;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f17600s = arrayList;
        arrayList.add("ConstraintSets");
        f17600s.add("Variables");
        f17600s.add("Generate");
        f17600s.add(v.h.f17252a);
        f17600s.add(c0.i.f7442f);
        f17600s.add("KeyAttributes");
        f17600s.add("KeyPositions");
        f17600s.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c W(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.r(0L);
        dVar.p((long) (str.length() - 1));
        dVar.Z(cVar);
        return dVar;
    }

    public static c v(char[] cArr) {
        return new d(cArr);
    }

    public String X() {
        return b();
    }

    public c Y() {
        if (this.f17592r.size() > 0) {
            return this.f17592r.get(0);
        }
        return null;
    }

    public void Z(c cVar) {
        if (this.f17592r.size() > 0) {
            this.f17592r.set(0, cVar);
        } else {
            this.f17592r.add(cVar);
        }
    }

    @Override // v.c
    public String s(int i7, int i8) {
        StringBuilder sb = new StringBuilder(e());
        a(sb, i7);
        String b7 = b();
        if (this.f17592r.size() <= 0) {
            return b7 + ": <> ";
        }
        sb.append(b7);
        sb.append(": ");
        if (f17600s.contains(b7)) {
            i8 = 3;
        }
        if (i8 > 0) {
            sb.append(this.f17592r.get(0).s(i7, i8 - 1));
        } else {
            String t6 = this.f17592r.get(0).t();
            if (t6.length() + i7 < c.f17593p) {
                sb.append(t6);
            } else {
                sb.append(this.f17592r.get(0).s(i7, i8 - 1));
            }
        }
        return sb.toString();
    }

    @Override // v.c
    public String t() {
        if (this.f17592r.size() <= 0) {
            return e() + b() + ": <> ";
        }
        return e() + b() + ": " + this.f17592r.get(0).t();
    }
}
