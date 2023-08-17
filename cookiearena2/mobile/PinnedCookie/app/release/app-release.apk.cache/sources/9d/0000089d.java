package c0;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class f {
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";

    /* renamed from: f  reason: collision with root package name */
    public static int f7360f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final String f7361g = "alpha";

    /* renamed from: h  reason: collision with root package name */
    public static final String f7362h = "elevation";

    /* renamed from: i  reason: collision with root package name */
    public static final String f7363i = "rotation";

    /* renamed from: j  reason: collision with root package name */
    public static final String f7364j = "rotationX";

    /* renamed from: k  reason: collision with root package name */
    public static final String f7365k = "rotationY";

    /* renamed from: l  reason: collision with root package name */
    public static final String f7366l = "transformPivotX";

    /* renamed from: m  reason: collision with root package name */
    public static final String f7367m = "transformPivotY";

    /* renamed from: n  reason: collision with root package name */
    public static final String f7368n = "transitionPathRotate";

    /* renamed from: o  reason: collision with root package name */
    public static final String f7369o = "scaleX";

    /* renamed from: p  reason: collision with root package name */
    public static final String f7370p = "scaleY";

    /* renamed from: q  reason: collision with root package name */
    public static final String f7371q = "wavePeriod";

    /* renamed from: r  reason: collision with root package name */
    public static final String f7372r = "waveOffset";

    /* renamed from: s  reason: collision with root package name */
    public static final String f7373s = "wavePhase";

    /* renamed from: t  reason: collision with root package name */
    public static final String f7374t = "waveVariesBy";

    /* renamed from: u  reason: collision with root package name */
    public static final String f7375u = "translationX";

    /* renamed from: v  reason: collision with root package name */
    public static final String f7376v = "translationY";

    /* renamed from: w  reason: collision with root package name */
    public static final String f7377w = "translationZ";

    /* renamed from: x  reason: collision with root package name */
    public static final String f7378x = "progress";

    /* renamed from: y  reason: collision with root package name */
    public static final String f7379y = "CUSTOM";

    /* renamed from: z  reason: collision with root package name */
    public static final String f7380z = "curveFit";

    /* renamed from: a  reason: collision with root package name */
    public int f7381a;

    /* renamed from: b  reason: collision with root package name */
    public int f7382b;

    /* renamed from: c  reason: collision with root package name */
    public String f7383c;

    /* renamed from: d  reason: collision with root package name */
    public int f7384d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f7385e;

    public f() {
        int i7 = f7360f;
        this.f7381a = i7;
        this.f7382b = i7;
        this.f7383c = null;
    }

    public abstract void a(HashMap<String, b0.d> splines);

    @Override // 
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public abstract f clone();

    public f c(f src) {
        this.f7381a = src.f7381a;
        this.f7382b = src.f7382b;
        this.f7383c = src.f7383c;
        this.f7384d = src.f7384d;
        this.f7385e = src.f7385e;
        return this;
    }

    public abstract void d(HashSet<String> attributes);

    public int e() {
        return this.f7381a;
    }

    public abstract void f(Context context, AttributeSet attrs);

    public boolean g(String constraintTag) {
        String str = this.f7383c;
        if (str == null || constraintTag == null) {
            return false;
        }
        return constraintTag.matches(str);
    }

    public void h(int pos) {
        this.f7381a = pos;
    }

    public void i(HashMap<String, Integer> interpolation) {
    }

    public abstract void j(String tag, Object value);

    public f k(int id) {
        this.f7382b = id;
        return this;
    }

    public boolean l(Object value) {
        return value instanceof Boolean ? ((Boolean) value).booleanValue() : Boolean.parseBoolean(value.toString());
    }

    public float m(Object value) {
        return value instanceof Float ? ((Float) value).floatValue() : Float.parseFloat(value.toString());
    }

    public int n(Object value) {
        return value instanceof Integer ? ((Integer) value).intValue() : Integer.parseInt(value.toString());
    }
}