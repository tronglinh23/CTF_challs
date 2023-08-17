package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.k;
import c0.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class b0 {
    public static final String A = "ConstraintOverride";
    public static final String B = "CustomAttribute";
    public static final String C = "CustomMethod";
    public static final int D = -1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = -1;
    public static final int N = -2;
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;

    /* renamed from: x  reason: collision with root package name */
    public static String f7297x = "ViewTransition";

    /* renamed from: y  reason: collision with root package name */
    public static final String f7298y = "ViewTransition";

    /* renamed from: z  reason: collision with root package name */
    public static final String f7299z = "KeyFrameSet";

    /* renamed from: a  reason: collision with root package name */
    public androidx.constraintlayout.widget.e f7300a;

    /* renamed from: b  reason: collision with root package name */
    public int f7301b;

    /* renamed from: f  reason: collision with root package name */
    public int f7305f;

    /* renamed from: g  reason: collision with root package name */
    public i f7306g;

    /* renamed from: h  reason: collision with root package name */
    public e.a f7307h;

    /* renamed from: k  reason: collision with root package name */
    public int f7310k;

    /* renamed from: l  reason: collision with root package name */
    public String f7311l;

    /* renamed from: p  reason: collision with root package name */
    public Context f7315p;

    /* renamed from: c  reason: collision with root package name */
    public int f7302c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7303d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f7304e = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f7308i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f7309j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f7312m = 0;

    /* renamed from: n  reason: collision with root package name */
    public String f7313n = null;

    /* renamed from: o  reason: collision with root package name */
    public int f7314o = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f7316q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f7317r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f7318s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f7319t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f7320u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f7321v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f7322w = -1;

    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u.d f7323a;

        public a(final b0 this$0, final u.d val$easing) {
            this.f7323a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v6) {
            return (float) this.f7323a.a(v6);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7324a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7325b;

        /* renamed from: c  reason: collision with root package name */
        public long f7326c;

        /* renamed from: d  reason: collision with root package name */
        public o f7327d;

        /* renamed from: e  reason: collision with root package name */
        public int f7328e;

        /* renamed from: f  reason: collision with root package name */
        public int f7329f;

        /* renamed from: h  reason: collision with root package name */
        public c0 f7331h;

        /* renamed from: i  reason: collision with root package name */
        public Interpolator f7332i;

        /* renamed from: k  reason: collision with root package name */
        public float f7334k;

        /* renamed from: l  reason: collision with root package name */
        public float f7335l;

        /* renamed from: m  reason: collision with root package name */
        public long f7336m;

        /* renamed from: o  reason: collision with root package name */
        public boolean f7338o;

        /* renamed from: g  reason: collision with root package name */
        public u.g f7330g = new u.g();

        /* renamed from: j  reason: collision with root package name */
        public boolean f7333j = false;

        /* renamed from: n  reason: collision with root package name */
        public Rect f7337n = new Rect();

        public b(c0 controller, o motionController, int duration, int upDuration, int mode, Interpolator interpolator, int setTag, int clearTag) {
            this.f7338o = false;
            this.f7331h = controller;
            this.f7327d = motionController;
            this.f7328e = duration;
            this.f7329f = upDuration;
            long nanoTime = System.nanoTime();
            this.f7326c = nanoTime;
            this.f7336m = nanoTime;
            this.f7331h.c(this);
            this.f7332i = interpolator;
            this.f7324a = setTag;
            this.f7325b = clearTag;
            if (mode == 3) {
                this.f7338o = true;
            }
            this.f7335l = duration == 0 ? Float.MAX_VALUE : 1.0f / duration;
            a();
        }

        public void a() {
            if (this.f7333j) {
                c();
            } else {
                b();
            }
        }

        public void b() {
            long nanoTime = System.nanoTime();
            long j7 = nanoTime - this.f7336m;
            this.f7336m = nanoTime;
            float f7 = this.f7334k + (((float) (j7 * 1.0E-6d)) * this.f7335l);
            this.f7334k = f7;
            if (f7 >= 1.0f) {
                this.f7334k = 1.0f;
            }
            Interpolator interpolator = this.f7332i;
            float interpolation = interpolator == null ? this.f7334k : interpolator.getInterpolation(this.f7334k);
            o oVar = this.f7327d;
            boolean L = oVar.L(oVar.f7547b, interpolation, nanoTime, this.f7330g);
            if (this.f7334k >= 1.0f) {
                if (this.f7324a != -1) {
                    this.f7327d.J().setTag(this.f7324a, Long.valueOf(System.nanoTime()));
                }
                if (this.f7325b != -1) {
                    this.f7327d.J().setTag(this.f7325b, null);
                }
                if (!this.f7338o) {
                    this.f7331h.k(this);
                }
            }
            if (this.f7334k < 1.0f || L) {
                this.f7331h.g();
            }
        }

        public void c() {
            long nanoTime = System.nanoTime();
            long j7 = nanoTime - this.f7336m;
            this.f7336m = nanoTime;
            float f7 = this.f7334k - (((float) (j7 * 1.0E-6d)) * this.f7335l);
            this.f7334k = f7;
            if (f7 < 0.0f) {
                this.f7334k = 0.0f;
            }
            Interpolator interpolator = this.f7332i;
            float interpolation = interpolator == null ? this.f7334k : interpolator.getInterpolation(this.f7334k);
            o oVar = this.f7327d;
            boolean L = oVar.L(oVar.f7547b, interpolation, nanoTime, this.f7330g);
            if (this.f7334k <= 0.0f) {
                if (this.f7324a != -1) {
                    this.f7327d.J().setTag(this.f7324a, Long.valueOf(System.nanoTime()));
                }
                if (this.f7325b != -1) {
                    this.f7327d.J().setTag(this.f7325b, null);
                }
                this.f7331h.k(this);
            }
            if (this.f7334k > 0.0f || L) {
                this.f7331h.g();
            }
        }

        public void d(int action, float x6, float y6) {
            if (action == 1) {
                if (this.f7333j) {
                    return;
                }
                e(true);
            } else if (action != 2) {
            } else {
                this.f7327d.J().getHitRect(this.f7337n);
                if (this.f7337n.contains((int) x6, (int) y6) || this.f7333j) {
                    return;
                }
                e(true);
            }
        }

        public void e(boolean dir) {
            int i7;
            this.f7333j = dir;
            if (dir && (i7 = this.f7329f) != -1) {
                this.f7335l = i7 == 0 ? Float.MAX_VALUE : 1.0f / i7;
            }
            this.f7331h.g();
            this.f7336m = System.nanoTime();
        }
    }

    public b0(Context context, XmlPullParser parser) {
        boolean z6;
        this.f7315p = context;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = parser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals(A)) {
                                z6 = true;
                                break;
                            }
                            z6 = true;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                z6 = true;
                                break;
                            }
                            z6 = true;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                z6 = false;
                                break;
                            }
                            z6 = true;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                z6 = true;
                                break;
                            }
                            z6 = true;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                z6 = true;
                                break;
                            }
                            z6 = true;
                            break;
                        default:
                            z6 = true;
                            break;
                    }
                    if (!z6) {
                        n(context, parser);
                    } else if (z6) {
                        this.f7306g = new i(context, parser);
                    } else if (z6) {
                        this.f7307h = androidx.constraintlayout.widget.e.w(context, parser);
                    } else if (z6 || z6) {
                        androidx.constraintlayout.widget.a.q(context, parser, this.f7307h.f2269g);
                    } else {
                        Log.e(f7297x, c.f() + " unknown tag " + name);
                        Log.e(f7297x, ".xml:" + parser.getLineNumber());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View[] viewArr) {
        if (this.f7316q != -1) {
            for (View view : viewArr) {
                view.setTag(this.f7316q, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f7317r != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f7317r, null);
            }
        }
    }

    public void b(c0 controller, s motionLayout, View view) {
        o oVar = new o(view);
        oVar.R(view);
        this.f7306g.a(oVar);
        oVar.a0(motionLayout.getWidth(), motionLayout.getHeight(), this.f7308i, System.nanoTime());
        new b(controller, oVar, this.f7308i, this.f7309j, this.f7302c, f(motionLayout.getContext()), this.f7316q, this.f7317r);
    }

    public void c(c0 controller, s layout, int fromId, androidx.constraintlayout.widget.e current, final View... views) {
        if (this.f7303d) {
            return;
        }
        int i7 = this.f7305f;
        if (i7 == 2) {
            b(controller, layout, views[0]);
            return;
        }
        if (i7 == 1) {
            for (int i8 : layout.getConstraintSetIds()) {
                if (i8 != fromId) {
                    androidx.constraintlayout.widget.e Z = layout.Z(i8);
                    for (View view : views) {
                        e.a k02 = Z.k0(view.getId());
                        e.a aVar = this.f7307h;
                        if (aVar != null) {
                            aVar.h(k02);
                            k02.f2269g.putAll(this.f7307h.f2269g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.I(current);
        for (View view2 : views) {
            e.a k03 = eVar.k0(view2.getId());
            e.a aVar2 = this.f7307h;
            if (aVar2 != null) {
                aVar2.h(k03);
                k03.f2269g.putAll(this.f7307h.f2269g);
            }
        }
        layout.J0(fromId, eVar);
        layout.J0(k.g.N3, current);
        layout.setState(k.g.N3, -1, -1);
        u.b bVar = new u.b(-1, layout.f7578b, k.g.N3, fromId);
        for (View view3 : views) {
            v(bVar, view3);
        }
        layout.setTransition(bVar);
        layout.C0(new Runnable() { // from class: c0.a0
            @Override // java.lang.Runnable
            public final void run() {
                b0.this.l(views);
            }
        });
    }

    public boolean d(View view) {
        int i7 = this.f7318s;
        boolean z6 = i7 == -1 || view.getTag(i7) != null;
        int i8 = this.f7319t;
        return z6 && (i8 == -1 || view.getTag(i8) == null);
    }

    public int e() {
        return this.f7301b;
    }

    public Interpolator f(Context context) {
        int i7 = this.f7312m;
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(this, u.d.c(this.f7313n));
        }
        return AnimationUtils.loadInterpolator(context, this.f7314o);
    }

    public int g() {
        return this.f7320u;
    }

    public int h() {
        return this.f7322w;
    }

    public int i() {
        return this.f7321v;
    }

    public int j() {
        return this.f7302c;
    }

    public boolean k() {
        return !this.f7303d;
    }

    public boolean m(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (!(this.f7310k == -1 && this.f7311l == null) && d(view)) {
            if (view.getId() == this.f7310k) {
                return true;
            }
            return this.f7311l != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f2035c0) != null && str.matches(this.f7311l);
        }
        return false;
    }

    public final void n(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.xo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == k.m.yo) {
                this.f7301b = obtainStyledAttributes.getResourceId(index, this.f7301b);
            } else if (index == k.m.Go) {
                if (s.P0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f7310k);
                    this.f7310k = resourceId;
                    if (resourceId == -1) {
                        this.f7311l = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f7311l = obtainStyledAttributes.getString(index);
                } else {
                    this.f7310k = obtainStyledAttributes.getResourceId(index, this.f7310k);
                }
            } else if (index == k.m.Ho) {
                this.f7302c = obtainStyledAttributes.getInt(index, this.f7302c);
            } else if (index == k.m.Ko) {
                this.f7303d = obtainStyledAttributes.getBoolean(index, this.f7303d);
            } else if (index == k.m.Io) {
                this.f7304e = obtainStyledAttributes.getInt(index, this.f7304e);
            } else if (index == k.m.Co) {
                this.f7308i = obtainStyledAttributes.getInt(index, this.f7308i);
            } else if (index == k.m.Lo) {
                this.f7309j = obtainStyledAttributes.getInt(index, this.f7309j);
            } else if (index == k.m.Mo) {
                this.f7305f = obtainStyledAttributes.getInt(index, this.f7305f);
            } else if (index == k.m.Fo) {
                int i8 = obtainStyledAttributes.peekValue(index).type;
                if (i8 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f7314o = resourceId2;
                    if (resourceId2 != -1) {
                        this.f7312m = -2;
                    }
                } else if (i8 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f7313n = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f7312m = -1;
                    } else {
                        this.f7314o = obtainStyledAttributes.getResourceId(index, -1);
                        this.f7312m = -2;
                    }
                } else {
                    this.f7312m = obtainStyledAttributes.getInteger(index, this.f7312m);
                }
            } else if (index == k.m.Jo) {
                this.f7316q = obtainStyledAttributes.getResourceId(index, this.f7316q);
            } else if (index == k.m.Bo) {
                this.f7317r = obtainStyledAttributes.getResourceId(index, this.f7317r);
            } else if (index == k.m.Eo) {
                this.f7318s = obtainStyledAttributes.getResourceId(index, this.f7318s);
            } else if (index == k.m.Do) {
                this.f7319t = obtainStyledAttributes.getResourceId(index, this.f7319t);
            } else if (index == k.m.Ao) {
                this.f7321v = obtainStyledAttributes.getResourceId(index, this.f7321v);
            } else if (index == k.m.zo) {
                this.f7320u = obtainStyledAttributes.getInteger(index, this.f7320u);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void o(boolean enable) {
        this.f7303d = !enable;
    }

    public void p(int id) {
        this.f7301b = id;
    }

    public void q(int sharedValue) {
        this.f7320u = sharedValue;
    }

    public void r(int sharedValueCurrent) {
        this.f7322w = sharedValueCurrent;
    }

    public void s(int sharedValueID) {
        this.f7321v = sharedValueID;
    }

    public void t(int stateTransition) {
        this.f7302c = stateTransition;
    }

    public String toString() {
        return "ViewTransition(" + c.i(this.f7315p, this.f7301b) + ")";
    }

    public boolean u(int action) {
        int i7 = this.f7302c;
        return i7 == 1 ? action == 0 : i7 == 2 ? action == 1 : i7 == 3 && action == 0;
    }

    public final void v(u.b transition, View view) {
        int i7 = this.f7308i;
        if (i7 != -1) {
            transition.O(i7);
        }
        transition.V(this.f7304e);
        transition.R(this.f7312m, this.f7313n, this.f7314o);
        int id = view.getId();
        i iVar = this.f7306g;
        if (iVar != null) {
            ArrayList<f> d7 = iVar.d(-1);
            i iVar2 = new i();
            Iterator<f> it = d7.iterator();
            while (it.hasNext()) {
                iVar2.c(it.next().clone().k(id));
            }
            transition.t(iVar2);
        }
    }
}
