package b5;

import java.util.Random;
import k4.m;
import u4.l0;
import v3.g1;

/* loaded from: classes.dex */
public final class e {
    @g1(version = "1.3")
    @n6.d
    public static final Random a(@n6.d f fVar) {
        Random r6;
        l0.p(fVar, "<this>");
        a aVar = fVar instanceof a ? (a) fVar : null;
        return (aVar == null || (r6 = aVar.r()) == null) ? new c(fVar) : r6;
    }

    @g1(version = "1.3")
    @n6.d
    public static final f b(@n6.d Random random) {
        f a7;
        l0.p(random, "<this>");
        c cVar = random instanceof c ? (c) random : null;
        return (cVar == null || (a7 = cVar.a()) == null) ? new d(random) : a7;
    }

    @k4.f
    public static final f c() {
        return m.f11768a.b();
    }

    public static final double d(int i7, int i8) {
        return ((i7 << 27) + i8) / 9.007199254740992E15d;
    }
}