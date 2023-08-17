package r5;

import java.io.IOException;
import u4.l0;

/* loaded from: classes.dex */
public enum c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: s  reason: collision with root package name */
    public static final a f15798s = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final String f15799k;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        @s4.m
        public final c0 a(@n6.d String str) throws IOException {
            l0.p(str, "protocol");
            c0 c0Var = c0.HTTP_1_0;
            if (!l0.g(str, c0Var.f15799k)) {
                c0Var = c0.HTTP_1_1;
                if (!l0.g(str, c0Var.f15799k)) {
                    c0Var = c0.H2_PRIOR_KNOWLEDGE;
                    if (!l0.g(str, c0Var.f15799k)) {
                        c0Var = c0.HTTP_2;
                        if (!l0.g(str, c0Var.f15799k)) {
                            c0Var = c0.SPDY_3;
                            if (!l0.g(str, c0Var.f15799k)) {
                                c0Var = c0.QUIC;
                                if (!l0.g(str, c0Var.f15799k)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return c0Var;
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    c0(String str) {
        this.f15799k = str;
    }

    @n6.d
    @s4.m
    public static final c0 d(@n6.d String str) throws IOException {
        return f15798s.a(str);
    }

    @Override // java.lang.Enum
    @n6.d
    public String toString() {
        return this.f15799k;
    }
}