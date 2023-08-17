package r5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import u4.l0;
import v3.b1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final i[] f15976e;

    /* renamed from: f  reason: collision with root package name */
    public static final i[] f15977f;
    @n6.d
    @s4.e

    /* renamed from: g  reason: collision with root package name */
    public static final l f15978g;
    @n6.d
    @s4.e

    /* renamed from: h  reason: collision with root package name */
    public static final l f15979h;
    @n6.d
    @s4.e

    /* renamed from: i  reason: collision with root package name */
    public static final l f15980i;
    @n6.d
    @s4.e

    /* renamed from: j  reason: collision with root package name */
    public static final l f15981j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f15982k = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15983a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15984b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f15985c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f15986d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15987a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public String[] f15988b;
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public String[] f15989c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15990d;

        public a(boolean z6) {
            this.f15987a = z6;
        }

        @n6.d
        public final a a() {
            if (this.f15987a) {
                this.f15988b = null;
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @n6.d
        public final a b() {
            if (this.f15987a) {
                this.f15989c = null;
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @n6.d
        public final l c() {
            return new l(this.f15987a, this.f15990d, this.f15988b, this.f15989c);
        }

        @n6.d
        public final a d(@n6.d String... strArr) {
            l0.p(strArr, "cipherSuites");
            if (this.f15987a) {
                if ((!(strArr.length == 0)) == true) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f15988b = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @n6.d
        public final a e(@n6.d i... iVarArr) {
            l0.p(iVarArr, "cipherSuites");
            if (this.f15987a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (i iVar : iVarArr) {
                    arrayList.add(iVar.e());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return d((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @n6.e
        public final String[] f() {
            return this.f15988b;
        }

        public final boolean g() {
            return this.f15990d;
        }

        public final boolean h() {
            return this.f15987a;
        }

        @n6.e
        public final String[] i() {
            return this.f15989c;
        }

        public final void j(@n6.e String[] strArr) {
            this.f15988b = strArr;
        }

        public final void k(boolean z6) {
            this.f15990d = z6;
        }

        public final void l(boolean z6) {
            this.f15987a = z6;
        }

        public final void m(@n6.e String[] strArr) {
            this.f15989c = strArr;
        }

        @n6.d
        @v3.k(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final a n(boolean z6) {
            if (this.f15987a) {
                this.f15990d = z6;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        @n6.d
        public final a o(@n6.d String... strArr) {
            l0.p(strArr, "tlsVersions");
            if (this.f15987a) {
                if ((!(strArr.length == 0)) == true) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f15989c = (String[]) clone;
                        return this;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @n6.d
        public final a p(@n6.d i0... i0VarArr) {
            l0.p(i0VarArr, "tlsVersions");
            if (this.f15987a) {
                ArrayList arrayList = new ArrayList(i0VarArr.length);
                for (i0 i0Var : i0VarArr) {
                    arrayList.add(i0Var.e());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return o((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(@n6.d l lVar) {
            l0.p(lVar, "connectionSpec");
            this.f15987a = lVar.i();
            this.f15988b = lVar.f15985c;
            this.f15989c = lVar.f15986d;
            this.f15990d = lVar.k();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    static {
        i iVar = i.f15936n1;
        i iVar2 = i.f15939o1;
        i iVar3 = i.f15942p1;
        i iVar4 = i.Z0;
        i iVar5 = i.f15906d1;
        i iVar6 = i.f15897a1;
        i iVar7 = i.f15909e1;
        i iVar8 = i.f15927k1;
        i iVar9 = i.f15924j1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f15976e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.K0, i.L0, i.f15920i0, i.f15923j0, i.G, i.K, i.f15925k};
        f15977f = iVarArr2;
        a e7 = new a(true).e((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        i0 i0Var = i0.TLS_1_3;
        i0 i0Var2 = i0.TLS_1_2;
        f15978g = e7.p(i0Var, i0Var2).n(true).c();
        f15979h = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(i0Var, i0Var2).n(true).c();
        f15980i = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(i0Var, i0Var2, i0.TLS_1_1, i0.TLS_1_0).n(true).c();
        f15981j = new a(false).c();
    }

    public l(boolean z6, boolean z7, @n6.e String[] strArr, @n6.e String[] strArr2) {
        this.f15983a = z6;
        this.f15984b = z7;
        this.f15985c = strArr;
        this.f15986d = strArr2;
    }

    @s4.h(name = "-deprecated_cipherSuites")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cipherSuites", imports = {}))
    @n6.e
    public final List<i> a() {
        return g();
    }

    @s4.h(name = "-deprecated_supportsTlsExtensions")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "supportsTlsExtensions", imports = {}))
    public final boolean b() {
        return this.f15984b;
    }

    @s4.h(name = "-deprecated_tlsVersions")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "tlsVersions", imports = {}))
    @n6.e
    public final List<i0> c() {
        return l();
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof l) {
            if (obj == this) {
                return true;
            }
            boolean z6 = this.f15983a;
            l lVar = (l) obj;
            if (z6 != lVar.f15983a) {
                return false;
            }
            return !z6 || (Arrays.equals(this.f15985c, lVar.f15985c) && Arrays.equals(this.f15986d, lVar.f15986d) && this.f15984b == lVar.f15984b);
        }
        return false;
    }

    public final void f(@n6.d SSLSocket sSLSocket, boolean z6) {
        l0.p(sSLSocket, "sslSocket");
        l j7 = j(sSLSocket, z6);
        if (j7.l() != null) {
            sSLSocket.setEnabledProtocols(j7.f15986d);
        }
        if (j7.g() != null) {
            sSLSocket.setEnabledCipherSuites(j7.f15985c);
        }
    }

    @s4.h(name = "cipherSuites")
    @n6.e
    public final List<i> g() {
        String[] strArr = this.f15985c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(i.f15951s1.b(str));
            }
            return x3.e0.Q5(arrayList);
        }
        return null;
    }

    public final boolean h(@n6.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, "socket");
        if (this.f15983a) {
            String[] strArr = this.f15986d;
            if (strArr == null || s5.d.w(strArr, sSLSocket.getEnabledProtocols(), b4.g.q())) {
                String[] strArr2 = this.f15985c;
                return strArr2 == null || s5.d.w(strArr2, sSLSocket.getEnabledCipherSuites(), i.f15951s1.c());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.f15983a) {
            String[] strArr = this.f15985c;
            int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.f15986d;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f15984b ? 1 : 0);
        }
        return 17;
    }

    @s4.h(name = "isTls")
    public final boolean i() {
        return this.f15983a;
    }

    public final l j(SSLSocket sSLSocket, boolean z6) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f15985c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            l0.o(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = s5.d.I(enabledCipherSuites2, this.f15985c, i.f15951s1.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f15986d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            l0.o(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = s5.d.I(enabledProtocols2, this.f15986d, b4.g.q());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        l0.o(supportedCipherSuites, "supportedCipherSuites");
        int A = s5.d.A(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f15951s1.c());
        if (z6 && A != -1) {
            l0.o(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[A];
            l0.o(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = s5.d.o(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        l0.o(enabledCipherSuites, "cipherSuitesIntersection");
        a d7 = aVar.d((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        l0.o(enabledProtocols, "tlsVersionsIntersection");
        return d7.o((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).c();
    }

    @s4.h(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.f15984b;
    }

    @s4.h(name = "tlsVersions")
    @n6.e
    public final List<i0> l() {
        String[] strArr = this.f15986d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(i0.f15973r.a(str));
            }
            return x3.e0.Q5(arrayList);
        }
        return null;
    }

    @n6.d
    public String toString() {
        if (this.f15983a) {
            return "ConnectionSpec(cipherSuites=" + Objects.toString(g(), "[all enabled]") + ", tlsVersions=" + Objects.toString(l(), "[all enabled]") + ", supportsTlsExtensions=" + this.f15984b + ')';
        }
        return "ConnectionSpec()";
    }
}