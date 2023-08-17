package g1;

import d.b1;
import java.io.Writer;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class k extends Writer {

    /* renamed from: k  reason: collision with root package name */
    public final String f10011k;

    /* renamed from: l  reason: collision with root package name */
    public StringBuilder f10012l = new StringBuilder(128);

    public k(String str) {
        this.f10011k = str;
    }

    public final void a() {
        if (this.f10012l.length() > 0) {
            this.f10012l.toString();
            StringBuilder sb = this.f10012l;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                a();
            } else {
                this.f10012l.append(c7);
            }
        }
    }
}
