package y;

import java.util.ArrayList;
import y.e;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public e f18506a;

    /* renamed from: b  reason: collision with root package name */
    public e f18507b;

    /* renamed from: c  reason: collision with root package name */
    public e f18508c;

    /* renamed from: d  reason: collision with root package name */
    public e f18509d;

    /* renamed from: e  reason: collision with root package name */
    public e f18510e;

    /* renamed from: f  reason: collision with root package name */
    public e f18511f;

    /* renamed from: g  reason: collision with root package name */
    public e f18512g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<e> f18513h;

    /* renamed from: i  reason: collision with root package name */
    public int f18514i;

    /* renamed from: j  reason: collision with root package name */
    public int f18515j;

    /* renamed from: k  reason: collision with root package name */
    public float f18516k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f18517l;

    /* renamed from: m  reason: collision with root package name */
    public int f18518m;

    /* renamed from: n  reason: collision with root package name */
    public int f18519n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18520o;

    /* renamed from: p  reason: collision with root package name */
    public int f18521p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f18522q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f18523r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f18524s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f18525t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18526u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f18527v;

    public c(e eVar, int i7, boolean z6) {
        this.f18506a = eVar;
        this.f18521p = i7;
        this.f18522q = z6;
    }

    public static boolean k(e eVar, int i7) {
        int i8;
        return eVar.l0() != 8 && eVar.f18579b0[i7] == e.b.MATCH_CONSTRAINT && ((i8 = eVar.f18624y[i7]) == 0 || i8 == 3);
    }

    public void a() {
        if (!this.f18527v) {
            b();
        }
        this.f18527v = true;
    }

    public final void b() {
        int i7 = this.f18521p * 2;
        e eVar = this.f18506a;
        this.f18520o = true;
        e eVar2 = eVar;
        boolean z6 = false;
        while (!z6) {
            this.f18514i++;
            e[] eVarArr = eVar.P0;
            int i8 = this.f18521p;
            e eVar3 = null;
            eVarArr[i8] = null;
            eVar.O0[i8] = null;
            if (eVar.l0() != 8) {
                this.f18517l++;
                e.b z7 = eVar.z(this.f18521p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (z7 != bVar) {
                    this.f18518m += eVar.M(this.f18521p);
                }
                int g7 = this.f18518m + eVar.Y[i7].g();
                this.f18518m = g7;
                int i9 = i7 + 1;
                this.f18518m = g7 + eVar.Y[i9].g();
                int g8 = this.f18519n + eVar.Y[i7].g();
                this.f18519n = g8;
                this.f18519n = g8 + eVar.Y[i9].g();
                if (this.f18507b == null) {
                    this.f18507b = eVar;
                }
                this.f18509d = eVar;
                e.b[] bVarArr = eVar.f18579b0;
                int i10 = this.f18521p;
                if (bVarArr[i10] == bVar) {
                    int i11 = eVar.f18624y[i10];
                    if (i11 == 0 || i11 == 3 || i11 == 2) {
                        this.f18515j++;
                        float f7 = eVar.N0[i10];
                        if (f7 > 0.0f) {
                            this.f18516k += f7;
                        }
                        if (k(eVar, i10)) {
                            if (f7 < 0.0f) {
                                this.f18523r = true;
                            } else {
                                this.f18524s = true;
                            }
                            if (this.f18513h == null) {
                                this.f18513h = new ArrayList<>();
                            }
                            this.f18513h.add(eVar);
                        }
                        if (this.f18511f == null) {
                            this.f18511f = eVar;
                        }
                        e eVar4 = this.f18512g;
                        if (eVar4 != null) {
                            eVar4.O0[this.f18521p] = eVar;
                        }
                        this.f18512g = eVar;
                    }
                    if (this.f18521p == 0) {
                        if (eVar.f18620w != 0) {
                            this.f18520o = false;
                        } else if (eVar.f18626z != 0 || eVar.A != 0) {
                            this.f18520o = false;
                        }
                    } else if (eVar.f18622x != 0) {
                        this.f18520o = false;
                    } else if (eVar.C != 0 || eVar.D != 0) {
                        this.f18520o = false;
                    }
                    if (eVar.f18587f0 != 0.0f) {
                        this.f18520o = false;
                        this.f18526u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.P0[this.f18521p] = eVar;
            }
            d dVar = eVar.Y[i7 + 1].f18535f;
            if (dVar != null) {
                e eVar5 = dVar.f18533d;
                d dVar2 = eVar5.Y[i7].f18535f;
                if (dVar2 != null && dVar2.f18533d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z6 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f18507b;
        if (eVar6 != null) {
            this.f18518m -= eVar6.Y[i7].g();
        }
        e eVar7 = this.f18509d;
        if (eVar7 != null) {
            this.f18518m -= eVar7.Y[i7 + 1].g();
        }
        this.f18508c = eVar;
        if (this.f18521p == 0 && this.f18522q) {
            this.f18510e = eVar;
        } else {
            this.f18510e = this.f18506a;
        }
        this.f18525t = this.f18524s && this.f18523r;
    }

    public e c() {
        return this.f18506a;
    }

    public e d() {
        return this.f18511f;
    }

    public e e() {
        return this.f18507b;
    }

    public e f() {
        return this.f18510e;
    }

    public e g() {
        return this.f18508c;
    }

    public e h() {
        return this.f18512g;
    }

    public e i() {
        return this.f18509d;
    }

    public float j() {
        return this.f18516k;
    }
}
