package i6;

import java.util.List;
import java.util.RandomAccess;
import v3.t1;
/* loaded from: classes.dex */
public final class d0 extends x3.c<p> implements RandomAccess {

    /* renamed from: n  reason: collision with root package name */
    public static final a f11169n = new a(null);
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final p[] f11170l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final int[] f11171m;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public static /* synthetic */ void b(a aVar, long j7, m mVar, int i7, List list, int i8, int i9, List list2, int i10, Object obj) {
            aVar.a((i10 & 1) != 0 ? 0L : j7, mVar, (i10 & 4) != 0 ? 0 : i7, list, (i10 & 16) != 0 ? 0 : i8, (i10 & 32) != 0 ? list.size() : i9, list2);
        }

        public final void a(long j7, m mVar, int i7, List<? extends p> list, int i8, int i9, List<Integer> list2) {
            int i10;
            int i11;
            int i12;
            int i13;
            m mVar2;
            int i14 = i7;
            if (!(i8 < i9)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i15 = i8; i15 < i9; i15++) {
                if (!(list.get(i15).c0() >= i14)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            p pVar = list.get(i8);
            p pVar2 = list.get(i9 - 1);
            int i16 = -1;
            if (i14 == pVar.c0()) {
                int intValue = list2.get(i8).intValue();
                int i17 = i8 + 1;
                p pVar3 = list.get(i17);
                i10 = i17;
                i11 = intValue;
                pVar = pVar3;
            } else {
                i10 = i8;
                i11 = -1;
            }
            if (pVar.r(i14) == pVar2.r(i14)) {
                int min = Math.min(pVar.c0(), pVar2.c0());
                int i18 = 0;
                for (int i19 = i14; i19 < min && pVar.r(i19) == pVar2.r(i19); i19++) {
                    i18++;
                }
                long c7 = j7 + c(mVar) + 2 + i18 + 1;
                mVar.J(-i18);
                mVar.J(i11);
                int i20 = i14 + i18;
                while (i14 < i20) {
                    mVar.J(pVar.r(i14) & t1.f17828n);
                    i14++;
                }
                if (i10 + 1 == i9) {
                    if (!(i20 == list.get(i10).c0())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    mVar.J(list2.get(i10).intValue());
                    return;
                }
                m mVar3 = new m();
                mVar.J(((int) (c(mVar3) + c7)) * (-1));
                a(c7, mVar3, i20, list, i10, i9, list2);
                mVar.B(mVar3);
                return;
            }
            int i21 = 1;
            for (int i22 = i10 + 1; i22 < i9; i22++) {
                if (list.get(i22 - 1).r(i14) != list.get(i22).r(i14)) {
                    i21++;
                }
            }
            long c8 = j7 + c(mVar) + 2 + (i21 * 2);
            mVar.J(i21);
            mVar.J(i11);
            for (int i23 = i10; i23 < i9; i23++) {
                byte r6 = list.get(i23).r(i14);
                if (i23 == i10 || r6 != list.get(i23 - 1).r(i14)) {
                    mVar.J(r6 & t1.f17828n);
                }
            }
            m mVar4 = new m();
            while (i10 < i9) {
                byte r7 = list.get(i10).r(i14);
                int i24 = i10 + 1;
                int i25 = i24;
                while (true) {
                    if (i25 >= i9) {
                        i12 = i9;
                        break;
                    } else if (r7 != list.get(i25).r(i14)) {
                        i12 = i25;
                        break;
                    } else {
                        i25++;
                    }
                }
                if (i24 == i12 && i14 + 1 == list.get(i10).c0()) {
                    mVar.J(list2.get(i10).intValue());
                    i13 = i12;
                    mVar2 = mVar4;
                } else {
                    mVar.J(((int) (c8 + c(mVar4))) * i16);
                    i13 = i12;
                    mVar2 = mVar4;
                    a(c8, mVar4, i14 + 1, list, i10, i12, list2);
                }
                mVar4 = mVar2;
                i10 = i13;
                i16 = -1;
            }
            mVar.B(mVar4);
        }

        public final long c(m mVar) {
            return mVar.a1() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
            continue;
         */
        @n6.d
        @s4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final i6.d0 d(@n6.d i6.p... r17) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i6.d0.a.d(i6.p[]):i6.d0");
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    public /* synthetic */ d0(p[] pVarArr, int[] iArr, u4.w wVar) {
        this(pVarArr, iArr);
    }

    @n6.d
    @s4.m
    public static final d0 k(@n6.d p... pVarArr) {
        return f11169n.d(pVarArr);
    }

    @Override // x3.c, x3.a
    public int a() {
        return this.f11170l.length;
    }

    public /* bridge */ boolean b(p pVar) {
        return super.contains(pVar);
    }

    @Override // x3.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof p) {
            return b((p) obj);
        }
        return false;
    }

    @Override // x3.c, java.util.List
    @n6.d
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public p get(int i7) {
        return this.f11170l[i7];
    }

    @n6.d
    public final p[] f() {
        return this.f11170l;
    }

    @n6.d
    public final int[] g() {
        return this.f11171m;
    }

    public /* bridge */ int i(p pVar) {
        return super.indexOf(pVar);
    }

    @Override // x3.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof p) {
            return i((p) obj);
        }
        return -1;
    }

    public /* bridge */ int j(p pVar) {
        return super.lastIndexOf(pVar);
    }

    @Override // x3.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof p) {
            return j((p) obj);
        }
        return -1;
    }

    public d0(p[] pVarArr, int[] iArr) {
        this.f11170l = pVarArr;
        this.f11171m = iArr;
    }
}
