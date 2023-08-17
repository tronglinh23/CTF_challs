package y;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18504a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f18505b = false;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r7 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(y.f r37, q.e r38, int r39, int r40, y.c r41) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b.a(y.f, q.e, int, int, y.c):void");
    }

    public static void b(f fVar, q.e eVar, ArrayList<e> arrayList, int i7) {
        int i8;
        c[] cVarArr;
        int i9;
        if (i7 == 0) {
            i8 = fVar.M1;
            cVarArr = fVar.P1;
            i9 = 0;
        } else {
            i8 = fVar.N1;
            cVarArr = fVar.O1;
            i9 = 2;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            c cVar = cVarArr[i10];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f18506a)) {
                a(fVar, eVar, i7, i9, cVar);
            }
        }
    }
}
