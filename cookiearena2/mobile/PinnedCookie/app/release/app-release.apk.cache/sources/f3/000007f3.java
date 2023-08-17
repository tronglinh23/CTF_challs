package androidx.window.layout;

import android.graphics.Rect;
import d.b1;
import u4.l0;

/* loaded from: classes.dex */
public final class x {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final t3.b f7130a;

    public x(@n6.d t3.b bVar) {
        l0.p(bVar, "_bounds");
        this.f7130a = bVar;
    }

    @n6.d
    public final Rect a() {
        return this.f7130a.i();
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l0.g(x.class, obj.getClass())) {
            return false;
        }
        return l0.g(this.f7130a, ((x) obj).f7130a);
    }

    public int hashCode() {
        return this.f7130a.hashCode();
    }

    @n6.d
    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @b1({b1.a.TESTS})
    public x(@n6.d Rect rect) {
        this(new t3.b(rect));
        l0.p(rect, "bounds");
    }
}