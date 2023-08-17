package a6;

import java.io.IOException;
import u4.l0;
/* loaded from: classes.dex */
public final class n extends IOException {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final b f485k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@n6.d b bVar) {
        super("stream was reset: " + bVar);
        l0.p(bVar, "errorCode");
        this.f485k = bVar;
    }
}
