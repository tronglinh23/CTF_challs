package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import d.b1;
import u4.l0;
import u4.l1;
/* loaded from: classes.dex */
public interface s {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final a f7113a = a.f7114a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f7115b = false;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f7114a = new a();
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public static final String f7116c = l1.d(s.class).c0();
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public static t f7117d = h.f7055a;

        @s4.h(name = "getOrCreate")
        @n6.d
        @s4.m
        public final s a(@n6.d Context context) {
            l0.p(context, "context");
            return f7117d.a(new u(b0.f7050b, d(context)));
        }

        @b1({b1.a.LIBRARY_GROUP})
        @s4.m
        public final void b(@n6.d t tVar) {
            l0.p(tVar, "overridingDecorator");
            f7117d = tVar;
        }

        @b1({b1.a.LIBRARY_GROUP})
        @s4.m
        public final void c() {
            f7117d = h.f7055a;
        }

        @n6.d
        public final r d(@n6.d Context context) {
            l0.p(context, "context");
            j jVar = null;
            try {
                WindowLayoutComponent m7 = n.f7085a.m();
                if (m7 != null) {
                    jVar = new j(m7);
                }
            } catch (Throwable unused) {
            }
            return jVar == null ? p.f7099c.a(context) : jVar;
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    @s4.m
    static void a() {
        f7113a.c();
    }

    @s4.h(name = "getOrCreate")
    @n6.d
    @s4.m
    static s b(@n6.d Context context) {
        return f7113a.a(context);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @s4.m
    static void d(@n6.d t tVar) {
        f7113a.b(tVar);
    }

    @n6.d
    kotlinx.coroutines.flow.i<w> c(@n6.d Activity activity);
}
