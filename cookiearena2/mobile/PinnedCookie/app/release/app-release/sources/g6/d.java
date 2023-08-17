package g6;

import a6.g;
import i5.b0;
import i5.c0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import u4.l0;
import x3.e0;
import x3.w;
/* loaded from: classes.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10089a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10090b = 7;

    /* renamed from: c  reason: collision with root package name */
    public static final d f10091c = new d();

    @n6.d
    public final List<String> a(@n6.d X509Certificate x509Certificate) {
        l0.p(x509Certificate, "certificate");
        return e0.z4(b(x509Certificate, 7), b(x509Certificate, 2));
    }

    public final List<String> b(X509Certificate x509Certificate, int i7) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && (!l0.g(list.get(0), Integer.valueOf(i7))) == false && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            return w.E();
        } catch (CertificateParsingException unused) {
            return w.E();
        }
    }

    public final boolean c(@n6.d String str, @n6.d X509Certificate x509Certificate) {
        l0.p(str, g.f399j);
        l0.p(x509Certificate, "certificate");
        return s5.d.h(str) ? f(str, x509Certificate) : e(str, x509Certificate);
    }

    public final boolean d(String str, String str2) {
        if (!(str == null || str.length() == 0) && !b0.v2(str, ".", false, 2, null) && !b0.K1(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !b0.v2(str2, ".", false, 2, null) && !b0.K1(str2, "..", false, 2, null)) {
                if (!b0.K1(str, ".", false, 2, null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!b0.K1(str2, ".", false, 2, null)) {
                    str2 = str2 + ".";
                }
                Locale locale = Locale.US;
                l0.o(locale, "Locale.US");
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(locale);
                    l0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (c0.W2(lowerCase, "*", false, 2, null)) {
                        if (!b0.v2(lowerCase, "*.", false, 2, null) || c0.r3(lowerCase, '*', 1, false, 4, null) != -1 || str3.length() < lowerCase.length() || l0.g("*.", lowerCase)) {
                            return false;
                        }
                        String substring = lowerCase.substring(1);
                        l0.o(substring, "(this as java.lang.String).substring(startIndex)");
                        if (b0.K1(str3, substring, false, 2, null)) {
                            int length = str3.length() - substring.length();
                            return length <= 0 || c0.F3(str3, '.', length + (-1), false, 4, null) == -1;
                        }
                        return false;
                    }
                    return l0.g(str3, lowerCase);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        l0.o(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            l0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> b7 = b(x509Certificate, 2);
            if ((b7 instanceof Collection) && b7.isEmpty()) {
                return false;
            }
            Iterator<T> it = b7.iterator();
            while (it.hasNext()) {
                if (f10091c.d(lowerCase, (String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean f(String str, X509Certificate x509Certificate) {
        String e7 = s5.a.e(str);
        List<String> b7 = b(x509Certificate, 7);
        if ((b7 instanceof Collection) && b7.isEmpty()) {
            return false;
        }
        Iterator<T> it = b7.iterator();
        while (it.hasNext()) {
            if (l0.g(e7, s5.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@n6.d String str, @n6.d SSLSession sSLSession) {
        l0.p(str, g.f399j);
        l0.p(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
