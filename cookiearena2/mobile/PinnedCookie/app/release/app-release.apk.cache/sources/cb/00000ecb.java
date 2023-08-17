package d6;

import android.util.Log;
import i5.c0;
import i5.e0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import r5.b0;
import u4.l0;
import x3.a1;

@s5.c
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8536a = 4000;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, String> f8538c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f8539d = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f8537b = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = b0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = b0.class.getName();
        l0.o(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = a6.e.class.getName();
        l0.o(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = w5.d.class.getName();
        l0.o(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f8538c = a1.F0(linkedHashMap);
    }

    public final void a(@n6.d String str, int i7, @n6.d String str2, @n6.e Throwable th) {
        int min;
        l0.p(str, "loggerName");
        l0.p(str2, "message");
        String d7 = d(str);
        if (Log.isLoggable(d7, i7)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i8 = 0;
            while (i8 < length) {
                int r32 = c0.r3(str2, '\n', i8, false, 4, null);
                if (r32 == -1) {
                    r32 = length;
                }
                while (true) {
                    min = Math.min(r32, i8 + f8536a);
                    String substring = str2.substring(i8, min);
                    l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i7, d7, substring);
                    if (min >= r32) {
                        break;
                    }
                    i8 = min;
                }
                i8 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f8538c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f8537b.add(logger)) {
            l0.o(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f8540a);
        }
    }

    public final String d(String str) {
        String str2 = f8538c.get(str);
        return str2 != null ? str2 : e0.Y8(str, 23);
    }
}