package y5;

import i5.b0;
import java.io.IOException;
import java.net.ProtocolException;
import r5.c0;
import r5.f0;
import u4.l0;
import u4.w;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final int f18882d = 307;

    /* renamed from: e  reason: collision with root package name */
    public static final int f18883e = 308;

    /* renamed from: f  reason: collision with root package name */
    public static final int f18884f = 421;

    /* renamed from: g  reason: collision with root package name */
    public static final int f18885g = 100;

    /* renamed from: h  reason: collision with root package name */
    public static final a f18886h = new a(null);
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public final c0 f18887a;
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public final int f18888b;
    @n6.d
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public final String f18889c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final k a(@n6.d f0 f0Var) {
            l0.p(f0Var, "response");
            return new k(f0Var.I0(), f0Var.L(), f0Var.q0());
        }

        @n6.d
        public final k b(@n6.d String str) throws IOException {
            c0 c0Var;
            int i7;
            String str2;
            l0.p(str, "statusLine");
            if (b0.v2(str, "HTTP/1.", false, 2, null)) {
                i7 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    c0Var = c0.HTTP_1_0;
                } else if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                } else {
                    c0Var = c0.HTTP_1_1;
                }
            } else if (!b0.v2(str, "ICY ", false, 2, null)) {
                throw new ProtocolException("Unexpected status line: " + str);
            } else {
                c0Var = c0.HTTP_1_0;
                i7 = 4;
            }
            int i8 = i7 + 3;
            if (str.length() < i8) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String substring = str.substring(i7, i8);
                l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i8) {
                    str2 = "";
                } else if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                } else {
                    str2 = str.substring(i7 + 4);
                    l0.o(str2, "(this as java.lang.String).substring(startIndex)");
                }
                return new k(c0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public k(@n6.d c0 c0Var, int i7, @n6.d String str) {
        l0.p(c0Var, "protocol");
        l0.p(str, "message");
        this.f18887a = c0Var;
        this.f18888b = i7;
        this.f18889c = str;
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f18887a == c0.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f18888b);
        sb.append(' ');
        sb.append(this.f18889c);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}