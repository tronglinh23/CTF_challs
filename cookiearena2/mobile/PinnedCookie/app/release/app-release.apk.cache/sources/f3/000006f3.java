package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.b1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public a f5676a;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: g  reason: collision with root package name */
        public static Method f5677g;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f5678b;

        /* renamed from: c  reason: collision with root package name */
        public View f5679c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Drawable> f5680d;

        /* renamed from: e  reason: collision with root package name */
        public b1 f5681e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5682f;

        static {
            try {
                Class cls = Integer.TYPE;
                f5677g = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, b1 b1Var) {
            super(context);
            this.f5680d = null;
            this.f5678b = viewGroup;
            this.f5679c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f5681e = b1Var;
        }

        public void a(Drawable drawable) {
            c();
            if (this.f5680d == null) {
                this.f5680d = new ArrayList<>();
            }
            if (this.f5680d.contains(drawable)) {
                return;
            }
            this.f5680d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f5678b && viewGroup.getParent() != null && androidx.core.view.u1.O0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f5678b.getLocationOnScreen(iArr2);
                    androidx.core.view.u1.e1(view, iArr[0] - iArr2[0]);
                    androidx.core.view.u1.f1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void c() {
            if (this.f5682f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f5680d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f5682f = true;
                    this.f5678b.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f5678b.getLocationOnScreen(new int[2]);
            this.f5679c.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f5679c.getWidth(), this.f5679c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f5680d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f5680d.get(i7).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f5678b.getLocationOnScreen(iArr2);
            this.f5679c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public ViewParent f(int i7, int i8, Rect rect) {
            if (this.f5678b == null || f5677g == null) {
                return null;
            }
            try {
                e(new int[2]);
                f5677g.invoke(this.f5678b, Integer.valueOf(i7), Integer.valueOf(i8), rect);
                return null;
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
                return null;
            } catch (InvocationTargetException e8) {
                e8.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f5680d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f5678b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f5678b == null) {
                    invalidate(rect);
                    return null;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@d.o0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(@d.o0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f5680d) != null && arrayList.contains(drawable));
        }
    }

    public b1(Context context, ViewGroup viewGroup, View view) {
        this.f5676a = new a(context, viewGroup, view, this);
    }

    public static b1 a(View view) {
        ViewGroup b7 = b(view);
        if (b7 != null) {
            int childCount = b7.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = b7.getChildAt(i7);
                if (childAt instanceof a) {
                    return ((a) childAt).f5681e;
                }
            }
            return new u0(b7.getContext(), b7, view);
        }
        return null;
    }

    public static ViewGroup b(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.d1
    public void add(@d.o0 Drawable drawable) {
        this.f5676a.a(drawable);
    }

    @Override // androidx.transition.d1
    public void remove(@d.o0 Drawable drawable) {
        this.f5676a.g(drawable);
    }
}