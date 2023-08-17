package v1;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public int f17734a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f17735b;

    public void a() {
        b(0, null);
    }

    public void b(int i7, ByteBuffer byteBuffer) {
        this.f17735b = byteBuffer;
        if (byteBuffer != null) {
            this.f17734a = i7;
        } else {
            this.f17734a = 0;
        }
    }
}
