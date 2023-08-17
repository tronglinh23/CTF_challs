package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class k3 {

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.a<v3.m2> f12898k;

        public a(t4.a<v3.m2> aVar) {
            this.f12898k = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12898k.n();
        }
    }

    @n6.d
    public static final Runnable a(@n6.d t4.a<v3.m2> aVar) {
        return new a(aVar);
    }
}
