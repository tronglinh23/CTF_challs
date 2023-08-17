package p0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import p0.k;
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14589a = "\udfffd";

    /* renamed from: b  reason: collision with root package name */
    public static final String f14590b = "m";

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<g1.o<Rect, Rect>> f14591c = new ThreadLocal<>();

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode(f.a(obj));
        }
    }

    public static boolean a(@d.o0 Paint paint, @d.o0 String str) {
        return a.a(paint, str);
    }

    public static g1.o<Rect, Rect> b() {
        ThreadLocal<g1.o<Rect, Rect>> threadLocal = f14591c;
        g1.o<Rect, Rect> oVar = threadLocal.get();
        if (oVar == null) {
            g1.o<Rect, Rect> oVar2 = new g1.o<>(new Rect(), new Rect());
            threadLocal.set(oVar2);
            return oVar2;
        }
        oVar.f10023a.setEmpty();
        oVar.f10024b.setEmpty();
        return oVar;
    }

    public static boolean c(@d.o0 Paint paint, @d.q0 j jVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, jVar != null ? k.b.a(jVar) : null);
            return true;
        } else if (jVar == null) {
            paint.setXfermode(null);
            return true;
        } else {
            PorterDuff.Mode a7 = k.a(jVar);
            paint.setXfermode(a7 != null ? new PorterDuffXfermode(a7) : null);
            return a7 != null;
        }
    }
}
