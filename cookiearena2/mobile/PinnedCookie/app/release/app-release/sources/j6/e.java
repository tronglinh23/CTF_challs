package j6;

import i6.j;
import i6.j0;
import i6.m;
import i6.p;
import s2.t0;
import t4.q;
import u4.l0;
import v3.m2;
import x3.o;
/* loaded from: classes.dex */
public final class e {
    public static final int b(@n6.d int[] iArr, int i7, int i8, int i9) {
        l0.p(iArr, "$this$binarySearch");
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i7) {
                i8 = i11 + 1;
            } else if (i12 <= i7) {
                return i11;
            } else {
                i10 = i11 - 1;
            }
        }
        return (-i8) - 1;
    }

    public static final boolean c(@n6.d i6.l0 l0Var, @n6.e Object obj) {
        l0.p(l0Var, "$this$commonEquals");
        if (obj == l0Var) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.c0() == l0Var.c0() && l0Var.T(0, pVar, 0, l0Var.c0())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@n6.d i6.l0 l0Var) {
        l0.p(l0Var, "$this$commonGetSize");
        return l0Var.r0()[l0Var.s0().length - 1];
    }

    public static final int e(@n6.d i6.l0 l0Var) {
        l0.p(l0Var, "$this$commonHashCode");
        int t6 = l0Var.t();
        if (t6 != 0) {
            return t6;
        }
        int length = l0Var.s0().length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int i10 = l0Var.r0()[length + i7];
            int i11 = l0Var.r0()[i7];
            byte[] bArr = l0Var.s0()[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        l0Var.X(i8);
        return i8;
    }

    public static final byte f(@n6.d i6.l0 l0Var, int i7) {
        l0.p(l0Var, "$this$commonInternalGet");
        j.e(l0Var.r0()[l0Var.s0().length - 1], i7, 1L);
        int n7 = n(l0Var, i7);
        return l0Var.s0()[n7][(i7 - (n7 == 0 ? 0 : l0Var.r0()[n7 - 1])) + l0Var.r0()[l0Var.s0().length + n7]];
    }

    public static final boolean g(@n6.d i6.l0 l0Var, int i7, @n6.d p pVar, int i8, int i9) {
        l0.p(l0Var, "$this$commonRangeEquals");
        l0.p(pVar, "other");
        if (i7 < 0 || i7 > l0Var.c0() - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int n7 = n(l0Var, i7);
        while (i7 < i10) {
            int i11 = n7 == 0 ? 0 : l0Var.r0()[n7 - 1];
            int i12 = l0Var.r0()[n7] - i11;
            int i13 = l0Var.r0()[l0Var.s0().length + n7];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!pVar.U(i8, l0Var.s0()[n7], i13 + (i7 - i11), min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            n7++;
        }
        return true;
    }

    public static final boolean h(@n6.d i6.l0 l0Var, int i7, @n6.d byte[] bArr, int i8, int i9) {
        l0.p(l0Var, "$this$commonRangeEquals");
        l0.p(bArr, "other");
        if (i7 < 0 || i7 > l0Var.c0() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int n7 = n(l0Var, i7);
        while (i7 < i10) {
            int i11 = n7 == 0 ? 0 : l0Var.r0()[n7 - 1];
            int i12 = l0Var.r0()[n7] - i11;
            int i13 = l0Var.r0()[l0Var.s0().length + n7];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!j.d(l0Var.s0()[n7], i13 + (i7 - i11), bArr, i8, min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            n7++;
        }
        return true;
    }

    @n6.d
    public static final p i(@n6.d i6.l0 l0Var, int i7, int i8) {
        l0.p(l0Var, "$this$commonSubstring");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i7 + " < 0").toString());
        }
        if (!(i8 <= l0Var.c0())) {
            throw new IllegalArgumentException(("endIndex=" + i8 + " > length(" + l0Var.c0() + ')').toString());
        }
        int i9 = i8 - i7;
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + i8 + " < beginIndex=" + i7).toString());
        } else if (i7 == 0 && i8 == l0Var.c0()) {
            return l0Var;
        } else {
            if (i7 == i8) {
                return p.f11251o;
            }
            int n7 = n(l0Var, i7);
            int n8 = n(l0Var, i8 - 1);
            byte[][] bArr = (byte[][]) o.M1(l0Var.s0(), n7, n8 + 1);
            int[] iArr = new int[bArr.length * 2];
            if (n7 <= n8) {
                int i10 = 0;
                int i11 = n7;
                while (true) {
                    iArr[i10] = Math.min(l0Var.r0()[i11] - i7, i9);
                    int i12 = i10 + 1;
                    iArr[i10 + bArr.length] = l0Var.r0()[l0Var.s0().length + i11];
                    if (i11 == n8) {
                        break;
                    }
                    i11++;
                    i10 = i12;
                }
            }
            int i13 = n7 != 0 ? l0Var.r0()[n7 - 1] : 0;
            int length = bArr.length;
            iArr[length] = iArr[length] + (i7 - i13);
            return new i6.l0(bArr, iArr);
        }
    }

    @n6.d
    public static final byte[] j(@n6.d i6.l0 l0Var) {
        l0.p(l0Var, "$this$commonToByteArray");
        byte[] bArr = new byte[l0Var.c0()];
        int length = l0Var.s0().length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int i10 = l0Var.r0()[length + i7];
            int i11 = l0Var.r0()[i7];
            int i12 = i11 - i8;
            o.W0(l0Var.s0()[i7], bArr, i9, i10, i10 + i12);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    public static final void k(@n6.d i6.l0 l0Var, @n6.d m mVar, int i7, int i8) {
        l0.p(l0Var, "$this$commonWrite");
        l0.p(mVar, "buffer");
        int i9 = i8 + i7;
        int n7 = n(l0Var, i7);
        while (i7 < i9) {
            int i10 = n7 == 0 ? 0 : l0Var.r0()[n7 - 1];
            int i11 = l0Var.r0()[n7] - i10;
            int i12 = l0Var.r0()[l0Var.s0().length + n7];
            int min = Math.min(i9, i11 + i10) - i7;
            int i13 = i12 + (i7 - i10);
            j0 j0Var = new j0(l0Var.s0()[n7], i13, i13 + min, true, false);
            j0 j0Var2 = mVar.f11238k;
            if (j0Var2 == null) {
                j0Var.f11218g = j0Var;
                j0Var.f11217f = j0Var;
                mVar.f11238k = j0Var;
            } else {
                l0.m(j0Var2);
                j0 j0Var3 = j0Var2.f11218g;
                l0.m(j0Var3);
                j0Var3.c(j0Var);
            }
            i7 += min;
            n7++;
        }
        mVar.W0(mVar.a1() + l0Var.c0());
    }

    public static final void l(i6.l0 l0Var, int i7, int i8, q<? super byte[], ? super Integer, ? super Integer, m2> qVar) {
        int n7 = n(l0Var, i7);
        while (i7 < i8) {
            int i9 = n7 == 0 ? 0 : l0Var.r0()[n7 - 1];
            int i10 = l0Var.r0()[n7] - i9;
            int i11 = l0Var.r0()[l0Var.s0().length + n7];
            int min = Math.min(i8, i10 + i9) - i7;
            qVar.I(l0Var.s0()[n7], Integer.valueOf(i11 + (i7 - i9)), Integer.valueOf(min));
            i7 += min;
            n7++;
        }
    }

    public static final void m(@n6.d i6.l0 l0Var, @n6.d q<? super byte[], ? super Integer, ? super Integer, m2> qVar) {
        l0.p(l0Var, "$this$forEachSegment");
        l0.p(qVar, t0.f16450f);
        int length = l0Var.s0().length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = l0Var.r0()[length + i7];
            int i10 = l0Var.r0()[i7];
            qVar.I(l0Var.s0()[i7], Integer.valueOf(i9), Integer.valueOf(i10 - i8));
            i7++;
            i8 = i10;
        }
    }

    public static final int n(@n6.d i6.l0 l0Var, int i7) {
        l0.p(l0Var, "$this$segment");
        int b7 = b(l0Var.r0(), i7 + 1, 0, l0Var.s0().length);
        return b7 >= 0 ? b7 : ~b7;
    }
}
