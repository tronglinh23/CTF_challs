package z;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<p> f18914k;

    /* renamed from: l  reason: collision with root package name */
    public int f18915l;

    public c(y.e eVar, int i7) {
        super(eVar);
        this.f18914k = new ArrayList<>();
        this.f18993f = i7;
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0400, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // z.p, z.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(z.d r27) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.c.a(z.d):void");
    }

    @Override // z.p
    public void d() {
        Iterator<p> it = this.f18914k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f18914k.size();
        if (size < 1) {
            return;
        }
        y.e eVar = this.f18914k.get(0).f18989b;
        y.e eVar2 = this.f18914k.get(size - 1).f18989b;
        if (this.f18993f == 0) {
            y.d dVar = eVar.Q;
            y.d dVar2 = eVar2.S;
            f i7 = i(dVar, 0);
            int g7 = dVar.g();
            y.e v6 = v();
            if (v6 != null) {
                g7 = v6.Q.g();
            }
            if (i7 != null) {
                b(this.f18995h, i7, g7);
            }
            f i8 = i(dVar2, 0);
            int g8 = dVar2.g();
            y.e w6 = w();
            if (w6 != null) {
                g8 = w6.S.g();
            }
            if (i8 != null) {
                b(this.f18996i, i8, -g8);
            }
        } else {
            y.d dVar3 = eVar.R;
            y.d dVar4 = eVar2.T;
            f i9 = i(dVar3, 1);
            int g9 = dVar3.g();
            y.e v7 = v();
            if (v7 != null) {
                g9 = v7.R.g();
            }
            if (i9 != null) {
                b(this.f18995h, i9, g9);
            }
            f i10 = i(dVar4, 1);
            int g10 = dVar4.g();
            y.e w7 = w();
            if (w7 != null) {
                g10 = w7.T.g();
            }
            if (i10 != null) {
                b(this.f18996i, i10, -g10);
            }
        }
        this.f18995h.f18926a = this;
        this.f18996i.f18926a = this;
    }

    @Override // z.p
    public void e() {
        for (int i7 = 0; i7 < this.f18914k.size(); i7++) {
            this.f18914k.get(i7).e();
        }
    }

    @Override // z.p
    public void f() {
        this.f18990c = null;
        Iterator<p> it = this.f18914k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // z.p
    public long j() {
        int size = this.f18914k.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j7 = j7 + r4.f18995h.f18931f + this.f18914k.get(i7).j() + r4.f18996i.f18931f;
        }
        return j7;
    }

    @Override // z.p
    public void n() {
        this.f18995h.f18935j = false;
        this.f18996i.f18935j = false;
    }

    @Override // z.p
    public boolean p() {
        int size = this.f18914k.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!this.f18914k.get(i7).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f18993f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f18914k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }

    public final void u() {
        y.e eVar;
        y.e eVar2 = this.f18989b;
        y.e V = eVar2.V(this.f18993f);
        while (true) {
            y.e eVar3 = V;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            V = eVar2.V(this.f18993f);
        }
        this.f18989b = eVar;
        this.f18914k.add(eVar.a0(this.f18993f));
        y.e R = eVar.R(this.f18993f);
        while (R != null) {
            this.f18914k.add(R.a0(this.f18993f));
            R = R.R(this.f18993f);
        }
        Iterator<p> it = this.f18914k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i7 = this.f18993f;
            if (i7 == 0) {
                next.f18989b.f18580c = this;
            } else if (i7 == 1) {
                next.f18989b.f18582d = this;
            }
        }
        if ((this.f18993f == 0 && ((y.f) this.f18989b.U()).O2()) && this.f18914k.size() > 1) {
            ArrayList<p> arrayList = this.f18914k;
            this.f18989b = arrayList.get(arrayList.size() - 1).f18989b;
        }
        this.f18915l = this.f18993f == 0 ? this.f18989b.G() : this.f18989b.i0();
    }

    public final y.e v() {
        for (int i7 = 0; i7 < this.f18914k.size(); i7++) {
            p pVar = this.f18914k.get(i7);
            if (pVar.f18989b.l0() != 8) {
                return pVar.f18989b;
            }
        }
        return null;
    }

    public final y.e w() {
        for (int size = this.f18914k.size() - 1; size >= 0; size--) {
            p pVar = this.f18914k.get(size);
            if (pVar.f18989b.l0() != 8) {
                return pVar.f18989b;
            }
        }
        return null;
    }
}
