package e4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u4.l0;
import u4.w;
import v3.a1;
import v3.d1;
import v3.g1;

@g1(version = "1.3")
@a1
/* loaded from: classes.dex */
public final class k<T> implements d<T>, h4.e {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f8772l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<k<?>, Object> f8773m = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final d<T> f8774k;
    @n6.e
    private volatile Object result;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@n6.d d<? super T> dVar, @n6.e Object obj) {
        l0.p(dVar, "delegate");
        this.f8774k = dVar;
        this.result = obj;
    }

    @Override // e4.d
    public void D(@n6.d Object obj) {
        while (true) {
            Object obj2 = this.result;
            g4.a aVar = g4.a.UNDECIDED;
            if (obj2 == aVar) {
                if (p.b.a(f8773m, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != g4.d.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (p.b.a(f8773m, this, g4.d.h(), g4.a.RESUMED)) {
                    this.f8774k.D(obj);
                    return;
                }
            }
        }
    }

    @n6.e
    @a1
    public final Object a() {
        Object obj = this.result;
        g4.a aVar = g4.a.UNDECIDED;
        if (obj == aVar) {
            if (p.b.a(f8773m, this, aVar, g4.d.h())) {
                return g4.d.h();
            }
            obj = this.result;
        }
        if (obj == g4.a.RESUMED) {
            return g4.d.h();
        }
        if (obj instanceof d1.b) {
            throw ((d1.b) obj).f17780k;
        }
        return obj;
    }

    @Override // e4.d
    @n6.d
    public g g() {
        return this.f8774k.g();
    }

    @Override // h4.e
    @n6.e
    public StackTraceElement k0() {
        return null;
    }

    @n6.d
    public String toString() {
        return "SafeContinuation for " + this.f8774k;
    }

    @Override // h4.e
    @n6.e
    public h4.e v() {
        d<T> dVar = this.f8774k;
        if (dVar instanceof h4.e) {
            return (h4.e) dVar;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @a1
    public k(@n6.d d<? super T> dVar) {
        this(dVar, g4.a.UNDECIDED);
        l0.p(dVar, "delegate");
    }
}