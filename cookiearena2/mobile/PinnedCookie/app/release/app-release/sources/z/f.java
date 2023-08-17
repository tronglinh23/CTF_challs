package z;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public p f18929d;

    /* renamed from: f  reason: collision with root package name */
    public int f18931f;

    /* renamed from: g  reason: collision with root package name */
    public int f18932g;

    /* renamed from: a  reason: collision with root package name */
    public d f18926a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18927b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18928c = false;

    /* renamed from: e  reason: collision with root package name */
    public a f18930e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f18933h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f18934i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18935j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f18936k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f18937l = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f18929d = pVar;
    }

    @Override // z.d
    public void a(d dVar) {
        Iterator<f> it = this.f18937l.iterator();
        while (it.hasNext()) {
            if (!it.next().f18935j) {
                return;
            }
        }
        this.f18928c = true;
        d dVar2 = this.f18926a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f18927b) {
            this.f18929d.a(this);
            return;
        }
        f fVar = null;
        int i7 = 0;
        for (f fVar2 : this.f18937l) {
            if (!(fVar2 instanceof g)) {
                i7++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i7 == 1 && fVar.f18935j) {
            g gVar = this.f18934i;
            if (gVar != null) {
                if (!gVar.f18935j) {
                    return;
                }
                this.f18931f = this.f18933h * gVar.f18932g;
            }
            e(fVar.f18932g + this.f18931f);
        }
        d dVar3 = this.f18926a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f18936k.add(dVar);
        if (this.f18935j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f18937l.clear();
        this.f18936k.clear();
        this.f18935j = false;
        this.f18932g = 0;
        this.f18928c = false;
        this.f18927b = false;
    }

    public String d() {
        String str;
        String y6 = this.f18929d.f18989b.y();
        a aVar = this.f18930e;
        if (aVar == a.LEFT || aVar == a.RIGHT) {
            str = y6 + "_HORIZONTAL";
        } else {
            str = y6 + "_VERTICAL";
        }
        return str + ":" + this.f18930e.name();
    }

    public void e(int i7) {
        if (this.f18935j) {
            return;
        }
        this.f18935j = true;
        this.f18932g = i7;
        for (d dVar : this.f18936k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18929d.f18989b.y());
        sb.append(":");
        sb.append(this.f18930e);
        sb.append("(");
        sb.append(this.f18935j ? Integer.valueOf(this.f18932g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f18937l.size());
        sb.append(":d=");
        sb.append(this.f18936k.size());
        sb.append(">");
        return sb.toString();
    }
}
