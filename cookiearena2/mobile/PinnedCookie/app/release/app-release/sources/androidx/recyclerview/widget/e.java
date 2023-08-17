package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import d.k1;
import d.m1;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: s  reason: collision with root package name */
    public static final String f5282s = "AsyncListUtil";

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f5283t = false;

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f5284a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5285b;

    /* renamed from: c  reason: collision with root package name */
    public final c<T> f5286c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5287d;

    /* renamed from: e  reason: collision with root package name */
    public final f0<T> f5288e;

    /* renamed from: f  reason: collision with root package name */
    public final e0.b<T> f5289f;

    /* renamed from: g  reason: collision with root package name */
    public final e0.a<T> f5290g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5294k;

    /* renamed from: q  reason: collision with root package name */
    public final e0.b<T> f5300q;

    /* renamed from: r  reason: collision with root package name */
    public final e0.a<T> f5301r;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f5291h = new int[2];

    /* renamed from: i  reason: collision with root package name */
    public final int[] f5292i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public final int[] f5293j = new int[2];

    /* renamed from: l  reason: collision with root package name */
    public int f5295l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f5296m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f5297n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f5298o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final SparseIntArray f5299p = new SparseIntArray();

    /* loaded from: classes.dex */
    public class a implements e0.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void a(int i7, int i8) {
            if (d(i7)) {
                e eVar = e.this;
                eVar.f5296m = i8;
                eVar.f5287d.c();
                e eVar2 = e.this;
                eVar2.f5297n = eVar2.f5298o;
                e();
                e eVar3 = e.this;
                eVar3.f5294k = false;
                eVar3.g();
            }
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void b(int i7, f0.a<T> aVar) {
            if (!d(i7)) {
                e.this.f5290g.a(aVar);
                return;
            }
            f0.a<T> a7 = e.this.f5288e.a(aVar);
            if (a7 != null) {
                Log.e(e.f5282s, "duplicate tile @" + a7.f5326b);
                e.this.f5290g.a(a7);
            }
            int i8 = aVar.f5326b + aVar.f5327c;
            int i9 = 0;
            while (i9 < e.this.f5299p.size()) {
                int keyAt = e.this.f5299p.keyAt(i9);
                if (aVar.f5326b > keyAt || keyAt >= i8) {
                    i9++;
                } else {
                    e.this.f5299p.removeAt(i9);
                    e.this.f5287d.d(keyAt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void c(int i7, int i8) {
            if (d(i7)) {
                f0.a<T> e7 = e.this.f5288e.e(i8);
                if (e7 != null) {
                    e.this.f5290g.a(e7);
                    return;
                }
                Log.e(e.f5282s, "tile not found @" + i8);
            }
        }

        public final boolean d(int i7) {
            return i7 == e.this.f5298o;
        }

        public final void e() {
            for (int i7 = 0; i7 < e.this.f5288e.f(); i7++) {
                e eVar = e.this;
                eVar.f5290g.a(eVar.f5288e.c(i7));
            }
            e.this.f5288e.b();
        }
    }

    /* loaded from: classes.dex */
    public class b implements e0.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public f0.a<T> f5303a;

        /* renamed from: b  reason: collision with root package name */
        public final SparseBooleanArray f5304b = new SparseBooleanArray();

        /* renamed from: c  reason: collision with root package name */
        public int f5305c;

        /* renamed from: d  reason: collision with root package name */
        public int f5306d;

        /* renamed from: e  reason: collision with root package name */
        public int f5307e;

        /* renamed from: f  reason: collision with root package name */
        public int f5308f;

        public b() {
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void a(f0.a<T> aVar) {
            e.this.f5286c.c(aVar.f5325a, aVar.f5327c);
            aVar.f5328d = this.f5303a;
            this.f5303a = aVar;
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void b(int i7, int i8, int i9, int i10, int i11) {
            if (i7 > i8) {
                return;
            }
            int h7 = h(i7);
            int h8 = h(i8);
            this.f5307e = h(i9);
            int h9 = h(i10);
            this.f5308f = h9;
            if (i11 == 1) {
                l(this.f5307e, h8, i11, true);
                l(h8 + e.this.f5285b, this.f5308f, i11, false);
                return;
            }
            l(h7, h9, i11, false);
            l(this.f5307e, h7 - e.this.f5285b, i11, true);
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void c(int i7, int i8) {
            if (i(i7)) {
                return;
            }
            f0.a<T> e7 = e();
            e7.f5326b = i7;
            int min = Math.min(e.this.f5285b, this.f5306d - i7);
            e7.f5327c = min;
            e.this.f5286c.a(e7.f5325a, e7.f5326b, min);
            g(i8);
            f(e7);
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void d(int i7) {
            this.f5305c = i7;
            this.f5304b.clear();
            int d7 = e.this.f5286c.d();
            this.f5306d = d7;
            e.this.f5289f.a(this.f5305c, d7);
        }

        public final f0.a<T> e() {
            f0.a<T> aVar = this.f5303a;
            if (aVar != null) {
                this.f5303a = aVar.f5328d;
                return aVar;
            }
            e eVar = e.this;
            return new f0.a<>(eVar.f5284a, eVar.f5285b);
        }

        public final void f(f0.a<T> aVar) {
            this.f5304b.put(aVar.f5326b, true);
            e.this.f5289f.b(this.f5305c, aVar);
        }

        public final void g(int i7) {
            int b7 = e.this.f5286c.b();
            while (this.f5304b.size() >= b7) {
                int keyAt = this.f5304b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f5304b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i8 = this.f5307e - keyAt;
                int i9 = keyAt2 - this.f5308f;
                if (i8 > 0 && (i8 >= i9 || i7 == 2)) {
                    k(keyAt);
                } else if (i9 <= 0) {
                    return;
                } else {
                    if (i8 >= i9 && i7 != 1) {
                        return;
                    }
                    k(keyAt2);
                }
            }
        }

        public final int h(int i7) {
            return i7 - (i7 % e.this.f5285b);
        }

        public final boolean i(int i7) {
            return this.f5304b.get(i7);
        }

        public final void j(String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("[BKGR] ");
            sb.append(String.format(str, objArr));
        }

        public final void k(int i7) {
            this.f5304b.delete(i7);
            e.this.f5289f.c(this.f5305c, i7);
        }

        public final void l(int i7, int i8, int i9, boolean z6) {
            int i10 = i7;
            while (i10 <= i8) {
                e.this.f5290g.c(z6 ? (i8 + i7) - i10 : i10, i9);
                i10 += e.this.f5285b;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<T> {
        @m1
        public abstract void a(@o0 T[] tArr, int i7, int i8);

        @m1
        public int b() {
            return 10;
        }

        @m1
        public void c(@o0 T[] tArr, int i7) {
        }

        @m1
        public abstract int d();
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5310a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5311b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5312c = 2;

        @k1
        public void a(@o0 int[] iArr, @o0 int[] iArr2, int i7) {
            int i8 = iArr[1];
            int i9 = iArr[0];
            int i10 = (i8 - i9) + 1;
            int i11 = i10 / 2;
            iArr2[0] = i9 - (i7 == 1 ? i10 : i11);
            if (i7 != 2) {
                i10 = i11;
            }
            iArr2[1] = i8 + i10;
        }

        @k1
        public abstract void b(@o0 int[] iArr);

        @k1
        public abstract void c();

        @k1
        public abstract void d(int i7);
    }

    public e(@o0 Class<T> cls, int i7, @o0 c<T> cVar, @o0 d dVar) {
        a aVar = new a();
        this.f5300q = aVar;
        b bVar = new b();
        this.f5301r = bVar;
        this.f5284a = cls;
        this.f5285b = i7;
        this.f5286c = cVar;
        this.f5287d = dVar;
        this.f5288e = new f0<>(i7);
        u uVar = new u();
        this.f5289f = uVar.b(aVar);
        this.f5290g = uVar.a(bVar);
        f();
    }

    @q0
    public T a(int i7) {
        if (i7 < 0 || i7 >= this.f5296m) {
            throw new IndexOutOfBoundsException(i7 + " is not within 0 and " + this.f5296m);
        }
        T d7 = this.f5288e.d(i7);
        if (d7 == null && !c()) {
            this.f5299p.put(i7, 0);
        }
        return d7;
    }

    public int b() {
        return this.f5296m;
    }

    public final boolean c() {
        return this.f5298o != this.f5297n;
    }

    public void d(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[MAIN] ");
        sb.append(String.format(str, objArr));
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.f5294k = true;
    }

    public void f() {
        this.f5299p.clear();
        e0.a<T> aVar = this.f5290g;
        int i7 = this.f5298o + 1;
        this.f5298o = i7;
        aVar.d(i7);
    }

    public void g() {
        int i7;
        this.f5287d.b(this.f5291h);
        int[] iArr = this.f5291h;
        int i8 = iArr[0];
        int i9 = iArr[1];
        if (i8 > i9 || i8 < 0 || i9 >= this.f5296m) {
            return;
        }
        if (this.f5294k) {
            int[] iArr2 = this.f5292i;
            if (i8 > iArr2[1] || (i7 = iArr2[0]) > i9) {
                this.f5295l = 0;
            } else if (i8 < i7) {
                this.f5295l = 1;
            } else if (i8 > i7) {
                this.f5295l = 2;
            }
        } else {
            this.f5295l = 0;
        }
        int[] iArr3 = this.f5292i;
        iArr3[0] = i8;
        iArr3[1] = i9;
        this.f5287d.a(iArr, this.f5293j, this.f5295l);
        int[] iArr4 = this.f5293j;
        iArr4[0] = Math.min(this.f5291h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f5293j;
        iArr5[1] = Math.max(this.f5291h[1], Math.min(iArr5[1], this.f5296m - 1));
        e0.a<T> aVar = this.f5290g;
        int[] iArr6 = this.f5291h;
        int i10 = iArr6[0];
        int i11 = iArr6[1];
        int[] iArr7 = this.f5293j;
        aVar.b(i10, i11, iArr7[0], iArr7[1], this.f5295l);
    }
}
