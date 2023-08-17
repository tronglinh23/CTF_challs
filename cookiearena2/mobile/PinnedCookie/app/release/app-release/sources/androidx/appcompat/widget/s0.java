package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.z2;
import f.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z0.a;
/* loaded from: classes.dex */
public class s0 extends ListView {

    /* renamed from: o  reason: collision with root package name */
    public static final int f1769o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1770p = -1;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f1771b;

    /* renamed from: c  reason: collision with root package name */
    public int f1772c;

    /* renamed from: d  reason: collision with root package name */
    public int f1773d;

    /* renamed from: e  reason: collision with root package name */
    public int f1774e;

    /* renamed from: f  reason: collision with root package name */
    public int f1775f;

    /* renamed from: g  reason: collision with root package name */
    public int f1776g;

    /* renamed from: h  reason: collision with root package name */
    public d f1777h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1778i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1779j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1780k;

    /* renamed from: l  reason: collision with root package name */
    public z2 f1781l;

    /* renamed from: m  reason: collision with root package name */
    public k1.q f1782m;

    /* renamed from: n  reason: collision with root package name */
    public f f1783n;

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(View view, float f7, float f8) {
            view.drawableHotspotChanged(f7, f8);
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static Method f1784a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f1785b;

        /* renamed from: c  reason: collision with root package name */
        public static Method f1786c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f1787d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1784a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1785b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1786c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1787d = true;
            } catch (NoSuchMethodException e7) {
                e7.printStackTrace();
            }
        }

        public static boolean a() {
            return f1787d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void b(s0 s0Var, int i7, View view) {
            try {
                f1784a.invoke(s0Var, Integer.valueOf(i7), view, Boolean.FALSE, -1, -1);
                f1785b.invoke(s0Var, Integer.valueOf(i7));
                f1786c.invoke(s0Var, Integer.valueOf(i7));
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (InvocationTargetException e8) {
                e8.printStackTrace();
            }
        }
    }

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static boolean a(AbsListView absListView) {
            boolean isSelectedChildViewEnabled;
            isSelectedChildViewEnabled = absListView.isSelectedChildViewEnabled();
            return isSelectedChildViewEnabled;
        }

        @d.u
        public static void b(AbsListView absListView, boolean z6) {
            absListView.setSelectedChildViewEnabled(z6);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends androidx.appcompat.graphics.drawable.c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f1788c;

        public d(Drawable drawable) {
            super(drawable);
            this.f1788c = true;
        }

        public void c(boolean z6) {
            this.f1788c = z6;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1788c) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspot(float f7, float f8) {
            if (this.f1788c) {
                super.setHotspot(f7, f8);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f1788c) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1788c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z6, boolean z7) {
            if (this.f1788c) {
                return super.setVisible(z6, z7);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f1789a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
            f1789a = field;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f1789a;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static void b(AbsListView absListView, boolean z6) {
            Field field = f1789a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z6));
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            s0 s0Var = s0.this;
            s0Var.f1783n = null;
            s0Var.removeCallbacks(this);
        }

        public void b() {
            s0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            s0 s0Var = s0.this;
            s0Var.f1783n = null;
            s0Var.drawableStateChanged();
        }
    }

    public s0(@d.o0 Context context, boolean z6) {
        super(context, null, a.b.f8920p1);
        this.f1771b = new Rect();
        this.f1772c = 0;
        this.f1773d = 0;
        this.f1774e = 0;
        this.f1775f = 0;
        this.f1779j = z6;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f1780k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1776g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        z2 z2Var = this.f1781l;
        if (z2Var != null) {
            z2Var.d();
            this.f1781l = null;
        }
    }

    public final void b(View view, int i7) {
        performItemClick(view, i7, getItemIdAtPosition(i7));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f1771b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1771b);
        selector.draw(canvas);
    }

    public int d(int i7, boolean z6) {
        int min;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z6) {
                    min = Math.max(0, i7);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i7, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            } else if (i7 >= 0 && i7 < count) {
                return i7;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1783n != null) {
            return;
        }
        super.drawableStateChanged();
        k(true);
        o();
    }

    public int e(int i7, int i8, int i9, int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i12 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        View view = null;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i7, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i10) {
                return (i11 < 0 || i13 <= i11 || i15 <= 0 || i12 == i10) ? i10 : i15;
            }
            if (i11 >= 0 && i13 >= i11) {
                i15 = i12;
            }
            i13++;
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.j(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            k1.q r9 = r7.f1782m
            if (r9 != 0) goto L5a
            k1.q r9 = new k1.q
            r9.<init>(r7)
            r7.f1782m = r9
        L5a:
            k1.q r9 = r7.f1782m
            r9.o(r1)
            k1.q r9 = r7.f1782m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            k1.q r8 = r7.f1782m
            if (r8 == 0) goto L6c
            r8.o(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.f(android.view.MotionEvent, int):boolean");
    }

    public final void g(int i7, View view) {
        Rect rect = this.f1771b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1772c;
        rect.top -= this.f1773d;
        rect.right += this.f1774e;
        rect.bottom += this.f1775f;
        boolean l7 = l();
        if (view.isEnabled() != l7) {
            m(!l7);
            if (i7 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void h(int i7, View view) {
        Drawable selector = getSelector();
        boolean z6 = (selector == null || i7 == -1) ? false : true;
        if (z6) {
            selector.setVisible(false, false);
        }
        g(i7, view);
        if (z6) {
            Rect rect = this.f1771b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            q0.c.k(selector, exactCenterX, exactCenterY);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1779j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1779j || super.hasWindowFocus();
    }

    public final void i(int i7, View view, float f7, float f8) {
        h(i7, view);
        Drawable selector = getSelector();
        if (selector == null || i7 == -1) {
            return;
        }
        q0.c.k(selector, f7, f8);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1779j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1779j && this.f1778i) || super.isInTouchMode();
    }

    public final void j(View view, int i7, float f7, float f8) {
        View childAt;
        this.f1780k = true;
        a.a(this, f7, f8);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i8 = this.f1776g;
        if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1776g = i7;
        a.a(view, f7 - view.getLeft(), f8 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i7, view, f7, f8);
        k(false);
        refreshDrawableState();
    }

    public final void k(boolean z6) {
        d dVar = this.f1777h;
        if (dVar != null) {
            dVar.c(z6);
        }
    }

    @d.s0(markerClass = {a.b.class})
    public final boolean l() {
        return z0.a.k() ? c.a(this) : e.a(this);
    }

    @d.s0(markerClass = {a.b.class})
    public final void m(boolean z6) {
        if (z0.a.k()) {
            c.b(this, z6);
        } else {
            e.b(this, z6);
        }
    }

    public final boolean n() {
        return this.f1780k;
    }

    public final void o() {
        Drawable selector = getSelector();
        if (selector != null && n() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1783n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@d.o0 MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1783n == null) {
            f fVar = new f();
            this.f1783n = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                o();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1776g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1783n;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f1778i = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1777h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1772c = rect.left;
        this.f1773d = rect.top;
        this.f1774e = rect.right;
        this.f1775f = rect.bottom;
    }
}
