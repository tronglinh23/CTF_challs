package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.d0;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class k extends j0 {

    /* renamed from: p  reason: collision with root package name */
    public static final String f6649p = "android:changeTransform:parent";

    /* renamed from: r  reason: collision with root package name */
    public static final String f6651r = "android:changeTransform:intermediateParentMatrix";

    /* renamed from: s  reason: collision with root package name */
    public static final String f6652s = "android:changeTransform:intermediateMatrix";

    /* renamed from: k  reason: collision with root package name */
    public boolean f6657k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6658l;

    /* renamed from: m  reason: collision with root package name */
    public Matrix f6659m;

    /* renamed from: n  reason: collision with root package name */
    public static final String f6647n = "android:changeTransform:matrix";

    /* renamed from: o  reason: collision with root package name */
    public static final String f6648o = "android:changeTransform:transforms";

    /* renamed from: q  reason: collision with root package name */
    public static final String f6650q = "android:changeTransform:parentMatrix";

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f6653t = {f6647n, f6648o, f6650q};

    /* renamed from: u  reason: collision with root package name */
    public static final Property<e, float[]> f6654u = new a(float[].class, "nonTranslations");

    /* renamed from: v  reason: collision with root package name */
    public static final Property<e, PointF> f6655v = new b(PointF.class, "translations");

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f6656w = true;

    /* loaded from: classes.dex */
    public class a extends Property<e, float[]> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<e, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6660a;

        /* renamed from: b  reason: collision with root package name */
        public Matrix f6661b = new Matrix();

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f6662c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Matrix f6663d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ View f6664e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f f6665f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f6666g;

        public c(boolean z6, Matrix matrix, View view, f fVar, e eVar) {
            this.f6662c = z6;
            this.f6663d = matrix;
            this.f6664e = view;
            this.f6665f = fVar;
            this.f6666g = eVar;
        }

        public final void a(Matrix matrix) {
            this.f6661b.set(matrix);
            this.f6664e.setTag(d0.g.V1, this.f6661b);
            this.f6665f.a(this.f6664e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6660a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f6660a) {
                if (this.f6662c && k.this.f6657k) {
                    a(this.f6663d);
                } else {
                    this.f6664e.setTag(d0.g.V1, null);
                    this.f6664e.setTag(d0.g.R0, null);
                }
            }
            e1.f(this.f6664e, null);
            this.f6665f.a(this.f6664e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f6666g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            k.E(this.f6664e);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public View f6668a;

        /* renamed from: b  reason: collision with root package name */
        public q f6669b;

        public d(View view, q qVar) {
            this.f6668a = view;
            this.f6669b = qVar;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            j0Var.removeListener(this);
            u.b(this.f6668a);
            this.f6668a.setTag(d0.g.V1, null);
            this.f6668a.setTag(d0.g.R0, null);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionPause(@d.o0 j0 j0Var) {
            this.f6669b.setVisibility(4);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionResume(@d.o0 j0 j0Var) {
            this.f6669b.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f6670a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final View f6671b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f6672c;

        /* renamed from: d  reason: collision with root package name */
        public float f6673d;

        /* renamed from: e  reason: collision with root package name */
        public float f6674e;

        public e(View view, float[] fArr) {
            this.f6671b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f6672c = fArr2;
            this.f6673d = fArr2[2];
            this.f6674e = fArr2[5];
            b();
        }

        public Matrix a() {
            return this.f6670a;
        }

        public final void b() {
            float[] fArr = this.f6672c;
            fArr[2] = this.f6673d;
            fArr[5] = this.f6674e;
            this.f6670a.setValues(fArr);
            e1.f(this.f6671b, this.f6670a);
        }

        public void c(PointF pointF) {
            this.f6673d = pointF.x;
            this.f6674e = pointF.y;
            b();
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f6672c, 0, fArr.length);
            b();
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final float f6675a;

        /* renamed from: b  reason: collision with root package name */
        public final float f6676b;

        /* renamed from: c  reason: collision with root package name */
        public final float f6677c;

        /* renamed from: d  reason: collision with root package name */
        public final float f6678d;

        /* renamed from: e  reason: collision with root package name */
        public final float f6679e;

        /* renamed from: f  reason: collision with root package name */
        public final float f6680f;

        /* renamed from: g  reason: collision with root package name */
        public final float f6681g;

        /* renamed from: h  reason: collision with root package name */
        public final float f6682h;

        public f(View view) {
            this.f6675a = view.getTranslationX();
            this.f6676b = view.getTranslationY();
            this.f6677c = androidx.core.view.u1.A0(view);
            this.f6678d = view.getScaleX();
            this.f6679e = view.getScaleY();
            this.f6680f = view.getRotationX();
            this.f6681g = view.getRotationY();
            this.f6682h = view.getRotation();
        }

        public void a(View view) {
            k.I(view, this.f6675a, this.f6676b, this.f6677c, this.f6678d, this.f6679e, this.f6680f, this.f6681g, this.f6682h);
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                return fVar.f6675a == this.f6675a && fVar.f6676b == this.f6676b && fVar.f6677c == this.f6677c && fVar.f6678d == this.f6678d && fVar.f6679e == this.f6679e && fVar.f6680f == this.f6680f && fVar.f6681g == this.f6681g && fVar.f6682h == this.f6682h;
            }
            return false;
        }

        public int hashCode() {
            float f7 = this.f6675a;
            int floatToIntBits = (f7 != 0.0f ? Float.floatToIntBits(f7) : 0) * 31;
            float f8 = this.f6676b;
            int floatToIntBits2 = (floatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.f6677c;
            int floatToIntBits3 = (floatToIntBits2 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0)) * 31;
            float f10 = this.f6678d;
            int floatToIntBits4 = (floatToIntBits3 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f6679e;
            int floatToIntBits5 = (floatToIntBits4 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f6680f;
            int floatToIntBits6 = (floatToIntBits5 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f6681g;
            int floatToIntBits7 = (floatToIntBits6 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f6682h;
            return floatToIntBits7 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0);
        }
    }

    public k() {
        this.f6657k = true;
        this.f6658l = true;
        this.f6659m = new Matrix();
    }

    public static void E(View view) {
        I(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public static void I(View view, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        view.setTranslationX(f7);
        view.setTranslationY(f8);
        androidx.core.view.u1.w2(view, f9);
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setRotationX(f12);
        view.setRotationY(f13);
        view.setRotation(f14);
    }

    public final ObjectAnimator A(r0 r0Var, r0 r0Var2, boolean z6) {
        Matrix matrix = (Matrix) r0Var.f6756a.get(f6647n);
        Matrix matrix2 = (Matrix) r0Var2.f6756a.get(f6647n);
        if (matrix == null) {
            matrix = x.f6819a;
        }
        if (matrix2 == null) {
            matrix2 = x.f6819a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) r0Var2.f6756a.get(f6648o);
        View view = r0Var2.f6757b;
        E(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(f6654u, new o(new float[9]), fArr, fArr2), c0.a(f6655v, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z6, matrix3, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        androidx.transition.a.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    public boolean B() {
        return this.f6658l;
    }

    public boolean C() {
        return this.f6657k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r5 == r4.f6757b) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r4 == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            androidx.transition.r0 r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.f6757b
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            r2 = r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.k.D(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    public final void F(r0 r0Var, r0 r0Var2) {
        Matrix matrix = (Matrix) r0Var2.f6756a.get(f6650q);
        r0Var2.f6757b.setTag(d0.g.R0, matrix);
        Matrix matrix2 = this.f6659m;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) r0Var.f6756a.get(f6647n);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            r0Var.f6756a.put(f6647n, matrix3);
        }
        matrix3.postConcat((Matrix) r0Var.f6756a.get(f6650q));
        matrix3.postConcat(matrix2);
    }

    public void G(boolean z6) {
        this.f6658l = z6;
    }

    public void H(boolean z6) {
        this.f6657k = z6;
    }

    @Override // androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    @Override // androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
        if (f6656w) {
            return;
        }
        ((ViewGroup) r0Var.f6757b.getParent()).startViewTransition(r0Var.f6757b);
    }

    public final void captureValues(r0 r0Var) {
        View view = r0Var.f6757b;
        if (view.getVisibility() == 8) {
            return;
        }
        r0Var.f6756a.put(f6649p, view.getParent());
        r0Var.f6756a.put(f6648o, new f(view));
        Matrix matrix = view.getMatrix();
        r0Var.f6756a.put(f6647n, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f6658l) {
            Matrix matrix2 = new Matrix();
            e1.j((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            r0Var.f6756a.put(f6650q, matrix2);
            r0Var.f6756a.put(f6652s, view.getTag(d0.g.V1));
            r0Var.f6756a.put(f6651r, view.getTag(d0.g.R0));
        }
    }

    @Override // androidx.transition.j0
    @d.q0
    public Animator createAnimator(@d.o0 ViewGroup viewGroup, @d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        if (r0Var == null || r0Var2 == null || !r0Var.f6756a.containsKey(f6649p) || !r0Var2.f6756a.containsKey(f6649p)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) r0Var.f6756a.get(f6649p);
        boolean z6 = this.f6658l && !D(viewGroup2, (ViewGroup) r0Var2.f6756a.get(f6649p));
        Matrix matrix = (Matrix) r0Var.f6756a.get(f6652s);
        if (matrix != null) {
            r0Var.f6756a.put(f6647n, matrix);
        }
        Matrix matrix2 = (Matrix) r0Var.f6756a.get(f6651r);
        if (matrix2 != null) {
            r0Var.f6756a.put(f6650q, matrix2);
        }
        if (z6) {
            F(r0Var, r0Var2);
        }
        ObjectAnimator A = A(r0Var, r0Var2, z6);
        if (z6 && A != null && this.f6657k) {
            z(viewGroup, r0Var, r0Var2);
        } else if (!f6656w) {
            viewGroup2.endViewTransition(r0Var.f6757b);
        }
        return A;
    }

    @Override // androidx.transition.j0
    @d.o0
    public String[] getTransitionProperties() {
        return f6653t;
    }

    public final void z(ViewGroup viewGroup, r0 r0Var, r0 r0Var2) {
        View view = r0Var2.f6757b;
        Matrix matrix = new Matrix((Matrix) r0Var2.f6756a.get(f6650q));
        e1.k(viewGroup, matrix);
        q a7 = u.a(view, viewGroup, matrix);
        if (a7 == null) {
            return;
        }
        a7.a((ViewGroup) r0Var.f6756a.get(f6649p), r0Var.f6757b);
        j0 j0Var = this;
        while (true) {
            j0 j0Var2 = j0Var.mParent;
            if (j0Var2 == null) {
                break;
            }
            j0Var = j0Var2;
        }
        j0Var.addListener(new d(view, a7));
        if (f6656w) {
            View view2 = r0Var.f6757b;
            if (view2 != r0Var2.f6757b) {
                e1.h(view2, 0.0f);
            }
            e1.h(view, 1.0f);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public k(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6657k = true;
        this.f6658l = true;
        this.f6659m = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6607g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f6657k = m0.p.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f6658l = m0.p.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
