package y;

import y.e;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18690a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f18691b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f18692c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f18693d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f18694e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final int f18695f = 16;

    /* renamed from: g  reason: collision with root package name */
    public static final int f18696g = 32;

    /* renamed from: h  reason: collision with root package name */
    public static final int f18697h = 64;

    /* renamed from: i  reason: collision with root package name */
    public static final int f18698i = 128;

    /* renamed from: j  reason: collision with root package name */
    public static final int f18699j = 256;

    /* renamed from: k  reason: collision with root package name */
    public static final int f18700k = 512;

    /* renamed from: l  reason: collision with root package name */
    public static final int f18701l = 1024;

    /* renamed from: m  reason: collision with root package name */
    public static final int f18702m = 257;

    /* renamed from: n  reason: collision with root package name */
    public static boolean[] f18703n = new boolean[3];

    /* renamed from: o  reason: collision with root package name */
    public static final int f18704o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f18705p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f18706q = 2;

    public static void a(f fVar, q.e eVar, e eVar2) {
        eVar2.f18614t = -1;
        eVar2.f18616u = -1;
        e.b bVar = fVar.f18579b0[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar2.f18579b0[0] == e.b.MATCH_PARENT) {
            int i7 = eVar2.Q.f18536g;
            int m02 = fVar.m0() - eVar2.S.f18536g;
            d dVar = eVar2.Q;
            dVar.f18538i = eVar.u(dVar);
            d dVar2 = eVar2.S;
            dVar2.f18538i = eVar.u(dVar2);
            eVar.f(eVar2.Q.f18538i, i7);
            eVar.f(eVar2.S.f18538i, m02);
            eVar2.f18614t = 2;
            eVar2.C1(i7, m02);
        }
        if (fVar.f18579b0[1] == bVar2 || eVar2.f18579b0[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i8 = eVar2.R.f18536g;
        int D = fVar.D() - eVar2.T.f18536g;
        d dVar3 = eVar2.R;
        dVar3.f18538i = eVar.u(dVar3);
        d dVar4 = eVar2.T;
        dVar4.f18538i = eVar.u(dVar4);
        eVar.f(eVar2.R.f18538i, i8);
        eVar.f(eVar2.T.f18538i, D);
        if (eVar2.f18603n0 > 0 || eVar2.l0() == 8) {
            d dVar5 = eVar2.U;
            dVar5.f18538i = eVar.u(dVar5);
            eVar.f(eVar2.U.f18538i, eVar2.f18603n0 + i8);
        }
        eVar2.f18616u = 2;
        eVar2.X1(i8, D);
    }

    public static final boolean b(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
