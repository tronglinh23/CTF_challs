package androidx.emoji2.text;

import android.content.res.AssetManager;
import d.b1;
import d.g0;
import d.o0;
import d.w0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v3.h2;

@b1({b1.a.LIBRARY})
@d.d
@w0(19)
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4139a = 1164798569;

    /* renamed from: b  reason: collision with root package name */
    public static final int f4140b = 1701669481;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4141c = 1835365473;

    /* loaded from: classes.dex */
    public static class a implements d {
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final ByteBuffer f4142c;

        public a(@o0 ByteBuffer byteBuffer) {
            this.f4142c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.o.d
        public void a(int i7) throws IOException {
            ByteBuffer byteBuffer = this.f4142c;
            byteBuffer.position(byteBuffer.position() + i7);
        }

        @Override // androidx.emoji2.text.o.d
        public long b() throws IOException {
            return o.e(this.f4142c.getInt());
        }

        @Override // androidx.emoji2.text.o.d
        public int c() throws IOException {
            return this.f4142c.getInt();
        }

        @Override // androidx.emoji2.text.o.d
        public long d() {
            return this.f4142c.position();
        }

        @Override // androidx.emoji2.text.o.d
        public int readUnsignedShort() throws IOException {
            return o.f(this.f4142c.getShort());
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d {
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f4143c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final ByteBuffer f4144d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public final InputStream f4145e;

        /* renamed from: f  reason: collision with root package name */
        public long f4146f = 0;

        public b(@o0 InputStream inputStream) {
            this.f4145e = inputStream;
            byte[] bArr = new byte[4];
            this.f4143c = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f4144d = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.o.d
        public void a(int i7) throws IOException {
            while (i7 > 0) {
                int skip = (int) this.f4145e.skip(i7);
                if (skip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i7 -= skip;
                this.f4146f += skip;
            }
        }

        @Override // androidx.emoji2.text.o.d
        public long b() throws IOException {
            this.f4144d.position(0);
            e(4);
            return o.e(this.f4144d.getInt());
        }

        @Override // androidx.emoji2.text.o.d
        public int c() throws IOException {
            this.f4144d.position(0);
            e(4);
            return this.f4144d.getInt();
        }

        @Override // androidx.emoji2.text.o.d
        public long d() {
            return this.f4146f;
        }

        public final void e(@g0(from = 0, to = 4) int i7) throws IOException {
            if (this.f4145e.read(this.f4143c, 0, i7) != i7) {
                throw new IOException("read failed");
            }
            this.f4146f += i7;
        }

        @Override // androidx.emoji2.text.o.d
        public int readUnsignedShort() throws IOException {
            this.f4144d.position(0);
            e(2);
            return o.f(this.f4144d.getShort());
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f4147a;

        /* renamed from: b  reason: collision with root package name */
        public final long f4148b;

        public c(long j7, long j8) {
            this.f4147a = j7;
            this.f4148b = j8;
        }

        public long a() {
            return this.f4148b;
        }

        public long b() {
            return this.f4147a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f4149a = 2;

        /* renamed from: b  reason: collision with root package name */
        public static final int f4150b = 4;

        void a(int i7) throws IOException;

        long b() throws IOException;

        int c() throws IOException;

        long d();

        int readUnsignedShort() throws IOException;
    }

    public static c a(d dVar) throws IOException {
        long j7;
        dVar.a(4);
        int readUnsignedShort = dVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            dVar.a(6);
            int i7 = 0;
            while (true) {
                if (i7 >= readUnsignedShort) {
                    j7 = -1;
                    break;
                }
                int c7 = dVar.c();
                dVar.a(4);
                j7 = dVar.b();
                dVar.a(4);
                if (1835365473 == c7) {
                    break;
                }
                i7++;
            }
            if (j7 != -1) {
                dVar.a((int) (j7 - dVar.d()));
                dVar.a(12);
                long b7 = dVar.b();
                for (int i8 = 0; i8 < b7; i8++) {
                    int c8 = dVar.c();
                    long b8 = dVar.b();
                    long b9 = dVar.b();
                    if (1164798569 == c8 || 1701669481 == c8) {
                        return new c(b8 + j7, b9);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static v1.p b(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            v1.p c7 = c(open);
            if (open != null) {
                open.close();
            }
            return c7;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static v1.p c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c a7 = a(bVar);
        bVar.a((int) (a7.b() - bVar.d()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a7.a());
        int read = inputStream.read(allocate.array());
        if (read == a7.a()) {
            return v1.p.G(allocate);
        }
        throw new IOException("Needed " + a7.a() + " bytes, got " + read);
    }

    public static v1.p d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).b());
        return v1.p.G(duplicate);
    }

    public static long e(int i7) {
        return i7 & 4294967295L;
    }

    public static int f(short s6) {
        return s6 & h2.f17796n;
    }
}