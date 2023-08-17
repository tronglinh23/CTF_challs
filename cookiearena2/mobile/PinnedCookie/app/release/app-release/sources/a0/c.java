package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
import androidx.constraintlayout.widget.o;
import java.util.Arrays;
/* loaded from: classes.dex */
public class c extends o {

    /* renamed from: w  reason: collision with root package name */
    public static final String f24w = "CircularFlow";

    /* renamed from: x  reason: collision with root package name */
    public static int f25x;

    /* renamed from: y  reason: collision with root package name */
    public static float f26y;

    /* renamed from: m  reason: collision with root package name */
    public ConstraintLayout f27m;

    /* renamed from: n  reason: collision with root package name */
    public int f28n;

    /* renamed from: o  reason: collision with root package name */
    public float[] f29o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f30p;

    /* renamed from: q  reason: collision with root package name */
    public int f31q;

    /* renamed from: r  reason: collision with root package name */
    public int f32r;

    /* renamed from: s  reason: collision with root package name */
    public String f33s;

    /* renamed from: t  reason: collision with root package name */
    public String f34t;

    /* renamed from: u  reason: collision with root package name */
    public Float f35u;

    /* renamed from: v  reason: collision with root package name */
    public Integer f36v;

    public c(Context context) {
        super(context);
    }

    public static float[] Q(float[] array, int index) {
        float[] fArr = new float[array.length - 1];
        int i7 = 0;
        for (int i8 = 0; i8 < array.length; i8++) {
            if (i8 != index) {
                fArr[i7] = array[i8];
                i7++;
            }
        }
        return fArr;
    }

    public static int[] R(int[] array, int index) {
        int[] iArr = new int[array.length - 1];
        int i7 = 0;
        for (int i8 = 0; i8 < array.length; i8++) {
            if (i8 != index) {
                iArr[i7] = array[i8];
                i7++;
            }
        }
        return iArr;
    }

