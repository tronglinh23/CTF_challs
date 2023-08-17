package f5;

import java.util.Iterator;
import u4.l0;
import u4.r1;
import v3.g1;
import v3.m2;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9845a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f9846b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9847c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9848d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f9849e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9850f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.p f9851a;

        public a(t4.p pVar) {
            this.f9851a = pVar;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            return q.a(this.f9851a);
        }
    }

    @g1(version = "1.3")
    @n6.d
    public static final <T> Iterator<T> a(@v3.b @n6.d t4.p<? super o<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        l0.p(pVar, "block");
        n nVar = new n();
        nVar.p(g4.c.c(pVar, nVar, nVar));
        return nVar;
    }

    @g1(version = "1.3")
    @n6.d
    public static final <T> m<T> b(@v3.b @n6.d t4.p<? super o<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        l0.p(pVar, "block");
        return new a(pVar);
    }
}
