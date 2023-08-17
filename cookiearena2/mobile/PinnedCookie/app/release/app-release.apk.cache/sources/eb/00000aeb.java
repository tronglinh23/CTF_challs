package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import d.o0;
import g1.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    @o0
    private final Operator operator;
    @o0
    private final List<CalendarConstraints.DateValidator> validators;
    private static final Operator ANY_OPERATOR = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.1
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@o0 List<CalendarConstraints.DateValidator> list, long j7) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.isValid(j7)) {
                    return true;
                }
            }
            return false;
        }
    };
    private static final Operator ALL_OPERATOR = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.2
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@o0 List<CalendarConstraints.DateValidator> list, long j7) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.isValid(j7)) {
                    return false;
                }
            }
            return true;
        }
    };
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public CompositeDateValidator createFromParcel(@o0 Parcel parcel) {
            Operator operator;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                operator = CompositeDateValidator.ALL_OPERATOR;
            } else if (readInt == 1) {
                operator = CompositeDateValidator.ANY_OPERATOR;
            } else {
                operator = CompositeDateValidator.ALL_OPERATOR;
            }
            return new CompositeDateValidator((List) s.l(readArrayList), operator);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public CompositeDateValidator[] newArray(int i7) {
            return new CompositeDateValidator[i7];
        }
    };

    /* loaded from: classes.dex */
    public interface Operator {
        int getId();

        boolean isValid(@o0 List<CalendarConstraints.DateValidator> list, long j7);
    }

    @o0
    public static CalendarConstraints.DateValidator allOf(@o0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ALL_OPERATOR);
    }

    @o0
    public static CalendarConstraints.DateValidator anyOf(@o0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ANY_OPERATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompositeDateValidator) {
            CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
            return this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId();
        }
        return false;
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j7) {
        return this.operator.isValid(this.validators, j7);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }

    private CompositeDateValidator(@o0 List<CalendarConstraints.DateValidator> list, Operator operator) {
        this.validators = list;
        this.operator = operator;
    }
}