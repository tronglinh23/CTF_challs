package com.google.android.material.color.utilities;

import d.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i7, int i8) {
            this.resultCount = i8;
        }
    }

    /* loaded from: classes.dex */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* loaded from: classes.dex */
    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i7, double d7) {
            this.cutLocation = i7;
            this.maximum = d7;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i7;
        int i8;
        int i9 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i9 == 1) {
            i7 = (-iArr[getIndex(box.f8035r0, box.f8034g1, box.f8032b1)]) + iArr[getIndex(box.f8035r0, box.f8034g1, box.f8031b0)] + iArr[getIndex(box.f8035r0, box.f8033g0, box.f8032b1)];
            i8 = iArr[getIndex(box.f8035r0, box.f8033g0, box.f8031b0)];
        } else if (i9 == 2) {
            i7 = (-iArr[getIndex(box.f8036r1, box.f8033g0, box.f8032b1)]) + iArr[getIndex(box.f8036r1, box.f8033g0, box.f8031b0)] + iArr[getIndex(box.f8035r0, box.f8033g0, box.f8032b1)];
            i8 = iArr[getIndex(box.f8035r0, box.f8033g0, box.f8031b0)];
        } else if (i9 != 3) {
            throw new IllegalArgumentException("unexpected direction " + direction);
        } else {
            i7 = (-iArr[getIndex(box.f8036r1, box.f8034g1, box.f8031b0)]) + iArr[getIndex(box.f8036r1, box.f8033g0, box.f8031b0)] + iArr[getIndex(box.f8035r0, box.f8034g1, box.f8031b0)];
            i8 = iArr[getIndex(box.f8035r0, box.f8033g0, box.f8031b0)];
        }
        return i7 - i8;
    }

    public static int getIndex(int i7, int i8, int i9) {
        return (i7 << 10) + (i7 << 6) + i7 + (i8 << 5) + i8 + i9;
    }

    public static int top(Box box, Direction direction, int i7, int[] iArr) {
        int i8;
        int i9;
        int i10 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i10 == 1) {
            i8 = (iArr[getIndex(i7, box.f8034g1, box.f8032b1)] - iArr[getIndex(i7, box.f8034g1, box.f8031b0)]) - iArr[getIndex(i7, box.f8033g0, box.f8032b1)];
            i9 = iArr[getIndex(i7, box.f8033g0, box.f8031b0)];
        } else if (i10 == 2) {
            i8 = (iArr[getIndex(box.f8036r1, i7, box.f8032b1)] - iArr[getIndex(box.f8036r1, i7, box.f8031b0)]) - iArr[getIndex(box.f8035r0, i7, box.f8032b1)];
            i9 = iArr[getIndex(box.f8035r0, i7, box.f8031b0)];
        } else if (i10 != 3) {
            throw new IllegalArgumentException("unexpected direction " + direction);
        } else {
            i8 = (iArr[getIndex(box.f8036r1, box.f8034g1, i7)] - iArr[getIndex(box.f8036r1, box.f8033g0, i7)]) - iArr[getIndex(box.f8035r0, box.f8034g1, i7)];
            i9 = iArr[getIndex(box.f8035r0, box.f8033g0, i7)];
        }
        return i8 + i9;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f8036r1, box.f8034g1, box.f8032b1)] - iArr[getIndex(box.f8036r1, box.f8034g1, box.f8031b0)]) - iArr[getIndex(box.f8036r1, box.f8033g0, box.f8032b1)]) + iArr[getIndex(box.f8036r1, box.f8033g0, box.f8031b0)]) - iArr[getIndex(box.f8035r0, box.f8034g1, box.f8032b1)]) + iArr[getIndex(box.f8035r0, box.f8034g1, box.f8031b0)]) + iArr[getIndex(box.f8035r0, box.f8033g0, box.f8032b1)]) - iArr[getIndex(box.f8035r0, box.f8033g0, box.f8031b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int redFromArgb = ColorUtils.redFromArgb(intValue);
            int greenFromArgb = ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = ColorUtils.blueFromArgb(intValue);
            int index = getIndex((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + intValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (redFromArgb * intValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (greenFromArgb * intValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (blueFromArgb * intValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + (intValue2 * ((redFromArgb * redFromArgb) + (greenFromArgb * greenFromArgb) + (blueFromArgb * blueFromArgb)));
        }
    }

    public CreateBoxesResult createBoxes(int i7) {
        int i8;
        this.cubes = new Box[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            this.cubes[i9] = new Box(null);
        }
        double[] dArr = new double[i7];
        Box box = this.cubes[0];
        box.f8036r1 = 32;
        box.f8034g1 = 32;
        box.f8032b1 = 32;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            if (i11 >= i7) {
                i8 = i7;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i10], boxArr[i11]).booleanValue()) {
                Box box2 = this.cubes[i10];
                dArr[i10] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i11];
                dArr[i11] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i10] = 0.0d;
                i11--;
            }
            double d7 = dArr[0];
            int i12 = 0;
            for (int i13 = 1; i13 <= i11; i13++) {
                double d8 = dArr[i13];
                if (d8 > d7) {
                    i12 = i13;
                    d7 = d8;
                }
            }
            if (d7 <= androidx.cardview.widget.g.f1896q) {
                i8 = i11 + 1;
                break;
            }
            i11++;
            i10 = i12;
        }
        return new CreateBoxesResult(i7, i8);
    }

    public void createMoments() {
        int i7 = 1;
        while (true) {
            int i8 = 33;
            if (i7 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i9 = 1;
            while (i9 < i8) {
                int i10 = 0;
                int i11 = 0;
                double d7 = 0.0d;
                int i12 = 1;
                int i13 = 0;
                int i14 = 0;
                while (i12 < i8) {
                    int index = getIndex(i7, i9, i12);
                    int i15 = i10 + this.weights[index];
                    i13 += this.momentsR[index];
                    i14 += this.momentsG[index];
                    i11 += this.momentsB[index];
                    d7 += this.moments[index];
                    iArr[i12] = iArr[i12] + i15;
                    iArr2[i12] = iArr2[i12] + i13;
                    iArr3[i12] = iArr3[i12] + i14;
                    iArr4[i12] = iArr4[i12] + i11;
                    dArr[i12] = dArr[i12] + d7;
                    int index2 = getIndex(i7 - 1, i9, i12);
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i12];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i12];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i12];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i12];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i12];
                    i12++;
                    i10 = i15;
                    i8 = 33;
                }
                i9++;
                i8 = 33;
            }
            i7++;
        }
    }

    public List<Integer> createResult(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < i7; i8++) {
            Box box = this.cubes[i8];
            int volume = volume(box, this.weights);
            if (volume > 0) {
                int volume2 = volume(box, this.momentsR) / volume;
                int volume3 = volume(box, this.momentsG) / volume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / volume) & 255) | ((volume2 & 255) << 16) | androidx.core.view.u1.f3816t | ((volume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int volume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximize = maximize(box, direction, box.f8035r0 + 1, box.f8036r1, volume, volume2, volume3, volume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximize2 = maximize(box, direction2, box.f8033g0 + 1, box.f8034g1, volume, volume2, volume3, volume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximize3 = maximize(box, direction3, box.f8031b0 + 1, box.f8032b1, volume, volume2, volume3, volume4);
        double d7 = maximize.maximum;
        double d8 = maximize2.maximum;
        double d9 = maximize3.maximum;
        if (d7 < d8 || d7 < d9) {
            direction = (d8 < d7 || d8 < d9) ? direction3 : direction2;
        } else if (maximize.cutLocation < 0) {
            return Boolean.FALSE;
        }
        box2.f8036r1 = box.f8036r1;
        box2.f8034g1 = box.f8034g1;
        box2.f8032b1 = box.f8032b1;
        int i7 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i7 == 1) {
            int i8 = maximize.cutLocation;
            box.f8036r1 = i8;
            box2.f8035r0 = i8;
            box2.f8033g0 = box.f8033g0;
            box2.f8031b0 = box.f8031b0;
        } else if (i7 == 2) {
            int i9 = maximize2.cutLocation;
            box.f8034g1 = i9;
            box2.f8035r0 = box.f8035r0;
            box2.f8033g0 = i9;
            box2.f8031b0 = box.f8031b0;
        } else if (i7 == 3) {
            int i10 = maximize3.cutLocation;
            box.f8032b1 = i10;
            box2.f8035r0 = box.f8035r0;
            box2.f8033g0 = box.f8033g0;
            box2.f8031b0 = i10;
        }
        box.vol = (box.f8036r1 - box.f8035r0) * (box.f8034g1 - box.f8033g0) * (box.f8032b1 - box.f8031b0);
        box2.vol = (box2.f8036r1 - box2.f8035r0) * (box2.f8034g1 - box2.f8033g0) * (box2.f8032b1 - box2.f8031b0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13;
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        Direction direction2 = direction;
        int bottom = bottom(box2, direction2, quantizerWu.momentsR);
        int bottom2 = bottom(box2, direction2, quantizerWu.momentsG);
        int bottom3 = bottom(box2, direction2, quantizerWu.momentsB);
        int bottom4 = bottom(box2, direction2, quantizerWu.weights);
        int i14 = -1;
        double d7 = 0.0d;
        int i15 = i7;
        while (i15 < i8) {
            int pVar = top(box2, direction2, i15, quantizerWu.momentsR) + bottom;
            int pVar2 = top(box2, direction2, i15, quantizerWu.momentsG) + bottom2;
            int pVar3 = top(box2, direction2, i15, quantizerWu.momentsB) + bottom3;
            int pVar4 = top(box2, direction2, i15, quantizerWu.weights) + bottom4;
            if (pVar4 == 0) {
                i13 = bottom;
            } else {
                i13 = bottom;
                double d8 = (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3)) / pVar4;
                int i16 = i9 - pVar;
                int i17 = i10 - pVar2;
                int i18 = i11 - pVar3;
                int i19 = i12 - pVar4;
                if (i19 != 0) {
                    double d9 = d8 + ((((i16 * i16) + (i17 * i17)) + (i18 * i18)) / i19);
                    if (d9 > d7) {
                        d7 = d9;
                        i14 = i15;
                    }
                }
            }
            i15++;
            quantizerWu = this;
            box2 = box;
            direction2 = direction;
            bottom = i13;
        }
        return new MaximizeResult(i14, d7);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i7) {
        constructHistogram(new QuantizerMap().quantize(iArr, i7).colorToCount);
        createMoments();
        List<Integer> createResult = createResult(createBoxes(i7).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = createResult.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        return (((((((this.moments[getIndex(box.f8036r1, box.f8034g1, box.f8032b1)] - this.moments[getIndex(box.f8036r1, box.f8034g1, box.f8031b0)]) - this.moments[getIndex(box.f8036r1, box.f8033g0, box.f8032b1)]) + this.moments[getIndex(box.f8036r1, box.f8033g0, box.f8031b0)]) - this.moments[getIndex(box.f8035r0, box.f8034g1, box.f8032b1)]) + this.moments[getIndex(box.f8035r0, box.f8034g1, box.f8031b0)]) + this.moments[getIndex(box.f8035r0, box.f8033g0, box.f8032b1)]) - this.moments[getIndex(box.f8035r0, box.f8033g0, box.f8031b0)]) - ((((volume * volume) + (volume2 * volume2)) + (volume3 * volume3)) / volume(box, this.weights));
    }

    /* loaded from: classes.dex */
    public static final class Box {

        /* renamed from: b0  reason: collision with root package name */
        int f8031b0;

        /* renamed from: b1  reason: collision with root package name */
        int f8032b1;

        /* renamed from: g0  reason: collision with root package name */
        int f8033g0;

        /* renamed from: g1  reason: collision with root package name */
        int f8034g1;

        /* renamed from: r0  reason: collision with root package name */
        int f8035r0;

        /* renamed from: r1  reason: collision with root package name */
        int f8036r1;
        int vol;

        private Box() {
            this.f8035r0 = 0;
            this.f8036r1 = 0;
            this.f8033g0 = 0;
            this.f8034g1 = 0;
            this.f8031b0 = 0;
            this.f8032b1 = 0;
            this.vol = 0;
        }

        public /* synthetic */ Box(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
