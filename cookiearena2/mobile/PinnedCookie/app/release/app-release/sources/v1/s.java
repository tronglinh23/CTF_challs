package v1;

import java.nio.ByteBuffer;
import v3.h2;
/* loaded from: classes.dex */
public final class s extends b {
    public s f(int i7, ByteBuffer byteBuffer) {
        b(i7, 2, byteBuffer);
        return this;
    }

    public short g(int i7) {
        return this.f17637d.getShort(a(i7));
    }

    public int h(int i7) {
        return g(i7) & h2.f17796n;
    }
}
