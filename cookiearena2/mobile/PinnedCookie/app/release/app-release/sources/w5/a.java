package w5;

import n6.e;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public abstract class a {
    @e

    /* renamed from: a  reason: collision with root package name */
    public c f18212a;

    /* renamed from: b  reason: collision with root package name */
    public long f18213b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final String f18214c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18215d;

    public a(@n6.d String str, boolean z6) {
        l0.p(str, "name");
        this.f18214c = str;
        this.f18215d = z6;
        this.f18213b = -1L;
    }

    public final boolean a() {
        return this.f18215d;
    }

    @n6.d
    public final String b() {
        return this.f18214c;
    }

    public final long c() {
        return this.f18213b;
    }

    @e
    public final c d() {
        return this.f18212a;
    }

    public final void e(@n6.d c cVar) {
        l0.p(cVar, "queue");
        c cVar2 = this.f18212a;
        if (cVar2 == cVar) {
            return;
        }
        if (!(cVar2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f18212a = cVar;
    }

    public abstract long f();

    public final void g(long j7) {
        this.f18213b = j7;
    }

    public final void h(@e c cVar) {
        this.f18212a = cVar;
    }

    @n6.d
    public String toString() {
        return this.f18214c;
    }

    public /* synthetic */ a(String str, boolean z6, int i7, w wVar) {
        this(str, (i7 & 2) != 0 ? true : z6);
    }
}
