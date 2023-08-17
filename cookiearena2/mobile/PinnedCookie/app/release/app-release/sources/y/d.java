package y;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q.i;
/* loaded from: classes.dex */
public class d {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f18528j = false;

    /* renamed from: k  reason: collision with root package name */
    public static final int f18529k = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f18531b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18532c;

    /* renamed from: d  reason: collision with root package name */
    public final e f18533d;

    /* renamed from: e  reason: collision with root package name */
    public final b f18534e;

    /* renamed from: f  reason: collision with root package name */
    public d f18535f;

    /* renamed from: i  reason: collision with root package name */
    public q.i f18538i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f18530a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f18536g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f18537h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18539a;

        static {
            int[] iArr = new int[b.values().length];
            f18539a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18539a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18539a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18539a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18539a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18539a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18539a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18539a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18539a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f18533d = eVar;
        this.f18534e = bVar;
    }

    public void A(int i7) {
        this.f18531b = i7;
        this.f18532c = true;
    }

    public void B(int i7) {
        if (p()) {
            this.f18537h = i7;
        }
    }

    public void C(int i7) {
        if (p()) {
            this.f18536g = i7;
        }
    }

    public boolean a(d dVar, int i7) {
        return b(dVar, i7, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i7, int i8, boolean z6) {
        if (dVar == null) {
            x();
            return true;
        } else if (z6 || v(dVar)) {
            this.f18535f = dVar;
            if (dVar.f18530a == null) {
                dVar.f18530a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f18535f.f18530a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f18536g = i7;
            this.f18537h = i8;
            return true;
        } else {
            return false;
        }
    }

    public void c(d dVar, HashMap<e, e> hashMap) {
        HashSet<d> hashSet;
        d dVar2 = this.f18535f;
        if (dVar2 != null && (hashSet = dVar2.f18530a) != null) {
            hashSet.remove(this);
        }
        d dVar3 = dVar.f18535f;
        if (dVar3 != null) {
            this.f18535f = hashMap.get(dVar.f18535f.f18533d).r(dVar3.l());
        } else {
            this.f18535f = null;
        }
        d dVar4 = this.f18535f;
        if (dVar4 != null) {
            if (dVar4.f18530a == null) {
                dVar4.f18530a = new HashSet<>();
            }
            this.f18535f.f18530a.add(this);
        }
        this.f18536g = dVar.f18536g;
        this.f18537h = dVar.f18537h;
    }

    public void d(int i7, ArrayList<z.o> arrayList, z.o oVar) {
        HashSet<d> hashSet = this.f18530a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                z.i.a(it.next().f18533d, i7, arrayList, oVar);
            }
        }
    }

    public HashSet<d> e() {
        return this.f18530a;
    }

    public int f() {
        if (this.f18532c) {
            return this.f18531b;
        }
        return 0;
    }

    public int g() {
        d dVar;
        if (this.f18533d.l0() == 8) {
            return 0;
        }
        return (this.f18537h == Integer.MIN_VALUE || (dVar = this.f18535f) == null || dVar.f18533d.l0() != 8) ? this.f18536g : this.f18537h;
    }

    public final d h() {
        switch (a.f18539a[this.f18534e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f18533d.S;
            case 3:
                return this.f18533d.Q;
            case 4:
                return this.f18533d.T;
            case 5:
                return this.f18533d.R;
            default:
                throw new AssertionError(this.f18534e.name());
        }
    }

    public e i() {
        return this.f18533d;
    }

    public q.i j() {
        return this.f18538i;
    }

    public d k() {
        return this.f18535f;
    }

    public b l() {
        return this.f18534e;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f18530a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<d> hashSet = this.f18530a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f18532c;
    }

    public boolean p() {
        return this.f18535f != null;
    }

    public boolean q(e eVar) {
        if (s(eVar, new HashSet<>())) {
            return false;
        }
        e U = i().U();
        return U == eVar || eVar.U() == U;
    }

    public boolean r(e eVar, d dVar) {
        return q(eVar);
    }

    public final boolean s(e eVar, HashSet<e> hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == i()) {
            return true;
        }
        ArrayList<d> s6 = eVar.s();
        int size = s6.size();
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = s6.get(i7);
            if (dVar.u(this) && dVar.p() && s(dVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        switch (a.f18539a[this.f18534e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f18534e.name());
        }
    }

    public String toString() {
        return this.f18533d.y() + ":" + this.f18534e.toString();
    }

    public boolean u(d dVar) {
        b l7 = dVar.l();
        b bVar = this.f18534e;
        if (l7 == bVar) {
            return true;
        }
        switch (a.f18539a[bVar.ordinal()]) {
            case 1:
                return l7 != b.BASELINE;
            case 2:
            case 3:
            case 7:
                return l7 == b.LEFT || l7 == b.RIGHT || l7 == b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return l7 == b.TOP || l7 == b.BOTTOM || l7 == b.CENTER_Y || l7 == b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f18534e.name());
        }
    }

    public boolean v(d dVar) {
        if (dVar == null) {
            return false;
        }
        b l7 = dVar.l();
        b bVar = this.f18534e;
        if (l7 == bVar) {
            return bVar != b.BASELINE || (dVar.i().q0() && i().q0());
        }
        switch (a.f18539a[bVar.ordinal()]) {
            case 1:
                return (l7 == b.BASELINE || l7 == b.CENTER_X || l7 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z6 = l7 == b.LEFT || l7 == b.RIGHT;
                if (dVar.i() instanceof h) {
                    return z6 || l7 == b.CENTER_X;
                }
                return z6;
            case 4:
            case 5:
                boolean z7 = l7 == b.TOP || l7 == b.BOTTOM;
                if (dVar.i() instanceof h) {
                    return z7 || l7 == b.CENTER_Y;
                }
                return z7;
            case 6:
                return (l7 == b.LEFT || l7 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f18534e.name());
        }
    }

    public boolean w() {
        switch (a.f18539a[this.f18534e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f18534e.name());
        }
    }

    public void x() {
        HashSet<d> hashSet;
        d dVar = this.f18535f;
        if (dVar != null && (hashSet = dVar.f18530a) != null) {
            hashSet.remove(this);
            if (this.f18535f.f18530a.size() == 0) {
                this.f18535f.f18530a = null;
            }
        }
        this.f18530a = null;
        this.f18535f = null;
        this.f18536g = 0;
        this.f18537h = Integer.MIN_VALUE;
        this.f18532c = false;
        this.f18531b = 0;
    }

    public void y() {
        this.f18532c = false;
        this.f18531b = 0;
    }

    public void z(q.c cVar) {
        q.i iVar = this.f18538i;
        if (iVar == null) {
            this.f18538i = new q.i(i.b.UNRESTRICTED, (String) null);
        } else {
            iVar.l();
        }
    }
}
