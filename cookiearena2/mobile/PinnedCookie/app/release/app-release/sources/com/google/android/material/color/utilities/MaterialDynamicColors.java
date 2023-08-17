package com.google.android.material.color.utilities;

import d.b1;
import java.util.function.Function;
@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class MaterialDynamicColors {
    private static final double CONTAINER_ACCENT_TONE_DELTA = 15.0d;
    public static final DynamicColor background = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.q2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.c4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$1;
            lambda$static$1 = MaterialDynamicColors.lambda$static$1((DynamicScheme) obj);
            return lambda$static$1;
        }
    });
    public static final DynamicColor onBackground = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.o4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.a5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$3;
            lambda$static$3 = MaterialDynamicColors.lambda$static$3((DynamicScheme) obj);
            return lambda$static$3;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.m5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$4;
            lambda$static$4 = MaterialDynamicColors.lambda$static$4((DynamicScheme) obj);
            return lambda$static$4;
        }
    });
    public static final DynamicColor surface = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.c0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.o0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$6;
            lambda$static$6 = MaterialDynamicColors.lambda$static$6((DynamicScheme) obj);
            return lambda$static$6;
        }
    });
    public static final DynamicColor surfaceInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.b1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.n1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$8;
            lambda$static$8 = MaterialDynamicColors.lambda$static$8((DynamicScheme) obj);
            return lambda$static$8;
        }
    });
    public static final DynamicColor surfaceBright = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.z1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.l1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$10;
            lambda$static$10 = MaterialDynamicColors.lambda$static$10((DynamicScheme) obj);
            return lambda$static$10;
        }
    });
    public static final DynamicColor surfaceDim = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.k2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.w2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$12;
            lambda$static$12 = MaterialDynamicColors.lambda$static$12((DynamicScheme) obj);
            return lambda$static$12;
        }
    });
    public static final DynamicColor surfaceSub2 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.i3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.u3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$14;
            lambda$static$14 = MaterialDynamicColors.lambda$static$14((DynamicScheme) obj);
            return lambda$static$14;
        }
    });
    public static final DynamicColor surfaceSub1 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.w3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.y3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$16;
            lambda$static$16 = MaterialDynamicColors.lambda$static$16((DynamicScheme) obj);
            return lambda$static$16;
        }
    });
    public static final DynamicColor surfaceContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.z3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.a4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$18;
            lambda$static$18 = MaterialDynamicColors.lambda$static$18((DynamicScheme) obj);
            return lambda$static$18;
        }
    });
    public static final DynamicColor surfaceAdd1 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.b4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.d4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$20;
            lambda$static$20 = MaterialDynamicColors.lambda$static$20((DynamicScheme) obj);
            return lambda$static$20;
        }
    });
    public static final DynamicColor surfaceAdd2 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.e4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.f4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$22;
            lambda$static$22 = MaterialDynamicColors.lambda$static$22((DynamicScheme) obj);
            return lambda$static$22;
        }
    });
    public static final DynamicColor onSurface = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.g4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.h4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$24;
            lambda$static$24 = MaterialDynamicColors.lambda$static$24((DynamicScheme) obj);
            return lambda$static$24;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.j4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSurfaceInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.k4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.l4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$27;
            lambda$static$27 = MaterialDynamicColors.lambda$static$27((DynamicScheme) obj);
            return lambda$static$27;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.m4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$28;
            lambda$static$28 = MaterialDynamicColors.lambda$static$28((DynamicScheme) obj);
            return lambda$static$28;
        }
    });
    public static final DynamicColor surfaceVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.p4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$30;
            lambda$static$30 = MaterialDynamicColors.lambda$static$30((DynamicScheme) obj);
            return lambda$static$30;
        }
    });
    public static final DynamicColor onSurfaceVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.q4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.r4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$32;
            lambda$static$32 = MaterialDynamicColors.lambda$static$32((DynamicScheme) obj);
            return lambda$static$32;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.s4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$33;
            lambda$static$33 = MaterialDynamicColors.lambda$static$33((DynamicScheme) obj);
            return lambda$static$33;
        }
    });
    public static final DynamicColor outline = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.u4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.v4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$35;
            lambda$static$35 = MaterialDynamicColors.lambda$static$35((DynamicScheme) obj);
            return lambda$static$35;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.w4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor outlineVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.x4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.y4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$38;
            lambda$static$38 = MaterialDynamicColors.lambda$static$38((DynamicScheme) obj);
            return lambda$static$38;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.z4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor primaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.b5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.c5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$41;
            lambda$static$41 = MaterialDynamicColors.lambda$static$41((DynamicScheme) obj);
            return lambda$static$41;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.d5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onPrimaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.f5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.g5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$44;
            lambda$static$44 = MaterialDynamicColors.lambda$static$44((DynamicScheme) obj);
            return lambda$static$44;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.h5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$45;
            lambda$static$45 = MaterialDynamicColors.lambda$static$45((DynamicScheme) obj);
            return lambda$static$45;
        }
    }, null);
    public static final DynamicColor primary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.i5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.j5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$47;
            lambda$static$47 = MaterialDynamicColors.lambda$static$47((DynamicScheme) obj);
            return lambda$static$47;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.k5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.l5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ToneDeltaConstraint lambda$static$49;
            lambda$static$49 = MaterialDynamicColors.lambda$static$49((DynamicScheme) obj);
            return lambda$static$49;
        }
    });
    public static final DynamicColor primaryInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.o5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$51;
            lambda$static$51 = MaterialDynamicColors.lambda$static$51((DynamicScheme) obj);
            return lambda$static$51;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.u
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$52;
            lambda$static$52 = MaterialDynamicColors.lambda$static$52((DynamicScheme) obj);
            return lambda$static$52;
        }
    });
    public static final DynamicColor onPrimary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.v
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.w
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$54;
            lambda$static$54 = MaterialDynamicColors.lambda$static$54((DynamicScheme) obj);
            return lambda$static$54;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.x
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$55;
            lambda$static$55 = MaterialDynamicColors.lambda$static$55((DynamicScheme) obj);
            return lambda$static$55;
        }
    });
    public static final DynamicColor secondaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.y
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.z
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$57;
            lambda$static$57 = MaterialDynamicColors.lambda$static$57((DynamicScheme) obj);
            return lambda$static$57;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.a0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSecondaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.b0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.d0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$60;
            lambda$static$60 = MaterialDynamicColors.lambda$static$60((DynamicScheme) obj);
            return lambda$static$60;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.f0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$61;
            lambda$static$61 = MaterialDynamicColors.lambda$static$61((DynamicScheme) obj);
            return lambda$static$61;
        }
    });
    public static final DynamicColor secondary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.g0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.h0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$63;
            lambda$static$63 = MaterialDynamicColors.lambda$static$63((DynamicScheme) obj);
            return lambda$static$63;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.i0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.j0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ToneDeltaConstraint lambda$static$65;
            lambda$static$65 = MaterialDynamicColors.lambda$static$65((DynamicScheme) obj);
            return lambda$static$65;
        }
    });
    public static final DynamicColor onSecondary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.k0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.l0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$67;
            lambda$static$67 = MaterialDynamicColors.lambda$static$67((DynamicScheme) obj);
            return lambda$static$67;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.m0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$68;
            lambda$static$68 = MaterialDynamicColors.lambda$static$68((DynamicScheme) obj);
            return lambda$static$68;
        }
    });
    public static final DynamicColor tertiaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.q0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$70;
            lambda$static$70 = MaterialDynamicColors.lambda$static$70((DynamicScheme) obj);
            return lambda$static$70;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.r0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onTertiaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.s0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.t0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$73;
            lambda$static$73 = MaterialDynamicColors.lambda$static$73((DynamicScheme) obj);
            return lambda$static$73;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.u0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$74;
            lambda$static$74 = MaterialDynamicColors.lambda$static$74((DynamicScheme) obj);
            return lambda$static$74;
        }
    });
    public static final DynamicColor tertiary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.v0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.w0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$76;
            lambda$static$76 = MaterialDynamicColors.lambda$static$76((DynamicScheme) obj);
            return lambda$static$76;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.x0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.y0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ToneDeltaConstraint lambda$static$78;
            lambda$static$78 = MaterialDynamicColors.lambda$static$78((DynamicScheme) obj);
            return lambda$static$78;
        }
    });
    public static final DynamicColor onTertiary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.z0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.c1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$80;
            lambda$static$80 = MaterialDynamicColors.lambda$static$80((DynamicScheme) obj);
            return lambda$static$80;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.d1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$81;
            lambda$static$81 = MaterialDynamicColors.lambda$static$81((DynamicScheme) obj);
            return lambda$static$81;
        }
    });
    public static final DynamicColor errorContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.e1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.f1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$83;
            lambda$static$83 = MaterialDynamicColors.lambda$static$83((DynamicScheme) obj);
            return lambda$static$83;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.g1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onErrorContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.h1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.i1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$86;
            lambda$static$86 = MaterialDynamicColors.lambda$static$86((DynamicScheme) obj);
            return lambda$static$86;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.j1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$87;
            lambda$static$87 = MaterialDynamicColors.lambda$static$87((DynamicScheme) obj);
            return lambda$static$87;
        }
    });
    public static final DynamicColor error = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.k1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.m1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$89;
            lambda$static$89 = MaterialDynamicColors.lambda$static$89((DynamicScheme) obj);
            return lambda$static$89;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.o1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.p1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ToneDeltaConstraint lambda$static$91;
            lambda$static$91 = MaterialDynamicColors.lambda$static$91((DynamicScheme) obj);
            return lambda$static$91;
        }
    });
    public static final DynamicColor onError = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.q1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.r1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$93;
            lambda$static$93 = MaterialDynamicColors.lambda$static$93((DynamicScheme) obj);
            return lambda$static$93;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.s1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$94;
            lambda$static$94 = MaterialDynamicColors.lambda$static$94((DynamicScheme) obj);
            return lambda$static$94;
        }
    });
    public static final DynamicColor primaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.t1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.u1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$96;
            lambda$static$96 = MaterialDynamicColors.lambda$static$96((DynamicScheme) obj);
            return lambda$static$96;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.v1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor primaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.x1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.y1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$99;
            lambda$static$99 = MaterialDynamicColors.lambda$static$99((DynamicScheme) obj);
            return lambda$static$99;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.b3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onPrimaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.m3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.x3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$102;
            lambda$static$102 = MaterialDynamicColors.lambda$static$102((DynamicScheme) obj);
            return lambda$static$102;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.i4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$103;
            lambda$static$103 = MaterialDynamicColors.lambda$static$103((DynamicScheme) obj);
            return lambda$static$103;
        }
    });
    public static final DynamicColor onPrimaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.t4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.e5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$105;
            lambda$static$105 = MaterialDynamicColors.lambda$static$105((DynamicScheme) obj);
            return lambda$static$105;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.p5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$106;
            lambda$static$106 = MaterialDynamicColors.lambda$static$106((DynamicScheme) obj);
            return lambda$static$106;
        }
    });
    public static final DynamicColor secondaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.e0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.p0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$108;
            lambda$static$108 = MaterialDynamicColors.lambda$static$108((DynamicScheme) obj);
            return lambda$static$108;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.a1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor secondaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.w1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.a2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$111;
            lambda$static$111 = MaterialDynamicColors.lambda$static$111((DynamicScheme) obj);
            return lambda$static$111;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.b2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSecondaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.c2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.d2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$114;
            lambda$static$114 = MaterialDynamicColors.lambda$static$114((DynamicScheme) obj);
            return lambda$static$114;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.e2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$115;
            lambda$static$115 = MaterialDynamicColors.lambda$static$115((DynamicScheme) obj);
            return lambda$static$115;
        }
    });
    public static final DynamicColor onSecondaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.g2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.h2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$117;
            lambda$static$117 = MaterialDynamicColors.lambda$static$117((DynamicScheme) obj);
            return lambda$static$117;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.i2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$118;
            lambda$static$118 = MaterialDynamicColors.lambda$static$118((DynamicScheme) obj);
            return lambda$static$118;
        }
    });
    public static final DynamicColor tertiaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.j2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.l2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$120;
            lambda$static$120 = MaterialDynamicColors.lambda$static$120((DynamicScheme) obj);
            return lambda$static$120;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.m2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor tertiaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.o2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$123;
            lambda$static$123 = MaterialDynamicColors.lambda$static$123((DynamicScheme) obj);
            return lambda$static$123;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.p2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onTertiaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.r2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.s2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$126;
            lambda$static$126 = MaterialDynamicColors.lambda$static$126((DynamicScheme) obj);
            return lambda$static$126;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.t2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$127;
            lambda$static$127 = MaterialDynamicColors.lambda$static$127((DynamicScheme) obj);
            return lambda$static$127;
        }
    });
    public static final DynamicColor onTertiaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.u2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.v2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$129;
            lambda$static$129 = MaterialDynamicColors.lambda$static$129((DynamicScheme) obj);
            return lambda$static$129;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.x2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor lambda$static$130;
            lambda$static$130 = MaterialDynamicColors.lambda$static$130((DynamicScheme) obj);
            return lambda$static$130;
        }
    });
    public static final DynamicColor controlActivated = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.y2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.z2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$132;
            lambda$static$132 = MaterialDynamicColors.lambda$static$132((DynamicScheme) obj);
            return lambda$static$132;
        }
    }, null);
    public static final DynamicColor controlNormal = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.a3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.c3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$134;
            lambda$static$134 = MaterialDynamicColors.lambda$static$134((DynamicScheme) obj);
            return lambda$static$134;
        }
    });
    public static final DynamicColor controlHighlight = new DynamicColor(new Function() { // from class: com.google.android.material.color.utilities.d3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$135;
            lambda$static$135 = MaterialDynamicColors.lambda$static$135((DynamicScheme) obj);
            return lambda$static$135;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.e3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$136;
            lambda$static$136 = MaterialDynamicColors.lambda$static$136((DynamicScheme) obj);
            return lambda$static$136;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.f3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$137;
            lambda$static$137 = MaterialDynamicColors.lambda$static$137((DynamicScheme) obj);
            return lambda$static$137;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.g3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$138;
            lambda$static$138 = MaterialDynamicColors.lambda$static$138((DynamicScheme) obj);
            return lambda$static$138;
        }
    }, null, new Function() { // from class: com.google.android.material.color.utilities.h3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$140;
            lambda$static$140 = MaterialDynamicColors.lambda$static$140((DynamicScheme) obj);
            return lambda$static$140;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.j3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$142;
            lambda$static$142 = MaterialDynamicColors.lambda$static$142((DynamicScheme) obj);
            return lambda$static$142;
        }
    }, null);
    public static final DynamicColor textPrimaryInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.k3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.l3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$144;
            lambda$static$144 = MaterialDynamicColors.lambda$static$144((DynamicScheme) obj);
            return lambda$static$144;
        }
    });
    public static final DynamicColor textSecondaryAndTertiaryInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.n3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.o3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$146;
            lambda$static$146 = MaterialDynamicColors.lambda$static$146((DynamicScheme) obj);
            return lambda$static$146;
        }
    });
    public static final DynamicColor textPrimaryInverseDisableOnly = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.p3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.q3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$148;
            lambda$static$148 = MaterialDynamicColors.lambda$static$148((DynamicScheme) obj);
            return lambda$static$148;
        }
    });
    public static final DynamicColor textSecondaryAndTertiaryInverseDisabled = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.r3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.s3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$150;
            lambda$static$150 = MaterialDynamicColors.lambda$static$150((DynamicScheme) obj);
            return lambda$static$150;
        }
    });
    public static final DynamicColor textHintInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.t3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.v3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double lambda$static$152;
            lambda$static$152 = MaterialDynamicColors.lambda$static$152((DynamicScheme) obj);
            return lambda$static$152;
        }
    });

    private MaterialDynamicColors() {
    }

    public static double findDesiredChromaByTone(double d7, double d8, double d9, boolean z6) {
        Hct from = Hct.from(d7, d8, d9);
        if (from.getChroma() < d8) {
            Hct hct = from;
            double chroma = from.getChroma();
            double d10 = d9;
            while (hct.getChroma() < d8) {
                double d11 = d10 + (z6 ? -1.0d : 1.0d);
                Hct from2 = Hct.from(d7, d8, d11);
                if (chroma > from2.getChroma() || Math.abs(from2.getChroma() - d8) < 0.4d) {
                    return d11;
                }
                if (Math.abs(from2.getChroma() - d8) < Math.abs(hct.getChroma() - d8)) {
                    hct = from2;
                }
                chroma = Math.max(chroma, from2.getChroma());
                d10 = d11;
            }
            return d10;
        }
        return d9;
    }

    public static DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright : surfaceDim;
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$10(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 24.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$102(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$103(DynamicScheme dynamicScheme) {
        return primaryFixedDarker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$105(DynamicScheme dynamicScheme) {
        return Double.valueOf(30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$106(DynamicScheme dynamicScheme) {
        return primaryFixedDarker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$108(DynamicScheme dynamicScheme) {
        return Double.valueOf(90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$111(DynamicScheme dynamicScheme) {
        return Double.valueOf(80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$114(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$115(DynamicScheme dynamicScheme) {
        return secondaryFixedDarker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$117(DynamicScheme dynamicScheme) {
        return Double.valueOf(30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$118(DynamicScheme dynamicScheme) {
        return secondaryFixedDarker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$12(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 87.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$120(DynamicScheme dynamicScheme) {
        return Double.valueOf(90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$123(DynamicScheme dynamicScheme) {
        return Double.valueOf(80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$126(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$127(DynamicScheme dynamicScheme) {
        return tertiaryFixedDarker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$129(DynamicScheme dynamicScheme) {
        return Double.valueOf(30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$130(DynamicScheme dynamicScheme) {
        return tertiaryFixedDarker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$132(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$134(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$135(DynamicScheme dynamicScheme) {
        return Double.valueOf((double) androidx.cardview.widget.g.f1896q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$136(DynamicScheme dynamicScheme) {
        return Double.valueOf((double) androidx.cardview.widget.g.f1896q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$137(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : androidx.cardview.widget.g.f1896q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$138(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 0.2d : 0.12d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$139(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : androidx.cardview.widget.g.f1896q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$14(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 4.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$140(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMinContrastDefault(new Function() { // from class: com.google.android.material.color.utilities.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$static$139;
                lambda$static$139 = MaterialDynamicColors.lambda$static$139((DynamicScheme) obj);
                return lambda$static$139;
            }
        }, null, dynamicScheme, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$141(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : androidx.cardview.widget.g.f1896q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$142(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMaxContrastDefault(new Function() { // from class: com.google.android.material.color.utilities.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$static$141;
                lambda$static$141 = MaterialDynamicColors.lambda$static$141((DynamicScheme) obj);
                return lambda$static$141;
            }
        }, null, dynamicScheme, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$144(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$146(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$148(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$150(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$152(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$16(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 96.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$18(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 12.0d : 94.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$20(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 17.0d : 92.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$22(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 22.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$24(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$27(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$28(DynamicScheme dynamicScheme) {
        return surfaceInverse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$30(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$32(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$33(DynamicScheme dynamicScheme) {
        return surfaceVariant;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$35(DynamicScheme dynamicScheme) {
        return Double.valueOf(50.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$38(DynamicScheme dynamicScheme) {
        return Double.valueOf(80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$4(DynamicScheme dynamicScheme) {
        return background;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$41(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$44(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(primaryContainer.getTone(dynamicScheme), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$45(DynamicScheme dynamicScheme) {
        return primaryContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$47(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$49(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, primaryContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$51(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 40.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$52(DynamicScheme dynamicScheme) {
        return surfaceInverse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$54(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$55(DynamicScheme dynamicScheme) {
        return primary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$57(DynamicScheme dynamicScheme) {
        double d7 = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d7, !dynamicScheme.isDark)), dynamicScheme));
        }
        return Double.valueOf(d7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$6(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$60(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(secondaryContainer.getTone(dynamicScheme), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$61(DynamicScheme dynamicScheme) {
        return secondaryContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$63(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$65(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, secondaryContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$67(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$68(DynamicScheme dynamicScheme) {
        return secondary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$70(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$73(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(tertiaryContainer.getTone(dynamicScheme), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$74(DynamicScheme dynamicScheme) {
        return tertiaryContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$76(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$78(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, tertiaryContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$8(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$80(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$81(DynamicScheme dynamicScheme) {
        return tertiary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$83(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$86(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$87(DynamicScheme dynamicScheme) {
        return errorContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$89(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$91(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, errorContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$93(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DynamicColor lambda$static$94(DynamicScheme dynamicScheme) {
        return error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$96(DynamicScheme dynamicScheme) {
        return Double.valueOf(90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$static$99(DynamicScheme dynamicScheme) {
        return Double.valueOf(80.0d);
    }

    public static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct inViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        return (!DynamicColor.tonePrefersLightForeground(hct.getTone()) || DynamicColor.toneAllowsLightForeground(inViewingConditions.getTone())) ? DynamicColor.enableLightForeground(inViewingConditions.getTone()) : DynamicColor.enableLightForeground(hct.getTone());
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        return ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }
}
