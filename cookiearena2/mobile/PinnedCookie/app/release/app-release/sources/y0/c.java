package y0;

import android.net.Uri;
import d.o0;
import d.q0;
import g1.s;
import i5.h0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final String f18714b = "mailto:";

    /* renamed from: c  reason: collision with root package name */
    public static final String f18715c = "mailto";

    /* renamed from: d  reason: collision with root package name */
    public static final String f18716d = "to";

    /* renamed from: e  reason: collision with root package name */
    public static final String f18717e = "body";

    /* renamed from: f  reason: collision with root package name */
    public static final String f18718f = "cc";

    /* renamed from: g  reason: collision with root package name */
    public static final String f18719g = "bcc";

    /* renamed from: h  reason: collision with root package name */
    public static final String f18720h = "subject";

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f18721a = new HashMap<>();

    public static boolean g(@q0 Uri uri) {
        return uri != null && f18715c.equals(uri.getScheme());
    }

    public static boolean h(@q0 String str) {
        return str != null && str.startsWith(f18714b);
    }

    @o0
    public static c i(@o0 Uri uri) throws d {
        return j(uri.toString());
    }

    @o0
    public static c j(@o0 String str) throws d {
        String decode;
        String substring;
        s.l(str);
        if (h(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                decode = Uri.decode(str.substring(7));
                substring = null;
            } else {
                decode = Uri.decode(str.substring(7, indexOf2));
                substring = str.substring(indexOf2 + 1);
            }
            c cVar = new c();
            if (substring != null) {
                for (String str2 : substring.split("&")) {
                    String[] split = str2.split("=", 2);
                    if (split.length != 0) {
                        cVar.f18721a.put(Uri.decode(split[0]).toLowerCase(Locale.ROOT), split.length > 1 ? Uri.decode(split[1]) : null);
                    }
                }
            }
            String f7 = cVar.f();
            if (f7 != null) {
                decode = decode + ", " + f7;
            }
            cVar.f18721a.put("to", decode);
            return cVar;
        }
        throw new d("Not a mailto scheme");
    }

    @q0
    public String a() {
        return this.f18721a.get(f18719g);
    }

    @q0
    public String b() {
        return this.f18721a.get(f18717e);
    }

    @q0
    public String c() {
        return this.f18721a.get(f18718f);
    }

    @q0
    public Map<String, String> d() {
        return this.f18721a;
    }

    @q0
    public String e() {
        return this.f18721a.get(f18720h);
    }

    @q0
    public String f() {
        return this.f18721a.get("to");
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder(f18714b);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f18721a.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append(h0.f11095d);
        }
        return sb.toString();
    }
}
