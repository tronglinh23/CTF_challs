package i5;

import i5.m;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import u4.l0;
import u4.n0;
/* loaded from: classes.dex */
public final class n implements m {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f11121a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f11122b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final k f11123c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public List<String> f11124d;

    /* loaded from: classes.dex */
    public static final class a extends x3.c<String> {
        public a() {
        }

        @Override // x3.c, x3.a
        public int a() {
            return n.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean b(String str) {
            return super.contains(str);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return b((String) obj);
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public String get(int i7) {
            String group = n.this.f().group(i7);
            return group == null ? "" : group;
        }

        public /* bridge */ int f(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int g(String str) {
            return super.lastIndexOf(str);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return f((String) obj);
            }
            return -1;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x3.a<j> implements l {

        /* loaded from: classes.dex */
        public static final class a extends n0 implements t4.l<Integer, j> {
            public a() {
                super(1);
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ j O(Integer num) {
                return b(num.intValue());
            }

            @n6.e
            public final j b(int i7) {
                return b.this.get(i7);
            }
        }

        public b() {
        }

        @Override // x3.a
        public int a() {
            return n.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean b(j jVar) {
            return super.contains(jVar);
        }

        @Override // i5.l
        @n6.e
        public j c(@n6.d String str) {
            l0.p(str, "name");
            return k4.m.f11768a.c(n.this.f(), str);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof j) {
                return b((j) obj);
            }
            return false;
        }

        @Override // i5.k
        @n6.e
        public j get(int i7) {
            d5.l d7 = p.d(n.this.f(), i7);
            if (d7.b().intValue() >= 0) {
                String group = n.this.f().group(i7);
                l0.o(group, "matchResult.group(index)");
                return new j(group, d7);
            }
            return null;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // x3.a, java.util.Collection, java.lang.Iterable
        @n6.d
        public Iterator<j> iterator() {
            return f5.u.k1(x3.e0.v1(x3.w.F(this)), new a()).iterator();
        }
    }

    public n(@n6.d Matcher matcher, @n6.d CharSequence charSequence) {
        l0.p(matcher, "matcher");
        l0.p(charSequence, "input");
        this.f11121a = matcher;
        this.f11122b = charSequence;
        this.f11123c = new b();
    }

    @Override // i5.m
    @n6.d
    public List<String> a() {
        if (this.f11124d == null) {
            this.f11124d = new a();
        }
        List<String> list = this.f11124d;
        l0.m(list);
        return list;
    }

    @Override // i5.m
    @n6.d
    public m.b b() {
        return m.a.a(this);
    }

    @Override // i5.m
    @n6.d
    public k c() {
        return this.f11123c;
    }

    @Override // i5.m
    @n6.d
    public d5.l d() {
        return p.c(f());
    }

    public final MatchResult f() {
        return this.f11121a;
    }

    @Override // i5.m
    @n6.d
    public String getValue() {
        String group = f().group();
        l0.o(group, "matchResult.group()");
        return group;
    }

    @Override // i5.m
    @n6.e
    public m next() {
        int end = f().end() + (f().end() == f().start() ? 1 : 0);
        if (end <= this.f11122b.length()) {
            Matcher matcher = this.f11121a.pattern().matcher(this.f11122b);
            l0.o(matcher, "matcher.pattern().matcher(input)");
            return p.a(matcher, end, this.f11122b);
        }
        return null;
    }
}
