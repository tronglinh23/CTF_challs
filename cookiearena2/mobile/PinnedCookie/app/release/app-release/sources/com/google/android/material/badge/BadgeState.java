package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import d.b1;
import d.f;
import d.f1;
import d.g1;
import d.h1;
import d.l;
import d.n1;
import d.o0;
import d.q0;
import d.r;
import d.t0;
import java.util.Locale;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidePadding;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final State overridingState;

    public BadgeState(Context context, @n1 int i7, @f int i8, @g1 int i9, @q0 State state) {
        State state2 = new State();
        this.currentState = state2;
        state = state == null ? new State() : state;
        if (i7 != 0) {
            state.badgeResId = i7;
        }
        TypedArray generateTypedArray = generateTypedArray(context, state.badgeResId, i8, i9);
        Resources resources = context.getResources();
        this.badgeRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.badgeWidePadding = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.horizontalInset = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.horizontalInsetWithText = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.badgeWithTextRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        this.badgeWidth = generateTypedArray.getDimension(R.styleable.Badge_badgeWidth, resources.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextWidth = generateTypedArray.getDimension(R.styleable.Badge_badgeWithTextWidth, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.badgeHeight = generateTypedArray.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextHeight = generateTypedArray.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(R.dimen.m3_badge_with_text_size));
        boolean z6 = true;
        this.offsetAlignmentMode = generateTypedArray.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        state2.contentDescriptionNumberless = state.contentDescriptionNumberless == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : state.contentDescriptionNumberless;
        state2.contentDescriptionQuantityStrings = state.contentDescriptionQuantityStrings == 0 ? R.plurals.mtrl_badge_content_description : state.contentDescriptionQuantityStrings;
        state2.contentDescriptionExceedsMaxBadgeNumberRes = state.contentDescriptionExceedsMaxBadgeNumberRes == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : state.contentDescriptionExceedsMaxBadgeNumberRes;
        if (state.isVisible != null && !state.isVisible.booleanValue()) {
            z6 = false;
        }
        state2.isVisible = Boolean.valueOf(z6);
        state2.maxCharacterCount = state.maxCharacterCount == -2 ? generateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, 4) : state.maxCharacterCount;
        if (state.number != -2) {
            state2.number = state.number;
        } else if (generateTypedArray.hasValue(R.styleable.Badge_number)) {
            state2.number = generateTypedArray.getInt(R.styleable.Badge_number, 0);
        } else {
            state2.number = -1;
        }
        state2.badgeShapeAppearanceResId = Integer.valueOf(state.badgeShapeAppearanceResId == null ? generateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.badgeShapeAppearanceResId.intValue());
        state2.badgeShapeAppearanceOverlayResId = Integer.valueOf(state.badgeShapeAppearanceOverlayResId == null ? generateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : state.badgeShapeAppearanceOverlayResId.intValue());
        state2.badgeWithTextShapeAppearanceResId = Integer.valueOf(state.badgeWithTextShapeAppearanceResId == null ? generateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.badgeWithTextShapeAppearanceResId.intValue());
        state2.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(state.badgeWithTextShapeAppearanceOverlayResId == null ? generateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state.badgeWithTextShapeAppearanceOverlayResId.intValue());
        state2.backgroundColor = Integer.valueOf(state.backgroundColor == null ? readColorFromAttributes(context, generateTypedArray, R.styleable.Badge_backgroundColor) : state.backgroundColor.intValue());
        state2.badgeTextAppearanceResId = Integer.valueOf(state.badgeTextAppearanceResId == null ? generateTypedArray.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge) : state.badgeTextAppearanceResId.intValue());
        if (state.badgeTextColor != null) {
            state2.badgeTextColor = state.badgeTextColor;
        } else if (generateTypedArray.hasValue(R.styleable.Badge_badgeTextColor)) {
            state2.badgeTextColor = Integer.valueOf(readColorFromAttributes(context, generateTypedArray, R.styleable.Badge_badgeTextColor));
        } else {
            state2.badgeTextColor = Integer.valueOf(new TextAppearance(context, state2.badgeTextAppearanceResId.intValue()).getTextColor().getDefaultColor());
        }
        state2.badgeGravity = Integer.valueOf(state.badgeGravity == null ? generateTypedArray.getInt(R.styleable.Badge_badgeGravity, 8388661) : state.badgeGravity.intValue());
        state2.horizontalOffsetWithoutText = Integer.valueOf(state.horizontalOffsetWithoutText == null ? generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : state.horizontalOffsetWithoutText.intValue());
        state2.verticalOffsetWithoutText = Integer.valueOf(state.verticalOffsetWithoutText == null ? generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : state.verticalOffsetWithoutText.intValue());
        state2.horizontalOffsetWithText = Integer.valueOf(state.horizontalOffsetWithText == null ? generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue()) : state.horizontalOffsetWithText.intValue());
        state2.verticalOffsetWithText = Integer.valueOf(state.verticalOffsetWithText == null ? generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue()) : state.verticalOffsetWithText.intValue());
        state2.additionalHorizontalOffset = Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = Integer.valueOf(state.additionalVerticalOffset != null ? state.additionalVerticalOffset.intValue() : 0);
        generateTypedArray.recycle();
        if (state.numberLocale == null) {
            state2.numberLocale = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.numberLocale = state.numberLocale;
        }
        this.overridingState = state;
    }

    private TypedArray generateTypedArray(Context context, @n1 int i7, @f int i8, @g1 int i9) {
        AttributeSet attributeSet;
        int i10;
        if (i7 != 0) {
            AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i7, BADGE_RESOURCE_TAG);
            i10 = parseDrawableXml.getStyleAttribute();
            attributeSet = parseDrawableXml;
        } else {
            attributeSet = null;
            i10 = 0;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Badge, i8, i10 == 0 ? i9 : i10, new int[0]);
    }

    private static int readColorFromAttributes(Context context, @o0 TypedArray typedArray, @h1 int i7) {
        return MaterialResources.getColorStateList(context, typedArray, i7).getDefaultColor();
    }

    public void clearNumber() {
        setNumber(-1);
    }

    @r(unit = 1)
    public int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    @r(unit = 1)
    public int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    public int getAlpha() {
        return this.currentState.alpha;
    }

    @l
    public int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    public int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    public int getBadgeShapeAppearanceOverlayResId() {
        return this.currentState.badgeShapeAppearanceOverlayResId.intValue();
    }

    public int getBadgeShapeAppearanceResId() {
        return this.currentState.badgeShapeAppearanceResId.intValue();
    }

    @l
    public int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    public int getBadgeWithTextShapeAppearanceOverlayResId() {
        return this.currentState.badgeWithTextShapeAppearanceOverlayResId.intValue();
    }

    public int getBadgeWithTextShapeAppearanceResId() {
        return this.currentState.badgeWithTextShapeAppearanceResId.intValue();
    }

    @f1
    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    public CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    @t0
    public int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    @r(unit = 1)
    public int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    @r(unit = 1)
    public int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    public int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    public int getNumber() {
        return this.currentState.number;
    }

    public Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    public State getOverridingState() {
        return this.overridingState;
    }

    @g1
    public int getTextAppearanceResId() {
        return this.currentState.badgeTextAppearanceResId.intValue();
    }

    @r(unit = 1)
    public int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    @r(unit = 1)
    public int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    public boolean hasNumber() {
        return this.currentState.number != -1;
    }

    public boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    public void setAdditionalHorizontalOffset(@r(unit = 1) int i7) {
        this.overridingState.additionalHorizontalOffset = Integer.valueOf(i7);
        this.currentState.additionalHorizontalOffset = Integer.valueOf(i7);
    }

    public void setAdditionalVerticalOffset(@r(unit = 1) int i7) {
        this.overridingState.additionalVerticalOffset = Integer.valueOf(i7);
        this.currentState.additionalVerticalOffset = Integer.valueOf(i7);
    }

    public void setAlpha(int i7) {
        this.overridingState.alpha = i7;
        this.currentState.alpha = i7;
    }

    public void setBackgroundColor(@l int i7) {
        this.overridingState.backgroundColor = Integer.valueOf(i7);
        this.currentState.backgroundColor = Integer.valueOf(i7);
    }

    public void setBadgeGravity(int i7) {
        this.overridingState.badgeGravity = Integer.valueOf(i7);
        this.currentState.badgeGravity = Integer.valueOf(i7);
    }

    public void setBadgeShapeAppearanceOverlayResId(int i7) {
        this.overridingState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i7);
        this.currentState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i7);
    }

    public void setBadgeShapeAppearanceResId(int i7) {
        this.overridingState.badgeShapeAppearanceResId = Integer.valueOf(i7);
        this.currentState.badgeShapeAppearanceResId = Integer.valueOf(i7);
    }

    public void setBadgeTextColor(@l int i7) {
        this.overridingState.badgeTextColor = Integer.valueOf(i7);
        this.currentState.badgeTextColor = Integer.valueOf(i7);
    }

    public void setBadgeWithTextShapeAppearanceOverlayResId(int i7) {
        this.overridingState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i7);
        this.currentState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i7);
    }

    public void setBadgeWithTextShapeAppearanceResId(int i7) {
        this.overridingState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i7);
        this.currentState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i7);
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@f1 int i7) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i7;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i7;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(@t0 int i7) {
        this.overridingState.contentDescriptionQuantityStrings = i7;
        this.currentState.contentDescriptionQuantityStrings = i7;
    }

    public void setHorizontalOffsetWithText(@r(unit = 1) int i7) {
        this.overridingState.horizontalOffsetWithText = Integer.valueOf(i7);
        this.currentState.horizontalOffsetWithText = Integer.valueOf(i7);
    }

    public void setHorizontalOffsetWithoutText(@r(unit = 1) int i7) {
        this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(i7);
        this.currentState.horizontalOffsetWithoutText = Integer.valueOf(i7);
    }

    public void setMaxCharacterCount(int i7) {
        this.overridingState.maxCharacterCount = i7;
        this.currentState.maxCharacterCount = i7;
    }

    public void setNumber(int i7) {
        this.overridingState.number = i7;
        this.currentState.number = i7;
    }

    public void setNumberLocale(Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    public void setTextAppearanceResId(@g1 int i7) {
        this.overridingState.badgeTextAppearanceResId = Integer.valueOf(i7);
        this.currentState.badgeTextAppearanceResId = Integer.valueOf(i7);
    }

    public void setVerticalOffsetWithText(@r(unit = 1) int i7) {
        this.overridingState.verticalOffsetWithText = Integer.valueOf(i7);
        this.currentState.verticalOffsetWithText = Integer.valueOf(i7);
    }

    public void setVerticalOffsetWithoutText(@r(unit = 1) int i7) {
        this.overridingState.verticalOffsetWithoutText = Integer.valueOf(i7);
        this.currentState.verticalOffsetWithoutText = Integer.valueOf(i7);
    }

    public void setVisible(boolean z6) {
        this.overridingState.isVisible = Boolean.valueOf(z6);
        this.currentState.isVisible = Boolean.valueOf(z6);
    }

    /* loaded from: classes.dex */
    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @o0
            public State createFromParcel(@o0 Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @o0
            public State[] newArray(int i7) {
                return new State[i7];
            }
        };
        private static final int NOT_SET = -2;
        @r(unit = 1)
        private Integer additionalHorizontalOffset;
        @r(unit = 1)
        private Integer additionalVerticalOffset;
        private int alpha;
        @l
        private Integer backgroundColor;
        private Integer badgeGravity;
        @n1
        private int badgeResId;
        @g1
        private Integer badgeShapeAppearanceOverlayResId;
        @g1
        private Integer badgeShapeAppearanceResId;
        @g1
        private Integer badgeTextAppearanceResId;
        @l
        private Integer badgeTextColor;
        @g1
        private Integer badgeWithTextShapeAppearanceOverlayResId;
        @g1
        private Integer badgeWithTextShapeAppearanceResId;
        @f1
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        @q0
        private CharSequence contentDescriptionNumberless;
        @t0
        private int contentDescriptionQuantityStrings;
        @r(unit = 1)
        private Integer horizontalOffsetWithText;
        @r(unit = 1)
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;
        private int maxCharacterCount;
        private int number;
        private Locale numberLocale;
        @r(unit = 1)
        private Integer verticalOffsetWithText;
        @r(unit = 1)
        private Integer verticalOffsetWithoutText;

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i7) {
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeSerializable(this.badgeTextAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            CharSequence charSequence = this.contentDescriptionNumberless;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
        }

        public State(@o0 Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.badgeTextAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
        }
    }
}
