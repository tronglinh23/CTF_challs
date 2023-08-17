package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final int f2170c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2171d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f2172e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f2173f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f2174g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f2175h = 6;

    /* renamed from: i  reason: collision with root package name */
    public static final int f2176i = 7;

    /* renamed from: j  reason: collision with root package name */
    public static final int f2177j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f2178k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f2179l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f2180m = -2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f2181n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f2182o = 0;

    /* renamed from: a  reason: collision with root package name */
    public ConstraintLayout.b f2183a;

    /* renamed from: b  reason: collision with root package name */
    public View f2184b;

    public d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.b)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f2183a = (ConstraintLayout.b) layoutParams;
        this.f2184b = view;
    }

    public d A(float weight) {
        this.f2183a.L = weight;
        return this;
    }

    public d B(int anchor, int value) {
        switch (anchor) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f2183a).leftMargin = value;
                break;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f2183a).rightMargin = value;
                break;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f2183a).topMargin = value;
                break;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f2183a).bottomMargin = value;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2183a.setMarginStart(value);
                break;
            case 7:
                this.f2183a.setMarginEnd(value);
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public d C(int anchor) {
        switch (anchor) {
            case 1:
                ConstraintLayout.b bVar = this.f2183a;
                bVar.f2040f = -1;
                bVar.f2038e = -1;
                ((ViewGroup.MarginLayoutParams) bVar).leftMargin = -1;
                bVar.f2074w = Integer.MIN_VALUE;
                break;
            case 2:
                ConstraintLayout.b bVar2 = this.f2183a;
                bVar2.f2044h = -1;
                bVar2.f2042g = -1;
                ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = -1;
                bVar2.f2077y = Integer.MIN_VALUE;
                break;
            case 3:
                ConstraintLayout.b bVar3 = this.f2183a;
                bVar3.f2048j = -1;
                bVar3.f2046i = -1;
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = -1;
                bVar3.f2076x = Integer.MIN_VALUE;
                break;
            case 4:
                ConstraintLayout.b bVar4 = this.f2183a;
                bVar4.f2050k = -1;
                bVar4.f2052l = -1;
                ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = -1;
                bVar4.f2078z = Integer.MIN_VALUE;
                break;
            case 5:
                this.f2183a.f2054m = -1;
                break;
            case 6:
                ConstraintLayout.b bVar5 = this.f2183a;
                bVar5.f2066s = -1;
                bVar5.f2068t = -1;
                bVar5.setMarginStart(-1);
                this.f2183a.A = Integer.MIN_VALUE;
                break;
            case 7:
                ConstraintLayout.b bVar6 = this.f2183a;
                bVar6.f2070u = -1;
                bVar6.f2072v = -1;
                bVar6.setMarginEnd(-1);
                this.f2183a.B = Integer.MIN_VALUE;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public d D() {
        ConstraintLayout.b bVar = this.f2183a;
        int i7 = bVar.f2040f;
        int i8 = bVar.f2042g;
        if (i7 == -1 && i8 == -1) {
            int i9 = bVar.f2066s;
            int i10 = bVar.f2070u;
            if (i9 != -1 || i10 != -1) {
                d dVar = new d(((ViewGroup) this.f2184b.getParent()).findViewById(i9));
                d dVar2 = new d(((ViewGroup) this.f2184b.getParent()).findViewById(i10));
                ConstraintLayout.b bVar2 = this.f2183a;
                if (i9 != -1 && i10 != -1) {
                    dVar.m(7, i10, 6, 0);
                    dVar2.m(6, i7, 7, 0);
                } else if (i7 != -1 || i10 != -1) {
                    int i11 = bVar2.f2044h;
                    if (i11 != -1) {
                        dVar.m(7, i11, 7, 0);
                    } else {
                        int i12 = bVar2.f2038e;
                        if (i12 != -1) {
                            dVar2.m(6, i12, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            d dVar3 = new d(((ViewGroup) this.f2184b.getParent()).findViewById(i7));
            d dVar4 = new d(((ViewGroup) this.f2184b.getParent()).findViewById(i8));
            ConstraintLayout.b bVar3 = this.f2183a;
            if (i7 != -1 && i8 != -1) {
                dVar3.m(2, i8, 1, 0);
                dVar4.m(1, i7, 2, 0);
            } else if (i7 != -1 || i8 != -1) {
                int i13 = bVar3.f2044h;
                if (i13 != -1) {
                    dVar3.m(2, i13, 2, 0);
                } else {
                    int i14 = bVar3.f2038e;
                    if (i14 != -1) {
                        dVar4.m(1, i14, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public d E() {
        ConstraintLayout.b bVar = this.f2183a;
        int i7 = bVar.f2048j;
        int i8 = bVar.f2050k;
        if (i7 != -1 || i8 != -1) {
            d dVar = new d(((ViewGroup) this.f2184b.getParent()).findViewById(i7));
            d dVar2 = new d(((ViewGroup) this.f2184b.getParent()).findViewById(i8));
            ConstraintLayout.b bVar2 = this.f2183a;
            if (i7 != -1 && i8 != -1) {
                dVar.m(4, i8, 3, 0);
                dVar2.m(3, i7, 4, 0);
            } else if (i7 != -1 || i8 != -1) {
                int i9 = bVar2.f2052l;
                if (i9 != -1) {
                    dVar.m(4, i9, 4, 0);
                } else {
                    int i10 = bVar2.f2046i;
                    if (i10 != -1) {
                        dVar2.m(3, i10, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public d F(float rotation) {
        this.f2184b.setRotation(rotation);
        return this;
    }

    public d G(float rotationX) {
        this.f2184b.setRotationX(rotationX);
        return this;
    }

    public d H(float rotationY) {
        this.f2184b.setRotationY(rotationY);
        return this;
    }

    public d I(float scaleX) {
        this.f2184b.setScaleY(scaleX);
        return this;
    }

    public d J(float scaleY) {
        return this;
    }

    public final String K(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public d L(float transformPivotX, float transformPivotY) {
        this.f2184b.setPivotX(transformPivotX);
        this.f2184b.setPivotY(transformPivotY);
        return this;
    }

    public d M(float transformPivotX) {
        this.f2184b.setPivotX(transformPivotX);
        return this;
    }

    public d N(float transformPivotY) {
        this.f2184b.setPivotY(transformPivotY);
        return this;
    }

    public d O(float translationX, float translationY) {
        this.f2184b.setTranslationX(translationX);
        this.f2184b.setTranslationY(translationY);
        return this;
    }

    public d P(float translationX) {
        this.f2184b.setTranslationX(translationX);
        return this;
    }

    public d Q(float translationY) {
        this.f2184b.setTranslationY(translationY);
        return this;
    }

    public d R(float translationZ) {
        this.f2184b.setTranslationZ(translationZ);
        return this;
    }

    public d S(float bias) {
        this.f2183a.H = bias;
        return this;
    }

    public d T(int chainStyle) {
        this.f2183a.O = chainStyle;
        return this;
    }

    public d U(float weight) {
        this.f2183a.M = weight;
        return this;
    }

    public d V(int visibility) {
        this.f2184b.setVisibility(visibility);
        return this;
    }

    public d a(int leftId, int rightId) {
        m(1, leftId, leftId == 0 ? 1 : 2, 0);
        m(2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            new d(((ViewGroup) this.f2184b.getParent()).findViewById(leftId)).m(2, this.f2184b.getId(), 1, 0);
        }
        if (rightId != 0) {
            new d(((ViewGroup) this.f2184b.getParent()).findViewById(rightId)).m(1, this.f2184b.getId(), 2, 0);
        }
        return this;
    }

    public d b(int leftId, int rightId) {
        m(6, leftId, leftId == 0 ? 6 : 7, 0);
        m(7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            new d(((ViewGroup) this.f2184b.getParent()).findViewById(leftId)).m(7, this.f2184b.getId(), 6, 0);
        }
        if (rightId != 0) {
            new d(((ViewGroup) this.f2184b.getParent()).findViewById(rightId)).m(6, this.f2184b.getId(), 7, 0);
        }
        return this;
    }

    public d c(int topId, int bottomId) {
        m(3, topId, topId == 0 ? 3 : 4, 0);
        m(4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            new d(((ViewGroup) this.f2184b.getParent()).findViewById(topId)).m(4, this.f2184b.getId(), 3, 0);
        }
        if (bottomId != 0) {
            new d(((ViewGroup) this.f2184b.getParent()).findViewById(bottomId)).m(3, this.f2184b.getId(), 4, 0);
        }
        return this;
    }

    public d d(float alpha) {
        this.f2184b.setAlpha(alpha);
        return this;
    }

    public void e() {
    }

    public d f(int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin >= 0) {
            if (secondMargin >= 0) {
                if (bias <= 0.0f || bias > 1.0f) {
                    throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
                }
                if (firstSide == 1 || firstSide == 2) {
                    m(1, firstID, firstSide, firstMargin);
                    m(2, secondId, secondSide, secondMargin);
                    this.f2183a.G = bias;
                } else if (firstSide == 6 || firstSide == 7) {
                    m(6, firstID, firstSide, firstMargin);
                    m(7, secondId, secondSide, secondMargin);
                    this.f2183a.G = bias;
                } else {
                    m(3, firstID, firstSide, firstMargin);
                    m(4, secondId, secondSide, secondMargin);
                    this.f2183a.H = bias;
                }
                return this;
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public d g(int toView) {
        if (toView == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            f(toView, 2, 0, toView, 1, 0, 0.5f);
        }
        return this;
    }

    public d h(int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        m(1, leftId, leftSide, leftMargin);
        m(2, rightId, rightSide, rightMargin);
        this.f2183a.G = bias;
        return this;
    }

    public d i(int toView) {
        if (toView == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            f(toView, 7, 0, toView, 6, 0, 0.5f);
        }
        return this;
    }

    public d j(int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        m(6, startId, startSide, startMargin);
        m(7, endId, endSide, endMargin);
        this.f2183a.G = bias;
        return this;
    }

    public d k(int toView) {
        if (toView == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            f(toView, 4, 0, toView, 3, 0, 0.5f);
        }
        return this;
    }

    public d l(int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        m(3, topId, topSide, topMargin);
        m(4, bottomId, bottomSide, bottomMargin);
        this.f2183a.H = bias;
        return this;
    }

    public d m(int startSide, int endID, int endSide, int margin) {
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    ConstraintLayout.b bVar = this.f2183a;
                    bVar.f2038e = endID;
                    bVar.f2040f = -1;
                } else if (endSide != 2) {
                    throw new IllegalArgumentException("Left to " + K(endSide) + " undefined");
                } else {
                    ConstraintLayout.b bVar2 = this.f2183a;
                    bVar2.f2040f = endID;
                    bVar2.f2038e = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2183a).leftMargin = margin;
                break;
            case 2:
                if (endSide == 1) {
                    ConstraintLayout.b bVar3 = this.f2183a;
                    bVar3.f2042g = endID;
                    bVar3.f2044h = -1;
                } else if (endSide != 2) {
                    throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                } else {
                    ConstraintLayout.b bVar4 = this.f2183a;
                    bVar4.f2044h = endID;
                    bVar4.f2042g = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2183a).rightMargin = margin;
                break;
            case 3:
                if (endSide == 3) {
                    ConstraintLayout.b bVar5 = this.f2183a;
                    bVar5.f2046i = endID;
                    bVar5.f2048j = -1;
                    bVar5.f2054m = -1;
                    bVar5.f2056n = -1;
                    bVar5.f2058o = -1;
                } else if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                } else {
                    ConstraintLayout.b bVar6 = this.f2183a;
                    bVar6.f2048j = endID;
                    bVar6.f2046i = -1;
                    bVar6.f2054m = -1;
                    bVar6.f2056n = -1;
                    bVar6.f2058o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2183a).topMargin = margin;
                break;
            case 4:
                if (endSide == 4) {
                    ConstraintLayout.b bVar7 = this.f2183a;
                    bVar7.f2052l = endID;
                    bVar7.f2050k = -1;
                    bVar7.f2054m = -1;
                    bVar7.f2056n = -1;
                    bVar7.f2058o = -1;
                } else if (endSide != 3) {
                    throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                } else {
                    ConstraintLayout.b bVar8 = this.f2183a;
                    bVar8.f2050k = endID;
                    bVar8.f2052l = -1;
                    bVar8.f2054m = -1;
                    bVar8.f2056n = -1;
                    bVar8.f2058o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2183a).bottomMargin = margin;
                break;
            case 5:
                if (endSide == 5) {
                    ConstraintLayout.b bVar9 = this.f2183a;
                    bVar9.f2054m = endID;
                    bVar9.f2052l = -1;
                    bVar9.f2050k = -1;
                    bVar9.f2046i = -1;
                    bVar9.f2048j = -1;
                }
                if (endSide == 3) {
                    ConstraintLayout.b bVar10 = this.f2183a;
                    bVar10.f2056n = endID;
                    bVar10.f2052l = -1;
                    bVar10.f2050k = -1;
                    bVar10.f2046i = -1;
                    bVar10.f2048j = -1;
                } else if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                } else {
                    ConstraintLayout.b bVar11 = this.f2183a;
                    bVar11.f2058o = endID;
                    bVar11.f2052l = -1;
                    bVar11.f2050k = -1;
                    bVar11.f2046i = -1;
                    bVar11.f2048j = -1;
                }
                this.f2183a.D = margin;
                break;
            case 6:
                if (endSide == 6) {
                    ConstraintLayout.b bVar12 = this.f2183a;
                    bVar12.f2068t = endID;
                    bVar12.f2066s = -1;
                } else if (endSide != 7) {
                    throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                } else {
                    ConstraintLayout.b bVar13 = this.f2183a;
                    bVar13.f2066s = endID;
                    bVar13.f2068t = -1;
                }
                this.f2183a.setMarginStart(margin);
                break;
            case 7:
                if (endSide == 7) {
                    ConstraintLayout.b bVar14 = this.f2183a;
                    bVar14.f2072v = endID;
                    bVar14.f2070u = -1;
                } else if (endSide != 6) {
                    throw new IllegalArgumentException("right to " + K(endSide) + " undefined");
                } else {
                    ConstraintLayout.b bVar15 = this.f2183a;
                    bVar15.f2070u = endID;
                    bVar15.f2072v = -1;
                }
                this.f2183a.setMarginEnd(margin);
                break;
            default:
                throw new IllegalArgumentException(K(startSide) + " to " + K(endSide) + " unknown");
        }
        return this;
    }

    public d n(int height) {
        this.f2183a.Q = height;
        return this;
    }

    public d o(int width) {
        this.f2183a.P = width;
        return this;
    }

    public d p(int height) {
        ((ViewGroup.MarginLayoutParams) this.f2183a).height = height;
        return this;
    }

    public d q(int height) {
        this.f2183a.U = height;
        return this;
    }

    public d r(int width) {
        this.f2183a.T = width;
        return this;
    }

    public d s(int height) {
        this.f2183a.S = height;
        return this;
    }

    public d t(int width) {
        this.f2183a.R = width;
        return this;
    }

    public d u(int width) {
        ((ViewGroup.MarginLayoutParams) this.f2183a).width = width;
        return this;
    }

    public d v(String ratio) {
        this.f2183a.I = ratio;
        return this;
    }

    public d w(float elevation) {
        this.f2184b.setElevation(elevation);
        return this;
    }

    public d x(int anchor, int value) {
        switch (anchor) {
            case 1:
                this.f2183a.f2074w = value;
                break;
            case 2:
                this.f2183a.f2077y = value;
                break;
            case 3:
                this.f2183a.f2076x = value;
                break;
            case 4:
                this.f2183a.f2078z = value;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2183a.A = value;
                break;
            case 7:
                this.f2183a.B = value;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public d y(float bias) {
        this.f2183a.G = bias;
        return this;
    }

    public d z(int chainStyle) {
        this.f2183a.N = chainStyle;
        return this;
    }
}