    private void setAngles(String idList) {
        if (idList == null) {
            return;
        }
        int i7 = 0;
        this.f32r = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i7);
            if (indexOf == -1) {
                K(idList.substring(i7).trim());
                return;
            } else {
                K(idList.substring(i7, indexOf).trim());
                i7 = indexOf + 1;
            }
        }
    }

    private void setRadius(String idList) {
        if (idList == null) {
            return;
        }
        int i7 = 0;
        this.f31q = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i7);
            if (indexOf == -1) {
                L(idList.substring(i7).trim());
                return;
            } else {
                L(idList.substring(i7, indexOf).trim());
                i7 = indexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public int A(View view) {
        int A = super.A(view);
        if (A == -1) {
            return A;
        }
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.H(this.f27m);
        eVar.F(view.getId(), 8);
        eVar.r(this.f27m);
        float[] fArr = this.f29o;
        if (A < fArr.length) {
            this.f29o = P(fArr, A);
            this.f32r--;
        }
        int[] iArr = this.f30p;
        if (A < iArr.length) {
            this.f30p = S(iArr, A);
            this.f31q--;
        }
        N();
        return A;
    }

    public final void K(String angleString) {
        float[] fArr;
        if (angleString == null || angleString.length() == 0 || this.f2143d == null || (fArr = this.f29o) == null) {
            return;
        }
        if (this.f32r + 1 > fArr.length) {
            this.f29o = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f29o[this.f32r] = Integer.parseInt(angleString);
        this.f32r++;
    }

    public final void L(String radiusString) {
        int[] iArr;
        if (radiusString == null || radiusString.length() == 0 || this.f2143d == null || (iArr = this.f30p) == null) {
            return;
        }
        if (this.f31q + 1 > iArr.length) {
            this.f30p = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f30p[this.f31q] = (int) (Integer.parseInt(radiusString) * this.f2143d.getResources().getDisplayMetrics().density);
        this.f31q++;
    }

    public void M(View view, int radius, float angle) {
        if (s(view.getId())) {
            return;
        }
        o(view);
        this.f32r++;
        float[] angles = getAngles();
        this.f29o = angles;
        angles[this.f32r - 1] = angle;
        this.f31q++;
        int[] radius2 = getRadius();
        this.f30p = radius2;
        radius2[this.f31q - 1] = (int) (radius * this.f2143d.getResources().getDisplayMetrics().density);
        N();
    }

    public final void N() {
        this.f27m = (ConstraintLayout) getParent();
        for (int i7 = 0; i7 < this.f2142c; i7++) {
            View viewById = this.f27m.getViewById(this.f2141b[i7]);
            if (viewById != null) {
                int i8 = f25x;
                float f7 = f26y;
                int[] iArr = this.f30p;
                if (iArr == null || i7 >= iArr.length) {
                    Integer num = this.f36v;
                    if (num == null || num.intValue() == -1) {
                        Log.e(f24w, "Added radius to view with id: " + this.f2149j.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f31q++;
                        if (this.f30p == null) {
                            this.f30p = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f30p = radius;
                        radius[this.f31q - 1] = i8;
                    }
                } else {
                    i8 = iArr[i7];
                }
                float[] fArr = this.f29o;
                if (fArr == null || i7 >= fArr.length) {
                    Float f8 = this.f35u;
                    if (f8 == null || f8.floatValue() == -1.0f) {
                        Log.e(f24w, "Added angle to view with id: " + this.f2149j.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f32r++;
                        if (this.f29o == null) {
                            this.f29o = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f29o = angles;
                        angles[this.f32r - 1] = f7;
                    }
                } else {
                    f7 = fArr[i7];
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) viewById.getLayoutParams();
                bVar.f2064r = f7;
                bVar.f2060p = this.f28n;
                bVar.f2062q = i8;
                viewById.setLayoutParams(bVar);
            }
        }
        p();
    }

    public boolean O(View view) {
        return s(view.getId()) && x(view.getId()) != -1;
    }

    public final float[] P(float[] angles, int index) {
        return (angles == null || index < 0 || index >= this.f32r) ? angles : Q(angles, index);
    }

    public final int[] S(int[] radius, int index) {
        return (radius == null || index < 0 || index >= this.f31q) ? radius : R(radius, index);
    }

    public void T(View view, float angle) {
        if (!O(view)) {
            Log.e(f24w, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int x6 = x(view.getId());
        if (x6 > this.f29o.length) {
            return;
        }
        float[] angles = getAngles();
        this.f29o = angles;
        angles[x6] = angle;
        N();
    }

    public void U(View view, int radius) {
        if (!O(view)) {
            Log.e(f24w, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int x6 = x(view.getId());
        if (x6 > this.f30p.length) {
            return;
        }
        int[] radius2 = getRadius();
        this.f30p = radius2;
        radius2[x6] = (int) (radius * this.f2143d.getResources().getDisplayMetrics().density);
        N();
    }

    public void V(View view, int radius, float angle) {
        if (!O(view)) {
            Log.e(f24w, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int x6 = x(view.getId());
        if (getAngles().length > x6) {
            float[] angles = getAngles();
            this.f29o = angles;
            angles[x6] = angle;
        }
        if (getRadius().length > x6) {
            int[] radius2 = getRadius();
            this.f30p = radius2;
            radius2[x6] = (int) (radius * this.f2143d.getResources().getDisplayMetrics().density);
        }
        N();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f29o, this.f32r);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f30p, this.f31q);
    }

    @Override // androidx.constraintlayout.widget.o, androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f33s;
        if (str != null) {
            this.f29o = new float[1];
            setAngles(str);
        }
        String str2 = this.f34t;
        if (str2 != null) {
            this.f30p = new int[1];
            setRadius(str2);
        }
        Float f7 = this.f35u;
        if (f7 != null) {
            setDefaultAngle(f7.floatValue());
        }
        Integer num = this.f36v;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        N();
    }

    public void setDefaultAngle(float angle) {
        f26y = angle;
    }

    public void setDefaultRadius(int radius) {
        f25x = radius;
    }

    @Override // androidx.constraintlayout.widget.o, androidx.constraintlayout.widget.b
    public void y(AttributeSet attrs) {
        super.y(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.f7) {
                    this.f28n = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == k.m.b7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f33s = string;
                    setAngles(string);
                } else if (index == k.m.e7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f34t = string2;
                    setRadius(string2);
                } else if (index == k.m.c7) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f26y));
                    this.f35u = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == k.m.d7) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f25x));
                    this.f36v = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public c(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public c(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
