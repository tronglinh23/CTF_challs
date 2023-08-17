package s5;

import d5.l;
import i5.c0;
import i5.f;
import i5.o;
import i6.d0;
import i6.m;
import i6.m0;
import i6.n;
import i6.o0;
import i6.p;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import r5.b0;
import r5.e0;
import r5.f0;
import r5.g0;
import r5.r;
import r5.u;
import r5.v;
import s4.e;
import s4.h;
import u4.i0;
import u4.l0;
import u4.t1;
import u4.u1;
import v3.m2;
import x3.a1;
import x3.s0;
import x3.w;
import x3.x;
@h(name = "Util")
/* loaded from: classes.dex */
public final class d {
    @n6.d
    @e

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f16651a;
    @n6.d
    @e

    /* renamed from: b  reason: collision with root package name */
    public static final u f16652b = u.f16045l.j(new String[0]);
    @n6.d
    @e

    /* renamed from: c  reason: collision with root package name */
    public static final g0 f16653c;
    @n6.d
    @e

    /* renamed from: d  reason: collision with root package name */
    public static final e0 f16654d;

    /* renamed from: e  reason: collision with root package name */
    public static final d0 f16655e;
    @n6.d
    @e

    /* renamed from: f  reason: collision with root package name */
    public static final TimeZone f16656f;

    /* renamed from: g  reason: collision with root package name */
    public static final o f16657g;
    @e

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f16658h;
    @n6.d
    @e

    /* renamed from: i  reason: collision with root package name */
    public static final String f16659i;
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public static final String f16660j = "okhttp/4.9.1";

    /* loaded from: classes.dex */
    public static final class a implements r.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f16661a;

        public a(r rVar) {
            this.f16661a = rVar;
        }

