package d6;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class g {
    public static final int b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}