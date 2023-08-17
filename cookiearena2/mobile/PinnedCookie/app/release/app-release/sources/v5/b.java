package v5;

import i6.m;
import i6.o0;
import i6.p;
import i6.q0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import n6.d;
import s4.e;
import u4.l0;
import u4.w;
import v3.m2;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k  reason: collision with root package name */
    public static final int f17848k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f17849l = 2;
    @d
    @e

    /* renamed from: m  reason: collision with root package name */
    public static final p f17850m;
    @d
    @e

    /* renamed from: n  reason: collision with root package name */
    public static final p f17851n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f17852o = 32;

    /* renamed from: p  reason: collision with root package name */
    public static final a f17853p = new a(null);
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public Thread f17854a;
    @d

    /* renamed from: b  reason: collision with root package name */
    public final m f17855b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17856c;
    @d

    /* renamed from: d  reason: collision with root package name */
    public final m f17857d;

    /* renamed from: e  reason: collision with root package name */
    public int f17858e;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public RandomAccessFile f17859f;
    @n6.e

    /* renamed from: g  reason: collision with root package name */
    public o0 f17860g;

    /* renamed from: h  reason: collision with root package name */
    public long f17861h;

    /* renamed from: i  reason: collision with root package name */
    public final p f17862i;

    /* renamed from: j  reason: collision with root package name */
    public final long f17863j;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @d
        public final b a(@d File file, @d o0 o0Var, @d p pVar, long j7) throws IOException {
            l0.p(file, "file");
            l0.p(o0Var, "upstream");
            l0.p(pVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            b bVar = new b(randomAccessFile, o0Var, 0L, pVar, j7, null);
            randomAccessFile.setLength(0L);
            bVar.u(b.f17851n, -1L, -1L);
            return bVar;
        }

        @d
        public final b b(@d File file) throws IOException {
            l0.p(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            l0.o(channel, "randomAccessFile.channel");
            v5.a aVar = new v5.a(channel);
            m mVar = new m();
            aVar.a(0L, mVar, 32L);
            p pVar = b.f17850m;
            if ((!l0.g(mVar.z(pVar.c0()), pVar)) == true) {
                throw new IOException("unreadable cache file");
            }
            long readLong = mVar.readLong();
            long readLong2 = mVar.readLong();
            m mVar2 = new m();
            aVar.a(readLong + 32, mVar2, readLong2);
            return new b(randomAccessFile, null, readLong, mVar2.x(), 0L, null);
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* renamed from: v5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0253b implements o0 {

        /* renamed from: k  reason: collision with root package name */
        public final q0 f17864k = new q0();

        /* renamed from: l  reason: collision with root package name */
        public v5.a f17865l;

        /* renamed from: m  reason: collision with root package name */
        public long f17866m;

        public C0253b() {
            RandomAccessFile f7 = b.this.f();
            l0.m(f7);
            FileChannel channel = f7.getChannel();
            l0.o(channel, "file!!.channel");
            this.f17865l = new v5.a(channel);
        }

        @Override // i6.o0
        @d
        public q0 c() {
            return this.f17864k;
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f17865l == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f17865l = null;
            synchronized (b.this) {
                b.this.q(r2.g() - 1);
                if (b.this.g() == 0) {
                    RandomAccessFile f7 = b.this.f();
                    b.this.p(null);
                    randomAccessFile = f7;
                }
                m2 m2Var = m2.f17815a;
            }
            if (randomAccessFile != null) {
                s5.d.l(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
            if (r4 != true) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
            r8 = java.lang.Math.min(r21, r19.f17867n.j() - r19.f17866m);
            r2 = r19.f17865l;
            u4.l0.m(r2);
            r2.a(r19.f17866m + 32, r20, r8);
            r19.f17866m += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
            r0 = r19.f17867n.h();
            u4.l0.m(r0);
            r14 = r0.l0(r19.f17867n.i(), r19.f17867n.d());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
            if (r14 != (-1)) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
            r0 = r19.f17867n;
            r0.b(r0.j());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
            r2 = r19.f17867n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
            r19.f17867n.t(null);
            r0 = r19.f17867n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
            if (r0 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
            r0.notifyAll();
            r0 = v3.m2.f17815a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f3, code lost:
            r9 = java.lang.Math.min(r14, r21);
            r19.f17867n.i().A(r20, 0, r9);
            r19.f17866m += r9;
            r13 = r19.f17865l;
            u4.l0.m(r13);
            r13.b(r19.f17867n.j() + 32, r19.f17867n.i().clone(), r14);
            r2 = r19.f17867n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
            r19.f17867n.c().w(r19.f17867n.i(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
            if (r19.f17867n.c().a1() <= r19.f17867n.d()) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
            r19.f17867n.c().skip(r19.f17867n.c().a1() - r19.f17867n.d());
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
            r0 = r19.f17867n;
            r0.s(r0.j() + r14);
            r0 = v3.m2.f17815a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0175, code lost:
            r2 = r19.f17867n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
            r19.f17867n.t(null);
            r0 = r19.f17867n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
            if (r0 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0181, code lost:
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0184, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0185, code lost:
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0194, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
            monitor-enter(r19.f17867n);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0198, code lost:
            r19.f17867n.t(null);
            r3 = r19.f17867n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
            if (r3 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
            r3.notifyAll();
            r3 = v3.m2.f17815a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01af, code lost:
            throw r0;
         */
        @Override // i6.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long l0(@n6.d i6.m r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.b.C0253b.l0(i6.m, long):long");
        }
    }

    static {
        p.a aVar = p.f11252p;
        f17850m = aVar.l("OkHttp cache v1\n");
        f17851n = aVar.l("OkHttp DIRTY :(\n");
    }

    public b(RandomAccessFile randomAccessFile, o0 o0Var, long j7, p pVar, long j8) {
        this.f17859f = randomAccessFile;
        this.f17860g = o0Var;
        this.f17861h = j7;
        this.f17862i = pVar;
        this.f17863j = j8;
        this.f17855b = new m();
        this.f17856c = this.f17860g == null;
        this.f17857d = new m();
    }

    public final void b(long j7) throws IOException {
        v(j7);
        RandomAccessFile randomAccessFile = this.f17859f;
        l0.m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        u(f17850m, j7, this.f17862i.c0());
        RandomAccessFile randomAccessFile2 = this.f17859f;
        l0.m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f17856c = true;
            m2 m2Var = m2.f17815a;
        }
        o0 o0Var = this.f17860g;
        if (o0Var != null) {
            s5.d.l(o0Var);
        }
        this.f17860g = null;
    }

    @d
    public final m c() {
        return this.f17857d;
    }

    public final long d() {
        return this.f17863j;
    }

    public final boolean e() {
        return this.f17856c;
    }

    @n6.e
    public final RandomAccessFile f() {
        return this.f17859f;
    }

    public final int g() {
        return this.f17858e;
    }

    @n6.e
    public final o0 h() {
        return this.f17860g;
    }

    @d
    public final m i() {
        return this.f17855b;
    }

    public final long j() {
        return this.f17861h;
    }

    @n6.e
    public final Thread k() {
        return this.f17854a;
    }

    public final boolean l() {
        return this.f17859f == null;
    }

    @d
    public final p m() {
        return this.f17862i;
    }

    @n6.e
    public final o0 n() {
        synchronized (this) {
            if (this.f17859f == null) {
                return null;
            }
            this.f17858e++;
            return new C0253b();
        }
    }

    public final void o(boolean z6) {
        this.f17856c = z6;
    }

    public final void p(@n6.e RandomAccessFile randomAccessFile) {
        this.f17859f = randomAccessFile;
    }

    public final void q(int i7) {
        this.f17858e = i7;
    }

    public final void r(@n6.e o0 o0Var) {
        this.f17860g = o0Var;
    }

    public final void s(long j7) {
        this.f17861h = j7;
    }

    public final void t(@n6.e Thread thread) {
        this.f17854a = thread;
    }

    public final void u(p pVar, long j7, long j8) throws IOException {
        m mVar = new m();
        mVar.K(pVar);
        mVar.F0(j7);
        mVar.F0(j8);
        if (!(mVar.a1() == 32)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.f17859f;
        l0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l0.o(channel, "file!!.channel");
        new v5.a(channel).b(0L, mVar, 32L);
    }

    public final void v(long j7) throws IOException {
        m mVar = new m();
        mVar.K(this.f17862i);
        RandomAccessFile randomAccessFile = this.f17859f;
        l0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l0.o(channel, "file!!.channel");
        new v5.a(channel).b(32 + j7, mVar, this.f17862i.c0());
    }

    public /* synthetic */ b(RandomAccessFile randomAccessFile, o0 o0Var, long j7, p pVar, long j8, w wVar) {
        this(randomAccessFile, o0Var, j7, pVar, j8);
    }
}
