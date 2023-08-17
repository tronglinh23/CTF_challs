package v1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f17634a;

    /* renamed from: b  reason: collision with root package name */
    public int f17635b;

    /* renamed from: c  reason: collision with root package name */
    public int f17636c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f17637d;

    public int a(int i7) {
        return this.f17634a + (i7 * this.f17636c);
    }

    public void b(int i7, int i8, ByteBuffer byteBuffer) {
        this.f17637d = byteBuffer;
        if (byteBuffer != null) {
            this.f17634a = i7;
            this.f17635b = byteBuffer.getInt(i7 - 4);
            this.f17636c = i8;
            return;
        }
        this.f17634a = 0;
        this.f17635b = 0;
        this.f17636c = 0;
    }

    public int c() {
        return this.f17634a;
    }

    public int d() {
        return this.f17635b;
    }

    public void e() {
        b(0, 0, null);
    }
}