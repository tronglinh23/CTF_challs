package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import d.b1;
import d.o0;
import d.q0;
import g1.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.p0;
/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.o implements Carousel {
    private static final String TAG = "CarouselLayoutManager";
    @o0
    private CarouselStrategy carouselStrategy;
    @q0
    private KeylineState currentKeylineState;
    private int horizontalScrollOffset;
    @q0
    private KeylineStateList keylineStateList;
    private int maxHorizontalScroll;
    private int minHorizontalScroll;
    private boolean isDebuggingEnabled = false;
    private final DebugItemDecoration debugItemDecoration = new DebugItemDecoration();
    private int currentFillStartPosition = 0;

    /* loaded from: classes.dex */
    public static final class ChildCalculations {
        View child;
        float locOffset;
        KeylineRange range;

        public ChildCalculations(View view, float f7, KeylineRange keylineRange) {
            this.child = view;
            this.locOffset = f7;
            this.range = keylineRange;
        }
    }

    /* loaded from: classes.dex */
    public static class DebugItemDecoration extends RecyclerView.n {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.c0 c0Var) {
            super.onDrawOver(canvas, recyclerView, c0Var);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(p0.i(-65281, -16776961, keyline.mask));
                canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
            }
        }

        public void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }
    }

    /* loaded from: classes.dex */
    public static class KeylineRange {
        final KeylineState.Keyline left;
        final KeylineState.Keyline right;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            s.a(keyline.loc <= keyline2.loc);
            this.left = keyline;
            this.right = keyline2;
        }
    }

    public CarouselLayoutManager() {
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i7, float f7) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i7);
        layoutDecoratedWithMargins(view, (int) (f7 - itemSize), getParentTop(), (int) (f7 + itemSize), getParentBottom());
    }

    private int addEnd(int i7, int i8) {
        return isLayoutRtl() ? i7 - i8 : i7 + i8;
    }

    private int addStart(int i7, int i8) {
        return isLayoutRtl() ? i7 + i8 : i7 - i8;
    }

    private void addViewsEnd(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i7) {
        int calculateChildStartForFill = calculateChildStartForFill(i7);
        while (i7 < c0Var.d()) {
            ChildCalculations makeChildCalculations = makeChildCalculations(wVar, calculateChildStartForFill, i7);
            if (isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                return;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                addAndLayoutView(makeChildCalculations.child, -1, makeChildCalculations.locOffset);
            }
            i7++;
        }
    }

    private void addViewsStart(RecyclerView.w wVar, int i7) {
        int calculateChildStartForFill = calculateChildStartForFill(i7);
        while (i7 >= 0) {
            ChildCalculations makeChildCalculations = makeChildCalculations(wVar, calculateChildStartForFill, i7);
            if (isLocOffsetOutOfFillBoundsStart(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                return;
            }
            calculateChildStartForFill = addStart(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.locOffset, makeChildCalculations.range)) {
                addAndLayoutView(makeChildCalculations.child, 0, makeChildCalculations.locOffset);
            }
            i7--;
        }
    }

    private float calculateChildOffsetCenterForLocation(View view, float f7, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.left;
        float f8 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.right;
        float lerp = AnimationUtils.lerp(f8, keyline2.locOffset, keyline.loc, keyline2.loc, f7);
        if (keylineRange.right == this.currentKeylineState.getFirstKeyline() || keylineRange.left == this.currentKeylineState.getLastKeyline()) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            float itemSize = (((ViewGroup.MarginLayoutParams) pVar).rightMargin + ((ViewGroup.MarginLayoutParams) pVar).leftMargin) / this.currentKeylineState.getItemSize();
            KeylineState.Keyline keyline3 = keylineRange.right;
            return lerp + ((f7 - keyline3.loc) * ((1.0f - keyline3.mask) + itemSize));
        }
        return lerp;
    }

    private int calculateChildStartForFill(int i7) {
        return addEnd(getParentStart() - this.horizontalScrollOffset, (int) (this.currentKeylineState.getItemSize() * i7));
    }

    private int calculateEndHorizontalScroll(RecyclerView.c0 c0Var, KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        KeylineState leftState = isLayoutRtl ? keylineStateList.getLeftState() : keylineStateList.getRightState();
        KeylineState.Keyline firstFocalKeyline = isLayoutRtl ? leftState.getFirstFocalKeyline() : leftState.getLastFocalKeyline();
        float d7 = ((((float) (c0Var.d() - 1)) * leftState.getItemSize()) + getPaddingEnd()) * (isLayoutRtl ? -1.0f : 1.0f);
        float parentStart = firstFocalKeyline.loc - getParentStart();
        float parentEnd = getParentEnd() - firstFocalKeyline.loc;
        if (Math.abs(parentStart) > Math.abs(d7)) {
            return 0;
        }
        return (int) ((d7 - parentStart) + parentEnd);
    }

    private static int calculateShouldHorizontallyScrollBy(int i7, int i8, int i9, int i10) {
        int i11 = i8 + i7;
        return i11 < i9 ? i9 - i8 : i11 > i10 ? i10 - i8 : i7;
    }

    private int calculateStartHorizontalScroll(KeylineStateList keylineStateList) {
        boolean isLayoutRtl = isLayoutRtl();
        KeylineState rightState = isLayoutRtl ? keylineStateList.getRightState() : keylineStateList.getLeftState();
        return (int) (((getPaddingStart() * (isLayoutRtl ? 1 : -1)) + getParentStart()) - addStart((int) (isLayoutRtl ? rightState.getLastFocalKeyline() : rightState.getFirstFocalKeyline()).loc, (int) (rightState.getItemSize() / 2.0f)));
    }

    private void fill(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        removeAndRecycleOutOfBoundsViews(wVar);
        if (getChildCount() == 0) {
            addViewsStart(wVar, this.currentFillStartPosition - 1);
            addViewsEnd(wVar, c0Var, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(wVar, position - 1);
            addViewsEnd(wVar, c0Var, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private float getDecoratedCenterXWithMargins(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return r0.centerX();
    }

    private float getMaskedItemSizeForLocOffset(float f7, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.left;
        float f8 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.right;
        return AnimationUtils.lerp(f8, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return getHeight() - getPaddingBottom();
    }

    private int getParentEnd() {
        if (isLayoutRtl()) {
            return 0;
        }
        return getWidth();
    }

    private int getParentStart() {
        if (isLayoutRtl()) {
            return getWidth();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return getPaddingTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollOffsetForPosition(KeylineState keylineState, int i7) {
        return isLayoutRtl() ? (int) (((getContainerWidth() - keylineState.getLastFocalKeyline().loc) - (i7 * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f)) : (int) (((i7 * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f7, boolean z6) {
        float f8 = Float.MAX_VALUE;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        float f9 = -3.4028235E38f;
        float f10 = Float.MAX_VALUE;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < list.size(); i11++) {
            KeylineState.Keyline keyline = list.get(i11);
            float f12 = z6 ? keyline.locOffset : keyline.loc;
            float abs = Math.abs(f12 - f7);
            if (f12 <= f7 && abs <= f8) {
                i7 = i11;
                f8 = abs;
            }
            if (f12 > f7 && abs <= f10) {
                i9 = i11;
                f10 = abs;
            }
            if (f12 <= f11) {
                i8 = i11;
                f11 = f12;
            }
            if (f12 > f9) {
                i10 = i11;
                f9 = f12;
            }
        }
        if (i7 == -1) {
            i7 = i8;
        }
        if (i9 == -1) {
            i9 = i10;
        }
        return new KeylineRange(list.get(i7), list.get(i9));
    }

    private boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f7, KeylineRange keylineRange) {
        int addStart = addStart((int) f7, (int) (getMaskedItemSizeForLocOffset(f7, keylineRange) / 2.0f));
        if (isLayoutRtl()) {
            if (addStart < 0) {
                return true;
            }
        } else if (addStart > getContainerWidth()) {
            return true;
        }
        return false;
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f7, KeylineRange keylineRange) {
        int addEnd = addEnd((int) f7, (int) (getMaskedItemSizeForLocOffset(f7, keylineRange) / 2.0f));
        if (isLayoutRtl()) {
            if (addEnd > getContainerWidth()) {
                return true;
            }
        } else if (addEnd < 0) {
            return true;
        }
        return false;
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                float decoratedCenterXWithMargins = getDecoratedCenterXWithMargins(childAt);
                StringBuilder sb = new StringBuilder();
                sb.append("item position ");
                sb.append(getPosition(childAt));
                sb.append(", center:");
                sb.append(decoratedCenterXWithMargins);
                sb.append(", child index:");
                sb.append(i7);
            }
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.w wVar, float f7, int i7) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        View p6 = wVar.p(i7);
        measureChildWithMargins(p6, 0, 0);
        float addEnd = addEnd((int) f7, (int) itemSize);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(p6, addEnd, surroundingKeylineRange);
        updateChildMaskForLocation(p6, addEnd, surroundingKeylineRange);
        return new ChildCalculations(p6, calculateChildOffsetCenterForLocation, surroundingKeylineRange);
    }

    private void offsetChildLeftAndRight(View view, float f7, float f8, Rect rect) {
        float addEnd = addEnd((int) f7, (int) f8);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, addEnd, surroundingKeylineRange);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        view.offsetLeftAndRight((int) (calculateChildOffsetCenterForLocation - (rect.left + f8)));
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.w wVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterXWithMargins = getDecoratedCenterXWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterXWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterXWithMargins, true))) {
                break;
            }
            removeAndRecycleView(childAt, wVar);
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterXWithMargins2 = getDecoratedCenterXWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterXWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterXWithMargins2, true))) {
                return;
            }
            removeAndRecycleView(childAt2, wVar);
        }
    }

    private int scrollBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        int calculateShouldHorizontallyScrollBy = calculateShouldHorizontallyScrollBy(i7, this.horizontalScrollOffset, this.minHorizontalScroll, this.maxHorizontalScroll);
        this.horizontalScrollOffset += calculateShouldHorizontallyScrollBy;
        updateCurrentKeylineStateForScrollOffset();
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        int calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            offsetChildLeftAndRight(getChildAt(i8), calculateChildStartForFill, itemSize, rect);
            calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.getItemSize());
        }
        fill(wVar, c0Var);
        return calculateShouldHorizontallyScrollBy;
    }

    private void updateChildMaskForLocation(View view, float f7, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.left;
            float f8 = keyline.mask;
            KeylineState.Keyline keyline2 = keylineRange.right;
            ((Maskable) view).setMaskXPercentage(AnimationUtils.lerp(f8, keyline2.mask, keyline.loc, keyline2.loc, f7));
        }
    }

    private void updateCurrentKeylineStateForScrollOffset() {
        int i7 = this.maxHorizontalScroll;
        int i8 = this.minHorizontalScroll;
        if (i7 <= i8) {
            this.currentKeylineState = isLayoutRtl() ? this.keylineStateList.getRightState() : this.keylineStateList.getLeftState();
        } else {
            this.currentKeylineState = this.keylineStateList.getShiftedState(this.horizontalScrollOffset, i8, i7);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i7 = 0;
        while (i7 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i7));
            int i8 = i7 + 1;
            int position2 = getPosition(getChildAt(i8));
            if (position > position2) {
                logChildrenIfDebugging();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i7 + "] had adapter position [" + position + "] and child at index [" + i8 + "] had adapter position [" + position2 + "].");
            }
            i7 = i8;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(@o0 RecyclerView.c0 c0Var) {
        return (int) this.keylineStateList.getDefaultState().getItemSize();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(@o0 RecyclerView.c0 c0Var) {
        return this.horizontalScrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(@o0 RecyclerView.c0 c0Var) {
        return this.maxHorizontalScroll - this.minHorizontalScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getDecoratedBoundsWithMargins(@o0 View view, @o0 Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - getMaskedItemSizeForLocOffset(centerX, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), centerX, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void measureChildWithMargins(@o0 View view, int i7, int i8) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i9 = i7 + rect.left + rect.right;
        int i10 = i8 + rect.top + rect.bottom;
        KeylineStateList keylineStateList = this.keylineStateList;
        view.measure(RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i9, (int) (keylineStateList != null ? keylineStateList.getDefaultState().getItemSize() : ((ViewGroup.MarginLayoutParams) pVar).width), canScrollHorizontally()), RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (c0Var.d() <= 0) {
            removeAndRecycleAllViews(wVar);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        boolean z6 = this.keylineStateList == null;
        if (z6) {
            View p6 = wVar.p(0);
            measureChildWithMargins(p6, 0, 0);
            KeylineState onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, p6);
            if (isLayoutRtl) {
                onFirstChildMeasuredWithMargins = KeylineState.reverse(onFirstChildMeasuredWithMargins);
            }
            this.keylineStateList = KeylineStateList.from(this, onFirstChildMeasuredWithMargins);
        }
        int calculateStartHorizontalScroll = calculateStartHorizontalScroll(this.keylineStateList);
        int calculateEndHorizontalScroll = calculateEndHorizontalScroll(c0Var, this.keylineStateList);
        int i7 = isLayoutRtl ? calculateEndHorizontalScroll : calculateStartHorizontalScroll;
        this.minHorizontalScroll = i7;
        if (isLayoutRtl) {
            calculateEndHorizontalScroll = calculateStartHorizontalScroll;
        }
        this.maxHorizontalScroll = calculateEndHorizontalScroll;
        if (z6) {
            this.horizontalScrollOffset = calculateStartHorizontalScroll;
        } else {
            int i8 = this.horizontalScrollOffset;
            this.horizontalScrollOffset = i8 + calculateShouldHorizontallyScrollBy(0, i8, i7, calculateEndHorizontalScroll);
        }
        this.currentFillStartPosition = x0.a.e(this.currentFillStartPosition, 0, c0Var.d());
        updateCurrentKeylineStateForScrollOffset();
        detachAndScrapAttachedViews(wVar);
        fill(wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        super.onLayoutCompleted(c0Var);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean requestChildRectangleOnScreen(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z6, boolean z7) {
        KeylineStateList keylineStateList = this.keylineStateList;
        if (keylineStateList == null) {
            return false;
        }
        int scrollOffsetForPosition = getScrollOffsetForPosition(keylineStateList.getDefaultState(), getPosition(view)) - this.horizontalScrollOffset;
        if (z7 || scrollOffsetForPosition == 0) {
            return false;
        }
        recyclerView.scrollBy(scrollOffsetForPosition, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (canScrollHorizontally()) {
            return scrollBy(i7, wVar, c0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i7) {
        KeylineStateList keylineStateList = this.keylineStateList;
        if (keylineStateList == null) {
            return;
        }
        this.horizontalScrollOffset = getScrollOffsetForPosition(keylineStateList.getDefaultState(), i7);
        this.currentFillStartPosition = x0.a.e(i7, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset();
        requestLayout();
    }

    public void setCarouselStrategy(@o0 CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        this.keylineStateList = null;
        requestLayout();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setDebuggingEnabled(@o0 RecyclerView recyclerView, boolean z6) {
        this.isDebuggingEnabled = z6;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z6) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i7) {
        q qVar = new q(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.q
            public int calculateDxToMakeVisible(View view, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return (int) (CarouselLayoutManager.this.horizontalScrollOffset - carouselLayoutManager.getScrollOffsetForPosition(carouselLayoutManager.keylineStateList.getDefaultState(), CarouselLayoutManager.this.getPosition(view)));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.b0
            @q0
            public PointF computeScrollVectorForPosition(int i8) {
                if (CarouselLayoutManager.this.keylineStateList == null) {
                    return null;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return new PointF(carouselLayoutManager.getScrollOffsetForPosition(carouselLayoutManager.keylineStateList.getDefaultState(), i8) - CarouselLayoutManager.this.horizontalScrollOffset, 0.0f);
            }
        };
        qVar.setTargetPosition(i7);
        startSmoothScroll(qVar);
    }
}
