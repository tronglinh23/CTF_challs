package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.k;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public class m extends f {
    public static final String Y = "KeyTrigger";
    public static final String Z = "KeyTrigger";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f7489a0 = "viewTransitionOnCross";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f7490b0 = "viewTransitionOnPositiveCross";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f7491c0 = "viewTransitionOnNegativeCross";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f7492d0 = "postLayout";

    /* renamed from: e0  reason: collision with root package name */
    public static final String f7493e0 = "triggerSlack";

    /* renamed from: f0  reason: collision with root package name */
    public static final String f7494f0 = "triggerCollisionView";

    /* renamed from: g0  reason: collision with root package name */
    public static final String f7495g0 = "triggerCollisionId";

    /* renamed from: h0  reason: collision with root package name */
    public static final String f7496h0 = "triggerID";

    /* renamed from: i0  reason: collision with root package name */
    public static final String f7497i0 = "positiveCross";

    /* renamed from: j0  reason: collision with root package name */
    public static final String f7498j0 = "negativeCross";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f7499k0 = "triggerReceiver";

    /* renamed from: l0  reason: collision with root package name */
    public static final String f7500l0 = "CROSS";

    /* renamed from: m0  reason: collision with root package name */
    public static final int f7501m0 = 5;
    public int D = -1;
    public String E = null;
    public int F;
    public String G;
    public String H;
    public int I;
    public int J;
    public View K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public RectF V;
    public RectF W;
    public HashMap<String, Method> X;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7502a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7503b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7504c = 4;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7505d = 5;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7506e = 6;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7507f = 7;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7508g = 8;

        /* renamed from: h  reason: collision with root package name */
        public static final int f7509h = 9;

        /* renamed from: i  reason: collision with root package name */
        public static final int f7510i = 10;

        /* renamed from: j  reason: collision with root package name */
        public static final int f7511j = 11;

        /* renamed from: k  reason: collision with root package name */
        public static final int f7512k = 12;

        /* renamed from: l  reason: collision with root package name */
        public static final int f7513l = 13;

        /* renamed from: m  reason: collision with root package name */
        public static final int f7514m = 14;

        /* renamed from: n  reason: collision with root package name */
        public static SparseIntArray f7515n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7515n = sparseIntArray;
            sparseIntArray.append(k.m.lg, 8);
            f7515n.append(k.m.pg, 4);
            f7515n.append(k.m.qg, 1);
            f7515n.append(k.m.rg, 2);
            f7515n.append(k.m.mg, 7);
            f7515n.append(k.m.sg, 6);
            f7515n.append(k.m.ug, 5);
            f7515n.append(k.m.og, 9);
            f7515n.append(k.m.ng, 10);
            f7515n.append(k.m.tg, 11);
            f7515n.append(k.m.vg, 12);
            f7515n.append(k.m.wg, 13);
            f7515n.append(k.m.xg, 14);
        }

        public static void a(m c7, TypedArray a7, Context context) {
            int indexCount = a7.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = a7.getIndex(i7);
                switch (f7515n.get(index)) {
                    case 1:
                        c7.G = a7.getString(index);
                        break;
                    case 2:
                        c7.H = a7.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7515n.get(index));
                        break;
                    case 4:
                        c7.E = a7.getString(index);
                        break;
                    case 5:
                        c7.L = a7.getFloat(index, c7.L);
                        break;
                    case 6:
                        c7.I = a7.getResourceId(index, c7.I);
                        break;
                    case 7:
                        if (s.P0) {
                            int resourceId = a7.getResourceId(index, c7.f7382b);
                            c7.f7382b = resourceId;
                            if (resourceId == -1) {
                                c7.f7383c = a7.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a7.peekValue(index).type == 3) {
                            c7.f7383c = a7.getString(index);
                            break;
                        } else {
                            c7.f7382b = a7.getResourceId(index, c7.f7382b);
                            break;
                        }
                    case 8:
                        int integer = a7.getInteger(index, c7.f7381a);
                        c7.f7381a = integer;
                        c7.P = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c7.J = a7.getResourceId(index, c7.J);
                        break;
                    case 10:
                        c7.R = a7.getBoolean(index, c7.R);
                        break;
                    case 11:
                        c7.F = a7.getResourceId(index, c7.F);
                        break;
                    case 12:
                        c7.U = a7.getResourceId(index, c7.U);
                        break;
                    case 13:
                        c7.S = a7.getResourceId(index, c7.S);
                        break;
                    case 14:
                        c7.T = a7.getResourceId(index, c7.T);
                        break;
                }
            }
        }
    }

    public m() {
        int i7 = f.f7360f;
        this.F = i7;
        this.G = null;
        this.H = null;
        this.I = i7;
        this.J = i7;
        this.K = null;
        this.L = 0.1f;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = Float.NaN;
        this.R = false;
        this.S = i7;
        this.T = i7;
        this.U = i7;
        this.V = new RectF();
        this.W = new RectF();
        this.X = new HashMap<>();
        this.f7384d = 5;
        this.f7385e = new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.m.A(float, android.view.View):void");
    }

    public final void B(String str, View call) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            C(str, call);
            return;
        }
        if (this.X.containsKey(str)) {
            method = this.X.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, new Class[0]);
                this.X.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.X.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + " " + c.k(call));
                return;
            }
        }
        try {
            method.invoke(call, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.E + "\"on class " + call.getClass().getSimpleName() + " " + c.k(call));
        }
    }

    public final void C(String str, View view) {
        boolean z6 = str.length() == 1;
        if (!z6) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f7385e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z6 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f7385e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    public int D() {
        return this.D;
    }

    public final void E(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    @Override // c0.f
    public void a(HashMap<String, b0.d> splines) {
    }

    @Override // c0.f
    /* renamed from: b */
    public f clone() {
        return new m().c(this);
    }

    @Override // c0.f
    public f c(f src) {
        super.c(src);
        m mVar = (m) src;
        this.D = mVar.D;
        this.E = mVar.E;
        this.F = mVar.F;
        this.G = mVar.G;
        this.H = mVar.H;
        this.I = mVar.I;
        this.J = mVar.J;
        this.K = mVar.K;
        this.L = mVar.L;
        this.M = mVar.M;
        this.N = mVar.N;
        this.O = mVar.O;
        this.P = mVar.P;
        this.Q = mVar.Q;
        this.R = mVar.R;
        this.V = mVar.V;
        this.W = mVar.W;
        this.X = mVar.X;
        return this;
    }

    @Override // c0.f
    public void d(HashSet<String> attributes) {
    }

    @Override // c0.f
    public void f(Context context, AttributeSet attrs) {
        a.a(this, context.obtainStyledAttributes(attrs, k.m.kg), context);
    }

    @Override // c0.f
    public void j(String tag, Object value) {
        tag.hashCode();
        char c7 = 65535;
        switch (tag.hashCode()) {
            case -1594793529:
                if (tag.equals("positiveCross")) {
                    c7 = 0;
                    break;
                }
                break;
            case -966421266:
                if (tag.equals("viewTransitionOnPositiveCross")) {
                    c7 = 1;
                    break;
                }
                break;
            case -786670827:
                if (tag.equals("triggerCollisionId")) {
                    c7 = 2;
                    break;
                }
                break;
            case -648752941:
                if (tag.equals("triggerID")) {
                    c7 = 3;
                    break;
                }
                break;
            case -638126837:
                if (tag.equals("negativeCross")) {
                    c7 = 4;
                    break;
                }
                break;
            case -76025313:
                if (tag.equals("triggerCollisionView")) {
                    c7 = 5;
                    break;
                }
                break;
            case -9754574:
                if (tag.equals("viewTransitionOnNegativeCross")) {
                    c7 = 6;
                    break;
                }
                break;
            case 64397344:
                if (tag.equals("CROSS")) {
                    c7 = 7;
                    break;
                }
                break;
            case 364489912:
                if (tag.equals("triggerSlack")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 1301930599:
                if (tag.equals("viewTransitionOnCross")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 1401391082:
                if (tag.equals("postLayout")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 1535404999:
                if (tag.equals("triggerReceiver")) {
                    c7 = 11;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                this.H = value.toString();
                return;
            case 1:
                this.T = n(value);
                return;
            case 2:
                this.J = n(value);
                return;
            case 3:
                this.I = n(value);
                return;
            case 4:
                this.G = value.toString();
                return;
            case 5:
                this.K = (View) value;
                return;
            case 6:
                this.S = n(value);
                return;
            case 7:
                this.E = value.toString();
                return;
            case '\b':
                this.L = m(value);
                return;
            case '\t':
                this.U = n(value);
                return;
            case '\n':
                this.R = l(value);
                return;
            case 11:
                this.F = n(value);
                return;
            default:
                return;
        }
    }
}
