package j6;

import i6.a0;
import i6.d0;
import i6.f0;
import i6.i0;
import i6.j;
import i6.m;
import i6.m0;
import i6.o;
import i6.p;
import i6.q0;
import java.io.EOFException;
import u4.l0;
/* loaded from: classes.dex */
public final class d {
    @n6.d
    public static final String A(@n6.d i0 i0Var, long j7) {
        l0.p(i0Var, "$this$commonReadUtf8");
        i0Var.G0(j7);
        return i0Var.f11205k.q(j7);
    }

    public static final int B(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadUtf8CodePoint");
        i0Var.G0(1L);
        byte Z = i0Var.f11205k.Z(0L);
        if ((Z & 224) == 192) {
            i0Var.G0(2L);
        } else if ((Z & 240) == 224) {
            i0Var.G0(3L);
        } else if ((Z & 248) == 240) {
            i0Var.G0(4L);
        }
        return i0Var.f11205k.o();
    }

    @n6.e
    public static final String C(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadUtf8Line");
        long N0 = i0Var.N0((byte) 10);
        if (N0 == -1) {
            if (i0Var.f11205k.a1() != 0) {
                return i0Var.q(i0Var.f11205k.a1());
            }
            return null;
        }
        return a.b0(i0Var.f11205k, N0);
    }

    @n6.d
    public static final String D(@n6.d i0 i0Var, long j7) {
        l0.p(i0Var, "$this$commonReadUtf8LineStrict");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
        byte b7 = (byte) 10;
        long s02 = i0Var.s0(b7, 0L, j8);
        if (s02 != -1) {
            return a.b0(i0Var.f11205k, s02);
        }
        if (j8 < Long.MAX_VALUE && i0Var.G(j8) && i0Var.f11205k.Z(j8 - 1) == ((byte) 13) && i0Var.G(1 + j8) && i0Var.f11205k.Z(j8) == b7) {
            return a.b0(i0Var.f11205k, j8);
        }
        m mVar = new m();
        m mVar2 = i0Var.f11205k;
        mVar2.A(mVar, 0L, Math.min(32, mVar2.a1()));
        throw new EOFException("\\n not found: limit=" + Math.min(i0Var.f11205k.a1(), j7) + " content=" + mVar.x().w() + "…");
    }

