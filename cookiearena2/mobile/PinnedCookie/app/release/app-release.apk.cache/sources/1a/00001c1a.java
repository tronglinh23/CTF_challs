package v3;

import java.io.Serializable;

@g1(version = "1.3")
@s4.f
/* loaded from: classes.dex */
public final class d1<T> implements Serializable {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f17778l = new a(null);
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final Object f17779k;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @s4.h(name = "failure")
        @k4.f
        public final <T> Object a(Throwable th) {
            u4.l0.p(th, "exception");
            return d1.b(e1.a(th));
        }

        @s4.h(name = "success")
        @k4.f
        public final <T> Object b(T t6) {
            return d1.b(t6);
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {
        @n6.d
        @s4.e

        /* renamed from: k  reason: collision with root package name */
        public final Throwable f17780k;

        public b(@n6.d Throwable th) {
            u4.l0.p(th, "exception");
            this.f17780k = th;
        }

        public boolean equals(@n6.e Object obj) {
            return (obj instanceof b) && u4.l0.g(this.f17780k, ((b) obj).f17780k);
        }

        public int hashCode() {
            return this.f17780k.hashCode();
        }

        @n6.d
        public String toString() {
            return "Failure(" + this.f17780k + ')';
        }
    }

    @a1
    public /* synthetic */ d1(Object obj) {
        this.f17779k = obj;
    }

    public static final /* synthetic */ d1 a(Object obj) {
        return new d1(obj);
    }

    @n6.d
    @a1
    public static <T> Object b(@n6.e Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof d1) && u4.l0.g(obj, ((d1) obj2).l());
    }

    public static final boolean d(Object obj, Object obj2) {
        return u4.l0.g(obj, obj2);
    }

    @n6.e
    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f17780k;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final T f(Object obj) {
        if (i(obj)) {
            return null;
        }
        return obj;
    }

    @a1
    public static /* synthetic */ void g() {
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof b;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof b);
    }

    @n6.d
    public static String k(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f17779k, obj);
    }

    public int hashCode() {
        return h(this.f17779k);
    }

    public final /* synthetic */ Object l() {
        return this.f17779k;
    }

    @n6.d
    public String toString() {
        return k(this.f17779k);
    }
}