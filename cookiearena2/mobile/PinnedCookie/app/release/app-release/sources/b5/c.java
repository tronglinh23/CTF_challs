package b5;

import java.util.Random;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class c extends Random {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f7253m = new a(null);

    /* renamed from: n  reason: collision with root package name */
    public static final long f7254n = 0;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final f f7255k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7256l;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public a() {
        }
    }

    public c(@n6.d f fVar) {
        l0.p(fVar, "impl");
        this.f7255k = fVar;
    }

    @n6.d
    public final f a() {
        return this.f7255k;
    }

    @Override // java.util.Random
    public int next(int i7) {
        return this.f7255k.b(i7);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f7255k.c();
    }

    @Override // java.util.Random
    public void nextBytes(@n6.d byte[] bArr) {
        l0.p(bArr, "bytes");
        this.f7255k.e(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f7255k.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f7255k.k();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f7255k.l();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f7255k.o();
    }

    @Override // java.util.Random
    public void setSeed(long j7) {
        if (this.f7256l) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f7256l = true;
    }

    @Override // java.util.Random
    public int nextInt(int i7) {
        return this.f7255k.m(i7);
    }
}
