package kotlinx.coroutines.debug.internal;

import f5.u;
import i5.b0;
import i5.h0;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.v2;
import t4.p;
import u4.i0;
import u4.l0;
import u4.n0;
import u4.u1;
import v3.a0;
import v3.d1;
import v3.e1;
import v3.m2;
import v3.q1;
import v3.u0;
import x3.e0;
import x3.x;
import x3.z0;
/* loaded from: classes.dex */
public final class h {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final h f11923a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f11924b = "Coroutine creation stacktrace";
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f11925c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public static Thread f11926d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final kotlinx.coroutines.debug.internal.c<a<?>, Boolean> f11927e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ i f11928f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11929g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantReadWriteLock f11930h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f11931i;
    private static volatile int installations;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f11932j;
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public static final t4.l<Boolean, m2> f11933k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final kotlinx.coroutines.debug.internal.c<h4.e, kotlinx.coroutines.debug.internal.f> f11934l;

    /* loaded from: classes.dex */
    public static final class a<T> implements e4.d<T>, h4.e {
        @n6.d
        @s4.e

        /* renamed from: k  reason: collision with root package name */
        public final e4.d<T> f11935k;
        @n6.d
        @s4.e

        /* renamed from: l  reason: collision with root package name */
        public final kotlinx.coroutines.debug.internal.f f11936l;
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public final h4.e f11937m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@n6.d e4.d<? super T> dVar, @n6.d kotlinx.coroutines.debug.internal.f fVar, @n6.e h4.e eVar) {
            this.f11935k = dVar;
            this.f11936l = fVar;
            this.f11937m = eVar;
        }

        @Override // e4.d
        public void D(@n6.d Object obj) {
            h.f11923a.E(this);
            this.f11935k.D(obj);
        }

        @Override // e4.d
        @n6.d
        public e4.g g() {
            return this.f11935k.g();
        }

        @Override // h4.e
        @n6.e
        public StackTraceElement k0() {
            h4.e eVar = this.f11937m;
            if (eVar != null) {
                return eVar.k0();
            }
            return null;
        }

        @n6.d
        public String toString() {
            return this.f11935k.toString();
        }

