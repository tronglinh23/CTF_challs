package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5329d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final String f5330e = "ChildrenHelper";

    /* renamed from: a  reason: collision with root package name */
    public final b f5331a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5332b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f5333c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f5334c = 64;

        /* renamed from: d  reason: collision with root package name */
        public static final long f5335d = Long.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public long f5336a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f5337b;

        public void a(int i7) {
            if (i7 < 64) {
                this.f5336a &= ~(1 << i7);
                return;
            }
            a aVar = this.f5337b;
            if (aVar != null) {
                aVar.a(i7 - 64);
            }
        }

        public int b(int i7) {
            a aVar = this.f5337b;
            return aVar == null ? i7 >= 64 ? Long.bitCount(this.f5336a) : Long.bitCount(this.f5336a & ((1 << i7) - 1)) : i7 < 64 ? Long.bitCount(this.f5336a & ((1 << i7) - 1)) : aVar.b(i7 - 64) + Long.bitCount(this.f5336a);
        }

        public final void c() {
            if (this.f5337b == null) {
                this.f5337b = new a();
            }
        }

        public boolean d(int i7) {
            if (i7 < 64) {
                return (this.f5336a & (1 << i7)) != 0;
            }
            c();
            return this.f5337b.d(i7 - 64);
        }

        public void e(int i7, boolean z6) {
            if (i7 >= 64) {
                c();
                this.f5337b.e(i7 - 64, z6);
                return;
            }
            long j7 = this.f5336a;
            boolean z7 = (Long.MIN_VALUE & j7) != 0;
            long j8 = (1 << i7) - 1;
            this.f5336a = ((j7 & (~j8)) << 1) | (j7 & j8);
            if (z6) {
                h(i7);
            } else {
                a(i7);
            }
            if (z7 || this.f5337b != null) {
                c();
                this.f5337b.e(0, z7);
            }
        }

        public boolean f(int i7) {
            if (i7 >= 64) {
                c();
                return this.f5337b.f(i7 - 64);
            }
            long j7 = 1 << i7;
            long j8 = this.f5336a;
            boolean z6 = (j8 & j7) != 0;
            long j9 = j8 & (~j7);
            this.f5336a = j9;
            long j10 = j7 - 1;
            this.f5336a = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
            a aVar = this.f5337b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f5337b.f(0);
            }
            return z6;
        }

        public void g() {
            this.f5336a = 0L;
            a aVar = this.f5337b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i7) {
            if (i7 < 64) {
                this.f5336a |= 1 << i7;
                return;
            }
            c();
            this.f5337b.h(i7 - 64);
        }

        public String toString() {
            if (this.f5337b == null) {
                return Long.toBinaryString(this.f5336a);
            }
            return this.f5337b.toString() + "xx" + Long.toBinaryString(this.f5336a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        View a(int i7);

        void b(View view);

        RecyclerView.f0 c(View view);

        void d(int i7);

        void e(View view);

        void f(View view, int i7);

        int g();

        void h(int i7);

        void i();

        void j(View view, int i7, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    public g(b bVar) {
        this.f5331a = bVar;
    }

    public void a(View view, int i7, boolean z6) {
        int g7 = i7 < 0 ? this.f5331a.g() : h(i7);
        this.f5332b.e(g7, z6);
        if (z6) {
            l(view);
        }
        this.f5331a.f(view, g7);
    }

    public void b(View view, boolean z6) {
        a(view, -1, z6);
    }

    public void c(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z6) {
        int g7 = i7 < 0 ? this.f5331a.g() : h(i7);
        this.f5332b.e(g7, z6);
        if (z6) {
            l(view);
        }
        this.f5331a.j(view, g7, layoutParams);
    }

    public void d(int i7) {
        int h7 = h(i7);
        this.f5332b.f(h7);
        this.f5331a.d(h7);
    }

    public View e(int i7) {
        int size = this.f5333c.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = this.f5333c.get(i8);
            RecyclerView.f0 c7 = this.f5331a.c(view);
            if (c7.getLayoutPosition() == i7 && !c7.isInvalid() && !c7.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i7) {
        return this.f5331a.a(h(i7));
    }

    public int g() {
        return this.f5331a.g() - this.f5333c.size();
    }

    public final int h(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int g7 = this.f5331a.g();
        int i8 = i7;
        while (i8 < g7) {
            int b7 = i7 - (i8 - this.f5332b.b(i8));
            if (b7 == 0) {
                while (this.f5332b.d(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += b7;
        }
        return -1;
    }

    public View i(int i7) {
        return this.f5331a.a(i7);
    }

    public int j() {
        return this.f5331a.g();
    }

    public void k(View view) {
        int k7 = this.f5331a.k(view);
        if (k7 >= 0) {
            this.f5332b.h(k7);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void l(View view) {
        this.f5333c.add(view);
        this.f5331a.b(view);
    }

    public int m(View view) {
        int k7 = this.f5331a.k(view);
        if (k7 == -1 || this.f5332b.d(k7)) {
            return -1;
        }
        return k7 - this.f5332b.b(k7);
    }

    public boolean n(View view) {
        return this.f5333c.contains(view);
    }

    public void o() {
        this.f5332b.g();
        for (int size = this.f5333c.size() - 1; size >= 0; size--) {
            this.f5331a.e(this.f5333c.get(size));
            this.f5333c.remove(size);
        }
        this.f5331a.i();
    }

    public void p(View view) {
        int k7 = this.f5331a.k(view);
        if (k7 < 0) {
            return;
        }
        if (this.f5332b.f(k7)) {
            t(view);
        }
        this.f5331a.h(k7);
    }

    public void q(int i7) {
        int h7 = h(i7);
        View a7 = this.f5331a.a(h7);
        if (a7 == null) {
            return;
        }
        if (this.f5332b.f(h7)) {
            t(a7);
        }
        this.f5331a.h(h7);
    }

    public boolean r(View view) {
        int k7 = this.f5331a.k(view);
        if (k7 == -1) {
            t(view);
            return true;
        } else if (this.f5332b.d(k7)) {
            this.f5332b.f(k7);
            t(view);
            this.f5331a.h(k7);
            return true;
        } else {
            return false;
        }
    }

    public void s(View view) {
        int k7 = this.f5331a.k(view);
        if (k7 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f5332b.d(k7)) {
            this.f5332b.a(k7);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (this.f5333c.remove(view)) {
            this.f5331a.e(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f5332b.toString() + ", hidden list:" + this.f5333c.size();
    }
}