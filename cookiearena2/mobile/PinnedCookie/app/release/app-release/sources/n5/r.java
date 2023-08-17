package n5;

import kotlinx.coroutines.i2;
import v3.a1;
@s4.f
/* loaded from: classes.dex */
public final class r<T> {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final b f13994b = new b(null);
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final c f13995c = new c();
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final Object f13996a;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @s4.e
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f13997a;

        public a(@n6.e Throwable th) {
            this.f13997a = th;
        }

        public boolean equals(@n6.e Object obj) {
            return (obj instanceof a) && u4.l0.g(this.f13997a, ((a) obj).f13997a);
        }

        public int hashCode() {
            Throwable th = this.f13997a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // n5.r.c
        @n6.d
        public String toString() {
            return "Closed(" + this.f13997a + ')';
        }
    }

    @i2
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        @n6.d
        @i2
        public final <E> Object a(@n6.e Throwable th) {
            return r.c(new a(th));
        }

        @n6.d
        @i2
        public final <E> Object b() {
            return r.c(r.f13995c);
        }

        @n6.d
        @i2
        public final <E> Object c(E e7) {
            return r.c(e7);
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        @n6.d
        public String toString() {
            return "Failed";
        }
    }

    @a1
    public /* synthetic */ r(Object obj) {
        this.f13996a = obj;
    }

    public static final /* synthetic */ r b(Object obj) {
        return new r(obj);
    }

    @n6.d
    @a1
    public static <T> Object c(@n6.e Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof r) && u4.l0.g(obj, ((r) obj2).o());
    }

    public static final boolean e(Object obj, Object obj2) {
        return u4.l0.g(obj, obj2);
    }

    @n6.e
    public static final Throwable f(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f13997a;
        }
        return null;
    }

    @a1
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) {
        Throwable th;
        if (obj instanceof c) {
            if (!(obj instanceof a) || (th = ((a) obj).f13997a) == null) {
                throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
            }
            throw th;
        }
        return obj;
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @n6.d
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f13996a, obj);
    }

    public int hashCode() {
        return j(this.f13996a);
    }

    public final /* synthetic */ Object o() {
        return this.f13996a;
    }

    @n6.d
    public String toString() {
        return n(this.f13996a);
    }
}
