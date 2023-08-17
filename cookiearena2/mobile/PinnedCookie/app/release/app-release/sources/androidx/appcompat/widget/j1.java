package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.y0;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class j1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: m  reason: collision with root package name */
    public static final String f1656m = "ScrollingTabContainerView";

    /* renamed from: n  reason: collision with root package name */
    public static final Interpolator f1657n = new DecelerateInterpolator();

    /* renamed from: o  reason: collision with root package name */
    public static final int f1658o = 200;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f1659b;

    /* renamed from: c  reason: collision with root package name */
    public c f1660c;

    /* renamed from: d  reason: collision with root package name */
    public y0 f1661d;

    /* renamed from: e  reason: collision with root package name */
    public Spinner f1662e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1663f;

    /* renamed from: g  reason: collision with root package name */
    public int f1664g;

    /* renamed from: h  reason: collision with root package name */
    public int f1665h;

    /* renamed from: i  reason: collision with root package name */
    public int f1666i;

    /* renamed from: j  reason: collision with root package name */
    public int f1667j;

    /* renamed from: k  reason: collision with root package name */
    public ViewPropertyAnimator f1668k;

    /* renamed from: l  reason: collision with root package name */
    public final e f1669l;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ View f1670k;

        public a(View view) {
            this.f1670k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            j1.this.smoothScrollTo(this.f1670k.getLeft() - ((j1.this.getWidth() - this.f1670k.getWidth()) / 2), 0);
            j1.this.f1659b = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return j1.this.f1661d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i7) {
            return ((d) j1.this.f1661d.getChildAt(i7)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                return j1.this.g((a.f) getItem(i7), true);
            }
            ((d) view).a((a.f) getItem(i7));
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().g();
            int childCount = j1.this.f1661d.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = j1.this.f1661d.getChildAt(i7);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: h  reason: collision with root package name */
        public static final String f1674h = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1675b;

        /* renamed from: c  reason: collision with root package name */
        public a.f f1676c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f1677d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f1678e;

        /* renamed from: f  reason: collision with root package name */
        public View f1679f;

        public d(Context context, a.f fVar, boolean z6) {
            super(context, null, a.b.f8872h);
            int[] iArr = {16842964};
            this.f1675b = iArr;
            this.f1676c = fVar;
            t1 G = t1.G(context, null, iArr, a.b.f8872h, 0);
            if (G.C(0)) {
                setBackgroundDrawable(G.h(0));
            }
            G.I();
            if (z6) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.f fVar) {
            this.f1676c = fVar;
            c();
        }

        public a.f b() {
            return this.f1676c;
        }

        public void c() {
            a.f fVar = this.f1676c;
            View b7 = fVar.b();
            if (b7 != null) {
                ViewParent parent = b7.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b7);
                    }
                    addView(b7);
                }
                this.f1679f = b7;
                TextView textView = this.f1677d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1678e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1678e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1679f;
            if (view != null) {
                removeView(view);
                this.f1679f = null;
            }
            Drawable c7 = fVar.c();
            CharSequence f7 = fVar.f();
            if (c7 != null) {
                if (this.f1678e == null) {
                    s sVar = new s(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    sVar.setLayoutParams(layoutParams);
                    addView(sVar, 0);
                    this.f1678e = sVar;
                }
                this.f1678e.setImageDrawable(c7);
                this.f1678e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1678e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1678e.setImageDrawable(null);
                }
            }
            boolean z6 = !TextUtils.isEmpty(f7);
            if (z6) {
                if (this.f1677d == null) {
                    f0 f0Var = new f0(getContext(), null, a.b.f8878i);
                    f0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    f0Var.setLayoutParams(layoutParams2);
                    addView(f0Var);
                    this.f1677d = f0Var;
                }
                this.f1677d.setText(f7);
                this.f1677d.setVisibility(0);
            } else {
                TextView textView2 = this.f1677d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1677d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1678e;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.a());
            }
            y1.a(this, z6 ? null : fVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f1674h);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f1674h);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            if (j1.this.f1664g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i9 = j1.this.f1664g;
                if (measuredWidth > i9) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z6) {
            boolean z7 = isSelected() != z6;
            super.setSelected(z6);
            if (z7 && z6) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1681a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1682b;

        public e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i7) {
            this.f1682b = i7;
            j1.this.f1668k = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1681a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1681a) {
                return;
            }
            j1 j1Var = j1.this;
            j1Var.f1668k = null;
            j1Var.setVisibility(this.f1682b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j1.this.setVisibility(0);
            this.f1681a = false;
        }
    }

    public j1(@d.o0 Context context) {
        super(context);
        this.f1669l = new e();
        setHorizontalScrollBarEnabled(false);
        j.a b7 = j.a.b(context);
        setContentHeight(b7.f());
        this.f1665h = b7.e();
        y0 f7 = f();
        this.f1661d = f7;
        addView(f7, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(a.f fVar, int i7, boolean z6) {
        d g7 = g(fVar, false);
        this.f1661d.addView(g7, i7, new y0.b(0, -1, 1.0f));
        Spinner spinner = this.f1662e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z6) {
            g7.setSelected(true);
        }
        if (this.f1663f) {
            requestLayout();
        }
    }

    public void b(a.f fVar, boolean z6) {
        d g7 = g(fVar, false);
        this.f1661d.addView(g7, new y0.b(0, -1, 1.0f));
        Spinner spinner = this.f1662e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z6) {
            g7.setSelected(true);
        }
        if (this.f1663f) {
            requestLayout();
        }
    }

    public void c(int i7) {
        View childAt = this.f1661d.getChildAt(i7);
        Runnable runnable = this.f1659b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1659b = aVar;
        post(aVar);
    }

    public void d(int i7) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1668k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i7 != 0) {
            ViewPropertyAnimator alpha = animate().alpha(0.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(f1657n);
            alpha.setListener(this.f1669l.a(alpha, i7));
            alpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator alpha2 = animate().alpha(1.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(f1657n);
        alpha2.setListener(this.f1669l.a(alpha2, i7));
        alpha2.start();
    }

    public final Spinner e() {
        b0 b0Var = new b0(getContext(), null, a.b.f8902m);
        b0Var.setLayoutParams(new y0.b(-2, -1));
        b0Var.setOnItemSelectedListener(this);
        return b0Var;
    }

    public final y0 f() {
        y0 y0Var = new y0(getContext(), null, a.b.f8866g);
        y0Var.setMeasureWithLargestChildEnabled(true);
        y0Var.setGravity(17);
        y0Var.setLayoutParams(new y0.b(-2, -1));
        return y0Var;
    }

    public d g(a.f fVar, boolean z6) {
        d dVar = new d(getContext(), fVar, z6);
        if (z6) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1666i));
        } else {
            dVar.setFocusable(true);
            if (this.f1660c == null) {
                this.f1660c = new c();
            }
            dVar.setOnClickListener(this.f1660c);
        }
        return dVar;
    }

    public final boolean h() {
        Spinner spinner = this.f1662e;
        return spinner != null && spinner.getParent() == this;
    }

    public final void i() {
        if (h()) {
            return;
        }
        if (this.f1662e == null) {
            this.f1662e = e();
        }
        removeView(this.f1661d);
        addView(this.f1662e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1662e.getAdapter() == null) {
            this.f1662e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1659b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1659b = null;
        }
        this.f1662e.setSelection(this.f1667j);
    }

    public final boolean j() {
        if (h()) {
            removeView(this.f1662e);
            addView(this.f1661d, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1662e.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void k() {
        this.f1661d.removeAllViews();
        Spinner spinner = this.f1662e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1663f) {
            requestLayout();
        }
    }

    public void l(int i7) {
        this.f1661d.removeViewAt(i7);
        Spinner spinner = this.f1662e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1663f) {
            requestLayout();
        }
    }

    public void m(int i7) {
        ((d) this.f1661d.getChildAt(i7)).c();
        Spinner spinner = this.f1662e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1663f) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1659b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j.a b7 = j.a.b(getContext());
        setContentHeight(b7.f());
        this.f1665h = b7.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1659b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
        ((d) view).b().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        boolean z6 = mode == 1073741824;
        setFillViewport(z6);
        int childCount = this.f1661d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1664g = -1;
        } else {
            if (childCount > 2) {
                this.f1664g = (int) (View.MeasureSpec.getSize(i7) * 0.4f);
            } else {
                this.f1664g = View.MeasureSpec.getSize(i7) / 2;
            }
            this.f1664g = Math.min(this.f1664g, this.f1665h);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1666i, 1073741824);
        if (!z6 && this.f1663f) {
            this.f1661d.measure(0, makeMeasureSpec);
            if (this.f1661d.getMeasuredWidth() > View.MeasureSpec.getSize(i7)) {
                i();
            } else {
                j();
            }
        } else {
            j();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i7, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z6 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1667j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z6) {
        this.f1663f = z6;
    }

    public void setContentHeight(int i7) {
        this.f1666i = i7;
        requestLayout();
    }

    public void setTabSelected(int i7) {
        this.f1667j = i7;
        int childCount = this.f1661d.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = this.f1661d.getChildAt(i8);
            boolean z6 = i8 == i7;
            childAt.setSelected(z6);
            if (z6) {
                c(i7);
            }
            i8++;
        }
        Spinner spinner = this.f1662e;
        if (spinner == null || i7 < 0) {
            return;
        }
        spinner.setSelection(i7);
    }
}
