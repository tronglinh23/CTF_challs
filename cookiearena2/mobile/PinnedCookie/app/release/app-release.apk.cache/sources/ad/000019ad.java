package r5;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import u4.l0;
import u4.n0;
import v3.b1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16037e = new a(null);
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final v3.d0 f16038a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final i0 f16039b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final i f16040c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f16041d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: r5.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0235a extends n0 implements t4.a<List<? extends Certificate>> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ List f16042l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0235a(List list) {
                super(0);
                this.f16042l = list;
            }

            @Override // t4.a
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final List<Certificate> n() {
                return this.f16042l;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends n0 implements t4.a<List<? extends Certificate>> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ List f16043l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f16043l = list;
            }

            @Override // t4.a
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final List<Certificate> n() {
                return this.f16043l;
            }
        }

        public a() {
        }

        @s4.h(name = "-deprecated_get")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "sslSession.handshake()", imports = {}))
        public final t a(@n6.d SSLSession sSLSession) throws IOException {
            l0.p(sSLSession, "sslSession");
            return b(sSLSession);
        }

        @s4.h(name = "get")
        @n6.d
        @s4.m
        public final t b(@n6.d SSLSession sSLSession) throws IOException {
            List<Certificate> E;
            l0.p(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                i b7 = i.f15951s1.b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (l0.g("NONE", protocol)) {
                        throw new IOException("tlsVersion == NONE");
                    }
                    i0 a7 = i0.f15973r.a(protocol);
                    try {
                        E = d(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        E = x3.w.E();
                    }
                    return new t(a7, b7, d(sSLSession.getLocalCertificates()), new b(E));
                }
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        @n6.d
        @s4.m
        public final t c(@n6.d i0 i0Var, @n6.d i iVar, @n6.d List<? extends Certificate> list, @n6.d List<? extends Certificate> list2) {
            l0.p(i0Var, "tlsVersion");
            l0.p(iVar, "cipherSuite");
            l0.p(list, "peerCertificates");
            l0.p(list2, "localCertificates");
            return new t(i0Var, iVar, s5.d.c0(list2), new C0235a(s5.d.c0(list)));
        }

        public final List<Certificate> d(Certificate[] certificateArr) {
            return certificateArr != null ? s5.d.z((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : x3.w.E();
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<List<? extends Certificate>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a f16044l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t4.a aVar) {
            super(0);
            this.f16044l = aVar;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final List<Certificate> n() {
            try {
                return (List) this.f16044l.n();
            } catch (SSLPeerUnverifiedException unused) {
                return x3.w.E();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@n6.d i0 i0Var, @n6.d i iVar, @n6.d List<? extends Certificate> list, @n6.d t4.a<? extends List<? extends Certificate>> aVar) {
        l0.p(i0Var, "tlsVersion");
        l0.p(iVar, "cipherSuite");
        l0.p(list, "localCertificates");
        l0.p(aVar, "peerCertificatesFn");
        this.f16039b = i0Var;
        this.f16040c = iVar;
        this.f16041d = list;
        this.f16038a = v3.f0.b(new b(aVar));
    }

    @s4.h(name = "get")
    @n6.d
    @s4.m
    public static final t h(@n6.d SSLSession sSLSession) throws IOException {
        return f16037e.b(sSLSession);
    }

    @n6.d
    @s4.m
    public static final t i(@n6.d i0 i0Var, @n6.d i iVar, @n6.d List<? extends Certificate> list, @n6.d List<? extends Certificate> list2) {
        return f16037e.c(i0Var, iVar, list, list2);
    }

    @s4.h(name = "-deprecated_cipherSuite")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cipherSuite", imports = {}))
    public final i a() {
        return this.f16040c;
    }

    @s4.h(name = "-deprecated_localCertificates")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "localCertificates", imports = {}))
    public final List<Certificate> b() {
        return this.f16041d;
    }

    @s4.h(name = "-deprecated_localPrincipal")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "localPrincipal", imports = {}))
    @n6.e
    public final Principal c() {
        return l();
    }

    @s4.h(name = "-deprecated_peerCertificates")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "peerCertificates", imports = {}))
    public final List<Certificate> d() {
        return m();
    }

    @s4.h(name = "-deprecated_peerPrincipal")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "peerPrincipal", imports = {}))
    @n6.e
    public final Principal e() {
        return n();
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (tVar.f16039b == this.f16039b && l0.g(tVar.f16040c, this.f16040c) && l0.g(tVar.m(), m()) && l0.g(tVar.f16041d, this.f16041d)) {
                return true;
            }
        }
        return false;
    }

    @s4.h(name = "-deprecated_tlsVersion")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "tlsVersion", imports = {}))
    public final i0 f() {
        return this.f16039b;
    }

    @s4.h(name = "cipherSuite")
    @n6.d
    public final i g() {
        return this.f16040c;
    }

    public int hashCode() {
        return ((((((527 + this.f16039b.hashCode()) * 31) + this.f16040c.hashCode()) * 31) + m().hashCode()) * 31) + this.f16041d.hashCode();
    }

    public final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        l0.o(type, "type");
        return type;
    }

    @s4.h(name = "localCertificates")
    @n6.d
    public final List<Certificate> k() {
        return this.f16041d;
    }

    @s4.h(name = "localPrincipal")
    @n6.e
    public final Principal l() {
        Object B2 = x3.e0.B2(this.f16041d);
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @s4.h(name = "peerCertificates")
    @n6.d
    public final List<Certificate> m() {
        return (List) this.f16038a.getValue();
    }

    @s4.h(name = "peerPrincipal")
    @n6.e
    public final Principal n() {
        Object B2 = x3.e0.B2(m());
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @s4.h(name = "tlsVersion")
    @n6.d
    public final i0 o() {
        return this.f16039b;
    }

    @n6.d
    public String toString() {
        List<Certificate> m7 = m();
        ArrayList arrayList = new ArrayList(x3.x.Y(m7, 10));
        Iterator<T> it = m7.iterator();
        while (it.hasNext()) {
            arrayList.add(j((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.f16039b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.f16040c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.f16041d;
        ArrayList arrayList2 = new ArrayList(x3.x.Y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}