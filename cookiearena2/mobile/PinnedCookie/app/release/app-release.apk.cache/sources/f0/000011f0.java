package i4;

import u4.l0;
import u4.n0;
import v3.a1;
import v3.g1;
import v3.r;

/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX WARN: Incorrect field signature: [TE; */
    /* loaded from: classes.dex */
    public static final class a<E> extends n0 implements t4.a<E[]> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Enum[] f11012l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: ([TE;)V */
        public a(Enum[] enumArr) {
            super(0);
            this.f11012l = enumArr;
        }

        /* JADX WARN: Incorrect return type in method signature: ()[TE; */
        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Enum[] n() {
            return this.f11012l;
        }
    }

    @g1(version = "1.8")
    @r
    @n6.d
    @a1
    public static final <E extends Enum<E>> i4.a<E> a(@n6.d t4.a<E[]> aVar) {
        l0.p(aVar, "entriesProvider");
        return new c(aVar);
    }

    @g1(version = "1.8")
    @r
    @n6.d
    @a1
    public static final <E extends Enum<E>> i4.a<E> b(@n6.d E[] eArr) {
        l0.p(eArr, "entries");
        c cVar = new c(new a(eArr));
        cVar.size();
        return cVar;
    }
}