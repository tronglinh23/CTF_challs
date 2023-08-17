package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;
import d.b1;
import d.f1;
import d.g1;
import d.o0;
import d.q0;
import g1.o;
import java.text.SimpleDateFormat;
import java.util.Collection;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    static /* synthetic */ void e(EditText[] editTextArr, View view, boolean z6) {
        lambda$showKeyboardWithAutoHideBehavior$0(editTextArr, view, z6);
    }

    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view, boolean z6) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view);
    }

    static void showKeyboardWithAutoHideBehavior(@o0 final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                DateSelector.e(editTextArr, view, z6);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        ViewUtils.requestFocusAndShowKeyboard(editTextArr[0]);
    }

    @g1
    int getDefaultThemeResId(Context context);

    @f1
    int getDefaultTitleResId();

    @q0
    String getError();

    @o0
    Collection<Long> getSelectedDays();

    @o0
    Collection<o<Long, Long>> getSelectedRanges();

    @q0
    S getSelection();

    @o0
    String getSelectionContentDescription(@o0 Context context);

    @o0
    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    @o0
    View onCreateTextInputView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle, @o0 CalendarConstraints calendarConstraints, @o0 OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j7);

    void setSelection(@o0 S s6);

    void setTextInputFormat(@q0 SimpleDateFormat simpleDateFormat);
}