package p0;

import a1.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import d.b1;
import m0.f;
import m0.i;
/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a  reason: collision with root package name */
    public static final m2 f14508a;

    /* renamed from: b  reason: collision with root package name */
    public static final androidx.collection.j<String, Typeface> f14509b;

    @d.b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a extends h.d {
        @d.q0

        /* renamed from: j  reason: collision with root package name */
        public i.g f14510j;

        public a(@d.q0 i.g gVar) {
            this.f14510j = gVar;
        }

        @Override // a1.h.d
        public void a(int i7) {
            i.g gVar = this.f14510j;
            if (gVar != null) {
                gVar.c(i7);
            }
        }

        @Override // a1.h.d
        public void b(@d.o0 Typeface typeface) {
            i.g gVar = this.f14510j;
            if (gVar != null) {
                gVar.d(typeface);
            }
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f14508a = new l2();
        } else if (i7 >= 28) {
            f14508a = new n1();
        } else {
            f14508a = new m1();
        }
        f14509b = new androidx.collection.j<>(16);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.l1
    public static void a() {
        f14509b.d();
    }

    @d.o0
    public static Typeface b(@d.o0 Context context, @d.q0 Typeface typeface, int i7) {
        if (context != null) {
            return Typeface.create(typeface, i7);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @d.o0
    public static Typeface c(@d.o0 Context context, @d.q0 Typeface typeface, @d.g0(from = 1, to = 1000) int i7, boolean z6) {
        if (context != null) {
            g1.s.g(i7, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f14508a.g(context, typeface, i7, z6);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public static Typeface d(@d.o0 Context context, @d.q0 CancellationSignal cancellationSignal, @d.o0 h.c[] cVarArr, int i7) {
        return f14508a.d(context, cancellationSignal, cVarArr, i7);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    @Deprecated
    public static Typeface e(@d.o0 Context context, @d.o0 f.b bVar, @d.o0 Resources resources, int i7, int i8, @d.q0 i.g gVar, @d.q0 Handler handler, boolean z6) {
        return f(context, bVar, resources, i7, null, 0, i8, gVar, handler, z6);
    }

    @d.b1({b1.a.LIBRARY})
    @d.q0
    public static Typeface f(@d.o0 Context context, @d.o0 f.b bVar, @d.o0 Resources resources, int i7, @d.q0 String str, int i8, int i9, @d.q0 i.g gVar, @d.q0 Handler handler, boolean z6) {
        Typeface b7;
        if (bVar instanceof f.C0181f) {
            f.C0181f c0181f = (f.C0181f) bVar;
            Typeface m7 = m(c0181f.c());
            if (m7 != null) {
                if (gVar != null) {
                    gVar.callbackSuccessAsync(m7, handler);
                }
                return m7;
            }
            boolean z7 = !z6 ? gVar != null : c0181f.a() != 0;
            int d7 = z6 ? c0181f.d() : -1;
            b7 = a1.h.f(context, c0181f.b(), i9, z7, d7, i.g.getHandler(handler), new a(gVar));
        } else {
            b7 = f14508a.b(context, (f.d) bVar, resources, i9);
            if (gVar != null) {
                if (b7 != null) {
                    gVar.callbackSuccessAsync(b7, handler);
                } else {
                    gVar.callbackFailAsync(-3, handler);
                }
            }
        }
        if (b7 != null) {
            f14509b.j(i(resources, i7, str, i8, i9), b7);
        }
        return b7;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    @Deprecated
    public static Typeface g(@d.o0 Context context, @d.o0 Resources resources, int i7, String str, int i8) {
        return h(context, resources, i7, str, 0, i8);
    }

    @d.b1({b1.a.LIBRARY})
    @d.q0
    public static Typeface h(@d.o0 Context context, @d.o0 Resources resources, int i7, String str, int i8, int i9) {
        Typeface f7 = f14508a.f(context, resources, i7, str, i9);
        if (f7 != null) {
            f14509b.j(i(resources, i7, str, i8, i9), f7);
        }
        return f7;
    }

    public static String i(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    @Deprecated
    public static Typeface j(@d.o0 Resources resources, int i7, int i8) {
        return k(resources, i7, null, 0, i8);
    }

    @d.b1({b1.a.LIBRARY})
    @d.q0
    public static Typeface k(@d.o0 Resources resources, int i7, @d.q0 String str, int i8, int i9) {
        return f14509b.f(i(resources, i7, str, i8, i9));
    }

    @d.q0
    public static Typeface l(Context context, Typeface typeface, int i7) {
        m2 m2Var = f14508a;
        f.d m7 = m2Var.m(typeface);
        if (m7 == null) {
            return null;
        }
        return m2Var.b(context, m7, context.getResources(), i7);
    }

    public static Typeface m(@d.q0 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
