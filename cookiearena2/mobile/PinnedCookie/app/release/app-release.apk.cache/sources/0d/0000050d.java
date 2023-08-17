package androidx.fragment.app;

import java.io.Writer;

/* loaded from: classes.dex */
public final class c1 extends Writer {

    /* renamed from: k  reason: collision with root package name */
    public final String f4335k;

    /* renamed from: l  reason: collision with root package name */
    public StringBuilder f4336l = new StringBuilder(128);

    public c1(String str) {
        this.f4335k = str;
    }

    public final void a() {
        if (this.f4336l.length() > 0) {
            this.f4336l.toString();
            StringBuilder sb = this.f4336l;
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
                this.f4336l.append(c7);
            }
        }
    }
}