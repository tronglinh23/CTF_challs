package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class y3 extends CancellationException implements m0<y3> {
    @s4.e
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final transient n2 f13186k;

    public y3(@n6.d String str, @n6.e n2 n2Var) {
        super(str);
        this.f13186k = n2Var;
    }

    @Override // kotlinx.coroutines.m0
    @n6.d
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public y3 a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        y3 y3Var = new y3(message, this.f13186k);
        y3Var.initCause(this);
        return y3Var;
    }

    public y3(@n6.d String str) {
        this(str, null);
    }
}
