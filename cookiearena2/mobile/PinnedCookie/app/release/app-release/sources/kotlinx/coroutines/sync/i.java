package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.r0;
/* loaded from: classes.dex */
public final class i extends o0<i> {
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f13110e;

    public i(long j7, @n6.e i iVar, int i7) {
        super(j7, iVar, i7);
        int i8;
        i8 = h.f13105f;
        this.f13110e = new AtomicReferenceArray(i8);
    }

    @Override // kotlinx.coroutines.internal.o0
    public int p() {
        int i7;
        i7 = h.f13105f;
        return i7;
    }

    public final void s(int i7) {
        r0 r0Var;
        r0Var = h.f13104e;
        this.f13110e.set(i7, r0Var);
        q();
    }

    public final boolean t(int i7, @n6.e Object obj, @n6.e Object obj2) {
        return kotlinx.coroutines.debug.internal.b.a(this.f13110e, i7, obj, obj2);
    }

    @n6.d
    public String toString() {
        return "SemaphoreSegment[id=" + o() + ", hashCode=" + hashCode() + ']';
    }

    @n6.e
    public final Object u(int i7) {
        return this.f13110e.get(i7);
    }

    @n6.e
    public final Object v(int i7, @n6.e Object obj) {
        return this.f13110e.getAndSet(i7, obj);
    }

    public final void w(int i7, @n6.e Object obj) {
        this.f13110e.set(i7, obj);
    }
}
