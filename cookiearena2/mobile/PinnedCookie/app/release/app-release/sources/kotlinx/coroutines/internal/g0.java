package kotlinx.coroutines.internal;

import kotlinx.coroutines.p1;
import kotlinx.coroutines.z2;
import v3.m2;
/* loaded from: classes.dex */
public final class g0 extends z2 implements kotlinx.coroutines.e1 {
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public final Throwable f12806m;
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public final String f12807n;

    public /* synthetic */ g0(Throwable th, String str, int i7, u4.w wVar) {
        this(th, (i7 & 2) != 0 ? null : str);
    }

    @Override // kotlinx.coroutines.e1
    @n6.e
    public Object O0(long j7, @n6.d e4.d<?> dVar) {
        d1();
        throw new v3.y();
    }

    @Override // kotlinx.coroutines.o0
    public boolean X0(@n6.d e4.g gVar) {
        d1();
        throw new v3.y();
    }

    @Override // kotlinx.coroutines.z2, kotlinx.coroutines.o0
    @n6.d
    public kotlinx.coroutines.o0 Y0(int i7) {
        d1();
        throw new v3.y();
    }

    @Override // kotlinx.coroutines.z2
    @n6.d
    public z2 a1() {
        return this;
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    /* renamed from: c1  reason: merged with bridge method [inline-methods] */
    public Void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        d1();
        throw new v3.y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void d1() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f12806m
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f12807n
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f12806m
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.f0.e()
            v3.y r0 = new v3.y
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g0.d1():java.lang.Void");
    }

    @Override // kotlinx.coroutines.e1
    @n6.d
    /* renamed from: e1  reason: merged with bridge method [inline-methods] */
    public Void m(long j7, @n6.d kotlinx.coroutines.q<? super m2> qVar) {
        d1();
        throw new v3.y();
    }

    @Override // kotlinx.coroutines.z2, kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f12806m != null) {
            str = ", cause=" + this.f12806m;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.e1
    @n6.d
    public p1 z0(long j7, @n6.d Runnable runnable, @n6.d e4.g gVar) {
        d1();
        throw new v3.y();
    }

    public g0(@n6.e Throwable th, @n6.e String str) {
        this.f12806m = th;
        this.f12807n = str;
    }
}
