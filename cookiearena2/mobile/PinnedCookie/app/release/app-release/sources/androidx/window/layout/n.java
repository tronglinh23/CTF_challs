package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import d.w0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import u4.l0;
import u4.l1;
import u4.n0;
import v3.d0;
import v3.f0;
/* loaded from: classes.dex */
public final class n {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final n f7085a = new n();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f7086b = f0.b(e.f7091l);

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.a<Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f7087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClassLoader classLoader) {
            super(0);
            this.f7087l = classLoader;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            n nVar = n.f7085a;
            Class l7 = nVar.l(this.f7087l);
            boolean z6 = false;
            Method method = l7.getMethod("getBounds", new Class[0]);
            Method method2 = l7.getMethod("getType", new Class[0]);
            Method method3 = l7.getMethod("getState", new Class[0]);
            l0.o(method, "getBoundsMethod");
            if (nVar.j(method, l1.d(Rect.class)) && nVar.o(method)) {
                l0.o(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (nVar.j(method2, l1.d(cls)) && nVar.o(method2)) {
                    l0.o(method3, "getStateMethod");
                    if (nVar.j(method3, l1.d(cls)) && nVar.o(method3)) {
                        z6 = true;
                    }
                }
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f7088l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ClassLoader classLoader) {
            super(0);
            this.f7088l = classLoader;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            n nVar = n.f7085a;
            boolean z6 = false;
            Method method = nVar.t(this.f7088l).getMethod("getWindowLayoutComponent", new Class[0]);
            Class v6 = nVar.v(this.f7088l);
            l0.o(method, "getWindowLayoutComponentMethod");
            if (nVar.o(method)) {
                l0.o(v6, "windowLayoutComponentClass");
                if (nVar.k(method, v6)) {
                    z6 = true;
                }
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.a<Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f7089l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ClassLoader classLoader) {
            super(0);
            this.f7089l = classLoader;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            n nVar = n.f7085a;
            Class v6 = nVar.v(this.f7089l);
            boolean z6 = false;
            Method method = v6.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method method2 = v6.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            l0.o(method, "addListenerMethod");
            if (nVar.o(method)) {
                l0.o(method2, "removeListenerMethod");
                if (nVar.o(method2)) {
                    z6 = true;
                }
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.a<Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f7090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ClassLoader classLoader) {
            super(0);
            this.f7090l = classLoader;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            n nVar = n.f7085a;
            boolean z6 = false;
            Method declaredMethod = nVar.u(this.f7090l).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class t6 = nVar.t(this.f7090l);
            l0.o(declaredMethod, "getWindowExtensionsMethod");
            l0.o(t6, "windowExtensionsClass");
            if (nVar.k(declaredMethod, t6) && nVar.o(declaredMethod)) {
                z6 = true;
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.a<WindowLayoutComponent> {

        /* renamed from: l  reason: collision with root package name */
        public static final e f7091l = new e();

        public e() {
            super(0);
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent n() {
            ClassLoader classLoader = n.class.getClassLoader();
            if (classLoader == null || !n.f7085a.i(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    public final boolean i(ClassLoader classLoader) {
        return r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader);
    }

    public final boolean j(Method method, e5.d<?> dVar) {
        return k(method, s4.a.d(dVar));
    }

    public final boolean k(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    public final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    @n6.e
    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) f7086b.getValue();
    }

    public final boolean n(ClassLoader classLoader) {
        return s(new a(classLoader));
    }

    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean p(ClassLoader classLoader) {
        return s(new b(classLoader));
    }

    @w0(24)
    public final boolean q(ClassLoader classLoader) {
        return s(new c(classLoader));
    }

    public final boolean r(ClassLoader classLoader) {
        return s(new d(classLoader));
    }

    public final boolean s(t4.a<Boolean> aVar) {
        try {
            return aVar.n().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
