package k5;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import u4.l0;
import u4.r1;
@r1({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11788a = false;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<DecimalFormat>[] f11789b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i7 = 0; i7 < 4; i7++) {
            threadLocalArr[i7] = new ThreadLocal<>();
        }
        f11789b = threadLocalArr;
    }

    public static final DecimalFormat a(int i7) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i7 > 0) {
            decimalFormat.setMinimumFractionDigits(i7);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @n6.d
    public static final String b(double d7, int i7) {
        DecimalFormat a7;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f11789b;
        if (i7 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i7];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = a(i7);
                threadLocal.set(decimalFormat);
            } else {
                l0.o(decimalFormat, "get() ?: default().also(this::set)");
            }
            a7 = decimalFormat;
        } else {
            a7 = a(i7);
        }
        String format = a7.format(d7);
        l0.o(format, "format.format(value)");
        return format;
    }

    @n6.d
    public static final String c(double d7, int i7) {
        DecimalFormat a7 = a(0);
        a7.setMaximumFractionDigits(i7);
        String format = a7.format(d7);
        l0.o(format, "createFormatForDecimals(… }\n        .format(value)");
        return format;
    }

    public static final boolean d() {
        return f11788a;
    }
}
