package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.h4;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import u4.r1;
import x1.a;
@r1({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n55#2,6:349\n55#2,6:355\n1855#3,2:361\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:349,6\n135#1:355,6\n221#1:361,2\n*E\n"})
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<B%\b\u0017\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010?\u001a\u00020\u001b¢\u0006\u0004\b;\u0010@B!\b\u0010\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\b;\u0010CJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0001J\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u0019\u0010*\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0010H\u0002R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006D"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", androidx.appcompat.graphics.drawable.a.A, "Lv3/m2;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "removeViewAt", "removeViewInLayout", "removeView", "start", "count", "removeViews", "removeViewsInLayout", "removeAllViewsInLayout", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "v", "a", "", "b", "Ljava/util/List;", "disappearingFragmentChildren", "c", "transitioningFragmentViews", androidx.appcompat.widget.d.f1513o, "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "e", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    @n6.d

    /* renamed from: b  reason: collision with root package name and from kotlin metadata */
    public final List<View> disappearingFragmentChildren;
    @n6.d

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public final List<View> transitioningFragmentViews;
    @n6.e

    /* renamed from: d  reason: collision with root package name and from kotlin metadata */
    public View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    /* renamed from: e  reason: collision with root package name and from kotlin metadata */
    public boolean drawDisappearingViewsFirst;

    @d.w0(20)
    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f4217a = new a();

        @n6.d
        public final WindowInsets a(@n6.d View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @n6.d View view, @n6.d WindowInsets windowInsets) {
            u4.l0.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            u4.l0.p(view, "v");
            u4.l0.p(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            u4.l0.o(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @s4.i
    public FragmentContainerView(@n6.d Context context, @n6.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        u4.l0.p(context, "context");
    }

    public final void a(View view) {
        if (this.transitioningFragmentViews.contains(view)) {
            this.disappearingFragmentChildren.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@n6.d View view, int i7, @n6.e ViewGroup.LayoutParams layoutParams) {
        u4.l0.p(view, "child");
        if (FragmentManager.R0(view) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @n6.d
    @d.w0(20)
    public WindowInsets dispatchApplyWindowInsets(@n6.d WindowInsets insets) {
        h4 g12;
        u4.l0.p(insets, "insets");
        h4 K = h4.K(insets);
        u4.l0.o(K, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f4217a;
            u4.l0.m(onApplyWindowInsetsListener);
            g12 = h4.K(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            g12 = u1.g1(this, K);
        }
        u4.l0.o(g12, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!g12.A()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                u1.p(getChildAt(i7), g12);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@n6.d Canvas canvas) {
        u4.l0.p(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@n6.d Canvas canvas, @n6.d View child, long drawingTime) {
        u4.l0.p(canvas, "canvas");
        u4.l0.p(child, "child");
        if (this.drawDisappearingViewsFirst && (!this.disappearingFragmentChildren.isEmpty()) == true && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@n6.d View view) {
        u4.l0.p(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.u0(this).r0(getId());
    }

    @Override // android.view.View
    @n6.d
    @d.w0(20)
    public WindowInsets onApplyWindowInsets(@n6.d WindowInsets insets) {
        u4.l0.p(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            u4.l0.o(childAt, "view");
            a(childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@n6.d View view) {
        u4.l0.p(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        View childAt = getChildAt(i7);
        u4.l0.o(childAt, "view");
        a(childAt);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@n6.d View view) {
        u4.l0.p(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            u4.l0.o(childAt, "view");
            a(childAt);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            u4.l0.o(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i7, i8);
    }

    @s4.h(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.drawDisappearingViewsFirst = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@n6.e LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@n6.d View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        u4.l0.p(onApplyWindowInsetsListener, "listener");
        this.applyWindowInsetsListener = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@n6.d View view) {
        u4.l0.p(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@n6.d Context context) {
        super(context);
        u4.l0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i7, int i8, u4.w wVar) {
        this(context, attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @s4.i
    public FragmentContainerView(@n6.d Context context, @n6.e AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        String str;
        u4.l0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = a.d.f18271e;
            u4.l0.o(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(a.d.f18272f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + i5.h0.f11093b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@n6.d Context context, @n6.d AttributeSet attributeSet, @n6.d FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        u4.l0.p(context, "context");
        u4.l0.p(attributeSet, "attrs");
        u4.l0.p(fragmentManager, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = a.d.f18271e;
        u4.l0.o(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(a.d.f18272f) : classAttribute;
        String string = obtainStyledAttributes.getString(a.d.f18273g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment r02 = fragmentManager.r0(id);
        if (classAttribute != null && r02 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a7 = fragmentManager.H0().a(context.getClassLoader(), classAttribute);
            u4.l0.o(a7, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a7.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.u().Q(true).j(this, a7, string).t();
        }
        fragmentManager.p1(this);
    }
}
