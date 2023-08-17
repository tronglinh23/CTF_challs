package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f3684a;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z6);

        boolean b(MotionEvent motionEvent);

        boolean c();

        void d(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    /* loaded from: classes.dex */
    public static class b implements a {

        /* renamed from: v  reason: collision with root package name */
        public static final int f3685v = ViewConfiguration.getTapTimeout();

        /* renamed from: w  reason: collision with root package name */
        public static final int f3686w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: x  reason: collision with root package name */
        public static final int f3687x = 1;

        /* renamed from: y  reason: collision with root package name */
        public static final int f3688y = 2;

        /* renamed from: z  reason: collision with root package name */
        public static final int f3689z = 3;

        /* renamed from: a  reason: collision with root package name */
        public int f3690a;

        /* renamed from: b  reason: collision with root package name */
        public int f3691b;

        /* renamed from: c  reason: collision with root package name */
        public int f3692c;

        /* renamed from: d  reason: collision with root package name */
        public int f3693d;

        /* renamed from: e  reason: collision with root package name */
        public final Handler f3694e;

        /* renamed from: f  reason: collision with root package name */
        public final GestureDetector.OnGestureListener f3695f;

        /* renamed from: g  reason: collision with root package name */
        public GestureDetector.OnDoubleTapListener f3696g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3697h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3698i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3699j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3700k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3701l;

        /* renamed from: m  reason: collision with root package name */
        public MotionEvent f3702m;

        /* renamed from: n  reason: collision with root package name */
        public MotionEvent f3703n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3704o;

        /* renamed from: p  reason: collision with root package name */
        public float f3705p;

        /* renamed from: q  reason: collision with root package name */
        public float f3706q;

        /* renamed from: r  reason: collision with root package name */
        public float f3707r;

        /* renamed from: s  reason: collision with root package name */
        public float f3708s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f3709t;

        /* renamed from: u  reason: collision with root package name */
        public VelocityTracker f3710u;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f3694e = new a(handler);
            } else {
                this.f3694e = new a();
            }
            this.f3695f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                d((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            h(context);
        }

        @Override // androidx.core.view.l0.a
        public void a(boolean z6) {
            this.f3709t = z6;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
        @Override // androidx.core.view.l0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 589
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.l0.b.b(android.view.MotionEvent):boolean");
        }

        @Override // androidx.core.view.l0.a
        public boolean c() {
            return this.f3709t;
        }

        @Override // androidx.core.view.l0.a
        public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f3696g = onDoubleTapListener;
        }

        public final void e() {
            this.f3694e.removeMessages(1);
            this.f3694e.removeMessages(2);
            this.f3694e.removeMessages(3);
            this.f3710u.recycle();
            this.f3710u = null;
            this.f3704o = false;
            this.f3697h = false;
            this.f3700k = false;
            this.f3701l = false;
            this.f3698i = false;
            if (this.f3699j) {
                this.f3699j = false;
            }
        }

        public final void f() {
            this.f3694e.removeMessages(1);
            this.f3694e.removeMessages(2);
            this.f3694e.removeMessages(3);
            this.f3704o = false;
            this.f3700k = false;
            this.f3701l = false;
            this.f3698i = false;
            if (this.f3699j) {
                this.f3699j = false;
            }
        }

        public void g() {
            this.f3694e.removeMessages(3);
            this.f3698i = false;
            this.f3699j = true;
            this.f3695f.onLongPress(this.f3702m);
        }

        public final void h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f3695f == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f3709t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f3692c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3693d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3690a = scaledTouchSlop * scaledTouchSlop;
            this.f3691b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        public final boolean i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.f3701l && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= f3686w) {
                int x6 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y6 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (x6 * x6) + (y6 * y6) < this.f3691b;
            }
            return false;
        }

        /* loaded from: classes.dex */
        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i7 = message.what;
                if (i7 == 1) {
                    b bVar = b.this;
                    bVar.f3695f.onShowPress(bVar.f3702m);
                } else if (i7 == 2) {
                    b.this.g();
                } else if (i7 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                } else {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f3696g;
                    if (onDoubleTapListener != null) {
                        if (bVar2.f3697h) {
                            bVar2.f3698i = true;
                        } else {
                            onDoubleTapListener.onSingleTapConfirmed(bVar2.f3702m);
                        }
                    }
                }
            }

            public a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final GestureDetector f3712a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3712a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.l0.a
        public void a(boolean z6) {
            this.f3712a.setIsLongpressEnabled(z6);
        }

        @Override // androidx.core.view.l0.a
        public boolean b(MotionEvent motionEvent) {
            return this.f3712a.onTouchEvent(motionEvent);
        }

        @Override // androidx.core.view.l0.a
        public boolean c() {
            return this.f3712a.isLongpressEnabled();
        }

        @Override // androidx.core.view.l0.a
        public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f3712a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public l0(@d.o0 Context context, @d.o0 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f3684a.c();
    }

    public boolean b(@d.o0 MotionEvent motionEvent) {
        return this.f3684a.b(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z6) {
        this.f3684a.a(z6);
    }

    public void d(@d.q0 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f3684a.d(onDoubleTapListener);
    }

    public l0(@d.o0 Context context, @d.o0 GestureDetector.OnGestureListener onGestureListener, @d.q0 Handler handler) {
        this.f3684a = new c(context, onGestureListener, handler);
    }
}