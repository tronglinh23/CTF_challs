package r5;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import u4.l0;
/* loaded from: classes.dex */
public interface w {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16081a = b.f16082a;

    /* loaded from: classes.dex */
    public interface a {
        @n6.d
        d0 a();

        @n6.d
        a b(int i7, @n6.d TimeUnit timeUnit);

        @n6.d
        a c(int i7, @n6.d TimeUnit timeUnit);

        @n6.d
        e call();

        int d();

        int e();

        int f();

        @n6.d
        a g(int i7, @n6.d TimeUnit timeUnit);

        @n6.d
        f0 h(@n6.d d0 d0Var) throws IOException;

        @n6.e
        j i();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f16082a = new b();

        /* loaded from: classes.dex */
        public static final class a implements w {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ t4.l f16083b;

            public a(t4.l lVar) {
                this.f16083b = lVar;
            }

            @Override // r5.w
            @n6.d
            public final f0 a(@n6.d a aVar) {
                l0.p(aVar, "it");
                return (f0) this.f16083b.O(aVar);
            }
        }

        @n6.d
        public final w a(@n6.d t4.l<? super a, f0> lVar) {
            l0.p(lVar, "block");
            return new a(lVar);
        }
    }

    @n6.d
    f0 a(@n6.d a aVar) throws IOException;
}
