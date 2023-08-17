package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f3561a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f3562b;

    /* renamed from: c  reason: collision with root package name */
    public final View f3563c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3564d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3565e;

    public f1(@d.o0 View view) {
        this.f3563c = view;
    }

    public boolean a(float f7, float f8, boolean z6) {
        ViewParent i7;
        if (!m() || (i7 = i(0)) == null) {
            return false;
        }
        return x2.c(i7, this.f3563c, f7, f8, z6);
    }

    public boolean b(float f7, float f8) {
        ViewParent i7;
        if (!m() || (i7 = i(0)) == null) {
            return false;
        }
        return x2.d(i7, this.f3563c, f7, f8);
    }

    public boolean c(int i7, int i8, @d.q0 int[] iArr, @d.q0 int[] iArr2) {
        return d(i7, i8, iArr, iArr2, 0);
    }

    public boolean d(int i7, int i8, @d.q0 int[] iArr, @d.q0 int[] iArr2, int i9) {
        ViewParent i10;
        int i11;
        int i12;
        if (!m() || (i10 = i(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f3563c.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        x2.f(i10, this.f3563c, i7, i8, iArr, i9);
        if (iArr2 != null) {
            this.f3563c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i7, int i8, int i9, int i10, @d.q0 int[] iArr, int i11, @d.q0 int[] iArr2) {
        h(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    public boolean f(int i7, int i8, int i9, int i10, @d.q0 int[] iArr) {
        return h(i7, i8, i9, i10, iArr, 0, null);
    }

    public boolean g(int i7, int i8, int i9, int i10, @d.q0 int[] iArr, int i11) {
        return h(i7, i8, i9, i10, iArr, i11, null);
    }

    public final boolean h(int i7, int i8, int i9, int i10, @d.q0 int[] iArr, int i11, @d.q0 int[] iArr2) {
        ViewParent i12;
        int i13;
        int i14;
        int[] iArr3;
        if (!m() || (i12 = i(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3563c.getLocationInWindow(iArr);
            i13 = iArr[0];
            i14 = iArr[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            int[] j7 = j();
            j7[0] = 0;
            j7[1] = 0;
            iArr3 = j7;
        } else {
            iArr3 = iArr2;
        }
        x2.i(i12, this.f3563c, i7, i8, i9, i10, i11, iArr3);
        if (iArr != null) {
            this.f3563c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        return true;
    }

    public final ViewParent i(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                return null;
            }
            return this.f3562b;
        }
        return this.f3561a;
    }

    public final int[] j() {
        if (this.f3565e == null) {
            this.f3565e = new int[2];
        }
        return this.f3565e;
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i7) {
        return i(i7) != null;
    }

    public boolean m() {
        return this.f3564d;
    }

    public void n() {
        u1.G2(this.f3563c);
    }

    public void o(@d.o0 View view) {
        u1.G2(this.f3563c);
    }

    public void p(boolean z6) {
        if (this.f3564d) {
            u1.G2(this.f3563c);
        }
        this.f3564d = z6;
    }

    public final void q(int i7, ViewParent viewParent) {
        if (i7 == 0) {
            this.f3561a = viewParent;
        } else if (i7 != 1) {
        } else {
            this.f3562b = viewParent;
        }
    }

    public boolean r(int i7) {
        return s(i7, 0);
    }

    public boolean s(int i7, int i8) {
        if (l(i8)) {
            return true;
        }
        if (m()) {
            View view = this.f3563c;
            for (ViewParent parent = this.f3563c.getParent(); parent != null; parent = parent.getParent()) {
                if (x2.m(parent, view, this.f3563c, i7, i8)) {
                    q(i8, parent);
                    x2.k(parent, view, this.f3563c, i7, i8);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void t() {
        u(0);
    }

    public void u(int i7) {
        ViewParent i8 = i(i7);
        if (i8 != null) {
            x2.o(i8, this.f3563c, i7);
            q(i7, null);
        }
    }
}
