package androidx.lifecycle;

import androidx.lifecycle.c1;
import androidx.lifecycle.z0;
import k2.a;
/* loaded from: classes.dex */
public final class b1<VM extends z0> implements v3.d0<VM> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e5.d<VM> f4698k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final t4.a<e1> f4699l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final t4.a<c1.b> f4700m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final t4.a<k2.a> f4701n;
    @n6.e

    /* renamed from: o  reason: collision with root package name */
    public VM f4702o;

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.a<a.C0139a> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f4703l = new a();

        public a() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final a.C0139a n() {
            return a.C0139a.f11626b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @s4.i
    public b1(@n6.d e5.d<VM> dVar, @n6.d t4.a<? extends e1> aVar, @n6.d t4.a<? extends c1.b> aVar2) {
        this(dVar, aVar, aVar2, null, 8, null);
        u4.l0.p(dVar, "viewModelClass");
        u4.l0.p(aVar, "storeProducer");
        u4.l0.p(aVar2, "factoryProducer");
    }

    @Override // v3.d0
    public boolean a() {
        return this.f4702o != null;
    }

    @Override // v3.d0
    @n6.d
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.f4702o;
        if (vm == null) {
            VM vm2 = (VM) new c1(this.f4699l.n(), this.f4700m.n(), this.f4701n.n()).a(s4.a.d(this.f4698k));
            this.f4702o = vm2;
            return vm2;
        }
        return vm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @s4.i
    public b1(@n6.d e5.d<VM> dVar, @n6.d t4.a<? extends e1> aVar, @n6.d t4.a<? extends c1.b> aVar2, @n6.d t4.a<? extends k2.a> aVar3) {
        u4.l0.p(dVar, "viewModelClass");
        u4.l0.p(aVar, "storeProducer");
        u4.l0.p(aVar2, "factoryProducer");
        u4.l0.p(aVar3, "extrasProducer");
        this.f4698k = dVar;
        this.f4699l = aVar;
        this.f4700m = aVar2;
        this.f4701n = aVar3;
    }

    public /* synthetic */ b1(e5.d dVar, t4.a aVar, t4.a aVar2, t4.a aVar3, int i7, u4.w wVar) {
        this(dVar, aVar, aVar2, (i7 & 8) != 0 ? a.f4703l : aVar3);
    }
}
