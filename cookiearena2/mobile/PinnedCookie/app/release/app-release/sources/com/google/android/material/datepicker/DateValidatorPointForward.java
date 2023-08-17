package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import d.o0;
import java.util.Arrays;
/* loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() { // from class: com.google.android.material.datepicker.DateValidatorPointForward.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public DateValidatorPointForward createFromParcel(@o0 Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public DateValidatorPointForward[] newArray(int i7) {
            return new DateValidatorPointForward[i7];
        }
    };
    private final long point;

    @o0
    public static DateValidatorPointForward from(long j7) {
        return new DateValidatorPointForward(j7);
    }

    @o0
    public static DateValidatorPointForward now() {
        return from(UtcDates.getTodayCalendar().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.point == ((DateValidatorPointForward) obj).point;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j7) {
        return j7 >= this.point;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        parcel.writeLong(this.point);
    }

    private DateValidatorPointForward(long j7) {
        this.point = j7;
    }
}
