package r3;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import d.k1;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final h f15611a;

    /* renamed from: b  reason: collision with root package name */
    public final g f15612b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f15613c;

    /* renamed from: d  reason: collision with root package name */
    public VelocityTracker f15614d;

    /* renamed from: e  reason: collision with root package name */
    public int f15615e;

    /* renamed from: f  reason: collision with root package name */
    public float f15616f;

    /* renamed from: g  reason: collision with root package name */
    public int f15617g;

    /* renamed from: h  reason: collision with root package name */
    public long f15618h;

    public d(h hVar, g gVar, RecyclerView recyclerView) {
        this.f15611a = hVar;
        this.f15612b = gVar;
        this.f15613c = recyclerView;
    }

    public final void a(long j7, int i7, float f7, float f8) {
        MotionEvent obtain = MotionEvent.obtain(this.f15618h, j7, i7, f7, f8, 0);
        this.f15614d.addMovement(obtain);
        obtain.recycle();
    }

    @k1
    public boolean b() {
        if (this.f15612b.g()) {
            return false;
        }
        this.f15617g = 0;
        this.f15616f = 0;
        this.f15618h = SystemClock.uptimeMillis();
        c();
        this.f15612b.k();
        if (!this.f15612b.i()) {
            this.f15613c.stopScroll();
        }
        a(this.f15618h, 0, 0.0f, 0.0f);
        return true;
    }

    public final void c() {
        VelocityTracker velocityTracker = this.f15614d;
        if (velocityTracker != null) {
            velocityTracker.clear();
            return;
        }
        this.f15614d = VelocityTracker.obtain();
        this.f15615e = ViewConfiguration.get(this.f15611a.getContext()).getScaledMaximumFlingVelocity();
    }

    @k1
    public boolean d() {
        if (this.f15612b.h()) {
            this.f15612b.m();
            VelocityTracker velocityTracker = this.f15614d;
            velocityTracker.computeCurrentVelocity(1000, this.f15615e);
            if (this.f15613c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                return true;
            }
            this.f15611a.v();
            return true;
        }
        return false;
    }

    @k1
    public boolean e(float f7) {
        if (this.f15612b.h()) {
            float f8 = this.f15616f - f7;
            this.f15616f = f8;
            int round = Math.round(f8 - this.f15617g);
            this.f15617g += round;
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z6 = this.f15611a.getOrientation() == 0;
            int i7 = z6 ? round : 0;
            int i8 = z6 ? 0 : round;
            float f9 = z6 ? this.f15616f : 0.0f;
            float f10 = z6 ? 0.0f : this.f15616f;
            this.f15613c.scrollBy(i7, i8);
            a(uptimeMillis, 2, f9, f10);
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f15612b.h();
    }
}
