package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class p {

    /* renamed from: j  reason: collision with root package name */
    public static final int f5574j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5575k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f5576l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public static final int f5577m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f5578n = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f5580b;

    /* renamed from: c  reason: collision with root package name */
    public int f5581c;

    /* renamed from: d  reason: collision with root package name */
    public int f5582d;

    /* renamed from: e  reason: collision with root package name */
    public int f5583e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5586h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5587i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5579a = true;

    /* renamed from: f  reason: collision with root package name */
    public int f5584f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f5585g = 0;

    public boolean a(RecyclerView.c0 c0Var) {
        int i7 = this.f5581c;
        return i7 >= 0 && i7 < c0Var.d();
    }

    public View b(RecyclerView.w wVar) {
        View p6 = wVar.p(this.f5581c);
        this.f5581c += this.f5582d;
        return p6;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5580b + ", mCurrentPosition=" + this.f5581c + ", mItemDirection=" + this.f5582d + ", mLayoutDirection=" + this.f5583e + ", mStartLine=" + this.f5584f + ", mEndLine=" + this.f5585g + '}';
    }
}
