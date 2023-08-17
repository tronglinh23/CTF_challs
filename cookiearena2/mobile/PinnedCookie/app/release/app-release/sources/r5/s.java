package r5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import r5.v;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public final class s extends e0 {

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f16032b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f16033c;

    /* renamed from: e  reason: collision with root package name */
    public static final b f16031e = new b(null);

    /* renamed from: d  reason: collision with root package name */
    public static final x f16030d = x.f16088i.c("application/x-www-form-urlencoded");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16034a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f16035b;

        /* renamed from: c  reason: collision with root package name */
        public final Charset f16036c;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.nio.charset.Charset, u4.w] */
        @s4.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.s.a.<init>():void");
        }

        @n6.d
        public final a a(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            List<String> list = this.f16034a;
            v.b bVar = v.f16060w;
            list.add(v.b.f(bVar, str, 0, 0, v.f16057t, false, false, true, false, this.f16036c, 91, null));
            this.f16035b.add(v.b.f(bVar, str2, 0, 0, v.f16057t, false, false, true, false, this.f16036c, 91, null));
            return this;
        }

        @n6.d
        public final a b(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            List<String> list = this.f16034a;
            v.b bVar = v.f16060w;
            list.add(v.b.f(bVar, str, 0, 0, v.f16057t, true, false, true, false, this.f16036c, 83, null));
            this.f16035b.add(v.b.f(bVar, str2, 0, 0, v.f16057t, true, false, true, false, this.f16036c, 83, null));
            return this;
        }

        @n6.d
        public final s c() {
            return new s(this.f16034a, this.f16035b);
        }

        @s4.i
        public a(@n6.e Charset charset) {
            this.f16036c = charset;
            this.f16034a = new ArrayList();
            this.f16035b = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i7, u4.w wVar) {
            this((i7 & 1) != 0 ? null : charset);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    public s(@n6.d List<String> list, @n6.d List<String> list2) {
        l0.p(list, "encodedNames");
        l0.p(list2, "encodedValues");
        this.f16032b = s5.d.c0(list);
        this.f16033c = s5.d.c0(list2);
    }

    @Override // r5.e0
    public long a() {
        return y(null, true);
    }

    @Override // r5.e0
    @n6.d
    public x b() {
        return f16030d;
    }

    @Override // r5.e0
    public void r(@n6.d i6.n nVar) throws IOException {
        l0.p(nVar, "sink");
        y(nVar, false);
    }

    @s4.h(name = "-deprecated_size")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    public final int s() {
        return w();
    }

    @n6.d
    public final String t(int i7) {
        return this.f16032b.get(i7);
    }

    @n6.d
    public final String u(int i7) {
        return this.f16033c.get(i7);
    }

    @n6.d
    public final String v(int i7) {
        return v.b.n(v.f16060w, t(i7), 0, 0, true, 3, null);
    }

    @s4.h(name = "size")
    public final int w() {
        return this.f16032b.size();
    }

    @n6.d
    public final String x(int i7) {
        return v.b.n(v.f16060w, u(i7), 0, 0, true, 3, null);
    }

    public final long y(i6.n nVar, boolean z6) {
        i6.m j7;
        if (z6) {
            j7 = new i6.m();
        } else {
            l0.m(nVar);
            j7 = nVar.j();
        }
        int size = this.f16032b.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 > 0) {
                j7.e0(38);
            }
            j7.H0(this.f16032b.get(i7));
            j7.e0(61);
            j7.H0(this.f16033c.get(i7));
        }
        if (z6) {
            long a12 = j7.a1();
            j7.l();
            return a12;
        }
        return 0L;
    }
}
