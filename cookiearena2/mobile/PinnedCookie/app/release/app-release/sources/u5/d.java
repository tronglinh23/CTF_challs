package u5;

import c6.j;
import i0.x2;
import i5.b0;
import i5.c0;
import i5.h0;
import i5.o;
import i6.a0;
import i6.m0;
import i6.n;
import i6.o0;
import i6.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import s4.i;
import t4.l;
import u4.l0;
import u4.n0;
import u4.w;
import v3.m2;
import v3.y;
/* loaded from: classes.dex */
public final class d implements Closeable, Flushable {
    public final e A;
    @n6.d
    public final b6.a B;
    @n6.d
    public final File C;
    public final int D;
    public final int E;

    /* renamed from: k */
    public long f17544k;

    /* renamed from: l */
    public final File f17545l;

    /* renamed from: m */
    public final File f17546m;

    /* renamed from: n */
    public final File f17547n;

    /* renamed from: o */
    public long f17548o;

    /* renamed from: p */
    public n f17549p;
    @n6.d

    /* renamed from: q */
    public final LinkedHashMap<String, c> f17550q;

    /* renamed from: r */
    public int f17551r;

    /* renamed from: s */
    public boolean f17552s;

    /* renamed from: t */
    public boolean f17553t;

    /* renamed from: u */
    public boolean f17554u;

    /* renamed from: v */
    public boolean f17555v;

    /* renamed from: w */
    public boolean f17556w;

    /* renamed from: x */
    public boolean f17557x;

    /* renamed from: y */
    public long f17558y;

    /* renamed from: z */
    public final w5.c f17559z;
    public static final a Q = new a(null);
    @n6.d
    @s4.e
    public static final String F = "journal";
    @n6.d
    @s4.e
    public static final String G = "journal.tmp";
    @n6.d
    @s4.e
    public static final String H = "journal.bkp";
    @n6.d
    @s4.e
    public static final String I = "libcore.io.DiskLruCache";
    @n6.d
    @s4.e
    public static final String J = "1";
    @s4.e
    public static final long K = -1;
    @n6.d
    @s4.e
    public static final o L = new o("[a-z0-9_-]{1,120}");
    @n6.d
    @s4.e
    public static final String M = "CLEAN";
    @n6.d
    @s4.e
    public static final String N = "DIRTY";
    @n6.d
    @s4.e
    public static final String O = "REMOVE";
    @n6.d
    @s4.e
    public static final String P = "READ";

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class b {
        @n6.e

        /* renamed from: a */
        public final boolean[] f17560a;

        /* renamed from: b */
        public boolean f17561b;
        @n6.d

        /* renamed from: c */
        public final c f17562c;

        /* renamed from: d */
        public final /* synthetic */ d f17563d;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements l<IOException, m2> {

            /* renamed from: m */
            public final /* synthetic */ int f17565m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i7) {
                super(1);
                b.this = r1;
                this.f17565m = i7;
            }

            @Override // t4.l
            public /* bridge */ /* synthetic */ m2 O(IOException iOException) {
                b(iOException);
                return m2.f17815a;
            }

            public final void b(@n6.d IOException iOException) {
                l0.p(iOException, "it");
                synchronized (b.this.f17563d) {
                    b.this.c();
                    m2 m2Var = m2.f17815a;
                }
            }
        }

        public b(@n6.d d dVar, c cVar) {
            l0.p(cVar, "entry");
            this.f17563d = dVar;
            this.f17562c = cVar;
            this.f17560a = cVar.g() ? null : new boolean[dVar.w0()];
        }

        public final void a() throws IOException {
            synchronized (this.f17563d) {
                if ((!this.f17561b) != true) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (l0.g(this.f17562c.b(), this)) {
                    this.f17563d.I(this, false);
                }
                this.f17561b = true;
                m2 m2Var = m2.f17815a;
            }
        }

