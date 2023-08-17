package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.k;
import java.util.HashMap;
/* loaded from: classes.dex */
public class j extends k {
    public static final String R = "KeyPosition";
    public static final String S = "KeyPosition";
    public static final int T = 2;
    public static final int U = 1;
    public static final int V = 0;
    public static final String W = "transitionEasing";
    public static final String X = "drawPath";
    public static final String Y = "percentWidth";
    public static final String Z = "percentHeight";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f7444a0 = "sizePercent";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f7445b0 = "percentX";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f7446c0 = "percentY";

    /* renamed from: d0  reason: collision with root package name */
    public static final int f7447d0 = 2;
    public String F = null;
    public int G = f.f7360f;
    public int H = 0;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public int O = 0;
    public float P = Float.NaN;
    public float Q = Float.NaN;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7448a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7449b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7450c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7451d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7452e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7453f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7454g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f7455h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f7456i = 9;

        /* renamed from: j  reason: collision with root package name */
        public static final int f7457j = 10;

        /* renamed from: k  reason: collision with root package name */
        public static final int f7458k = 11;

        /* renamed from: l  reason: collision with root package name */
        public static final int f7459l = 12;

        /* renamed from: m  reason: collision with root package name */
        public static SparseIntArray f7460m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7460m = sparseIntArray;
            sparseIntArray.append(k.m.Gf, 1);
            f7460m.append(k.m.Ef, 2);
            f7460m.append(k.m.Nf, 3);
            f7460m.append(k.m.Cf, 4);
            f7460m.append(k.m.Df, 5);
            f7460m.append(k.m.Kf, 6);
            f7460m.append(k.m.Lf, 7);
            f7460m.append(k.m.Ff, 9);
            f7460m.append(k.m.Mf, 8);
            f7460m.append(k.m.Jf, 11);
            f7460m.append(k.m.If, 12);
            f7460m.append(k.m.Hf, 10);
        }

        public static void b(j c7, TypedArray a7) {
            int indexCount = a7.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = a7.getIndex(i7);
                switch (f7460m.get(index)) {
                    case 1:
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
                    case 2:
                        c7.f7381a = a7.getInt(index, c7.f7381a);
                        break;
                    case 3:
                        if (a7.peekValue(index).type == 3) {
                            c7.F = a7.getString(index);
                            break;
                        } else {
                            c7.F = u.d.f16910o[a7.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c7.D = a7.getInteger(index, c7.D);
                        break;
                    case 5:
                        c7.H = a7.getInt(index, c7.H);
                        break;
                    case 6:
                        c7.K = a7.getFloat(index, c7.K);
                        break;
                    case 7:
                        c7.L = a7.getFloat(index, c7.L);
                        break;
                    case 8:
                        float f7 = a7.getFloat(index, c7.J);
                        c7.I = f7;
                        c7.J = f7;
                        break;
                    case 9:
                        c7.O = a7.getInt(index, c7.O);
                        break;
                    case 10:
                        c7.G = a7.getInt(index, c7.G);
                        break;
                    case 11:
                        c7.I = a7.getFloat(index, c7.I);
                        break;
                    case 12:
                        c7.J = a7.getFloat(index, c7.J);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7460m.get(index));
                        break;
                }
            }
            if (c7.f7381a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public j() {
        this.f7384d = 2;
    }

    @Override // c0.f
    public void a(HashMap<String, b0.d> splines) {
    }

    @Override // c0.f
    /* renamed from: b */
    public f clone() {
        return new j().c(this);
    }

    @Override // c0.f
    public f c(f src) {
        super.c(src);
        j jVar = (j) src;
        this.F = jVar.F;
        this.G = jVar.G;
        this.H = jVar.H;
        this.I = jVar.I;
        this.J = Float.NaN;
        this.K = jVar.K;
        this.L = jVar.L;
        this.M = jVar.M;
        this.N = jVar.N;
        this.P = jVar.P;
        this.Q = jVar.Q;
        return this;
    }

    @Override // c0.f
    public void f(Context context, AttributeSet attrs) {
        a.b(this, context.obtainStyledAttributes(attrs, k.m.Bf));
    }

    @Override // c0.f
    public void j(String tag, Object value) {
        tag.hashCode();
        char c7 = 65535;
        switch (tag.hashCode()) {
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    c7 = 0;
                    break;
                }
                break;
            case -1127236479:
                if (tag.equals("percentWidth")) {
                    c7 = 1;
                    break;
                }
                break;
            case -1017587252:
                if (tag.equals("percentHeight")) {
                    c7 = 2;
                    break;
                }
                break;
            case -827014263:
                if (tag.equals("drawPath")) {
                    c7 = 3;
                    break;
                }
                break;
            case -200259324:
                if (tag.equals("sizePercent")) {
                    c7 = 4;
                    break;
                }
                break;
            case 428090547:
                if (tag.equals("percentX")) {
                    c7 = 5;
                    break;
                }
                break;
            case 428090548:
                if (tag.equals("percentY")) {
                    c7 = 6;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                this.F = value.toString();
                return;
            case 1:
                this.I = m(value);
                return;
            case 2:
                this.J = m(value);
                return;
            case 3:
                this.H = n(value);
                return;
            case 4:
                float m7 = m(value);
                this.I = m7;
                this.J = m7;
                return;
            case 5:
                this.K = m(value);
                return;
            case 6:
                this.L = m(value);
                return;
            default:
                return;
        }
    }

    @Override // c0.k
    public void o(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i7 = this.O;
        if (i7 == 1) {
            u(start_x, start_y, end_x, end_y);
        } else if (i7 != 2) {
            t(start_x, start_y, end_x, end_y);
        } else {
            v(layoutWidth, layoutHeight);
        }
    }

    @Override // c0.k
    public float p() {
        return this.P;
    }

    @Override // c0.k
    public float q() {
        return this.Q;
    }

    @Override // c0.k
    public boolean r(int layoutWidth, int layoutHeight, RectF start, RectF end, float x6, float y6) {
        o(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x6 - this.P) < 20.0f && Math.abs(y6 - this.Q) < 20.0f;
    }

    @Override // c0.k
    public void s(View view, RectF start, RectF end, float x6, float y6, String[] attribute, float[] value) {
        int i7 = this.O;
        if (i7 == 1) {
            x(start, end, x6, y6, attribute, value);
        } else if (i7 != 2) {
            w(start, end, x6, y6, attribute, value);
        } else {
            y(view, start, end, x6, y6, attribute, value);
        }
    }

    public final void t(float start_x, float start_y, float end_x, float end_y) {
        float f7 = end_x - start_x;
        float f8 = end_y - start_y;
        float f9 = Float.isNaN(this.K) ? 0.0f : this.K;
        float f10 = Float.isNaN(this.N) ? 0.0f : this.N;
        float f11 = Float.isNaN(this.L) ? 0.0f : this.L;
        this.P = (int) (start_x + (f9 * f7) + ((Float.isNaN(this.M) ? 0.0f : this.M) * f8));
        this.Q = (int) (start_y + (f7 * f10) + (f8 * f11));
    }

    public final void u(float start_x, float start_y, float end_x, float end_y) {
        float f7 = end_x - start_x;
        float f8 = end_y - start_y;
        float f9 = this.K;
        float f10 = this.L;
        this.P = start_x + (f7 * f9) + ((-f8) * f10);
        this.Q = start_y + (f8 * f9) + (f7 * f10);
    }

    public final void v(int layoutWidth, int layoutHeight) {
        float f7 = this.K;
        float f8 = 0;
        this.P = ((layoutWidth - 0) * f7) + f8;
        this.Q = ((layoutHeight - 0) * f7) + f8;
    }

    public void w(RectF start, RectF end, float x6, float y6, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = (x6 - centerX) / centerX2;
            attribute[1] = "percentY";
            value[1] = (y6 - centerY) / centerY2;
        } else if ("percentX".equals(str)) {
            value[0] = (x6 - centerX) / centerX2;
            value[1] = (y6 - centerY) / centerY2;
        } else {
            value[1] = (x6 - centerX) / centerX2;
            value[0] = (y6 - centerY) / centerY2;
        }
    }

    public void x(RectF start, RectF end, float x6, float y6, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f7 = centerX2 / hypot;
        float f8 = centerY2 / hypot;
        float f9 = y6 - centerY;
        float f10 = x6 - centerX;
        float f11 = ((f7 * f9) - (f10 * f8)) / hypot;
        float f12 = ((f7 * f10) + (f8 * f9)) / hypot;
        String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = f12;
                value[1] = f11;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f12;
        value[1] = f11;
    }

    public void y(View view, RectF start, RectF end, float x6, float y6, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = x6 / width;
            attribute[1] = "percentY";
            value[1] = y6 / height;
        } else if ("percentX".equals(str)) {
            value[0] = x6 / width;
            value[1] = y6 / height;
        } else {
            value[1] = x6 / width;
            value[0] = y6 / height;
        }
    }

    public void z(int type) {
        this.O = type;
    }
}
