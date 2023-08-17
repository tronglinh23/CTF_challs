package v5;

import i6.m;
import java.io.IOException;
import java.nio.channels.FileChannel;
import n6.d;
import u4.l0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final FileChannel f17847a;

    public a(@d FileChannel fileChannel) {
        l0.p(fileChannel, "fileChannel");
        this.f17847a = fileChannel;
    }

    public final void a(long j7, @d m mVar, long j8) {
        l0.p(mVar, "sink");
        if (j8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j8 > 0) {
            long transferTo = this.f17847a.transferTo(j7, j8, mVar);
            j7 += transferTo;
            j8 -= transferTo;
        }
    }

    public final void b(long j7, @d m mVar, long j8) throws IOException {
        l0.p(mVar, "source");
        if (j8 < 0 || j8 > mVar.a1()) {
            throw new IndexOutOfBoundsException();
        }
        while (j8 > 0) {
            long transferFrom = this.f17847a.transferFrom(mVar, j7, j8);
            j7 += transferFrom;
            j8 -= transferFrom;
        }
    }
}