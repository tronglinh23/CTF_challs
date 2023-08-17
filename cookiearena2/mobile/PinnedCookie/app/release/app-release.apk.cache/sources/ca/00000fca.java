package g0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9969a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f9970b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9971c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9972d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final int f9973e = 32;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9974f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f9975g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9976h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f9977i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f9978j = 16;

    /* renamed from: k  reason: collision with root package name */
    public static final int f9979k = 32;

    @o0
    public static String a(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @o0
    public static String b(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i7 > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i7);
            i7 &= ~numberOfTrailingZeros;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (numberOfTrailingZeros == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (numberOfTrailingZeros == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (numberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @q0
    public static String c(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        if (i7 != 16) {
                            if (i7 != 32) {
                                return null;
                            }
                            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
                        }
                        return "FLAG_REPORT_VIEW_IDS";
                    }
                    return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
                }
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            }
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        return "DEFAULT";
    }

    public static int d(@o0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @q0
    public static String e(@o0 AccessibilityServiceInfo accessibilityServiceInfo, @o0 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}