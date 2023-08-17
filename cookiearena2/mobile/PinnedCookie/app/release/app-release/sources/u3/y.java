package u3;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import u4.l0;
@t3.d
/* loaded from: classes.dex */
public class y extends m {

    /* renamed from: a  reason: collision with root package name */
    public final int f17377a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17378b;

    /* renamed from: c  reason: collision with root package name */
    public final float f17379c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17380d;

    @w0(30)
    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f17381a = new a();

        @d.u
        @n6.d
        public final Rect a(@n6.d WindowMetrics windowMetrics) {
            Rect bounds;
            l0.p(windowMetrics, "windowMetrics");
            bounds = windowMetrics.getBounds();
            l0.o(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @w3.e(w3.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public y() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean a(@n6.d WindowMetrics windowMetrics) {
        l0.p(windowMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect a7 = a.f17381a.a(windowMetrics);
        return (this.f17377a == 0 || a7.width() >= this.f17377a) && (this.f17378b == 0 || Math.min(a7.width(), a7.height()) >= this.f17378b);
    }

    public final int b() {
        return this.f17380d;
    }

    public final int c() {
        return this.f17378b;
    }

    public final int d() {
        return this.f17377a;
    }

    public final float e() {
        return this.f17379c;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f17377a == yVar.f17377a && this.f17378b == yVar.f17378b) {
                return ((this.f17379c > yVar.f17379c ? 1 : (this.f17379c == yVar.f17379c ? 0 : -1)) == 0) && this.f17380d == yVar.f17380d;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f17377a * 31) + this.f17378b) * 31) + Float.hashCode(this.f17379c)) * 31) + this.f17380d;
    }

    public /* synthetic */ y(int i7, int i8, float f7, int i9, int i10, u4.w wVar) {
        this((i10 & 1) != 0 ? 0 : i7, (i10 & 2) != 0 ? 0 : i8, (i10 & 4) != 0 ? 0.5f : f7, (i10 & 8) != 0 ? 3 : i9);
    }

    public y(int i7, int i8, float f7, int i9) {
        this.f17377a = i7;
        this.f17378b = i8;
        this.f17379c = f7;
        this.f17380d = i9;
    }
}
