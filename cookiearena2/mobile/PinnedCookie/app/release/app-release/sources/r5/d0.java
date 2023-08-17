package r5;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r5.u;
import r5.v;
import u4.l0;
import v3.b1;
import v3.u0;
import x3.a1;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public d f15824a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final v f15825b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final String f15826c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final u f15827d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public final e0 f15828e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, Object> f15829f;

    public d0(@n6.d v vVar, @n6.d String str, @n6.d u uVar, @n6.e e0 e0Var, @n6.d Map<Class<?>, ? extends Object> map) {
        l0.p(vVar, "url");
        l0.p(str, "method");
        l0.p(uVar, "headers");
        l0.p(map, "tags");
        this.f15825b = vVar;
        this.f15826c = str;
        this.f15827d = uVar;
        this.f15828e = e0Var;
        this.f15829f = map;
    }

    @s4.h(name = "-deprecated_body")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = y0.c.f18717e, imports = {}))
    @n6.e
    public final e0 a() {
        return this.f15828e;
    }

    @s4.h(name = "-deprecated_cacheControl")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheControl", imports = {}))
    public final d b() {
        return g();
    }

    @s4.h(name = "-deprecated_headers")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "headers", imports = {}))
    public final u c() {
        return this.f15827d;
    }

    @s4.h(name = "-deprecated_method")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "method", imports = {}))
    public final String d() {
        return this.f15826c;
    }

    @s4.h(name = "-deprecated_url")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "url", imports = {}))
    public final v e() {
        return this.f15825b;
    }

    @s4.h(name = y0.c.f18717e)
    @n6.e
    public final e0 f() {
        return this.f15828e;
    }

    @s4.h(name = "cacheControl")
    @n6.d
    public final d g() {
        d dVar = this.f15824a;
        if (dVar == null) {
            d c7 = d.f15802p.c(this.f15827d);
            this.f15824a = c7;
            return c7;
        }
        return dVar;
    }

    @n6.d
    public final Map<Class<?>, Object> h() {
        return this.f15829f;
    }

    @n6.e
    public final String i(@n6.d String str) {
        l0.p(str, "name");
        return this.f15827d.d(str);
    }

    @n6.d
    public final List<String> j(@n6.d String str) {
        l0.p(str, "name");
        return this.f15827d.p(str);
    }

    @s4.h(name = "headers")
    @n6.d
    public final u k() {
        return this.f15827d;
    }

    public final boolean l() {
        return this.f15825b.G();
    }

    @s4.h(name = "method")
    @n6.d
    public final String m() {
        return this.f15826c;
    }

    @n6.d
    public final a n() {
        return new a(this);
    }

    @n6.e
    public final Object o() {
        return p(Object.class);
    }

    @n6.e
    public final <T> T p(@n6.d Class<? extends T> cls) {
        l0.p(cls, "type");
        return cls.cast(this.f15829f.get(cls));
    }

    @s4.h(name = "url")
    @n6.d
    public final v q() {
        return this.f15825b;
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f15826c);
        sb.append(", url=");
        sb.append(this.f15825b);
        if (this.f15827d.size() != 0) {
            sb.append(", headers=[");
            int i7 = 0;
            for (u0<? extends String, ? extends String> u0Var : this.f15827d) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    x3.w.W();
                }
                u0<? extends String, ? extends String> u0Var2 = u0Var;
                String a7 = u0Var2.a();
                String b7 = u0Var2.b();
                if (i7 > 0) {
                    sb.append(", ");
                }
                sb.append(a7);
                sb.append(':');
                sb.append(b7);
                i7 = i8;
            }
            sb.append(']');
        }
        if ((!this.f15829f.isEmpty()) != false) {
            sb.append(", tags=");
            sb.append(this.f15829f);
        }
        sb.append('}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* loaded from: classes.dex */
    public static class a {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public v f15830a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public String f15831b;
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public u.a f15832c;
        @n6.e

        /* renamed from: d  reason: collision with root package name */
        public e0 f15833d;
        @n6.d

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f15834e;

        public a() {
            this.f15834e = new LinkedHashMap();
            this.f15831b = "GET";
            this.f15832c = new u.a();
        }

        public static /* synthetic */ a f(a aVar, e0 e0Var, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    e0Var = s5.d.f16654d;
                }
                return aVar.e(e0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        @n6.d
        public a A(@n6.e Object obj) {
            return z(Object.class, obj);
        }

        @n6.d
        public a B(@n6.d String str) {
            l0.p(str, "url");
            if (i5.b0.t2(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                l0.o(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (i5.b0.t2(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                l0.o(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return D(v.f16060w.h(str));
        }

        @n6.d
        public a C(@n6.d URL url) {
            l0.p(url, "url");
            v.b bVar = v.f16060w;
            String url2 = url.toString();
            l0.o(url2, "url.toString()");
            return D(bVar.h(url2));
        }

        @n6.d
        public a D(@n6.d v vVar) {
            l0.p(vVar, "url");
            this.f15830a = vVar;
            return this;
        }

        @n6.d
        public a a(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            this.f15832c.b(str, str2);
            return this;
        }

        @n6.d
        public d0 b() {
            v vVar = this.f15830a;
            if (vVar != null) {
                return new d0(vVar, this.f15831b, this.f15832c.i(), this.f15833d, s5.d.d0(this.f15834e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @n6.d
        public a c(@n6.d d dVar) {
            l0.p(dVar, "cacheControl");
            String dVar2 = dVar.toString();
            return dVar2.length() == 0 ? t("Cache-Control") : n("Cache-Control", dVar2);
        }

        @n6.d
        @s4.i
        public final a d() {
            return f(this, null, 1, null);
        }

        @n6.d
        @s4.i
        public a e(@n6.e e0 e0Var) {
            return p("DELETE", e0Var);
        }

        @n6.d
        public a g() {
            return p("GET", null);
        }

        @n6.e
        public final e0 h() {
            return this.f15833d;
        }

        @n6.d
        public final u.a i() {
            return this.f15832c;
        }

        @n6.d
        public final String j() {
            return this.f15831b;
        }

        @n6.d
        public final Map<Class<?>, Object> k() {
            return this.f15834e;
        }

        @n6.e
        public final v l() {
            return this.f15830a;
        }

        @n6.d
        public a m() {
            return p("HEAD", null);
        }

        @n6.d
        public a n(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            this.f15832c.m(str, str2);
            return this;
        }

        @n6.d
        public a o(@n6.d u uVar) {
            l0.p(uVar, "headers");
            this.f15832c = uVar.k();
            return this;
        }

        @n6.d
        public a p(@n6.d String str, @n6.e e0 e0Var) {
            l0.p(str, "method");
            if (str.length() > 0) {
                if (e0Var == null) {
                    if (!(true ^ y5.f.e(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!y5.f.b(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f15831b = str;
                this.f15833d = e0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @n6.d
        public a q(@n6.d e0 e0Var) {
            l0.p(e0Var, y0.c.f18717e);
            return p("PATCH", e0Var);
        }

        @n6.d
        public a r(@n6.d e0 e0Var) {
            l0.p(e0Var, y0.c.f18717e);
            return p("POST", e0Var);
        }

        @n6.d
        public a s(@n6.d e0 e0Var) {
            l0.p(e0Var, y0.c.f18717e);
            return p("PUT", e0Var);
        }

        @n6.d
        public a t(@n6.d String str) {
            l0.p(str, "name");
            this.f15832c.l(str);
            return this;
        }

        public final void u(@n6.e e0 e0Var) {
            this.f15833d = e0Var;
        }

        public final void v(@n6.d u.a aVar) {
            l0.p(aVar, "<set-?>");
            this.f15832c = aVar;
        }

        public final void w(@n6.d String str) {
            l0.p(str, "<set-?>");
            this.f15831b = str;
        }

        public final void x(@n6.d Map<Class<?>, Object> map) {
            l0.p(map, "<set-?>");
            this.f15834e = map;
        }

        public final void y(@n6.e v vVar) {
            this.f15830a = vVar;
        }

        @n6.d
        public <T> a z(@n6.d Class<? super T> cls, @n6.e T t6) {
            l0.p(cls, "type");
            if (t6 == null) {
                this.f15834e.remove(cls);
            } else {
                if (this.f15834e.isEmpty()) {
                    this.f15834e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f15834e;
                T cast = cls.cast(t6);
                l0.m(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public a(@n6.d d0 d0Var) {
            Map<Class<?>, Object> J0;
            l0.p(d0Var, "request");
            this.f15834e = new LinkedHashMap();
            this.f15830a = d0Var.q();
            this.f15831b = d0Var.m();
            this.f15833d = d0Var.f();
            if (d0Var.h().isEmpty()) {
                J0 = new LinkedHashMap<>();
            } else {
                J0 = a1.J0(d0Var.h());
            }
            this.f15834e = J0;
            this.f15832c = d0Var.k().k();
        }
    }
}
