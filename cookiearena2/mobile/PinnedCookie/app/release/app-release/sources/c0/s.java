package c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import androidx.constraintlayout.widget.k;
import androidx.core.view.h1;
import androidx.core.view.u1;
import c0.u;
import d.o0;
import d.q0;
import d.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y.d;
import y.e;
/* loaded from: classes.dex */
public class s extends ConstraintLayout implements h1 {
    public static final int F0 = 0;
    public static final int G0 = 1;
    public static final int H0 = 2;
    public static final int I0 = 3;
    public static final int J0 = 4;
    public static final int K0 = 5;
    public static final int L0 = 6;
    public static final int M0 = 7;
    public static final String N0 = "MotionLayout";
    public static final boolean O0 = false;
    public static boolean P0 = false;
    public static final int Q0 = 0;
    public static final int R0 = 1;
    public static final int S0 = 2;
    public static final int T0 = 50;
    public static final int U0 = 0;
    public static final int V0 = 1;
    public static final int W0 = 2;
    public static final int X0 = 3;
    public static final float Y0 = 1.0E-5f;
    public boolean A;
    public boolean A0;
    public b0.b B;
    public RectF B0;
    public f C;
    public View C0;
    public c0.d D;
    public Matrix D0;
    public boolean E;
    public ArrayList<Integer> E0;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public float N;
    public boolean O;
    public ArrayList<p> P;
    public ArrayList<p> Q;
    public ArrayList<p> R;
    public CopyOnWriteArrayList<l> S;
    public int T;
    public long U;
    public float V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public float f7577a0;

    /* renamed from: b  reason: collision with root package name */
    public u f7578b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f7579b0;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f7580c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f7581c0;

    /* renamed from: d  reason: collision with root package name */
    public Interpolator f7582d;

    /* renamed from: d0  reason: collision with root package name */
    public int f7583d0;

    /* renamed from: e  reason: collision with root package name */
    public float f7584e;

    /* renamed from: e0  reason: collision with root package name */
    public int f7585e0;

    /* renamed from: f  reason: collision with root package name */
    public int f7586f;

    /* renamed from: f0  reason: collision with root package name */
    public int f7587f0;

    /* renamed from: g  reason: collision with root package name */
    public int f7588g;

    /* renamed from: g0  reason: collision with root package name */
    public int f7589g0;

    /* renamed from: h  reason: collision with root package name */
    public int f7590h;

    /* renamed from: h0  reason: collision with root package name */
    public int f7591h0;

    /* renamed from: i  reason: collision with root package name */
    public int f7592i;

    /* renamed from: i0  reason: collision with root package name */
    public int f7593i0;

    /* renamed from: j  reason: collision with root package name */
    public int f7594j;

    /* renamed from: j0  reason: collision with root package name */
    public float f7595j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7596k;

    /* renamed from: k0  reason: collision with root package name */
    public u.g f7597k0;

    /* renamed from: l  reason: collision with root package name */
    public HashMap<View, o> f7598l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7599l0;

    /* renamed from: m  reason: collision with root package name */
    public long f7600m;

    /* renamed from: m0  reason: collision with root package name */
    public k f7601m0;

    /* renamed from: n  reason: collision with root package name */
    public float f7602n;

    /* renamed from: n0  reason: collision with root package name */
    public Runnable f7603n0;

    /* renamed from: o  reason: collision with root package name */
    public float f7604o;

    /* renamed from: o0  reason: collision with root package name */
    public int[] f7605o0;

    /* renamed from: p  reason: collision with root package name */
    public float f7606p;

    /* renamed from: p0  reason: collision with root package name */
    public int f7607p0;

    /* renamed from: q  reason: collision with root package name */
    public long f7608q;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f7609q0;

    /* renamed from: r  reason: collision with root package name */
    public float f7610r;

    /* renamed from: r0  reason: collision with root package name */
    public int f7611r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7612s;

    /* renamed from: s0  reason: collision with root package name */
    public HashMap<View, b0.e> f7613s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7614t;

    /* renamed from: t0  reason: collision with root package name */
    public int f7615t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7616u;

    /* renamed from: u0  reason: collision with root package name */
    public int f7617u0;

    /* renamed from: v  reason: collision with root package name */
    public l f7618v;

    /* renamed from: v0  reason: collision with root package name */
    public int f7619v0;

    /* renamed from: w  reason: collision with root package name */
    public float f7620w;

    /* renamed from: w0  reason: collision with root package name */
    public Rect f7621w0;

    /* renamed from: x  reason: collision with root package name */
    public float f7622x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f7623x0;

    /* renamed from: y  reason: collision with root package name */
    public int f7624y;

    /* renamed from: y0  reason: collision with root package name */
    public m f7625y0;

    /* renamed from: z  reason: collision with root package name */
    public g f7626z;

    /* renamed from: z0  reason: collision with root package name */
    public h f7627z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f7601m0.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f7609q0 = false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ View f7630k;

        public c(final s this$0, final View val$target) {
            this.f7630k = val$target;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7630k.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f7601m0.a();
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7632a;

        static {
            int[] iArr = new int[m.values().length];
            f7632a = iArr;
            try {
                iArr[m.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7632a[m.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7632a[m.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7632a[m.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends r {

        /* renamed from: a  reason: collision with root package name */
        public float f7633a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f7634b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f7635c;

        public f() {
        }

        @Override // c0.r
        public float a() {
            return s.this.f7584e;
        }

        public void b(float velocity, float position, float maxAcceleration) {
            this.f7633a = velocity;
            this.f7634b = position;
            this.f7635c = maxAcceleration;
        }

        @Override // c0.r, android.animation.TimeInterpolator
        public float getInterpolation(float time) {
            float f7;
            float f8;
            float f9 = this.f7633a;
            if (f9 > 0.0f) {
                float f10 = this.f7635c;
                if (f9 / f10 < time) {
                    time = f9 / f10;
                }
                s.this.f7584e = f9 - (f10 * time);
                f7 = (f9 * time) - (((f10 * time) * time) / 2.0f);
                f8 = this.f7634b;
            } else {
                float f11 = this.f7635c;
                if ((-f9) / f11 < time) {
                    time = (-f9) / f11;
                }
                s.this.f7584e = (f11 * time) + f9;
                f7 = (f9 * time) + (((f11 * time) * time) / 2.0f);
                f8 = this.f7634b;
            }
            return f7 + f8;
        }
    }

    /* loaded from: classes.dex */
    public class g {

        /* renamed from: v  reason: collision with root package name */
        public static final int f7637v = 16;

        /* renamed from: a  reason: collision with root package name */
        public float[] f7638a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f7639b;

        /* renamed from: c  reason: collision with root package name */
        public float[] f7640c;

        /* renamed from: d  reason: collision with root package name */
        public Path f7641d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f7642e;

        /* renamed from: f  reason: collision with root package name */
        public Paint f7643f;

        /* renamed from: g  reason: collision with root package name */
        public Paint f7644g;

        /* renamed from: h  reason: collision with root package name */
        public Paint f7645h;

        /* renamed from: i  reason: collision with root package name */
        public Paint f7646i;

        /* renamed from: j  reason: collision with root package name */
        public float[] f7647j;

        /* renamed from: p  reason: collision with root package name */
        public DashPathEffect f7653p;

        /* renamed from: q  reason: collision with root package name */
        public int f7654q;

        /* renamed from: t  reason: collision with root package name */
        public int f7657t;

        /* renamed from: k  reason: collision with root package name */
        public final int f7648k = -21965;

        /* renamed from: l  reason: collision with root package name */
        public final int f7649l = -2067046;

        /* renamed from: m  reason: collision with root package name */
        public final int f7650m = -13391360;

        /* renamed from: n  reason: collision with root package name */
        public final int f7651n = 1996488704;

        /* renamed from: o  reason: collision with root package name */
        public final int f7652o = 10;

        /* renamed from: r  reason: collision with root package name */
        public Rect f7655r = new Rect();

        /* renamed from: s  reason: collision with root package name */
        public boolean f7656s = false;

        public g() {
            this.f7657t = 1;
            Paint paint = new Paint();
            this.f7642e = paint;
            paint.setAntiAlias(true);
            this.f7642e.setColor(-21965);
            this.f7642e.setStrokeWidth(2.0f);
            this.f7642e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f7643f = paint2;
            paint2.setAntiAlias(true);
            this.f7643f.setColor(-2067046);
            this.f7643f.setStrokeWidth(2.0f);
            this.f7643f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f7644g = paint3;
            paint3.setAntiAlias(true);
            this.f7644g.setColor(-13391360);
            this.f7644g.setStrokeWidth(2.0f);
            this.f7644g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f7645h = paint4;
            paint4.setAntiAlias(true);
            this.f7645h.setColor(-13391360);
            this.f7645h.setTextSize(s.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f7647j = new float[8];
            Paint paint5 = new Paint();
            this.f7646i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f7653p = dashPathEffect;
            this.f7644g.setPathEffect(dashPathEffect);
            this.f7640c = new float[100];
            this.f7639b = new int[50];
            if (this.f7656s) {
                this.f7642e.setStrokeWidth(8.0f);
                this.f7646i.setStrokeWidth(8.0f);
                this.f7643f.setStrokeWidth(8.0f);
                this.f7657t = 4;
            }
        }

        public void a(Canvas canvas, HashMap<View, o> frameArrayList, int duration, int debugPath) {
            if (frameArrayList == null || frameArrayList.size() == 0) {
                return;
            }
            canvas.save();
            if (!s.this.isInEditMode() && (debugPath & 1) == 2) {
                String str = s.this.getContext().getResources().getResourceName(s.this.f7590h) + ":" + s.this.getProgress();
                canvas.drawText(str, 10.0f, (float) (s.this.getHeight() - 30), this.f7645h);
                canvas.drawText(str, 11.0f, (float) (s.this.getHeight() - 29), this.f7642e);
            }
            for (o oVar : frameArrayList.values()) {
                int q6 = oVar.q();
                if (debugPath > 0 && q6 == 0) {
                    q6 = 1;
                }
                if (q6 != 0) {
                    this.f7654q = oVar.e(this.f7640c, this.f7639b);
                    if (q6 >= 1) {
                        int i7 = duration / 16;
                        float[] fArr = this.f7638a;
                        if (fArr == null || fArr.length != i7 * 2) {
                            this.f7638a = new float[i7 * 2];
                            this.f7641d = new Path();
                        }
                        int i8 = this.f7657t;
                        canvas.translate(i8, i8);
                        this.f7642e.setColor(1996488704);
                        this.f7646i.setColor(1996488704);
                        this.f7643f.setColor(1996488704);
                        this.f7644g.setColor(1996488704);
                        oVar.f(this.f7638a, i7);
                        b(canvas, q6, this.f7654q, oVar);
                        this.f7642e.setColor(-21965);
                        this.f7643f.setColor(-2067046);
                        this.f7646i.setColor(-2067046);
                        this.f7644g.setColor(-13391360);
                        int i9 = this.f7657t;
                        canvas.translate(-i9, -i9);
                        b(canvas, q6, this.f7654q, oVar);
                        if (q6 == 5) {
                            j(canvas, oVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int mode, int keyFrames, o motionController) {
            if (mode == 4) {
                d(canvas);
            }
            if (mode == 2) {
                g(canvas);
            }
            if (mode == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, mode, keyFrames, motionController);
        }

        public final void c(Canvas canvas) {
            canvas.drawLines(this.f7638a, this.f7642e);
        }

        public final void d(Canvas canvas) {
            boolean z6 = false;
            boolean z7 = false;
            for (int i7 = 0; i7 < this.f7654q; i7++) {
                int i8 = this.f7639b[i7];
                if (i8 == 1) {
                    z6 = true;
                }
                if (i8 == 0) {
                    z7 = true;
                }
            }
            if (z6) {
                g(canvas);
            }
            if (z7) {
                e(canvas);
            }
        }

        public final void e(Canvas canvas) {
            float[] fArr = this.f7638a;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f7, f9), Math.max(f8, f10), Math.max(f7, f9), Math.max(f8, f10), this.f7644g);
            canvas.drawLine(Math.min(f7, f9), Math.min(f8, f10), Math.min(f7, f9), Math.max(f8, f10), this.f7644g);
        }

        public final void f(Canvas canvas, float x6, float y6) {
            float[] fArr = this.f7638a;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            float min = Math.min(f7, f9);
            float max = Math.max(f8, f10);
            float min2 = x6 - Math.min(f7, f9);
            float max2 = Math.max(f8, f10) - y6;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f9 - f7)) + 0.5d)) / 100.0f);
            m(str, this.f7645h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f7655r.width() / 2)) + min, y6 - 20.0f, this.f7645h);
            canvas.drawLine(x6, y6, Math.min(f7, f9), y6, this.f7644g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f10 - f8)) + 0.5d)) / 100.0f);
            m(str2, this.f7645h);
            canvas.drawText(str2, x6 + 5.0f, max - ((max2 / 2.0f) - (this.f7655r.height() / 2)), this.f7645h);
            canvas.drawLine(x6, y6, x6, Math.max(f8, f10), this.f7644g);
        }

        public final void g(Canvas canvas) {
            float[] fArr = this.f7638a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f7644g);
        }

