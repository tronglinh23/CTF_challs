package kotlinx.coroutines.sync;

import kotlinx.coroutines.o;
import v3.m2;

/* loaded from: classes.dex */
public final class a extends o {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final i f13058k;

    /* renamed from: l  reason: collision with root package name */
    public final int f13059l;

    public a(@n6.d i iVar, int i7) {
        this.f13058k = iVar;
        this.f13059l = i7;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ m2 O(Throwable th) {
        b(th);
        return m2.f17815a;
    }

    @Override // kotlinx.coroutines.p
    public void b(@n6.e Throwable th) {
        this.f13058k.s(this.f13059l);
    }

    @n6.d
    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f13058k + ", " + this.f13059l + ']';
    }
}