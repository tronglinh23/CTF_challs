package i0;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    public static final int f10865b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10866c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10867d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f10868e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10869f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10870g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f10871h = 6;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10872i = 7;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10873j = 8;

    /* renamed from: k  reason: collision with root package name */
    public static final int f10874k = 8;

    /* renamed from: l  reason: collision with root package name */
    public static final int f10875l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f10876m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f10877n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f10878o = 8;

    /* renamed from: p  reason: collision with root package name */
    public static final int f10879p = 16;

    /* renamed from: q  reason: collision with root package name */
    public static final int f10880q = 32;

    /* renamed from: r  reason: collision with root package name */
    public static final int f10881r = 64;

    /* renamed from: s  reason: collision with root package name */
    public static final int f10882s = 128;

    /* renamed from: t  reason: collision with root package name */
    public static final int f10883t = 256;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10884u = 511;

    /* renamed from: a  reason: collision with root package name */
    public final b f10885a;

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f10886e = 1000000;

        /* renamed from: f  reason: collision with root package name */
        public static final int f10887f = 500000;

        /* renamed from: g  reason: collision with root package name */
        public static HandlerThread f10888g;

        /* renamed from: h  reason: collision with root package name */
        public static Handler f10889h;

        /* renamed from: a  reason: collision with root package name */
        public int f10890a;

        /* renamed from: b  reason: collision with root package name */
        public SparseIntArray[] f10891b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f10892c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f10893d = new WindowOnFrameMetricsAvailableListenerC0128a();

        /* renamed from: i0.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class WindowOnFrameMetricsAvailableListenerC0128a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0128a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
                a aVar = a.this;
                if ((aVar.f10890a & 1) != 0) {
                    aVar.f(aVar.f10891b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f10890a & 2) != 0) {
                    aVar2.f(aVar2.f10891b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f10890a & 4) != 0) {
                    aVar3.f(aVar3.f10891b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f10890a & 8) != 0) {
                    aVar4.f(aVar4.f10891b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f10890a & 16) != 0) {
                    aVar5.f(aVar5.f10891b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f10890a & 64) != 0) {
                    aVar6.f(aVar6.f10891b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f10890a & 32) != 0) {
                    aVar7.f(aVar7.f10891b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f10890a & 128) != 0) {
                    aVar8.f(aVar8.f10891b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f10890a & 256) != 0) {
                    aVar9.f(aVar9.f10891b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i7) {
            this.f10890a = i7;
        }

        @Override // i0.s.b
        public void a(Activity activity) {
            if (f10888g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f10888g = handlerThread;
                handlerThread.start();
                f10889h = new Handler(f10888g.getLooper());
            }
            for (int i7 = 0; i7 <= 8; i7++) {
                SparseIntArray[] sparseIntArrayArr = this.f10891b;
                if (sparseIntArrayArr[i7] == null && (this.f10890a & (1 << i7)) != 0) {
                    sparseIntArrayArr[i7] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f10893d, f10889h);
            this.f10892c.add(new WeakReference<>(activity));
        }

        @Override // i0.s.b
        public SparseIntArray[] b() {
            return this.f10891b;
        }

        @Override // i0.s.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f10892c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f10892c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f10893d);
            return this.f10891b;
        }

        @Override // i0.s.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f10891b;
            this.f10891b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // i0.s.b
        public SparseIntArray[] e() {
            for (int size = this.f10892c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f10892c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f10893d);
                    this.f10892c.remove(size);
                }
            }
            return this.f10891b;
        }

        public void f(SparseIntArray sparseIntArray, long j7) {
            if (sparseIntArray != null) {
                int i7 = (int) ((500000 + j7) / kotlinx.coroutines.x1.f13167e);
                if (j7 >= 0) {
                    sparseIntArray.put(i7, sparseIntArray.get(i7) + 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public s() {
        this(1);
    }

    public void a(@d.o0 Activity activity) {
        this.f10885a.a(activity);
    }

    @d.q0
    public SparseIntArray[] b() {
        return this.f10885a.b();
    }

    @d.q0
    public SparseIntArray[] c(@d.o0 Activity activity) {
        return this.f10885a.c(activity);
    }

    @d.q0
    public SparseIntArray[] d() {
        return this.f10885a.d();
    }

    @d.q0
    public SparseIntArray[] e() {
        return this.f10885a.e();
    }

    public s(int i7) {
        this.f10885a = new a(i7);
    }
}
