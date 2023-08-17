package androidx.lifecycle;

import android.app.Application;
import d.b1;
import i0.x2;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import k2.a;
import u4.r1;

@r1({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* loaded from: classes.dex */
public class c1 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final e1 f4714a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final b f4715b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final k2.a f4716c;

    /* loaded from: classes.dex */
    public interface b {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f4723a = a.f4724a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ a f4724a = new a();

            @n6.d
            @s4.m
            public final b a(@n6.d k2.h<?>... hVarArr) {
                u4.l0.p(hVarArr, "initializers");
                return new k2.b((k2.h[]) Arrays.copyOf(hVarArr, hVarArr.length));
            }
        }

        @n6.d
        @s4.m
        static b c(@n6.d k2.h<?>... hVarArr) {
            return f4723a.a(hVarArr);
        }

        @n6.d
        default <T extends z0> T a(@n6.d Class<T> cls) {
            u4.l0.p(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        @n6.d
        default <T extends z0> T b(@n6.d Class<T> cls, @n6.d k2.a aVar) {
            u4.l0.p(cls, "modelClass");
            u4.l0.p(aVar, "extras");
            return (T) a(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public static c f4726c;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final a f4725b = new a(null);
        @n6.d
        @s4.e

        /* renamed from: d  reason: collision with root package name */
        public static final a.b<String> f4727d = a.C0052a.f4728a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.c1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0052a implements a.b<String> {
                @n6.d

                /* renamed from: a  reason: collision with root package name */
                public static final C0052a f4728a = new C0052a();
            }

            public /* synthetic */ a(u4.w wVar) {
                this();
            }

            @s4.m
            public static /* synthetic */ void b() {
            }

            @d.b1({b1.a.LIBRARY_GROUP})
            @n6.d
            public final c a() {
                if (c.f4726c == null) {
                    c.f4726c = new c();
                }
                c cVar = c.f4726c;
                u4.l0.m(cVar);
                return cVar;
            }

            public a() {
            }
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        public static final c f() {
            return f4725b.a();
        }

        @Override // androidx.lifecycle.c1.b
        @n6.d
        public <T extends z0> T a(@n6.d Class<T> cls) {
            u4.l0.p(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                u4.l0.o(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            }
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class d {
        public void d(@n6.d z0 z0Var) {
            u4.l0.p(z0Var, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @s4.i
    public c1(@n6.d e1 e1Var, @n6.d b bVar) {
        this(e1Var, bVar, null, 4, null);
        u4.l0.p(e1Var, "store");
        u4.l0.p(bVar, "factory");
    }

    @d.l0
    @n6.d
    public <T extends z0> T a(@n6.d Class<T> cls) {
        u4.l0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @d.l0
    @n6.d
    public <T extends z0> T b(@n6.d String str, @n6.d Class<T> cls) {
        T t6;
        u4.l0.p(str, x2.f10960j);
        u4.l0.p(cls, "modelClass");
        T t7 = (T) this.f4714a.b(str);
        if (!cls.isInstance(t7)) {
            k2.e eVar = new k2.e(this.f4716c);
            eVar.c(c.f4727d, str);
            try {
                t6 = (T) this.f4715b.b(cls, eVar);
            } catch (AbstractMethodError unused) {
                t6 = (T) this.f4715b.a(cls);
            }
            this.f4714a.d(str, t6);
            return t6;
        }
        b bVar = this.f4715b;
        d dVar = bVar instanceof d ? (d) bVar : null;
        if (dVar != null) {
            u4.l0.m(t7);
            dVar.d(t7);
        }
        u4.l0.n(t7, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t7;
    }

    /* loaded from: classes.dex */
    public static class a extends c {
        @n6.d

        /* renamed from: g  reason: collision with root package name */
        public static final String f4718g = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        @n6.e

        /* renamed from: h  reason: collision with root package name */
        public static a f4719h;
        @n6.e

        /* renamed from: e  reason: collision with root package name */
        public final Application f4721e;
        @n6.d

        /* renamed from: f  reason: collision with root package name */
        public static final C0050a f4717f = new C0050a(null);
        @n6.d
        @s4.e

        /* renamed from: i  reason: collision with root package name */
        public static final a.b<Application> f4720i = C0050a.C0051a.f4722a;

        /* renamed from: androidx.lifecycle.c1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0050a {

            /* renamed from: androidx.lifecycle.c1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0051a implements a.b<Application> {
                @n6.d

                /* renamed from: a  reason: collision with root package name */
                public static final C0051a f4722a = new C0051a();
            }

            public /* synthetic */ C0050a(u4.w wVar) {
                this();
            }

            @n6.d
            public final b a(@n6.d f1 f1Var) {
                u4.l0.p(f1Var, "owner");
                return f1Var instanceof o ? ((o) f1Var).getDefaultViewModelProviderFactory() : c.f4725b.a();
            }

            @n6.d
            @s4.m
            public final a b(@n6.d Application application) {
                u4.l0.p(application, "application");
                if (a.f4719h == null) {
                    a.f4719h = new a(application);
                }
                a aVar = a.f4719h;
                u4.l0.m(aVar);
                return aVar;
            }

            public C0050a() {
            }
        }

        public a(Application application, int i7) {
            this.f4721e = application;
        }

        @n6.d
        @s4.m
        public static final a j(@n6.d Application application) {
            return f4717f.b(application);
        }

        @Override // androidx.lifecycle.c1.c, androidx.lifecycle.c1.b
        @n6.d
        public <T extends z0> T a(@n6.d Class<T> cls) {
            u4.l0.p(cls, "modelClass");
            Application application = this.f4721e;
            if (application != null) {
                return (T) i(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.c1.b
        @n6.d
        public <T extends z0> T b(@n6.d Class<T> cls, @n6.d k2.a aVar) {
            u4.l0.p(cls, "modelClass");
            u4.l0.p(aVar, "extras");
            if (this.f4721e != null) {
                return (T) a(cls);
            }
            Application application = (Application) aVar.a(f4720i);
            if (application != null) {
                return (T) i(cls, application);
            }
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(cls);
        }

        public final <T extends z0> T i(Class<T> cls, Application application) {
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    u4.l0.o(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e7);
                } catch (InstantiationException e8) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e8);
                } catch (NoSuchMethodException e9) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                }
            }
            return (T) super.a(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@n6.d Application application) {
            this(application, 0);
            u4.l0.p(application, "application");
        }
    }

    @s4.i
    public c1(@n6.d e1 e1Var, @n6.d b bVar, @n6.d k2.a aVar) {
        u4.l0.p(e1Var, "store");
        u4.l0.p(bVar, "factory");
        u4.l0.p(aVar, "defaultCreationExtras");
        this.f4714a = e1Var;
        this.f4715b = bVar;
        this.f4716c = aVar;
    }

    public /* synthetic */ c1(e1 e1Var, b bVar, k2.a aVar, int i7, u4.w wVar) {
        this(e1Var, bVar, (i7 & 4) != 0 ? a.C0139a.f11626b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(@n6.d f1 f1Var) {
        this(f1Var.getViewModelStore(), a.f4717f.a(f1Var), d1.a(f1Var));
        u4.l0.p(f1Var, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(@n6.d f1 f1Var, @n6.d b bVar) {
        this(f1Var.getViewModelStore(), bVar, d1.a(f1Var));
        u4.l0.p(f1Var, "owner");
        u4.l0.p(bVar, "factory");
    }
}