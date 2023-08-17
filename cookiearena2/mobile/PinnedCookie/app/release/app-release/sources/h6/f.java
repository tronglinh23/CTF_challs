package h6;

import i5.a0;
import i5.b0;
import i5.c0;
import java.io.IOException;
import r5.u;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: g  reason: collision with root package name */
    public static final String f10388g = "Sec-WebSocket-Extensions";

    /* renamed from: h  reason: collision with root package name */
    public static final a f10389h = new a(null);
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10390a;
    @s4.e
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final Integer f10391b;
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10392c;
    @s4.e
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public final Integer f10393d;
    @s4.e

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10394e;
    @s4.e

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10395f;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final f a(@n6.d u uVar) throws IOException {
            l0.p(uVar, "responseHeaders");
            int size = uVar.size();
            boolean z6 = false;
            Integer num = null;
            boolean z7 = false;
            Integer num2 = null;
            boolean z8 = false;
            boolean z9 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (b0.L1(uVar.i(i7), f.f10388g, true)) {
                    String o6 = uVar.o(i7);
                    int i8 = 0;
                    while (i8 < o6.length()) {
                        int r6 = s5.d.r(o6, ',', i8, 0, 4, null);
                        int p6 = s5.d.p(o6, ';', i8, r6);
                        String g02 = s5.d.g0(o6, i8, p6);
                        int i9 = p6 + 1;
                        if (b0.L1(g02, "permessage-deflate", true)) {
                            if (z6) {
                                z9 = true;
                            }
                            while (i9 < r6) {
                                int p7 = s5.d.p(o6, ';', i9, r6);
                                int p8 = s5.d.p(o6, '=', i9, p7);
                                String g03 = s5.d.g0(o6, i9, p8);
                                String m42 = p8 < p7 ? c0.m4(s5.d.g0(o6, p8 + 1, p7), "\"") : null;
                                int i10 = p7 + 1;
                                if (b0.L1(g03, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z9 = true;
                                    }
                                    num = m42 != null ? a0.Y0(m42) : null;
                                    if (num != null) {
                                        i9 = i10;
                                    }
                                    z9 = true;
                                    i9 = i10;
                                } else {
                                    if (b0.L1(g03, "client_no_context_takeover", true)) {
                                        if (z7) {
                                            z9 = true;
                                        }
                                        if (m42 != null) {
                                            z9 = true;
                                        }
                                        z7 = true;
                                    } else if (b0.L1(g03, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z9 = true;
                                        }
                                        num2 = m42 != null ? a0.Y0(m42) : null;
                                        if (num2 != null) {
                                        }
                                        z9 = true;
                                    } else {
                                        if (b0.L1(g03, "server_no_context_takeover", true)) {
                                            if (z8) {
                                                z9 = true;
                                            }
                                            if (m42 != null) {
                                                z9 = true;
                                            }
                                            z8 = true;
                                        }
                                        z9 = true;
                                    }
                                    i9 = i10;
                                }
                            }
                            i8 = i9;
                            z6 = true;
                        } else {
                            i8 = i9;
                            z9 = true;
                        }
                    }
                }
            }
            return new f(z6, num, z7, num2, z8, z9);
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public f() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ f h(f fVar, boolean z6, Integer num, boolean z7, Integer num2, boolean z8, boolean z9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = fVar.f10390a;
        }
        if ((i7 & 2) != 0) {
            num = fVar.f10391b;
        }
        Integer num3 = num;
        if ((i7 & 4) != 0) {
            z7 = fVar.f10392c;
        }
        boolean z10 = z7;
        if ((i7 & 8) != 0) {
            num2 = fVar.f10393d;
        }
        Integer num4 = num2;
        if ((i7 & 16) != 0) {
            z8 = fVar.f10394e;
        }
        boolean z11 = z8;
        if ((i7 & 32) != 0) {
            z9 = fVar.f10395f;
        }
        return fVar.g(z6, num3, z10, num4, z11, z9);
    }

    public final boolean a() {
        return this.f10390a;
    }

    @n6.e
    public final Integer b() {
        return this.f10391b;
    }

    public final boolean c() {
        return this.f10392c;
    }

    @n6.e
    public final Integer d() {
        return this.f10393d;
    }

    public final boolean e() {
        return this.f10394e;
    }

    public boolean equals(@n6.e Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f10390a == fVar.f10390a && l0.g(this.f10391b, fVar.f10391b) && this.f10392c == fVar.f10392c && l0.g(this.f10393d, fVar.f10393d) && this.f10394e == fVar.f10394e && this.f10395f == fVar.f10395f;
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.f10395f;
    }

    @n6.d
    public final f g(boolean z6, @n6.e Integer num, boolean z7, @n6.e Integer num2, boolean z8, boolean z9) {
        return new f(z6, num, z7, num2, z8, z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z6 = this.f10390a;
        ?? r02 = z6;
        if (z6) {
            r02 = 1;
        }
        int i7 = r02 * 31;
        Integer num = this.f10391b;
        int hashCode = (i7 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r22 = this.f10392c;
        int i8 = r22;
        if (r22 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode + i8) * 31;
        Integer num2 = this.f10393d;
        int hashCode2 = (i9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.f10394e;
        int i10 = r23;
        if (r23 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z7 = this.f10395f;
        return i11 + (z7 ? 1 : z7 ? 1 : 0);
    }

    public final boolean i(boolean z6) {
        return z6 ? this.f10392c : this.f10394e;
    }

    @n6.d
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f10390a + ", clientMaxWindowBits=" + this.f10391b + ", clientNoContextTakeover=" + this.f10392c + ", serverMaxWindowBits=" + this.f10393d + ", serverNoContextTakeover=" + this.f10394e + ", unknownValues=" + this.f10395f + ")";
    }

    public f(boolean z6, @n6.e Integer num, boolean z7, @n6.e Integer num2, boolean z8, boolean z9) {
        this.f10390a = z6;
        this.f10391b = num;
        this.f10392c = z7;
        this.f10393d = num2;
        this.f10394e = z8;
        this.f10395f = z9;
    }

    public /* synthetic */ f(boolean z6, Integer num, boolean z7, Integer num2, boolean z8, boolean z9, int i7, w wVar) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? false : z7, (i7 & 8) == 0 ? num2 : null, (i7 & 16) != 0 ? false : z8, (i7 & 32) != 0 ? false : z9);
    }
}
