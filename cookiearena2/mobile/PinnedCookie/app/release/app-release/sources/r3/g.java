package r3;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import java.util.Locale;
import r3.h;
/* loaded from: classes.dex */
public final class g extends RecyclerView.t {

    /* renamed from: n  reason: collision with root package name */
    public static final int f15622n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f15623o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f15624p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f15625q = 3;

    /* renamed from: r  reason: collision with root package name */
    public static final int f15626r = 4;

    /* renamed from: s  reason: collision with root package name */
    public static final int f15627s = -1;

    /* renamed from: a  reason: collision with root package name */
    public h.j f15628a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final h f15629b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f15630c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f15631d;

    /* renamed from: e  reason: collision with root package name */
    public int f15632e;

    /* renamed from: f  reason: collision with root package name */
    public int f15633f;

    /* renamed from: g  reason: collision with root package name */
    public a f15634g;

    /* renamed from: h  reason: collision with root package name */
    public int f15635h;

    /* renamed from: i  reason: collision with root package name */
    public int f15636i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15637j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15638k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15639l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15640m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f15641a;

        /* renamed from: b  reason: collision with root package name */
        public float f15642b;

        /* renamed from: c  reason: collision with root package name */
        public int f15643c;

        public void a() {
            this.f15641a = -1;
            this.f15642b = 0.0f;
            this.f15643c = 0;
        }
    }

    public g(@o0 h hVar) {
        this.f15629b = hVar;
        RecyclerView recyclerView = hVar.f15658k;
        this.f15630c = recyclerView;
        this.f15631d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f15634g = new a();
        o();
    }

    public final void a(int i7, float f7, int i8) {
        h.j jVar = this.f15628a;
        if (jVar != null) {
            jVar.onPageScrolled(i7, f7, i8);
        }
    }

    public final void b(int i7) {
        h.j jVar = this.f15628a;
        if (jVar != null) {
            jVar.onPageSelected(i7);
        }
    }

    public final void c(int i7) {
        if ((this.f15632e == 3 && this.f15633f == 0) || this.f15633f == i7) {
            return;
        }
        this.f15633f = i7;
        h.j jVar = this.f15628a;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i7);
        }
    }

    public final int d() {
        return this.f15631d.findFirstVisibleItemPosition();
    }

    public double e() {
        r();
        a aVar = this.f15634g;
        return aVar.f15641a + aVar.f15642b;
    }

    public int f() {
        return this.f15633f;
    }

    public boolean g() {
        return this.f15633f == 1;
    }

    public boolean h() {
        return this.f15640m;
    }

    public boolean i() {
        return this.f15633f == 0;
    }

    public final boolean j() {
        int i7 = this.f15632e;
        return i7 == 1 || i7 == 4;
    }

    public void k() {
        this.f15632e = 4;
        q(true);
    }

    public void l() {
        this.f15639l = true;
    }

    public void m() {
        if (!g() || this.f15640m) {
            this.f15640m = false;
            r();
            a aVar = this.f15634g;
            if (aVar.f15643c != 0) {
                c(2);
                return;
            }
            int i7 = aVar.f15641a;
            if (i7 != this.f15635h) {
                b(i7);
            }
            c(0);
            o();
        }
    }

    public void n(int i7, boolean z6) {
        this.f15632e = z6 ? 2 : 3;
        this.f15640m = false;
        boolean z7 = this.f15636i != i7;
        this.f15636i = i7;
        c(2);
        if (z7) {
            b(i7);
        }
    }

    public final void o() {
        this.f15632e = 0;
        this.f15633f = 0;
        this.f15634g.a();
        this.f15635h = -1;
        this.f15636i = -1;
        this.f15637j = false;
        this.f15638k = false;
        this.f15640m = false;
        this.f15639l = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(@o0 RecyclerView recyclerView, int i7) {
        boolean z6 = true;
        if (!(this.f15632e == 1 && this.f15633f == 1) && i7 == 1) {
            q(false);
        } else if (j() && i7 == 2) {
            if (this.f15638k) {
                c(2);
                this.f15637j = true;
            }
        } else {
            if (j() && i7 == 0) {
                r();
                if (this.f15638k) {
                    a aVar = this.f15634g;
                    if (aVar.f15643c == 0) {
                        int i8 = this.f15635h;
                        int i9 = aVar.f15641a;
                        if (i8 != i9) {
                            b(i9);
                        }
                    } else {
                        z6 = false;
                    }
                } else {
                    int i10 = this.f15634g.f15641a;
                    if (i10 != -1) {
                        a(i10, 0.0f, 0);
                    }
                }
                if (z6) {
                    c(0);
                    o();
                }
            }
            if (this.f15632e == 2 && i7 == 0 && this.f15639l) {
                r();
                a aVar2 = this.f15634g;
                if (aVar2.f15643c == 0) {
                    int i11 = this.f15636i;
                    int i12 = aVar2.f15641a;
                    if (i11 != i12) {
                        if (i12 == -1) {
                            i12 = 0;
                        }
                        b(i12);
                    }
                    c(0);
                    o();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.f15629b.k()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(@d.o0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f15638k = r4
            r3.r()
            boolean r0 = r3.f15637j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f15637j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            r3.h r6 = r3.f15629b
            boolean r6 = r6.k()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L2f
            r3.g$a r5 = r3.f15634g
            int r6 = r5.f15643c
            if (r6 == 0) goto L2f
            int r5 = r5.f15641a
            int r5 = r5 + r4
            goto L33
        L2f:
            r3.g$a r5 = r3.f15634g
            int r5 = r5.f15641a
        L33:
            r3.f15636i = r5
            int r6 = r3.f15635h
            if (r6 == r5) goto L4b
            r3.b(r5)
            goto L4b
        L3d:
            int r5 = r3.f15632e
            if (r5 != 0) goto L4b
            r3.g$a r5 = r3.f15634g
            int r5 = r5.f15641a
            if (r5 != r1) goto L48
            r5 = r2
        L48:
            r3.b(r5)
        L4b:
            r3.g$a r5 = r3.f15634g
            int r6 = r5.f15641a
            if (r6 != r1) goto L52
            r6 = r2
        L52:
            float r0 = r5.f15642b
            int r5 = r5.f15643c
            r3.a(r6, r0, r5)
            r3.g$a r5 = r3.f15634g
            int r6 = r5.f15641a
            int r0 = r3.f15636i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f15643c
            if (r5 != 0) goto L71
            int r5 = r3.f15633f
            if (r5 == r4) goto L71
            r3.c(r2)
            r3.o()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.g.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public void p(h.j jVar) {
        this.f15628a = jVar;
    }

    public final void q(boolean z6) {
        this.f15640m = z6;
        this.f15632e = z6 ? 4 : 1;
        int i7 = this.f15636i;
        if (i7 != -1) {
            this.f15635h = i7;
            this.f15636i = -1;
        } else if (this.f15635h == -1) {
            this.f15635h = d();
        }
        c(1);
    }

    public final void r() {
        int top;
        a aVar = this.f15634g;
        int findFirstVisibleItemPosition = this.f15631d.findFirstVisibleItemPosition();
        aVar.f15641a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View findViewByPosition = this.f15631d.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f15631d.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f15631d.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f15631d.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f15631d.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f15631d.getOrientation() == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f15630c.getPaddingLeft();
            if (this.f15629b.k()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - this.f15630c.getPaddingTop();
        }
        int i7 = -top;
        aVar.f15643c = i7;
        if (i7 >= 0) {
            aVar.f15642b = height == 0 ? 0.0f : i7 / height;
        } else if (!new r3.a(this.f15631d).d()) {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f15643c)));
        } else {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
