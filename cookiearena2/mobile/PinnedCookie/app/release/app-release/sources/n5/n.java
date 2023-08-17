package n5;

import kotlinx.coroutines.internal.t0;
import n5.i0;
import n5.m0;
import v3.b1;
/* loaded from: classes.dex */
public interface n<E> extends m0<E>, i0<E> {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final b f13954d = b.f13961a;

    /* renamed from: e  reason: collision with root package name */
    public static final int f13955e = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public static final int f13956f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f13957g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f13958h = -2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f13959i = -3;
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public static final String f13960j = "kotlinx.coroutines.channels.defaultBuffer";

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@n6.d n<E> nVar) {
            return i0.a.d(nVar);
        }

        @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@n6.d n<E> nVar, E e7) {
            return m0.a.c(nVar, e7);
        }

        @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @n6.e
        public static <E> E d(@n6.d n<E> nVar) {
            return (E) i0.a.h(nVar);
        }

        @k4.h
        @v3.k(level = v3.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @n6.e
        public static <E> Object e(@n6.d n<E> nVar, @n6.d e4.d<? super E> dVar) {
            return i0.a.i(nVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f13962b = Integer.MAX_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public static final int f13963c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f13964d = -1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f13965e = -2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f13966f = -3;
        @n6.d

        /* renamed from: g  reason: collision with root package name */
        public static final String f13967g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f13961a = new b();

        /* renamed from: h  reason: collision with root package name */
        public static final int f13968h = t0.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return f13968h;
        }
    }
}
