package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
/* loaded from: classes.dex */
public class g extends j0 {

    /* renamed from: n  reason: collision with root package name */
    public static final String f6534n = "android:changeBounds:bounds";

    /* renamed from: o  reason: collision with root package name */
    public static final String f6535o = "android:changeBounds:clip";

    /* renamed from: p  reason: collision with root package name */
    public static final String f6536p = "android:changeBounds:parent";

    /* renamed from: q  reason: collision with root package name */
    public static final String f6537q = "android:changeBounds:windowX";

    /* renamed from: r  reason: collision with root package name */
    public static final String f6538r = "android:changeBounds:windowY";

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f6539s = {f6534n, f6535o, f6536p, f6537q, f6538r};

    /* renamed from: t  reason: collision with root package name */
    public static final Property<Drawable, PointF> f6540t = new b(PointF.class, "boundsOrigin");

    /* renamed from: u  reason: collision with root package name */
    public static final Property<k, PointF> f6541u = new c(PointF.class, "topLeft");

    /* renamed from: v  reason: collision with root package name */
    public static final Property<k, PointF> f6542v = new d(PointF.class, "bottomRight");

    /* renamed from: w  reason: collision with root package name */
    public static final Property<View, PointF> f6543w = new e(PointF.class, "bottomRight");

    /* renamed from: x  reason: collision with root package name */
    public static final Property<View, PointF> f6544x = new f(PointF.class, "topLeft");

    /* renamed from: y  reason: collision with root package name */
    public static final Property<View, PointF> f6545y = new C0068g(PointF.class, "position");

    /* renamed from: z  reason: collision with root package name */
    public static e0 f6546z = new e0();

