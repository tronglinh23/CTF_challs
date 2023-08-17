package i5;

import java.util.List;
import u4.l0;
/* loaded from: classes.dex */
public interface m {

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d
        public static b a(@n6.d m mVar) {
            return new b(mVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final m f11120a;

        public b(@n6.d m mVar) {
            l0.p(mVar, "match");
            this.f11120a = mVar;
        }

        @k4.f
        public final String a() {
            return k().a().get(1);
        }

        @k4.f
        public final String b() {
            return k().a().get(10);
        }

        @k4.f
        public final String c() {
            return k().a().get(2);
        }

        @k4.f
        public final String d() {
            return k().a().get(3);
        }

        @k4.f
        public final String e() {
            return k().a().get(4);
        }

        @k4.f
        public final String f() {
            return k().a().get(5);
        }

        @k4.f
        public final String g() {
            return k().a().get(6);
        }

        @k4.f
        public final String h() {
            return k().a().get(7);
        }

        @k4.f
        public final String i() {
            return k().a().get(8);
        }

        @k4.f
        public final String j() {
            return k().a().get(9);
        }

        @n6.d
        public final m k() {
            return this.f11120a;
        }

        @n6.d
        public final List<String> l() {
            return this.f11120a.a().subList(1, this.f11120a.a().size());
        }
    }

    @n6.d
    List<String> a();

    @n6.d
    b b();

    @n6.d
    k c();

    @n6.d
    d5.l d();

    @n6.d
    String getValue();

    @n6.e
    m next();
}
