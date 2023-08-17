package i6;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes.dex */
public interface o0 extends Closeable {
    @n6.d
    q0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long l0(@n6.d m mVar, long j7) throws IOException;
}
