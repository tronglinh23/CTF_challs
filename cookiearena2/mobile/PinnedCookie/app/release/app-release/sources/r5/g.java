package r5;

import i6.p;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import u4.l0;
import u4.n0;
import u4.u1;
import v3.b1;
/* loaded from: classes.dex */
public final class g {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Set<c> f15873a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final g6.c f15874b;

    /* renamed from: d  reason: collision with root package name */
    public static final b f15872d = new b(null);
    @n6.d
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public static final g f15871c = new a().b();

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f15875a = new ArrayList();

        @n6.d
        public final a a(@n6.d String str, @n6.d String... strArr) {
            l0.p(str, "pattern");
            l0.p(strArr, "pins");
            for (String str2 : strArr) {
                this.f15875a.add(new c(str, str2));
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [g6.c, u4.w] */
        @n6.d
        public final g b() {
            ?? r22 = 0;
            return new g(x3.e0.V5(this.f15875a), r22, 2, r22);
        }

        @n6.d
        public final List<c> c() {
            return this.f15875a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        @n6.d
        @s4.m
        public final String a(@n6.d Certificate certificate) {
            l0.p(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).h();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @n6.d
        @s4.m
        public final i6.p b(@n6.d X509Certificate x509Certificate) {
            l0.p(x509Certificate, "$this$sha1Hash");
            p.a aVar = i6.p.f11252p;
            PublicKey publicKey = x509Certificate.getPublicKey();
            l0.o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            l0.o(encoded, "publicKey.encoded");
            return p.a.p(aVar, encoded, 0, 0, 3, null).Z();
        }

        @n6.d
        @s4.m
        public final i6.p c(@n6.d X509Certificate x509Certificate) {
            l0.p(x509Certificate, "$this$sha256Hash");
            p.a aVar = i6.p.f11252p;
            PublicKey publicKey = x509Certificate.getPublicKey();
            l0.o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            l0.o(encoded, "publicKey.encoded");
            return p.a.p(aVar, encoded, 0, 0, 3, null).a0();
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final String f15876a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final String f15877b;
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public final i6.p f15878c;

        public c(@n6.d String str, @n6.d String str2) {
            l0.p(str, "pattern");
            l0.p(str2, "pin");
            if (!((i5.b0.v2(str, "*.", false, 2, null) && i5.c0.s3(str, "*", 1, false, 4, null) == -1) || (i5.b0.v2(str, "**.", false, 2, null) && i5.c0.s3(str, "*", 2, false, 4, null) == -1) || i5.c0.s3(str, "*", 0, false, 6, null) == -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            String e7 = s5.a.e(str);
            if (e7 == null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.f15876a = e7;
            if (i5.b0.v2(str2, "sha1/", false, 2, null)) {
                this.f15877b = "sha1";
                p.a aVar = i6.p.f11252p;
                String substring = str2.substring(5);
                l0.o(substring, "(this as java.lang.String).substring(startIndex)");
                i6.p h7 = aVar.h(substring);
                if (h7 != null) {
                    this.f15878c = h7;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            } else if (!i5.b0.v2(str2, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            } else {
                this.f15877b = "sha256";
                p.a aVar2 = i6.p.f11252p;
                String substring2 = str2.substring(7);
                l0.o(substring2, "(this as java.lang.String).substring(startIndex)");
                i6.p h8 = aVar2.h(substring2);
                if (h8 != null) {
                    this.f15878c = h8;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            }
        }

        @n6.d
        public final i6.p a() {
            return this.f15878c;
        }

        @n6.d
        public final String b() {
            return this.f15877b;
        }

        @n6.d
        public final String c() {
            return this.f15876a;
        }

        public final boolean d(@n6.d X509Certificate x509Certificate) {
            l0.p(x509Certificate, "certificate");
            String str = this.f15877b;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals("sha1")) {
                    return l0.g(this.f15878c, g.f15872d.b(x509Certificate));
                }
            } else if (str.equals("sha256")) {
                return l0.g(this.f15878c, g.f15872d.c(x509Certificate));
            }
            return false;
        }

        public final boolean e(@n6.d String str) {
            l0.p(str, "hostname");
            if (i5.b0.v2(this.f15876a, "**.", false, 2, null)) {
                int length = this.f15876a.length() - 3;
                int length2 = str.length() - length;
                if (!i5.b0.g2(str, str.length() - length, this.f15876a, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (!i5.b0.v2(this.f15876a, "*.", false, 2, null)) {
                return l0.g(str, this.f15876a);
            } else {
                int length3 = this.f15876a.length() - 1;
                int length4 = str.length() - length3;
                if (!i5.b0.g2(str, str.length() - length3, this.f15876a, 1, length3, false, 16, null) || i5.c0.F3(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@n6.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return ((l0.g(this.f15876a, cVar.f15876a) ^ true) || (l0.g(this.f15877b, cVar.f15877b) ^ true) || (l0.g(this.f15878c, cVar.f15878c) ^ true)) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f15876a.hashCode() * 31) + this.f15877b.hashCode()) * 31) + this.f15878c.hashCode();
        }

        @n6.d
        public String toString() {
            return this.f15877b + '/' + this.f15878c.h();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.a<List<? extends X509Certificate>> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ List f15880m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ String f15881n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, String str) {
            super(0);
            this.f15880m = list;
            this.f15881n = str;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> n() {
            List<Certificate> list;
            g6.c e7 = g.this.e();
            if (e7 == null || (list = e7.a(this.f15880m, this.f15881n)) == null) {
                list = this.f15880m;
            }
            ArrayList arrayList = new ArrayList(x3.x.Y(list, 10));
            for (Certificate certificate : list) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(@n6.d Set<c> set, @n6.e g6.c cVar) {
        l0.p(set, "pins");
        this.f15873a = set;
        this.f15874b = cVar;
    }

    @n6.d
    @s4.m
    public static final String g(@n6.d Certificate certificate) {
        return f15872d.a(certificate);
    }

    @n6.d
    @s4.m
    public static final i6.p h(@n6.d X509Certificate x509Certificate) {
        return f15872d.b(x509Certificate);
    }

    @n6.d
    @s4.m
    public static final i6.p i(@n6.d X509Certificate x509Certificate) {
        return f15872d.c(x509Certificate);
    }

    public final void a(@n6.d String str, @n6.d List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        l0.p(str, "hostname");
        l0.p(list, "peerCertificates");
        c(str, new d(list, str));
    }

    @v3.k(message = "replaced with {@link #check(String, List)}.", replaceWith = @b1(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@n6.d String str, @n6.d Certificate... certificateArr) throws SSLPeerUnverifiedException {
        l0.p(str, "hostname");
        l0.p(certificateArr, "peerCertificates");
        a(str, x3.p.kz(certificateArr));
    }

    public final void c(@n6.d String str, @n6.d t4.a<? extends List<? extends X509Certificate>> aVar) {
        l0.p(str, "hostname");
        l0.p(aVar, "cleanedPeerCertificatesFn");
        List<c> d7 = d(str);
        if (d7.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> n7 = aVar.n();
        for (X509Certificate x509Certificate : n7) {
            i6.p pVar = null;
            i6.p pVar2 = null;
            for (c cVar : d7) {
                String b7 = cVar.b();
                int hashCode = b7.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && b7.equals("sha1")) {
                        if (pVar2 == null) {
                            pVar2 = f15872d.b(x509Certificate);
                        }
                        if (l0.g(cVar.a(), pVar2)) {
                            return;
                        }
                    }
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                } else if (!b7.equals("sha256")) {
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                } else {
                    if (pVar == null) {
                        pVar = f15872d.c(x509Certificate);
                    }
                    if (l0.g(cVar.a(), pVar)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : n7) {
            sb.append("\n    ");
            sb.append(f15872d.a(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            l0.o(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (c cVar2 : d7) {
            sb.append("\n    ");
            sb.append(cVar2);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    @n6.d
    public final List<c> d(@n6.d String str) {
        l0.p(str, "hostname");
        Set<c> set = this.f15873a;
        List<c> E = x3.w.E();
        for (Object obj : set) {
            if (((c) obj).e(str)) {
                if (E.isEmpty()) {
                    E = new ArrayList<>();
                }
                u1.g(E).add(obj);
            }
        }
        return E;
    }

    @n6.e
    public final g6.c e() {
        return this.f15874b;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (l0.g(gVar.f15873a, this.f15873a) && l0.g(gVar.f15874b, this.f15874b)) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public final Set<c> f() {
        return this.f15873a;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f15873a.hashCode()) * 41;
        g6.c cVar = this.f15874b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @n6.d
    public final g j(@n6.d g6.c cVar) {
        l0.p(cVar, "certificateChainCleaner");
        return l0.g(this.f15874b, cVar) ? this : new g(this.f15873a, cVar);
    }

    public /* synthetic */ g(Set set, g6.c cVar, int i7, u4.w wVar) {
        this(set, (i7 & 2) != 0 ? null : cVar);
    }
}
