package p0;

import android.graphics.Insets;
import android.graphics.Rect;
import d.b1;
/* loaded from: classes.dex */
public final class v0 {
    @d.o0

    /* renamed from: e  reason: collision with root package name */
    public static final v0 f14584e = new v0(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f14585a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14586b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14587c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14588d;

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static Insets a(int i7, int i8, int i9, int i10) {
            Insets of;
            of = Insets.of(i7, i8, i9, i10);
            return of;
        }
    }

    public v0(int i7, int i8, int i9, int i10) {
        this.f14585a = i7;
        this.f14586b = i8;
        this.f14587c = i9;
        this.f14588d = i10;
    }

    @d.o0
    public static v0 a(@d.o0 v0 v0Var, @d.o0 v0 v0Var2) {
        return d(v0Var.f14585a + v0Var2.f14585a, v0Var.f14586b + v0Var2.f14586b, v0Var.f14587c + v0Var2.f14587c, v0Var.f14588d + v0Var2.f14588d);
    }

    @d.o0
    public static v0 b(@d.o0 v0 v0Var, @d.o0 v0 v0Var2) {
        return d(Math.max(v0Var.f14585a, v0Var2.f14585a), Math.max(v0Var.f14586b, v0Var2.f14586b), Math.max(v0Var.f14587c, v0Var2.f14587c), Math.max(v0Var.f14588d, v0Var2.f14588d));
    }

    @d.o0
    public static v0 c(@d.o0 v0 v0Var, @d.o0 v0 v0Var2) {
        return d(Math.min(v0Var.f14585a, v0Var2.f14585a), Math.min(v0Var.f14586b, v0Var2.f14586b), Math.min(v0Var.f14587c, v0Var2.f14587c), Math.min(v0Var.f14588d, v0Var2.f14588d));
    }

    @d.o0
    public static v0 d(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f14584e : new v0(i7, i8, i9, i10);
    }

    @d.o0
    public static v0 e(@d.o0 Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @d.o0
    public static v0 f(@d.o0 v0 v0Var, @d.o0 v0 v0Var2) {
        return d(v0Var.f14585a - v0Var2.f14585a, v0Var.f14586b - v0Var2.f14586b, v0Var.f14587c - v0Var2.f14587c, v0Var.f14588d - v0Var2.f14588d);
    }

    @d.o0
    @d.w0(api = 29)
    public static v0 g(@d.o0 Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return d(i7, i8, i9, i10);
    }

    @d.o0
    @d.w0(api = 29)
    @Deprecated
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static v0 i(@d.o0 Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f14588d == v0Var.f14588d && this.f14585a == v0Var.f14585a && this.f14587c == v0Var.f14587c && this.f14586b == v0Var.f14586b;
    }

    @d.o0
    @d.w0(29)
    public Insets h() {
        return a.a(this.f14585a, this.f14586b, this.f14587c, this.f14588d);
    }

    public int hashCode() {
        return (((((this.f14585a * 31) + this.f14586b) * 31) + this.f14587c) * 31) + this.f14588d;
    }

    @d.o0
    public String toString() {
        return "Insets{left=" + this.f14585a + ", top=" + this.f14586b + ", right=" + this.f14587c + ", bottom=" + this.f14588d + '}';
    }
}