        @Override // r5.r.c
        @n6.d
        public final r a(@n6.d r5.e eVar) {
            l0.p(eVar, "it");
            return this.f16661a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16662a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f16663b;

        public b(String str, boolean z6) {
            this.f16662a = str;
            this.f16663b = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f16662a);
            thread.setDaemon(this.f16663b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f16651a = bArr;
        f16653c = g0.b.l(g0.f15882l, bArr, null, 1, null);
        f16654d = e0.a.r(e0.f15835a, bArr, null, 0, 0, 7, null);
        d0.a aVar = d0.f11169n;
        p.a aVar2 = p.f11252p;
        f16655e = aVar.d(aVar2.i("efbbbf"), aVar2.i("feff"), aVar2.i("fffe"), aVar2.i("0000ffff"), aVar2.i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        l0.m(timeZone);
        f16656f = timeZone;
        f16657g = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f16658h = false;
        String name = b0.class.getName();
        l0.o(name, "OkHttpClient::class.java.name");
        f16659i = c0.j4(c0.d4(name, "okhttp3."), "Client");
    }

    public static final int A(@n6.d String[] strArr, @n6.d String str, @n6.d Comparator<String> comparator) {
        l0.p(strArr, "$this$indexOf");
        l0.p(str, "value");
        l0.p(comparator, "comparator");
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (comparator.compare(strArr[i7], str) == 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int B(@n6.d String str) {
        l0.p(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int C(@n6.d String str, int i7, int i8) {
        l0.p(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static /* synthetic */ int D(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return C(str, i7, i8);
    }

    public static final int E(@n6.d String str, int i7, int i8) {
        l0.p(str, "$this$indexOfLastNonAsciiWhitespace");
        int i9 = i8 - 1;
        if (i9 >= i7) {
            while (true) {
                char charAt = str.charAt(i9);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i9 + 1;
                }
                if (i9 == i7) {
                    break;
                }
                i9--;
            }
        }
        return i7;
    }

    public static /* synthetic */ int F(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return E(str, i7, i8);
    }

    public static final int G(@n6.d String str, int i7) {
        l0.p(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\t') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    public static /* synthetic */ int H(String str, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        return G(str, i7);
    }

    @n6.d
    public static final String[] I(@n6.d String[] strArr, @n6.d String[] strArr2, @n6.d Comparator<? super String> comparator) {
        l0.p(strArr, "$this$intersect");
        l0.p(strArr2, "other");
        l0.p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i7]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i7++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean J(@n6.d b6.a aVar, @n6.d File file) {
        l0.p(aVar, "$this$isCivilized");
        l0.p(file, "file");
        m0 c7 = aVar.c(file);
        try {
            try {
                aVar.a(file);
                n4.c.a(c7, null);
                return true;
            } catch (IOException unused) {
                m2 m2Var = m2.f17815a;
                n4.c.a(c7, null);
                aVar.a(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n4.c.a(c7, th);
                throw th2;
            }
        }
    }

    public static final boolean K(@n6.d Socket socket, @n6.d i6.o oVar) {
        l0.p(socket, "$this$isHealthy");
        l0.p(oVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z6 = !oVar.c0();
                socket.setSoTimeout(soTimeout);
                return z6;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void L(@n6.d Object obj) {
        l0.p(obj, "$this$notify");
        obj.notify();
    }

    public static final void M(@n6.d Object obj) {
        l0.p(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    public static final int N(char c7) {
        if ('0' <= c7 && '9' >= c7) {
            return c7 - '0';
        }
        char c8 = 'a';
        if ('a' > c7 || 'f' < c7) {
            c8 = 'A';
            if ('A' > c7 || 'F' < c7) {
                return -1;
            }
        }
        return (c7 - c8) + 10;
    }

    @n6.d
    public static final String O(@n6.d Socket socket) {
        l0.p(socket, "$this$peerName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            l0.o(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    @n6.d
    public static final Charset P(@n6.d i6.o oVar, @n6.d Charset charset) throws IOException {
        l0.p(oVar, "$this$readBomAsCharset");
        l0.p(charset, "default");
        int g02 = oVar.g0(f16655e);
        if (g02 != -1) {
            if (g02 == 0) {
                Charset charset2 = StandardCharsets.UTF_8;
                l0.o(charset2, "UTF_8");
                return charset2;
            } else if (g02 == 1) {
                Charset charset3 = StandardCharsets.UTF_16BE;
                l0.o(charset3, "UTF_16BE");
                return charset3;
            } else if (g02 == 2) {
                Charset charset4 = StandardCharsets.UTF_16LE;
                l0.o(charset4, "UTF_16LE");
                return charset4;
            } else if (g02 != 3) {
                if (g02 == 4) {
                    return f.f11070a.c();
                }
                throw new AssertionError();
            } else {
                return f.f11070a.b();
            }
        }
        return charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        return r4;
     */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T Q(@n6.d java.lang.Object r5, @n6.d java.lang.Class<T> r6, @n6.d java.lang.String r7) {
        /*
            java.lang.String r0 = "instance"
            u4.l0.p(r5, r0)
            java.lang.String r0 = "fieldType"
            u4.l0.p(r6, r0)
            java.lang.String r0 = "fieldName"
            u4.l0.p(r7, r0)
            java.lang.Class r0 = r5.getClass()
        L13:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r2 = u4.l0.g(r0, r1)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L44
            java.lang.reflect.Field r1 = r0.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.String r2 = "field"
            u4.l0.o(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L3a
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.NoSuchFieldException -> L3a
            boolean r2 = r6.isInstance(r1)     // Catch: java.lang.NoSuchFieldException -> L3a
            if (r2 != 0) goto L35
            goto L39
        L35:
            java.lang.Object r4 = r6.cast(r1)     // Catch: java.lang.NoSuchFieldException -> L3a
        L39:
            return r4
        L3a:
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r1 = "c.superclass"
            u4.l0.o(r0, r1)
            goto L13
        L44:
            java.lang.String r0 = "delegate"
            boolean r2 = u4.l0.g(r7, r0)
            r2 = r2 ^ r3
            if (r2 == 0) goto L58
            java.lang.Object r5 = Q(r5, r1, r0)
            if (r5 == 0) goto L58
            java.lang.Object r5 = Q(r5, r6, r7)
            return r5
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.d.Q(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int R(@n6.d i6.o oVar) throws IOException {
        l0.p(oVar, "$this$readMedium");
        return b(oVar.readByte(), 255) | (b(oVar.readByte(), 255) << 16) | (b(oVar.readByte(), 255) << 8);
    }

    public static final int S(@n6.d m mVar, byte b7) {
        l0.p(mVar, "$this$skipAll");
        int i7 = 0;
        while (!mVar.c0() && mVar.Z(0L) == b7) {
            i7++;
            mVar.readByte();
        }
        return i7;
    }

    public static final boolean T(@n6.d o0 o0Var, int i7, @n6.d TimeUnit timeUnit) throws IOException {
        l0.p(o0Var, "$this$skipAll");
        l0.p(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long d7 = o0Var.c().f() ? o0Var.c().d() - nanoTime : Long.MAX_VALUE;
        o0Var.c().e(Math.min(d7, timeUnit.toNanos(i7)) + nanoTime);
        try {
            m mVar = new m();
            while (o0Var.l0(mVar, 8192L) != -1) {
                mVar.l();
            }
            if (d7 == Long.MAX_VALUE) {
                o0Var.c().a();
            } else {
                o0Var.c().e(nanoTime + d7);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (d7 == Long.MAX_VALUE) {
                o0Var.c().a();
            } else {
                o0Var.c().e(nanoTime + d7);
            }
            return false;
        } catch (Throwable th) {
            if (d7 == Long.MAX_VALUE) {
                o0Var.c().a();
            } else {
                o0Var.c().e(nanoTime + d7);
            }
            throw th;
        }
    }

    @n6.d
    public static final ThreadFactory U(@n6.d String str, boolean z6) {
        l0.p(str, "name");
        return new b(str, z6);
    }

    public static final void V(@n6.d String str, @n6.d t4.a<m2> aVar) {
        l0.p(str, "name");
        l0.p(aVar, "block");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.n();
        } finally {
            i0.d(1);
            currentThread.setName(name);
            i0.c(1);
        }
    }

    @n6.d
    public static final List<a6.c> W(@n6.d u uVar) {
        l0.p(uVar, "$this$toHeaderList");
        l W1 = d5.u.W1(0, uVar.size());
        ArrayList arrayList = new ArrayList(x.Y(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int b7 = ((s0) it).b();
            arrayList.add(new a6.c(uVar.i(b7), uVar.o(b7)));
        }
        return arrayList;
    }

    @n6.d
    public static final u X(@n6.d List<a6.c> list) {
        l0.p(list, "$this$toHeaders");
        u.a aVar = new u.a();
        for (a6.c cVar : list) {
            aVar.g(cVar.a().n0(), cVar.b().n0());
        }
        return aVar.i();
    }

    @n6.d
    public static final String Y(int i7) {
        String hexString = Integer.toHexString(i7);
        l0.o(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    @n6.d
    public static final String Z(long j7) {
        String hexString = Long.toHexString(j7);
        l0.o(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final <E> void a(@n6.d List<E> list, E e7) {
        l0.p(list, "$this$addIfAbsent");
        if (list.contains(e7)) {
            return;
        }
        list.add(e7);
    }

    @n6.d
    public static final String a0(@n6.d v vVar, boolean z6) {
        String F;
        l0.p(vVar, "$this$toHostHeader");
        if (c0.W2(vVar.F(), ":", false, 2, null)) {
            F = '[' + vVar.F() + ']';
        } else {
            F = vVar.F();
        }
        if (z6 || vVar.N() != v.f16060w.g(vVar.X())) {
            return F + ':' + vVar.N();
        }
        return F;
    }

    public static final int b(byte b7, int i7) {
        return b7 & i7;
    }

    public static /* synthetic */ String b0(v vVar, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return a0(vVar, z6);
    }

    public static final int c(short s6, int i7) {
        return s6 & i7;
    }

    @n6.d
    public static final <T> List<T> c0(@n6.d List<? extends T> list) {
        l0.p(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(x3.e0.T5(list));
        l0.o(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final long d(int i7, long j7) {
        return i7 & j7;
    }

    @n6.d
    public static final <K, V> Map<K, V> d0(@n6.d Map<K, ? extends V> map) {
        l0.p(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return a1.z();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        l0.o(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    @n6.d
    public static final r.c e(@n6.d r rVar) {
        l0.p(rVar, "$this$asFactory");
        return new a(rVar);
    }

    public static final long e0(@n6.d String str, long j7) {
        l0.p(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j7;
        }
    }

    public static final void f(@n6.d Object obj) {
        l0.p(obj, "$this$assertThreadDoesntHoldLock");
        if (f16658h && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final int f0(@n6.e String str, int i7) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i7;
    }

    public static final void g(@n6.d Object obj) {
        l0.p(obj, "$this$assertThreadHoldsLock");
        if (!f16658h || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(obj);
        throw new AssertionError(sb.toString());
    }

    @n6.d
    public static final String g0(@n6.d String str, int i7, int i8) {
        l0.p(str, "$this$trimSubstring");
        int C = C(str, i7, i8);
        String substring = str.substring(C, E(str, C, i8));
        l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean h(@n6.d String str) {
        l0.p(str, "$this$canParseAsIpAddress");
        return f16657g.k(str);
    }

    public static /* synthetic */ String h0(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return g0(str, i7, i8);
    }

    public static final boolean i(@n6.d v vVar, @n6.d v vVar2) {
        l0.p(vVar, "$this$canReuseConnectionFor");
        l0.p(vVar2, "other");
        return l0.g(vVar.F(), vVar2.F()) && vVar.N() == vVar2.N() && l0.g(vVar.X(), vVar2.X());
    }

    public static final void i0(@n6.d Object obj) {
        l0.p(obj, "$this$wait");
        obj.wait();
    }

    public static final int j(@n6.d String str, long j7, @n6.e TimeUnit timeUnit) {
        l0.p(str, "name");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        boolean z6 = true;
        if (!(i7 >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j7);
            if (!(millis <= ((long) Integer.MAX_VALUE))) {
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            if (millis == 0 && i7 > 0) {
                z6 = false;
            }
            if (z6) {
                return (int) millis;
            }
            throw new IllegalArgumentException((str + " too small.").toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    @n6.d
    public static final Throwable j0(@n6.d Exception exc, @n6.d List<? extends Exception> list) {
        l0.p(exc, "$this$withSuppressed");
        l0.p(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            v3.p.a(exc, it.next());
        }
        return exc;
    }

    public static final void k(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void k0(@n6.d n nVar, int i7) throws IOException {
        l0.p(nVar, "$this$writeMedium");
        nVar.e0((i7 >>> 16) & 255);
        nVar.e0((i7 >>> 8) & 255);
        nVar.e0(i7 & 255);
    }

    public static final void l(@n6.d Closeable closeable) {
        l0.p(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final void m(@n6.d ServerSocket serverSocket) {
        l0.p(serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final void n(@n6.d Socket socket) {
        l0.p(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (!l0.g(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    @n6.d
    public static final String[] o(@n6.d String[] strArr, @n6.d String str) {
        l0.p(strArr, "$this$concat");
        l0.p(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        l0.o(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[x3.p.Xe(strArr2)] = str;
        return strArr2;
    }

    public static final int p(@n6.d String str, char c7, int i7, int i8) {
        l0.p(str, "$this$delimiterOffset");
        while (i7 < i8) {
            if (str.charAt(i7) == c7) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int q(@n6.d String str, @n6.d String str2, int i7, int i8) {
        l0.p(str, "$this$delimiterOffset");
        l0.p(str2, "delimiters");
        while (i7 < i8) {
            if (c0.V2(str2, str.charAt(i7), false, 2, null)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static /* synthetic */ int r(String str, char c7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = str.length();
        }
        return p(str, c7, i7, i8);
    }

    public static /* synthetic */ int s(String str, String str2, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = str.length();
        }
        return q(str, str2, i7, i8);
    }

    public static final boolean t(@n6.d o0 o0Var, int i7, @n6.d TimeUnit timeUnit) {
        l0.p(o0Var, "$this$discard");
        l0.p(timeUnit, "timeUnit");
        try {
            return T(o0Var, i7, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @n6.d
    public static final <T> List<T> u(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(iterable, "$this$filterList");
        l0.p(lVar, "predicate");
        List<T> E = w.E();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.O(obj).booleanValue()) {
                if (E.isEmpty()) {
                    E = new ArrayList<>();
                }
                u1.g(E).add(obj);
            }
        }
        return E;
    }

    @n6.d
    public static final String v(@n6.d String str, @n6.d Object... objArr) {
        l0.p(str, "format");
        l0.p(objArr, "args");
        t1 t1Var = t1.f17486a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        l0.o(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean w(@n6.d String[] strArr, @n6.e String[] strArr2, @n6.d Comparator<? super String> comparator) {
        l0.p(strArr, "$this$hasIntersection");
        l0.p(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long x(@n6.d f0 f0Var) {
        l0.p(f0Var, "$this$headersContentLength");
        String d7 = f0Var.d0().d("Content-Length");
        if (d7 != null) {
            return e0(d7, -1L);
        }
        return -1L;
    }

    public static final void y(@n6.d t4.a<m2> aVar) {
        l0.p(aVar, "block");
        try {
            aVar.n();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @n6.d
    public static final <T> List<T> z(@n6.d T... tArr) {
        l0.p(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(w.L(Arrays.copyOf(objArr, objArr.length)));
        l0.o(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }
}