    /* renamed from: k  reason: collision with root package name */
    public int[] f6547k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6548l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6549m;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6550a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f6551b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f6552c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f6553d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f7) {
            this.f6550a = viewGroup;
            this.f6551b = bitmapDrawable;
            this.f6552c = view;
            this.f6553d = f7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e1.b(this.f6550a).remove(this.f6551b);
            e1.h(this.f6552c, this.f6553d);
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f6555a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f6555a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6555a);
            Rect rect = this.f6555a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6555a);
            this.f6555a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6555a);
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            e1.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    public class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            e1.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0068g extends Property<View, PointF> {
        public C0068g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            e1.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f6556a;
        private k mViewBounds;

        public h(k kVar) {
            this.f6556a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6558a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f6559b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Rect f6560c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f6561d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f6562e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f6563f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f6564g;

        public i(View view, Rect rect, int i7, int i8, int i9, int i10) {
            this.f6559b = view;
            this.f6560c = rect;
            this.f6561d = i7;
            this.f6562e = i8;
            this.f6563f = i9;
            this.f6564g = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6558a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6558a) {
                return;
            }
            androidx.core.view.u1.M1(this.f6559b, this.f6560c);
            e1.g(this.f6559b, this.f6561d, this.f6562e, this.f6563f, this.f6564g);
        }
    }

    /* loaded from: classes.dex */
    public class j extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6566a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6567b;

        public j(ViewGroup viewGroup) {
            this.f6567b = viewGroup;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionCancel(@d.o0 j0 j0Var) {
            z0.d(this.f6567b, false);
            this.f6566a = true;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            if (!this.f6566a) {
                z0.d(this.f6567b, false);
            }
            j0Var.removeListener(this);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionPause(@d.o0 j0 j0Var) {
            z0.d(this.f6567b, false);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionResume(@d.o0 j0 j0Var) {
            z0.d(this.f6567b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public int f6569a;

        /* renamed from: b  reason: collision with root package name */
        public int f6570b;

        /* renamed from: c  reason: collision with root package name */
        public int f6571c;

        /* renamed from: d  reason: collision with root package name */
        public int f6572d;

        /* renamed from: e  reason: collision with root package name */
        public View f6573e;

        /* renamed from: f  reason: collision with root package name */
        public int f6574f;

        /* renamed from: g  reason: collision with root package name */
        public int f6575g;

        public k(View view) {
            this.f6573e = view;
        }

        public void a(PointF pointF) {
            this.f6571c = Math.round(pointF.x);
            this.f6572d = Math.round(pointF.y);
            int i7 = this.f6575g + 1;
            this.f6575g = i7;
            if (this.f6574f == i7) {
                b();
            }
        }

        public final void b() {
            e1.g(this.f6573e, this.f6569a, this.f6570b, this.f6571c, this.f6572d);
            this.f6574f = 0;
            this.f6575g = 0;
        }

        public void c(PointF pointF) {
            this.f6569a = Math.round(pointF.x);
            this.f6570b = Math.round(pointF.y);
            int i7 = this.f6574f + 1;
            this.f6574f = i7;
            if (i7 == this.f6575g) {
                b();
            }
        }
    }

    public g() {
        this.f6547k = new int[2];
        this.f6548l = false;
        this.f6549m = false;
    }

    public final boolean A(View view, View view2) {
        if (this.f6549m) {
            r0 matchedTransitionValues = getMatchedTransitionValues(view, true);
            if (matchedTransitionValues == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == matchedTransitionValues.f6757b) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void B(boolean z6) {
        this.f6548l = z6;
    }

    @Override // androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    @Override // androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    public final void captureValues(r0 r0Var) {
        View view = r0Var.f6757b;
        if (!androidx.core.view.u1.U0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        r0Var.f6756a.put(f6534n, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        r0Var.f6756a.put(f6536p, r0Var.f6757b.getParent());
        if (this.f6549m) {
            r0Var.f6757b.getLocationInWindow(this.f6547k);
            r0Var.f6756a.put(f6537q, Integer.valueOf(this.f6547k[0]));
            r0Var.f6756a.put(f6538r, Integer.valueOf(this.f6547k[1]));
        }
        if (this.f6548l) {
            r0Var.f6756a.put(f6535o, androidx.core.view.u1.P(view));
        }
    }

    @Override // androidx.transition.j0
    @d.q0
    public Animator createAnimator(@d.o0 ViewGroup viewGroup, @d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        int i7;
        View view;
        int i8;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c7;
        if (r0Var == null || r0Var2 == null) {
            return null;
        }
        Map<String, Object> map = r0Var.f6756a;
        Map<String, Object> map2 = r0Var2.f6756a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f6536p);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f6536p);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = r0Var2.f6757b;
        if (!A(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) r0Var.f6756a.get(f6537q)).intValue();
            int intValue2 = ((Integer) r0Var.f6756a.get(f6538r)).intValue();
            int intValue3 = ((Integer) r0Var2.f6756a.get(f6537q)).intValue();
            int intValue4 = ((Integer) r0Var2.f6756a.get(f6538r)).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f6547k);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c8 = e1.c(view2);
            e1.h(view2, 0.0f);
            e1.b(viewGroup).add(bitmapDrawable);
            z pathMotion = getPathMotion();
            int[] iArr = this.f6547k;
            int i9 = iArr[0];
            int i10 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, c0.a(f6540t, pathMotion.getPath(intValue - i9, intValue2 - i10, intValue3 - i9, intValue4 - i10)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c8));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) r0Var.f6756a.get(f6534n);
        Rect rect3 = (Rect) r0Var2.f6756a.get(f6534n);
        int i11 = rect2.left;
        int i12 = rect3.left;
        int i13 = rect2.top;
        int i14 = rect3.top;
        int i15 = rect2.right;
        int i16 = rect3.right;
        int i17 = rect2.bottom;
        int i18 = rect3.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect4 = (Rect) r0Var.f6756a.get(f6535o);
        Rect rect5 = (Rect) r0Var2.f6756a.get(f6535o);
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i7 = 0;
        } else {
            i7 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i7++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i7++;
        }
        if (i7 > 0) {
            if (this.f6548l) {
                view = view2;
                e1.g(view, i11, i13, Math.max(i19, i21) + i11, Math.max(i20, i22) + i13);
                ObjectAnimator a7 = (i11 == i12 && i13 == i14) ? null : y.a(view, f6545y, getPathMotion().getPath(i11, i13, i12, i14));
                if (rect4 == null) {
                    i8 = 0;
                    rect = new Rect(0, 0, i19, i20);
                } else {
                    i8 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i8, i8, i21, i22) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    androidx.core.view.u1.M1(view, rect);
                    e0 e0Var = f6546z;
                    Object[] objArr = new Object[2];
                    objArr[i8] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", e0Var, objArr);
                    ofObject.addListener(new i(view, rect5, i12, i14, i16, i18));
                    objectAnimator = ofObject;
                }
                c7 = q0.c(a7, objectAnimator);
            } else {
                view = view2;
                e1.g(view, i11, i13, i15, i17);
                if (i7 != 2) {
                    c7 = (i11 == i12 && i13 == i14) ? y.a(view, f6543w, getPathMotion().getPath(i15, i17, i16, i18)) : y.a(view, f6544x, getPathMotion().getPath(i11, i13, i12, i14));
                } else if (i19 == i21 && i20 == i22) {
                    c7 = y.a(view, f6545y, getPathMotion().getPath(i11, i13, i12, i14));
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a8 = y.a(kVar, f6541u, getPathMotion().getPath(i11, i13, i12, i14));
                    ObjectAnimator a9 = y.a(kVar, f6542v, getPathMotion().getPath(i15, i17, i16, i18));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a8, a9);
                    animatorSet.addListener(new h(kVar));
                    c7 = animatorSet;
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                z0.d(viewGroup4, true);
                addListener(new j(viewGroup4));
            }
            return c7;
        }
        return null;
    }

    @Override // androidx.transition.j0
    @d.o0
    public String[] getTransitionProperties() {
        return f6539s;
    }

    public boolean z() {
        return this.f6548l;
    }

    @SuppressLint({"RestrictedApi"})
    public g(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6547k = new int[2];
        this.f6548l = false;
        this.f6549m = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6604d);
        boolean e7 = m0.p.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        B(e7);
    }
}
