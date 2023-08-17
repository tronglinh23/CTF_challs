package x3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class x extends w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterable<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.a<Iterator<T>> f18395k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.a<? extends Iterator<? extends T>> aVar) {
            this.f18395k = aVar;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<T> iterator() {
            return this.f18395k.n();
        }
    }

    @k4.f
    public static final <T> Iterable<T> X(t4.a<? extends Iterator<? extends T>> aVar) {
        u4.l0.p(aVar, "iterator");
        return new a(aVar);
    }

    @v3.a1
    public static final <T> int Y(@n6.d Iterable<? extends T> iterable, int i7) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }

    @n6.e
    @v3.a1
    public static final <T> Integer Z(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @n6.d
    public static final <T> List<T> a0(@n6.d Iterable<? extends Iterable<? extends T>> iterable) {
        u4.l0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            b0.o0(arrayList, it.next());
        }
        return arrayList;
    }

    @n6.d
    public static final <T, R> v3.u0<List<T>, List<R>> b0(@n6.d Iterable<? extends v3.u0<? extends T, ? extends R>> iterable) {
        u4.l0.p(iterable, "<this>");
        int Y = Y(iterable, 10);
        ArrayList arrayList = new ArrayList(Y);
        ArrayList arrayList2 = new ArrayList(Y);
        for (v3.u0<? extends T, ? extends R> u0Var : iterable) {
            arrayList.add(u0Var.e());
            arrayList2.add(u0Var.f());
        }
        return v3.q1.a(arrayList, arrayList2);
    }
}
