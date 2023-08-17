package com.google.android.material.datepicker;

import d.q0;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);
    @q0
    private final Long fixedTimeMs;
    @q0
    private final TimeZone fixedTimeZone;

    private TimeSource(@q0 Long l7, @q0 TimeZone timeZone) {
        this.fixedTimeMs = l7;
        this.fixedTimeZone = timeZone;
    }

    public static TimeSource fixed(long j7, @q0 TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j7), timeZone);
    }

    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    public Calendar now() {
        return now(this.fixedTimeZone);
    }

    public static TimeSource fixed(long j7) {
        return new TimeSource(Long.valueOf(j7), null);
    }

    public Calendar now(@q0 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l7 = this.fixedTimeMs;
        if (l7 != null) {
            calendar.setTimeInMillis(l7.longValue());
        }
        return calendar;
    }
}
