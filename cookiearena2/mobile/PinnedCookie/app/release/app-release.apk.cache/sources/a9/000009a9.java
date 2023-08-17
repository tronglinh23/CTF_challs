package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float leftShiftRange;
    private final List<KeylineState> leftStateSteps;
    private final float[] leftStateStepsInterpolationPoints;
    private final float rightShiftRange;
    private final List<KeylineState> rightStateSteps;
    private final float[] rightStateStepsInterpolationPoints;

    private KeylineStateList(KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.leftStateSteps = Collections.unmodifiableList(list);
        this.rightStateSteps = Collections.unmodifiableList(list2);
        float f7 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.leftShiftRange = f7;
        float f8 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.rightShiftRange = f8;
        this.leftStateStepsInterpolationPoints = getStateStepInterpolationPoints(f7, list, true);
        this.rightStateStepsInterpolationPoints = getStateStepInterpolationPoints(f8, list2, false);
    }

    private static int findFirstInBoundsKeylineIndex(KeylineState keylineState) {
        for (int i7 = 0; i7 < keylineState.getKeylines().size(); i7++) {
            if (keylineState.getKeylines().get(i7).locOffset >= 0.0f) {
                return i7;
            }
        }
        return -1;
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f7) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f7 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findLastInBoundsKeylineIndex(Carousel carousel, KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (keylineState.getKeylines().get(size).locOffset <= carousel.getContainerWidth()) {
                return size;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f7) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f7 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState) {
        return new KeylineStateList(keylineState, getStateStepsLeft(keylineState), getStateStepsRight(carousel, keylineState));
    }

    private static float[] getStateStepInterpolationPoints(float f7, List<KeylineState> list, boolean z6) {
        int size = list.size();
        float[] fArr = new float[size];
        int i7 = 1;
        while (i7 < size) {
            int i8 = i7 - 1;
            KeylineState keylineState = list.get(i8);
            KeylineState keylineState2 = list.get(i7);
            fArr[i7] = i7 == size + (-1) ? 1.0f : fArr[i8] + ((z6 ? keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc : keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc) / f7);
            i7++;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsLeft(KeylineState keylineState) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findFirstInBoundsKeylineIndex = findFirstInBoundsKeylineIndex(keylineState);
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && findFirstInBoundsKeylineIndex != -1) {
            int firstFocalKeylineIndex = (keylineState.getFirstFocalKeylineIndex() - 1) - findFirstInBoundsKeylineIndex;
            float f7 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            for (int i7 = 0; i7 <= firstFocalKeylineIndex; i7++) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int size = keylineState.getKeylines().size() - 1;
                int i8 = (findFirstInBoundsKeylineIndex + i7) - 1;
                if (i8 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i8).mask) - 1;
                }
                arrayList.add(moveKeylineAndCreateKeylineState(keylineState2, findFirstInBoundsKeylineIndex, size, f7, (keylineState.getFirstFocalKeylineIndex() - i7) - 1, (keylineState.getLastFocalKeylineIndex() - i7) - 1));
            }
        }
        return arrayList;
    }

    private static List<KeylineState> getStateStepsRight(Carousel carousel, KeylineState keylineState) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findLastInBoundsKeylineIndex = findLastInBoundsKeylineIndex(carousel, keylineState);
        if (!isLastFocalItemAtRightOfContainer(carousel, keylineState) && findLastInBoundsKeylineIndex != -1) {
            int lastFocalKeylineIndex = findLastInBoundsKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f7 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            for (int i7 = 0; i7 < lastFocalKeylineIndex; i7++) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i8 = (findLastInBoundsKeylineIndex - i7) + 1;
                arrayList.add(moveKeylineAndCreateKeylineState(keylineState2, findLastInBoundsKeylineIndex, i8 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i8).mask) + 1 : 0, f7, keylineState.getFirstFocalKeylineIndex() + i7 + 1, keylineState.getLastFocalKeylineIndex() + i7 + 1));
            }
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        return keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) <= 0.0f || keylineState.getFirstFocalKeyline() == keylineState.getFirstKeyline();
    }

    private static boolean isLastFocalItemAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        return keylineState.getLastFocalKeyline().locOffset + (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) >= ((float) carousel.getContainerWidth()) || keylineState.getLastFocalKeyline() == keylineState.getLastKeyline();
    }

    private static KeylineState lerp(List<KeylineState> list, float f7, float[] fArr) {
        int size = list.size();
        float f8 = fArr[0];
        int i7 = 1;
        while (i7 < size) {
            float f9 = fArr[i7];
            if (f7 <= f9) {
                return KeylineState.lerp(list.get(i7 - 1), list.get(i7), AnimationUtils.lerp(0.0f, 1.0f, f8, f9, f7));
            }
            i7++;
            f8 = f9;
        }
        return list.get(0);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i7, int i8, float f7, int i9, int i10) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i8, (KeylineState.Keyline) arrayList.remove(i7));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize());
        int i11 = 0;
        while (i11 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i11);
            float f8 = keyline.maskedItemSize;
            builder.addKeyline((f8 / 2.0f) + f7, keyline.mask, f8, i11 >= i9 && i11 <= i10);
            f7 += keyline.maskedItemSize;
            i11++;
        }
        return builder.build();
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getLeftState() {
        return this.leftStateSteps.get(r0.size() - 1);
    }

    public KeylineState getRightState() {
        return this.rightStateSteps.get(r0.size() - 1);
    }

    public KeylineState getShiftedState(float f7, float f8, float f9) {
        float f10 = this.leftShiftRange + f8;
        float f11 = f9 - this.rightShiftRange;
        if (f7 < f10) {
            return lerp(this.leftStateSteps, AnimationUtils.lerp(1.0f, 0.0f, f8, f10, f7), this.leftStateStepsInterpolationPoints);
        } else if (f7 > f11) {
            return lerp(this.rightStateSteps, AnimationUtils.lerp(0.0f, 1.0f, f11, f9, f7), this.rightStateStepsInterpolationPoints);
        } else {
            return this.defaultState;
        }
    }
}