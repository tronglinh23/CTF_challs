package x5;

import java.io.IOException;
import u4.l0;
import v3.p;

/* loaded from: classes.dex */
public final class j extends RuntimeException {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public IOException f18488k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final IOException f18489l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@n6.d IOException iOException) {
        super(iOException);
        l0.p(iOException, "firstConnectException");
        this.f18489l = iOException;
        this.f18488k = iOException;
    }

    public final void a(@n6.d IOException iOException) {
        l0.p(iOException, "e");
        p.a(this.f18489l, iOException);
        this.f18488k = iOException;
    }

    @n6.d
    public final IOException b() {
        return this.f18489l;
    }

    @n6.d
    public final IOException c() {
        return this.f18488k;
    }
}