package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.o0;
import d.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    /* loaded from: classes.dex */
    public static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;

        public Builder(float f7) {
            this.itemSize = f7;
        }

        private static float calculateKeylineLocationForItemPosition(float f7, float f8, int i7, int i8) {
            return (f7 - (i7 * f8)) + (i8 * f8);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder addKeyline(float f7, @x(from = 0.0d, to = 1.0d) float f8, float f9) {
            return addKeyline(f7, f8, f9, false);
        }

        @CanIgnoreReturnValue
        @o0
        public Builder addKeylineRange(float f7, @x(from = 0.0d, to = 1.0d) float f8, float f9, int i7) {
            return addKeylineRange(f7, f8, f9, i7, false);
        }

        @o0
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.tmpKeylines.size(); i7++) {
                    Keyline keyline = this.tmpKeylines.get(i7);
                    arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i7), keyline.locOffset, keyline.mask, keyline.maskedItemSize));
                }
                return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }

        @CanIgnoreReturnValue
        @o0
        public Builder addKeyline(float f7, @x(from = 0.0d, to = 1.0d) float f8, float f9, boolean z6) {
            if (f9 <= 0.0f) {
                return this;
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f7, f8, f9);
            if (z6) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f9 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Builder addKeylineRange(float f7, @x(from = 0.0d, to = 1.0d) float f8, float f9, int i7, boolean z6) {
            if (i7 > 0 && f9 > 0.0f) {
                for (int i8 = 0; i8 < i7; i8++) {
                    addKeyline((i8 * f9) + f7, f8, f9, z6);
                }
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class Keyline {
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;

        public Keyline(float f7, float f8, float f9, float f10) {
            this.loc = f7;
            this.locOffset = f8;
            this.mask = f9;
            this.maskedItemSize = f10;
        }

        public static Keyline lerp(Keyline keyline, Keyline keyline2, @x(from = 0.0d, to = 1.0d) float f7) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f7), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f7), AnimationUtils.lerp(keyline.mask, keyline2.mask, f7), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f7));
        }
    }

    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f7) {
        if (keylineState.getItemSize() == keylineState2.getItemSize()) {
            List<Keyline> keylines = keylineState.getKeylines();
            List<Keyline> keylines2 = keylineState2.getKeylines();
            if (keylines.size() == keylines2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < keylineState.getKeylines().size(); i7++) {
                    arrayList.add(Keyline.lerp(keylines.get(i7), keylines2.get(i7), f7));
                }
                return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f7), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f7));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    public static KeylineState reverse(KeylineState keylineState) {
        Builder builder = new Builder(keylineState.getItemSize());
        float f7 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f7, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex());
            f7 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public Keyline getLastKeyline() {
        return this.keylines.get(r0.size() - 1);
    }

    private KeylineState(float f7, List<Keyline> list, int i7, int i8) {
        this.itemSize = f7;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i7;
        this.lastFocalKeylineIndex = i8;
    }
}