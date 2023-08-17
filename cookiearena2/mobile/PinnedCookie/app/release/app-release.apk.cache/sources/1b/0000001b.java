package a1;

import android.util.Base64;
import d.b1;
import d.o0;
import d.q0;
import g1.s;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f78a;

    /* renamed from: b  reason: collision with root package name */
    public final String f79b;

    /* renamed from: c  reason: collision with root package name */
    public final String f80c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f81d;

    /* renamed from: e  reason: collision with root package name */
    public final int f82e;

    /* renamed from: f  reason: collision with root package name */
    public final String f83f;

    public f(@o0 String str, @o0 String str2, @o0 String str3, @o0 List<List<byte[]>> list) {
        this.f78a = (String) s.l(str);
        this.f79b = (String) s.l(str2);
        this.f80c = (String) s.l(str3);
        this.f81d = (List) s.l(list);
        this.f82e = 0;
        this.f83f = a(str, str2, str3);
    }

    public final String a(@o0 String str, @o0 String str2, @o0 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @q0
    public List<List<byte[]>> b() {
        return this.f81d;
    }

    @d.e
    public int c() {
        return this.f82e;
    }

    @b1({b1.a.LIBRARY})
    @o0
    public String d() {
        return this.f83f;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f83f;
    }

    @o0
    public String f() {
        return this.f78a;
    }

    @o0
    public String g() {
        return this.f79b;
    }

    @o0
    public String h() {
        return this.f80c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f78a + ", mProviderPackage: " + this.f79b + ", mQuery: " + this.f80c + ", mCertificates:");
        for (int i7 = 0; i7 < this.f81d.size(); i7++) {
            sb.append(" [");
            List<byte[]> list = this.f81d.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f82e);
        return sb.toString();
    }

    public f(@o0 String str, @o0 String str2, @o0 String str3, @d.e int i7) {
        this.f78a = (String) s.l(str);
        this.f79b = (String) s.l(str2);
        this.f80c = (String) s.l(str3);
        this.f81d = null;
        s.a(i7 != 0);
        this.f82e = i7;
        this.f83f = a(str, str2, str3);
    }
}