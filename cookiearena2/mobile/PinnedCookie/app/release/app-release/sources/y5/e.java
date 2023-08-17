package y5;

import i5.b0;
import i6.p;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import r5.f0;
import r5.n;
import r5.u;
import r5.v;
import u4.l0;
import v3.b1;
import v3.m;
@s4.h(name = "HttpHeaders")
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final p f18863a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f18864b;

    static {
        p.a aVar = p.f11252p;
        f18863a = aVar.l("\"\\");
        f18864b = aVar.l("\t ,=");
    }

    @v3.k(level = m.ERROR, message = "No longer supported", replaceWith = @b1(expression = "response.promisesBody()", imports = {}))
    public static final boolean a(@n6.d f0 f0Var) {
        l0.p(f0Var, "response");
        return c(f0Var);
    }

    @n6.d
    public static final List<r5.h> b(@n6.d u uVar, @n6.d String str) {
        l0.p(uVar, "$this$parseChallenges");
        l0.p(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (b0.L1(str, uVar.i(i7), true)) {
                try {
                    d(new i6.m().H0(uVar.o(i7)), arrayList);
                } catch (EOFException e7) {
                    c6.j.f8005e.g().m("Unable to parse challenge", 5, e7);
                }
            }
        }
        return arrayList;
    }

    public static final boolean c(@n6.d f0 f0Var) {
        l0.p(f0Var, "$this$promisesBody");
        if (l0.g(f0Var.O0().m(), "HEAD")) {
            return false;
        }
        int L = f0Var.L();
        return (((L >= 100 && L < 200) || L == 204 || L == 304) && s5.d.x(f0Var) == -1 && !b0.L1("chunked", f0.X(f0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(i6.m r7, java.util.List<r5.h> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            h(r7)
            java.lang.String r1 = f(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = h(r7)
            java.lang.String r3 = f(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.c0()
            if (r7 != 0) goto L1f
            return
        L1f:
            r5.h r7 = new r5.h
            java.util.Map r0 = x3.a1.z()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = s5.d.S(r7, r4)
            boolean r6 = h(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.c0()
            if (r2 == 0) goto L68
        L41:
            r5.h r2 = new r5.h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = i5.b0.h2(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            u4.l0.o(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = s5.d.S(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = f(r7)
            boolean r5 = h(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = s5.d.S(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            r5.h r4 = new r5.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = h(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = i(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = e(r7)
            goto Lad
        La9:
            java.lang.String r6 = f(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = h(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.c0()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.e.d(i6.m, java.util.List):void");
    }

    public static final String e(i6.m mVar) throws EOFException {
        byte b7 = (byte) 34;
        if (!(mVar.readByte() == b7)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        i6.m mVar2 = new i6.m();
        while (true) {
            long b02 = mVar.b0(f18863a);
            if (b02 == -1) {
                return null;
            }
            if (mVar.Z(b02) == b7) {
                mVar2.w(mVar, b02);
                mVar.readByte();
                return mVar2.j0();
            } else if (mVar.a1() == b02 + 1) {
                return null;
            } else {
                mVar2.w(mVar, b02);
                mVar.readByte();
                mVar2.w(mVar, 1L);
            }
        }
    }

    public static final String f(i6.m mVar) {
        long b02 = mVar.b0(f18864b);
        if (b02 == -1) {
            b02 = mVar.a1();
        }
        if (b02 != 0) {
            return mVar.q(b02);
        }
        return null;
    }

    public static final void g(@n6.d n nVar, @n6.d v vVar, @n6.d u uVar) {
        l0.p(nVar, "$this$receiveHeaders");
        l0.p(vVar, "url");
        l0.p(uVar, "headers");
        if (nVar == n.f16014a) {
            return;
        }
        List<r5.m> g7 = r5.m.f15995n.g(vVar, uVar);
        if (g7.isEmpty()) {
            return;
        }
        nVar.a(vVar, g7);
    }

    public static final boolean h(i6.m mVar) {
        boolean z6 = false;
        while (!mVar.c0()) {
            byte Z = mVar.Z(0L);
            if (Z == 9 || Z == 32) {
                mVar.readByte();
            } else if (Z != 44) {
                break;
            } else {
                mVar.readByte();
                z6 = true;
            }
        }
        return z6;
    }

    public static final boolean i(i6.m mVar, byte b7) {
        return !mVar.c0() && mVar.Z(0L) == b7;
    }
}
