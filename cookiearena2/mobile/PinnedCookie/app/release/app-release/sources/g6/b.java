package g6;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import u4.l0;
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<X500Principal, Set<X509Certificate>> f10087a;

    public b(@n6.d X509Certificate... x509CertificateArr) {
        l0.p(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            l0.o(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f10087a = linkedHashMap;
    }

    @Override // g6.e
    @n6.e
    public X509Certificate a(@n6.d X509Certificate x509Certificate) {
        boolean z6;
        l0.p(x509Certificate, "cert");
        Set<X509Certificate> set = this.f10087a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) next).getPublicKey());
                    z6 = true;
                } catch (Exception unused) {
                    z6 = false;
                }
                if (z6) {
                    obj = next;
                    break;
                }
            }
            return (X509Certificate) obj;
        }
        return null;
    }

    public boolean equals(@n6.e Object obj) {
        return obj == this || ((obj instanceof b) && l0.g(((b) obj).f10087a, this.f10087a));
    }

    public int hashCode() {
        return this.f10087a.hashCode();
    }
}
