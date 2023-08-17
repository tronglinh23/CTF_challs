package b5;

import java.util.Random;
import u4.l0;
import u4.r1;

@r1({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes.dex */
public abstract class a extends f {
    @Override // b5.f
    public int b(int i7) {
        return g.j(r().nextInt(), i7);
    }

    @Override // b5.f
    public boolean c() {
        return r().nextBoolean();
    }

    @Override // b5.f
    @n6.d
    public byte[] e(@n6.d byte[] bArr) {
        l0.p(bArr, "array");
        r().nextBytes(bArr);
        return bArr;
    }

    @Override // b5.f
    public double h() {
        return r().nextDouble();
    }

    @Override // b5.f
    public float k() {
        return r().nextFloat();
    }

    @Override // b5.f
    public int l() {
        return r().nextInt();
    }

    @Override // b5.f
    public int m(int i7) {
        return r().nextInt(i7);
    }

    @Override // b5.f
    public long o() {
        return r().nextLong();
    }

    @n6.d
    public abstract Random r();
}