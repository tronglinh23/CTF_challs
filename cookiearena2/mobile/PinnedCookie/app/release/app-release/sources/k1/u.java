package k1;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
@Deprecated
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public OverScroller f11596a;

    public u(Context context, Interpolator interpolator) {
        this.f11596a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static u c(Context context) {
        return d(context, null);
    }

    @Deprecated
    public static u d(Context context, Interpolator interpolator) {
        return new u(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f11596a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f11596a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f11596a.fling(i7, i8, i9, i10, i11, i12, i13, i14);
    }

    @Deprecated
    public void f(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f11596a.fling(i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }

    @Deprecated
    public float g() {
        return this.f11596a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f11596a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f11596a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f11596a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f11596a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f11596a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f11596a.isOverScrolled();
    }

    @Deprecated
    public void n(int i7, int i8, int i9) {
        this.f11596a.notifyHorizontalEdgeReached(i7, i8, i9);
    }

    @Deprecated
    public void o(int i7, int i8, int i9) {
        this.f11596a.notifyVerticalEdgeReached(i7, i8, i9);
    }

    @Deprecated
    public boolean p(int i7, int i8, int i9, int i10, int i11, int i12) {
        return this.f11596a.springBack(i7, i8, i9, i10, i11, i12);
    }

    @Deprecated
    public void q(int i7, int i8, int i9, int i10) {
        this.f11596a.startScroll(i7, i8, i9, i10);
    }

    @Deprecated
    public void r(int i7, int i8, int i9, int i10, int i11) {
        this.f11596a.startScroll(i7, i8, i9, i10, i11);
    }
}
