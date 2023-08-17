package b5;

import java.io.Serializable;
import java.util.Random;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class d extends b5.a implements Serializable {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final a f7257n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final long f7258o = 0;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final Random f7259m;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public a() {
        }
    }

    public d(@n6.d Random random) {
        l0.p(random, "impl");
        this.f7259m = random;
    }

    @Override // b5.a
    @n6.d
    public Random r() {
        return this.f7259m;
    }
}
