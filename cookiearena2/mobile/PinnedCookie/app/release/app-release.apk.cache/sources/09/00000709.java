package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final r1 f6521a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f6522b = "ViewUtils";

    /* renamed from: c  reason: collision with root package name */
    public static final Property<View, Float> f6523c;

    /* renamed from: d  reason: collision with root package name */
    public static final Property<View, Rect> f6524d;

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(e1.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            e1.h(view, f7.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return androidx.core.view.u1.P(view);
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            androidx.core.view.u1.M1(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f6521a = new q1();
        } else {
            f6521a = new p1();
        }
        f6523c = new a(Float.class, "translationAlpha");
        f6524d = new b(Rect.class, "clipBounds");
    }

    public static void a(@d.o0 View view) {
        f6521a.a(view);
    }

    public static d1 b(@d.o0 View view) {
        return new c1(view);
    }

    public static float c(@d.o0 View view) {
        return f6521a.c(view);
    }

    public static w1 d(@d.o0 View view) {
        return new v1(view);
    }

    public static void e(@d.o0 View view) {
        f6521a.d(view);
    }

    public static void f(@d.o0 View view, @d.q0 Matrix matrix) {
        f6521a.e(view, matrix);
    }

    public static void g(@d.o0 View view, int i7, int i8, int i9, int i10) {
        f6521a.f(view, i7, i8, i9, i10);
    }

    public static void h(@d.o0 View view, float f7) {
        f6521a.g(view, f7);
    }

    public static void i(@d.o0 View view, int i7) {
        f6521a.h(view, i7);
    }

    public static void j(@d.o0 View view, @d.o0 Matrix matrix) {
        f6521a.i(view, matrix);
    }

    public static void k(@d.o0 View view, @d.o0 Matrix matrix) {
        f6521a.j(view, matrix);
    }
}