package com.google.android.material.datepicker;

import android.content.Context;
import com.google.android.material.R;
import d.q0;
import g1.o;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DateStrings {
    private DateStrings() {
    }

    public static o<String, String> getDateRangeString(@q0 Long l7, @q0 Long l8) {
        return getDateRangeString(l7, l8, null);
    }

    public static String getDateString(long j7) {
        return getDateString(j7, null);
    }

    public static String getDayContentDescription(Context context, long j7, boolean z6, boolean z7, boolean z8) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j7);
        if (z6) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        return z7 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay) : z8 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    public static String getMonthDay(long j7) {
        return getMonthDay(j7, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j7) {
        return getMonthDayOfWeekDay(j7, Locale.getDefault());
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j7) {
        return isDateWithinCurrentYear(j7) ? getMonthDayOfWeekDay(j7) : getYearMonthDayOfWeekDay(j7);
    }

    public static String getYearContentDescription(Context context, int i7) {
        return UtcDates.getTodayCalendar().get(1) == i7 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i7)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i7));
    }

    public static String getYearMonth(long j7) {
        return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j7));
    }

    public static String getYearMonthDay(long j7) {
        return getYearMonthDay(j7, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j7) {
        return getYearMonthDayOfWeekDay(j7, Locale.getDefault());
    }

    private static boolean isDateWithinCurrentYear(long j7) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j7);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    public static o<String, String> getDateRangeString(@q0 Long l7, @q0 Long l8, @q0 SimpleDateFormat simpleDateFormat) {
        if (l7 == null && l8 == null) {
            return o.a(null, null);
        }
        if (l7 == null) {
            return o.a(null, getDateString(l8.longValue(), simpleDateFormat));
        }
        if (l8 == null) {
            return o.a(getDateString(l7.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l7.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l8.longValue());
        if (simpleDateFormat != null) {
            return o.a(simpleDateFormat.format(new Date(l7.longValue())), simpleDateFormat.format(new Date(l8.longValue())));
        } else if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            if (utcCalendar.get(1) == todayCalendar.get(1)) {
                return o.a(getMonthDay(l7.longValue(), Locale.getDefault()), getMonthDay(l8.longValue(), Locale.getDefault()));
            }
            return o.a(getMonthDay(l7.longValue(), Locale.getDefault()), getYearMonthDay(l8.longValue(), Locale.getDefault()));
        } else {
            return o.a(getYearMonthDay(l7.longValue(), Locale.getDefault()), getYearMonthDay(l8.longValue(), Locale.getDefault()));
        }
    }

    public static String getDateString(long j7, @q0 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j7));
        }
        if (isDateWithinCurrentYear(j7)) {
            return getMonthDay(j7);
        }
        return getYearMonthDay(j7);
    }

    public static String getMonthDay(long j7, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j7));
    }

    public static String getMonthDayOfWeekDay(long j7, Locale locale) {
        return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j7));
    }

    public static String getYearMonthDay(long j7, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j7));
    }

    public static String getYearMonthDayOfWeekDay(long j7, Locale locale) {
        return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j7));
    }
}
