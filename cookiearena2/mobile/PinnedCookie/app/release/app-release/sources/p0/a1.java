package p0;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14480a = "PathParser";

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14481a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f14482b;
    }

    public static void a(ArrayList<b> arrayList, char c7, float[] fArr) {
        arrayList.add(new b(c7, fArr));
    }

    public static boolean b(@d.q0 b[] bVarArr, @d.q0 b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            b bVar = bVarArr[i7];
            char c7 = bVar.f14483a;
            b bVar2 = bVarArr2[i7];
            if (c7 != bVar2.f14483a || bVar.f14484b.length != bVar2.f14484b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] c(float[] fArr, int i7, int i8) {
        if (i7 <= i8) {
            int length = fArr.length;
            if (i7 < 0 || i7 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i9 = i8 - i7;
            int min = Math.min(i9, length - i7);
            float[] fArr2 = new float[i9];
            System.arraycopy(fArr, i7, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        int i8 = 0;
        while (i7 < str.length()) {
            int j7 = j(str, i7);
            String trim = str.substring(i8, j7).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i8 = j7;
            i7 = j7 + 1;
        }
        if (i7 - i8 == 1 && i8 < str.length()) {
            a(arrayList, str.charAt(i8), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d7 = d(str);
        if (d7 != null) {
            try {
                b.e(d7, path);
                return path;
            } catch (RuntimeException e7) {
                throw new RuntimeException("Error in parsing " + str, e7);
            }
        }
        return null;
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = new b(bVarArr[i7]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.String r8, int r9, p0.a1.a r10) {
        /*
            r0 = 0
            r10.f14482b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.f14482b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f14482b = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f14481a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a1.g(java.lang.String, int, p0.a1$a):void");
    }

    public static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i7 = 1;
            int i8 = 0;
            while (i7 < length) {
                g(str, i7, aVar);
                int i9 = aVar.f14481a;
                if (i7 < i9) {
                    fArr[i8] = Float.parseFloat(str.substring(i7, i9));
                    i8++;
                }
                i7 = aVar.f14482b ? i9 : i9 + 1;
            }
            return c(fArr, 0, i8);
        } catch (NumberFormatException e7) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e7);
        }
    }

    public static boolean i(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f7) {
        if (bVarArr == null || bVarArr2 == null || bVarArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (bVarArr.length == bVarArr2.length && bVarArr2.length == bVarArr3.length) {
            if (b(bVarArr2, bVarArr3)) {
                for (int i7 = 0; i7 < bVarArr.length; i7++) {
                    bVarArr[i7].d(bVarArr2[i7], bVarArr3[i7], f7);
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }

    public static int j(String str, int i7) {
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i7;
            }
            i7++;
        }
        return i7;
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i7 = 0; i7 < bVarArr2.length; i7++) {
            bVarArr[i7].f14483a = bVarArr2[i7].f14483a;
            int i8 = 0;
            while (true) {
                float[] fArr = bVarArr2[i7].f14484b;
                if (i8 < fArr.length) {
                    bVarArr[i7].f14484b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public char f14483a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f14484b;

        public b(char c7, float[] fArr) {
            this.f14483a = c7;
            this.f14484b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void a(Path path, float[] fArr, char c7, char c8, float[] fArr2) {
            int i7;
            int i8;
            int i9;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            char c9 = c8;
            char c10 = 0;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c9) {
                case 'A':
                case androidx.constraintlayout.widget.e.Q1 /* 97 */:
                    i7 = 7;
                    i8 = i7;
                    break;
                case 'C':
                case androidx.constraintlayout.widget.e.S1 /* 99 */:
                    i7 = 6;
                    i8 = i7;
                    break;
                case 'H':
                case 'V':
                case w0.m0.f18130k /* 104 */:
                case 'v':
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case androidx.appcompat.app.h.f805t /* 108 */:
                case androidx.appcompat.app.h.f806u /* 109 */:
                case 't':
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i8 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i8 = 2;
                    break;
            }
            float f21 = f15;
            float f22 = f16;
            float f23 = f19;
            float f24 = f20;
            int i10 = 0;
            char c11 = c7;
            while (i10 < fArr2.length) {
                if (c9 != 'A') {
                    if (c9 == 'C') {
                        i9 = i10;
                        int i11 = i9 + 2;
                        int i12 = i9 + 3;
                        int i13 = i9 + 4;
                        int i14 = i9 + 5;
                        path.cubicTo(fArr2[i9 + 0], fArr2[i9 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        f21 = fArr2[i13];
                        float f25 = fArr2[i14];
                        float f26 = fArr2[i11];
                        float f27 = fArr2[i12];
                        f22 = f25;
                        f18 = f27;
                        f17 = f26;
                    } else if (c9 == 'H') {
                        i9 = i10;
                        int i15 = i9 + 0;
                        path.lineTo(fArr2[i15], f22);
                        f21 = fArr2[i15];
                    } else if (c9 == 'Q') {
                        i9 = i10;
                        int i16 = i9 + 0;
                        int i17 = i9 + 1;
                        int i18 = i9 + 2;
                        int i19 = i9 + 3;
                        path.quadTo(fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                        float f28 = fArr2[i16];
                        float f29 = fArr2[i17];
                        f21 = fArr2[i18];
                        f22 = fArr2[i19];
                        f17 = f28;
                        f18 = f29;
                    } else if (c9 == 'V') {
                        i9 = i10;
                        int i20 = i9 + 0;
                        path.lineTo(f21, fArr2[i20]);
                        f22 = fArr2[i20];
                    } else if (c9 != 'a') {
                        if (c9 != 'c') {
                            if (c9 == 'h') {
                                int i21 = i10 + 0;
                                path.rLineTo(fArr2[i21], 0.0f);
                                f21 += fArr2[i21];
                            } else if (c9 != 'q') {
                                if (c9 == 'v') {
                                    int i22 = i10 + 0;
                                    path.rLineTo(0.0f, fArr2[i22]);
                                    f10 = fArr2[i22];
                                } else if (c9 == 'L') {
                                    int i23 = i10 + 0;
                                    int i24 = i10 + 1;
                                    path.lineTo(fArr2[i23], fArr2[i24]);
                                    f21 = fArr2[i23];
                                    f22 = fArr2[i24];
                                } else if (c9 == 'M') {
                                    f21 = fArr2[i10 + 0];
                                    f22 = fArr2[i10 + 1];
                                    if (i10 > 0) {
                                        path.lineTo(f21, f22);
                                    } else {
                                        path.moveTo(f21, f22);
                                        i9 = i10;
                                        f24 = f22;
                                        f23 = f21;
                                    }
                                } else if (c9 == 'S') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f21 = (f21 * 2.0f) - f17;
                                        f22 = (f22 * 2.0f) - f18;
                                    }
                                    float f30 = f22;
                                    int i25 = i10 + 0;
                                    int i26 = i10 + 1;
                                    int i27 = i10 + 2;
                                    int i28 = i10 + 3;
                                    path.cubicTo(f21, f30, fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                    f7 = fArr2[i25];
                                    f8 = fArr2[i26];
                                    f21 = fArr2[i27];
                                    f22 = fArr2[i28];
                                    f17 = f7;
                                    f18 = f8;
                                } else if (c9 == 'T') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f21 = (f21 * 2.0f) - f17;
                                        f22 = (f22 * 2.0f) - f18;
                                    }
                                    int i29 = i10 + 0;
                                    int i30 = i10 + 1;
                                    path.quadTo(f21, f22, fArr2[i29], fArr2[i30]);
                                    float f31 = fArr2[i29];
                                    float f32 = fArr2[i30];
                                    i9 = i10;
                                    f18 = f22;
                                    f17 = f21;
                                    f21 = f31;
                                    f22 = f32;
                                } else if (c9 == 'l') {
                                    int i31 = i10 + 0;
                                    int i32 = i10 + 1;
                                    path.rLineTo(fArr2[i31], fArr2[i32]);
                                    f21 += fArr2[i31];
                                    f10 = fArr2[i32];
                                } else if (c9 == 'm') {
                                    float f33 = fArr2[i10 + 0];
                                    f21 += f33;
                                    float f34 = fArr2[i10 + 1];
                                    f22 += f34;
                                    if (i10 > 0) {
                                        path.rLineTo(f33, f34);
                                    } else {
                                        path.rMoveTo(f33, f34);
                                        i9 = i10;
                                        f24 = f22;
                                        f23 = f21;
                                    }
                                } else if (c9 == 's') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        float f35 = f21 - f17;
                                        f11 = f22 - f18;
                                        f12 = f35;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i33 = i10 + 0;
                                    int i34 = i10 + 1;
                                    int i35 = i10 + 2;
                                    int i36 = i10 + 3;
                                    path.rCubicTo(f12, f11, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f7 = fArr2[i33] + f21;
                                    f8 = fArr2[i34] + f22;
                                    f21 += fArr2[i35];
                                    f9 = fArr2[i36];
                                } else if (c9 == 't') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f13 = f21 - f17;
                                        f14 = f22 - f18;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i37 = i10 + 0;
                                    int i38 = i10 + 1;
                                    path.rQuadTo(f13, f14, fArr2[i37], fArr2[i38]);
                                    float f36 = f13 + f21;
                                    float f37 = f14 + f22;
                                    f21 += fArr2[i37];
                                    f22 += fArr2[i38];
                                    f18 = f37;
                                    f17 = f36;
                                }
                                f22 += f10;
                            } else {
                                int i39 = i10 + 0;
                                int i40 = i10 + 1;
                                int i41 = i10 + 2;
                                int i42 = i10 + 3;
                                path.rQuadTo(fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                f7 = fArr2[i39] + f21;
                                f8 = fArr2[i40] + f22;
                                f21 += fArr2[i41];
                                f9 = fArr2[i42];
                            }
                            i9 = i10;
                        } else {
                            int i43 = i10 + 2;
                            int i44 = i10 + 3;
                            int i45 = i10 + 4;
                            int i46 = i10 + 5;
                            path.rCubicTo(fArr2[i10 + 0], fArr2[i10 + 1], fArr2[i43], fArr2[i44], fArr2[i45], fArr2[i46]);
                            f7 = fArr2[i43] + f21;
                            f8 = fArr2[i44] + f22;
                            f21 += fArr2[i45];
                            f9 = fArr2[i46];
                        }
                        f22 += f9;
                        f17 = f7;
                        f18 = f8;
                        i9 = i10;
                    } else {
                        int i47 = i10 + 5;
                        int i48 = i10 + 6;
                        i9 = i10;
                        c(path, f21, f22, fArr2[i47] + f21, fArr2[i48] + f22, fArr2[i10 + 0], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                        f21 += fArr2[i47];
                        f22 += fArr2[i48];
                    }
                    i10 = i9 + i8;
                    c11 = c8;
                    c9 = c11;
                    c10 = 0;
                } else {
                    i9 = i10;
                    int i49 = i9 + 5;
                    int i50 = i9 + 6;
                    c(path, f21, f22, fArr2[i49], fArr2[i50], fArr2[i9 + 0], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f, fArr2[i9 + 4] != 0.0f);
                    f21 = fArr2[i49];
                    f22 = fArr2[i50];
                }
                f18 = f22;
                f17 = f21;
                i10 = i9 + i8;
                c11 = c8;
                c9 = c11;
                c10 = 0;
            }
            fArr[c10] = f21;
            fArr[1] = f22;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f23;
            fArr[5] = f24;
        }

        public static void b(Path path, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
            double d16 = d9;
            int ceil = (int) Math.ceil(Math.abs((d15 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d13);
            double sin = Math.sin(d13);
            double cos2 = Math.cos(d14);
            double sin2 = Math.sin(d14);
            double d17 = -d16;
            double d18 = d17 * cos;
            double d19 = d10 * sin;
            double d20 = (d18 * sin2) - (d19 * cos2);
            double d21 = d17 * sin;
            double d22 = d10 * cos;
            double d23 = (sin2 * d21) + (cos2 * d22);
            double d24 = d15 / ceil;
            double d25 = d23;
            double d26 = d20;
            int i7 = 0;
            double d27 = d11;
            double d28 = d12;
            double d29 = d14;
            while (i7 < ceil) {
                double d30 = d29 + d24;
                double sin3 = Math.sin(d30);
                double cos3 = Math.cos(d30);
                double d31 = (d7 + ((d16 * cos) * cos3)) - (d19 * sin3);
                double d32 = d8 + (d16 * sin * cos3) + (d22 * sin3);
                double d33 = (d18 * sin3) - (d19 * cos3);
                double d34 = (sin3 * d21) + (cos3 * d22);
                double d35 = d30 - d29;
                double tan = Math.tan(d35 / 2.0d);
                double sin4 = (Math.sin(d35) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d36 = d27 + (d26 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d36, (float) (d28 + (d25 * sin4)), (float) (d31 - (sin4 * d33)), (float) (d32 - (sin4 * d34)), (float) d31, (float) d32);
                i7++;
                d24 = d24;
                sin = sin;
                d27 = d31;
                d21 = d21;
                cos = cos;
                d29 = d30;
                d25 = d34;
                d26 = d33;
                ceil = ceil;
                d28 = d32;
                d16 = d9;
            }
        }

        public static void c(Path path, float f7, float f8, float f9, float f10, float f11, float f12, float f13, boolean z6, boolean z7) {
            double d7;
            double d8;
            double radians = Math.toRadians(f13);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d9 = f7;
            double d10 = d9 * cos;
            double d11 = f8;
            double d12 = f11;
            double d13 = (d10 + (d11 * sin)) / d12;
            double d14 = ((-f7) * sin) + (d11 * cos);
            double d15 = f12;
            double d16 = d14 / d15;
            double d17 = f10;
            double d18 = ((f9 * cos) + (d17 * sin)) / d12;
            double d19 = (((-f9) * sin) + (d17 * cos)) / d15;
            double d20 = d13 - d18;
            double d21 = d16 - d19;
            double d22 = (d13 + d18) / 2.0d;
            double d23 = (d16 + d19) / 2.0d;
            double d24 = (d20 * d20) + (d21 * d21);
            if (d24 == androidx.cardview.widget.g.f1896q) {
                Log.w(a1.f14480a, " Points are coincident");
                return;
            }
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < androidx.cardview.widget.g.f1896q) {
                Log.w(a1.f14480a, "Points are too far apart " + d24);
                float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
                c(path, f7, f8, f9, f10, f11 * sqrt, f12 * sqrt, f13, z6, z7);
                return;
            }
            double sqrt2 = Math.sqrt(d25);
            double d26 = d20 * sqrt2;
            double d27 = sqrt2 * d21;
            if (z6 == z7) {
                d7 = d22 - d27;
                d8 = d23 + d26;
            } else {
                d7 = d22 + d27;
                d8 = d23 - d26;
            }
            double atan2 = Math.atan2(d16 - d8, d13 - d7);
            double atan22 = Math.atan2(d19 - d8, d18 - d7) - atan2;
            int i7 = (atan22 > androidx.cardview.widget.g.f1896q ? 1 : (atan22 == androidx.cardview.widget.g.f1896q ? 0 : -1));
            if (z7 != (i7 >= 0)) {
                atan22 = i7 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d28 = d7 * d12;
            double d29 = d8 * d15;
            b(path, (d28 * cos) - (d29 * sin), (d28 * sin) + (d29 * cos), d12, d15, d9, d11, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c7 = 'm';
            for (int i7 = 0; i7 < bVarArr.length; i7++) {
                b bVar = bVarArr[i7];
                a(path, fArr, c7, bVar.f14483a, bVar.f14484b);
                c7 = bVarArr[i7].f14483a;
            }
        }

        public void d(b bVar, b bVar2, float f7) {
            this.f14483a = bVar.f14483a;
            int i7 = 0;
            while (true) {
                float[] fArr = bVar.f14484b;
                if (i7 >= fArr.length) {
                    return;
                }
                this.f14484b[i7] = (fArr[i7] * (1.0f - f7)) + (bVar2.f14484b[i7] * f7);
                i7++;
            }
        }

        public b(b bVar) {
            this.f14483a = bVar.f14483a;
            float[] fArr = bVar.f14484b;
            this.f14484b = a1.c(fArr, 0, fArr.length);
        }
    }
}