        @Override // h4.e
        @n6.e
        public h4.e v() {
            h4.e eVar = this.f11937m;
            if (eVar != null) {
                return eVar.v();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.l<a<?>, kotlinx.coroutines.debug.internal.e> {
        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.debug.internal.e O(@n6.d a<?> aVar) {
            e4.g c7;
            if (h.f11923a.y(aVar) || (c7 = aVar.f11936l.c()) == null) {
                return null;
            }
            return new kotlinx.coroutines.debug.internal.e(aVar.f11936l, c7);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public static final class c<R> extends n0 implements t4.l<a<?>, R> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ p<a<?>, e4.g, R> f11938l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p<? super a<?>, ? super e4.g, ? extends R> pVar) {
            super(1);
            this.f11938l = pVar;
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final R O(@n6.d a<?> aVar) {
            e4.g c7;
            if (h.f11923a.y(aVar) || (c7 = aVar.f11936l.c()) == null) {
                return null;
            }
            return this.f11938l.J(aVar, c7);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            return b4.g.l(Long.valueOf(((a) t6).f11936l.f11905b), Long.valueOf(((a) t7).f11936l.f11905b));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.l<a<?>, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final e f11939l = new e();

        public e() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d a<?> aVar) {
            return Boolean.valueOf(!h.f11923a.y(aVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            return b4.g.l(Long.valueOf(((a) t6).f11936l.f11905b), Long.valueOf(((a) t7).f11936l.f11905b));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends n0 implements t4.l<a<?>, k> {
        public g() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k O(@n6.d a<?> aVar) {
            e4.g c7;
            if (h.f11923a.y(aVar) || (c7 = aVar.f11936l.c()) == null) {
                return null;
            }
            return new k(aVar.f11936l, c7);
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0145h extends n0 implements t4.a<m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final C0145h f11940l = new C0145h();

        public C0145h() {
            super(0);
        }

        public final void b() {
            h.f11934l.m();
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            b();
            return m2.f17815a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.debug.internal.i] */
    static {
        h hVar = new h();
        f11923a = hVar;
        f11925c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f11927e = new kotlinx.coroutines.debug.internal.c<>(false, 1, null);
        final long j7 = 0;
        f11928f = new Object(j7) { // from class: kotlinx.coroutines.debug.internal.i
            volatile long sequenceNumber;

            {
                this.sequenceNumber = j7;
            }
        };
        f11930h = new ReentrantReadWriteLock();
        f11931i = true;
        f11932j = true;
        f11933k = hVar.t();
        f11934l = new kotlinx.coroutines.debug.internal.c<>(true);
        f11929g = AtomicLongFieldUpdater.newUpdater(i.class, "sequenceNumber");
    }

    public static /* synthetic */ void s(n2 n2Var) {
    }

    public final boolean A(StackTraceElement stackTraceElement) {
        return b0.v2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    public final a<?> B(e4.d<?> dVar) {
        h4.e eVar = dVar instanceof h4.e ? (h4.e) dVar : null;
        if (eVar != null) {
            return C(eVar);
        }
        return null;
    }

    public final a<?> C(h4.e eVar) {
        while (!(eVar instanceof a)) {
            eVar = eVar.v();
            if (eVar == null) {
                return null;
            }
        }
        return (a) eVar;
    }

    public final void D(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    public final void E(a<?> aVar) {
        h4.e I;
        f11927e.remove(aVar);
        h4.e f7 = aVar.f11936l.f();
        if (f7 == null || (I = I(f7)) == null) {
            return;
        }
        f11934l.remove(I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public final <T> e4.d<T> F(@n6.d e4.d<? super T> dVar) {
        if (z() && B(dVar) == null) {
            return e(dVar, f11932j ? O(J(new Exception())) : null);
        }
        return dVar;
    }

    public final void G(@n6.d e4.d<?> dVar) {
        S(dVar, kotlinx.coroutines.debug.internal.g.f11921b);
    }

    public final void H(@n6.d e4.d<?> dVar) {
        S(dVar, kotlinx.coroutines.debug.internal.g.f11922c);
    }

    public final h4.e I(h4.e eVar) {
        do {
            eVar = eVar.v();
            if (eVar == null) {
                return null;
            }
        } while (eVar.k0() == null);
        return eVar;
    }

    public final <T extends Throwable> List<StackTraceElement> J(T t6) {
        StackTraceElement[] stackTrace = t6.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i8 = length2 - 1;
                if (l0.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i7 = length2;
                    break;
                } else if (i8 < 0) {
                    break;
                } else {
                    length2 = i8;
                }
            }
        }
        if (!f11931i) {
            int i9 = length - i7;
            ArrayList arrayList = new ArrayList(i9);
            int i10 = 0;
            while (i10 < i9) {
                arrayList.add(i10 == 0 ? q0.d(f11924b) : stackTrace[i10 + i7]);
                i10++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i7) + 1);
        arrayList2.add(q0.d(f11924b));
        while (true) {
            i7++;
            while (i7 < length) {
                if (A(stackTrace[i7])) {
                    arrayList2.add(stackTrace[i7]);
                    int i11 = i7 + 1;
                    while (i11 < length && A(stackTrace[i11])) {
                        i11++;
                    }
                    int i12 = i11 - 1;
                    int i13 = i12;
                    while (i13 > i7 && stackTrace[i13].getFileName() == null) {
                        i13--;
                    }
                    if (i13 > i7 && i13 < i12) {
                        arrayList2.add(stackTrace[i13]);
                    }
                    arrayList2.add(stackTrace[i12]);
                    i7 = i11;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i7]);
        }
    }

    public final void K(boolean z6) {
        f11932j = z6;
    }

    public final void L(boolean z6) {
        f11931i = z6;
    }

    public final void M() {
        f11926d = c4.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, C0145h.f11940l, 21, null);
    }

    public final void N() {
        Thread thread = f11926d;
        if (thread == null) {
            return;
        }
        f11926d = null;
        thread.interrupt();
        thread.join();
    }

    public final n O(List<StackTraceElement> list) {
        n nVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                nVar = new n(nVar, listIterator.previous());
            }
        }
        return nVar;
    }

    public final String P(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(h0.f11093b);
        sb.append(obj);
        sb.append(h0.f11093b);
        return sb.toString();
    }

    public final void Q() {
        ReentrantReadWriteLock reentrantReadWriteLock = f11930h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f11923a;
            if (!hVar.z()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                return;
            }
            hVar.N();
            f11927e.clear();
            f11934l.clear();
            if (kotlinx.coroutines.debug.internal.a.f11869a.a()) {
                while (i7 < readHoldCount) {
                    readLock.lock();
                    i7++;
                }
                writeLock.unlock();
                return;
            }
            t4.l<Boolean, m2> lVar = f11933k;
            if (lVar != null) {
                lVar.O(Boolean.FALSE);
            }
            m2 m2Var = m2.f17815a;
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        } finally {
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    public final void R(h4.e eVar, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f11930h.readLock();
        readLock.lock();
        try {
            h hVar = f11923a;
            if (hVar.z()) {
                kotlinx.coroutines.debug.internal.c<h4.e, kotlinx.coroutines.debug.internal.f> cVar = f11934l;
                kotlinx.coroutines.debug.internal.f remove = cVar.remove(eVar);
                if (remove == null) {
                    a<?> C = hVar.C(eVar);
                    if (C != null && (remove = C.f11936l) != null) {
                        h4.e f7 = remove.f();
                        h4.e I = f7 != null ? hVar.I(f7) : null;
                        if (I != null) {
                            cVar.remove(I);
                        }
                    }
                    return;
                }
                remove.j(str, (e4.d) eVar);
                h4.e I2 = hVar.I(eVar);
                if (I2 == null) {
                    return;
                }
                cVar.put(I2, remove);
                m2 m2Var = m2.f17815a;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void S(e4.d<?> dVar, String str) {
        if (z()) {
            if (l0.g(str, kotlinx.coroutines.debug.internal.g.f11921b) && a0.f17760q.j(1, 3, 30)) {
                h4.e eVar = dVar instanceof h4.e ? (h4.e) dVar : null;
                if (eVar == null) {
                    return;
                }
                R(eVar, str);
                return;
            }
            a<?> B = B(dVar);
            if (B == null) {
                return;
            }
            T(B, dVar, str);
        }
    }

    public final void T(a<?> aVar, e4.d<?> dVar, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f11930h.readLock();
        readLock.lock();
        try {
            if (f11923a.z()) {
                aVar.f11936l.j(str, dVar);
                m2 m2Var = m2.f17815a;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void d(n2 n2Var, Map<n2, kotlinx.coroutines.debug.internal.f> map, StringBuilder sb, String str) {
        kotlinx.coroutines.debug.internal.f fVar = map.get(n2Var);
        if (fVar != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) e0.B2(fVar.h());
            sb.append(str + r(n2Var) + ", continuation is " + fVar.g() + " at line " + stackTraceElement + '\n');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('\t');
            str = sb2.toString();
        } else if (!(n2Var instanceof kotlinx.coroutines.internal.n0)) {
            sb.append(str + r(n2Var) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        Iterator<n2> it = n2Var.Q().iterator();
        while (it.hasNext()) {
            d(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> e4.d<T> e(e4.d<? super T> dVar, n nVar) {
        if (z()) {
            a<?> aVar = new a<>(dVar, new kotlinx.coroutines.debug.internal.f(dVar.g(), nVar, f11929g.incrementAndGet(f11928f)), nVar);
            kotlinx.coroutines.debug.internal.c<a<?>, Boolean> cVar = f11927e;
            cVar.put(aVar, Boolean.TRUE);
            if (!z()) {
                cVar.clear();
            }
            return aVar;
        }
        return dVar;
    }

    public final void f(@n6.d PrintStream printStream) {
        synchronized (printStream) {
            f11923a.j(printStream);
            m2 m2Var = m2.f17815a;
        }
    }

    @n6.d
    public final List<kotlinx.coroutines.debug.internal.e> g() {
        ReentrantReadWriteLock reentrantReadWriteLock = f11930h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f11923a;
            if (hVar.z()) {
                return u.c3(u.p1(u.K2(e0.v1(hVar.q()), new d()), new b()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    @n6.d
    public final Object[] h() {
        String Y0;
        List<kotlinx.coroutines.debug.internal.e> g7 = g();
        int size = g7.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.e eVar : g7) {
            e4.g a7 = eVar.a();
            t0 t0Var = (t0) a7.e(t0.f13111m);
            Long l7 = null;
            String P = (t0Var == null || (Y0 = t0Var.Y0()) == null) ? null : P(Y0);
            o0 o0Var = (o0) a7.e(o0.f12924l);
            String P2 = o0Var != null ? P(o0Var) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(P);
            sb.append(",\n                    \"id\": ");
            s0 s0Var = (s0) a7.e(s0.f12944m);
            if (s0Var != null) {
                l7 = Long.valueOf(s0Var.Y0());
            }
            sb.append(l7);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(P2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(eVar.f());
            sb.append(",\n                    \"state\": \"");
            sb.append(eVar.g());
            sb.append("\"\n                } \n                ");
            arrayList3.add(i5.u.p(sb.toString()));
            arrayList2.add(eVar.d());
            arrayList.add(eVar.e());
        }
        Object[] objArr = new Object[4];
        objArr[0] = '[' + e0.h3(arrayList3, null, null, null, 0, null, null, 63, null) + ']';
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array != null) {
            objArr[1] = array;
            Object[] array2 = arrayList2.toArray(new h4.e[0]);
            if (array2 != null) {
                objArr[2] = array2;
                Object[] array3 = g7.toArray(new kotlinx.coroutines.debug.internal.e[0]);
                if (array3 != null) {
                    objArr[3] = array3;
                    return objArr;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final <R> List<R> i(p<? super a<?>, ? super e4.g, ? extends R> pVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = f11930h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f11923a;
            if (hVar.z()) {
                return u.c3(u.p1(u.K2(e0.v1(hVar.q()), new d()), new c(pVar)));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            i0.d(1);
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
            i0.c(1);
        }
    }

    public final void j(PrintStream printStream) {
        ReentrantReadWriteLock reentrantReadWriteLock = f11930h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f11923a;
            if (!hVar.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            printStream.print("Coroutines dump " + f11925c.format(Long.valueOf(System.currentTimeMillis())));
            for (a aVar : u.K2(u.p0(e0.v1(hVar.q()), e.f11939l), new f())) {
                kotlinx.coroutines.debug.internal.f fVar = aVar.f11936l;
                List<StackTraceElement> h7 = fVar.h();
                h hVar2 = f11923a;
                List<StackTraceElement> n7 = hVar2.n(fVar.g(), fVar.f11908e, h7);
                printStream.print("\n\nCoroutine " + aVar.f11935k + ", state: " + ((l0.g(fVar.g(), kotlinx.coroutines.debug.internal.g.f11921b) && n7 == h7) ? fVar.g() + " (Last suspension stacktrace, not an actual stacktrace)" : fVar.g()));
                if (h7.isEmpty()) {
                    printStream.print("\n\tat " + q0.d(f11924b));
                    hVar2.D(printStream, fVar.e());
                } else {
                    hVar2.D(printStream, n7);
                }
            }
            m2 m2Var = m2.f17815a;
        } finally {
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    @n6.d
    public final List<k> k() {
        ReentrantReadWriteLock reentrantReadWriteLock = f11930h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f11923a;
            if (hVar.z()) {
                return u.c3(u.p1(u.K2(e0.v1(hVar.q()), new d()), new g()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    @n6.d
    public final List<StackTraceElement> l(@n6.d kotlinx.coroutines.debug.internal.e eVar, @n6.d List<StackTraceElement> list) {
        return n(eVar.g(), eVar.e(), list);
    }

    @n6.d
    public final String m(@n6.d kotlinx.coroutines.debug.internal.e eVar) {
        List<StackTraceElement> l7 = l(eVar, eVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l7) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? P(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(i5.u.p(sb.toString()));
        }
        return '[' + e0.h3(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    public final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object b7;
        if (!l0.g(str, kotlinx.coroutines.debug.internal.g.f11921b) || thread == null) {
            return list;
        }
        try {
            d1.a aVar = d1.f17778l;
            b7 = d1.b(thread.getStackTrace());
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            b7 = d1.b(e1.a(th));
        }
        if (d1.i(b7)) {
            b7 = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b7;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i7];
            if (l0.g(stackTraceElement.getClassName(), q0.f12839a) && l0.g(stackTraceElement.getMethodName(), "resumeWith") && l0.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i7++;
        }
        u0<Integer, Integer> o6 = o(i7, stackTraceElementArr, list);
        int intValue = o6.a().intValue();
        int intValue2 = o6.b().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i7) - intValue) - 1) - intValue2);
        int i8 = i7 - intValue2;
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(stackTraceElementArr[i9]);
        }
        int size = list.size();
        for (int i10 = intValue + 1; i10 < size; i10++) {
            arrayList.add(list.get(i10));
        }
        return arrayList;
    }

    public final u0<Integer, Integer> o(int i7, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i8 = 0; i8 < 3; i8++) {
            int p6 = f11923a.p((i7 - 1) - i8, stackTraceElementArr, list);
            if (p6 != -1) {
                return q1.a(Integer.valueOf(p6), Integer.valueOf(i8));
            }
        }
        return q1.a(-1, 0);
    }

    public final int p(int i7, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) x3.p.qf(stackTraceElementArr, i7);
        if (stackTraceElement == null) {
            return -1;
        }
        int i8 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (l0.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && l0.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && l0.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public final Set<a<?>> q() {
        return f11927e.keySet();
    }

    public final String r(n2 n2Var) {
        return n2Var instanceof v2 ? ((v2) n2Var).B1() : n2Var.toString();
    }

    public final t4.l<Boolean, m2> t() {
        Object b7;
        Object newInstance;
        try {
            d1.a aVar = d1.f17778l;
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            b7 = d1.b(e1.a(th));
        }
        if (newInstance != null) {
            b7 = d1.b((t4.l) u1.q(newInstance, 1));
            if (d1.i(b7)) {
                b7 = null;
            }
            return (t4.l) b7;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
    }

    public final boolean u() {
        return f11932j;
    }

    public final boolean v() {
        return f11931i;
    }

    @n6.d
    public final String w(@n6.d n2 n2Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = f11930h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f11923a;
            if (hVar.z()) {
                Set<a<?>> q6 = hVar.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj : q6) {
                    if (((a) obj).f11935k.g().e(n2.f12920c) != null) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(x.Y(arrayList, 10)), 16));
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(r2.B(((a) obj2).f11935k.g()), ((a) obj2).f11936l);
                }
                StringBuilder sb = new StringBuilder();
                f11923a.d(n2Var, linkedHashMap, sb, "");
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    public final void x() {
        ReentrantReadWriteLock reentrantReadWriteLock = f11930h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                return;
            }
            f11923a.M();
            if (kotlinx.coroutines.debug.internal.a.f11869a.a()) {
                while (i7 < readHoldCount) {
                    readLock.lock();
                    i7++;
                }
                writeLock.unlock();
                return;
            }
            t4.l<Boolean, m2> lVar = f11933k;
            if (lVar != null) {
                lVar.O(Boolean.TRUE);
            }
            m2 m2Var = m2.f17815a;
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        } finally {
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
        }
    }

    public final boolean y(a<?> aVar) {
        n2 n2Var;
        e4.g c7 = aVar.f11936l.c();
        if (c7 == null || (n2Var = (n2) c7.e(n2.f12920c)) == null || !n2Var.l()) {
            return false;
        }
        f11927e.remove(aVar);
        return true;
    }

    public final boolean z() {
        return installations > 0;
    }
}
