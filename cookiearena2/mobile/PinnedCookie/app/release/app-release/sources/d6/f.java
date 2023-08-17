package d6;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import u4.l0;
/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final f f8540a = new f();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@n6.d LogRecord logRecord) {
        int b7;
        l0.p(logRecord, "record");
        e eVar = e.f8539d;
        String loggerName = logRecord.getLoggerName();
        l0.o(loggerName, "record.loggerName");
        b7 = g.b(logRecord);
        String message = logRecord.getMessage();
        l0.o(message, "record.message");
        eVar.a(loggerName, b7, message, logRecord.getThrown());
    }
}
