package w;

import java.util.HashMap;
import java.util.Set;
/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f17928b = new f();

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, g> f17929a = new HashMap<>();

    public static f c() {
        return f17928b;
    }

    public String a(String str) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    public String b(String str) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public long d(String str) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            return gVar.g();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.f17929a.keySet();
    }

    public void f(String str, g gVar) {
        this.f17929a.put(str, gVar);
    }

    public void g(String str, int i7) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            gVar.h(i7);
        }
    }

    public void h(String str, int i7) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            gVar.a(i7);
        }
    }

    public void i(String str, g gVar) {
        this.f17929a.remove(str);
    }

    public void j(String str, String str2) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            gVar.c(str2);
        }
    }

    public void k(String str, int i7, int i8) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            gVar.d(i7, i8);
        }
    }

    public void l(String str, float f7) {
        g gVar = this.f17929a.get(str);
        if (gVar != null) {
            gVar.b(f7);
        }
    }
}
