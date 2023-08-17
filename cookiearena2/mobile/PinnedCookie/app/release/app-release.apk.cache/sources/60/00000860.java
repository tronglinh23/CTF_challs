package b5;

import java.util.Random;
import u4.l0;

/* loaded from: classes.dex */
public final class b extends b5.a {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final a f7252m = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // b5.a
    @n6.d
    public Random r() {
        Random random = this.f7252m.get();
        l0.o(random, "implStorage.get()");
        return random;
    }
}