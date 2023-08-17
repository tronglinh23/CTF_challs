package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import v3.d1;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12823a = f(Throwable.class, -1);
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final k f12824b;

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            return b4.g.l(Integer.valueOf(((Constructor) t7).getParameterTypes().length), Integer.valueOf(((Constructor) t6).getParameterTypes().length));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l {

        /* renamed from: l  reason: collision with root package name */
        public static final b f12825l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Void O(@n6.d Throwable th) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.l<Throwable, Throwable> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Constructor f12826l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f12826l = constructor;
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Throwable O(@n6.d Throwable th) {
            Object b7;
            Object newInstance;
            try {
                d1.a aVar = v3.d1.f17778l;
                newInstance = this.f12826l.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                d1.a aVar2 = v3.d1.f17778l;
                b7 = v3.d1.b(v3.e1.a(th2));
            }
            if (newInstance != null) {
                b7 = v3.d1.b((Throwable) newInstance);
                if (v3.d1.i(b7)) {
                    b7 = null;
                }
                return (Throwable) b7;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.l<Throwable, Throwable> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Constructor f12827l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f12827l = constructor;
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Throwable O(@n6.d Throwable th) {
            Object b7;
            Object newInstance;
            try {
                d1.a aVar = v3.d1.f17778l;
                newInstance = this.f12827l.newInstance(th);
            } catch (Throwable th2) {
                d1.a aVar2 = v3.d1.f17778l;
                b7 = v3.d1.b(v3.e1.a(th2));
            }
            if (newInstance != null) {
                b7 = v3.d1.b((Throwable) newInstance);
                if (v3.d1.i(b7)) {
                    b7 = null;
                }
                return (Throwable) b7;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends u4.n0 implements t4.l<Throwable, Throwable> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Constructor f12828l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f12828l = constructor;
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Throwable O(@n6.d Throwable th) {
            Object b7;
            Object newInstance;
            try {
                d1.a aVar = v3.d1.f17778l;
                newInstance = this.f12828l.newInstance(th.getMessage());
            } catch (Throwable th2) {
                d1.a aVar2 = v3.d1.f17778l;
                b7 = v3.d1.b(v3.e1.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                b7 = v3.d1.b(th3);
                if (v3.d1.i(b7)) {
                    b7 = null;
                }
                return (Throwable) b7;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends u4.n0 implements t4.l<Throwable, Throwable> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Constructor f12829l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f12829l = constructor;
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Throwable O(@n6.d Throwable th) {
            Object b7;
            Object newInstance;
            try {
                d1.a aVar = v3.d1.f17778l;
                newInstance = this.f12829l.newInstance(new Object[0]);
            } catch (Throwable th2) {
                d1.a aVar2 = v3.d1.f17778l;
                b7 = v3.d1.b(v3.e1.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                b7 = v3.d1.b(th3);
                if (v3.d1.i(b7)) {
                    b7 = null;
                }
                return (Throwable) b7;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends u4.n0 implements t4.l<Throwable, Throwable> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.l<Throwable, Throwable> f12830l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(t4.l<? super Throwable, ? extends Throwable> lVar) {
            super(1);
            this.f12830l = lVar;
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Throwable O(@n6.d Throwable th) {
            Object b7;
            t4.l<Throwable, Throwable> lVar = this.f12830l;
            try {
                d1.a aVar = v3.d1.f17778l;
                b7 = v3.d1.b(lVar.O(th));
            } catch (Throwable th2) {
                d1.a aVar2 = v3.d1.f17778l;
                b7 = v3.d1.b(v3.e1.a(th2));
            }
            if (v3.d1.i(b7)) {
                b7 = null;
            }
            return (Throwable) b7;
        }
    }

    static {
        k kVar;
        try {
            kVar = p.a() ? e1.f12798a : kotlinx.coroutines.internal.e.f12793a;
        } catch (Throwable unused) {
            kVar = e1.f12798a;
        }
        f12824b = kVar;
    }

    public static final <E extends Throwable> t4.l<Throwable, Throwable> b(Class<E> cls) {
        b bVar = b.f12825l;
        if (f12823a != f(cls, 0)) {
            return bVar;
        }
        Iterator it = x3.p.mw(cls.getConstructors(), new a()).iterator();
        while (it.hasNext()) {
            t4.l<Throwable, Throwable> c7 = c((Constructor) it.next());
            if (c7 != null) {
                return c7;
            }
        }
        return bVar;
    }

    public static final t4.l<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && u4.l0.g(parameterTypes[0], String.class) && u4.l0.g(parameterTypes[1], Throwable.class)) {
                    return new c(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (u4.l0.g(cls, Throwable.class)) {
                return new d(constructor);
            }
            if (u4.l0.g(cls, String.class)) {
                return new e(constructor);
            }
            return null;
        }
        return new f(constructor);
    }

    public static final int d(Class<?> cls, int i7) {
        do {
            int length = cls.getDeclaredFields().length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if ((!Modifier.isStatic(r0[i9].getModifiers())) != false) {
                    i8++;
                }
            }
            i7 += i8;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i7;
    }

    public static /* synthetic */ int e(Class cls, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        return d(cls, i7);
    }

    public static final int f(Class<?> cls, int i7) {
        Integer b7;
        s4.a.i(cls);
        try {
            d1.a aVar = v3.d1.f17778l;
            b7 = v3.d1.b(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            d1.a aVar2 = v3.d1.f17778l;
            b7 = v3.d1.b(v3.e1.a(th));
        }
        Integer valueOf = Integer.valueOf(i7);
        if (v3.d1.i(b7)) {
            b7 = valueOf;
        }
        return ((Number) b7).intValue();
    }

    public static final t4.l<Throwable, Throwable> g(t4.l<? super Throwable, ? extends Throwable> lVar) {
        return new g(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public static final <E extends Throwable> E h(@n6.d E e7) {
        Object b7;
        if (e7 instanceof kotlinx.coroutines.m0) {
            try {
                d1.a aVar = v3.d1.f17778l;
                b7 = v3.d1.b(((kotlinx.coroutines.m0) e7).a());
            } catch (Throwable th) {
                d1.a aVar2 = v3.d1.f17778l;
                b7 = v3.d1.b(v3.e1.a(th));
            }
            if (v3.d1.i(b7)) {
                b7 = null;
            }
            return (E) b7;
        }
        return (E) f12824b.a(e7.getClass()).O(e7);
    }
}
