package w;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: f  reason: collision with root package name */
    public static final int f17930f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f17931g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f17932h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f17933i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final Integer f17934j = 0;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Object, w.e> f17935a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<Object, w.c> f17936b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, ArrayList<String>> f17937c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final w.a f17938d;

    /* renamed from: e  reason: collision with root package name */
    public int f17939e;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17940a;

        static {
            int[] iArr = new int[e.values().length];
            f17940a = iArr;
            try {
                iArr[e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17940a[e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17940a[e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17940a[e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17940a[e.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* loaded from: classes.dex */
    public enum c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* loaded from: classes.dex */
    public enum d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* loaded from: classes.dex */
    public enum e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public h() {
        w.a aVar = new w.a(this);
        this.f17938d = aVar;
        this.f17939e = 0;
        this.f17935a.put(f17934j, aVar);
    }

    public x.f A(Object obj) {
        return k(obj, 1);
    }

    public h B(w.b bVar) {
        return x(bVar);
    }

    public void a(y.f fVar) {
        w.c cVar;
        y.j N0;
        y.j N02;
        fVar.p2();
        this.f17938d.W().j(this, fVar, 0);
        this.f17938d.E().j(this, fVar, 1);
        for (Object obj : this.f17936b.keySet()) {
            y.j N03 = this.f17936b.get(obj).N0();
            if (N03 != null) {
                w.e eVar = this.f17935a.get(obj);
                if (eVar == null) {
                    eVar = e(obj);
                }
                eVar.c(N03);
            }
        }
        for (Object obj2 : this.f17935a.keySet()) {
            w.e eVar2 = this.f17935a.get(obj2);
            if (eVar2 != this.f17938d && (eVar2.e() instanceof w.c) && (N02 = ((w.c) eVar2.e()).N0()) != null) {
                w.e eVar3 = this.f17935a.get(obj2);
                if (eVar3 == null) {
                    eVar3 = e(obj2);
                }
                eVar3.c(N02);
            }
        }
        Iterator<Object> it = this.f17935a.keySet().iterator();
        while (it.hasNext()) {
            w.e eVar4 = this.f17935a.get(it.next());
            if (eVar4 != this.f17938d) {
                y.e a7 = eVar4.a();
                a7.j1(eVar4.getKey().toString());
                a7.S1(null);
                if (eVar4.e() instanceof x.f) {
                    eVar4.b();
                }
                fVar.b(a7);
            } else {
                eVar4.c(fVar);
            }
        }
        Iterator<Object> it2 = this.f17936b.keySet().iterator();
        while (it2.hasNext()) {
            w.c cVar2 = this.f17936b.get(it2.next());
            if (cVar2.N0() != null) {
                Iterator<Object> it3 = cVar2.f17926l0.iterator();
                while (it3.hasNext()) {
                    cVar2.N0().b(this.f17935a.get(it3.next()).a());
                }
                cVar2.b();
            } else {
                cVar2.b();
            }
        }
        Iterator<Object> it4 = this.f17935a.keySet().iterator();
        while (it4.hasNext()) {
            w.e eVar5 = this.f17935a.get(it4.next());
            if (eVar5 != this.f17938d && (eVar5.e() instanceof w.c) && (N0 = (cVar = (w.c) eVar5.e()).N0()) != null) {
                Iterator<Object> it5 = cVar.f17926l0.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    w.e eVar6 = this.f17935a.get(next);
                    if (eVar6 != null) {
                        N0.b(eVar6.a());
                    } else if (next instanceof w.e) {
                        N0.b(((w.e) next).a());
                    } else {
                        System.out.println("couldn't find reference for " + next);
                    }
                }
                eVar5.b();
            }
        }
        for (Object obj3 : this.f17935a.keySet()) {
            w.e eVar7 = this.f17935a.get(obj3);
            eVar7.b();
            y.e a8 = eVar7.a();
            if (a8 != null && obj3 != null) {
                a8.f18604o = obj3.toString();
            }
        }
    }

    public x.c b(Object obj, d dVar) {
        w.a e7 = e(obj);
        if (e7.e() == null || !(e7.e() instanceof x.c)) {
            x.c cVar = new x.c(this);
            cVar.Q0(dVar);
            e7.q0(cVar);
        }
        return (x.c) e7.e();
    }

    public x.a c(Object... objArr) {
        x.a aVar = (x.a) m(null, e.ALIGN_HORIZONTALLY);
        aVar.M0(objArr);
        return aVar;
    }

    public x.b d(Object... objArr) {
        x.b bVar = (x.b) m(null, e.ALIGN_VERTICALLY);
        bVar.M0(objArr);
        return bVar;
    }

    public w.a e(Object obj) {
        w.e eVar = this.f17935a.get(obj);
        if (eVar == null) {
            eVar = g(obj);
            this.f17935a.put(obj, eVar);
            eVar.d(obj);
        }
        if (eVar instanceof w.a) {
            return (w.a) eVar;
        }
        return null;
    }

    public int f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public w.a g(Object obj) {
        return new w.a(this);
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i7 = this.f17939e;
        this.f17939e = i7 + 1;
        sb.append(i7);
        sb.append("__");
        return sb.toString();
    }

    public void i() {
        for (Object obj : this.f17935a.keySet()) {
            w.a e7 = e(obj);
            if (e7 instanceof w.a) {
                e7.x0(obj);
            }
        }
    }

    public ArrayList<String> j(String str) {
        if (this.f17937c.containsKey(str)) {
            return this.f17937c.get(str);
        }
        return null;
    }

    public x.f k(Object obj, int i7) {
        w.a e7 = e(obj);
        if (e7.e() == null || !(e7.e() instanceof x.f)) {
            x.f fVar = new x.f(this);
            fVar.i(i7);
            fVar.d(obj);
            e7.q0(fVar);
        }
        return (x.f) e7.e();
    }

    public h l(w.b bVar) {
        return v(bVar);
    }

    public w.c m(Object obj, e eVar) {
        w.c gVar;
        if (obj == null) {
            obj = h();
        }
        w.c cVar = this.f17936b.get(obj);
        if (cVar == null) {
            int i7 = a.f17940a[eVar.ordinal()];
            if (i7 == 1) {
                gVar = new x.g(this);
            } else if (i7 == 2) {
                gVar = new x.h(this);
            } else if (i7 == 3) {
                gVar = new x.a(this);
            } else if (i7 == 4) {
                gVar = new x.b(this);
            } else if (i7 != 5) {
                cVar = new w.c(this, eVar);
                cVar.d(obj);
                this.f17936b.put(obj, cVar);
            } else {
                gVar = new x.c(this);
            }
            cVar = gVar;
            cVar.d(obj);
            this.f17936b.put(obj, cVar);
        }
        return cVar;
    }

    public x.g n() {
        return (x.g) m(null, e.HORIZONTAL_CHAIN);
    }

    public x.g o(Object... objArr) {
        x.g gVar = (x.g) m(null, e.HORIZONTAL_CHAIN);
        gVar.M0(objArr);
        return gVar;
    }

    public x.f p(Object obj) {
        return k(obj, 0);
    }

    public void q(Object obj, Object obj2) {
        w.a e7 = e(obj);
        if (e7 instanceof w.a) {
            e7.x0(obj2);
        }
    }

    public w.e r(Object obj) {
        return this.f17935a.get(obj);
    }

    public void s() {
        this.f17936b.clear();
        this.f17937c.clear();
    }

    public boolean t(int i7) {
        return this.f17938d.E().k(i7);
    }

    public boolean u(int i7) {
        return this.f17938d.W().k(i7);
    }

    public h v(w.b bVar) {
        this.f17938d.r0(bVar);
        return this;
    }

    public void w(String str, String str2) {
        ArrayList<String> arrayList;
        w.a e7 = e(str);
        if (e7 instanceof w.a) {
            e7.u0(str2);
            if (this.f17937c.containsKey(str2)) {
                arrayList = this.f17937c.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f17937c.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public h x(w.b bVar) {
        this.f17938d.y0(bVar);
        return this;
    }

    public x.h y() {
        return (x.h) m(null, e.VERTICAL_CHAIN);
    }

    public x.h z(Object... objArr) {
        x.h hVar = (x.h) m(null, e.VERTICAL_CHAIN);
        hVar.M0(objArr);
        return hVar;
    }
}