package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3713a = 8388608;

    /* renamed from: b  reason: collision with root package name */
    public static final int f3714b = 8388611;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3715c = 8388613;

    /* renamed from: d  reason: collision with root package name */
    public static final int f3716d = 8388615;

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(int i7, int i8, int i9, Rect rect, int i10, int i11, Rect rect2, int i12) {
            Gravity.apply(i7, i8, i9, rect, i10, i11, rect2, i12);
        }

        @d.u
        public static void b(int i7, int i8, int i9, Rect rect, Rect rect2, int i10) {
            Gravity.apply(i7, i8, i9, rect, rect2, i10);
        }

        @d.u
        public static void c(int i7, Rect rect, Rect rect2, int i8) {
            Gravity.applyDisplay(i7, rect, rect2, i8);
        }
    }

    public static void a(int i7, int i8, int i9, @d.o0 Rect rect, int i10, int i11, @d.o0 Rect rect2, int i12) {
        a.a(i7, i8, i9, rect, i10, i11, rect2, i12);
    }

    public static void b(int i7, int i8, int i9, @d.o0 Rect rect, @d.o0 Rect rect2, int i10) {
        a.b(i7, i8, i9, rect, rect2, i10);
    }

    public static void c(int i7, @d.o0 Rect rect, @d.o0 Rect rect2, int i8) {
        a.c(i7, rect, rect2, i8);
    }

    public static int d(int i7, int i8) {
        return Gravity.getAbsoluteGravity(i7, i8);
    }
}
