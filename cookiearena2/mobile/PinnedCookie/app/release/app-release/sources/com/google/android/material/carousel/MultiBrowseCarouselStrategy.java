package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;
import d.b1;
import d.l1;
import d.o0;
/* loaded from: classes.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    private final boolean forceCompactArrangement;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};
    private static final int[] MEDIUM_COUNTS_COMPACT = {0};

    @l1
    /* loaded from: classes.dex */
    public static final class Arrangement {
        final float cost;
        final int largeCount;
        float largeSize;
        final int mediumCount;
        float mediumSize;
        final int priority;
        final int smallCount;
        float smallSize;

        public Arrangement(int i7, float f7, float f8, float f9, int i8, float f10, int i9, float f11, int i10, float f12) {
            this.priority = i7;
            this.smallSize = x0.a.d(f7, f8, f9);
            this.smallCount = i8;
            this.mediumSize = f10;
            this.mediumCount = i9;
            this.largeSize = f11;
            this.largeCount = i10;
            fit(f12, f8, f9, f11);
            this.cost = cost(f11);
        }

        private float calculateLargeSize(float f7, int i7, float f8, int i8, int i9) {
            if (i7 <= 0) {
                f8 = 0.0f;
            }
            float f9 = i8 / 2.0f;
            return (f7 - ((i7 + f9) * f8)) / (i9 + f9);
        }

        private float cost(float f7) {
            if (isValid()) {
                return Math.abs(f7 - this.largeSize) * this.priority;
            }
            return Float.MAX_VALUE;
        }

        private void fit(float f7, float f8, float f9, float f10) {
            float space = f7 - getSpace();
            int i7 = this.smallCount;
            if (i7 > 0 && space > 0.0f) {
                float f11 = this.smallSize;
                this.smallSize = f11 + Math.min(space / i7, f9 - f11);
            } else if (i7 > 0 && space < 0.0f) {
                float f12 = this.smallSize;
                this.smallSize = f12 + Math.max(space / i7, f8 - f12);
            }
            float calculateLargeSize = calculateLargeSize(f7, this.smallCount, this.smallSize, this.mediumCount, this.largeCount);
            this.largeSize = calculateLargeSize;
            float f13 = (this.smallSize + calculateLargeSize) / 2.0f;
            this.mediumSize = f13;
            int i8 = this.mediumCount;
            if (i8 <= 0 || calculateLargeSize == f10) {
                return;
            }
            float f14 = (f10 - calculateLargeSize) * this.largeCount;
            float min = Math.min(Math.abs(f14), f13 * 0.1f * i8);
            if (f14 > 0.0f) {
                this.mediumSize -= min / this.mediumCount;
                this.largeSize += min / this.largeCount;
                return;
            }
            this.mediumSize += min / this.mediumCount;
            this.largeSize -= min / this.largeCount;
        }

        private float getSpace() {
            return (this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount) + (this.smallSize * this.smallCount);
        }

        private boolean isValid() {
            int i7 = this.largeCount;
            if (i7 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
                return i7 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
            }
            float f7 = this.largeSize;
            float f8 = this.mediumSize;
            return f7 > f8 && f8 > this.smallSize;
        }

        @o0
        public String toString() {
            return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
        }
    }

    public MultiBrowseCarouselStrategy() {
        this(false);
    }

    private static Arrangement findLowestCostArrangement(float f7, float f8, float f9, float f10, int[] iArr, float f11, int[] iArr2, float f12, int[] iArr3) {
        Arrangement arrangement = null;
        int i7 = 1;
        for (int i8 : iArr3) {
            int length = iArr2.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = iArr2[i9];
                int length2 = iArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    int i12 = i11;
                    int i13 = length2;
                    int i14 = i9;
                    int i15 = length;
                    Arrangement arrangement2 = new Arrangement(i7, f8, f9, f10, iArr[i11], f11, i10, f12, i8, f7);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    i7++;
                    i11 = i12 + 1;
                    length2 = i13;
                    i9 = i14;
                    length = i15;
                }
                i9++;
            }
        }
        return arrangement;
    }

    private float getExtraSmallSize(@o0 Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    private float getSmallSizeMax(@o0 Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    private float getSmallSizeMin(@o0 Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    private static int maxValue(int[] iArr) {
        int i7 = Integer.MIN_VALUE;
        for (int i8 : iArr) {
            if (i8 > i7) {
                i7 = i8;
            }
        }
        return i7;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @o0
    public KeylineState onFirstChildMeasuredWithMargins(@o0 Carousel carousel, @o0 View view) {
        float containerWidth = carousel.getContainerWidth();
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        float f7 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        float smallSizeMin = getSmallSizeMin(view.getContext()) + f7;
        float smallSizeMax = getSmallSizeMax(view.getContext()) + f7;
        float measuredWidth = view.getMeasuredWidth();
        float min = Math.min(measuredWidth + f7, containerWidth);
        float d7 = x0.a.d((measuredWidth / 3.0f) + f7, getSmallSizeMin(view.getContext()) + f7, getSmallSizeMax(view.getContext()) + f7);
        float f8 = (min + d7) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        int[] iArr2 = this.forceCompactArrangement ? MEDIUM_COUNTS_COMPACT : MEDIUM_COUNTS;
        int max = (int) Math.max(1.0d, Math.floor(((containerWidth - (maxValue(iArr2) * f8)) - (maxValue(iArr) * smallSizeMax)) / min));
        int ceil = (int) Math.ceil(containerWidth / min);
        int i7 = (ceil - max) + 1;
        int[] iArr3 = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr3[i8] = ceil - i8;
        }
        Arrangement findLowestCostArrangement = findLowestCostArrangement(containerWidth, d7, smallSizeMin, smallSizeMax, iArr, f8, iArr2, min, iArr3);
        float extraSmallSize = getExtraSmallSize(view.getContext()) + f7;
        float f9 = extraSmallSize / 2.0f;
        float f10 = 0.0f - f9;
        float f11 = (findLowestCostArrangement.largeSize / 2.0f) + 0.0f;
        float max2 = Math.max(0, findLowestCostArrangement.largeCount - 1);
        float f12 = findLowestCostArrangement.largeSize;
        float f13 = f11 + (max2 * f12);
        float f14 = (f12 / 2.0f) + f13;
        int i9 = findLowestCostArrangement.mediumCount;
        if (i9 > 0) {
            f13 = (findLowestCostArrangement.mediumSize / 2.0f) + f14;
        }
        if (i9 > 0) {
            f14 = (findLowestCostArrangement.mediumSize / 2.0f) + f13;
        }
        float f15 = findLowestCostArrangement.smallCount > 0 ? f14 + (findLowestCostArrangement.smallSize / 2.0f) : f13;
        float containerWidth2 = carousel.getContainerWidth() + f9;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(extraSmallSize, findLowestCostArrangement.largeSize, f7);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(findLowestCostArrangement.smallSize, findLowestCostArrangement.largeSize, f7);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(findLowestCostArrangement.mediumSize, findLowestCostArrangement.largeSize, f7);
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(findLowestCostArrangement.largeSize).addKeyline(f10, childMaskPercentage, extraSmallSize).addKeylineRange(f11, 0.0f, findLowestCostArrangement.largeSize, findLowestCostArrangement.largeCount, true);
        if (findLowestCostArrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(f13, childMaskPercentage3, findLowestCostArrangement.mediumSize);
        }
        int i10 = findLowestCostArrangement.smallCount;
        if (i10 > 0) {
            addKeylineRange.addKeylineRange(f15, childMaskPercentage2, findLowestCostArrangement.smallSize, i10);
        }
        addKeylineRange.addKeyline(containerWidth2, childMaskPercentage, extraSmallSize);
        return addKeylineRange.build();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public MultiBrowseCarouselStrategy(boolean z6) {
        this.forceCompactArrangement = z6;
    }
}
