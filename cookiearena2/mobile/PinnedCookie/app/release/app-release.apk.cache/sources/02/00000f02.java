package e4;

import e4.g;
import i0.x2;
import java.io.Serializable;
import t4.p;
import u4.k1;
import u4.l0;
import u4.n0;
import u4.r1;
import u4.w;
import v3.g1;
import v3.m2;

@r1({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
@g1(version = "1.3")
/* loaded from: classes.dex */
public final class c implements g, Serializable {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final g f8757k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final g.b f8758l;

    @r1({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12990#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a implements Serializable {
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public static final C0102a f8759l = new C0102a(null);

        /* renamed from: m  reason: collision with root package name */
        public static final long f8760m = 0;
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final g[] f8761k;

        /* renamed from: e4.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0102a {
            public /* synthetic */ C0102a(w wVar) {
                this();
            }

            public C0102a() {
            }
        }

        public a(@n6.d g[] gVarArr) {
            l0.p(gVarArr, "elements");
            this.f8761k = gVarArr;
        }

        @n6.d
        public final g[] a() {
            return this.f8761k;
        }

        public final Object b() {
            g[] gVarArr = this.f8761k;
            g gVar = i.f8770k;
            for (g gVar2 : gVarArr) {
                gVar = gVar.t(gVar2);
            }
            return gVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements p<String, g.b, String> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f8762l = new b();

        public b() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final String J(@n6.d String str, @n6.d g.b bVar) {
            l0.p(str, "acc");
            l0.p(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: e4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0103c extends n0 implements p<m2, g.b, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ g[] f8763l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ k1.f f8764m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0103c(g[] gVarArr, k1.f fVar) {
            super(2);
            this.f8763l = gVarArr;
            this.f8764m = fVar;
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ m2 J(m2 m2Var, g.b bVar) {
            b(m2Var, bVar);
            return m2.f17815a;
        }

        public final void b(@n6.d m2 m2Var, @n6.d g.b bVar) {
            l0.p(m2Var, "<anonymous parameter 0>");
            l0.p(bVar, "element");
            g[] gVarArr = this.f8763l;
            k1.f fVar = this.f8764m;
            int i7 = fVar.f17434k;
            fVar.f17434k = i7 + 1;
            gVarArr[i7] = bVar;
        }
    }

    public c(@n6.d g gVar, @n6.d g.b bVar) {
        l0.p(gVar, "left");
        l0.p(bVar, "element");
        this.f8757k = gVar;
        this.f8758l = bVar;
    }

    @Override // e4.g
    @n6.d
    public g a(@n6.d g.c<?> cVar) {
        l0.p(cVar, x2.f10960j);
        if (this.f8758l.e(cVar) != null) {
            return this.f8757k;
        }
        g a7 = this.f8757k.a(cVar);
        return a7 == this.f8757k ? this : a7 == i.f8770k ? this.f8758l : new c(a7, this.f8758l);
    }

    public final boolean c(g.b bVar) {
        return l0.g(e(bVar.getKey()), bVar);
    }

    @Override // e4.g
    @n6.e
    public <E extends g.b> E e(@n6.d g.c<E> cVar) {
        l0.p(cVar, x2.f10960j);
        c cVar2 = this;
        while (true) {
            E e7 = (E) cVar2.f8758l.e(cVar);
            if (e7 != null) {
                return e7;
            }
            g gVar = cVar2.f8757k;
            if (!(gVar instanceof c)) {
                return (E) gVar.e(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public boolean equals(@n6.e Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.j() != j() || !cVar.g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(c cVar) {
        while (c(cVar.f8758l)) {
            g gVar = cVar.f8757k;
            if (!(gVar instanceof c)) {
                l0.n(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    public int hashCode() {
        return this.f8757k.hashCode() + this.f8758l.hashCode();
    }

    public final int j() {
        int i7 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f8757k;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i7;
            }
            i7++;
        }
    }

    @Override // e4.g
    public <R> R k(R r6, @n6.d p<? super R, ? super g.b, ? extends R> pVar) {
        l0.p(pVar, "operation");
        return pVar.J((Object) this.f8757k.k(r6, pVar), this.f8758l);
    }

    public final Object m() {
        int j7 = j();
        g[] gVarArr = new g[j7];
        k1.f fVar = new k1.f();
        k(m2.f17815a, new C0103c(gVarArr, fVar));
        if (fVar.f17434k == j7) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // e4.g
    @n6.d
    public g t(@n6.d g gVar) {
        return g.a.a(this, gVar);
    }

    @n6.d
    public String toString() {
        return '[' + ((String) k("", b.f8762l)) + ']';
    }
}