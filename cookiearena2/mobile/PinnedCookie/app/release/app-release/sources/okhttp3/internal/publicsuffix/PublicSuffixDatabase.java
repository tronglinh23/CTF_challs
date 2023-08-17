package okhttp3.internal.publicsuffix;

import androidx.appcompat.widget.d;
import c6.j;
import f5.u;
import i5.c0;
import i6.a0;
import i6.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import n4.c;
import n6.e;
import u4.l0;
import u4.w;
import v3.m2;
import x3.e0;
import x3.v;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "e", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "Lv3/m2;", "h", "", "i", "domainLabels", d.f1513o, "g", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "c", "[B", "<init>", "()V", "j", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final String f14432e = "publicsuffixes.gz";

    /* renamed from: h  reason: collision with root package name */
    public static final char f14435h = '!';

    /* renamed from: a  reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean listRead = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name and from kotlin metadata */
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public byte[] publicSuffixListBytes;

    /* renamed from: d  reason: collision with root package name and from kotlin metadata */
    public byte[] publicSuffixExceptionListBytes;

    /* renamed from: j  reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f14433f = {(byte) 42};

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f14434g = v.k("*");

    /* renamed from: i  reason: collision with root package name */
    public static final PublicSuffixDatabase f14436i = new PublicSuffixDatabase();

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a  reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion() {
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i7) {
            int i8;
            boolean z6;
            int b7;
            int b8;
            int length = bArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = (i9 + length) / 2;
                while (i10 > -1 && bArr[i10] != ((byte) 10)) {
                    i10--;
                }
                int i11 = i10 + 1;
                int i12 = 1;
                while (true) {
                    i8 = i11 + i12;
                    if (bArr[i8] == ((byte) 10)) {
                        break;
                    }
                    i12++;
                }
                int i13 = i8 - i11;
                int i14 = i7;
                boolean z7 = false;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (z7) {
                        b7 = 46;
                        z6 = false;
                    } else {
                        z6 = z7;
                        b7 = s5.d.b(bArr2[i14][i15], 255);
                    }
                    b8 = b7 - s5.d.b(bArr[i11 + i16], 255);
                    if (b8 != 0) {
                        break;
                    }
                    i16++;
                    i15++;
                    if (i16 == i13) {
                        break;
                    } else if (bArr2[i14].length != i15) {
                        z7 = z6;
                    } else if (i14 == bArr2.length - 1) {
                        break;
                    } else {
                        i14++;
                        i15 = -1;
                        z7 = true;
                    }
                }
                if (b8 >= 0) {
                    if (b8 <= 0) {
                        int i17 = i13 - i16;
                        int length2 = bArr2[i14].length - i15;
                        int length3 = bArr2.length;
                        for (int i18 = i14 + 1; i18 < length3; i18++) {
                            length2 += bArr2[i18].length;
                        }
                        if (length2 >= i17) {
                            if (length2 <= i17) {
                                Charset charset = StandardCharsets.UTF_8;
                                l0.o(charset, "UTF_8");
                                return new String(bArr, i11, i13, charset);
                            }
                        }
                    }
                    i9 = i8 + 1;
                }
                length = i11 - 1;
            }
            return null;
        }

        @n6.d
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f14436i;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public static final /* synthetic */ byte[] b(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            l0.S("publicSuffixListBytes");
        }
        return bArr;
    }

    public final List<String> d(List<String> domainLabels) {
        String str;
        String str2;
        String str3;
        List<String> E;
        List<String> E2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            g();
        }
        if (this.publicSuffixListBytes != null) {
            int size = domainLabels.size();
            byte[][] bArr = new byte[size];
            for (int i7 = 0; i7 < size; i7++) {
                String str4 = domainLabels.get(i7);
                Charset charset = StandardCharsets.UTF_8;
                l0.o(charset, "UTF_8");
                if (str4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str4.getBytes(charset);
                l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i7] = bytes;
            }
            int i8 = 0;
            while (true) {
                str = null;
                if (i8 >= size) {
                    str2 = null;
                    break;
                }
                Companion companion = INSTANCE;
                byte[] bArr2 = this.publicSuffixListBytes;
                if (bArr2 == null) {
                    l0.S("publicSuffixListBytes");
                }
                str2 = companion.b(bArr2, bArr, i8);
                if (str2 != null) {
                    break;
                }
                i8++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i9 = 0; i9 < length; i9++) {
                    bArr3[i9] = f14433f;
                    Companion companion2 = INSTANCE;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        l0.S("publicSuffixListBytes");
                    }
                    String b7 = companion2.b(bArr4, bArr3, i9);
                    if (b7 != null) {
                        str3 = b7;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i10 = size - 1;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    Companion companion3 = INSTANCE;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        l0.S("publicSuffixExceptionListBytes");
                    }
                    String b8 = companion3.b(bArr5, bArr, i11);
                    if (b8 != null) {
                        str = b8;
                        break;
                    }
                    i11++;
                }
            }
            if (str != null) {
                return c0.T4(f14435h + str, new char[]{'.'}, false, 0, 6, null);
            } else if (str2 == null && str3 == null) {
                return f14434g;
            } else {
                if (str2 == null || (E = c0.T4(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
                    E = x3.w.E();
                }
                if (str3 == null || (E2 = c0.T4(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
                    E2 = x3.w.E();
                }
                return E.size() > E2.size() ? E : E2;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    @e
    public final String e(@n6.d String domain) {
        int size;
        int size2;
        l0.p(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        l0.o(unicode, "unicodeDomain");
        List<String> i7 = i(unicode);
        List<String> d7 = d(i7);
        if (i7.size() != d7.size() || d7.get(0).charAt(0) == '!') {
            if (d7.get(0).charAt(0) == '!') {
                size = i7.size();
                size2 = d7.size();
            } else {
                size = i7.size();
                size2 = d7.size() + 1;
            }
            return u.e1(u.k0(e0.v1(i(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public final void f() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(f14432e);
        if (resourceAsStream == null) {
            return;
        }
        o d7 = a0.d(new i6.v(a0.m(resourceAsStream)));
        try {
            byte[] h02 = d7.h0(d7.readInt());
            byte[] h03 = d7.h0(d7.readInt());
            m2 m2Var = m2.f17815a;
            c.a(d7, null);
            synchronized (this) {
                l0.m(h02);
                this.publicSuffixListBytes = h02;
                l0.m(h03);
                this.publicSuffixExceptionListBytes = h03;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    public final void g() {
        boolean z6 = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z6 = true;
                } catch (IOException e7) {
                    j.f8005e.g().m("Failed to read public suffix list", 5, e7);
                    if (z6) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public final void h(@n6.d byte[] bArr, @n6.d byte[] bArr2) {
        l0.p(bArr, "publicSuffixListBytes");
        l0.p(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    public final List<String> i(String domain) {
        List<String> T4 = c0.T4(domain, new char[]{'.'}, false, 0, 6, null);
        return l0.g((String) e0.k3(T4), "") ? e0.Y1(T4, 1) : T4;
    }
}
