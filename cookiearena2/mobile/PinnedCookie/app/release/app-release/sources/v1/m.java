package v1;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class m extends b {
    public m f(int i7, ByteBuffer byteBuffer) {
        b(i7, 4, byteBuffer);
        return this;
    }

    public int g(int i7) {
        return this.f17637d.getInt(a(i7));
    }

    public long h(int i7) {
        return g(i7) & 4294967295L;
    }
}