    public static final boolean E(@n6.d i0 i0Var, long j7) {
        l0.p(i0Var, "$this$commonRequest");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if ((!i0Var.f11206l) == false) {
            throw new IllegalStateException("closed".toString());
        }
        while (i0Var.f11205k.a1() < j7) {
            if (i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void F(@n6.d i0 i0Var, long j7) {
        l0.p(i0Var, "$this$commonRequire");
        if (!i0Var.G(j7)) {
            throw new EOFException();
        }
    }

    public static final int G(@n6.d i0 i0Var, @n6.d d0 d0Var) {
        l0.p(i0Var, "$this$commonSelect");
        l0.p(d0Var, "options");
        if ((!i0Var.f11206l) == false) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int d02 = a.d0(i0Var.f11205k, d0Var, true);
            if (d02 != -2) {
                if (d02 != -1) {
                    i0Var.f11205k.skip(d0Var.f()[d02].c0());
                    return d02;
                }
                return -1;
            }
        } while (i0Var.f11207m.l0(i0Var.f11205k, 8192) != -1);
        return -1;
    }

    public static final void H(@n6.d i0 i0Var, long j7) {
        l0.p(i0Var, "$this$commonSkip");
        if ((!i0Var.f11206l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        while (j7 > 0) {
            if (i0Var.f11205k.a1() == 0 && i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j7, i0Var.f11205k.a1());
            i0Var.f11205k.skip(min);
            j7 -= min;
        }
    }

    @n6.d
    public static final q0 I(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonTimeout");
        return i0Var.f11207m.c();
    }

    @n6.d
    public static final String J(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonToString");
        return "buffer(" + i0Var.f11207m + ')';
    }

    public static final void a(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonClose");
        if (i0Var.f11206l) {
            return;
        }
        i0Var.f11206l = true;
        i0Var.f11207m.close();
        i0Var.f11205k.l();
    }

    public static final boolean b(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonExhausted");
        if ((!i0Var.f11206l) == true) {
            return i0Var.f11205k.c0() && i0Var.f11207m.l0(i0Var.f11205k, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long c(@n6.d i0 i0Var, byte b7, long j7, long j8) {
        l0.p(i0Var, "$this$commonIndexOf");
        if ((!i0Var.f11206l) == true) {
            if (!(0 <= j7 && j8 >= j7)) {
                throw new IllegalArgumentException(("fromIndex=" + j7 + " toIndex=" + j8).toString());
            }
            while (j7 < j8) {
                long s02 = i0Var.f11205k.s0(b7, j7, j8);
                if (s02 == -1) {
                    long a12 = i0Var.f11205k.a1();
                    if (a12 >= j8 || i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
                        break;
                    }
                    j7 = Math.max(j7, a12);
                } else {
                    return s02;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long d(@n6.d i0 i0Var, @n6.d p pVar, long j7) {
        l0.p(i0Var, "$this$commonIndexOf");
        l0.p(pVar, "bytes");
        if ((!i0Var.f11206l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long W = i0Var.f11205k.W(pVar, j7);
            if (W != -1) {
                return W;
            }
            long a12 = i0Var.f11205k.a1();
            if (i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, (a12 - pVar.c0()) + 1);
        }
    }

    public static final long e(@n6.d i0 i0Var, @n6.d p pVar, long j7) {
        l0.p(i0Var, "$this$commonIndexOfElement");
        l0.p(pVar, "targetBytes");
        if ((!i0Var.f11206l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long U = i0Var.f11205k.U(pVar, j7);
            if (U != -1) {
                return U;
            }
            long a12 = i0Var.f11205k.a1();
            if (i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, a12);
        }
    }

    @n6.d
    public static final o f(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonPeek");
        return a0.d(new f0(i0Var));
    }

    public static final boolean g(@n6.d i0 i0Var, long j7, @n6.d p pVar, int i7, int i8) {
        l0.p(i0Var, "$this$commonRangeEquals");
        l0.p(pVar, "bytes");
        if ((!i0Var.f11206l) == true) {
            if (j7 < 0 || i7 < 0 || i8 < 0 || pVar.c0() - i7 < i8) {
                return false;
            }
            for (int i9 = 0; i9 < i8; i9++) {
                long j8 = i9 + j7;
                if (!i0Var.G(1 + j8) || i0Var.f11205k.Z(j8) != pVar.r(i7 + i9)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final int h(@n6.d i0 i0Var, @n6.d byte[] bArr, int i7, int i8) {
        l0.p(i0Var, "$this$commonRead");
        l0.p(bArr, "sink");
        long j7 = i8;
        j.e(bArr.length, i7, j7);
        if (i0Var.f11205k.a1() == 0 && i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
            return -1;
        }
        return i0Var.f11205k.read(bArr, i7, (int) Math.min(j7, i0Var.f11205k.a1()));
    }

    public static final long i(@n6.d i0 i0Var, @n6.d m mVar, long j7) {
        l0.p(i0Var, "$this$commonRead");
        l0.p(mVar, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        } else if ((!i0Var.f11206l) == true) {
            if (i0Var.f11205k.a1() == 0 && i0Var.f11207m.l0(i0Var.f11205k, 8192) == -1) {
                return -1L;
            }
            return i0Var.f11205k.l0(mVar, Math.min(j7, i0Var.f11205k.a1()));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public static final long j(@n6.d i0 i0Var, @n6.d m0 m0Var) {
        l0.p(i0Var, "$this$commonReadAll");
        l0.p(m0Var, "sink");
        long j7 = 0;
        while (i0Var.f11207m.l0(i0Var.f11205k, 8192) != -1) {
            long p6 = i0Var.f11205k.p();
            if (p6 > 0) {
                j7 += p6;
                m0Var.w(i0Var.f11205k, p6);
            }
        }
        if (i0Var.f11205k.a1() > 0) {
            long a12 = j7 + i0Var.f11205k.a1();
            m mVar = i0Var.f11205k;
            m0Var.w(mVar, mVar.a1());
            return a12;
        }
        return j7;
    }

    public static final byte k(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadByte");
        i0Var.G0(1L);
        return i0Var.f11205k.readByte();
    }

    @n6.d
    public static final byte[] l(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadByteArray");
        i0Var.f11205k.B(i0Var.f11207m);
        return i0Var.f11205k.V();
    }

    @n6.d
    public static final byte[] m(@n6.d i0 i0Var, long j7) {
        l0.p(i0Var, "$this$commonReadByteArray");
        i0Var.G0(j7);
        return i0Var.f11205k.h0(j7);
    }

    @n6.d
    public static final p n(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadByteString");
        i0Var.f11205k.B(i0Var.f11207m);
        return i0Var.f11205k.x();
    }

    @n6.d
    public static final p o(@n6.d i0 i0Var, long j7) {
        l0.p(i0Var, "$this$commonReadByteString");
        i0Var.G0(j7);
        return i0Var.f11205k.z(j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9] or '-' character but was 0x");
        r1 = java.lang.Integer.toString(r8, i5.d.a(i5.d.a(16)));
        u4.l0.o(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long p(@n6.d i6.i0 r10) {
        /*
            java.lang.String r0 = "$this$commonReadDecimalLong"
            u4.l0.p(r10, r0)
            r0 = 1
            r10.G0(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.G(r6)
            if (r8 == 0) goto L5e
            i6.m r8 = r10.f11205k
            byte r8 = r8.Z(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L25
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2f
        L25:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L31
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2f
            goto L31
        L2f:
            r4 = r6
            goto Ld
        L31:
            if (r4 == 0) goto L34
            goto L5e
        L34:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = i5.d.a(r1)
            int r1 = i5.d.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            u4.l0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L5e:
            i6.m r10 = r10.f11205k
            long r0 = r10.v0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.d.p(i6.i0):long");
    }

    public static final void q(@n6.d i0 i0Var, @n6.d m mVar, long j7) {
        l0.p(i0Var, "$this$commonReadFully");
        l0.p(mVar, "sink");
        try {
            i0Var.G0(j7);
            i0Var.f11205k.K0(mVar, j7);
        } catch (EOFException e7) {
            mVar.B(i0Var.f11205k);
            throw e7;
        }
    }

    public static final void r(@n6.d i0 i0Var, @n6.d byte[] bArr) {
        l0.p(i0Var, "$this$commonReadFully");
        l0.p(bArr, "sink");
        try {
            i0Var.G0(bArr.length);
            i0Var.f11205k.readFully(bArr);
        } catch (EOFException e7) {
            int i7 = 0;
            while (i0Var.f11205k.a1() > 0) {
                m mVar = i0Var.f11205k;
                int read = mVar.read(bArr, i7, (int) mVar.a1());
                if (read == -1) {
                    throw new AssertionError();
                }
                i7 += read;
            }
            throw e7;
        }
    }

    public static final long s(@n6.d i0 i0Var) {
        byte Z;
        l0.p(i0Var, "$this$commonReadHexadecimalUnsignedLong");
        i0Var.G0(1L);
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            if (!i0Var.G(i8)) {
                break;
            }
            Z = i0Var.f11205k.Z(i7);
            if ((Z < ((byte) 48) || Z > ((byte) 57)) && ((Z < ((byte) 97) || Z > ((byte) w0.m0.f18129j)) && (Z < ((byte) 65) || Z > ((byte) 70)))) {
                break;
            }
            i7 = i8;
        }
        if (i7 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(Z, i5.d.a(i5.d.a(16)));
            l0.o(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return i0Var.f11205k.P0();
    }

    public static final int t(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadInt");
        i0Var.G0(4L);
        return i0Var.f11205k.readInt();
    }

    public static final int u(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadIntLe");
        i0Var.G0(4L);
        return i0Var.f11205k.Y();
    }

    public static final long v(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadLong");
        i0Var.G0(8L);
        return i0Var.f11205k.readLong();
    }

    public static final long w(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadLongLe");
        i0Var.G0(8L);
        return i0Var.f11205k.x0();
    }

    public static final short x(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadShort");
        i0Var.G0(2L);
        return i0Var.f11205k.readShort();
    }

    public static final short y(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadShortLe");
        i0Var.G0(2L);
        return i0Var.f11205k.r0();
    }

    @n6.d
    public static final String z(@n6.d i0 i0Var) {
        l0.p(i0Var, "$this$commonReadUtf8");
        i0Var.f11205k.B(i0Var.f11207m);
        return i0Var.f11205k.j0();
    }
}
