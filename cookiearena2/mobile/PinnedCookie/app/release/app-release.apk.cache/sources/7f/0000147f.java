package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import v3.m2;

/* loaded from: classes.dex */
public final /* synthetic */ class o {

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T, C extends Collection<? super T>> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12354n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f12355o;

        /* renamed from: p  reason: collision with root package name */
        public int f12356p;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12355o = obj;
            this.f12356p |= Integer.MIN_VALUE;
            return k.V1(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    /* loaded from: classes.dex */
    public static final class b<T> implements j {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Collection f12357k;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.f12357k = collection;
        }

        @Override // kotlinx.coroutines.flow.j
        @n6.e
        public final Object f(T t6, @n6.d e4.d<? super m2> dVar) {
            this.f12357k.add(t6);
            return m2.f17815a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@n6.d kotlinx.coroutines.flow.i<? extends T> r4, @n6.d C r5, @n6.d e4.d<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.f12356p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12356p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12355o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12356p
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f12354n
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            v3.e1.n(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            v3.e1.n(r6)
            kotlinx.coroutines.flow.o$b r6 = new kotlinx.coroutines.flow.o$b
            r6.<init>(r5)
            r0.f12354n = r5
            r0.f12356p = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.a(kotlinx.coroutines.flow.i, java.util.Collection, e4.d):java.lang.Object");
    }

    @n6.e
    public static final <T> Object b(@n6.d i<? extends T> iVar, @n6.d List<T> list, @n6.d e4.d<? super List<? extends T>> dVar) {
        return k.V1(iVar, list, dVar);
    }

    public static /* synthetic */ Object c(i iVar, List list, e4.d dVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = new ArrayList();
        }
        return k.W1(iVar, list, dVar);
    }

    @n6.e
    public static final <T> Object d(@n6.d i<? extends T> iVar, @n6.d Set<T> set, @n6.d e4.d<? super Set<? extends T>> dVar) {
        return k.V1(iVar, set, dVar);
    }

    public static /* synthetic */ Object e(i iVar, Set set, e4.d dVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return k.Y1(iVar, set, dVar);
    }
}