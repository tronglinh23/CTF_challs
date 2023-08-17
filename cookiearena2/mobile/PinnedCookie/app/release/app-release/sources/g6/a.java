package g6;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final int f10084c = 9;

    /* renamed from: d  reason: collision with root package name */
    public static final C0111a f10085d = new C0111a(null);

    /* renamed from: b  reason: collision with root package name */
    public final e f10086b;

    /* renamed from: g6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0111a {
        public C0111a() {
        }

        public /* synthetic */ C0111a(w wVar) {
            this();
        }
    }

    public a(@n6.d e eVar) {
        l0.p(eVar, "trustRootIndex");
        this.f10086b = eVar;
    }

    @Override // g6.c
    @n6.d
    public List<Certificate> a(@n6.d List<? extends Certificate> list, @n6.d String str) throws SSLPeerUnverifiedException {
        l0.p(list, "chain");
        l0.p(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        l0.o(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z6 = false;
        for (int i7 = 0; i7 < 9; i7++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a7 = this.f10086b.a(x509Certificate);
            if (a7 == null) {
                Iterator it = arrayDeque.iterator();
                l0.o(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z6) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || (!l0.g(x509Certificate, a7)) != false) {
                arrayList.add(a7);
            }
            if (b(a7, a7)) {
                return arrayList;
            }
            z6 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if ((!l0.g(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) == true) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(@n6.e Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && l0.g(((a) obj).f10086b, this.f10086b);
    }

    public int hashCode() {
        return this.f10086b.hashCode();
    }
}
