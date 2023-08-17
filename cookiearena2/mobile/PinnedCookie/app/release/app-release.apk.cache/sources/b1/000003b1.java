package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import d.b1;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f3746b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3747c = 1000;

    /* renamed from: d  reason: collision with root package name */
    public static final int f3748d = 1001;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3749e = 1002;

    /* renamed from: f  reason: collision with root package name */
    public static final int f3750f = 1003;

    /* renamed from: g  reason: collision with root package name */
    public static final int f3751g = 1004;

    /* renamed from: h  reason: collision with root package name */
    public static final int f3752h = 1006;

    /* renamed from: i  reason: collision with root package name */
    public static final int f3753i = 1007;

    /* renamed from: j  reason: collision with root package name */
    public static final int f3754j = 1008;

    /* renamed from: k  reason: collision with root package name */
    public static final int f3755k = 1009;

    /* renamed from: l  reason: collision with root package name */
    public static final int f3756l = 1010;

    /* renamed from: m  reason: collision with root package name */
    public static final int f3757m = 1011;

    /* renamed from: n  reason: collision with root package name */
    public static final int f3758n = 1012;

    /* renamed from: o  reason: collision with root package name */
    public static final int f3759o = 1013;

    /* renamed from: p  reason: collision with root package name */
    public static final int f3760p = 1014;

    /* renamed from: q  reason: collision with root package name */
    public static final int f3761q = 1015;

    /* renamed from: r  reason: collision with root package name */
    public static final int f3762r = 1016;

    /* renamed from: s  reason: collision with root package name */
    public static final int f3763s = 1017;

    /* renamed from: t  reason: collision with root package name */
    public static final int f3764t = 1018;

    /* renamed from: u  reason: collision with root package name */
    public static final int f3765u = 1019;

    /* renamed from: v  reason: collision with root package name */
    public static final int f3766v = 1020;

    /* renamed from: w  reason: collision with root package name */
    public static final int f3767w = 1021;

    /* renamed from: x  reason: collision with root package name */
    public static final int f3768x = 1000;

    /* renamed from: a  reason: collision with root package name */
    public final PointerIcon f3769a;

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static PointerIcon a(Bitmap bitmap, float f7, float f8) {
            return PointerIcon.create(bitmap, f7, f8);
        }

        @d.u
        public static PointerIcon b(Context context, int i7) {
            return PointerIcon.getSystemIcon(context, i7);
        }

        @d.u
        public static PointerIcon c(Resources resources, int i7) {
            return PointerIcon.load(resources, i7);
        }
    }

    public o1(PointerIcon pointerIcon) {
        this.f3769a = pointerIcon;
    }

    @d.o0
    public static o1 a(@d.o0 Bitmap bitmap, float f7, float f8) {
        return new o1(a.a(bitmap, f7, f8));
    }

    @d.o0
    public static o1 c(@d.o0 Context context, int i7) {
        return new o1(a.b(context, i7));
    }

    @d.o0
    public static o1 d(@d.o0 Resources resources, int i7) {
        return new o1(a.c(resources, i7));
    }

    @d.b1({b1.a.f8135m})
    @d.q0
    public Object b() {
        return this.f3769a;
    }
}