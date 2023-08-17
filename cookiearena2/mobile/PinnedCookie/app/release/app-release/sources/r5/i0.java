package r5;

import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public enum i0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: r  reason: collision with root package name */
    public static final a f15973r = new a(null);
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final String f15974k;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        @s4.m
        public final i0 a(@n6.d String str) {
            l0.p(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return i0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return i0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return i0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return i0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return i0.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    i0(String str) {
        this.f15974k = str;
    }

    @n6.d
    @s4.m
    public static final i0 d(@n6.d String str) {
        return f15973r.a(str);
    }

    @s4.h(name = "-deprecated_javaName")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "javaName", imports = {}))
    public final String c() {
        return this.f15974k;
    }

    @s4.h(name = "javaName")
    @n6.d
    public final String e() {
        return this.f15974k;
    }
}
