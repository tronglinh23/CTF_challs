package u5;

import i6.m;
import i6.m0;
import i6.r;
import java.io.IOException;
import t4.l;
import u4.l0;
import v3.m2;

/* loaded from: classes.dex */
public class e extends r {

    /* renamed from: l  reason: collision with root package name */
    public boolean f17590l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final l<IOException, m2> f17591m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@n6.d m0 m0Var, @n6.d l<? super IOException, m2> lVar) {
        super(m0Var);
        l0.p(m0Var, "delegate");
        l0.p(lVar, "onException");
        this.f17591m = lVar;
    }

    @Override // i6.r, i6.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f17590l) {
            return;
        }
        try {
            super.close();
        } catch (IOException e7) {
            this.f17590l = true;
            this.f17591m.O(e7);
        }
    }

    @n6.d
    public final l<IOException, m2> d() {
        return this.f17591m;
    }

    @Override // i6.r, i6.m0, java.io.Flushable
    public void flush() {
        if (this.f17590l) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e7) {
            this.f17590l = true;
            this.f17591m.O(e7);
        }
    }

    @Override // i6.r, i6.m0
    public void w(@n6.d m mVar, long j7) {
        l0.p(mVar, "source");
        if (this.f17590l) {
            mVar.skip(j7);
            return;
        }
        try {
            super.w(mVar, j7);
        } catch (IOException e7) {
            this.f17590l = true;
            this.f17591m.O(e7);
        }
    }
}