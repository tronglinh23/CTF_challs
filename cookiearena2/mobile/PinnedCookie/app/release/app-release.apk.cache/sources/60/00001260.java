package i6;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes.dex */
public interface m0 extends Closeable, Flushable {
    @n6.d
    q0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    void w(@n6.d m mVar, long j7) throws IOException;
}