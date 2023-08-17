package i5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;
import v3.u0;
/* loaded from: classes.dex */
public final class h implements f5.m<d5.l> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f11082a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11083b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11084c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final t4.p<CharSequence, Integer, u0<Integer, Integer>> f11085d;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<d5.l>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public int f11086k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f11087l;

        /* renamed from: m  reason: collision with root package name */
        public int f11088m;
        @n6.e

        /* renamed from: n  reason: collision with root package name */
        public d5.l f11089n;

        /* renamed from: o  reason: collision with root package name */
        public int f11090o;

        public a() {
            int I = d5.u.I(h.this.f11083b, 0, h.this.f11082a.length());
            this.f11087l = I;
            this.f11088m = I;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f11091p.f11084c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r6 = this;
                int r0 = r6.f11088m
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f11086k = r1
                r0 = 0
                r6.f11089n = r0
                goto L9e
            Lc:
                i5.h r0 = i5.h.this
                int r0 = i5.h.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f11090o
                int r0 = r0 + r3
                r6.f11090o = r0
                i5.h r4 = i5.h.this
                int r4 = i5.h.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f11088m
                i5.h r4 = i5.h.this
                java.lang.CharSequence r4 = i5.h.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                d5.l r0 = new d5.l
                int r1 = r6.f11087l
                i5.h r4 = i5.h.this
                java.lang.CharSequence r4 = i5.h.d(r4)
                int r4 = i5.c0.j3(r4)
                r0.<init>(r1, r4)
                r6.f11089n = r0
                r6.f11088m = r2
                goto L9c
            L47:
                i5.h r0 = i5.h.this
                t4.p r0 = i5.h.c(r0)
                i5.h r4 = i5.h.this
                java.lang.CharSequence r4 = i5.h.d(r4)
                int r5 = r6.f11088m
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.J(r4, r5)
                v3.u0 r0 = (v3.u0) r0
                if (r0 != 0) goto L77
                d5.l r0 = new d5.l
                int r1 = r6.f11087l
                i5.h r4 = i5.h.this
                java.lang.CharSequence r4 = i5.h.d(r4)
                int r4 = i5.c0.j3(r4)
                r0.<init>(r1, r4)
                r6.f11089n = r0
                r6.f11088m = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f11087l
                d5.l r4 = d5.u.W1(r4, r2)
                r6.f11089n = r4
                int r2 = r2 + r0
                r6.f11087l = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f11088m = r2
            L9c:
                r6.f11086k = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.h.a.a():void");
        }

        public final int b() {
            return this.f11090o;
        }

        public final int d() {
            return this.f11087l;
        }

        @n6.e
        public final d5.l f() {
            return this.f11089n;
        }

        public final int g() {
            return this.f11088m;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11086k == -1) {
                a();
            }
            return this.f11086k == 1;
        }

        public final int i() {
            return this.f11086k;
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public d5.l next() {
            if (this.f11086k == -1) {
                a();
            }
            if (this.f11086k != 0) {
                d5.l lVar = this.f11089n;
                l0.n(lVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f11089n = null;
                this.f11086k = -1;
                return lVar;
            }
            throw new NoSuchElementException();
        }

        public final void k(int i7) {
            this.f11090o = i7;
        }

        public final void l(int i7) {
            this.f11087l = i7;
        }

        public final void m(@n6.e d5.l lVar) {
            this.f11089n = lVar;
        }

        public final void n(int i7) {
            this.f11088m = i7;
        }

        public final void o(int i7) {
            this.f11086k = i7;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@n6.d CharSequence charSequence, int i7, int i8, @n6.d t4.p<? super CharSequence, ? super Integer, u0<Integer, Integer>> pVar) {
        l0.p(charSequence, "input");
        l0.p(pVar, "getNextMatch");
        this.f11082a = charSequence;
        this.f11083b = i7;
        this.f11084c = i8;
        this.f11085d = pVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<d5.l> iterator() {
        return new a();
    }
}
