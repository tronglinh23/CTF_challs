package z;

import java.util.ArrayList;
import y.e;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18954a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f18955b = false;

    public static o a(y.e eVar, int i7, ArrayList<o> arrayList, o oVar) {
        int l22;
        int i8 = i7 == 0 ? eVar.S0 : eVar.T0;
        if (i8 != -1 && (oVar == null || i8 != oVar.f18975b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i9);
                if (oVar2.f() == i8) {
                    if (oVar != null) {
                        oVar.m(i7, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i9++;
                }
            }
        } else if (i8 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof y.j) && (l22 = ((y.j) eVar).l2(i7)) != -1) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i10);
                    if (oVar3.f() == l22) {
                        oVar = oVar3;
                        break;
                    }
                    i10++;
                }
            }
            if (oVar == null) {
                oVar = new o(i7);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof y.h) {
                y.h hVar = (y.h) eVar;
                hVar.l2().d(hVar.m2() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i7 == 0) {
                eVar.S0 = oVar.f();
                eVar.Q.d(i7, arrayList, oVar);
                eVar.S.d(i7, arrayList, oVar);
            } else {
                eVar.T0 = oVar.f();
                eVar.R.d(i7, arrayList, oVar);
                eVar.U.d(i7, arrayList, oVar);
                eVar.T.d(i7, arrayList, oVar);
            }
            eVar.X.d(i7, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList<o> arrayList, int i7) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = arrayList.get(i8);
            if (i7 == oVar.f18975b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(y.f r16, z.b.InterfaceC0268b r17) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.i.c(y.f, z.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
