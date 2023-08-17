package y5;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import u4.l0;
import v3.m2;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final long f18855a = 253402300799999L;

    /* renamed from: b  reason: collision with root package name */
    public static final a f18856b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f18857c;

    /* renamed from: d  reason: collision with root package name */
    public static final DateFormat[] f18858d;

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(s5.d.f16656f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f18857c = strArr;
        f18858d = new DateFormat[strArr.length];
    }

    @n6.e
    public static final Date a(@n6.d String str) {
        l0.p(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f18856b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f18857c;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                DateFormat[] dateFormatArr = f18858d;
                DateFormat dateFormat = dateFormatArr[i7];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f18857c[i7], Locale.US);
                    dateFormat.setTimeZone(s5.d.f16656f);
                    dateFormatArr[i7] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            m2 m2Var = m2.f17815a;
            return null;
        }
    }

    @n6.d
    public static final String b(@n6.d Date date) {
        l0.p(date, "$this$toHttpDateString");
        String format = f18856b.get().format(date);
        l0.o(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
