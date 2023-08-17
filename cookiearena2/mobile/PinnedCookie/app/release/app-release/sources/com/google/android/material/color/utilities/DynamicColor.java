package com.google.android.material.color.utilities;

import d.b1;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final Function<DynamicScheme, Double> chroma;
    private final HashMap<DynamicScheme, Hct> hctCache = new HashMap<>();
    public final Function<DynamicScheme, Double> hue;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaConstraint> toneDeltaConstraint;
    public final Function<DynamicScheme, Double> toneMaxContrast;
    public final Function<DynamicScheme, Double> toneMinContrast;

    /* renamed from: com.google.android.material.color.utilities.DynamicColor$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$TonePolarity;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            $SwitchMap$com$google$android$material$color$utilities$TonePolarity = iArr;
            try {
                iArr[TonePolarity.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$TonePolarity[TonePolarity.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$TonePolarity[TonePolarity.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DynamicColor(Function<DynamicScheme, Double> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, Double> function3, Function<DynamicScheme, Double> function4, Function<DynamicScheme, DynamicColor> function5, Function<DynamicScheme, Double> function6, Function<DynamicScheme, Double> function7, Function<DynamicScheme, ToneDeltaConstraint> function8) {
        this.hue = function;
        this.chroma = function2;
        this.tone = function3;
        this.opacity = function4;
        this.background = function5;
        this.toneMinContrast = function6;
        this.toneMaxContrast = function7;
        this.toneDeltaConstraint = function8;
    }

    public static double calculateDynamicTone(DynamicScheme dynamicScheme, Function<DynamicScheme, Double> function, Function<DynamicColor, Double> function2, BiFunction<Double, Double, Double> biFunction, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, ToneDeltaConstraint> function4, Function<Double, Double> function5, Function<Double, Double> function6) {
        double doubleValue = function.apply(dynamicScheme).doubleValue();
        DynamicColor apply = function3 == null ? null : function3.apply(dynamicScheme);
        if (apply == null) {
            return doubleValue;
        }
        double ratioOfTones = Contrast.ratioOfTones(doubleValue, apply.tone.apply(dynamicScheme).doubleValue());
        double doubleValue2 = function2.apply(apply).doubleValue();
        double doubleValue3 = biFunction.apply(Double.valueOf(ratioOfTones), Double.valueOf(doubleValue2)).doubleValue();
        double ratioOfTones2 = Contrast.ratioOfTones(doubleValue2, doubleValue3);
        double d7 = 1.0d;
        if (function5 != null && function5.apply(Double.valueOf(ratioOfTones)) != null) {
            d7 = function5.apply(Double.valueOf(ratioOfTones)).doubleValue();
        }
        double clampDouble = MathUtils.clampDouble(d7, (function6 == null || function6.apply(Double.valueOf(ratioOfTones)) == null) ? 21.0d : function6.apply(Double.valueOf(ratioOfTones)).doubleValue(), ratioOfTones2);
        if (clampDouble != ratioOfTones2) {
            doubleValue3 = contrastingTone(doubleValue2, clampDouble);
        }
        Function<DynamicScheme, DynamicColor> function7 = apply.background;
        return ensureToneDelta((function7 == null || function7.apply(dynamicScheme) == null) ? enableLightForeground(doubleValue3) : doubleValue3, doubleValue, dynamicScheme, function4, function2);
    }

    public static double contrastingTone(double d7, double d8) {
        double lighterUnsafe = Contrast.lighterUnsafe(d7, d8);
        double darkerUnsafe = Contrast.darkerUnsafe(d7, d8);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d7);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d7);
        if (tonePrefersLightForeground(d7)) {
            return (ratioOfTones >= d8 || ratioOfTones >= ratioOfTones2 || ((Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d8 ? 1 : (ratioOfTones == d8 ? 0 : -1)) < 0 && (ratioOfTones2 > d8 ? 1 : (ratioOfTones2 == d8 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        return (ratioOfTones2 >= d8 || ratioOfTones2 >= ratioOfTones) ? darkerUnsafe : lighterUnsafe;
    }

    public static double enableLightForeground(double d7) {
        if (!tonePrefersLightForeground(d7) || toneAllowsLightForeground(d7)) {
            return d7;
        }
        return 49.0d;
    }

    public static double ensureToneDelta(double d7, double d8, DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function, Function<DynamicColor, Double> function2) {
        ToneDeltaConstraint apply = function == null ? null : function.apply(dynamicScheme);
        if (apply == null) {
            return d7;
        }
        double d9 = apply.delta;
        double doubleValue = function2.apply(apply.keepAway).doubleValue();
        double abs = Math.abs(d7 - doubleValue);
        if (abs >= d9) {
            return d7;
        }
        int i7 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity[apply.keepAwayPolarity.ordinal()];
        boolean z6 = true;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return d7;
                }
                boolean z7 = d8 > apply.keepAway.tone.apply(dynamicScheme).doubleValue();
                double abs2 = Math.abs(abs - d9);
                if (!z7 ? d7 >= abs2 : d7 + abs2 > 100.0d) {
                    z6 = false;
                }
                return z6 ? d7 + abs2 : d7 - abs2;
            }
            return MathUtils.clampDouble(androidx.cardview.widget.g.f1896q, 100.0d, doubleValue - d9);
        }
        return MathUtils.clampDouble(androidx.cardview.widget.g.f1896q, 100.0d, doubleValue + d9);
    }

    public static DynamicColor fromArgb(int i7) {
        final Hct fromInt = Hct.fromInt(i7);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i7);
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette lambda$fromArgb$0;
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0(TonalPalette.this, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromArgb$1;
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1(Hct.this, (DynamicScheme) obj);
                return lambda$fromArgb$1;
            }
        });
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2) {
        return fromPalette(function, function2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$5(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getHue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$6(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getChroma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$7(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMinContrastDefault(function, function2, dynamicScheme, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromPalette$8(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMaxContrastDefault(function, function2, dynamicScheme, function3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$getTone$11(DynamicColor dynamicColor, DynamicScheme dynamicScheme) {
        return dynamicColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$getTone$9(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return Double.valueOf(dynamicColor.getTone(dynamicScheme));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMaxContrastDefault$17(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return dynamicColor.toneMaxContrast.apply(dynamicScheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMaxContrastDefault$18(Function function, DynamicScheme dynamicScheme, Double d7, Double d8) {
        return function != null && function.apply(dynamicScheme) != null && ((DynamicColor) function.apply(dynamicScheme)).background != null && ((DynamicColor) function.apply(dynamicScheme)).background.apply(dynamicScheme) != null ? Double.valueOf(contrastingTone(d8.doubleValue(), 7.0d)) : Double.valueOf(contrastingTone(d8.doubleValue(), Math.max(7.0d, d7.doubleValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$14(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return dynamicColor.toneMinContrast.apply(dynamicScheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$15(Function function, DynamicScheme dynamicScheme, Function function2, Double d7, Double d8) {
        double doubleValue = ((Double) function.apply(dynamicScheme)).doubleValue();
        if (d7.doubleValue() >= 7.0d) {
            doubleValue = contrastingTone(d8.doubleValue(), 4.5d);
        } else if (d7.doubleValue() >= 3.0d) {
            doubleValue = contrastingTone(d8.doubleValue(), 3.0d);
        } else {
            if ((function2 == null || function2.apply(dynamicScheme) == null || ((DynamicColor) function2.apply(dynamicScheme)).background == null || ((DynamicColor) function2.apply(dynamicScheme)).background.apply(dynamicScheme) == null) ? false : true) {
                doubleValue = contrastingTone(d8.doubleValue(), d7.doubleValue());
            }
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$16(Double d7) {
        return d7;
    }

    public static boolean toneAllowsLightForeground(double d7) {
        return Math.round(d7) <= 49;
    }

    public static double toneMaxContrastDefault(Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$toneMaxContrastDefault$17;
                lambda$toneMaxContrastDefault$17 = DynamicColor.lambda$toneMaxContrastDefault$17(DynamicScheme.this, (DynamicColor) obj);
                return lambda$toneMaxContrastDefault$17;
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.j
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double lambda$toneMaxContrastDefault$18;
                lambda$toneMaxContrastDefault$18 = DynamicColor.lambda$toneMaxContrastDefault$18(function2, dynamicScheme, (Double) obj, (Double) obj2);
                return lambda$toneMaxContrastDefault$18;
            }
        }, function2, function3, null, null);
    }

    public static double toneMinContrastDefault(final Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$toneMinContrastDefault$14;
                lambda$toneMinContrastDefault$14 = DynamicColor.lambda$toneMinContrastDefault$14(DynamicScheme.this, (DynamicColor) obj);
                return lambda$toneMinContrastDefault$14;
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.o
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double lambda$toneMinContrastDefault$15;
                lambda$toneMinContrastDefault$15 = DynamicColor.lambda$toneMinContrastDefault$15(function, dynamicScheme, function2, (Double) obj, (Double) obj2);
                return lambda$toneMinContrastDefault$15;
            }
        }, function2, function3, null, new Function() { // from class: com.google.android.material.color.utilities.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$toneMinContrastDefault$16;
                lambda$toneMinContrastDefault$16 = DynamicColor.lambda$toneMinContrastDefault$16((Double) obj);
                return lambda$toneMinContrastDefault$16;
            }
        });
    }

    public static boolean tonePrefersLightForeground(double d7) {
        return Math.round(d7) <= 60;
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        int i7 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i7;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i7 & androidx.core.view.u1.f3815s);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct from = Hct.from(this.hue.apply(dynamicScheme).doubleValue(), this.chroma.apply(dynamicScheme).doubleValue(), getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, from);
        return from;
    }

    public double getTone(final DynamicScheme dynamicScheme) {
        final double d7;
        final double doubleValue = this.tone.apply(dynamicScheme).doubleValue();
        double d8 = dynamicScheme.contrastLevel;
        boolean z6 = d8 < androidx.cardview.widget.g.f1896q;
        if (d8 != androidx.cardview.widget.g.f1896q) {
            double doubleValue2 = this.tone.apply(dynamicScheme).doubleValue();
            doubleValue = doubleValue2 + (((z6 ? this.toneMinContrast : this.toneMaxContrast).apply(dynamicScheme).doubleValue() - doubleValue2) * Math.abs(dynamicScheme.contrastLevel));
        }
        Function<DynamicScheme, DynamicColor> function = this.background;
        final DynamicColor apply = function == null ? null : function.apply(dynamicScheme);
        if (apply != null) {
            Function<DynamicScheme, DynamicColor> function2 = apply.background;
            boolean z7 = (function2 == null || function2.apply(dynamicScheme) == null) ? false : true;
            d7 = Contrast.ratioOfTones(this.tone.apply(dynamicScheme).doubleValue(), apply.tone.apply(dynamicScheme).doubleValue());
            if (z6) {
                double ratioOfTones = Contrast.ratioOfTones(this.toneMinContrast.apply(dynamicScheme).doubleValue(), apply.toneMinContrast.apply(dynamicScheme).doubleValue());
                if (z7) {
                    r11 = ratioOfTones;
                }
            } else {
                double ratioOfTones2 = Contrast.ratioOfTones(this.toneMaxContrast.apply(dynamicScheme).doubleValue(), apply.toneMaxContrast.apply(dynamicScheme).doubleValue());
                r11 = z7 ? Math.min(ratioOfTones2, d7) : 1.0d;
                if (z7) {
                    d7 = Math.max(ratioOfTones2, d7);
                }
            }
            return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: com.google.android.material.color.utilities.s
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double lambda$getTone$9;
                    lambda$getTone$9 = DynamicColor.lambda$getTone$9(DynamicScheme.this, (DynamicColor) obj);
                    return lambda$getTone$9;
                }
            }, new BiFunction() { // from class: com.google.android.material.color.utilities.b
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Double valueOf;
                    Double d9 = (Double) obj;
                    Double d10 = (Double) obj2;
                    valueOf = Double.valueOf(doubleValue);
                    return valueOf;
                }
            }, new Function() { // from class: com.google.android.material.color.utilities.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    DynamicColor lambda$getTone$11;
                    lambda$getTone$11 = DynamicColor.lambda$getTone$11(DynamicColor.this, (DynamicScheme) obj);
                    return lambda$getTone$11;
                }
            }, this.toneDeltaConstraint, new Function() { // from class: com.google.android.material.color.utilities.d
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double valueOf;
                    Double d9 = (Double) obj;
                    valueOf = Double.valueOf(r1);
                    return valueOf;
                }
            }, new Function() { // from class: com.google.android.material.color.utilities.e
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double valueOf;
                    Double d9 = (Double) obj;
                    valueOf = Double.valueOf(d7);
                    return valueOf;
                }
            });
        }
        d7 = 21.0d;
        return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$getTone$9;
                lambda$getTone$9 = DynamicColor.lambda$getTone$9(DynamicScheme.this, (DynamicColor) obj);
                return lambda$getTone$9;
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.b
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double valueOf;
                Double d9 = (Double) obj;
                Double d10 = (Double) obj2;
                valueOf = Double.valueOf(doubleValue);
                return valueOf;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$getTone$11;
                lambda$getTone$11 = DynamicColor.lambda$getTone$11(DynamicColor.this, (DynamicScheme) obj);
                return lambda$getTone$11;
            }
        }, this.toneDeltaConstraint, new Function() { // from class: com.google.android.material.color.utilities.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                Double d9 = (Double) obj;
                valueOf = Double.valueOf(r1);
                return valueOf;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                Double d9 = (Double) obj;
                valueOf = Double.valueOf(d7);
                return valueOf;
            }
        });
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, DynamicColor> function3) {
        return fromPalette(function, function2, function3, null);
    }

    public static DynamicColor fromPalette(final Function<DynamicScheme, TonalPalette> function, final Function<DynamicScheme, Double> function2, final Function<DynamicScheme, DynamicColor> function3, final Function<DynamicScheme, ToneDeltaConstraint> function4) {
        return new DynamicColor(new Function() { // from class: com.google.android.material.color.utilities.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromPalette$5;
                lambda$fromPalette$5 = DynamicColor.lambda$fromPalette$5(function, (DynamicScheme) obj);
                return lambda$fromPalette$5;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromPalette$6;
                lambda$fromPalette$6 = DynamicColor.lambda$fromPalette$6(function, (DynamicScheme) obj);
                return lambda$fromPalette$6;
            }
        }, function2, null, function3, new Function() { // from class: com.google.android.material.color.utilities.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromPalette$7;
                lambda$fromPalette$7 = DynamicColor.lambda$fromPalette$7(function2, function3, function4, (DynamicScheme) obj);
                return lambda$fromPalette$7;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromPalette$8;
                lambda$fromPalette$8 = DynamicColor.lambda$fromPalette$8(function2, function3, function4, (DynamicScheme) obj);
                return lambda$fromPalette$8;
            }
        }, function4);
    }

    public static DynamicColor fromArgb(final int i7, Function<DynamicScheme, Double> function) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i7);
                return fromInt;
            }
        }, function);
    }

    public static DynamicColor fromArgb(final int i7, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i7);
                return fromInt;
            }
        }, function, function2);
    }

    public static DynamicColor fromArgb(final int i7, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i7);
                return fromInt;
            }
        }, function, function2, function3);
    }
}
