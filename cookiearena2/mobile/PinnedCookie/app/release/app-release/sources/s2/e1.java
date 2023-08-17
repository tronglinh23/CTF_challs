package s2;

import android.annotation.SuppressLint;
import d.b1;
import java.util.LinkedHashMap;
import java.util.Map;
import s2.d1;
import u4.r1;
@r1({"SMAP\nNavigatorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class e1 {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final a f16309b = new a(null);
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Class<?>, String> f16310c = new LinkedHashMap();
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d1<? extends g0>> f16311a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        public final String a(@n6.d Class<? extends d1<?>> cls) {
            u4.l0.p(cls, "navigatorClass");
            String str = (String) e1.f16310c.get(cls);
            if (str == null) {
                d1.b bVar = (d1.b) cls.getAnnotation(d1.b.class);
                str = bVar != null ? bVar.value() : null;
                if (!b(str)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
                e1.f16310c.put(cls, str);
            }
            u4.l0.m(str);
            return str;
        }

        public final boolean b(@n6.e String str) {
            if (str != null) {
                return str.length() > 0;
            }
            return false;
        }

        public a() {
        }
    }

    @n6.d
    @s4.m
    public static final String d(@n6.d Class<? extends d1<?>> cls) {
        return f16309b.a(cls);
    }

    @d.i
    @n6.e
    public d1<? extends g0> b(@n6.d String str, @n6.d d1<? extends g0> d1Var) {
        u4.l0.p(str, "name");
        u4.l0.p(d1Var, "navigator");
        if (f16309b.b(str)) {
            d1<? extends g0> d1Var2 = this.f16311a.get(str);
            if (u4.l0.g(d1Var2, d1Var)) {
                return d1Var;
            }
            boolean z6 = false;
            if (d1Var2 != null && d1Var2.c()) {
                z6 = true;
            }
            if ((!z6) != true) {
                throw new IllegalStateException(("Navigator " + d1Var + " is replacing an already attached " + d1Var2).toString());
            } else if ((!d1Var.c()) == true) {
                return this.f16311a.put(str, d1Var);
            } else {
                throw new IllegalStateException(("Navigator " + d1Var + " is already attached to another NavController").toString());
            }
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public final d1<? extends g0> c(@n6.d d1<? extends g0> d1Var) {
        u4.l0.p(d1Var, "navigator");
        return b(f16309b.a(d1Var.getClass()), d1Var);
    }

    @n6.d
    public final <T extends d1<?>> T e(@n6.d Class<T> cls) {
        u4.l0.p(cls, "navigatorClass");
        return (T) f(f16309b.a(cls));
    }

    @d.i
    @n6.d
    public <T extends d1<?>> T f(@n6.d String str) {
        u4.l0.p(str, "name");
        if (f16309b.b(str)) {
            d1<? extends g0> d1Var = this.f16311a.get(str);
            if (d1Var != null) {
                return d1Var;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final Map<String, d1<? extends g0>> g() {
        return x3.a1.F0(this.f16311a);
    }
}
