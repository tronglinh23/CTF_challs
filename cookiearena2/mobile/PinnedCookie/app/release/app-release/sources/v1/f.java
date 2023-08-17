package v1;

import java.nio.ByteBuffer;
import v3.t1;
/* loaded from: classes.dex */
public final class f extends b {
    public f f(int i7, ByteBuffer byteBuffer) {
        b(i7, 1, byteBuffer);
        return this;
    }

    public byte g(int i7) {
        return this.f17637d.get(a(i7));
    }

    public int h(int i7) {
        return g(i7) & t1.f17828n;
    }
}