        public final void b() throws IOException {
            synchronized (this.f17563d) {
                if ((!this.f17561b) != true) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (l0.g(this.f17562c.b(), this)) {
                    this.f17563d.I(this, true);
                }
                this.f17561b = true;
                m2 m2Var = m2.f17815a;
            }
        }

        public final void c() {
            if (l0.g(this.f17562c.b(), this)) {
                if (this.f17563d.f17553t) {
                    this.f17563d.I(this, false);
                } else {
                    this.f17562c.q(true);
                }
            }
        }

        @n6.d
        public final c d() {
            return this.f17562c;
        }

        @n6.e
        public final boolean[] e() {
            return this.f17560a;
        }

        @n6.d
        public final m0 f(int i7) {
            synchronized (this.f17563d) {
                if ((!this.f17561b) == true) {
                    if ((!l0.g(this.f17562c.b(), this)) == true) {
                        return a0.b();
                    }
                    if (!this.f17562c.g()) {
                        boolean[] zArr = this.f17560a;
                        l0.m(zArr);
                        zArr[i7] = true;
                    }
                    try {
                        return new u5.e(this.f17563d.f0().c(this.f17562c.c().get(i7)), new a(i7));
                    } catch (FileNotFoundException unused) {
                        return a0.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @n6.e
        public final o0 g(int i7) {
            synchronized (this.f17563d) {
                if ((!this.f17561b) == true) {
                    o0 o0Var = null;
                    if (!this.f17562c.g() || (!l0.g(this.f17562c.b(), this)) == true || this.f17562c.i()) {
                        return null;
                    }
                    try {
                        o0Var = this.f17563d.f0().b(this.f17562c.a().get(i7));
                    } catch (FileNotFoundException unused) {
                    }
                    return o0Var;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c {
        @n6.d

        /* renamed from: a */
        public final long[] f17566a;
        @n6.d

        /* renamed from: b */
        public final List<File> f17567b;
        @n6.d

        /* renamed from: c */
        public final List<File> f17568c;

        /* renamed from: d */
        public boolean f17569d;

        /* renamed from: e */
        public boolean f17570e;
        @n6.e

        /* renamed from: f */
        public b f17571f;

        /* renamed from: g */
        public int f17572g;

        /* renamed from: h */
        public long f17573h;
        @n6.d

        /* renamed from: i */
        public final String f17574i;

        /* renamed from: j */
        public final /* synthetic */ d f17575j;

        /* loaded from: classes.dex */
        public static final class a extends s {

            /* renamed from: l */
            public boolean f17576l;

            /* renamed from: n */
            public final /* synthetic */ o0 f17578n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o0 o0Var, o0 o0Var2) {
                super(o0Var2);
                c.this = r1;
                this.f17578n = o0Var;
            }

            @Override // i6.s, i6.o0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f17576l) {
                    return;
                }
                this.f17576l = true;
                synchronized (c.this.f17575j) {
                    c.this.n(r1.f() - 1);
                    if (c.this.f() == 0 && c.this.i()) {
                        c cVar = c.this;
                        cVar.f17575j.W0(cVar);
                    }
                    m2 m2Var = m2.f17815a;
                }
            }
        }

        public c(@n6.d d dVar, String str) {
            l0.p(str, x2.f10960j);
            this.f17575j = dVar;
            this.f17574i = str;
            this.f17566a = new long[dVar.w0()];
            this.f17567b = new ArrayList();
            this.f17568c = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int w02 = dVar.w0();
            for (int i7 = 0; i7 < w02; i7++) {
                sb.append(i7);
                this.f17567b.add(new File(dVar.d0(), sb.toString()));
                sb.append(".tmp");
                this.f17568c.add(new File(dVar.d0(), sb.toString()));
                sb.setLength(length);
            }
        }

        @n6.d
        public final List<File> a() {
            return this.f17567b;
        }

        @n6.e
        public final b b() {
            return this.f17571f;
        }

        @n6.d
        public final List<File> c() {
            return this.f17568c;
        }

        @n6.d
        public final String d() {
            return this.f17574i;
        }

        @n6.d
        public final long[] e() {
            return this.f17566a;
        }

        public final int f() {
            return this.f17572g;
        }

        public final boolean g() {
            return this.f17569d;
        }

        public final long h() {
            return this.f17573h;
        }

        public final boolean i() {
            return this.f17570e;
        }

        public final Void j(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final o0 k(int i7) {
            o0 b7 = this.f17575j.f0().b(this.f17567b.get(i7));
            if (this.f17575j.f17553t) {
                return b7;
            }
            this.f17572g++;
            return new a(b7, b7);
        }

        public final void l(@n6.e b bVar) {
            this.f17571f = bVar;
        }

        public final void m(@n6.d List<String> list) throws IOException {
            l0.p(list, "strings");
            if (list.size() != this.f17575j.w0()) {
                j(list);
                throw new y();
            }
            try {
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.f17566a[i7] = Long.parseLong(list.get(i7));
                }
            } catch (NumberFormatException unused) {
                j(list);
                throw new y();
            }
        }

        public final void n(int i7) {
            this.f17572g = i7;
        }

        public final void o(boolean z6) {
            this.f17569d = z6;
        }

        public final void p(long j7) {
            this.f17573h = j7;
        }

        public final void q(boolean z6) {
            this.f17570e = z6;
        }

        @n6.e
        public final C0251d r() {
            d dVar = this.f17575j;
            if (s5.d.f16658h && !Thread.holdsLock(dVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(dVar);
                throw new AssertionError(sb.toString());
            } else if (this.f17569d) {
                if (this.f17575j.f17553t || (this.f17571f == null && !this.f17570e)) {
                    ArrayList arrayList = new ArrayList();
                    long[] jArr = (long[]) this.f17566a.clone();
                    try {
                        int w02 = this.f17575j.w0();
                        for (int i7 = 0; i7 < w02; i7++) {
                            arrayList.add(k(i7));
                        }
                        return new C0251d(this.f17575j, this.f17574i, this.f17573h, arrayList, jArr);
                    } catch (FileNotFoundException unused) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            s5.d.l((o0) it.next());
                        }
                        try {
                            this.f17575j.W0(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                return null;
            } else {
                return null;
            }
        }

        public final void s(@n6.d n nVar) throws IOException {
            l0.p(nVar, "writer");
            for (long j7 : this.f17566a) {
                nVar.e0(32).J0(j7);
            }
        }
    }

    /* renamed from: u5.d$d */
    /* loaded from: classes.dex */
    public final class C0251d implements Closeable {

        /* renamed from: k */
        public final String f17579k;

        /* renamed from: l */
        public final long f17580l;

        /* renamed from: m */
        public final List<o0> f17581m;

        /* renamed from: n */
        public final long[] f17582n;

        /* renamed from: o */
        public final /* synthetic */ d f17583o;

        /* JADX WARN: Multi-variable type inference failed */
        public C0251d(@n6.d d dVar, String str, @n6.d long j7, @n6.d List<? extends o0> list, long[] jArr) {
            l0.p(str, x2.f10960j);
            l0.p(list, "sources");
            l0.p(jArr, "lengths");
            this.f17583o = dVar;
            this.f17579k = str;
            this.f17580l = j7;
            this.f17581m = list;
            this.f17582n = jArr;
        }

        @n6.e
        public final b a() throws IOException {
            return this.f17583o.Q(this.f17579k, this.f17580l);
        }

        public final long b(int i7) {
            return this.f17582n[i7];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<o0> it = this.f17581m.iterator();
            while (it.hasNext()) {
                s5.d.l(it.next());
            }
        }

        @n6.d
        public final o0 d(int i7) {
            return this.f17581m.get(i7);
        }

        @n6.d
        public final String e() {
            return this.f17579k;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends w5.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(str, false, 2, null);
            d.this = r3;
        }

        @Override // w5.a
        public long f() {
            synchronized (d.this) {
                if (!d.this.f17554u || d.this.Z()) {
                    return -1L;
                }
                try {
                    d.this.c1();
                } catch (IOException unused) {
                    d.this.f17556w = true;
                }
                try {
                    if (d.this.E0()) {
                        d.this.U0();
                        d.this.f17551r = 0;
                    }
                } catch (IOException unused2) {
                    d.this.f17557x = true;
                    d.this.f17549p = a0.c(a0.b());
                }
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n0 implements l<IOException, m2> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(1);
            d.this = r1;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(IOException iOException) {
            b(iOException);
            return m2.f17815a;
        }

        public final void b(@n6.d IOException iOException) {
            l0.p(iOException, "it");
            d dVar = d.this;
            if (!s5.d.f16658h || Thread.holdsLock(dVar)) {
                d.this.f17552s = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(dVar);
            throw new AssertionError(sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Iterator<C0251d>, v4.d {

        /* renamed from: k */
        public final Iterator<c> f17586k;

        /* renamed from: l */
        public C0251d f17587l;

        /* renamed from: m */
        public C0251d f17588m;

        public g() {
            d.this = r2;
            Iterator<c> it = new ArrayList(r2.p0().values()).iterator();
            l0.o(it, "ArrayList(lruEntries.values).iterator()");
            this.f17586k = it;
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: a */
        public C0251d next() {
            if (hasNext()) {
                C0251d c0251d = this.f17587l;
                this.f17588m = c0251d;
                this.f17587l = null;
                l0.m(c0251d);
                return c0251d;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C0251d r6;
            if (this.f17587l != null) {
                return true;
            }
            synchronized (d.this) {
                if (d.this.Z()) {
                    return false;
                }
                while (this.f17586k.hasNext()) {
                    c next = this.f17586k.next();
                    if (next != null && (r6 = next.r()) != null) {
                        this.f17587l = r6;
                        return true;
                    }
                }
                m2 m2Var = m2.f17815a;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            C0251d c0251d = this.f17588m;
            if (c0251d == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                d.this.V0(c0251d.e());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f17588m = null;
                throw th;
            }
            this.f17588m = null;
        }
    }

    public d(@n6.d b6.a aVar, @n6.d File file, int i7, int i8, long j7, @n6.d w5.d dVar) {
        l0.p(aVar, "fileSystem");
        l0.p(file, "directory");
        l0.p(dVar, "taskRunner");
        this.B = aVar;
        this.C = file;
        this.D = i7;
        this.E = i8;
        this.f17544k = j7;
        this.f17550q = new LinkedHashMap<>(0, 0.75f, true);
        this.f17559z = dVar.j();
        this.A = new e(s5.d.f16659i + " Cache");
        if (!(j7 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i8 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f17545l = new File(file, F);
        this.f17546m = new File(file, G);
        this.f17547n = new File(file, H);
    }

    public static /* synthetic */ b R(d dVar, String str, long j7, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            j7 = K;
        }
        return dVar.Q(str, j7);
    }

    public final synchronized boolean C0() {
        return this.f17555v;
    }

    public final synchronized void E() {
        if ((!this.f17555v) == false) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final boolean E0() {
        int i7 = this.f17551r;
        return i7 >= 2000 && i7 >= this.f17550q.size();
    }

    public final synchronized void I(@n6.d b bVar, boolean z6) throws IOException {
        l0.p(bVar, "editor");
        c d7 = bVar.d();
        if (!l0.g(d7.b(), bVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z6 && !d7.g()) {
            int i7 = this.E;
            for (int i8 = 0; i8 < i7; i8++) {
                boolean[] e7 = bVar.e();
                l0.m(e7);
                if (!e7[i8]) {
                    bVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                } else if (!this.B.f(d7.c().get(i8))) {
                    bVar.a();
                    return;
                }
            }
        }
        int i9 = this.E;
        for (int i10 = 0; i10 < i9; i10++) {
            File file = d7.c().get(i10);
            if (!z6 || d7.i()) {
                this.B.a(file);
            } else if (this.B.f(file)) {
                File file2 = d7.a().get(i10);
                this.B.g(file, file2);
                long j7 = d7.e()[i10];
                long h7 = this.B.h(file2);
                d7.e()[i10] = h7;
                this.f17548o = (this.f17548o - j7) + h7;
            }
        }
        d7.l(null);
        if (d7.i()) {
            W0(d7);
            return;
        }
        this.f17551r++;
        n nVar = this.f17549p;
        l0.m(nVar);
        if (!d7.g() && !z6) {
            this.f17550q.remove(d7.d());
            nVar.H0(O).e0(32);
            nVar.H0(d7.d());
            nVar.e0(10);
            nVar.flush();
            if (this.f17548o <= this.f17544k || E0()) {
                w5.c.p(this.f17559z, this.A, 0L, 2, null);
            }
        }
        d7.o(true);
        nVar.H0(M).e0(32);
        nVar.H0(d7.d());
        d7.s(nVar);
        nVar.e0(10);
        if (z6) {
            long j8 = this.f17558y;
            this.f17558y = 1 + j8;
            d7.p(j8);
        }
        nVar.flush();
        if (this.f17548o <= this.f17544k) {
        }
        w5.c.p(this.f17559z, this.A, 0L, 2, null);
    }

    public final n I0() throws FileNotFoundException {
        return a0.c(new u5.e(this.B.e(this.f17545l), new f()));
    }

    public final void L() throws IOException {
        close();
        this.B.d(this.C);
    }

    public final void M0() throws IOException {
        this.B.a(this.f17546m);
        Iterator<c> it = this.f17550q.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            l0.o(next, "i.next()");
            c cVar = next;
            int i7 = 0;
            if (cVar.b() == null) {
                int i8 = this.E;
                while (i7 < i8) {
                    this.f17548o += cVar.e()[i7];
                    i7++;
                }
            } else {
                cVar.l(null);
                int i9 = this.E;
                while (i7 < i9) {
                    this.B.a(cVar.a().get(i7));
                    this.B.a(cVar.c().get(i7));
                    i7++;
                }
                it.remove();
            }
        }
    }

    @i
    @n6.e
    public final b O(@n6.d String str) throws IOException {
        return R(this, str, 0L, 2, null);
    }

    public final void O0() throws IOException {
        i6.o d7 = a0.d(this.B.b(this.f17545l));
        try {
            String T = d7.T();
            String T2 = d7.T();
            String T3 = d7.T();
            String T4 = d7.T();
            String T5 = d7.T();
            if ((!l0.g(I, T)) == false && (!l0.g(J, T2)) == false && (!l0.g(String.valueOf(this.D), T3)) == false && (!l0.g(String.valueOf(this.E), T4)) == false) {
                int i7 = 0;
                if (!(T5.length() > 0)) {
                    while (true) {
                        try {
                            T0(d7.T());
                            i7++;
                        } catch (EOFException unused) {
                            this.f17551r = i7 - this.f17550q.size();
                            if (d7.c0()) {
                                this.f17549p = I0();
                            } else {
                                U0();
                            }
                            m2 m2Var = m2.f17815a;
                            n4.c.a(d7, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + T + ", " + T2 + ", " + T4 + ", " + T5 + ']');
        } finally {
        }
    }

    @i
    @n6.e
    public final synchronized b Q(@n6.d String str, long j7) throws IOException {
        l0.p(str, x2.f10960j);
        z0();
        E();
        d1(str);
        c cVar = this.f17550q.get(str);
        if (j7 == K || (cVar != null && cVar.h() == j7)) {
            if ((cVar != null ? cVar.b() : null) != null) {
                return null;
            }
            if (cVar == null || cVar.f() == 0) {
                if (!this.f17556w && !this.f17557x) {
                    n nVar = this.f17549p;
                    l0.m(nVar);
                    nVar.H0(N).e0(32).H0(str).e0(10);
                    nVar.flush();
                    if (this.f17552s) {
                        return null;
                    }
                    if (cVar == null) {
                        cVar = new c(this, str);
                        this.f17550q.put(str, cVar);
                    }
                    b bVar = new b(this, cVar);
                    cVar.l(bVar);
                    return bVar;
                }
                w5.c.p(this.f17559z, this.A, 0L, 2, null);
                return null;
            }
            return null;
        }
        return null;
    }

    public final synchronized void S() throws IOException {
        z0();
        Collection<c> values = this.f17550q.values();
        l0.o(values, "lruEntries.values");
        Object[] array = values.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (c cVar : (c[]) array) {
            l0.o(cVar, "entry");
            W0(cVar);
        }
        this.f17556w = false;
    }

    public final void T0(String str) throws IOException {
        String substring;
        int r32 = c0.r3(str, ' ', 0, false, 6, null);
        if (r32 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i7 = r32 + 1;
        int r33 = c0.r3(str, ' ', i7, false, 4, null);
        if (r33 == -1) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            substring = str.substring(i7);
            l0.o(substring, "(this as java.lang.String).substring(startIndex)");
            String str2 = O;
            if (r32 == str2.length() && b0.v2(str, str2, false, 2, null)) {
                this.f17550q.remove(substring);
                return;
            }
        } else if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else {
            substring = str.substring(i7, r33);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        c cVar = this.f17550q.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring);
            this.f17550q.put(substring, cVar);
        }
        if (r33 != -1) {
            String str3 = M;
            if (r32 == str3.length() && b0.v2(str, str3, false, 2, null)) {
                int i8 = r33 + 1;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring2 = str.substring(i8);
                l0.o(substring2, "(this as java.lang.String).substring(startIndex)");
                List<String> T4 = c0.T4(substring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(T4);
                return;
            }
        }
        if (r33 == -1) {
            String str4 = N;
            if (r32 == str4.length() && b0.v2(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (r33 == -1) {
            String str5 = P;
            if (r32 == str5.length() && b0.v2(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void U0() throws IOException {
        n nVar = this.f17549p;
        if (nVar != null) {
            nVar.close();
        }
        n c7 = a0.c(this.B.c(this.f17546m));
        c7.H0(I).e0(10);
        c7.H0(J).e0(10);
        c7.J0(this.D).e0(10);
        c7.J0(this.E).e0(10);
        c7.e0(10);
        for (c cVar : this.f17550q.values()) {
            if (cVar.b() != null) {
                c7.H0(N).e0(32);
                c7.H0(cVar.d());
                c7.e0(10);
            } else {
                c7.H0(M).e0(32);
                c7.H0(cVar.d());
                cVar.s(c7);
                c7.e0(10);
            }
        }
        m2 m2Var = m2.f17815a;
        n4.c.a(c7, null);
        if (this.B.f(this.f17545l)) {
            this.B.g(this.f17545l, this.f17547n);
        }
        this.B.g(this.f17546m, this.f17545l);
        this.B.a(this.f17547n);
        this.f17549p = I0();
        this.f17552s = false;
        this.f17557x = false;
    }

    public final synchronized boolean V0(@n6.d String str) throws IOException {
        l0.p(str, x2.f10960j);
        z0();
        E();
        d1(str);
        c cVar = this.f17550q.get(str);
        if (cVar != null) {
            l0.o(cVar, "lruEntries[key] ?: return false");
            boolean W0 = W0(cVar);
            if (W0 && this.f17548o <= this.f17544k) {
                this.f17556w = false;
            }
            return W0;
        }
        return false;
    }

    public final boolean W0(@n6.d c cVar) throws IOException {
        n nVar;
        l0.p(cVar, "entry");
        if (!this.f17553t) {
            if (cVar.f() > 0 && (nVar = this.f17549p) != null) {
                nVar.H0(N);
                nVar.e0(32);
                nVar.H0(cVar.d());
                nVar.e0(10);
                nVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b b7 = cVar.b();
        if (b7 != null) {
            b7.c();
        }
        int i7 = this.E;
        for (int i8 = 0; i8 < i7; i8++) {
            this.B.a(cVar.a().get(i8));
            this.f17548o -= cVar.e()[i8];
            cVar.e()[i8] = 0;
        }
        this.f17551r++;
        n nVar2 = this.f17549p;
        if (nVar2 != null) {
            nVar2.H0(O);
            nVar2.e0(32);
            nVar2.H0(cVar.d());
            nVar2.e0(10);
        }
        this.f17550q.remove(cVar.d());
        if (E0()) {
            w5.c.p(this.f17559z, this.A, 0L, 2, null);
        }
        return true;
    }

    @n6.e
    public final synchronized C0251d X(@n6.d String str) throws IOException {
        l0.p(str, x2.f10960j);
        z0();
        E();
        d1(str);
        c cVar = this.f17550q.get(str);
        if (cVar != null) {
            l0.o(cVar, "lruEntries[key] ?: return null");
            C0251d r6 = cVar.r();
            if (r6 != null) {
                this.f17551r++;
                n nVar = this.f17549p;
                l0.m(nVar);
                nVar.H0(P).e0(32).H0(str).e0(10);
                if (E0()) {
                    w5.c.p(this.f17559z, this.A, 0L, 2, null);
                }
                return r6;
            }
            return null;
        }
        return null;
    }

    public final boolean X0() {
        for (c cVar : this.f17550q.values()) {
            if (!cVar.i()) {
                l0.o(cVar, "toEvict");
                W0(cVar);
                return true;
            }
        }
        return false;
    }

    public final void Y0(boolean z6) {
        this.f17555v = z6;
    }

    public final boolean Z() {
        return this.f17555v;
    }

    public final synchronized void Z0(long j7) {
        this.f17544k = j7;
        if (this.f17554u) {
            w5.c.p(this.f17559z, this.A, 0L, 2, null);
        }
    }

    public final synchronized long a1() throws IOException {
        z0();
        return this.f17548o;
    }

    @n6.d
    public final synchronized Iterator<C0251d> b1() throws IOException {
        z0();
        return new g();
    }

    public final void c1() throws IOException {
        while (this.f17548o > this.f17544k) {
            if (!X0()) {
                return;
            }
        }
        this.f17556w = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b b7;
        if (this.f17554u && !this.f17555v) {
            Collection<c> values = this.f17550q.values();
            l0.o(values, "lruEntries.values");
            Object[] array = values.toArray(new c[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (c cVar : (c[]) array) {
                if (cVar.b() != null && (b7 = cVar.b()) != null) {
                    b7.c();
                }
            }
            c1();
            n nVar = this.f17549p;
            l0.m(nVar);
            nVar.close();
            this.f17549p = null;
            this.f17555v = true;
            return;
        }
        this.f17555v = true;
    }

    @n6.d
    public final File d0() {
        return this.C;
    }

    public final void d1(String str) {
        if (L.k(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + h0.f11093b).toString());
    }

    @n6.d
    public final b6.a f0() {
        return this.B;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f17554u) {
            E();
            c1();
            n nVar = this.f17549p;
            l0.m(nVar);
            nVar.flush();
        }
    }

    @n6.d
    public final LinkedHashMap<String, c> p0() {
        return this.f17550q;
    }

    public final synchronized long q0() {
        return this.f17544k;
    }

    public final int w0() {
        return this.E;
    }

    public final synchronized void z0() throws IOException {
        if (s5.d.f16658h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.f17554u) {
            return;
        }
        if (this.B.f(this.f17547n)) {
            if (this.B.f(this.f17545l)) {
                this.B.a(this.f17547n);
            } else {
                this.B.g(this.f17547n, this.f17545l);
            }
        }
        this.f17553t = s5.d.J(this.B, this.f17547n);
        if (this.B.f(this.f17545l)) {
            try {
                O0();
                M0();
                this.f17554u = true;
                return;
            } catch (IOException e7) {
                j.f8005e.g().m("DiskLruCache " + this.C + " is corrupt: " + e7.getMessage() + ", removing", 5, e7);
                L();
                this.f17555v = false;
            }
        }
        U0();
        this.f17554u = true;
    }
}
