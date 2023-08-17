package p0;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* loaded from: classes.dex */
public class k {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14511a;

        static {
            int[] iArr = new int[j.values().length];
            f14511a = iArr;
            try {
                iArr[j.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14511a[j.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14511a[j.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14511a[j.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14511a[j.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14511a[j.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14511a[j.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14511a[j.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14511a[j.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14511a[j.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14511a[j.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14511a[j.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14511a[j.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14511a[j.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14511a[j.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14511a[j.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14511a[j.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14511a[j.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f14511a[j.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14511a[j.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14511a[j.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f14511a[j.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f14511a[j.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f14511a[j.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f14511a[j.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f14511a[j.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f14511a[j.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f14511a[j.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f14511a[j.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        @d.q0
        public static Object a(@d.o0 j jVar) {
            BlendMode blendMode;
            BlendMode blendMode2;
            BlendMode blendMode3;
            BlendMode blendMode4;
            BlendMode blendMode5;
            BlendMode blendMode6;
            BlendMode blendMode7;
            BlendMode blendMode8;
            BlendMode blendMode9;
            BlendMode blendMode10;
            BlendMode blendMode11;
            BlendMode blendMode12;
            BlendMode blendMode13;
            BlendMode blendMode14;
            BlendMode blendMode15;
            BlendMode blendMode16;
            BlendMode blendMode17;
            BlendMode blendMode18;
            BlendMode blendMode19;
            BlendMode blendMode20;
            BlendMode blendMode21;
            BlendMode blendMode22;
            BlendMode blendMode23;
            BlendMode blendMode24;
            BlendMode blendMode25;
            BlendMode blendMode26;
            BlendMode blendMode27;
            BlendMode blendMode28;
            BlendMode blendMode29;
            switch (a.f14511a[jVar.ordinal()]) {
                case 1:
                    blendMode = BlendMode.CLEAR;
                    return blendMode;
                case 2:
                    blendMode2 = BlendMode.SRC;
                    return blendMode2;
                case 3:
                    blendMode3 = BlendMode.DST;
                    return blendMode3;
                case 4:
                    blendMode4 = BlendMode.SRC_OVER;
                    return blendMode4;
                case 5:
                    blendMode5 = BlendMode.DST_OVER;
                    return blendMode5;
                case 6:
                    blendMode6 = BlendMode.SRC_IN;
                    return blendMode6;
                case 7:
                    blendMode7 = BlendMode.DST_IN;
                    return blendMode7;
                case 8:
                    blendMode8 = BlendMode.SRC_OUT;
                    return blendMode8;
                case 9:
                    blendMode9 = BlendMode.DST_OUT;
                    return blendMode9;
                case 10:
                    blendMode10 = BlendMode.SRC_ATOP;
                    return blendMode10;
                case 11:
                    blendMode11 = BlendMode.DST_ATOP;
                    return blendMode11;
                case 12:
                    blendMode12 = BlendMode.XOR;
                    return blendMode12;
                case 13:
                    blendMode13 = BlendMode.PLUS;
                    return blendMode13;
                case 14:
                    blendMode14 = BlendMode.MODULATE;
                    return blendMode14;
                case 15:
                    blendMode15 = BlendMode.SCREEN;
                    return blendMode15;
                case 16:
                    blendMode16 = BlendMode.OVERLAY;
                    return blendMode16;
                case 17:
                    blendMode17 = BlendMode.DARKEN;
                    return blendMode17;
                case 18:
                    blendMode18 = BlendMode.LIGHTEN;
                    return blendMode18;
                case 19:
                    blendMode19 = BlendMode.COLOR_DODGE;
                    return blendMode19;
                case 20:
                    blendMode20 = BlendMode.COLOR_BURN;
                    return blendMode20;
                case 21:
                    blendMode21 = BlendMode.HARD_LIGHT;
                    return blendMode21;
                case 22:
                    blendMode22 = BlendMode.SOFT_LIGHT;
                    return blendMode22;
                case 23:
                    blendMode23 = BlendMode.DIFFERENCE;
                    return blendMode23;
                case 24:
                    blendMode24 = BlendMode.EXCLUSION;
                    return blendMode24;
                case 25:
                    blendMode25 = BlendMode.MULTIPLY;
                    return blendMode25;
                case 26:
                    blendMode26 = BlendMode.HUE;
                    return blendMode26;
                case 27:
                    blendMode27 = BlendMode.SATURATION;
                    return blendMode27;
                case 28:
                    blendMode28 = BlendMode.COLOR;
                    return blendMode28;
                case 29:
                    blendMode29 = BlendMode.LUMINOSITY;
                    return blendMode29;
                default:
                    return null;
            }
        }
    }

    @d.q0
    public static PorterDuff.Mode a(@d.q0 j jVar) {
        if (jVar == null) {
            return null;
        }
        switch (a.f14511a[jVar.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.ADD;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.OVERLAY;
            case 17:
                return PorterDuff.Mode.DARKEN;
            case 18:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }
}