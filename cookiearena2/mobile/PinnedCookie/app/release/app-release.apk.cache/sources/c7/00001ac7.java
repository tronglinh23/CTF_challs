package t3;

import android.graphics.Rect;
import u4.l0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f16825a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16826b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16827c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16828d;

    public b(int i7, int i8, int i9, int i10) {
        this.f16825a = i7;
        this.f16826b = i8;
        this.f16827c = i9;
        this.f16828d = i10;
    }

    public final int a() {
        return this.f16828d;
    }

    public final int b() {
        return this.f16828d - this.f16826b;
    }

    public final int c() {
        return this.f16825a;
    }

    public final int d() {
        return this.f16827c;
    }

    public final int e() {
        return this.f16826b;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (l0.g(b.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                b bVar = (b) obj;
                return this.f16825a == bVar.f16825a && this.f16826b == bVar.f16826b && this.f16827c == bVar.f16827c && this.f16828d == bVar.f16828d;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        return false;
    }

    public final int f() {
        return this.f16827c - this.f16825a;
    }

    public final boolean g() {
        return b() == 0 || f() == 0;
    }

    public final boolean h() {
        return b() == 0 && f() == 0;
    }

    public int hashCode() {
        return (((((this.f16825a * 31) + this.f16826b) * 31) + this.f16827c) * 31) + this.f16828d;
    }

    @n6.d
    public final Rect i() {
        return new Rect(this.f16825a, this.f16826b, this.f16827c, this.f16828d);
    }

    @n6.d
    public String toString() {
        return ((Object) b.class.getSimpleName()) + " { [" + this.f16825a + ',' + this.f16826b + ',' + this.f16827c + ',' + this.f16828d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@n6.d Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        l0.p(rect, "rect");
    }
}