        public final void h(Canvas canvas, float x6, float y6) {
            float[] fArr = this.f7638a;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f7 - f9, f8 - f10);
            float f11 = f9 - f7;
            float f12 = f10 - f8;
            float f13 = (((x6 - f7) * f11) + ((y6 - f8) * f12)) / (hypot * hypot);
            float f14 = f7 + (f11 * f13);
            float f15 = f8 + (f13 * f12);
            Path path = new Path();
            path.moveTo(x6, y6);
            path.lineTo(f14, f15);
            float hypot2 = (float) Math.hypot(f14 - x6, f15 - y6);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m(str, this.f7645h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f7655r.width() / 2), -20.0f, this.f7645h);
            canvas.drawLine(x6, y6, f14, f15, this.f7644g);
        }

        public final void i(Canvas canvas, float x6, float y6, int viewWidth, int viewHeight) {
            String str = "" + (((int) ((((x6 - (viewWidth / 2)) * 100.0f) / (s.this.getWidth() - viewWidth)) + 0.5d)) / 100.0f);
            m(str, this.f7645h);
            canvas.drawText(str, ((x6 / 2.0f) - (this.f7655r.width() / 2)) + 0.0f, y6 - 20.0f, this.f7645h);
            canvas.drawLine(x6, y6, Math.min(0.0f, 1.0f), y6, this.f7644g);
            String str2 = "" + (((int) ((((y6 - (viewHeight / 2)) * 100.0f) / (s.this.getHeight() - viewHeight)) + 0.5d)) / 100.0f);
            m(str2, this.f7645h);
            canvas.drawText(str2, x6 + 5.0f, 0.0f - ((y6 / 2.0f) - (this.f7655r.height() / 2)), this.f7645h);
            canvas.drawLine(x6, y6, x6, Math.max(0.0f, 1.0f), this.f7644g);
        }

        public final void j(Canvas canvas, o motionController) {
            this.f7641d.reset();
            for (int i7 = 0; i7 <= 50; i7++) {
                motionController.g(i7 / 50, this.f7647j, 0);
                Path path = this.f7641d;
                float[] fArr = this.f7647j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f7641d;
                float[] fArr2 = this.f7647j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f7641d;
                float[] fArr3 = this.f7647j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f7641d;
                float[] fArr4 = this.f7647j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f7641d.close();
            }
            this.f7642e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f7641d, this.f7642e);
            canvas.translate(-2.0f, -2.0f);
            this.f7642e.setColor(u0.a.f17311c);
            canvas.drawPath(this.f7641d, this.f7642e);
        }

        public final void k(Canvas canvas, int mode, int keyFrames, o motionController) {
            int i7;
            int i8;
            float f7;
            float f8;
            View view = motionController.f7547b;
            if (view != null) {
                i7 = view.getWidth();
                i8 = motionController.f7547b.getHeight();
            } else {
                i7 = 0;
                i8 = 0;
            }
            for (int i9 = 1; i9 < keyFrames - 1; i9++) {
                if (mode != 4 || this.f7639b[i9 - 1] != 0) {
                    float[] fArr = this.f7640c;
                    int i10 = i9 * 2;
                    float f9 = fArr[i10];
                    float f10 = fArr[i10 + 1];
                    this.f7641d.reset();
                    this.f7641d.moveTo(f9, f10 + 10.0f);
                    this.f7641d.lineTo(f9 + 10.0f, f10);
                    this.f7641d.lineTo(f9, f10 - 10.0f);
                    this.f7641d.lineTo(f9 - 10.0f, f10);
                    this.f7641d.close();
                    int i11 = i9 - 1;
                    motionController.w(i11);
                    if (mode == 4) {
                        int i12 = this.f7639b[i11];
                        if (i12 == 1) {
                            h(canvas, f9 - 0.0f, f10 - 0.0f);
                        } else if (i12 == 0) {
                            f(canvas, f9 - 0.0f, f10 - 0.0f);
                        } else if (i12 == 2) {
                            f7 = f10;
                            f8 = f9;
                            i(canvas, f9 - 0.0f, f10 - 0.0f, i7, i8);
                            canvas.drawPath(this.f7641d, this.f7646i);
                        }
                        f7 = f10;
                        f8 = f9;
                        canvas.drawPath(this.f7641d, this.f7646i);
                    } else {
                        f7 = f10;
                        f8 = f9;
                    }
                    if (mode == 2) {
                        h(canvas, f8 - 0.0f, f7 - 0.0f);
                    }
                    if (mode == 3) {
                        f(canvas, f8 - 0.0f, f7 - 0.0f);
                    }
                    if (mode == 6) {
                        i(canvas, f8 - 0.0f, f7 - 0.0f, i7, i8);
                    }
                    canvas.drawPath(this.f7641d, this.f7646i);
                }
            }
            float[] fArr2 = this.f7638a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f7643f);
                float[] fArr3 = this.f7638a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f7643f);
            }
        }

        public final void l(Canvas canvas, float x12, float y12, float x22, float y22) {
            canvas.drawRect(x12, y12, x22, y22, this.f7644g);
            canvas.drawLine(x12, y12, x22, y22, this.f7644g);
        }

        public void m(String text, Paint paint) {
            paint.getTextBounds(text, 0, text.length(), this.f7655r);
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public y.f f7659a = new y.f();

        /* renamed from: b  reason: collision with root package name */
        public y.f f7660b = new y.f();

        /* renamed from: c  reason: collision with root package name */
        public androidx.constraintlayout.widget.e f7661c = null;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.e f7662d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f7663e;

        /* renamed from: f  reason: collision with root package name */
        public int f7664f;

        public h() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.s.h.a():void");
        }

        public final void b(int widthMeasureSpec, int heightMeasureSpec) {
            int optimizationLevel = s.this.getOptimizationLevel();
            s sVar = s.this;
            if (sVar.f7588g == sVar.getStartState()) {
                s sVar2 = s.this;
                y.f fVar = this.f7660b;
                androidx.constraintlayout.widget.e eVar = this.f7662d;
                sVar2.resolveSystem(fVar, optimizationLevel, (eVar == null || eVar.f2259d == 0) ? widthMeasureSpec : heightMeasureSpec, (eVar == null || eVar.f2259d == 0) ? heightMeasureSpec : widthMeasureSpec);
                androidx.constraintlayout.widget.e eVar2 = this.f7661c;
                if (eVar2 != null) {
                    s sVar3 = s.this;
                    y.f fVar2 = this.f7659a;
                    int i7 = eVar2.f2259d;
                    int i8 = i7 == 0 ? widthMeasureSpec : heightMeasureSpec;
                    if (i7 == 0) {
                        widthMeasureSpec = heightMeasureSpec;
                    }
                    sVar3.resolveSystem(fVar2, optimizationLevel, i8, widthMeasureSpec);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.e eVar3 = this.f7661c;
            if (eVar3 != null) {
                s sVar4 = s.this;
                y.f fVar3 = this.f7659a;
                int i9 = eVar3.f2259d;
                sVar4.resolveSystem(fVar3, optimizationLevel, i9 == 0 ? widthMeasureSpec : heightMeasureSpec, i9 == 0 ? heightMeasureSpec : widthMeasureSpec);
            }
            s sVar5 = s.this;
            y.f fVar4 = this.f7660b;
            androidx.constraintlayout.widget.e eVar4 = this.f7662d;
            int i10 = (eVar4 == null || eVar4.f2259d == 0) ? widthMeasureSpec : heightMeasureSpec;
            if (eVar4 == null || eVar4.f2259d == 0) {
                widthMeasureSpec = heightMeasureSpec;
            }
            sVar5.resolveSystem(fVar4, optimizationLevel, i10, widthMeasureSpec);
        }

        public void c(y.f src, y.f dest) {
            ArrayList<y.e> l22 = src.l2();
            HashMap<y.e, y.e> hashMap = new HashMap<>();
            hashMap.put(src, dest);
            dest.l2().clear();
            dest.n(src, hashMap);
            Iterator<y.e> it = l22.iterator();
            while (it.hasNext()) {
                y.e next = it.next();
                y.e aVar = next instanceof y.a ? new y.a() : next instanceof y.h ? new y.h() : next instanceof y.g ? new y.g() : next instanceof y.l ? new y.l() : next instanceof y.i ? new y.j() : new y.e();
                dest.b(aVar);
                hashMap.put(next, aVar);
            }
            Iterator<y.e> it2 = l22.iterator();
            while (it2.hasNext()) {
                y.e next2 = it2.next();
                hashMap.get(next2).n(next2, hashMap);
            }
        }

        @SuppressLint({"LogConditional"})
        public final void d(String title, y.f c7) {
            String str = title + " " + c0.c.k((View) c7.w());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ========= ");
            sb.append(c7);
            int size = c7.l2().size();
            for (int i7 = 0; i7 < size; i7++) {
                String str2 = str + "[" + i7 + "] ";
                y.e eVar = c7.l2().get(i7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(eVar.R.f18535f != null ? "T" : "_");
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append(eVar.T.f18535f != null ? "B" : "_");
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                sb6.append(eVar.Q.f18535f != null ? "L" : "_");
                String sb7 = sb6.toString();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(sb7);
                sb8.append(eVar.S.f18535f != null ? "R" : "_");
                String sb9 = sb8.toString();
                View view = (View) eVar.w();
                String k7 = c0.c.k(view);
                if (view instanceof TextView) {
                    k7 = k7 + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str2);
                sb10.append("  ");
                sb10.append(k7);
                sb10.append(" ");
                sb10.append(eVar);
                sb10.append(" ");
                sb10.append(sb9);
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str);
            sb11.append(" done. ");
        }

        @SuppressLint({"LogConditional"})
        public final void e(String str, ConstraintLayout.b params) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(params.f2068t != -1 ? "SS" : "__");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(params.f2066s != -1 ? "|SE" : "|__");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(params.f2070u != -1 ? "|ES" : "|__");
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(params.f2072v != -1 ? "|EE" : "|__");
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append(params.f2038e != -1 ? "|LL" : "|__");
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            sb11.append(params.f2040f != -1 ? "|LR" : "|__");
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            sb13.append(params.f2042g != -1 ? "|RL" : "|__");
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            sb15.append(params.f2044h != -1 ? "|RR" : "|__");
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            sb17.append(params.f2046i != -1 ? "|TT" : "|__");
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            sb19.append(params.f2048j != -1 ? "|TB" : "|__");
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            sb21.append(params.f2050k != -1 ? "|BT" : "|__");
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(sb22);
            sb23.append(params.f2052l != -1 ? "|BB" : "|__");
            String sb24 = sb23.toString();
            StringBuilder sb25 = new StringBuilder();
            sb25.append(str);
            sb25.append(sb24);
        }

        @SuppressLint({"LogConditional"})
        public final void f(String str, y.e child) {
            String str2;
            String str3;
            String str4;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String str5 = "__";
            if (child.R.f18535f != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("T");
                sb2.append(child.R.f18535f.f18534e == d.b.TOP ? "T" : "B");
                str2 = sb2.toString();
            } else {
                str2 = "__";
            }
            sb.append(str2);
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            if (child.T.f18535f != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("B");
                sb5.append(child.T.f18535f.f18534e == d.b.TOP ? "T" : "B");
                str3 = sb5.toString();
            } else {
                str3 = "__";
            }
            sb4.append(str3);
            String sb6 = sb4.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            if (child.Q.f18535f != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("L");
                sb8.append(child.Q.f18535f.f18534e == d.b.LEFT ? "L" : "R");
                str4 = sb8.toString();
            } else {
                str4 = "__";
            }
            sb7.append(str4);
            String sb9 = sb7.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            if (child.S.f18535f != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("R");
                sb11.append(child.S.f18535f.f18534e == d.b.LEFT ? "L" : "R");
                str5 = sb11.toString();
            }
            sb10.append(str5);
            String sb12 = sb10.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append(sb12);
            sb13.append(" ---  ");
            sb13.append(child);
        }

        public y.e g(y.f container, View view) {
            if (container.w() == view) {
                return container;
            }
            ArrayList<y.e> l22 = container.l2();
            int size = l22.size();
            for (int i7 = 0; i7 < size; i7++) {
                y.e eVar = l22.get(i7);
                if (eVar.w() == view) {
                    return eVar;
                }
            }
            return null;
        }

        public void h(y.f baseLayout, androidx.constraintlayout.widget.e start, androidx.constraintlayout.widget.e end) {
            this.f7661c = start;
            this.f7662d = end;
            this.f7659a = new y.f();
            this.f7660b = new y.f();
            this.f7659a.U2(((ConstraintLayout) s.this).mLayoutWidget.G2());
            this.f7660b.U2(((ConstraintLayout) s.this).mLayoutWidget.G2());
            this.f7659a.p2();
            this.f7660b.p2();
            c(((ConstraintLayout) s.this).mLayoutWidget, this.f7659a);
            c(((ConstraintLayout) s.this).mLayoutWidget, this.f7660b);
            if (s.this.f7606p > 0.5d) {
                if (start != null) {
                    m(this.f7659a, start);
                }
                m(this.f7660b, end);
            } else {
                m(this.f7660b, end);
                if (start != null) {
                    m(this.f7659a, start);
                }
            }
            this.f7659a.Y2(s.this.isRtl());
            this.f7659a.a3();
            this.f7660b.Y2(s.this.isRtl());
            this.f7660b.a3();
            ViewGroup.LayoutParams layoutParams = s.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    y.f fVar = this.f7659a;
                    e.b bVar = e.b.WRAP_CONTENT;
                    fVar.D1(bVar);
                    this.f7660b.D1(bVar);
                }
                if (layoutParams.height == -2) {
                    y.f fVar2 = this.f7659a;
                    e.b bVar2 = e.b.WRAP_CONTENT;
                    fVar2.Y1(bVar2);
                    this.f7660b.Y1(bVar2);
                }
            }
        }

        public boolean i(int startId, int endId) {
            return (startId == this.f7663e && endId == this.f7664f) ? false : true;
        }

        public void j(int widthMeasureSpec, int heightMeasureSpec) {
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
            s sVar = s.this;
            sVar.f7591h0 = mode;
            sVar.f7593i0 = mode2;
            sVar.getOptimizationLevel();
            b(widthMeasureSpec, heightMeasureSpec);
            if (((s.this.getParent() instanceof s) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                b(widthMeasureSpec, heightMeasureSpec);
                s.this.f7583d0 = this.f7659a.m0();
                s.this.f7585e0 = this.f7659a.D();
                s.this.f7587f0 = this.f7660b.m0();
                s.this.f7589g0 = this.f7660b.D();
                s sVar2 = s.this;
                sVar2.f7581c0 = (sVar2.f7583d0 == sVar2.f7587f0 && sVar2.f7585e0 == sVar2.f7589g0) ? false : true;
            }
            s sVar3 = s.this;
            int i7 = sVar3.f7583d0;
            int i8 = sVar3.f7585e0;
            int i9 = sVar3.f7591h0;
            if (i9 == Integer.MIN_VALUE || i9 == 0) {
                i7 = (int) (i7 + (sVar3.f7595j0 * (sVar3.f7587f0 - i7)));
            }
            int i10 = i7;
            int i11 = sVar3.f7593i0;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                i8 = (int) (i8 + (sVar3.f7595j0 * (sVar3.f7589g0 - i8)));
            }
            s.this.resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, i10, i8, this.f7659a.P2() || this.f7660b.P2(), this.f7659a.N2() || this.f7660b.N2());
        }

        public void k() {
            j(s.this.f7592i, s.this.f7594j);
            s.this.x0();
        }

        public void l(int startId, int endId) {
            this.f7663e = startId;
            this.f7664f = endId;
        }

        public final void m(y.f base, androidx.constraintlayout.widget.e cSet) {
            SparseArray<y.e> sparseArray = new SparseArray<>();
            f.a aVar = new f.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, base);
            sparseArray.put(s.this.getId(), base);
            if (cSet != null && cSet.f2259d != 0) {
                s sVar = s.this;
                sVar.resolveSystem(this.f7660b, sVar.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(s.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(s.this.getWidth(), 1073741824));
            }
            Iterator<y.e> it = base.l2().iterator();
            while (it.hasNext()) {
                y.e next = it.next();
                next.f1(true);
                sparseArray.put(((View) next.w()).getId(), next);
            }
            Iterator<y.e> it2 = base.l2().iterator();
            while (it2.hasNext()) {
                y.e next2 = it2.next();
                View view = (View) next2.w();
                cSet.u(view.getId(), aVar);
                next2.c2(cSet.u0(view.getId()));
                next2.y1(cSet.n0(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    cSet.s((androidx.constraintlayout.widget.b) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).I();
                    }
                }
                aVar.resolveLayoutDirection(s.this.getLayoutDirection());
                s.this.applyConstraintsFromLayoutParams(false, view, next2, aVar, sparseArray);
                if (cSet.t0(view.getId()) == 1) {
                    next2.b2(view.getVisibility());
                } else {
                    next2.b2(cSet.s0(view.getId()));
                }
            }
            Iterator<y.e> it3 = base.l2().iterator();
            while (it3.hasNext()) {
                y.e next3 = it3.next();
                if (next3 instanceof y.n) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) next3.w();
                    y.i iVar = (y.i) next3;
                    bVar.H(base, iVar, sparseArray);
                    ((y.n) iVar).n2();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(int units, float maxVelocity);

        float b(int id);

        void c(MotionEvent event);

        void clear();

        float d();

        float e();

        void f();

        void g(int units);

        float h(int id);
    }

    /* loaded from: classes.dex */
    public static class j implements i {

        /* renamed from: b  reason: collision with root package name */
        public static j f7666b = new j();

        /* renamed from: a  reason: collision with root package name */
        public VelocityTracker f7667a;

        public static j i() {
            f7666b.f7667a = VelocityTracker.obtain();
            return f7666b;
        }

        @Override // c0.s.i
        public void a(int units, float maxVelocity) {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units, maxVelocity);
            }
        }

        @Override // c0.s.i
        public float b(int id) {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(id);
            }
            return 0.0f;
        }

        @Override // c0.s.i
        public void c(MotionEvent event) {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
        }

        @Override // c0.s.i
        public void clear() {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // c0.s.i
        public float d() {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // c0.s.i
        public float e() {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // c0.s.i
        public void f() {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7667a = null;
            }
        }

        @Override // c0.s.i
        public void g(int units) {
            VelocityTracker velocityTracker = this.f7667a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units);
            }
        }

        @Override // c0.s.i
        public float h(int id) {
            if (this.f7667a != null) {
                return h(id);
            }
            return 0.0f;
        }
    }

    /* loaded from: classes.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        public float f7668a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f7669b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f7670c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f7671d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final String f7672e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        public final String f7673f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        public final String f7674g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        public final String f7675h = "motion.EndState";

        public k() {
        }

        public void a() {
            int i7 = this.f7670c;
            if (i7 != -1 || this.f7671d != -1) {
                if (i7 == -1) {
                    s.this.E0(this.f7671d);
                } else {
                    int i8 = this.f7671d;
                    if (i8 == -1) {
                        s.this.setState(i7, -1, -1);
                    } else {
                        s.this.w0(i7, i8);
                    }
                }
                s.this.setState(m.SETUP);
            }
            if (Float.isNaN(this.f7669b)) {
                if (Float.isNaN(this.f7668a)) {
                    return;
                }
                s.this.setProgress(this.f7668a);
                return;
            }
            s.this.v0(this.f7668a, this.f7669b);
            this.f7668a = Float.NaN;
            this.f7669b = Float.NaN;
            this.f7670c = -1;
            this.f7671d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f7668a);
            bundle.putFloat("motion.velocity", this.f7669b);
            bundle.putInt("motion.StartState", this.f7670c);
            bundle.putInt("motion.EndState", this.f7671d);
            return bundle;
        }

        public void c() {
            this.f7671d = s.this.f7590h;
            this.f7670c = s.this.f7586f;
            this.f7669b = s.this.getVelocity();
            this.f7668a = s.this.getProgress();
        }

        public void d(int endState) {
            this.f7671d = endState;
        }

        public void e(float progress) {
            this.f7668a = progress;
        }

        public void f(int startState) {
            this.f7670c = startState;
        }

        public void g(Bundle bundle) {
            this.f7668a = bundle.getFloat("motion.progress");
            this.f7669b = bundle.getFloat("motion.velocity");
            this.f7670c = bundle.getInt("motion.StartState");
            this.f7671d = bundle.getInt("motion.EndState");
        }

        public void h(float mVelocity) {
            this.f7669b = mVelocity;
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        void c(s motionLayout, int startId, int endId);

        void d(s motionLayout, int startId, int endId, float progress);

        void g(s motionLayout, int triggerId, boolean positive, float progress);

        void h(s motionLayout, int currentId);
    }

    /* loaded from: classes.dex */
    public enum m {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public s(@o0 Context context) {
        super(context);
        this.f7582d = null;
        this.f7584e = 0.0f;
        this.f7586f = -1;
        this.f7588g = -1;
        this.f7590h = -1;
        this.f7592i = 0;
        this.f7594j = 0;
        this.f7596k = true;
        this.f7598l = new HashMap<>();
        this.f7600m = 0L;
        this.f7602n = 1.0f;
        this.f7604o = 0.0f;
        this.f7606p = 0.0f;
        this.f7610r = 0.0f;
        this.f7614t = false;
        this.f7616u = false;
        this.f7624y = 0;
        this.A = false;
        this.B = new b0.b();
        this.C = new f();
        this.E = true;
        this.J = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = 0;
        this.U = -1L;
        this.V = 0.0f;
        this.W = 0;
        this.f7577a0 = 0.0f;
        this.f7579b0 = false;
        this.f7581c0 = false;
        this.f7597k0 = new u.g();
        this.f7599l0 = false;
        this.f7603n0 = null;
        this.f7605o0 = null;
        this.f7607p0 = 0;
        this.f7609q0 = false;
        this.f7611r0 = 0;
        this.f7613s0 = new HashMap<>();
        this.f7621w0 = new Rect();
        this.f7623x0 = false;
        this.f7625y0 = m.UNDEFINED;
        this.f7627z0 = new h();
        this.A0 = false;
        this.B0 = new RectF();
        this.C0 = null;
        this.D0 = null;
        this.E0 = new ArrayList<>();
        g0(null);
    }

    public static boolean M0(float velocity, float position, float maxAcceleration) {
        if (velocity > 0.0f) {
            float f7 = velocity / maxAcceleration;
            return position + ((velocity * f7) - (((maxAcceleration * f7) * f7) / 2.0f)) > 1.0f;
        }
        float f8 = (-velocity) / maxAcceleration;
        return position + ((velocity * f8) + (((maxAcceleration * f8) * f8) / 2.0f)) < 0.0f;
    }

    public void A0(float position, float currentVelocity) {
        if (this.f7578b == null || this.f7606p == position) {
            return;
        }
        this.A = true;
        this.f7600m = getNanoTime();
        this.f7602n = this.f7578b.t() / 1000.0f;
        this.f7610r = position;
        this.f7614t = true;
        this.B.f(this.f7606p, position, currentVelocity, this.f7578b.J(), this.f7578b.K(), this.f7578b.I(), this.f7578b.L(), this.f7578b.H());
        int i7 = this.f7588g;
        this.f7610r = position;
        this.f7588g = i7;
        this.f7580c = this.B;
        this.f7612s = false;
        this.f7600m = getNanoTime();
        invalidate();
    }

    public void B0() {
        F(1.0f);
        this.f7603n0 = null;
    }

    public void C0(Runnable onComplete) {
        F(1.0f);
        this.f7603n0 = onComplete;
    }

    public void D0() {
        F(0.0f);
    }

    public void E(l listener) {
        if (this.S == null) {
            this.S = new CopyOnWriteArrayList<>();
        }
        this.S.add(listener);
    }

    public void E0(int id) {
        if (isAttachedToWindow()) {
            G0(id, -1, -1);
            return;
        }
        if (this.f7601m0 == null) {
            this.f7601m0 = new k();
        }
        this.f7601m0.d(id);
    }

    public void F(float position) {
        if (this.f7578b == null) {
            return;
        }
        float f7 = this.f7606p;
        float f8 = this.f7604o;
        if (f7 != f8 && this.f7612s) {
            this.f7606p = f8;
        }
        float f9 = this.f7606p;
        if (f9 == position) {
            return;
        }
        this.A = false;
        this.f7610r = position;
        this.f7602n = r0.t() / 1000.0f;
        setProgress(this.f7610r);
        this.f7580c = null;
        this.f7582d = this.f7578b.x();
        this.f7612s = false;
        this.f7600m = getNanoTime();
        this.f7614t = true;
        this.f7604o = f9;
        this.f7606p = f9;
        invalidate();
    }

    public void F0(int id, int duration) {
        if (isAttachedToWindow()) {
            H0(id, -1, -1, duration);
            return;
        }
        if (this.f7601m0 == null) {
            this.f7601m0 = new k();
        }
        this.f7601m0.d(id);
    }

    public boolean G(int viewTransitionId, o motionController) {
        u uVar = this.f7578b;
        if (uVar != null) {
            return uVar.h(viewTransitionId, motionController);
        }
        return false;
    }

    public void G0(int id, int screenWidth, int screenHeight) {
        H0(id, screenWidth, screenHeight, -1);
    }

    public final boolean H(View view, MotionEvent event, float offsetX, float offsetY) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            event.offsetLocation(offsetX, offsetY);
            boolean onTouchEvent = view.onTouchEvent(event);
            event.offsetLocation(-offsetX, -offsetY);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(event);
        obtain.offsetLocation(offsetX, offsetY);
        if (this.D0 == null) {
            this.D0 = new Matrix();
        }
        matrix.invert(this.D0);
        obtain.transform(this.D0);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    public void H0(int id, int screenWidth, int screenHeight, int duration) {
        androidx.constraintlayout.widget.n nVar;
        int a7;
        u uVar = this.f7578b;
        if (uVar != null && (nVar = uVar.f7704b) != null && (a7 = nVar.a(this.f7588g, id, screenWidth, screenHeight)) != -1) {
            id = a7;
        }
        int i7 = this.f7588g;
        if (i7 == id) {
            return;
        }
        if (this.f7586f == id) {
            F(0.0f);
            if (duration > 0) {
                this.f7602n = duration / 1000.0f;
            }
        } else if (this.f7590h == id) {
            F(1.0f);
            if (duration > 0) {
                this.f7602n = duration / 1000.0f;
            }
        } else {
            this.f7590h = id;
            if (i7 != -1) {
                w0(i7, id);
                F(1.0f);
                this.f7606p = 0.0f;
                B0();
                if (duration > 0) {
                    this.f7602n = duration / 1000.0f;
                    return;
                }
                return;
            }
            this.A = false;
            this.f7610r = 1.0f;
            this.f7604o = 0.0f;
            this.f7606p = 0.0f;
            this.f7608q = getNanoTime();
            this.f7600m = getNanoTime();
            this.f7612s = false;
            this.f7580c = null;
            if (duration == -1) {
                this.f7602n = this.f7578b.t() / 1000.0f;
            }
            this.f7586f = -1;
            this.f7578b.n0(-1, this.f7590h);
            SparseArray sparseArray = new SparseArray();
            if (duration == 0) {
                this.f7602n = this.f7578b.t() / 1000.0f;
            } else if (duration > 0) {
                this.f7602n = duration / 1000.0f;
            }
            int childCount = getChildCount();
            this.f7598l.clear();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                this.f7598l.put(childAt, new o(childAt));
                sparseArray.put(childAt.getId(), this.f7598l.get(childAt));
            }
            this.f7614t = true;
            this.f7627z0.h(this.mLayoutWidget, null, this.f7578b.o(id));
            r0();
            this.f7627z0.a();
            M();
            int width = getWidth();
            int height = getHeight();
            if (this.R != null) {
                for (int i9 = 0; i9 < childCount; i9++) {
                    o oVar = this.f7598l.get(getChildAt(i9));
                    if (oVar != null) {
                        this.f7578b.z(oVar);
                    }
                }
                Iterator<p> it = this.R.iterator();
                while (it.hasNext()) {
                    it.next().f(this, this.f7598l);
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    o oVar2 = this.f7598l.get(getChildAt(i10));
                    if (oVar2 != null) {
                        oVar2.a0(width, height, this.f7602n, getNanoTime());
                    }
                }
            } else {
                for (int i11 = 0; i11 < childCount; i11++) {
                    o oVar3 = this.f7598l.get(getChildAt(i11));
                    if (oVar3 != null) {
                        this.f7578b.z(oVar3);
                        oVar3.a0(width, height, this.f7602n, getNanoTime());
                    }
                }
            }
            float M = this.f7578b.M();
            if (M != 0.0f) {
                float f7 = Float.MAX_VALUE;
                float f8 = -3.4028235E38f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    o oVar4 = this.f7598l.get(getChildAt(i12));
                    float u6 = oVar4.u() + oVar4.t();
                    f7 = Math.min(f7, u6);
                    f8 = Math.max(f8, u6);
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    o oVar5 = this.f7598l.get(getChildAt(i13));
                    float t6 = oVar5.t();
                    float u7 = oVar5.u();
                    oVar5.f7560o = 1.0f / (1.0f - M);
                    oVar5.f7559n = M - ((((t6 + u7) - f7) * M) / (f8 - f7));
                }
            }
            this.f7604o = 0.0f;
            this.f7606p = 0.0f;
            this.f7614t = true;
            invalidate();
        }
    }

    public final void I() {
        u uVar = this.f7578b;
        if (uVar == null) {
            Log.e(N0, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int N = uVar.N();
        u uVar2 = this.f7578b;
        J(N, uVar2.o(uVar2.N()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<u.b> it = this.f7578b.s().iterator();
        while (it.hasNext()) {
            u.b next = it.next();
            u.b bVar = this.f7578b.f7705c;
            K(next);
            int I = next.I();
            int B = next.B();
            String i7 = c0.c.i(getContext(), I);
            String i8 = c0.c.i(getContext(), B);
            if (sparseIntArray.get(I) == B) {
                Log.e(N0, "CHECK: two transitions with the same start and end " + i7 + "->" + i8);
            }
            if (sparseIntArray2.get(B) == I) {
                Log.e(N0, "CHECK: you can't have reverse transitions" + i7 + "->" + i8);
            }
            sparseIntArray.put(I, B);
            sparseIntArray2.put(B, I);
            if (this.f7578b.o(I) == null) {
                Log.e(N0, " no such constraintSetStart " + i7);
            }
            if (this.f7578b.o(B) == null) {
                Log.e(N0, " no such constraintSetEnd " + i7);
            }
        }
    }

    public void I0() {
        this.f7627z0.h(this.mLayoutWidget, this.f7578b.o(this.f7586f), this.f7578b.o(this.f7590h));
        r0();
    }

    public final void J(int csetId, androidx.constraintlayout.widget.e set) {
        String i7 = c0.c.i(getContext(), csetId);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(N0, "CHECK: " + i7 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (set.k0(id) == null) {
                Log.w(N0, "CHECK: " + i7 + " NO CONSTRAINTS for " + c0.c.k(childAt));
            }
        }
        int[] o02 = set.o0();
        for (int i9 = 0; i9 < o02.length; i9++) {
            int i10 = o02[i9];
            String i11 = c0.c.i(getContext(), i10);
            if (findViewById(o02[i9]) == null) {
                Log.w(N0, "CHECK: " + i7 + " NO View matches id " + i11);
            }
            if (set.n0(i10) == -1) {
                Log.w(N0, "CHECK: " + i7 + "(" + i11 + ") no LAYOUT_HEIGHT");
            }
            if (set.u0(i10) == -1) {
                Log.w(N0, "CHECK: " + i7 + "(" + i11 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    public void J0(int stateId, androidx.constraintlayout.widget.e set) {
        u uVar = this.f7578b;
        if (uVar != null) {
            uVar.j0(stateId, set);
        }
        I0();
        if (this.f7588g == stateId) {
            set.r(this);
        }
    }

    public final void K(u.b transition) {
        if (transition.I() == transition.B()) {
            Log.e(N0, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public void K0(int stateId, androidx.constraintlayout.widget.e set, int duration) {
        if (this.f7578b != null && this.f7588g == stateId) {
            J0(k.g.N3, Z(stateId));
            setState(k.g.N3, -1, -1);
            J0(stateId, set);
            u.b bVar = new u.b(-1, this.f7578b, k.g.N3, stateId);
            bVar.O(duration);
            setTransition(bVar);
            B0();
        }
    }

    public androidx.constraintlayout.widget.e L(int id) {
        u uVar = this.f7578b;
        if (uVar == null) {
            return null;
        }
        androidx.constraintlayout.widget.e o6 = uVar.o(id);
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.I(o6);
        return eVar;
    }

    public void L0(int viewTransitionId, View... view) {
        u uVar = this.f7578b;
        if (uVar != null) {
            uVar.t0(viewTransitionId, view);
        } else {
            Log.e(N0, " no motionScene");
        }
    }

    public final void M() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            o oVar = this.f7598l.get(childAt);
            if (oVar != null) {
                oVar.V(childAt);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    public final void N() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(c0.c.g());
            sb.append(" ");
            sb.append(c0.c.k(this));
            sb.append(" ");
            sb.append(c0.c.i(getContext(), this.f7588g));
            sb.append(" ");
            sb.append(c0.c.k(childAt));
            sb.append(childAt.getLeft());
            sb.append(" ");
            sb.append(childAt.getTop());
        }
    }

    public void O(boolean disable) {
        u uVar = this.f7578b;
        if (uVar == null) {
            return;
        }
        uVar.k(disable);
    }

    public void P(int transitionID, boolean enable) {
        u.b d02 = d0(transitionID);
        if (enable) {
            d02.Q(true);
            return;
        }
        u uVar = this.f7578b;
        if (d02 == uVar.f7705c) {
            Iterator<u.b> it = uVar.Q(this.f7588g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u.b next = it.next();
                if (next.K()) {
                    this.f7578b.f7705c = next;
                    break;
                }
            }
        }
        d02.Q(false);
    }

    public void Q(int viewTransitionId, boolean enable) {
        u uVar = this.f7578b;
        if (uVar != null) {
            uVar.l(viewTransitionId, enable);
        }
    }

    public void R(boolean start) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            o oVar = this.f7598l.get(getChildAt(i7));
            if (oVar != null) {
                oVar.i(start);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(boolean r23) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.S(boolean):void");
    }

    public final void T() {
        boolean z6;
        float signum = Math.signum(this.f7610r - this.f7606p);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f7580c;
        float f7 = this.f7606p + (!(interpolator instanceof b0.b) ? ((((float) (nanoTime - this.f7608q)) * signum) * 1.0E-9f) / this.f7602n : 0.0f);
        if (this.f7612s) {
            f7 = this.f7610r;
        }
        int i7 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i7 <= 0 || f7 < this.f7610r) && (signum > 0.0f || f7 > this.f7610r)) {
            z6 = false;
        } else {
            f7 = this.f7610r;
            z6 = true;
        }
        if (interpolator != null && !z6) {
            f7 = this.A ? interpolator.getInterpolation(((float) (nanoTime - this.f7600m)) * 1.0E-9f) : interpolator.getInterpolation(f7);
        }
        if ((i7 > 0 && f7 >= this.f7610r) || (signum <= 0.0f && f7 <= this.f7610r)) {
            f7 = this.f7610r;
        }
        this.f7595j0 = f7;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f7582d;
        if (interpolator2 != null) {
            f7 = interpolator2.getInterpolation(f7);
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            o oVar = this.f7598l.get(childAt);
            if (oVar != null) {
                oVar.L(childAt, f7, nanoTime2, this.f7597k0);
            }
        }
        if (this.f7581c0) {
            requestLayout();
        }
    }

    public final void U() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f7618v == null && ((copyOnWriteArrayList = this.S) == null || copyOnWriteArrayList.isEmpty())) || this.f7577a0 == this.f7604o) {
            return;
        }
        if (this.W != -1) {
            l lVar = this.f7618v;
            if (lVar != null) {
                lVar.c(this, this.f7586f, this.f7590h);
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.S;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.f7586f, this.f7590h);
                }
            }
            this.f7579b0 = true;
        }
        this.W = -1;
        float f7 = this.f7604o;
        this.f7577a0 = f7;
        l lVar2 = this.f7618v;
        if (lVar2 != null) {
            lVar2.d(this, this.f7586f, this.f7590h, f7);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList3 = this.S;
        if (copyOnWriteArrayList3 != null) {
            Iterator<l> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().d(this, this.f7586f, this.f7590h, this.f7604o);
            }
        }
        this.f7579b0 = true;
    }

    public void V() {
        int i7;
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f7618v != null || ((copyOnWriteArrayList = this.S) != null && !copyOnWriteArrayList.isEmpty())) && this.W == -1) {
            this.W = this.f7588g;
            if (this.E0.isEmpty()) {
                i7 = -1;
            } else {
                ArrayList<Integer> arrayList = this.E0;
                i7 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i8 = this.f7588g;
            if (i7 != i8 && i8 != -1) {
                this.E0.add(Integer.valueOf(i8));
            }
        }
        p0();
        Runnable runnable = this.f7603n0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f7605o0;
        if (iArr == null || this.f7607p0 <= 0) {
            return;
        }
        E0(iArr[0]);
        int[] iArr2 = this.f7605o0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f7607p0--;
    }

    public final void W(s motionLayout, int mBeginState, int mEndState) {
        l lVar = this.f7618v;
        if (lVar != null) {
            lVar.c(this, mBeginState, mEndState);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.S;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(motionLayout, mBeginState, mEndState);
            }
        }
    }

    public void X(int triggerId, boolean positive, float progress) {
        l lVar = this.f7618v;
        if (lVar != null) {
            lVar.g(this, triggerId, positive, progress);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.S;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().g(this, triggerId, positive, progress);
            }
        }
    }

    public void Y(int mTouchAnchorId, float pos, float locationX, float locationY, float[] mAnchorDpDt) {
        String resourceName;
        HashMap<View, o> hashMap = this.f7598l;
        View viewById = getViewById(mTouchAnchorId);
        o oVar = hashMap.get(viewById);
        if (oVar != null) {
            oVar.p(pos, locationX, locationY, mAnchorDpDt);
            float y6 = viewById.getY();
            this.f7620w = pos;
            this.f7622x = y6;
            return;
        }
        if (viewById == null) {
            resourceName = "" + mTouchAnchorId;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(mTouchAnchorId);
        }
        Log.w(N0, "WARNING could not find view id " + resourceName);
    }

    public androidx.constraintlayout.widget.e Z(int id) {
        u uVar = this.f7578b;
        if (uVar == null) {
            return null;
        }
        return uVar.o(id);
    }

    public String a0(int id) {
        u uVar = this.f7578b;
        if (uVar == null) {
            return null;
        }
        return uVar.X(id);
    }

    public void b0(boolean showPaths) {
        this.f7624y = showPaths ? 2 : 1;
        invalidate();
    }

    public o c0(int mTouchAnchorId) {
        return this.f7598l.get(findViewById(mTouchAnchorId));
    }

    public u.b d0(int id) {
        return this.f7578b.O(id);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c0 c0Var;
        ArrayList<p> arrayList = this.R;
        if (arrayList != null) {
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(canvas);
            }
        }
        S(false);
        u uVar = this.f7578b;
        if (uVar != null && (c0Var = uVar.f7721s) != null) {
            c0Var.d();
        }
        super.dispatchDraw(canvas);
        if (this.f7578b == null) {
            return;
        }
        if ((this.f7624y & 1) == 1 && !isInEditMode()) {
            this.T++;
            long nanoTime = getNanoTime();
            long j7 = this.U;
            if (j7 != -1) {
                if (nanoTime - j7 > 200000000) {
                    this.V = ((int) ((this.T / (((float) r5) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.T = 0;
                    this.U = nanoTime;
                }
            } else {
                this.U = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.V + " fps " + c0.c.l(this, this.f7586f) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(c0.c.l(this, this.f7590h));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i7 = this.f7588g;
            sb.append(i7 == -1 ? "undefined" : c0.c.l(this, i7));
            String sb2 = sb.toString();
            paint.setColor(u1.f3816t);
            canvas.drawText(sb2, 11.0f, (float) (getHeight() - 29), paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, (float) (getHeight() - 30), paint);
        }
        if (this.f7624y > 1) {
            if (this.f7626z == null) {
                this.f7626z = new g();
            }
            this.f7626z.a(canvas, this.f7598l, this.f7578b.t(), this.f7624y);
        }
        ArrayList<p> arrayList2 = this.R;
        if (arrayList2 != null) {
            Iterator<p> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().b(canvas);
            }
        }
    }

    public void e0(View view, float posOnViewX, float posOnViewY, float[] returnVelocity, int type) {
        float f7;
        float f8 = this.f7584e;
        float f9 = this.f7606p;
        if (this.f7580c != null) {
            float signum = Math.signum(this.f7610r - f9);
            float interpolation = this.f7580c.getInterpolation(this.f7606p + 1.0E-5f);
            f7 = this.f7580c.getInterpolation(this.f7606p);
            f8 = (signum * ((interpolation - f7) / 1.0E-5f)) / this.f7602n;
        } else {
            f7 = f9;
        }
        Interpolator interpolator = this.f7580c;
        if (interpolator instanceof r) {
            f8 = ((r) interpolator).a();
        }
        o oVar = this.f7598l.get(view);
        if ((type & 1) == 0) {
            oVar.C(f7, view.getWidth(), view.getHeight(), posOnViewX, posOnViewY, returnVelocity);
        } else {
            oVar.p(f7, posOnViewX, posOnViewY, returnVelocity);
        }
        if (type < 2) {
            returnVelocity[0] = returnVelocity[0] * f8;
            returnVelocity[1] = returnVelocity[1] * f8;
        }
    }

    public final boolean f0(float x6, float y6, View view, MotionEvent event) {
        boolean z6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (f0((r3.getLeft() + x6) - view.getScrollX(), (r3.getTop() + y6) - view.getScrollY(), viewGroup.getChildAt(childCount), event)) {
                    z6 = true;
                    break;
                }
            }
        }
        z6 = false;
        if (!z6) {
            this.B0.set(x6, y6, (view.getRight() + x6) - view.getLeft(), (view.getBottom() + y6) - view.getTop());
            if ((event.getAction() != 0 || this.B0.contains(event.getX(), event.getY())) && H(view, event, -x6, -y6)) {
                return true;
            }
        }
        return z6;
    }

    public final void g0(AttributeSet attrs) {
        u uVar;
        P0 = isInEditMode();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.ik);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z6 = true;
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.lk) {
                    this.f7578b = new u(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == k.m.kk) {
                    this.f7588g = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == k.m.nk) {
                    this.f7610r = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f7614t = true;
                } else if (index == k.m.jk) {
                    z6 = obtainStyledAttributes.getBoolean(index, z6);
                } else if (index == k.m.ok) {
                    if (this.f7624y == 0) {
                        this.f7624y = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == k.m.mk) {
                    this.f7624y = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f7578b == null) {
                Log.e(N0, "WARNING NO app:layoutDescription tag");
            }
            if (!z6) {
                this.f7578b = null;
            }
        }
        if (this.f7624y != 0) {
            I();
        }
        if (this.f7588g != -1 || (uVar = this.f7578b) == null) {
            return;
        }
        this.f7588g = uVar.N();
        this.f7586f = this.f7578b.N();
        this.f7590h = this.f7578b.u();
    }

    public int[] getConstraintSetIds() {
        u uVar = this.f7578b;
        if (uVar == null) {
            return null;
        }
        return uVar.r();
    }

    public int getCurrentState() {
        return this.f7588g;
    }

    public ArrayList<u.b> getDefinedTransitions() {
        u uVar = this.f7578b;
        if (uVar == null) {
            return null;
        }
        return uVar.s();
    }

    public c0.d getDesignTool() {
        if (this.D == null) {
            this.D = new c0.d(this);
        }
        return this.D;
    }

    public int getEndState() {
        return this.f7590h;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f7606p;
    }

    public u getScene() {
        return this.f7578b;
    }

    public int getStartState() {
        return this.f7586f;
    }

    public float getTargetPosition() {
        return this.f7610r;
    }

    public Bundle getTransitionState() {
        if (this.f7601m0 == null) {
            this.f7601m0 = new k();
        }
        this.f7601m0.c();
        return this.f7601m0.b();
    }

    public long getTransitionTimeMs() {
        if (this.f7578b != null) {
            this.f7602n = r0.t() / 1000.0f;
        }
        return this.f7602n * 1000.0f;
    }

    public float getVelocity() {
        return this.f7584e;
    }

    public boolean h0() {
        return this.f7623x0;
    }

    public boolean i0() {
        return this.f7609q0;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean j0() {
        return this.f7596k;
    }

    public boolean k0(int viewTransitionId) {
        u uVar = this.f7578b;
        if (uVar != null) {
            return uVar.U(viewTransitionId);
        }
        return false;
    }

    public void l0(int id) {
        if (!isAttachedToWindow()) {
            this.f7588g = id;
        }
        if (this.f7586f == id) {
            setProgress(0.0f);
        } else if (this.f7590h == id) {
            setProgress(1.0f);
        } else {
            w0(id, id);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int motionScene) {
        u.b bVar;
        if (motionScene == 0) {
            this.f7578b = null;
            return;
        }
        try {
            u uVar = new u(getContext(), this, motionScene);
            this.f7578b = uVar;
            if (this.f7588g == -1) {
                this.f7588g = uVar.N();
                this.f7586f = this.f7578b.N();
                this.f7590h = this.f7578b.u();
            }
            if (!isAttachedToWindow()) {
                this.f7578b = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.f7619v0 = display == null ? 0 : display.getRotation();
                u uVar2 = this.f7578b;
                if (uVar2 != null) {
                    androidx.constraintlayout.widget.e o6 = uVar2.o(this.f7588g);
                    this.f7578b.h0(this);
                    ArrayList<p> arrayList = this.R;
                    if (arrayList != null) {
                        Iterator<p> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().k(this);
                        }
                    }
                    if (o6 != null) {
                        o6.r(this);
                    }
                    this.f7586f = this.f7588g;
                }
                o0();
                k kVar = this.f7601m0;
                if (kVar != null) {
                    if (this.f7623x0) {
                        post(new a());
                        return;
                    } else {
                        kVar.a();
                        return;
                    }
                }
                u uVar3 = this.f7578b;
                if (uVar3 == null || (bVar = uVar3.f7705c) == null || bVar.z() != 4) {
                    return;
                }
                B0();
                setState(m.SETUP);
                setState(m.MOVING);
            } catch (Exception e7) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e7);
            }
        } catch (Exception e8) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e8);
        }
    }

    public int m0(String id) {
        u uVar = this.f7578b;
        if (uVar == null) {
            return 0;
        }
        return uVar.W(id);
    }

    public i n0() {
        return j.i();
    }

    public void o0() {
        u uVar = this.f7578b;
        if (uVar == null) {
            return;
        }
        if (uVar.i(this, this.f7588g)) {
            requestLayout();
            return;
        }
        int i7 = this.f7588g;
        if (i7 != -1) {
            this.f7578b.f(this, i7);
        }
        if (this.f7578b.r0()) {
            this.f7578b.p0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        u.b bVar;
        int i7;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f7619v0 = display.getRotation();
        }
        u uVar = this.f7578b;
        if (uVar != null && (i7 = this.f7588g) != -1) {
            androidx.constraintlayout.widget.e o6 = uVar.o(i7);
            this.f7578b.h0(this);
            ArrayList<p> arrayList = this.R;
            if (arrayList != null) {
                Iterator<p> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().k(this);
                }
            }
            if (o6 != null) {
                o6.r(this);
            }
            this.f7586f = this.f7588g;
        }
        o0();
        k kVar = this.f7601m0;
        if (kVar != null) {
            if (this.f7623x0) {
                post(new d());
                return;
            } else {
                kVar.a();
                return;
            }
        }
        u uVar2 = this.f7578b;
        if (uVar2 == null || (bVar = uVar2.f7705c) == null || bVar.z() != 4) {
            return;
        }
        B0();
        setState(m.SETUP);
        setState(m.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        x J;
        int s6;
        RectF r6;
        u uVar = this.f7578b;
        if (uVar != null && this.f7596k) {
            c0 c0Var = uVar.f7721s;
            if (c0Var != null) {
                c0Var.l(event);
            }
            u.b bVar = this.f7578b.f7705c;
            if (bVar != null && bVar.K() && (J = bVar.J()) != null && ((event.getAction() != 0 || (r6 = J.r(this, new RectF())) == null || r6.contains(event.getX(), event.getY())) && (s6 = J.s()) != -1)) {
                View view = this.C0;
                if (view == null || view.getId() != s6) {
                    this.C0 = findViewById(s6);
                }
                if (this.C0 != null) {
                    this.B0.set(r0.getLeft(), this.C0.getTop(), this.C0.getRight(), this.C0.getBottom());
                    if (this.B0.contains(event.getX(), event.getY()) && !f0(this.C0.getLeft(), this.C0.getTop(), this.C0, event)) {
                        return onTouchEvent(event);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.f7599l0 = true;
        try {
            if (this.f7578b == null) {
                super.onLayout(changed, left, top, right, bottom);
                return;
            }
            int i7 = right - left;
            int i8 = bottom - top;
            if (this.H != i7 || this.I != i8) {
                r0();
                S(true);
            }
            this.H = i7;
            this.I = i8;
            this.F = i7;
            this.G = i8;
        } finally {
            this.f7599l0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f7578b == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        boolean z6 = false;
        boolean z7 = (this.f7592i == widthMeasureSpec && this.f7594j == heightMeasureSpec) ? false : true;
        if (this.A0) {
            this.A0 = false;
            o0();
            p0();
            z7 = true;
        }
        if (this.mDirtyHierarchy) {
            z7 = true;
        }
        this.f7592i = widthMeasureSpec;
        this.f7594j = heightMeasureSpec;
        int N = this.f7578b.N();
        int u6 = this.f7578b.u();
        if ((z7 || this.f7627z0.i(N, u6)) && this.f7586f != -1) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.f7627z0.h(this.mLayoutWidget, this.f7578b.o(N), this.f7578b.o(u6));
            this.f7627z0.k();
            this.f7627z0.l(N, u6);
        } else {
            if (z7) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            z6 = true;
        }
        if (this.f7581c0 || z6) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int m02 = this.mLayoutWidget.m0() + getPaddingLeft() + getPaddingRight();
            int D = this.mLayoutWidget.D() + paddingTop;
            int i7 = this.f7591h0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                m02 = (int) (this.f7583d0 + (this.f7595j0 * (this.f7587f0 - r8)));
                requestLayout();
            }
            int i8 = this.f7593i0;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                D = (int) (this.f7585e0 + (this.f7595j0 * (this.f7589g0 - r8)));
                requestLayout();
            }
            setMeasuredDimension(m02, D);
        }
        T();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedFling(@o0 View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.i1
    public boolean onNestedPreFling(@o0 View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // androidx.core.view.g1
    public void onNestedPreScroll(@o0 View target, int dx, int dy, @o0 int[] consumed, int type) {
        u.b bVar;
        x J;
        int s6;
        u uVar = this.f7578b;
        if (uVar == null || (bVar = uVar.f7705c) == null || !bVar.K()) {
            return;
        }
        int i7 = -1;
        if (!bVar.K() || (J = bVar.J()) == null || (s6 = J.s()) == -1 || target.getId() == s6) {
            if (uVar.D()) {
                x J2 = bVar.J();
                if (J2 != null && (J2.f() & 4) != 0) {
                    i7 = dy;
                }
                float f7 = this.f7604o;
                if ((f7 == 1.0f || f7 == 0.0f) && target.canScrollVertically(i7)) {
                    return;
                }
            }
            if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                float F = uVar.F(dx, dy);
                float f8 = this.f7606p;
                if ((f8 <= 0.0f && F < 0.0f) || (f8 >= 1.0f && F > 0.0f)) {
                    target.setNestedScrollingEnabled(false);
                    target.post(new c(this, target));
                    return;
                }
            }
            float f9 = this.f7604o;
            long nanoTime = getNanoTime();
            float f10 = dx;
            this.K = f10;
            float f11 = dy;
            this.L = f11;
            this.N = (float) ((nanoTime - this.M) * 1.0E-9d);
            this.M = nanoTime;
            uVar.d0(f10, f11);
            if (f9 != this.f7604o) {
                consumed[0] = dx;
                consumed[1] = dy;
            }
            S(false);
            if (consumed[0] == 0 && consumed[1] == 0) {
                return;
            }
            this.J = true;
        }
    }

    @Override // androidx.core.view.g1
    public void onNestedScroll(@o0 View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }

    @Override // androidx.core.view.g1
    public void onNestedScrollAccepted(@o0 View child, @o0 View target, int axes, int type) {
        this.M = getNanoTime();
        this.N = 0.0f;
        this.K = 0.0f;
        this.L = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        u uVar = this.f7578b;
        if (uVar != null) {
            uVar.m0(isRtl());
        }
    }

    @Override // androidx.core.view.g1
    public boolean onStartNestedScroll(@o0 View child, @o0 View target, int axes, int type) {
        u.b bVar;
        u uVar = this.f7578b;
        return (uVar == null || (bVar = uVar.f7705c) == null || bVar.J() == null || (this.f7578b.f7705c.J().f() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.g1
    public void onStopNestedScroll(@o0 View target, int type) {
        u uVar = this.f7578b;
        if (uVar != null) {
            float f7 = this.N;
            if (f7 == 0.0f) {
                return;
            }
            uVar.e0(this.K / f7, this.L / f7);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        u uVar = this.f7578b;
        if (uVar != null && this.f7596k && uVar.r0()) {
            u.b bVar = this.f7578b.f7705c;
            if (bVar == null || bVar.K()) {
                this.f7578b.f0(event, getCurrentState(), this);
                if (this.f7578b.f7705c.L(4)) {
                    return this.f7578b.f7705c.J().t();
                }
                return true;
            }
            return super.onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof p) {
            p pVar = (p) view;
            if (this.S == null) {
                this.S = new CopyOnWriteArrayList<>();
            }
            this.S.add(pVar);
            if (pVar.i()) {
                if (this.P == null) {
                    this.P = new ArrayList<>();
                }
                this.P.add(pVar);
            }
            if (pVar.j()) {
                if (this.Q == null) {
                    this.Q = new ArrayList<>();
                }
                this.Q.add(pVar);
            }
            if (pVar.e()) {
                if (this.R == null) {
                    this.R = new ArrayList<>();
                }
                this.R.add(pVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<p> arrayList = this.P;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<p> arrayList2 = this.Q;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if (this.f7618v == null && ((copyOnWriteArrayList = this.S) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f7579b0 = false;
        Iterator<Integer> it = this.E0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            l lVar = this.f7618v;
            if (lVar != null) {
                lVar.h(this, next.intValue());
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.S;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().h(this, next.intValue());
                }
            }
        }
        this.E0.clear();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int id) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void q0() {
        Log.e(N0, "This method is deprecated. Please call rebuildScene() instead.");
        r0();
    }

    public void r0() {
        this.f7627z0.k();
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        u uVar;
        u.b bVar;
        if (!this.f7581c0 && this.f7588g == -1 && (uVar = this.f7578b) != null && (bVar = uVar.f7705c) != null) {
            int E = bVar.E();
            if (E == 0) {
                return;
            }
            if (E == 2) {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    this.f7598l.get(getChildAt(i7)).P();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public boolean s0(l listener) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.S;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(listener);
    }

    public void setDebugMode(int debugMode) {
        this.f7624y = debugMode;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean delayedApply) {
        this.f7623x0 = delayedApply;
    }

    public void setInteractionEnabled(boolean enabled) {
        this.f7596k = enabled;
    }

    public void setInterpolatedProgress(float pos) {
        if (this.f7578b != null) {
            setState(m.MOVING);
            Interpolator x6 = this.f7578b.x();
            if (x6 != null) {
                setProgress(x6.getInterpolation(pos));
                return;
            }
        }
        setProgress(pos);
    }

    public void setOnHide(float progress) {
        ArrayList<p> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.Q.get(i7).setProgress(progress);
            }
        }
    }

    public void setOnShow(float progress) {
        ArrayList<p> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.P.get(i7).setProgress(progress);
            }
        }
    }

    public void setProgress(float pos) {
        int i7 = (pos > 0.0f ? 1 : (pos == 0.0f ? 0 : -1));
        if (i7 < 0 || pos > 1.0f) {
            Log.w(N0, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f7601m0 == null) {
                this.f7601m0 = new k();
            }
            this.f7601m0.e(pos);
            return;
        }
        if (i7 <= 0) {
            if (this.f7606p == 1.0f && this.f7588g == this.f7590h) {
                setState(m.MOVING);
            }
            this.f7588g = this.f7586f;
            if (this.f7606p == 0.0f) {
                setState(m.FINISHED);
            }
        } else if (pos >= 1.0f) {
            if (this.f7606p == 0.0f && this.f7588g == this.f7586f) {
                setState(m.MOVING);
            }
            this.f7588g = this.f7590h;
            if (this.f7606p == 1.0f) {
                setState(m.FINISHED);
            }
        } else {
            this.f7588g = -1;
            setState(m.MOVING);
        }
        if (this.f7578b == null) {
            return;
        }
        this.f7612s = true;
        this.f7610r = pos;
        this.f7604o = pos;
        this.f7608q = -1L;
        this.f7600m = -1L;
        this.f7580c = null;
        this.f7614t = true;
        invalidate();
    }

    public void setScene(u scene) {
        this.f7578b = scene;
        scene.m0(isRtl());
        r0();
    }

    public void setStartState(int beginId) {
        if (isAttachedToWindow()) {
            this.f7588g = beginId;
            return;
        }
        if (this.f7601m0 == null) {
            this.f7601m0 = new k();
        }
        this.f7601m0.f(beginId);
        this.f7601m0.d(beginId);
    }

    public void setState(m newState) {
        m mVar = m.FINISHED;
        if (newState == mVar && this.f7588g == -1) {
            return;
        }
        m mVar2 = this.f7625y0;
        this.f7625y0 = newState;
        m mVar3 = m.MOVING;
        if (mVar2 == mVar3 && newState == mVar3) {
            U();
        }
        int i7 = e.f7632a[mVar2.ordinal()];
        if (i7 != 1 && i7 != 2) {
            if (i7 == 3 && newState == mVar) {
                V();
                return;
            }
            return;
        }
        if (newState == mVar3) {
            U();
        }
        if (newState == mVar) {
            V();
        }
    }

    public void setTransition(int transitionId) {
        float f7;
        if (this.f7578b != null) {
            u.b d02 = d0(transitionId);
            this.f7586f = d02.I();
            this.f7590h = d02.B();
            if (!isAttachedToWindow()) {
                if (this.f7601m0 == null) {
                    this.f7601m0 = new k();
                }
                this.f7601m0.f(this.f7586f);
                this.f7601m0.d(this.f7590h);
                return;
            }
            int i7 = this.f7588g;
            if (i7 == this.f7586f) {
                f7 = 0.0f;
            } else {
                f7 = i7 == this.f7590h ? 1.0f : Float.NaN;
            }
            this.f7578b.o0(d02);
            this.f7627z0.h(this.mLayoutWidget, this.f7578b.o(this.f7586f), this.f7578b.o(this.f7590h));
            r0();
            if (this.f7606p != f7) {
                if (f7 == 0.0f) {
                    R(true);
                    this.f7578b.o(this.f7586f).r(this);
                } else if (f7 == 1.0f) {
                    R(false);
                    this.f7578b.o(this.f7590h).r(this);
                }
            }
            this.f7606p = Float.isNaN(f7) ? 0.0f : f7;
            if (Float.isNaN(f7)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c0.c.g());
                sb.append(" transitionToStart ");
                D0();
                return;
            }
            setProgress(f7);
        }
    }

    public void setTransitionDuration(int milliseconds) {
        u uVar = this.f7578b;
        if (uVar == null) {
            Log.e(N0, "MotionScene not defined");
        } else {
            uVar.k0(milliseconds);
        }
    }

    public void setTransitionListener(l listener) {
        this.f7618v = listener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f7601m0 == null) {
            this.f7601m0 = new k();
        }
        this.f7601m0.g(bundle);
        if (isAttachedToWindow()) {
            this.f7601m0.a();
        }
    }

    @w0(api = 17)
    public void t0(int id, int duration) {
        this.f7609q0 = true;
        this.f7615t0 = getWidth();
        this.f7617u0 = getHeight();
        int rotation = getDisplay().getRotation();
        this.f7611r0 = (rotation + 1) % 4 <= (this.f7619v0 + 1) % 4 ? 2 : 1;
        this.f7619v0 = rotation;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            b0.e eVar = this.f7613s0.get(childAt);
            if (eVar == null) {
                eVar = new b0.e();
                this.f7613s0.put(childAt, eVar);
            }
            eVar.a(childAt);
        }
        this.f7586f = -1;
        this.f7590h = id;
        this.f7578b.n0(-1, id);
        this.f7627z0.h(this.mLayoutWidget, null, this.f7578b.o(this.f7590h));
        this.f7604o = 0.0f;
        this.f7606p = 0.0f;
        invalidate();
        C0(new b());
        if (duration > 0) {
            this.f7602n = duration / 1000.0f;
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return c0.c.i(context, this.f7586f) + "->" + c0.c.i(context, this.f7590h) + " (pos:" + this.f7606p + " Dpos/Dt:" + this.f7584e;
    }

    public void u0(int id) {
        if (getCurrentState() == -1) {
            E0(id);
            return;
        }
        int[] iArr = this.f7605o0;
        if (iArr == null) {
            this.f7605o0 = new int[4];
        } else if (iArr.length <= this.f7607p0) {
            this.f7605o0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f7605o0;
        int i7 = this.f7607p0;
        this.f7607p0 = i7 + 1;
        iArr2[i7] = id;
    }

    public void v0(float pos, float velocity) {
        if (!isAttachedToWindow()) {
            if (this.f7601m0 == null) {
                this.f7601m0 = new k();
            }
            this.f7601m0.e(pos);
            this.f7601m0.h(velocity);
            return;
        }
        setProgress(pos);
        setState(m.MOVING);
        this.f7584e = velocity;
        int i7 = (velocity > 0.0f ? 1 : (velocity == 0.0f ? 0 : -1));
        if (i7 != 0) {
            F(i7 > 0 ? 1.0f : 0.0f);
        } else if (pos == 0.0f || pos == 1.0f) {
        } else {
            F(pos > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void w0(int beginId, int endId) {
        if (!isAttachedToWindow()) {
            if (this.f7601m0 == null) {
                this.f7601m0 = new k();
            }
            this.f7601m0.f(beginId);
            this.f7601m0.d(endId);
            return;
        }
        u uVar = this.f7578b;
        if (uVar != null) {
            this.f7586f = beginId;
            this.f7590h = endId;
            uVar.n0(beginId, endId);
            this.f7627z0.h(this.mLayoutWidget, this.f7578b.o(beginId), this.f7578b.o(endId));
            r0();
            this.f7606p = 0.0f;
            D0();
        }
    }

    public final void x0() {
        int childCount = getChildCount();
        this.f7627z0.a();
        boolean z6 = true;
        this.f7614t = true;
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            sparseArray.put(childAt.getId(), this.f7598l.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m7 = this.f7578b.m();
        if (m7 != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                o oVar = this.f7598l.get(getChildAt(i9));
                if (oVar != null) {
                    oVar.U(m7);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f7598l.size()];
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            o oVar2 = this.f7598l.get(getChildAt(i11));
            if (oVar2.k() != -1) {
                sparseBooleanArray.put(oVar2.k(), true);
                iArr[i10] = oVar2.k();
                i10++;
            }
        }
        if (this.R != null) {
            for (int i12 = 0; i12 < i10; i12++) {
                o oVar3 = this.f7598l.get(findViewById(iArr[i12]));
                if (oVar3 != null) {
                    this.f7578b.z(oVar3);
                }
            }
            Iterator<p> it = this.R.iterator();
            while (it.hasNext()) {
                it.next().f(this, this.f7598l);
            }
            for (int i13 = 0; i13 < i10; i13++) {
                o oVar4 = this.f7598l.get(findViewById(iArr[i13]));
                if (oVar4 != null) {
                    oVar4.a0(width, height, this.f7602n, getNanoTime());
                }
            }
        } else {
            for (int i14 = 0; i14 < i10; i14++) {
                o oVar5 = this.f7598l.get(findViewById(iArr[i14]));
                if (oVar5 != null) {
                    this.f7578b.z(oVar5);
                    oVar5.a0(width, height, this.f7602n, getNanoTime());
                }
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            o oVar6 = this.f7598l.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && oVar6 != null) {
                this.f7578b.z(oVar6);
                oVar6.a0(width, height, this.f7602n, getNanoTime());
            }
        }
        float M = this.f7578b.M();
        if (M != 0.0f) {
            boolean z7 = ((double) M) < androidx.cardview.widget.g.f1896q;
            float abs = Math.abs(M);
            float f7 = -3.4028235E38f;
            float f8 = Float.MAX_VALUE;
            int i16 = 0;
            float f9 = -3.4028235E38f;
            float f10 = Float.MAX_VALUE;
            while (true) {
                if (i16 >= childCount) {
                    z6 = false;
                    break;
                }
                o oVar7 = this.f7598l.get(getChildAt(i16));
                if (!Float.isNaN(oVar7.f7558m)) {
                    break;
                }
                float t6 = oVar7.t();
                float u6 = oVar7.u();
                float f11 = z7 ? u6 - t6 : u6 + t6;
                f10 = Math.min(f10, f11);
                f9 = Math.max(f9, f11);
                i16++;
            }
            if (!z6) {
                while (i7 < childCount) {
                    o oVar8 = this.f7598l.get(getChildAt(i7));
                    float t7 = oVar8.t();
                    float u7 = oVar8.u();
                    float f12 = z7 ? u7 - t7 : u7 + t7;
                    oVar8.f7560o = 1.0f / (1.0f - abs);
                    oVar8.f7559n = abs - (((f12 - f10) * abs) / (f9 - f10));
                    i7++;
                }
                return;
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                o oVar9 = this.f7598l.get(getChildAt(i17));
                if (!Float.isNaN(oVar9.f7558m)) {
                    f8 = Math.min(f8, oVar9.f7558m);
                    f7 = Math.max(f7, oVar9.f7558m);
                }
            }
            while (i7 < childCount) {
                o oVar10 = this.f7598l.get(getChildAt(i7));
                if (!Float.isNaN(oVar10.f7558m)) {
                    oVar10.f7560o = 1.0f / (1.0f - abs);
                    if (z7) {
                        oVar10.f7559n = abs - (((f7 - oVar10.f7558m) / (f7 - f8)) * abs);
                    } else {
                        oVar10.f7559n = abs - (((oVar10.f7558m - f8) * abs) / (f7 - f8));
                    }
                }
                i7++;
            }
        }
    }

    public final Rect y0(y.e cw) {
        this.f7621w0.top = cw.p0();
        this.f7621w0.left = cw.o0();
        Rect rect = this.f7621w0;
        int m02 = cw.m0();
        Rect rect2 = this.f7621w0;
        rect.right = m02 + rect2.left;
        int D = cw.D();
        Rect rect3 = this.f7621w0;
        rect2.bottom = D + rect3.top;
        return rect3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r10 != 7) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.z0(int, float, float):void");
    }

    @Override // androidx.core.view.h1
    public void onNestedScroll(@o0 View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (this.J || dxConsumed != 0 || dyConsumed != 0) {
            consumed[0] = consumed[0] + dxUnconsumed;
            consumed[1] = consumed[1] + dyUnconsumed;
        }
        this.J = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int id, int screenWidth, int screenHeight) {
        setState(m.SETUP);
        this.f7588g = id;
        this.f7586f = -1;
        this.f7590h = -1;
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.e(id, screenWidth, screenHeight);
            return;
        }
        u uVar = this.f7578b;
        if (uVar != null) {
            uVar.o(id).r(this);
        }
    }

    public void setTransition(u.b transition) {
        this.f7578b.o0(transition);
        setState(m.SETUP);
        if (this.f7588g == this.f7578b.u()) {
            this.f7606p = 1.0f;
            this.f7604o = 1.0f;
            this.f7610r = 1.0f;
        } else {
            this.f7606p = 0.0f;
            this.f7604o = 0.0f;
            this.f7610r = 0.0f;
        }
        this.f7608q = transition.L(1) ? -1L : getNanoTime();
        int N = this.f7578b.N();
        int u6 = this.f7578b.u();
        if (N == this.f7586f && u6 == this.f7590h) {
            return;
        }
        this.f7586f = N;
        this.f7590h = u6;
        this.f7578b.n0(N, u6);
        this.f7627z0.h(this.mLayoutWidget, this.f7578b.o(this.f7586f), this.f7578b.o(this.f7590h));
        this.f7627z0.l(this.f7586f, this.f7590h);
        this.f7627z0.k();
        r0();
    }

    public s(@o0 Context context, @q0 AttributeSet attrs) {
        super(context, attrs);
        this.f7582d = null;
        this.f7584e = 0.0f;
        this.f7586f = -1;
        this.f7588g = -1;
        this.f7590h = -1;
        this.f7592i = 0;
        this.f7594j = 0;
        this.f7596k = true;
        this.f7598l = new HashMap<>();
        this.f7600m = 0L;
        this.f7602n = 1.0f;
        this.f7604o = 0.0f;
        this.f7606p = 0.0f;
        this.f7610r = 0.0f;
        this.f7614t = false;
        this.f7616u = false;
        this.f7624y = 0;
        this.A = false;
        this.B = new b0.b();
        this.C = new f();
        this.E = true;
        this.J = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = 0;
        this.U = -1L;
        this.V = 0.0f;
        this.W = 0;
        this.f7577a0 = 0.0f;
        this.f7579b0 = false;
        this.f7581c0 = false;
        this.f7597k0 = new u.g();
        this.f7599l0 = false;
        this.f7603n0 = null;
        this.f7605o0 = null;
        this.f7607p0 = 0;
        this.f7609q0 = false;
        this.f7611r0 = 0;
        this.f7613s0 = new HashMap<>();
        this.f7621w0 = new Rect();
        this.f7623x0 = false;
        this.f7625y0 = m.UNDEFINED;
        this.f7627z0 = new h();
        this.A0 = false;
        this.B0 = new RectF();
        this.C0 = null;
        this.D0 = null;
        this.E0 = new ArrayList<>();
        g0(attrs);
    }

    public s(@o0 Context context, @q0 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f7582d = null;
        this.f7584e = 0.0f;
        this.f7586f = -1;
        this.f7588g = -1;
        this.f7590h = -1;
        this.f7592i = 0;
        this.f7594j = 0;
        this.f7596k = true;
        this.f7598l = new HashMap<>();
        this.f7600m = 0L;
        this.f7602n = 1.0f;
        this.f7604o = 0.0f;
        this.f7606p = 0.0f;
        this.f7610r = 0.0f;
        this.f7614t = false;
        this.f7616u = false;
        this.f7624y = 0;
        this.A = false;
        this.B = new b0.b();
        this.C = new f();
        this.E = true;
        this.J = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = 0;
        this.U = -1L;
        this.V = 0.0f;
        this.W = 0;
        this.f7577a0 = 0.0f;
        this.f7579b0 = false;
        this.f7581c0 = false;
        this.f7597k0 = new u.g();
        this.f7599l0 = false;
        this.f7603n0 = null;
        this.f7605o0 = null;
        this.f7607p0 = 0;
        this.f7609q0 = false;
        this.f7611r0 = 0;
        this.f7613s0 = new HashMap<>();
        this.f7621w0 = new Rect();
        this.f7623x0 = false;
        this.f7625y0 = m.UNDEFINED;
        this.f7627z0 = new h();
        this.A0 = false;
        this.B0 = new RectF();
        this.C0 = null;
        this.D0 = null;
        this.E0 = new ArrayList<>();
        g0(attrs);
    }
}
