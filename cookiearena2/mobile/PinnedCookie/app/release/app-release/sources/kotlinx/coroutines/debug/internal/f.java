package kotlinx.coroutines.debug.internal;

import f5.o;
import f5.q;
import f5.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import t4.p;
import u4.l0;
import v3.e1;
import v3.m2;
import x3.w;
/* loaded from: classes.dex */
public final class f {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final n f11904a;
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public final long f11905b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<e4.g> f11906c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public String f11907d = g.f11920a;
    @s4.e
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public Thread f11908e;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<h4.e> f11909f;

    @h4.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.k implements p<o<? super StackTraceElement>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f11910m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f11911n;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ n f11913p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f11913p = nVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f11913p, dVar);
            aVar.f11911n = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f11910m;
            if (i7 == 0) {
                e1.n(obj);
                o oVar = (o) this.f11911n;
                f fVar = f.this;
                h4.e v6 = this.f11913p.v();
                this.f11910m = 1;
                if (fVar.k(oVar, v6, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d o<? super StackTraceElement> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f11914n;

        /* renamed from: o  reason: collision with root package name */
        public Object f11915o;

        /* renamed from: p  reason: collision with root package name */
        public Object f11916p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f11917q;

        /* renamed from: s  reason: collision with root package name */
        public int f11919s;

        public b(e4.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f11917q = obj;
            this.f11919s |= Integer.MIN_VALUE;
            return f.this.k(null, null, this);
        }
    }

    public f(@n6.e e4.g gVar, @n6.e n nVar, long j7) {
        this.f11904a = nVar;
        this.f11905b = j7;
        this.f11906c = new WeakReference<>(gVar);
    }

    public final List<StackTraceElement> b() {
        n nVar = this.f11904a;
        return nVar == null ? w.E() : u.c3(q.b(new a(nVar, null)));
    }

    @n6.e
    public final e4.g c() {
        return this.f11906c.get();
    }

    @n6.e
    public final n d() {
        return this.f11904a;
    }

    @n6.d
    public final List<StackTraceElement> e() {
        return b();
    }

    @n6.e
    public final h4.e f() {
        WeakReference<h4.e> weakReference = this.f11909f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @n6.d
    public final String g() {
        return this.f11907d;
    }

    @n6.d
    public final List<StackTraceElement> h() {
        h4.e f7 = f();
        if (f7 == null) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList();
        while (f7 != null) {
            StackTraceElement k02 = f7.k0();
            if (k02 != null) {
                arrayList.add(k02);
            }
            f7 = f7.v();
        }
        return arrayList;
    }

    public final void i(@n6.e h4.e eVar) {
        this.f11909f = eVar != null ? new WeakReference<>(eVar) : null;
    }

    public final void j(@n6.d String str, @n6.d e4.d<?> dVar) {
        if (l0.g(this.f11907d, str) && l0.g(str, g.f11922c) && f() != null) {
            return;
        }
        this.f11907d = str;
        i(dVar instanceof h4.e ? (h4.e) dVar : null);
        this.f11908e = l0.g(str, g.f11921b) ? Thread.currentThread() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:25:0x0061). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005b -> B:24:0x005e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(f5.o<? super java.lang.StackTraceElement> r6, h4.e r7, e4.d<? super v3.m2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.f.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.f$b r0 = (kotlinx.coroutines.debug.internal.f.b) r0
            int r1 = r0.f11919s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11919s = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.f$b r0 = new kotlinx.coroutines.debug.internal.f$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11917q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f11919s
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f11916p
            h4.e r6 = (h4.e) r6
            java.lang.Object r7 = r0.f11915o
            f5.o r7 = (f5.o) r7
            java.lang.Object r2 = r0.f11914n
            kotlinx.coroutines.debug.internal.f r2 = (kotlinx.coroutines.debug.internal.f) r2
            v3.e1.n(r8)
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            v3.e1.n(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            v3.m2 r6 = v3.m2.f17815a
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.k0()
            if (r8 == 0) goto L61
            r0.f11914n = r2
            r0.f11915o = r6
            r0.f11916p = r7
            r0.f11919s = r3
            java.lang.Object r8 = r6.a(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            r4 = r7
            r7 = r6
            r6 = r4
        L61:
            h4.e r7 = r7.v()
            if (r7 == 0) goto L68
            goto L41
        L68:
            v3.m2 r6 = v3.m2.f17815a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.f.k(f5.o, h4.e, e4.d):java.lang.Object");
    }

    @n6.d
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
