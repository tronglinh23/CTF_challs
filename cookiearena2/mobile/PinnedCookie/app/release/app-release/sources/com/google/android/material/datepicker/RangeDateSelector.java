package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import d.b1;
import d.o0;
import d.q0;
import g1.o;
import g1.s;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<o<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public RangeDateSelector createFromParcel(@o0 Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public RangeDateSelector[] newArray(int i7) {
            return new RangeDateSelector[i7];
        }
    };
    @q0
    private CharSequence error;
    private String invalidRangeStartError;
    @q0
    private SimpleDateFormat textInputFormat;
    private final String invalidRangeEndError = " ";
    @q0
    private Long selectedStartItem = null;
    @q0
    private Long selectedEndItem = null;
    @q0
    private Long proposedTextStart = null;
    @q0
    private Long proposedTextEnd = null;

    private void clearInvalidRange(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean isValidRange(long j7, long j8) {
        return j7 <= j8;
    }

    private void setInvalidRange(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    private void updateError(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.error = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.error = null;
        } else {
            this.error = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(@o0 TextInputLayout textInputLayout, @o0 TextInputLayout textInputLayout2, @o0 OnSelectionChangedListener<o<Long, Long>> onSelectionChangedListener) {
        Long l7 = this.proposedTextStart;
        if (l7 == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        } else if (isValidRange(l7.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            onSelectionChangedListener.onSelectionChanged(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        updateError(textInputLayout, textInputLayout2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@o0 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.resolveOrThrow(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @q0
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l7 = this.selectedStartItem;
        if (l7 != null) {
            arrayList.add(l7);
        }
        Long l8 = this.selectedEndItem;
        if (l8 != null) {
            arrayList.add(l8);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public Collection<o<Long, Long>> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public String getSelectionContentDescription(@o0 Context context) {
        Resources resources = context.getResources();
        o<String, String> dateRangeString = DateStrings.getDateRangeString(this.selectedStartItem, this.selectedEndItem);
        String str = dateRangeString.f10023a;
        String string = str == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str;
        String str2 = dateRangeString.f10024b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public String getSelectionDisplayString(@o0 Context context) {
        Resources resources = context.getResources();
        Long l7 = this.selectedStartItem;
        if (l7 == null && this.selectedEndItem == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l8 = this.selectedEndItem;
        if (l8 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, DateStrings.getDateString(l7.longValue()));
        }
        if (l7 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, DateStrings.getDateString(l8.longValue()));
        }
        o<String, String> dateRangeString = DateStrings.getDateRangeString(l7, l8);
        return resources.getString(R.string.mtrl_picker_range_header_selected, dateRangeString.f10023a, dateRangeString.f10024b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l7 = this.selectedStartItem;
        return (l7 == null || this.selectedEndItem == null || !isValidRange(l7.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, CalendarConstraints calendarConstraints, @o0 final OnSelectionChangedListener<o<Long, Long>> onSelectionChangedListener) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        textInputLayout2.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.textInputFormat;
        boolean z6 = simpleDateFormat != null;
        if (!z6) {
            simpleDateFormat = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l7 = this.selectedStartItem;
        if (l7 != null) {
            editText.setText(simpleDateFormat2.format(l7));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l8 = this.selectedEndItem;
        if (l8 != null) {
            editText2.setText(simpleDateFormat2.format(l8));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String pattern = z6 ? simpleDateFormat2.toPattern() : UtcDates.getDefaultTextInputHint(inflate.getResources(), simpleDateFormat2);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat2, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextStart = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@q0 Long l9) {
                RangeDateSelector.this.proposedTextStart = l9;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat2, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextEnd = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@q0 Long l9) {
                RangeDateSelector.this.proposedTextEnd = l9;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        DateSelector.showKeyboardWithAutoHideBehavior(editText, editText2);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j7) {
        Long l7 = this.selectedStartItem;
        if (l7 == null) {
            this.selectedStartItem = Long.valueOf(j7);
        } else if (this.selectedEndItem == null && isValidRange(l7.longValue(), j7)) {
            this.selectedEndItem = Long.valueOf(j7);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j7);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@q0 SimpleDateFormat simpleDateFormat) {
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @o0
    public o<Long, Long> getSelection() {
        return new o<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@o0 o<Long, Long> oVar) {
        Long l7 = oVar.f10023a;
        if (l7 != null && oVar.f10024b != null) {
            s.a(isValidRange(l7.longValue(), oVar.f10024b.longValue()));
        }
        Long l8 = oVar.f10023a;
        this.selectedStartItem = l8 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l8.longValue()));
        Long l9 = oVar.f10024b;
        this.selectedEndItem = l9 != null ? Long.valueOf(UtcDates.canonicalYearMonthDay(l9.longValue())) : null;
    }
}
