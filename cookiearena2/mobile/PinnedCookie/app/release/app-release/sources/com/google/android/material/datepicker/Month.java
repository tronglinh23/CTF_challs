package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import d.q0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public Month createFromParcel(@o0 Parcel parcel) {
            return Month.create(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public Month[] newArray(int i7) {
            return new Month[i7];
        }
    };
    final int daysInMonth;
    final int daysInWeek;
    @o0
    private final Calendar firstOfMonth;
    @q0
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    private Month(@o0 Calendar calendar) {
        calendar.set(5, 1);
        Calendar dayCopy = UtcDates.getDayCopy(calendar);
        this.firstOfMonth = dayCopy;
        this.month = dayCopy.get(2);
        this.year = dayCopy.get(1);
        this.daysInWeek = dayCopy.getMaximum(7);
        this.daysInMonth = dayCopy.getActualMaximum(5);
        this.timeInMillis = dayCopy.getTimeInMillis();
    }

    @o0
    public static Month create(long j7) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j7);
        return new Month(utcCalendar);
    }

    @o0
    public static Month current() {
        return new Month(UtcDates.getTodayCalendar());
    }

    public int daysFromStartOfWeekToFirstOfMonth(int i7) {
        int i8 = this.firstOfMonth.get(7);
        if (i7 <= 0) {
            i7 = this.firstOfMonth.getFirstDayOfWeek();
        }
        int i9 = i8 - i7;
        return i9 < 0 ? i9 + this.daysInWeek : i9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.month == month.month && this.year == month.year;
        }
        return false;
    }

    public long getDay(int i7) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.set(5, i7);
        return dayCopy.getTimeInMillis();
    }

    public int getDayOfMonth(long j7) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.setTimeInMillis(j7);
        return dayCopy.get(5);
    }

    @o0
    public String getLongName() {
        if (this.longName == null) {
            this.longName = DateStrings.getYearMonth(this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }

    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    @o0
    public Month monthsLater(int i7) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.add(2, i7);
        return new Month(dayCopy);
    }

    public int monthsUntil(@o0 Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((month.year - this.year) * 12) + (month.month - this.month);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }

    @Override // java.lang.Comparable
    public int compareTo(@o0 Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    @o0
    public static Month create(int i7, int i8) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.set(1, i7);
        utcCalendar.set(2, i8);
        return new Month(utcCalendar);
    }
}
