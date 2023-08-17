package androidx.core.view;

import android.view.MotionEvent;
/* loaded from: classes.dex */
public final class b1 {
    @Deprecated
    public static final int A = 17;
    @Deprecated
    public static final int B = 18;
    @Deprecated
    public static final int C = 19;
    @Deprecated
    public static final int D = 20;
    @Deprecated
    public static final int E = 21;
    @Deprecated
    public static final int F = 22;
    @Deprecated
    public static final int G = 23;
    @Deprecated
    public static final int H = 24;
    @Deprecated
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;
    @Deprecated
    public static final int M = 32;
    @Deprecated
    public static final int N = 33;
    @Deprecated
    public static final int O = 34;
    @Deprecated
    public static final int P = 35;
    @Deprecated
    public static final int Q = 36;
    @Deprecated
    public static final int R = 37;
    @Deprecated
    public static final int S = 38;
    @Deprecated
    public static final int T = 39;
    @Deprecated
    public static final int U = 40;
    @Deprecated
    public static final int V = 41;
    @Deprecated
    public static final int W = 42;
    @Deprecated
    public static final int X = 43;
    @Deprecated
    public static final int Y = 44;
    @Deprecated
    public static final int Z = 45;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f3527a = 255;
    @Deprecated

    /* renamed from: a0  reason: collision with root package name */
    public static final int f3528a0 = 46;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f3529b = 5;
    @Deprecated

    /* renamed from: b0  reason: collision with root package name */
    public static final int f3530b0 = 47;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f3531c = 6;
    @Deprecated

    /* renamed from: c0  reason: collision with root package name */
    public static final int f3532c0 = 1;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f3533d = 7;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final int f3534e = 8;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final int f3535f = 65280;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final int f3536g = 8;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final int f3537h = 9;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public static final int f3538i = 10;
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    public static final int f3539j = 0;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    public static final int f3540k = 1;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final int f3541l = 2;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final int f3542m = 3;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    public static final int f3543n = 4;
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final int f3544o = 5;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    public static final int f3545p = 6;
    @Deprecated

    /* renamed from: q  reason: collision with root package name */
    public static final int f3546q = 7;
    @Deprecated

    /* renamed from: r  reason: collision with root package name */
    public static final int f3547r = 8;
    @Deprecated

    /* renamed from: s  reason: collision with root package name */
    public static final int f3548s = 9;
    @Deprecated

    /* renamed from: t  reason: collision with root package name */
    public static final int f3549t = 10;
    @Deprecated

    /* renamed from: u  reason: collision with root package name */
    public static final int f3550u = 11;
    @Deprecated

    /* renamed from: v  reason: collision with root package name */
    public static final int f3551v = 12;
    @Deprecated

    /* renamed from: w  reason: collision with root package name */
    public static final int f3552w = 13;
    @Deprecated

    /* renamed from: x  reason: collision with root package name */
    public static final int f3553x = 14;
    @Deprecated

    /* renamed from: y  reason: collision with root package name */
    public static final int f3554y = 15;
    @Deprecated

    /* renamed from: z  reason: collision with root package name */
    public static final int f3555z = 16;

    @Deprecated
    public static int a(MotionEvent motionEvent, int i7) {
        return motionEvent.findPointerIndex(i7);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float d(MotionEvent motionEvent, int i7) {
        return motionEvent.getAxisValue(i7);
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i7, int i8) {
        return motionEvent.getAxisValue(i7, i8);
    }

    @Deprecated
    public static int f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    public static int g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int h(MotionEvent motionEvent, int i7) {
        return motionEvent.getPointerId(i7);
    }

    @Deprecated
    public static int i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    public static float j(MotionEvent motionEvent, int i7) {
        return motionEvent.getX(i7);
    }

    @Deprecated
    public static float k(MotionEvent motionEvent, int i7) {
        return motionEvent.getY(i7);
    }

    public static boolean l(@d.o0 MotionEvent motionEvent, int i7) {
        return (motionEvent.getSource() & i7) == i7;
    }
}
