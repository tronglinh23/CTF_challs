package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class o2 extends CancellationException implements m0<o2> {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final transient n2 f12927k;

    public o2(@n6.d String str, @n6.e Throwable th, @n6.d n2 n2Var) {
        super(str);
        this.f12927k = n2Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.m0
    @n6.e
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public o2 a() {
        return null;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj != this) {
            if (obj instanceof o2) {
                o2 o2Var = (o2) obj;
                if (!u4.l0.g(o2Var.getMessage(), getMessage()) || !u4.l0.g(o2Var.f12927k, this.f12927k) || !u4.l0.g(o2Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @n6.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        u4.l0.m(message);
        int hashCode = ((message.hashCode() * 31) + this.f12927k.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @n6.d
    public String toString() {
        return super.toString() + "; job=" + this.f12927k;
    }
}
